// $ANTLR 3.4 /Users/guax/jOrderly/grammar/Orderly.g 2012-10-02 20:32:40

package net.guax.jorderly.parser;

import java.util.HashMap;
import net.guax.jorderly.json.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OrderlyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIGIT", "EXP", "EscapeSequence", "FALSE", "FRAC", "HexDigit", "IDENTIFIER", "INT", "NULL", "NUMBER", "REGEX", "STRING", "TRUE", "UnicodeEscape", "WS", "'*'", "','", "':'", "';'", "'<'", "'='", "'>'", "'?'", "'['", "']'", "'any'", "'array'", "'boolean'", "'integer'", "'number'", "'object'", "'string'", "'union'", "'{'", "'}'"
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
    public String getGrammarFileName() { return "/Users/guax/jOrderly/grammar/Orderly.g"; }



    // $ANTLR start "orderly_schema"
    // /Users/guax/jOrderly/grammar/Orderly.g:19:1: orderly_schema returns [JsonProperty rootProperty] : unnamed_entry ( ';' )? EOF ;
    public final JsonProperty orderly_schema() throws RecognitionException {
        JsonProperty rootProperty = null;


        JsonProperty unnamed_entry1 =null;


        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:20:5: ( unnamed_entry ( ';' )? EOF )
            // /Users/guax/jOrderly/grammar/Orderly.g:20:7: unnamed_entry ( ';' )? EOF
            {
            pushFollow(FOLLOW_unnamed_entry_in_orderly_schema51);
            unnamed_entry1=unnamed_entry();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:20:21: ( ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:20:21: ';'
                    {
                    match(input,23,FOLLOW_23_in_orderly_schema53); 

                    }
                    break;

            }


             rootProperty = unnamed_entry1;

            match(input,EOF,FOLLOW_EOF_in_orderly_schema58); 

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



    // $ANTLR start "unnamed_entry"
    // /Users/guax/jOrderly/grammar/Orderly.g:23:1: unnamed_entry returns [JsonProperty property] : ( definition_prefix definition_suffix | 'string' ( range )? ( perl_regex )? definition_suffix );
    public final JsonProperty unnamed_entry() throws RecognitionException {
        JsonProperty property = null;


        JsonProperty definition_prefix2 =null;


        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:24:5: ( definition_prefix definition_suffix | 'string' ( range )? ( perl_regex )? definition_suffix )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NULL||(LA4_0 >= 30 && LA4_0 <= 35)||LA4_0==37) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:24:7: definition_prefix definition_suffix
                    {
                    pushFollow(FOLLOW_definition_prefix_in_unnamed_entry83);
                    definition_prefix2=definition_prefix();

                    state._fsp--;


                     property = definition_prefix2; 

                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry87);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:25:7: 'string' ( range )? ( perl_regex )? definition_suffix
                    {
                    match(input,36,FOLLOW_36_in_unnamed_entry95); 

                     property = new JsonString(); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:25:50: ( range )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==38) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:25:50: range
                            {
                            pushFollow(FOLLOW_range_in_unnamed_entry99);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    // /Users/guax/jOrderly/grammar/Orderly.g:25:57: ( perl_regex )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==REGEX) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:25:57: perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_unnamed_entry102);
                            perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry105);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:28:1: definition_suffix : ( enum_values )? ( default_value )? ( requires )? ( optional_marker )? ;
    public final void definition_suffix() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:29:5: ( ( enum_values )? ( default_value )? ( requires )? ( optional_marker )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:29:7: ( enum_values )? ( default_value )? ( requires )? ( optional_marker )?
            {
            // /Users/guax/jOrderly/grammar/Orderly.g:29:7: ( enum_values )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:29:7: enum_values
                    {
                    pushFollow(FOLLOW_enum_values_in_definition_suffix122);
                    enum_values();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/guax/jOrderly/grammar/Orderly.g:29:20: ( default_value )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:29:20: default_value
                    {
                    pushFollow(FOLLOW_default_value_in_definition_suffix125);
                    default_value();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/guax/jOrderly/grammar/Orderly.g:29:35: ( requires )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:29:35: requires
                    {
                    pushFollow(FOLLOW_requires_in_definition_suffix128);
                    requires();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/guax/jOrderly/grammar/Orderly.g:29:45: ( optional_marker )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:29:45: optional_marker
                    {
                    pushFollow(FOLLOW_optional_marker_in_definition_suffix131);
                    optional_marker();

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
    // /Users/guax/jOrderly/grammar/Orderly.g:32:1: definition_prefix returns [JsonProperty property] : ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' unnamed_entry ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' );
    public final JsonProperty definition_prefix() throws RecognitionException {
        JsonProperty property = null;


        List<JsonProperty> unnamed_entries3 =null;

        HashMap<String, JsonProperty> named_entries4 =null;


        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:33:5: ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' unnamed_entry ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            case NULL:
                {
                alt16=4;
                }
                break;
            case 30:
                {
                alt16=5;
                }
                break;
            case 31:
                {
                int LA16_6 = input.LA(2);

                if ( (LA16_6==38) ) {
                    alt16=6;
                }
                else if ( (LA16_6==28) ) {
                    alt16=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 6, input);

                    throw nvae;

                }
                }
                break;
            case 35:
                {
                alt16=8;
                }
                break;
            case 37:
                {
                alt16=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:33:7: 'integer' ( range )?
                    {
                    match(input,33,FOLLOW_33_in_definition_prefix150); 

                     property = new JsonInteger(); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:33:52: ( range )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==38) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:33:52: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix154);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:34:7: 'number' ( range )?
                    {
                    match(input,34,FOLLOW_34_in_definition_prefix163); 

                     property = new JsonNumber(); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:34:50: ( range )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==38) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:34:50: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix167);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:35:7: 'boolean'
                    {
                    match(input,32,FOLLOW_32_in_definition_prefix176); 

                     property = new JsonBoolean(); 

                    }
                    break;
                case 4 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:36:7: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_definition_prefix186); 

                     property = new JsonNull(); 

                    }
                    break;
                case 5 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:37:7: 'any'
                    {
                    match(input,30,FOLLOW_30_in_definition_prefix196); 

                     property = new JsonAny(); 

                    }
                    break;
                case 6 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:39:7: 'array' '{' ( unnamed_entries )? '}' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix211); 

                     property = new JsonArray(); 

                    match(input,38,FOLLOW_38_in_definition_prefix216); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:39:53: ( unnamed_entries )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NULL||(LA11_0 >= 30 && LA11_0 <= 37)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:39:53: unnamed_entries
                            {
                            pushFollow(FOLLOW_unnamed_entries_in_definition_prefix218);
                            unnamed_entries3=unnamed_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setProperties(unnamed_entries3);

                    match(input,39,FOLLOW_39_in_definition_prefix223); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:39:152: ( range )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==38) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:39:152: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix225);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:41:7: 'array' '[' unnamed_entry ']' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix239); 

                     property = new JsonArray(); 

                    match(input,28,FOLLOW_28_in_definition_prefix243); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix245);
                    unnamed_entry();

                    state._fsp--;


                    match(input,29,FOLLOW_29_in_definition_prefix247); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:41:70: ( range )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==38) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:41:70: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix249);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:42:7: 'object' '{' ( named_entries )? '}' ( additional_marker )?
                    {
                    match(input,35,FOLLOW_35_in_definition_prefix258); 

                     property = new JsonObject(); 

                    match(input,38,FOLLOW_38_in_definition_prefix262); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:42:54: ( named_entries )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NULL||(LA14_0 >= 30 && LA14_0 <= 37)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:42:54: named_entries
                            {
                            pushFollow(FOLLOW_named_entries_in_definition_prefix264);
                            named_entries4=named_entries();

                            state._fsp--;


                            }
                            break;

                    }


                     JsonObject.class.cast(property).setProperties(named_entries4); 

                    match(input,39,FOLLOW_39_in_definition_prefix269); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:42:152: ( additional_marker )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==20) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:42:153: additional_marker
                            {
                            pushFollow(FOLLOW_additional_marker_in_definition_prefix272);
                            additional_marker();

                            state._fsp--;


                             JsonObject.class.cast(property).setAllowAdditionalProperties(true); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:43:7: 'union' '{' unnamed_entry ';' unnamed_entries '}'
                    {
                    match(input,37,FOLLOW_37_in_definition_prefix284); 

                     property = new JsonUnion(); 

                    match(input,38,FOLLOW_38_in_definition_prefix289); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix291);
                    unnamed_entry();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_definition_prefix293); 

                    pushFollow(FOLLOW_unnamed_entries_in_definition_prefix295);
                    unnamed_entries();

                    state._fsp--;


                    match(input,39,FOLLOW_39_in_definition_prefix297); 

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
    // $ANTLR end "definition_prefix"



    // $ANTLR start "named_entry"
    // /Users/guax/jOrderly/grammar/Orderly.g:46:1: named_entry returns [JsonProperty property] : ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name ( perl_regex )? definition_suffix );
    public final JsonProperty named_entry() throws RecognitionException {
        JsonProperty property = null;


        JsonProperty definition_prefix5 =null;

        OrderlyParser.property_name_return property_name6 =null;

        OrderlyParser.property_name_return property_name7 =null;


        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:47:5: ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name ( perl_regex )? definition_suffix )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==NULL||(LA19_0 >= 30 && LA19_0 <= 35)||LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:47:7: definition_prefix property_name definition_suffix
                    {
                    pushFollow(FOLLOW_definition_prefix_in_named_entry319);
                    definition_prefix5=definition_prefix();

                    state._fsp--;


                     property = definition_prefix5; 

                    pushFollow(FOLLOW_property_name_in_named_entry323);
                    property_name6=property_name();

                    state._fsp--;


                     property.setName((property_name6!=null?input.toString(property_name6.start,property_name6.stop):null)); 

                    pushFollow(FOLLOW_definition_suffix_in_named_entry327);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:48:7: 'string' ( range )? property_name ( perl_regex )? definition_suffix
                    {
                    match(input,36,FOLLOW_36_in_named_entry335); 

                     property = new JsonString(); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:48:50: ( range )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==38) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:48:50: range
                            {
                            pushFollow(FOLLOW_range_in_named_entry339);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_property_name_in_named_entry342);
                    property_name7=property_name();

                    state._fsp--;


                    property.setName((property_name7!=null?input.toString(property_name7.start,property_name7.stop):null));

                    // /Users/guax/jOrderly/grammar/Orderly.g:48:113: ( perl_regex )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==REGEX) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:48:113: perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_named_entry346);
                            perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_definition_suffix_in_named_entry349);
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
    // $ANTLR end "named_entry"



    // $ANTLR start "named_entries"
    // /Users/guax/jOrderly/grammar/Orderly.g:51:1: named_entries returns [HashMap<String, JsonProperty> properties] : n1= named_entry ( ';' n2= named_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> named_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty n1 =null;

        JsonProperty n2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:53:5: (n1= named_entry ( ';' n2= named_entry )* ( ';' )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:53:7: n1= named_entry ( ';' n2= named_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_named_entry_in_named_entries378);
            n1=named_entry();

            state._fsp--;


            properties.put(n1.getName(),n1);

            // /Users/guax/jOrderly/grammar/Orderly.g:53:78: ( ';' n2= named_entry )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==NULL||(LA20_1 >= 30 && LA20_1 <= 37)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // /Users/guax/jOrderly/grammar/Orderly.g:53:79: ';' n2= named_entry
            	    {
            	    match(input,23,FOLLOW_23_in_named_entries383); 

            	    pushFollow(FOLLOW_named_entry_in_named_entries387);
            	    n2=named_entry();

            	    state._fsp--;


            	    properties.put(n2.getName(),n2);

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            // /Users/guax/jOrderly/grammar/Orderly.g:53:155: ( ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:53:155: ';'
                    {
                    match(input,23,FOLLOW_23_in_named_entries392); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:56:1: unnamed_entries returns [List<JsonProperty> properties] : un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? ;
    public final List<JsonProperty> unnamed_entries() throws RecognitionException {
        List<JsonProperty> properties = null;


        JsonProperty un1 =null;

        JsonProperty un2 =null;


         properties = new ArrayList<JsonProperty>(); 
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:58:5: (un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:58:7: un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries422);
            un1=unnamed_entry();

            state._fsp--;


            properties.add(un1);

            // /Users/guax/jOrderly/grammar/Orderly.g:58:59: ( ';' un2= unnamed_entry )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==NULL||(LA22_1 >= 30 && LA22_1 <= 37)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // /Users/guax/jOrderly/grammar/Orderly.g:58:60: ';' un2= unnamed_entry
            	    {
            	    match(input,23,FOLLOW_23_in_unnamed_entries427); 

            	    pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries431);
            	    un2=unnamed_entry();

            	    state._fsp--;


            	    properties.add(un2);

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // /Users/guax/jOrderly/grammar/Orderly.g:58:119: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:58:119: ';'
                    {
                    match(input,23,FOLLOW_23_in_unnamed_entries438); 

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



    // $ANTLR start "csv_property_names"
    // /Users/guax/jOrderly/grammar/Orderly.g:61:1: csv_property_names : property_name ( ',' property_name )* ;
    public final void csv_property_names() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:62:5: ( property_name ( ',' property_name )* )
            // /Users/guax/jOrderly/grammar/Orderly.g:62:7: property_name ( ',' property_name )*
            {
            pushFollow(FOLLOW_property_name_in_csv_property_names456);
            property_name();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:62:21: ( ',' property_name )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/guax/jOrderly/grammar/Orderly.g:62:22: ',' property_name
            	    {
            	    match(input,21,FOLLOW_21_in_csv_property_names459); 

            	    pushFollow(FOLLOW_property_name_in_csv_property_names461);
            	    property_name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "csv_property_names"



    // $ANTLR start "requires"
    // /Users/guax/jOrderly/grammar/Orderly.g:65:1: requires : '<' csv_property_names '>' ;
    public final void requires() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:66:5: ( '<' csv_property_names '>' )
            // /Users/guax/jOrderly/grammar/Orderly.g:66:7: '<' csv_property_names '>'
            {
            match(input,24,FOLLOW_24_in_requires477); 

            pushFollow(FOLLOW_csv_property_names_in_requires479);
            csv_property_names();

            state._fsp--;


            match(input,26,FOLLOW_26_in_requires481); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:69:1: optional_marker : '?' ;
    public final void optional_marker() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:70:5: ( '?' )
            // /Users/guax/jOrderly/grammar/Orderly.g:70:7: '?'
            {
            match(input,27,FOLLOW_27_in_optional_marker495); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:73:1: additional_marker : '*' ;
    public final void additional_marker() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:74:5: ( '*' )
            // /Users/guax/jOrderly/grammar/Orderly.g:74:7: '*'
            {
            match(input,20,FOLLOW_20_in_additional_marker512); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:77:1: enum_values : jsonArray ;
    public final void enum_values() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:78:5: ( jsonArray )
            // /Users/guax/jOrderly/grammar/Orderly.g:78:7: jsonArray
            {
            pushFollow(FOLLOW_jsonArray_in_enum_values529);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:81:1: default_value : '=' jsonValue ;
    public final void default_value() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:82:5: ( '=' jsonValue )
            // /Users/guax/jOrderly/grammar/Orderly.g:82:7: '=' jsonValue
            {
            match(input,25,FOLLOW_25_in_default_value546); 

            pushFollow(FOLLOW_jsonValue_in_default_value548);
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
    // $ANTLR end "default_value"



    // $ANTLR start "range"
    // /Users/guax/jOrderly/grammar/Orderly.g:85:1: range : ( '{' NUMBER ',' NUMBER '}' | '{' NUMBER ',' '}' | '{' ',' NUMBER '}' );
    public final void range() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:86:5: ( '{' NUMBER ',' NUMBER '}' | '{' NUMBER ',' '}' | '{' ',' NUMBER '}' )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==NUMBER) ) {
                    int LA25_2 = input.LA(3);

                    if ( (LA25_2==21) ) {
                        int LA25_4 = input.LA(4);

                        if ( (LA25_4==NUMBER) ) {
                            alt25=1;
                        }
                        else if ( (LA25_4==39) ) {
                            alt25=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 25, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA25_1==21) ) {
                    alt25=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:86:7: '{' NUMBER ',' NUMBER '}'
                    {
                    match(input,38,FOLLOW_38_in_range562); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range564); 

                    match(input,21,FOLLOW_21_in_range566); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range568); 

                    match(input,39,FOLLOW_39_in_range570); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:87:7: '{' NUMBER ',' '}'
                    {
                    match(input,38,FOLLOW_38_in_range578); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range580); 

                    match(input,21,FOLLOW_21_in_range582); 

                    match(input,39,FOLLOW_39_in_range584); 

                    }
                    break;
                case 3 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:88:7: '{' ',' NUMBER '}'
                    {
                    match(input,38,FOLLOW_38_in_range592); 

                    match(input,21,FOLLOW_21_in_range594); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range596); 

                    match(input,39,FOLLOW_39_in_range598); 

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
    // $ANTLR end "range"


    public static class property_name_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "property_name"
    // /Users/guax/jOrderly/grammar/Orderly.g:91:1: property_name : ( IDENTIFIER | STRING );
    public final OrderlyParser.property_name_return property_name() throws RecognitionException {
        OrderlyParser.property_name_return retval = new OrderlyParser.property_name_return();
        retval.start = input.LT(1);


        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:92:2: ( IDENTIFIER | STRING )
            // /Users/guax/jOrderly/grammar/Orderly.g:
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
    // /Users/guax/jOrderly/grammar/Orderly.g:96:1: perl_regex : REGEX ;
    public final void perl_regex() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:97:2: ( REGEX )
            // /Users/guax/jOrderly/grammar/Orderly.g:97:4: REGEX
            {
            match(input,REGEX,FOLLOW_REGEX_in_perl_regex625); 

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
    // $ANTLR end "perl_regex"



    // $ANTLR start "jsonValue"
    // /Users/guax/jOrderly/grammar/Orderly.g:161:1: jsonValue : ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray );
    public final void jsonValue() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:162:5: ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray )
            int alt26=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt26=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt26=2;
                }
                break;
            case STRING:
                {
                alt26=3;
                }
                break;
            case NUMBER:
                {
                alt26=4;
                }
                break;
            case 38:
                {
                alt26=5;
                }
                break;
            case 28:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:162:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_jsonValue1123); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:163:7: jsonBooleanLiteral
                    {
                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue1131);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:164:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_jsonValue1139); 

                    }
                    break;
                case 4 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:165:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue1147); 

                    }
                    break;
                case 5 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:166:7: jsonObject
                    {
                    pushFollow(FOLLOW_jsonObject_in_jsonValue1155);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:167:7: jsonArray
                    {
                    pushFollow(FOLLOW_jsonArray_in_jsonValue1163);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:170:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:171:5: ( TRUE | FALSE )
            // /Users/guax/jOrderly/grammar/Orderly.g:
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
    // /Users/guax/jOrderly/grammar/Orderly.g:175:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:176:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==39) ) {
                    alt27=1;
                }
                else if ( (LA27_1==STRING) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:176:7: '{' '}'
                    {
                    match(input,38,FOLLOW_38_in_jsonObject1209); 

                    match(input,39,FOLLOW_39_in_jsonObject1211); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:177:7: '{' jsonMemberList '}'
                    {
                    match(input,38,FOLLOW_38_in_jsonObject1219); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject1221);
                    jsonMemberList();

                    state._fsp--;


                    match(input,39,FOLLOW_39_in_jsonObject1223); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:180:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:181:5: ( STRING ':' jsonValue )
            // /Users/guax/jOrderly/grammar/Orderly.g:181:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember1240); 

            match(input,22,FOLLOW_22_in_jsonMember1242); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember1244);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:184:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:185:5: ( jsonMember ( ',' jsonMemberList )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:185:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList1261);
            jsonMember();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:185:18: ( ',' jsonMemberList )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:185:19: ',' jsonMemberList
                    {
                    match(input,21,FOLLOW_21_in_jsonMemberList1264); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList1266);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:188:1: jsonArray : ( '[' ']' | '[' jsonElementList ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:189:5: ( '[' ']' | '[' jsonElementList ']' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==29) ) {
                    alt29=1;
                }
                else if ( (LA29_1==FALSE||(LA29_1 >= NULL && LA29_1 <= NUMBER)||(LA29_1 >= STRING && LA29_1 <= TRUE)||LA29_1==28||LA29_1==38) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:189:7: '[' ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1285); 

                    match(input,29,FOLLOW_29_in_jsonArray1287); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:190:7: '[' jsonElementList ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1295); 

                    pushFollow(FOLLOW_jsonElementList_in_jsonArray1297);
                    jsonElementList();

                    state._fsp--;


                    match(input,29,FOLLOW_29_in_jsonArray1299); 

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



    // $ANTLR start "jsonElementList"
    // /Users/guax/jOrderly/grammar/Orderly.g:193:1: jsonElementList : jsonValue ( ',' jsonValue )* ;
    public final void jsonElementList() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:194:5: ( jsonValue ( ',' jsonValue )* )
            // /Users/guax/jOrderly/grammar/Orderly.g:194:7: jsonValue ( ',' jsonValue )*
            {
            pushFollow(FOLLOW_jsonValue_in_jsonElementList1316);
            jsonValue();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:194:17: ( ',' jsonValue )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/guax/jOrderly/grammar/Orderly.g:194:18: ',' jsonValue
            	    {
            	    match(input,21,FOLLOW_21_in_jsonElementList1319); 

            	    pushFollow(FOLLOW_jsonValue_in_jsonElementList1321);
            	    jsonValue();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "jsonElementList"

    // Delegated rules


 

    public static final BitSet FOLLOW_unnamed_entry_in_orderly_schema51 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_orderly_schema53 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_orderly_schema58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_unnamed_entry83 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_unnamed_entry95 = new BitSet(new long[]{0x000000401B008000L});
    public static final BitSet FOLLOW_range_in_unnamed_entry99 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_unnamed_entry102 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_values_in_definition_suffix122 = new BitSet(new long[]{0x000000000B000002L});
    public static final BitSet FOLLOW_default_value_in_definition_suffix125 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_requires_in_definition_suffix128 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_optional_marker_in_definition_suffix131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_definition_prefix150 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_definition_prefix163 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_definition_prefix176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_definition_prefix186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definition_prefix196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix211 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix216 = new BitSet(new long[]{0x000000BFC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix218 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix223 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix239 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definition_prefix243 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix245 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition_prefix247 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_definition_prefix258 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix262 = new BitSet(new long[]{0x000000BFC0002000L});
    public static final BitSet FOLLOW_named_entries_in_definition_prefix264 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix269 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_definition_prefix284 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix289 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix291 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_definition_prefix293 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix295 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_named_entry319 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry323 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_named_entry335 = new BitSet(new long[]{0x0000004000010800L});
    public static final BitSet FOLLOW_range_in_named_entry339 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry342 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_named_entry346 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_entry_in_named_entries378 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries383 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_named_entry_in_named_entries387 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries422 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries427 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries431 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_name_in_csv_property_names456 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_csv_property_names459 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_csv_property_names461 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24_in_requires477 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_csv_property_names_in_requires479 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_requires481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optional_marker495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_additional_marker512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_enum_values529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_default_value546 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_default_value548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range562 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range564 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range566 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range568 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range578 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range580 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range582 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range592 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range594 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range596 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_perl_regex625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_jsonObject1209 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_jsonObject1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_jsonObject1219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject1221 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_jsonObject1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember1240 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_jsonMember1242 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList1261 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonMemberList1264 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1285 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1295 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonElementList_in_jsonArray1297 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonValue_in_jsonElementList1316 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonElementList1319 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonElementList1321 = new BitSet(new long[]{0x0000000000200002L});

}