grammar Orderly;

options { 
    language = Java;
}

@header {
package net.guax.jorderly.parser;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import java.util.HashMap;
import net.guax.jorderly.json.*;
import java.math.BigDecimal;
import java.io.File;
}


@lexer::header {
package net.guax.jorderly.parser;
}

@members {
    // The following variables are temporary and should not be trusted for long.
    JsonProperty currentProperty;
    String currentRequire;

    HashMap<String, JsonProperty> imports;
        
    String filePath = "";
    
    public void setFilePath(String path) {
        this.filePath = path;
    }

    public void addImport(String id, String file) throws FailedPredicateException {
        if(this.imports == null) {
            this.imports = new HashMap<String, JsonProperty>();
        }
        
        CharStream stream;
        String path = new File(this.filePath + "/" + JsonString.trimQuotes(file)).getAbsolutePath();
        try {
            stream = new ANTLRFileStream(path);
        
            OrderlyLexer lexer = new OrderlyLexer(stream);
            TokenStream tokenStream = new CommonTokenStream(lexer);
            OrderlyParser parser = new OrderlyParser(tokenStream);
            
            
            parser.setFilePath(path.substring(0, path.lastIndexOf('/')));

            JsonProperty parseTree = parser.orderly_schema();
            
            if(parser.getNumberOfSyntaxErrors() > 0) {
                throw new Exception();
            }
            
            this.imports.put(id, parseTree);
            
        } catch (Exception ex) {
            throw new FailedPredicateException(this.input, "object", "Error parsing import: " + path);
        }
    }
}

orderly_schema returns [JsonProperty rootProperty]
    :	imports? unnamed_entry ';'? { $rootProperty = $unnamed_entry.property;}
    ;

import_statement
    : 'import' file=STRING 'as' id=IDENTIFIER ';' {this.addImport($id.text, $file.text);}
    ;

imports
    :   import_statement (import_statement)*
    ;
    
unnamed_entry returns [JsonProperty property]
    :	definition_prefix { $property = $definition_prefix.property; } definition_suffix
    |	'string' { $property = new JsonString(); this.currentProperty = $property; } range? {JsonString.class.cast($property).setRange($range.range);} regex=perl_regex? {JsonString.class.cast($property).setRegExp($regex.regex);} definition_suffix
    ;

definition_suffix
    :	optional_marker? enum_values? default_value?
	;

definition_prefix returns [JsonProperty property]
    // Defining last property so we can defnition_suffix the s*** out of it
    @after { this.currentProperty = $property; }
    :	'integer' { $property = new JsonInteger(); } range? {JsonInteger.class.cast($property).setRange($range.range);}
    |	'number' { $property = new JsonNumber(); } range? {JsonNumber.class.cast($property).setRange($range.range);}
    |	'boolean' { $property = new JsonBoolean(); }
    |	'null' { $property = new JsonNull(); }
    |	'any' { $property = new JsonAny(); }
    // a tuple-typed array 
    |	'array' { $property = new JsonArray(); }  '{' unnamed_entries? {JsonArray.class.cast($property).setProperties($unnamed_entries.properties);} '}' range? {JsonArray.class.cast($property).setRange($range.range);}
    // a simple-typed array (notice the '*' marker is disallowed)
    |	'array' { $property = new JsonArray(); } '[' ({ HashMap propertyMap = new HashMap<String, JsonProperty>(); } un=unnamed_entry {propertyMap.put($un.property.getClass().getName(),$un.property); JsonArray.class.cast($property).setProperties(propertyMap); })? ']' range? {JsonArray.class.cast($property).setRange($range.range);}
    |	'object' { $property = new JsonObject(); } '{' named_entries? { JsonObject.class.cast($property).setProperties($named_entries.properties); } '}' (additional_marker { JsonObject.class.cast($property).setAllowAdditionalProperties(true); })?
    |	'union'  { $property = new JsonUnion(); } '{' unnamed_entry ';' unnamed_entries '}' // At least two entries are required
    |   id=IDENTIFIER {$property = this.imports.get($id.text);}
    ;

named_entry returns [JsonProperty property]
    :	definition_prefix { $property = $definition_prefix.property; } property_name { $property.setName(JsonString.trimQuotes($property_name.text)); } definition_suffix requires?
    |	'string' { $property = new JsonString(); this.currentProperty = $property; } range? {JsonString.class.cast($property).setRange($range.range);} property_name {$property.setName(JsonString.trimQuotes($property_name.text));} regex=perl_regex? {JsonString.class.cast($property).setRegExp($regex.regex);} definition_suffix requires?
    ;

named_entries returns [HashMap<String, JsonProperty> properties]
	@init { $properties = new HashMap<String, JsonProperty>(); }
    :	n1=named_entry {$properties.put($n1.property.getName(),$n1.property);} (';' n2=named_entry{$properties.put($n2.property.getName(),$n2.property);})* ';'?
    ;

unnamed_entries returns [HashMap<String, JsonProperty> properties]
	@init { $properties = new HashMap<String, JsonProperty>(); }
    :	un1=unnamed_entry {$properties.put($un1.property.getClass().getName(),$un1.property);} (';' un2=unnamed_entry {$properties.put($un2.property.getClass().getName(), $un2.property);} )* ';'?
    ;

require_conditional
    @init {
        ArrayList requires = new ArrayList<JsonProperty>();
        // optionality is redundant with requires
        this.currentProperty.setOptional(false);
    }
    : '=' ( number=NUMBER {requires.add(new JsonNumber($number.getText()));} | string=STRING {requires.add(new JsonString($string.getText()));} ) { this.currentProperty.addRequires(this.currentRequire, requires); }
    | 'in' '[' ( number=NUMBER {requires.add(new JsonNumber($number.getText()));} | string=STRING {requires.add(new JsonString($string.getText()));} ) (',' ( number=NUMBER {requires.add(new JsonNumber($number.getText()));} | string=STRING {requires.add(new JsonString($string.getText()));} ))* ']' { this.currentProperty.addRequires(this.currentRequire, requires); }
    | {this.currentProperty.addRequires(this.currentRequire);}
    ;

require_property
    : property_name {this.currentRequire = JsonString.trimQuotes($property_name.text);} require_conditional
    ;

requires
    :	'<' require_property (',' require_property)* '>'
	;

optional_marker
    :	'?' {this.currentProperty.setOptional(true);}
    ;

additional_marker
    :	'*'
    ;

enum_values
    :	jsonArray
    ;

default_value
    :	'=' jsonValue {this.currentProperty.setOptional(true);}
	;

range returns [Range range]
    @init {$range = new Range(); BigDecimal lowerBound; BigDecimal upperBound;}
    :	'{' lower=NUMBER ',' upper=NUMBER '}' {$range.lowerBound = new BigDecimal($lower.getText()); $range.upperBound = new BigDecimal($upper.getText());}
    |	'{' lower=NUMBER ',' '}' {$range.lowerBound = new BigDecimal($lower.getText());}
    |	'{' ',' upper=NUMBER '}' {$range.upperBound = new BigDecimal($upper.getText());}
	;

property_name
	:	IDENTIFIER
	|	STRING
	;

perl_regex returns [RegularExpression regex]
	:	exp=REGEX {regex = new RegularExpression(exp.getText());}
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
    | '[' jsonValue (',' jsonValue)* ']'
    ;
