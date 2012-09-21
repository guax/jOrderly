grammar Orderly;

options { 
    language = Java;
}

@header {
package net.guax.jorderly.parser;
import net.guax.jorderly.json.*;
}

@lexer::header {
package net.guax.jorderly.parser;
}

orderly_schema
    :	unnamed_entry ';'? EOF {System.out.println($unnamed_entry.property);}
    ;
    
unnamed_entry returns [JsonProperty property]
    :	definition_prefix { $property = $definition_prefix.property; } definition_suffix
    |	'string' range? perl_regex? definition_suffix
    ;

definition_suffix
    :	enum_values? default_value? requires? optional_marker?
	;

definition_prefix returns [JsonProperty property]
	@init {$property = null;}
    :	'integer' { $property = new JsonInteger(); } range?
    |	'number' { $property = new JsonNumber(); } range?
    |	'boolean' { $property = new JsonBoolean(); }
    |	'null' { $property = new JsonNull(); }
    |	'any' { $property = new JsonAny(); }
    // a tuple-typed array 
    |	'array' { $property = new JsonArray(); }  '{' unnamed_entries? '}' additional_marker? range?
    // a simple-typed array (notice the '*' marker is disallowed)
    |	'array' { $property = new JsonArray(); } '[' unnamed_entry ']' range?
    |	'object' { $property = new JsonObject(); } '{' named_entries? '}' additional_marker?
    |	'union'  { $property = new JsonUnion(); } '{' unnamed_entry ';' unnamed_entries '}' // At least two entries are required
    ;

named_entry
    :	definition_prefix property_name definition_suffix
    |	'string' range? property_name perl_regex? definition_suffix
    ;

named_entries
    :	named_entry (';' named_entry)* ';'?
    ;

unnamed_entries
    :	unnamed_entry (';' unnamed_entry)* ';'?
    ;

csv_property_names
    :	property_name (',' property_name)*
	;

requires
    :	'<' csv_property_names '>'
	;

optional_marker
    :	'?'
    ;

additional_marker
    :	'*'
    ;

enum_values
    :	jsonArray
    ;

default_value
    :	'=' jsonValue
	;

range
    :	'{' NUMBER ',' NUMBER '}'
    |	'{' NUMBER ',' '}'
    |	'{' ',' NUMBER '}'
	;

property_name
	:	IDENTIFIER { System.out.println("Property Name: " + $IDENTIFIER.text); }
	|	STRING { System.out.println("Property Name: " + $STRING.text); }
	;

perl_regex
	:	REGEX
	;
    
/************************
      JSON GRAMMAR
*************************/

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


jsonValue
    : NULL
    | jsonBooleanLiteral
    | STRING
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
