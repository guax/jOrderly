// $ANTLR 3.4 Orderly.g 2012-11-05 23:15:33

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
    // Orderly.g:78:1: unnamed_entry returns [JsonProperty property] : ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix | IDENTIFIER ( optional_marker )? );
    public final JsonProperty unnamed_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix2 =null;

        Range range3 =null;


        try {
            // Orderly.g:79:5: ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix | IDENTIFIER ( optional_marker )? )
            int alt7=3;
            switch ( input.LA(1) ) {
            case NULL:
            case 30:
            case 31:
            case 33:
            case 36:
            case 37:
            case 38:
            case 40:
                {
                alt7=1;
                }
                break;
            case 39:
                {
                alt7=2;
                }
                break;
            case IDENTIFIER:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
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
                case 3 :
                    // Orderly.g:81:9: IDENTIFIER ( optional_marker )?
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_unnamed_entry183); 

                    // Orderly.g:81:20: ( optional_marker )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==27) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Orderly.g:81:20: optional_marker
                            {
                            pushFollow(FOLLOW_optional_marker_in_unnamed_entry185);
                            optional_marker();

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
    // $ANTLR end "unnamed_entry"



    // $ANTLR start "definition_suffix"
    // Orderly.g:84:1: definition_suffix : ( optional_marker )? ( enum_values )? ( default_value )? ;
    public final void definition_suffix() throws RecognitionException {
        try {
            // Orderly.g:85:5: ( ( optional_marker )? ( enum_values )? ( default_value )? )
            // Orderly.g:85:7: ( optional_marker )? ( enum_values )? ( default_value )?
            {
            // Orderly.g:85:7: ( optional_marker )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Orderly.g:85:7: optional_marker
                    {
                    pushFollow(FOLLOW_optional_marker_in_definition_suffix203);
                    optional_marker();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:85:24: ( enum_values )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Orderly.g:85:24: enum_values
                    {
                    pushFollow(FOLLOW_enum_values_in_definition_suffix206);
                    enum_values();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:85:37: ( default_value )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Orderly.g:85:37: default_value
                    {
                    pushFollow(FOLLOW_default_value_in_definition_suffix209);
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
    // Orderly.g:88:1: definition_prefix returns [JsonProperty property] : ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' );
    public final JsonProperty definition_prefix() throws RecognitionException {
        JsonProperty property = null;


        JsonProperty un =null;

        Range range4 =null;

        Range range5 =null;

        HashMap<String, JsonProperty> unnamed_entries6 =null;

        Range range7 =null;

        Range range8 =null;

        HashMap<String, JsonProperty> named_entries9 =null;


        try {
            // Orderly.g:91:5: ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' )
            int alt19=9;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt19=1;
                }
                break;
            case 37:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case NULL:
                {
                alt19=4;
                }
                break;
            case 30:
                {
                alt19=5;
                }
                break;
            case 31:
                {
                int LA19_6 = input.LA(2);

                if ( (LA19_6==41) ) {
                    alt19=6;
                }
                else if ( (LA19_6==28) ) {
                    alt19=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 6, input);

                    throw nvae;

                }
                }
                break;
            case 38:
                {
                alt19=8;
                }
                break;
            case 40:
                {
                alt19=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // Orderly.g:91:7: 'integer' ( range )?
                    {
                    match(input,36,FOLLOW_36_in_definition_prefix242); 

                     property = new JsonInteger(); 

                    // Orderly.g:91:52: ( range )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==41) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Orderly.g:91:52: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix246);
                            range4=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonInteger.class.cast(property).setRange(range4);

                    }
                    break;
                case 2 :
                    // Orderly.g:92:7: 'number' ( range )?
                    {
                    match(input,37,FOLLOW_37_in_definition_prefix257); 

                     property = new JsonNumber(); 

                    // Orderly.g:92:50: ( range )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==41) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Orderly.g:92:50: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix261);
                            range5=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonNumber.class.cast(property).setRange(range5);

                    }
                    break;
                case 3 :
                    // Orderly.g:93:7: 'boolean'
                    {
                    match(input,33,FOLLOW_33_in_definition_prefix272); 

                     property = new JsonBoolean(); 

                    }
                    break;
                case 4 :
                    // Orderly.g:94:7: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_definition_prefix282); 

                     property = new JsonNull(); 

                    }
                    break;
                case 5 :
                    // Orderly.g:95:7: 'any'
                    {
                    match(input,30,FOLLOW_30_in_definition_prefix292); 

                     property = new JsonAny(); 

                    }
                    break;
                case 6 :
                    // Orderly.g:97:7: 'array' '{' ( unnamed_entries )? '}' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix307); 

                     property = new JsonArray(); 

                    match(input,41,FOLLOW_41_in_definition_prefix312); 

                    // Orderly.g:97:53: ( unnamed_entries )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==IDENTIFIER||LA13_0==NULL||(LA13_0 >= 30 && LA13_0 <= 31)||LA13_0==33||(LA13_0 >= 36 && LA13_0 <= 40)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Orderly.g:97:53: unnamed_entries
                            {
                            pushFollow(FOLLOW_unnamed_entries_in_definition_prefix314);
                            unnamed_entries6=unnamed_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setProperties(unnamed_entries6);

                    match(input,42,FOLLOW_42_in_definition_prefix319); 

                    // Orderly.g:97:152: ( range )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==41) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Orderly.g:97:152: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix321);
                            range7=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setRange(range7);

                    }
                    break;
                case 7 :
                    // Orderly.g:99:7: 'array' '[' (un= unnamed_entry )? ']' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix337); 

                     property = new JsonArray(); 

                    match(input,28,FOLLOW_28_in_definition_prefix341); 

                    // Orderly.g:99:52: (un= unnamed_entry )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==IDENTIFIER||LA15_0==NULL||(LA15_0 >= 30 && LA15_0 <= 31)||LA15_0==33||(LA15_0 >= 36 && LA15_0 <= 40)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Orderly.g:99:53: un= unnamed_entry
                            {
                             HashMap propertyMap = new HashMap<String, JsonProperty>(); 

                            pushFollow(FOLLOW_unnamed_entry_in_definition_prefix348);
                            un=unnamed_entry();

                            state._fsp--;


                            propertyMap.put(un.getClass().getName(),un); JsonArray.class.cast(property).setProperties(propertyMap); 

                            }
                            break;

                    }


                    match(input,29,FOLLOW_29_in_definition_prefix354); 

                    // Orderly.g:99:267: ( range )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==41) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Orderly.g:99:267: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix356);
                            range8=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setRange(range8);

                    }
                    break;
                case 8 :
                    // Orderly.g:100:7: 'object' '{' ( named_entries )? '}' ( additional_marker )?
                    {
                    match(input,38,FOLLOW_38_in_definition_prefix367); 

                     property = new JsonObject(); 

                    match(input,41,FOLLOW_41_in_definition_prefix371); 

                    // Orderly.g:100:54: ( named_entries )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==IDENTIFIER||LA17_0==NULL||(LA17_0 >= 30 && LA17_0 <= 31)||LA17_0==33||(LA17_0 >= 36 && LA17_0 <= 40)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Orderly.g:100:54: named_entries
                            {
                            pushFollow(FOLLOW_named_entries_in_definition_prefix373);
                            named_entries9=named_entries();

                            state._fsp--;


                            }
                            break;

                    }


                     JsonObject.class.cast(property).setProperties(named_entries9); 

                    match(input,42,FOLLOW_42_in_definition_prefix378); 

                    // Orderly.g:100:152: ( additional_marker )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==20) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Orderly.g:100:153: additional_marker
                            {
                            pushFollow(FOLLOW_additional_marker_in_definition_prefix381);
                            additional_marker();

                            state._fsp--;


                             JsonObject.class.cast(property).setAllowAdditionalProperties(true); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // Orderly.g:101:7: 'union' '{' unnamed_entry ';' unnamed_entries '}'
                    {
                    match(input,40,FOLLOW_40_in_definition_prefix393); 

                     property = new JsonUnion(); 

                    match(input,41,FOLLOW_41_in_definition_prefix398); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix400);
                    unnamed_entry();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_definition_prefix402); 

                    pushFollow(FOLLOW_unnamed_entries_in_definition_prefix404);
                    unnamed_entries();

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_definition_prefix406); 

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
    // Orderly.g:104:1: named_entry returns [JsonProperty property] : ( definition_prefix property_name definition_suffix ( requires )? | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )? | IDENTIFIER property_name ( optional_marker )? ( requires )? );
    public final JsonProperty named_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix10 =null;

        OrderlyParser.property_name_return property_name11 =null;

        Range range12 =null;

        OrderlyParser.property_name_return property_name13 =null;


        try {
            // Orderly.g:105:5: ( definition_prefix property_name definition_suffix ( requires )? | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )? | IDENTIFIER property_name ( optional_marker )? ( requires )? )
            int alt26=3;
            switch ( input.LA(1) ) {
            case NULL:
            case 30:
            case 31:
            case 33:
            case 36:
            case 37:
            case 38:
            case 40:
                {
                alt26=1;
                }
                break;
            case 39:
                {
                alt26=2;
                }
                break;
            case IDENTIFIER:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Orderly.g:105:7: definition_prefix property_name definition_suffix ( requires )?
                    {
                    pushFollow(FOLLOW_definition_prefix_in_named_entry428);
                    definition_prefix10=definition_prefix();

                    state._fsp--;


                     property = definition_prefix10; 

                    pushFollow(FOLLOW_property_name_in_named_entry432);
                    property_name11=property_name();

                    state._fsp--;


                     property.setName(JsonString.trimQuotes((property_name11!=null?input.toString(property_name11.start,property_name11.stop):null))); 

                    pushFollow(FOLLOW_definition_suffix_in_named_entry436);
                    definition_suffix();

                    state._fsp--;


                    // Orderly.g:105:169: ( requires )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==24) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Orderly.g:105:169: requires
                            {
                            pushFollow(FOLLOW_requires_in_named_entry438);
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
                    match(input,39,FOLLOW_39_in_named_entry447); 

                     property = new JsonString(); this.currentProperty = property; 

                    // Orderly.g:106:84: ( range )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==41) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // Orderly.g:106:84: range
                            {
                            pushFollow(FOLLOW_range_in_named_entry451);
                            range12=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRange(range12);

                    pushFollow(FOLLOW_property_name_in_named_entry456);
                    property_name13=property_name();

                    state._fsp--;


                    property.setName(JsonString.trimQuotes((property_name13!=null?input.toString(property_name13.start,property_name13.stop):null)));

                    // Orderly.g:106:234: (regex= perl_regex )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==REGEX) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // Orderly.g:106:234: regex= perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_named_entry462);
                            regex=perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRegExp(regex);

                    pushFollow(FOLLOW_definition_suffix_in_named_entry467);
                    definition_suffix();

                    state._fsp--;


                    // Orderly.g:106:325: ( requires )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==24) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Orderly.g:106:325: requires
                            {
                            pushFollow(FOLLOW_requires_in_named_entry469);
                            requires();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Orderly.g:107:9: IDENTIFIER property_name ( optional_marker )? ( requires )?
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_named_entry480); 

                    pushFollow(FOLLOW_property_name_in_named_entry482);
                    property_name();

                    state._fsp--;


                    // Orderly.g:107:34: ( optional_marker )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==27) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // Orderly.g:107:34: optional_marker
                            {
                            pushFollow(FOLLOW_optional_marker_in_named_entry484);
                            optional_marker();

                            state._fsp--;


                            }
                            break;

                    }


                    // Orderly.g:107:51: ( requires )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==24) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Orderly.g:107:51: requires
                            {
                            pushFollow(FOLLOW_requires_in_named_entry487);
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
    // Orderly.g:110:1: named_entries returns [HashMap<String, JsonProperty> properties] : n1= named_entry ( ';' n2= named_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> named_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty n1 =null;

        JsonProperty n2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:112:5: (n1= named_entry ( ';' n2= named_entry )* ( ';' )? )
            // Orderly.g:112:7: n1= named_entry ( ';' n2= named_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_named_entry_in_named_entries517);
            n1=named_entry();

            state._fsp--;


            properties.put(n1.getName(),n1);

            // Orderly.g:112:78: ( ';' n2= named_entry )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==23) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==IDENTIFIER||LA27_1==NULL||(LA27_1 >= 30 && LA27_1 <= 31)||LA27_1==33||(LA27_1 >= 36 && LA27_1 <= 40)) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // Orderly.g:112:79: ';' n2= named_entry
            	    {
            	    match(input,23,FOLLOW_23_in_named_entries522); 

            	    pushFollow(FOLLOW_named_entry_in_named_entries526);
            	    n2=named_entry();

            	    state._fsp--;


            	    properties.put(n2.getName(),n2);

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // Orderly.g:112:155: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Orderly.g:112:155: ';'
                    {
                    match(input,23,FOLLOW_23_in_named_entries531); 

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
    // Orderly.g:115:1: unnamed_entries returns [HashMap<String, JsonProperty> properties] : un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> unnamed_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty un1 =null;

        JsonProperty un2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:117:5: (un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? )
            // Orderly.g:117:7: un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries561);
            un1=unnamed_entry();

            state._fsp--;


            properties.put(un1.getClass().getName(),un1);

            // Orderly.g:117:94: ( ';' un2= unnamed_entry )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==23) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==IDENTIFIER||LA29_1==NULL||(LA29_1 >= 30 && LA29_1 <= 31)||LA29_1==33||(LA29_1 >= 36 && LA29_1 <= 40)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // Orderly.g:117:95: ';' un2= unnamed_entry
            	    {
            	    match(input,23,FOLLOW_23_in_unnamed_entries566); 

            	    pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries570);
            	    un2=unnamed_entry();

            	    state._fsp--;


            	    properties.put(un2.getClass().getName(), un2);

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            // Orderly.g:117:190: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // Orderly.g:117:190: ';'
                    {
                    match(input,23,FOLLOW_23_in_unnamed_entries577); 

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
    // Orderly.g:120:1: require_conditional : ( '=' (number= NUMBER |string= STRING ) | 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']' |);
    public final void require_conditional() throws RecognitionException {
        Token number=null;
        Token string=null;


                ArrayList requires = new ArrayList<JsonProperty>();
                // optionality is redundant with requires
                this.currentProperty.setOptional(false);
            
        try {
            // Orderly.g:126:5: ( '=' (number= NUMBER |string= STRING ) | 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']' |)
            int alt35=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt35=1;
                }
                break;
            case 35:
                {
                alt35=2;
                }
                break;
            case 21:
            case 26:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // Orderly.g:126:7: '=' (number= NUMBER |string= STRING )
                    {
                    match(input,25,FOLLOW_25_in_require_conditional604); 

                    // Orderly.g:126:11: (number= NUMBER |string= STRING )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==NUMBER) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==STRING) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;

                    }
                    switch (alt31) {
                        case 1 :
                            // Orderly.g:126:13: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional610); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:126:80: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional618); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                     this.currentProperty.addRequires(this.currentRequire, requires); 

                    }
                    break;
                case 2 :
                    // Orderly.g:127:7: 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']'
                    {
                    match(input,35,FOLLOW_35_in_require_conditional632); 

                    match(input,28,FOLLOW_28_in_require_conditional634); 

                    // Orderly.g:127:16: (number= NUMBER |string= STRING )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==NUMBER) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==STRING) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;

                    }
                    switch (alt32) {
                        case 1 :
                            // Orderly.g:127:18: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional640); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:127:85: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional648); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                    // Orderly.g:127:152: ( ',' (number= NUMBER |string= STRING ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==21) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Orderly.g:127:153: ',' (number= NUMBER |string= STRING )
                    	    {
                    	    match(input,21,FOLLOW_21_in_require_conditional655); 

                    	    // Orderly.g:127:157: (number= NUMBER |string= STRING )
                    	    int alt33=2;
                    	    int LA33_0 = input.LA(1);

                    	    if ( (LA33_0==NUMBER) ) {
                    	        alt33=1;
                    	    }
                    	    else if ( (LA33_0==STRING) ) {
                    	        alt33=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 33, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt33) {
                    	        case 1 :
                    	            // Orderly.g:127:159: number= NUMBER
                    	            {
                    	            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional661); 

                    	            requires.add(new JsonNumber(number.getText()));

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Orderly.g:127:226: string= STRING
                    	            {
                    	            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional669); 

                    	            requires.add(new JsonString(string.getText()));

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_require_conditional677); 

                     this.currentProperty.addRequires(this.currentRequire, requires); 

                    }
                    break;
                case 3 :
                    // Orderly.g:128:7: 
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
    // Orderly.g:131:1: require_property : property_name require_conditional ;
    public final void require_property() throws RecognitionException {
        OrderlyParser.property_name_return property_name14 =null;


        try {
            // Orderly.g:132:5: ( property_name require_conditional )
            // Orderly.g:132:7: property_name require_conditional
            {
            pushFollow(FOLLOW_property_name_in_require_property704);
            property_name14=property_name();

            state._fsp--;


            this.currentRequire = JsonString.trimQuotes((property_name14!=null?input.toString(property_name14.start,property_name14.stop):null));

            pushFollow(FOLLOW_require_conditional_in_require_property708);
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
    // Orderly.g:135:1: requires : '<' require_property ( ',' require_property )* '>' ;
    public final void requires() throws RecognitionException {
        try {
            // Orderly.g:136:5: ( '<' require_property ( ',' require_property )* '>' )
            // Orderly.g:136:7: '<' require_property ( ',' require_property )* '>'
            {
            match(input,24,FOLLOW_24_in_requires725); 

            pushFollow(FOLLOW_require_property_in_requires727);
            require_property();

            state._fsp--;


            // Orderly.g:136:28: ( ',' require_property )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==21) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // Orderly.g:136:29: ',' require_property
            	    {
            	    match(input,21,FOLLOW_21_in_requires730); 

            	    pushFollow(FOLLOW_require_property_in_requires732);
            	    require_property();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            match(input,26,FOLLOW_26_in_requires736); 

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
    // Orderly.g:139:1: optional_marker : '?' ;
    public final void optional_marker() throws RecognitionException {
        try {
            // Orderly.g:140:5: ( '?' )
            // Orderly.g:140:7: '?'
            {
            match(input,27,FOLLOW_27_in_optional_marker750); 

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
    // Orderly.g:143:1: additional_marker : '*' ;
    public final void additional_marker() throws RecognitionException {
        try {
            // Orderly.g:144:5: ( '*' )
            // Orderly.g:144:7: '*'
            {
            match(input,20,FOLLOW_20_in_additional_marker769); 

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
    // Orderly.g:147:1: enum_values : jsonArray ;
    public final void enum_values() throws RecognitionException {
        try {
            // Orderly.g:148:5: ( jsonArray )
            // Orderly.g:148:7: jsonArray
            {
            pushFollow(FOLLOW_jsonArray_in_enum_values786);
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
    // Orderly.g:151:1: default_value : '=' jsonValue ;
    public final void default_value() throws RecognitionException {
        try {
            // Orderly.g:152:5: ( '=' jsonValue )
            // Orderly.g:152:7: '=' jsonValue
            {
            match(input,25,FOLLOW_25_in_default_value803); 

            pushFollow(FOLLOW_jsonValue_in_default_value805);
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
    // Orderly.g:155:1: range returns [Range range] : ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' );
    public final Range range() throws RecognitionException {
        Range range = null;


        Token lower=null;
        Token upper=null;

        range = new Range(); BigDecimal lowerBound; BigDecimal upperBound;
        try {
            // Orderly.g:157:5: ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==NUMBER) ) {
                    int LA37_2 = input.LA(3);

                    if ( (LA37_2==21) ) {
                        int LA37_4 = input.LA(4);

                        if ( (LA37_4==NUMBER) ) {
                            alt37=1;
                        }
                        else if ( (LA37_4==42) ) {
                            alt37=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 37, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA37_1==21) ) {
                    alt37=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // Orderly.g:157:7: '{' lower= NUMBER ',' upper= NUMBER '}'
                    {
                    match(input,41,FOLLOW_41_in_range834); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range838); 

                    match(input,21,FOLLOW_21_in_range840); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range844); 

                    match(input,42,FOLLOW_42_in_range846); 

                    range.lowerBound = new BigDecimal(lower.getText()); range.upperBound = new BigDecimal(upper.getText());

                    }
                    break;
                case 2 :
                    // Orderly.g:158:7: '{' lower= NUMBER ',' '}'
                    {
                    match(input,41,FOLLOW_41_in_range856); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range860); 

                    match(input,21,FOLLOW_21_in_range862); 

                    match(input,42,FOLLOW_42_in_range864); 

                    range.lowerBound = new BigDecimal(lower.getText());

                    }
                    break;
                case 3 :
                    // Orderly.g:159:7: '{' ',' upper= NUMBER '}'
                    {
                    match(input,41,FOLLOW_41_in_range874); 

                    match(input,21,FOLLOW_21_in_range876); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range880); 

                    match(input,42,FOLLOW_42_in_range882); 

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
    // Orderly.g:162:1: property_name : ( IDENTIFIER | STRING );
    public final OrderlyParser.property_name_return property_name() throws RecognitionException {
        OrderlyParser.property_name_return retval = new OrderlyParser.property_name_return();
        retval.start = input.LT(1);


        try {
            // Orderly.g:163:2: ( IDENTIFIER | STRING )
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
    // Orderly.g:167:1: perl_regex returns [RegularExpression regex] : exp= REGEX ;
    public final RegularExpression perl_regex() throws RecognitionException {
        RegularExpression regex = null;


        Token exp=null;

        try {
            // Orderly.g:168:2: (exp= REGEX )
            // Orderly.g:168:4: exp= REGEX
            {
            exp=(Token)match(input,REGEX,FOLLOW_REGEX_in_perl_regex917); 

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
    // Orderly.g:232:1: jsonValue : ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray );
    public final void jsonValue() throws RecognitionException {
        try {
            // Orderly.g:233:5: ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray )
            int alt38=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt38=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt38=2;
                }
                break;
            case STRING:
                {
                alt38=3;
                }
                break;
            case NUMBER:
                {
                alt38=4;
                }
                break;
            case 41:
                {
                alt38=5;
                }
                break;
            case 28:
                {
                alt38=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // Orderly.g:233:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_jsonValue1417); 

                    }
                    break;
                case 2 :
                    // Orderly.g:234:7: jsonBooleanLiteral
                    {
                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue1425);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Orderly.g:235:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_jsonValue1433); 

                    }
                    break;
                case 4 :
                    // Orderly.g:236:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue1441); 

                    }
                    break;
                case 5 :
                    // Orderly.g:237:7: jsonObject
                    {
                    pushFollow(FOLLOW_jsonObject_in_jsonValue1449);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Orderly.g:238:7: jsonArray
                    {
                    pushFollow(FOLLOW_jsonArray_in_jsonValue1457);
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
    // Orderly.g:241:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // Orderly.g:242:5: ( TRUE | FALSE )
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
    // Orderly.g:246:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // Orderly.g:247:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==42) ) {
                    alt39=1;
                }
                else if ( (LA39_1==STRING) ) {
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
                    // Orderly.g:247:7: '{' '}'
                    {
                    match(input,41,FOLLOW_41_in_jsonObject1503); 

                    match(input,42,FOLLOW_42_in_jsonObject1505); 

                    }
                    break;
                case 2 :
                    // Orderly.g:248:7: '{' jsonMemberList '}'
                    {
                    match(input,41,FOLLOW_41_in_jsonObject1513); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject1515);
                    jsonMemberList();

                    state._fsp--;


                    match(input,42,FOLLOW_42_in_jsonObject1517); 

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
    // Orderly.g:251:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // Orderly.g:252:5: ( STRING ':' jsonValue )
            // Orderly.g:252:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember1534); 

            match(input,22,FOLLOW_22_in_jsonMember1536); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember1538);
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
    // Orderly.g:255:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // Orderly.g:256:5: ( jsonMember ( ',' jsonMemberList )? )
            // Orderly.g:256:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList1555);
            jsonMember();

            state._fsp--;


            // Orderly.g:256:18: ( ',' jsonMemberList )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // Orderly.g:256:19: ',' jsonMemberList
                    {
                    match(input,21,FOLLOW_21_in_jsonMemberList1558); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList1560);
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
    // Orderly.g:259:1: jsonArray : ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // Orderly.g:260:5: ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==29) ) {
                    alt42=1;
                }
                else if ( (LA42_1==FALSE||(LA42_1 >= NULL && LA42_1 <= NUMBER)||(LA42_1 >= STRING && LA42_1 <= TRUE)||LA42_1==28||LA42_1==41) ) {
                    alt42=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // Orderly.g:260:7: '[' ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1579); 

                    match(input,29,FOLLOW_29_in_jsonArray1581); 

                    }
                    break;
                case 2 :
                    // Orderly.g:261:7: '[' jsonValue ( ',' jsonValue )* ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1589); 

                    pushFollow(FOLLOW_jsonValue_in_jsonArray1591);
                    jsonValue();

                    state._fsp--;


                    // Orderly.g:261:21: ( ',' jsonValue )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==21) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // Orderly.g:261:22: ',' jsonValue
                    	    {
                    	    match(input,21,FOLLOW_21_in_jsonArray1594); 

                    	    pushFollow(FOLLOW_jsonValue_in_jsonArray1596);
                    	    jsonValue();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_jsonArray1600); 

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
    public static final BitSet FOLLOW_IDENTIFIER_in_unnamed_entry183 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_optional_marker_in_unnamed_entry185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optional_marker_in_definition_suffix203 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_enum_values_in_definition_suffix206 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_default_value_in_definition_suffix209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_definition_prefix242 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_definition_prefix257 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_definition_prefix272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_definition_prefix282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definition_prefix292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix307 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_definition_prefix312 = new BitSet(new long[]{0x000005F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix314 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition_prefix319 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix337 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definition_prefix341 = new BitSet(new long[]{0x000001F2E0002800L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix348 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition_prefix354 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_definition_prefix367 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_definition_prefix371 = new BitSet(new long[]{0x000005F2C0002800L});
    public static final BitSet FOLLOW_named_entries_in_definition_prefix373 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition_prefix378 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_definition_prefix393 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_definition_prefix398 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix400 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_definition_prefix402 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix404 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_definition_prefix406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_named_entry428 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry432 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry436 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_named_entry438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_named_entry447 = new BitSet(new long[]{0x0000020000010800L});
    public static final BitSet FOLLOW_range_in_named_entry451 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry456 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_named_entry462 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry467 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_named_entry469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_named_entry480 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry482 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_optional_marker_in_named_entry484 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_named_entry487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_entry_in_named_entries517 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries522 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_named_entry_in_named_entries526 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries561 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries566 = new BitSet(new long[]{0x000001F2C0002800L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries570 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_require_conditional604 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_require_conditional618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_require_conditional632 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_require_conditional634 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional640 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional648 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_require_conditional655 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional661 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional669 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_require_conditional677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_name_in_require_property704 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_require_conditional_in_require_property708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_requires725 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires727 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_requires730 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires732 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_requires736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optional_marker750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_additional_marker769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_enum_values786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_default_value803 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_default_value805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_range834 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range838 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range840 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range844 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_range846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_range856 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range860 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range862 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_range864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_range874 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range876 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range880 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_range882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_perl_regex917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_jsonObject1503 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_jsonObject1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_jsonObject1513 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject1515 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_jsonObject1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember1534 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_jsonMember1536 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList1555 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonMemberList1558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1579 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1589 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1591 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_jsonArray1594 = new BitSet(new long[]{0x0000020010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1596 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_jsonArray1600 = new BitSet(new long[]{0x0000000000000002L});

}