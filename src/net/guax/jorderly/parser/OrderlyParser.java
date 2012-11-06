// $ANTLR 3.4 Orderly.g 2012-11-05 23:48:45

package net.guax.jorderly.parser;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import java.util.HashMap;
import net.guax.jorderly.json.*;
import java.math.BigDecimal;
import java.io.File;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OrderlyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIGIT", "EXP", "EscapeSequence", "FALSE", "FRAC", "HexDigit", "IDENTIFIER", "INT", "NULL", "NUMBER", "REGEX", "STRING", "TRUE", "UnicodeEscape", "WS", "'*'", "','", "':'", "';'", "'<'", "'='", "'>'", "'?'", "'['", "']'", "'any'", "'array'", "'as'", "'boolean'", "'import'", "'in'", "'integer'", "'number'", "'object'", "'string'", "'union'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int COMMENT=4;
    public static final int DIGIT=5;
    public static final int EXP=6;
    public static final int EscapeSequence=7;
    public static final int FALSE=8;
    public static final int FRAC=9;
    public static final int HexDigit=10;
    public static final int IDENTIFIER=11;
    public static final int INT=12;
    public static final int NULL=13;
    public static final int NUMBER=14;
    public static final int REGEX=15;
    public static final int STRING=16;
    public static final int TRUE=17;
    public static final int UnicodeEscape=18;
    public static final int WS=19;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public OrderlyParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public OrderlyParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return OrderlyParser.tokenNames; }
    public String getGrammarFileName() { return "Orderly.g"; }


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



    // $ANTLR start "orderly_schema"
    // Orderly.g:66:1: orderly_schema returns [JsonProperty rootProperty] : ( imports )? unnamed_entry ( ';' )? ;
    public final JsonProperty orderly_schema() throws RecognitionException {
        JsonProperty rootProperty = null;


        JsonProperty unnamed_entry1 =null;


        try {
            // Orderly.g:67:5: ( ( imports )? unnamed_entry ( ';' )? )
            // Orderly.g:67:7: ( imports )? unnamed_entry ( ';' )?
            {
            // Orderly.g:67:7: ( imports )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Orderly.g:67:7: imports
                    {
                    pushFollow(FOLLOW_imports_in_orderly_schema57);
                    imports();

                    state._fsp--;


                    }
                    break;

            }


            pushFollow(FOLLOW_unnamed_entry_in_orderly_schema60);
            unnamed_entry1=unnamed_entry();

            state._fsp--;


            // Orderly.g:67:30: ( ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==23) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Orderly.g:67:30: ';'
                    {
                    match(input,23,FOLLOW_23_in_orderly_schema62); 

                    }
                    break;

            }


             rootProperty = unnamed_entry1;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return rootProperty;
    }
    // $ANTLR end "orderly_schema"



    // $ANTLR start "import_statement"
    // Orderly.g:70:1: import_statement : 'import' file= STRING 'as' id= IDENTIFIER ';' ;
    public final void import_statement() throws RecognitionException {
        Token file=null;
        Token id=null;

        try {
            // Orderly.g:71:5: ( 'import' file= STRING 'as' id= IDENTIFIER ';' )
            // Orderly.g:71:7: 'import' file= STRING 'as' id= IDENTIFIER ';'
            {
            match(input,34,FOLLOW_34_in_import_statement82); 

            file=(Token)match(input,STRING,FOLLOW_STRING_in_import_statement86); 

            match(input,32,FOLLOW_32_in_import_statement88); 

            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_import_statement92); 

            match(input,23,FOLLOW_23_in_import_statement94); 

            this.addImport((id!=null?id.getText():null), (file!=null?file.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "import_statement"



    // $ANTLR start "imports"
    // Orderly.g:74:1: imports : import_statement ( import_statement )* ;
    public final void imports() throws RecognitionException {
        try {
            // Orderly.g:75:5: ( import_statement ( import_statement )* )
            // Orderly.g:75:9: import_statement ( import_statement )*
            {
            pushFollow(FOLLOW_import_statement_in_imports115);
            import_statement();

            state._fsp--;


            // Orderly.g:75:26: ( import_statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Orderly.g:75:27: import_statement
            	    {
            	    pushFollow(FOLLOW_import_statement_in_imports118);
            	    import_statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "imports"



    // $ANTLR start "unnamed_entry"
    // Orderly.g:78:1: unnamed_entry returns [JsonProperty property] : ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix );
    public final JsonProperty unnamed_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix2 =null;

        Range range3 =null;


        try {
            // Orderly.g:79:5: ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER||LA6_0==NULL||(LA6_0 >= 30 && LA6_0 <= 31)||LA6_0==33||(LA6_0 >= 36 && LA6_0 <= 38)||LA6_0==40) ) {
                alt6=1;
            }
            else if ( (LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Orderly.g:79:7: definition_prefix definition_suffix
                    {
                    pushFollow(FOLLOW_definition_prefix_in_unnamed_entry145);
                    definition_prefix2=definition_prefix();

                    state._fsp--;


                     property = definition_prefix2; 

                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry149);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Orderly.g:80:7: 'string' ( range )? (regex= perl_regex )? definition_suffix
                    {
                    match(input,39,FOLLOW_39_in_unnamed_entry157); 

                     property = new JsonString(); this.currentProperty = property; 

                    // Orderly.g:80:84: ( range )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==41) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Orderly.g:80:84: range
                            {
                            pushFollow(FOLLOW_range_in_unnamed_entry161);
                            range3=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRange(range3);

                    // Orderly.g:80:155: (regex= perl_regex )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==REGEX) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Orderly.g:80:155: regex= perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_unnamed_entry168);
                            regex=perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRegExp(regex);

                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry173);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return property;
    }
    // $ANTLR end "unnamed_entry"



    // $ANTLR start "definition_suffix"
    // Orderly.g:83:1: definition_suffix : ( optional_marker )? ( enum_values )? ( default_value )? ;
    public final void definition_suffix() throws RecognitionException {
        try {
            // Orderly.g:84:5: ( ( optional_marker )? ( enum_values )? ( default_value )? )
            // Orderly.g:84:7: ( optional_marker )? ( enum_values )? ( default_value )?
            {
            // Orderly.g:84:7: ( optional_marker )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Orderly.g:84:7: optional_marker
                    {
                    pushFollow(FOLLOW_optional_marker_in_definition_suffix190);
                    optional_marker();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:84:24: ( enum_values )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Orderly.g:84:24: enum_values
                    {
                    pushFollow(FOLLOW_enum_values_in_definition_suffix193);
                    enum_values();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:84:37: ( default_value )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Orderly.g:84:37: default_value
                    {
                    pushFollow(FOLLOW_default_value_in_definition_suffix196);
                    default_value();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "definition_suffix"



    // $ANTLR start "definition_prefix"
    // Orderly.g:87:1: definition_prefix returns [JsonProperty property] : ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' |id= IDENTIFIER );
    public final JsonProperty definition_prefix() throws RecognitionException {
        JsonProperty property = null;


        Token id=null;
        JsonProperty un =null;

        Range range4 =null;

        Range range5 =null;

        HashMap<String, JsonProperty> unnamed_entries6 =null;

        Range range7 =null;

        Range range8 =null;

        HashMap<String, JsonProperty> named_entries9 =null;


        try {
            // Orderly.g:90:5: ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' |id= IDENTIFIER )
            int alt18=10;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt18=1;
                }
                break;
            case 37:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case NULL:
                {
                alt18=4;
                }
                break;
            case 30:
                {
                alt18=5;
                }
                break;
            case 31:
                {
                int LA18_6 = input.LA(2);

                if ( (LA18_6==41) ) {
                    alt18=6;
                }
                else if ( (LA18_6==28) ) {
                    alt18=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 6, input);

                    throw nvae;

                }
                }
                break;
            case 38:
                {
                alt18=8;
                }
                break;
            case 40:
                {
                alt18=9;
                }
                break;
            case IDENTIFIER:
                {
                alt18=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // Orderly.g:90:7: 'integer' ( range )?
                    {
                    match(input,36,FOLLOW_36_in_definition_prefix229); 

                     property = new JsonInteger(); 

                    // Orderly.g:90:52: ( range )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==41) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Orderly.g:90:52: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix233);
                            range4=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonInteger.class.cast(property).setRange(range4);

                    }
                    break;
                case 2 :
                    // Orderly.g:91:7: 'number' ( range )?
                    {
                    match(input,37,FOLLOW_37_in_definition_prefix244); 

                     property = new JsonNumber(); 

                    // Orderly.g:91:50: ( range )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==41) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Orderly.g:91:50: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix248);
                            range5=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonNumber.class.cast(property).setRange(range5);

                    }
                    break;
                case 3 :
                    // Orderly.g:92:7: 'boolean'
                    {
                    match(input,33,FOLLOW_33_in_definition_prefix259); 

                     property = new JsonBoolean(); 

                    }
                    break;
                case 4 :
                    // Orderly.g:93:7: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_definition_prefix269); 

                     property = new JsonNull(); 

                    }
                    break;
                case 5 :
                    // Orderly.g:94:7: 'any'
                    {
                    match(input,30,FOLLOW_30_in_definition_prefix279); 

                     property = new JsonAny(); 

                    }
                    break;
                case 6 :
                    // Orderly.g:96:7: 'array' '{' ( unnamed_entries )? '}' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix294); 

                     property = new JsonArray(); 

                    match(input,41,FOLLOW_41_in_definition_prefix299); 

                    // Orderly.g:96:53: ( unnamed_entries )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==IDENTIFIER||LA12_0==NULL||(LA12_0 >= 30 && LA12_0 <= 31)||LA12_0==33||(LA12_0 >= 36 && LA12_0 <= 40)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Orderly.g:96:53: unnamed_entries
                            {
                            pushFollow(FOLLOW_unnamed_entries_in_definition_prefix301);
                            unnamed_entries6=unnamed_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setProperties(unnamed_entries6);

                    match(input,42,FOLLOW_42_in_definition_prefix306); 

                    // Orderly.g:96:152: ( range )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==41) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Orderly.g:96:152: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix308);
                            range7=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setRange(range7);

                    }
                    break;
                case 7 :
                    // Orderly.g:98:7: 'array' '[' (un= unnamed_entry )? ']' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix324); 

                     property = new JsonArray(); 

                    match(input,28,FOLLOW_28_in_definition_prefix328); 

                    // Orderly.g:98:52: (un= unnamed_entry )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==IDENTIFIER||LA14_0==NULL||(LA14_0 >= 30 && LA14_0 <= 31)||LA14_0==33||(LA14_0 >= 36 && LA14_0 <= 40)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Orderly.g:98:53: un= unnamed_entry
                            {
                             HashMap propertyMap = new HashMap<String, JsonProperty>(); 

                            pushFollow(FOLLOW_unnamed_entry_in_definition_prefix335);
                            un=unnamed_entry();

                            state._fsp--;


                            propertyMap.put(un.getClass().getName(),un); JsonArray.class.cast(property).setProperties(propertyMap); 

                            }
                            break;

                    }


                    match(input,29,FOLLOW_29_in_definition_prefix341); 

                    // Orderly.g:98:267: ( range )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==41) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Orderly.g:98:267: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix343);
                            range8=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setRange(range8);

                    }
                    break;
                case 8 :
                    // Orderly.g:99:7: 'object' '{' ( named_entries )? '}' ( additional_marker )?
                    {
                    match(input,38,FOLLOW_38_in_definition_prefix354); 

                     property = new JsonObject(); 

                    match(input,41,FOLLOW_41_in_definition_prefix358); 

                    // Orderly.g:99:54: ( named_entries )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==IDENTIFIER||LA16_0==NULL||(LA16_0 >= 30 && LA16_0 <= 31)||LA16_0==33||(LA16_0 >= 36 && LA16_0 <= 40)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Orderly.g:99:54: named_entries
                            {
                            pushFollow(FOLLOW_named_entries_in_definition_prefix360);
                            named_entries9=named_entries();

                            state._fsp--;


                            }
                            break;

                    }


                     JsonObject.class.cast(property).setProperties(named_entries9); 

                    match(input,42,FOLLOW_42_in_definition_prefix365); 

                    // Orderly.g:99:152: ( additional_marker )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Orderly.g:99:153: additional_marker
                            {
                            pushFollow(FOLLOW_additional_marker_in_definition_prefix368);
                            additional_marker();

                            state._fsp--;


                             JsonObject.class.cast(property).setAllowAdditionalProperties(true); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // Orderly.g:100:7: 'union' '{' unnamed_entry ';' unnamed_entries '}'
                    {
                    match(input,40,FOLLOW_40_in_definition_prefix380); 

                     property = new JsonUnion(); 

                    match(input,41,FOLLOW_41_in_definition_prefix385); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix387);
                    unnamed_entry();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_definition_prefix389); 

                    pushFollow(FOLLOW_unnamed_entries_in_definition_prefix391);
                    unnamed_entries();

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_definition_prefix393); 

                    }
                    break;
                case 10 :
                    // Orderly.g:101:9: id= IDENTIFIER
                    {
                    id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_definition_prefix406); 

                    property = this.imports.get((id!=null?id.getText():null));

                    }
                    break;

            }
             this.currentProperty = property; 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return property;
    }
    // $ANTLR end "definition_prefix"



    // $ANTLR start "named_entry"
    // Orderly.g:104:1: named_entry returns [JsonProperty property] : ( definition_prefix property_name definition_suffix ( requires )? | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )? );
    public final JsonProperty named_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix10 =null;

        OrderlyParser.property_name_return property_name11 =null;

        Range range12 =null;

        OrderlyParser.property_name_return property_name13 =null;


        try {
            // Orderly.g:105:5: ( definition_prefix property_name definition_suffix ( requires )? | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )? )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER||LA23_0==NULL||(LA23_0 >= 30 && LA23_0 <= 31)||LA23_0==33||(LA23_0 >= 36 && LA23_0 <= 38)||LA23_0==40) ) {
                alt23=1;
            }
            else if ( (LA23_0==39) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Orderly.g:105:7: definition_prefix property_name definition_suffix ( requires )?
                    {
                    pushFollow(FOLLOW_definition_prefix_in_named_entry429);
                    definition_prefix10=definition_prefix();

                    state._fsp--;


                     property = definition_prefix10; 

                    pushFollow(FOLLOW_property_name_in_named_entry433);
                    property_name11=property_name();

                    state._fsp--;


                     property.setName(JsonString.trimQuotes((property_name11!=null?input.toString(property_name11.start,property_name11.stop):null))); 

                    pushFollow(FOLLOW_definition_suffix_in_named_entry437);
                    definition_suffix();

                    state._fsp--;


                    // Orderly.g:105:169: ( requires )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==24) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Orderly.g:105:169: requires
                            {
                            pushFollow(FOLLOW_requires_in_named_entry439);
                            requires();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Orderly.g:106:7: 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )?
                    {
                    match(input,39,FOLLOW_39_in_named_entry448); 

                     property = new JsonString(); this.currentProperty = property; 

                    // Orderly.g:106:84: ( range )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==41) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Orderly.g:106:84: range
                            {
                            pushFollow(FOLLOW_range_in_named_entry452);
                            range12=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRange(range12);

                    pushFollow(FOLLOW_property_name_in_named_entry457);
                    property_name13=property_name();

                    state._fsp--;


                    property.setName(JsonString.trimQuotes((property_name13!=null?input.toString(property_name13.start,property_name13.stop):null)));

                    // Orderly.g:106:234: (regex= perl_regex )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==REGEX) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Orderly.g:106:234: regex= perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_named_entry463);
                            regex=perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRegExp(regex);

                    pushFollow(FOLLOW_definition_suffix_in_named_entry468);
                    definition_suffix();

                    state._fsp--;


                    // Orderly.g:106:325: ( requires )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==24) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Orderly.g:106:325: requires
                            {
                            pushFollow(FOLLOW_requires_in_named_entry470);
                            requires();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return property;
    }
    // $ANTLR end "named_entry"



    // $ANTLR start "named_entries"
    // Orderly.g:109:1: named_entries returns [HashMap<String, JsonProperty> properties] : n1= named_entry ( ';' n2= named_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> named_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty n1 =null;

        JsonProperty n2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:111:5: (n1= named_entry ( ';' n2= named_entry )* ( ';' )? )
            // Orderly.g:111:7: n1= named_entry ( ';' n2= named_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_named_entry_in_named_entries500);
            n1=named_entry();

            state._fsp--;


            properties.put(n1.getName(),n1);

            // Orderly.g:111:78: ( ';' n2= named_entry )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==IDENTIFIER||LA24_1==NULL||(LA24_1 >= 30 && LA24_1 <= 31)||LA24_1==33||(LA24_1 >= 36 && LA24_1 <= 40)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // Orderly.g:111:79: ';' n2= named_entry
            	    {
            	    match(input,23,FOLLOW_23_in_named_entries505); 

            	    pushFollow(FOLLOW_named_entry_in_named_entries509);
            	    n2=named_entry();

            	    state._fsp--;


            	    properties.put(n2.getName(),n2);

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // Orderly.g:111:155: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Orderly.g:111:155: ';'
                    {
                    match(input,23,FOLLOW_23_in_named_entries514); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return properties;
    }
    // $ANTLR end "named_entries"



    // $ANTLR start "unnamed_entries"
    // Orderly.g:114:1: unnamed_entries returns [HashMap<String, JsonProperty> properties] : un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> unnamed_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty un1 =null;

        JsonProperty un2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:116:5: (un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? )
            // Orderly.g:116:7: un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries544);
            un1=unnamed_entry();

            state._fsp--;


            properties.put(un1.getClass().getName(),un1);

            // Orderly.g:116:94: ( ';' un2= unnamed_entry )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23) ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1==IDENTIFIER||LA26_1==NULL||(LA26_1 >= 30 && LA26_1 <= 31)||LA26_1==33||(LA26_1 >= 36 && LA26_1 <= 40)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // Orderly.g:116:95: ';' un2= unnamed_entry
            	    {
            	    match(input,23,FOLLOW_23_in_unnamed_entries549); 

            	    pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries553);
            	    un2=unnamed_entry();

            	    state._fsp--;


            	    properties.put(un2.getClass().getName(), un2);

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // Orderly.g:116:190: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Orderly.g:116:190: ';'
                    {
                    match(input,23,FOLLOW_23_in_unnamed_entries560); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return properties;
    }
    // $ANTLR end "unnamed_entries"



    // $ANTLR start "require_conditional"
    // Orderly.g:119:1: require_conditional : ( '=' (number= NUMBER |string= STRING ) | 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']' |);
    public final void require_conditional() throws RecognitionException {
        Token number=null;
        Token string=null;


                ArrayList requires = new ArrayList<JsonProperty>();
                // optionality is redundant with requires
                this.currentProperty.setOptional(false);
            
        try {
            // Orderly.g:125:5: ( '=' (number= NUMBER |string= STRING ) | 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']' |)
            int alt32=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt32=1;
                }
                break;
            case 35:
                {
                alt32=2;
                }
                break;
            case 21:
            case 26:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // Orderly.g:125:7: '=' (number= NUMBER |string= STRING )
                    {
                    match(input,25,FOLLOW_25_in_require_conditional587); 

                    // Orderly.g:125:11: (number= NUMBER |string= STRING )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==NUMBER) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==STRING) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;

                    }
                    switch (alt28) {
                        case 1 :
                            // Orderly.g:125:13: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional593); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:125:80: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional601); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                     this.currentProperty.addRequires(this.currentRequire, requires); 

                    }
                    break;
                case 2 :
                    // Orderly.g:126:7: 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']'
                    {
                    match(input,35,FOLLOW_35_in_require_conditional615); 

                    match(input,28,FOLLOW_28_in_require_conditional617); 

                    // Orderly.g:126:16: (number= NUMBER |string= STRING )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==NUMBER) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==STRING) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;

                    }
                    switch (alt29) {
                        case 1 :
                            // Orderly.g:126:18: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional623); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:126:85: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional631); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                    // Orderly.g:126:152: ( ',' (number= NUMBER |string= STRING ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==21) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // Orderly.g:126:153: ',' (number= NUMBER |string= STRING )
                    	    {
                    	    match(input,21,FOLLOW_21_in_require_conditional638); 

                    	    // Orderly.g:126:157: (number= NUMBER |string= STRING )
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( (LA30_0==NUMBER) ) {
                    	        alt30=1;
                    	    }
                    	    else if ( (LA30_0==STRING) ) {
                    	        alt30=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 30, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // Orderly.g:126:159: number= NUMBER
                    	            {
                    	            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional644); 

                    	            requires.add(new JsonNumber(number.getText()));

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Orderly.g:126:226: string= STRING
                    	            {
                    	            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional652); 

                    	            requires.add(new JsonString(string.getText()));

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_require_conditional660); 

                     this.currentProperty.addRequires(this.currentRequire, requires); 

                    }
                    break;
                case 3 :
                    // Orderly.g:127:7: 
                    {
                    this.currentProperty.addRequires(this.currentRequire);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "require_conditional"



    // $ANTLR start "require_property"
    // Orderly.g:130:1: require_property : property_name require_conditional ;
    public final void require_property() throws RecognitionException {
        OrderlyParser.property_name_return property_name14 =null;


        try {
            // Orderly.g:131:5: ( property_name require_conditional )
            // Orderly.g:131:7: property_name require_conditional
            {
            pushFollow(FOLLOW_property_name_in_require_property687);
            property_name14=property_name();

            state._fsp--;


            this.currentRequire = JsonString.trimQuotes((property_name14!=null?input.toString(property_name14.start,property_name14.stop):null));

            pushFollow(FOLLOW_require_conditional_in_require_property691);
            require_conditional();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "require_property"



    // $ANTLR start "requires"
    // Orderly.g:134:1: requires : '<' require_property ( ',' require_property )* '>' ;
    public final void requires() throws RecognitionException {
        try {
            // Orderly.g:135:5: ( '<' require_property ( ',' require_property )* '>' )
            // Orderly.g:135:7: '<' require_property ( ',' require_property )* '>'
            {
            match(input,24,FOLLOW_24_in_requires708); 

            pushFollow(FOLLOW_require_property_in_requires710);
            require_property();

            state._fsp--;


            // Orderly.g:135:28: ( ',' require_property )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // Orderly.g:135:29: ',' require_property
            	    {
            	    match(input,21,FOLLOW_21_in_requires713); 

            	    pushFollow(FOLLOW_require_property_in_requires715);
            	    require_property();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            match(input,26,FOLLOW_26_in_requires719); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "requires"



    // $ANTLR start "optional_marker"
    // Orderly.g:138:1: optional_marker : '?' ;
    public final void optional_marker() throws RecognitionException {
        try {
            // Orderly.g:139:5: ( '?' )
            // Orderly.g:139:7: '?'
            {
            match(input,27,FOLLOW_27_in_optional_marker733); 

            this.currentProperty.setOptional(true);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "optional_marker"



    // $ANTLR start "additional_marker"
    // Orderly.g:142:1: additional_marker : '*' ;
    public final void additional_marker() throws RecognitionException {
        try {
            // Orderly.g:143:5: ( '*' )
            // Orderly.g:143:7: '*'
            {
            match(input,20,FOLLOW_20_in_additional_marker752); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "additional_marker"



    // $ANTLR start "enum_values"
    // Orderly.g:146:1: enum_values : jsonArray ;
    public final void enum_values() throws RecognitionException {
        try {
            // Orderly.g:147:5: ( jsonArray )
            // Orderly.g:147:7: jsonArray
            {
            pushFollow(FOLLOW_jsonArray_in_enum_values769);
            jsonArray();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enum_values"



    // $ANTLR start "default_value"
    // Orderly.g:150:1: default_value : '=' jsonValue ;
    public final void default_value() throws RecognitionException {
        try {
            // Orderly.g:151:5: ( '=' jsonValue )
            // Orderly.g:151:7: '=' jsonValue
            {
            match(input,25,FOLLOW_25_in_default_value786); 

            pushFollow(FOLLOW_jsonValue_in_default_value788);
            jsonValue();

            state._fsp--;


            this.currentProperty.setOptional(true);

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "default_value"



    // $ANTLR start "range"
    // Orderly.g:154:1: range returns [Range range] : ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' );
    public final Range range() throws RecognitionException {
        Range range = null;


        Token lower=null;
        Token upper=null;

        range = new Range(); BigDecimal lowerBound; BigDecimal upperBound;
        try {
            // Orderly.g:156:5: ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==NUMBER) ) {
                    int LA34_2 = input.LA(3);

                    if ( (LA34_2==21) ) {
                        int LA34_4 = input.LA(4);

                        if ( (LA34_4==NUMBER) ) {
                            alt34=1;
                        }
                        else if ( (LA34_4==42) ) {
                            alt34=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 34, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA34_1==21) ) {
                    alt34=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // Orderly.g:156:7: '{' lower= NUMBER ',' upper= NUMBER '}'
                    {
                    match(input,41,FOLLOW_41_in_range817); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range821); 

                    match(input,21,FOLLOW_21_in_range823); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range827); 

                    match(input,42,FOLLOW_42_in_range829); 

                    range.lowerBound = new BigDecimal(lower.getText()); range.upperBound = new BigDecimal(upper.getText());

                    }
                    break;
                case 2 :
                    // Orderly.g:157:7: '{' lower= NUMBER ',' '}'
                    {
                    match(input,41,FOLLOW_41_in_range839); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range843); 

                    match(input,21,FOLLOW_21_in_range845); 

                    match(input,42,FOLLOW_42_in_range847); 

                    range.lowerBound = new BigDecimal(lower.getText());

                    }
                    break;
                case 3 :
                    // Orderly.g:158:7: '{' ',' upper= NUMBER '}'
                    {
                    match(input,41,FOLLOW_41_in_range857); 

                    match(input,21,FOLLOW_21_in_range859); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range863); 

                    match(input,42,FOLLOW_42_in_range865); 

                    range.upperBound = new BigDecimal(upper.getText());

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return range;
    }
    // $ANTLR end "range"


    public static class property_name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "property_name"
    // Orderly.g:161:1: property_name : ( IDENTIFIER | STRING );
    public final OrderlyParser.property_name_return property_name() throws RecognitionException {
        OrderlyParser.property_name_return retval = new OrderlyParser.property_name_return();
        retval.start = input.LT(1);


        try {
            // Orderly.g:162:2: ( IDENTIFIER | STRING )
            // Orderly.g:
            {
            if ( input.LA(1)==IDENTIFIER||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "property_name"



    // $ANTLR start "perl_regex"
    // Orderly.g:166:1: perl_regex returns [RegularExpression regex] : exp= REGEX ;
    public final RegularExpression perl_regex() throws RecognitionException {
        RegularExpression regex = null;


        Token exp=null;

        try {
            // Orderly.g:167:2: (exp= REGEX )
            // Orderly.g:167:4: exp= REGEX
            {
            exp=(Token)match(input,REGEX,FOLLOW_REGEX_in_perl_regex900); 

            regex = new RegularExpression(exp.getText());

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return regex;
    }
    // $ANTLR end "perl_regex"



    // $ANTLR start "jsonValue"
    // Orderly.g:231:1: jsonValue : ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray );
    public final void jsonValue() throws RecognitionException {
        try {
            // Orderly.g:232:5: ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray )
            int alt35=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt35=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt35=2;
                }
                break;
            case STRING:
                {
                alt35=3;
                }
                break;
            case NUMBER:
                {
                alt35=4;
                }
                break;
            case 41:
                {
                alt35=5;
                }
                break;
            case 28:
                {
                alt35=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // Orderly.g:232:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_jsonValue1400); 

                    }
                    break;
                case 2 :
                    // Orderly.g:233:7: jsonBooleanLiteral
                    {
                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue1408);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Orderly.g:234:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_jsonValue1416); 

                    }
                    break;
                case 4 :
                    // Orderly.g:235:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue1424); 

                    }
                    break;
                case 5 :
                    // Orderly.g:236:7: jsonObject
                    {
                    pushFollow(FOLLOW_jsonObject_in_jsonValue1432);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Orderly.g:237:7: jsonArray
                    {
                    pushFollow(FOLLOW_jsonArray_in_jsonValue1440);
                    jsonArray();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonValue"



    // $ANTLR start "jsonBooleanLiteral"
    // Orderly.g:240:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // Orderly.g:241:5: ( TRUE | FALSE )
            // Orderly.g:
            {
            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonBooleanLiteral"



    // $ANTLR start "jsonObject"
    // Orderly.g:245:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // Orderly.g:246:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==42) ) {
                    alt36=1;
                }
                else if ( (LA36_1==STRING) ) {
                    alt36=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // Orderly.g:246:7: '{' '}'
                    {
                    match(input,41,FOLLOW_41_in_jsonObject1486); 

                    match(input,42,FOLLOW_42_in_jsonObject1488); 

                    }
                    break;
                case 2 :
                    // Orderly.g:247:7: '{' jsonMemberList '}'
                    {
                    match(input,41,FOLLOW_41_in_jsonObject1496); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject1498);
                    jsonMemberList();

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_jsonObject1500); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonObject"



    // $ANTLR start "jsonMember"
    // Orderly.g:250:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // Orderly.g:251:5: ( STRING ':' jsonValue )
            // Orderly.g:251:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember1517); 

            match(input,22,FOLLOW_22_in_jsonMember1519); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember1521);
            jsonValue();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonMember"



    // $ANTLR start "jsonMemberList"
    // Orderly.g:254:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // Orderly.g:255:5: ( jsonMember ( ',' jsonMemberList )? )
            // Orderly.g:255:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList1538);
            jsonMember();

            state._fsp--;


            // Orderly.g:255:18: ( ',' jsonMemberList )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Orderly.g:255:19: ',' jsonMemberList
                    {
                    match(input,21,FOLLOW_21_in_jsonMemberList1541); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList1543);
                    jsonMemberList();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonMemberList"



    // $ANTLR start "jsonArray"
    // Orderly.g:258:1: jsonArray : ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // Orderly.g:259:5: ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==28) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==29) ) {
                    alt39=1;
                }
                else if ( (LA39_1==FALSE||(LA39_1 >= NULL && LA39_1 <= NUMBER)||(LA39_1 >= STRING && LA39_1 <= TRUE)||LA39_1==28||LA39_1==41) ) {
                    alt39=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // Orderly.g:259:7: '[' ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1562); 

                    match(input,29,FOLLOW_29_in_jsonArray1564); 

                    }
                    break;
                case 2 :
                    // Orderly.g:260:7: '[' jsonValue ( ',' jsonValue )* ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1572); 

                    pushFollow(FOLLOW_jsonValue_in_jsonArray1574);
                    jsonValue();

                    state._fsp--;


                    // Orderly.g:260:21: ( ',' jsonValue )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==21) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Orderly.g:260:22: ',' jsonValue
                    	    {
                    	    match(input,21,FOLLOW_21_in_jsonArray1577); 

                    	    pushFollow(FOLLOW_jsonValue_in_jsonArray1579);
                    	    jsonValue();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_jsonArray1583); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonArray"

    // Delegated rules


 

    public static final BitSet FOLLOW_imports_in_orderly_schema57 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entry_in_orderly_schema60 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_orderly_schema62 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_import_statement82 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_STRING_in_import_statement86 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_import_statement88 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_import_statement92 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_import_statement94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_import_statement_in_imports115 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_import_statement_in_imports118 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_definition_prefix_in_unnamed_entry145 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_unnamed_entry157 = new BitSet(new long[]{0x000002001A008000L});
    public static final BitSet FOLLOW_range_in_unnamed_entry161 = new BitSet(new long[]{0x000000001A008000L});
    public static final BitSet FOLLOW_perl_regex_in_unnamed_entry168 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optional_marker_in_definition_suffix190 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_enum_values_in_definition_suffix193 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_default_value_in_definition_suffix196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_definition_prefix229 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_definition_prefix244 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_definition_prefix259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_definition_prefix269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definition_prefix279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix294 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_definition_prefix299 = new BitSet(new long[]{0x000005F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix301 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition_prefix306 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix324 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definition_prefix328 = new BitSet(new long[]{0x000001F2E0002800L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix335 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition_prefix341 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_definition_prefix354 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_definition_prefix358 = new BitSet(new long[]{0x000005F2C0002800L});
    public static final BitSet FOLLOW_named_entries_in_definition_prefix360 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition_prefix365 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_definition_prefix380 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_definition_prefix385 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix387 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_definition_prefix389 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix391 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition_prefix393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_definition_prefix406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_named_entry429 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry433 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry437 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_named_entry439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_named_entry448 = new BitSet(new long[]{0x0000020000010800L});
    public static final BitSet FOLLOW_range_in_named_entry452 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry457 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_named_entry463 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry468 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_named_entry470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_entry_in_named_entries500 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries505 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_named_entry_in_named_entries509 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries544 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries549 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries553 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_require_conditional587 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_require_conditional601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_require_conditional615 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_require_conditional617 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional623 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional631 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_require_conditional638 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional644 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional652 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_require_conditional660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_name_in_require_property687 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_require_conditional_in_require_property691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_requires708 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires710 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_requires713 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires715 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_requires719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optional_marker733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_additional_marker752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_enum_values769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_default_value786 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_default_value788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_range817 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range821 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range823 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range827 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_range829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_range839 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range843 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range845 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_range847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_range857 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range859 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range863 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_range865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_perl_regex900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_jsonObject1486 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_jsonObject1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_jsonObject1496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject1498 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_jsonObject1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember1517 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_jsonMember1519 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList1538 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonMemberList1541 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1562 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1572 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1574 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_jsonArray1577 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1579 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_jsonArray1583 = new BitSet(new long[]{0x0000000000000002L});

}