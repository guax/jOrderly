grammar json;

options { 
    language = Java;
}
	
fragment INT : ('-' | '+') ? ('0'..'9' | '1'..'9' '0'..'9'+ ) ;

fragment EXP : ( 'e' | 'E' ) ('+'|'-') ? '0'..'9'+ ;

fragment FRAC
   : '.' '0'..'9'+
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
    : '0'..'9' | 'A'..'F' | 'a'..'f'
    ;
 
fragment Digit
    : '0'..'9'
    ;

String  :
    '"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
    ;

WS: (' '|'\n'|'\r'|'\t')+ { $channel = HIDDEN; } ; // ignore whitespace

jsonDocument 
	:	jsonValue EOF
	;

jsonValue
    : NULL
    | jsonBooleanLiteral
    | String
    | NUMBER
    | jsonObject
    | jsonArray
    ;

jsonBooleanLiteral
    : TRUE
    | FALSE
    ;
    
jsonObject
    : '{' '}'
    | '{' jsonMemberList '}'
    ;

jsonMember
    : String ':' jsonValue
    ;

jsonMemberList
    : jsonMember (',' jsonMemberList)?
    ;

jsonArray
    : '[' ']'
    | '[' jsonElementList ']'
    ;

jsonElementList
    : jsonValue (',' jsonElementList)?
    ;
