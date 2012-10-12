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
	@init { JsonProperty expected = this.expectedProperty; }
	@after { this.expectedProperty = expected; }
    : { expected.allow(JsonNull.class) }? NULL
    | { expected.allow(JsonBoolean.class) }? jsonBooleanLiteral
    | { expected.allow(JsonString.class) }? STRING
    | { expected.allow(JsonNumber.class) }? NUMBER
    | { expected.allow(JsonObject.class) }? jsonObject
    | { expected.allow(JsonArray.class) }? jsonArray
    ;
    
jsonMember
    : STRING ':' jsonValue
    ;

jsonMemberList
    : jsonMember (',' jsonMemberList)?
    ;

jsonArray
    : '[' ']'
    | '[' jsonElementList ']'
    ;

jsonElementList
    : jsonValue (',' jsonValue)*
    ;
