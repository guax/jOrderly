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
        if (this.expectedProperty instanceof JsonArray && JsonArray.class.cast(this.expectedProperty).inside) {
            JsonProperty resolvedObject = JsonArray.class.cast(this.expectedProperty).getProperty(type);
            resolvedObject.setInput(this.input);
            return resolvedObject;
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
    @init {
        boolean isAny = this.expectedProperty instanceof JsonAny;
        JsonObject jo = null;
        
        if(!isAny) {
            jo = JsonObject.class.cast(this.expectedProperty);
            jo.startKeyMark();
        }
    }
    : '{' '}' {(!isAny && jo.finishKeyMark()) || isAny}?
    | '{' jsonMember (',' jsonMember)* '}' {(!isAny && jo.finishKeyMark()) || isAny}?
    ;

jsonValue
	@init {
        JsonProperty expected = this.expectedProperty;
        expected.setInput(this.input);

        boolean isAny = this.expectedProperty instanceof JsonAny;
    }
	@after { this.expectedProperty = expected; }
    // Null
    : { this.expectedProperty.allow(JsonNull.class) }? NULL
    // Boolean
    | { this.expectedProperty.allow(JsonBoolean.class) }? {this.expectedProperty = resolvArrayContext(JsonBoolean.class.getName());} jsonBooleanLiteral
    // String
    | { this.expectedProperty.allow(JsonString.class) }? {this.expectedProperty = resolvArrayContext(JsonString.class.getName()); isAny = this.expectedProperty instanceof JsonAny;} string=STRING { isAny || JsonString.class.cast(this.expectedProperty).isValid($string.getText()) }? {if(!isAny) {JsonString.class.cast(this.expectedProperty).setValue($string.getText());}}
    // Number
    | { this.expectedProperty.allow(JsonNumber.class) }? {this.expectedProperty = resolvArrayContext(JsonNumber.class.getName()); isAny = this.expectedProperty instanceof JsonAny;} number=NUMBER { isAny || JsonNumber.class.cast(this.expectedProperty).isValidNumber($number.getText()) }? {if(!isAny) {JsonNumber.class.cast(this.expectedProperty).setValue($number.getText());}}
    // Object
    | { this.expectedProperty.allow(JsonObject.class) }?
      {this.expectedProperty = resolvArrayContext(JsonObject.class.getName()); isAny = this.expectedProperty instanceof JsonAny;}
      jsonObject
    // Array
    | { this.expectedProperty.allow(JsonArray.class) }?
      {this.expectedProperty = resolvArrayContext(JsonArray.class.getName()); isAny = this.expectedProperty instanceof JsonAny;}
      { if(!isAny) {JsonArray.class.cast(this.expectedProperty).setInside(true);} }
      jsonArray
      { if(!isAny) {JsonArray.class.cast(this.expectedProperty).setInside(false); }}
    ;
    
jsonMember
    @init {
        JsonProperty expected = this.expectedProperty;
        boolean isAny = this.expectedProperty instanceof JsonAny;
    }
    @after { this.expectedProperty = expected; }
    : property=STRING {
        if(!isAny) {
            String key = JsonString.trimQuotes($property.getText());
            JsonObject jo = JsonObject.class.cast(expected);
            jo.markKey(key);
            this.expectedProperty = jo.getProperty(key);
        }
    } ':' jsonValue
    ;

jsonArray
    @init {
        int length = 0;
    }
    : '[' {JsonArray.class.cast(this.expectedProperty).inRange(0)}? ']'
    | '[' jsonValue {length++;} (',' jsonValue {length++;})* {JsonArray.class.cast(this.expectedProperty).inRange(length)}? ']'
    ;
