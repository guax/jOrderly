grammar JSON;

options { 
    language = Java;
}

@header {
package net.guax.jorderly.parser;

import java.util.HashMap;
import net.guax.jorderly.json.*;
}

@lexer::header {
package net.guax.jorderly.parser;
}

@members {
    JsonProperty expectedProperty;

    JsonProperty validationTree;

    public void setValidationTree(JsonProperty validationTree) {
    	this.validationTree = this.expectedProperty = validationTree;
    }

    public JsonProperty resolvArrayContext(String type) {
        if (this.expectedProperty instanceof JsonArray && JsonArray.class.cast(this.expectedProperty).inArray) {
            return JsonArray.class.cast(this.expectedProperty).getProperty(type);
        }

        return this.expectedProperty;
    }
}

// Starting Symbol
jsonDocument 
	: {this.validationTree != null}? jsonValue
	;

fragment INT : ('-' | '+') ? (DIGIT | '1'..'9' DIGIT+ ) ;

fragment EXP : ( 'e' | 'E' ) ('+'|'-') ? DIGIT+ ;

fragment FRAC
   : '.' DIGIT+
   ;
 
NUMBER
    : INT FRAC? EXP?
    ;

NULL
    : 'null'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

fragment EscapeSequence
        :   '\\' (UnicodeEscape |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
        ;
 
fragment UnicodeEscape
    : 'u' HexDigit HexDigit HexDigit HexDigit
    ;
 
fragment HexDigit
    : DIGIT | 'A'..'F' | 'a'..'f'
    ;
 
fragment DIGIT
    : '0'..'9'
    ;

REGEX 
	:	'/' ( '\\' . | ~('\u0000'..'\u001f' | '\\' | '/' ) )* '/'
	;

STRING  :
    '"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
    ;

IDENTIFIER
    :	('a'..'z' | 'A'..'Z' | DIGIT )('a'..'z' | 'A'..'Z' | '_' | '-' | DIGIT )*
	;

WS: (' '|'\n'|'\r'|'\t')+ { $channel = HIDDEN; } ; // ignore whitespace

COMMENT : ('//' | '#' ) .* ('\n'|'\r') { $channel = HIDDEN; };



jsonBooleanLiteral
    : TRUE
    | FALSE
    ;

jsonObject
    : '{' '}'
    | '{' jsonMemberList '}'
    ;
jsonValue
	@init { JsonProperty expected = this.expectedProperty; expected.setInput(this.input); }
	@after { this.expectedProperty = expected; }
    : { this.expectedProperty.allow(JsonNull.class) }? NULL
    | { this.expectedProperty.allow(JsonBoolean.class) }? {this.expectedProperty = resolvArrayContext(JsonBoolean.class.getName());} jsonBooleanLiteral
    | { this.expectedProperty.allow(JsonString.class) }? {this.expectedProperty = resolvArrayContext(JsonString.class.getName());} string=STRING { JsonString.class.cast(this.expectedProperty).isValid($string.getText()) }?
    | { this.expectedProperty.allow(JsonNumber.class) }? {this.expectedProperty = resolvArrayContext(JsonNumber.class.getName());} number=NUMBER { JsonNumber.class.cast(this.expectedProperty).isValidNumber($number.getText()) }?
    | { this.expectedProperty.allow(JsonObject.class) }? {this.expectedProperty = resolvArrayContext(JsonObject.class.getName());} jsonObject
    | { this.expectedProperty.allow(JsonArray.class) }? {this.expectedProperty = resolvArrayContext(JsonArray.class.getName());} { JsonArray.class.cast(this.expectedProperty).setInArray(true); } jsonArray { JsonArray.class.cast(this.expectedProperty).setInArray(false); }
    ;
    
jsonMember
    : STRING ':' jsonValue
    ;

jsonMemberList
    : jsonMember (',' jsonMemberList)?
    ;

jsonArray
    : '[' {JsonArray.class.cast(this.expectedProperty).inRange(0)}? ']'
    | '[' jsonElementList ']'
    ;

jsonElementList
    @init {int length = 0;}
    : jsonValue {length++;} (',' jsonValue {length++;})* {JsonArray.class.cast(this.expectedProperty).inRange(length)}?
    ;
