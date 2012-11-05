// $ANTLR 3.4 Orderly.g 2012-11-04 23:42:57

package net.guax.jorderly.parser;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import java.util.HashMap;
import net.guax.jorderly.json.*;
import java.math.BigDecimal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OrderlyParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIGIT", "EXP", "EscapeSequence", "FALSE", "FRAC", "HexDigit", "IDENTIFIER", "INT", "NULL", "NUMBER", "REGEX", "STRING", "TRUE", "UnicodeEscape", "WS", "'*'", "','", "':'", "';'", "'<'", "'='", "'>'", "'?'", "'['", "']'", "'any'", "'array'", "'boolean'", "'in'", "'integer'", "'number'", "'object'", "'string'", "'union'", "'{'", "'}'"
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



    // $ANTLR start "orderly_schema"
    // Orderly.g:27:1: orderly_schema returns [JsonProperty rootProperty] : unnamed_entry ( ';' )? ;
    public final JsonProperty orderly_schema() throws RecognitionException {
        JsonProperty rootProperty = null;


        JsonProperty unnamed_entry1 =null;


        try {
            // Orderly.g:28:5: ( unnamed_entry ( ';' )? )
            // Orderly.g:28:7: unnamed_entry ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_orderly_schema57);
            unnamed_entry1=unnamed_entry();

            state._fsp--;


            // Orderly.g:28:21: ( ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Orderly.g:28:21: ';'
                    {
                    match(input,23,FOLLOW_23_in_orderly_schema59); 

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



    // $ANTLR start "unnamed_entry"
    // Orderly.g:31:1: unnamed_entry returns [JsonProperty property] : ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix );
    public final JsonProperty unnamed_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix2 =null;

        Range range3 =null;


        try {
            // Orderly.g:32:5: ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NULL||(LA4_0 >= 30 && LA4_0 <= 32)||(LA4_0 >= 34 && LA4_0 <= 36)||LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==37) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // Orderly.g:32:7: definition_prefix definition_suffix
                    {
                    pushFollow(FOLLOW_definition_prefix_in_unnamed_entry87);
                    definition_prefix2=definition_prefix();

                    state._fsp--;


                     property = definition_prefix2; 

                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry91);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Orderly.g:33:7: 'string' ( range )? (regex= perl_regex )? definition_suffix
                    {
                    match(input,37,FOLLOW_37_in_unnamed_entry99); 

                     property = new JsonString(); 

                    // Orderly.g:33:50: ( range )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==39) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Orderly.g:33:50: range
                            {
                            pushFollow(FOLLOW_range_in_unnamed_entry103);
                            range3=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRange(range3);

                    // Orderly.g:33:121: (regex= perl_regex )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==REGEX) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Orderly.g:33:121: regex= perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_unnamed_entry110);
                            regex=perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRegExp(regex);

                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry115);
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
    // Orderly.g:36:1: definition_suffix : ( optional_marker )? ( enum_values )? ( default_value )? ;
    public final void definition_suffix() throws RecognitionException {
        try {
            // Orderly.g:37:5: ( ( optional_marker )? ( enum_values )? ( default_value )? )
            // Orderly.g:37:7: ( optional_marker )? ( enum_values )? ( default_value )?
            {
            // Orderly.g:37:7: ( optional_marker )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Orderly.g:37:7: optional_marker
                    {
                    pushFollow(FOLLOW_optional_marker_in_definition_suffix132);
                    optional_marker();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:37:24: ( enum_values )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Orderly.g:37:24: enum_values
                    {
                    pushFollow(FOLLOW_enum_values_in_definition_suffix135);
                    enum_values();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:37:37: ( default_value )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Orderly.g:37:37: default_value
                    {
                    pushFollow(FOLLOW_default_value_in_definition_suffix138);
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
    // Orderly.g:40:1: definition_prefix returns [JsonProperty property] : ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' );
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
            // Orderly.g:43:5: ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt16=1;
                }
                break;
            case 35:
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

                if ( (LA16_6==39) ) {
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
            case 36:
                {
                alt16=8;
                }
                break;
            case 38:
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
                    // Orderly.g:43:7: 'integer' ( range )?
                    {
                    match(input,34,FOLLOW_34_in_definition_prefix171); 

                     property = new JsonInteger(); 

                    // Orderly.g:43:52: ( range )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==39) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Orderly.g:43:52: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix175);
                            range4=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonInteger.class.cast(property).setRange(range4);

                    }
                    break;
                case 2 :
                    // Orderly.g:44:7: 'number' ( range )?
                    {
                    match(input,35,FOLLOW_35_in_definition_prefix186); 

                     property = new JsonNumber(); 

                    // Orderly.g:44:50: ( range )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==39) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Orderly.g:44:50: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix190);
                            range5=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonNumber.class.cast(property).setRange(range5);

                    }
                    break;
                case 3 :
                    // Orderly.g:45:7: 'boolean'
                    {
                    match(input,32,FOLLOW_32_in_definition_prefix201); 

                     property = new JsonBoolean(); 

                    }
                    break;
                case 4 :
                    // Orderly.g:46:7: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_definition_prefix211); 

                     property = new JsonNull(); 

                    }
                    break;
                case 5 :
                    // Orderly.g:47:7: 'any'
                    {
                    match(input,30,FOLLOW_30_in_definition_prefix221); 

                     property = new JsonAny(); 

                    }
                    break;
                case 6 :
                    // Orderly.g:49:7: 'array' '{' ( unnamed_entries )? '}' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix236); 

                     property = new JsonArray(); 

                    match(input,39,FOLLOW_39_in_definition_prefix241); 

                    // Orderly.g:49:53: ( unnamed_entries )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NULL||(LA10_0 >= 30 && LA10_0 <= 32)||(LA10_0 >= 34 && LA10_0 <= 38)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Orderly.g:49:53: unnamed_entries
                            {
                            pushFollow(FOLLOW_unnamed_entries_in_definition_prefix243);
                            unnamed_entries6=unnamed_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setProperties(unnamed_entries6);

                    match(input,40,FOLLOW_40_in_definition_prefix248); 

                    // Orderly.g:49:152: ( range )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==39) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Orderly.g:49:152: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix250);
                            range7=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setRange(range7);

                    }
                    break;
                case 7 :
                    // Orderly.g:51:7: 'array' '[' (un= unnamed_entry )? ']' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix266); 

                     property = new JsonArray(); 

                    match(input,28,FOLLOW_28_in_definition_prefix270); 

                    // Orderly.g:51:52: (un= unnamed_entry )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==NULL||(LA12_0 >= 30 && LA12_0 <= 32)||(LA12_0 >= 34 && LA12_0 <= 38)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Orderly.g:51:53: un= unnamed_entry
                            {
                             HashMap propertyMap = new HashMap<String, JsonProperty>(); 

                            pushFollow(FOLLOW_unnamed_entry_in_definition_prefix277);
                            un=unnamed_entry();

                            state._fsp--;


                            propertyMap.put(un.getClass().getName(),un); JsonArray.class.cast(property).setProperties(propertyMap); 

                            }
                            break;

                    }


                    match(input,29,FOLLOW_29_in_definition_prefix283); 

                    // Orderly.g:51:267: ( range )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==39) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Orderly.g:51:267: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix285);
                            range8=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setRange(range8);

                    }
                    break;
                case 8 :
                    // Orderly.g:52:7: 'object' '{' ( named_entries )? '}' ( additional_marker )?
                    {
                    match(input,36,FOLLOW_36_in_definition_prefix296); 

                     property = new JsonObject(); 

                    match(input,39,FOLLOW_39_in_definition_prefix300); 

                    // Orderly.g:52:54: ( named_entries )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==NULL||(LA14_0 >= 30 && LA14_0 <= 32)||(LA14_0 >= 34 && LA14_0 <= 38)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Orderly.g:52:54: named_entries
                            {
                            pushFollow(FOLLOW_named_entries_in_definition_prefix302);
                            named_entries9=named_entries();

                            state._fsp--;


                            }
                            break;

                    }


                     JsonObject.class.cast(property).setProperties(named_entries9); 

                    match(input,40,FOLLOW_40_in_definition_prefix307); 

                    // Orderly.g:52:152: ( additional_marker )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==20) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Orderly.g:52:153: additional_marker
                            {
                            pushFollow(FOLLOW_additional_marker_in_definition_prefix310);
                            additional_marker();

                            state._fsp--;


                             JsonObject.class.cast(property).setAllowAdditionalProperties(true); 

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // Orderly.g:53:7: 'union' '{' unnamed_entry ';' unnamed_entries '}'
                    {
                    match(input,38,FOLLOW_38_in_definition_prefix322); 

                     property = new JsonUnion(); 

                    match(input,39,FOLLOW_39_in_definition_prefix327); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix329);
                    unnamed_entry();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_definition_prefix331); 

                    pushFollow(FOLLOW_unnamed_entries_in_definition_prefix333);
                    unnamed_entries();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_definition_prefix335); 

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
    // Orderly.g:56:1: named_entry returns [JsonProperty property] : ( definition_prefix property_name definition_suffix ( requires )? | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )? );
    public final JsonProperty named_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix10 =null;

        OrderlyParser.property_name_return property_name11 =null;

        Range range12 =null;

        OrderlyParser.property_name_return property_name13 =null;


        try {
            // Orderly.g:57:5: ( definition_prefix property_name definition_suffix ( requires )? | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NULL||(LA21_0 >= 30 && LA21_0 <= 32)||(LA21_0 >= 34 && LA21_0 <= 36)||LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==37) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // Orderly.g:57:7: definition_prefix property_name definition_suffix ( requires )?
                    {
                    pushFollow(FOLLOW_definition_prefix_in_named_entry357);
                    definition_prefix10=definition_prefix();

                    state._fsp--;


                     property = definition_prefix10; 

                    pushFollow(FOLLOW_property_name_in_named_entry361);
                    property_name11=property_name();

                    state._fsp--;


                     property.setName(JsonString.trimQuotes((property_name11!=null?input.toString(property_name11.start,property_name11.stop):null))); 

                    pushFollow(FOLLOW_definition_suffix_in_named_entry365);
                    definition_suffix();

                    state._fsp--;


                    // Orderly.g:57:169: ( requires )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Orderly.g:57:169: requires
                            {
                            pushFollow(FOLLOW_requires_in_named_entry367);
                            requires();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Orderly.g:58:7: 'string' ( range )? property_name (regex= perl_regex )? definition_suffix ( requires )?
                    {
                    match(input,37,FOLLOW_37_in_named_entry376); 

                     property = new JsonString(); 

                    // Orderly.g:58:50: ( range )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==39) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Orderly.g:58:50: range
                            {
                            pushFollow(FOLLOW_range_in_named_entry380);
                            range12=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRange(range12);

                    pushFollow(FOLLOW_property_name_in_named_entry385);
                    property_name13=property_name();

                    state._fsp--;


                    property.setName(JsonString.trimQuotes((property_name13!=null?input.toString(property_name13.start,property_name13.stop):null)));

                    // Orderly.g:58:200: (regex= perl_regex )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==REGEX) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Orderly.g:58:200: regex= perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_named_entry391);
                            regex=perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRegExp(regex);

                    pushFollow(FOLLOW_definition_suffix_in_named_entry396);
                    definition_suffix();

                    state._fsp--;


                    // Orderly.g:58:291: ( requires )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==24) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // Orderly.g:58:291: requires
                            {
                            pushFollow(FOLLOW_requires_in_named_entry398);
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
    // Orderly.g:61:1: named_entries returns [HashMap<String, JsonProperty> properties] : n1= named_entry ( ';' n2= named_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> named_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty n1 =null;

        JsonProperty n2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:63:5: (n1= named_entry ( ';' n2= named_entry )* ( ';' )? )
            // Orderly.g:63:7: n1= named_entry ( ';' n2= named_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_named_entry_in_named_entries428);
            n1=named_entry();

            state._fsp--;


            properties.put(n1.getName(),n1);

            // Orderly.g:63:78: ( ';' n2= named_entry )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==NULL||(LA22_1 >= 30 && LA22_1 <= 32)||(LA22_1 >= 34 && LA22_1 <= 38)) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // Orderly.g:63:79: ';' n2= named_entry
            	    {
            	    match(input,23,FOLLOW_23_in_named_entries433); 

            	    pushFollow(FOLLOW_named_entry_in_named_entries437);
            	    n2=named_entry();

            	    state._fsp--;


            	    properties.put(n2.getName(),n2);

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // Orderly.g:63:155: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Orderly.g:63:155: ';'
                    {
                    match(input,23,FOLLOW_23_in_named_entries442); 

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
    // Orderly.g:66:1: unnamed_entries returns [HashMap<String, JsonProperty> properties] : un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> unnamed_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty un1 =null;

        JsonProperty un2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:68:5: (un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? )
            // Orderly.g:68:7: un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries472);
            un1=unnamed_entry();

            state._fsp--;


            properties.put(un1.getClass().getName(),un1);

            // Orderly.g:68:94: ( ';' un2= unnamed_entry )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==NULL||(LA24_1 >= 30 && LA24_1 <= 32)||(LA24_1 >= 34 && LA24_1 <= 38)) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // Orderly.g:68:95: ';' un2= unnamed_entry
            	    {
            	    match(input,23,FOLLOW_23_in_unnamed_entries477); 

            	    pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries481);
            	    un2=unnamed_entry();

            	    state._fsp--;


            	    properties.put(un2.getClass().getName(), un2);

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // Orderly.g:68:190: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Orderly.g:68:190: ';'
                    {
                    match(input,23,FOLLOW_23_in_unnamed_entries488); 

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
    // Orderly.g:71:1: require_conditional : ( '=' (number= NUMBER |string= STRING ) | 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']' |);
    public final void require_conditional() throws RecognitionException {
        Token number=null;
        Token string=null;


                ArrayList requires = new ArrayList<JsonProperty>();
                // optionality is redundant with requires
                this.currentProperty.setOptional(false);
            
        try {
            // Orderly.g:80:5: ( '=' (number= NUMBER |string= STRING ) | 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']' |)
            int alt30=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt30=1;
                }
                break;
            case 33:
                {
                alt30=2;
                }
                break;
            case 21:
            case 26:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // Orderly.g:80:7: '=' (number= NUMBER |string= STRING )
                    {
                    match(input,25,FOLLOW_25_in_require_conditional524); 

                    // Orderly.g:80:11: (number= NUMBER |string= STRING )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==NUMBER) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==STRING) ) {
                        alt26=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;

                    }
                    switch (alt26) {
                        case 1 :
                            // Orderly.g:80:13: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional530); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:80:80: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional538); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Orderly.g:81:7: 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']'
                    {
                    match(input,33,FOLLOW_33_in_require_conditional550); 

                    match(input,28,FOLLOW_28_in_require_conditional552); 

                    // Orderly.g:81:16: (number= NUMBER |string= STRING )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==NUMBER) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==STRING) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;

                    }
                    switch (alt27) {
                        case 1 :
                            // Orderly.g:81:18: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional558); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:81:85: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional566); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                    // Orderly.g:81:152: ( ',' (number= NUMBER |string= STRING ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // Orderly.g:81:153: ',' (number= NUMBER |string= STRING )
                    	    {
                    	    match(input,21,FOLLOW_21_in_require_conditional573); 

                    	    // Orderly.g:81:157: (number= NUMBER |string= STRING )
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
                    	            // Orderly.g:81:159: number= NUMBER
                    	            {
                    	            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional579); 

                    	            requires.add(new JsonNumber(number.getText()));

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Orderly.g:81:226: string= STRING
                    	            {
                    	            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional587); 

                    	            requires.add(new JsonString(string.getText()));

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_require_conditional595); 

                    }
                    break;
                case 3 :
                    // Orderly.g:82:7: 
                    {
                    this.currentProperty.addRequires(this.currentRequire);

                    }
                    break;

            }

                    this.currentProperty.addRequires(this.currentRequire, requires);
                
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
    // Orderly.g:85:1: require_property : property_name require_conditional ;
    public final void require_property() throws RecognitionException {
        OrderlyParser.property_name_return property_name14 =null;


        try {
            // Orderly.g:86:5: ( property_name require_conditional )
            // Orderly.g:86:7: property_name require_conditional
            {
            pushFollow(FOLLOW_property_name_in_require_property620);
            property_name14=property_name();

            state._fsp--;


            this.currentRequire = JsonString.trimQuotes((property_name14!=null?input.toString(property_name14.start,property_name14.stop):null));

            pushFollow(FOLLOW_require_conditional_in_require_property624);
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
    // Orderly.g:89:1: requires : '<' require_property ( ',' require_property )* '>' ;
    public final void requires() throws RecognitionException {
        try {
            // Orderly.g:90:5: ( '<' require_property ( ',' require_property )* '>' )
            // Orderly.g:90:7: '<' require_property ( ',' require_property )* '>'
            {
            match(input,24,FOLLOW_24_in_requires641); 

            pushFollow(FOLLOW_require_property_in_requires643);
            require_property();

            state._fsp--;


            // Orderly.g:90:28: ( ',' require_property )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==21) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Orderly.g:90:29: ',' require_property
            	    {
            	    match(input,21,FOLLOW_21_in_requires646); 

            	    pushFollow(FOLLOW_require_property_in_requires648);
            	    require_property();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            match(input,26,FOLLOW_26_in_requires652); 

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
    // Orderly.g:93:1: optional_marker : '?' ;
    public final void optional_marker() throws RecognitionException {
        try {
            // Orderly.g:94:5: ( '?' )
            // Orderly.g:94:7: '?'
            {
            match(input,27,FOLLOW_27_in_optional_marker666); 

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
    // Orderly.g:97:1: additional_marker : '*' ;
    public final void additional_marker() throws RecognitionException {
        try {
            // Orderly.g:98:5: ( '*' )
            // Orderly.g:98:7: '*'
            {
            match(input,20,FOLLOW_20_in_additional_marker685); 

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
    // Orderly.g:101:1: enum_values : jsonArray ;
    public final void enum_values() throws RecognitionException {
        try {
            // Orderly.g:102:5: ( jsonArray )
            // Orderly.g:102:7: jsonArray
            {
            pushFollow(FOLLOW_jsonArray_in_enum_values702);
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
    // Orderly.g:105:1: default_value : '=' jsonValue ;
    public final void default_value() throws RecognitionException {
        try {
            // Orderly.g:106:5: ( '=' jsonValue )
            // Orderly.g:106:7: '=' jsonValue
            {
            match(input,25,FOLLOW_25_in_default_value719); 

            pushFollow(FOLLOW_jsonValue_in_default_value721);
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
    // Orderly.g:109:1: range returns [Range range] : ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' );
    public final Range range() throws RecognitionException {
        Range range = null;


        Token lower=null;
        Token upper=null;

        range = new Range(); BigDecimal lowerBound; BigDecimal upperBound;
        try {
            // Orderly.g:111:5: ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==39) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==NUMBER) ) {
                    int LA32_2 = input.LA(3);

                    if ( (LA32_2==21) ) {
                        int LA32_4 = input.LA(4);

                        if ( (LA32_4==NUMBER) ) {
                            alt32=1;
                        }
                        else if ( (LA32_4==40) ) {
                            alt32=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 32, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA32_1==21) ) {
                    alt32=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Orderly.g:111:7: '{' lower= NUMBER ',' upper= NUMBER '}'
                    {
                    match(input,39,FOLLOW_39_in_range750); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range754); 

                    match(input,21,FOLLOW_21_in_range756); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range760); 

                    match(input,40,FOLLOW_40_in_range762); 

                    range.lowerBound = new BigDecimal(lower.getText()); range.upperBound = new BigDecimal(upper.getText());

                    }
                    break;
                case 2 :
                    // Orderly.g:112:7: '{' lower= NUMBER ',' '}'
                    {
                    match(input,39,FOLLOW_39_in_range772); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range776); 

                    match(input,21,FOLLOW_21_in_range778); 

                    match(input,40,FOLLOW_40_in_range780); 

                    range.lowerBound = new BigDecimal(lower.getText());

                    }
                    break;
                case 3 :
                    // Orderly.g:113:7: '{' ',' upper= NUMBER '}'
                    {
                    match(input,39,FOLLOW_39_in_range790); 

                    match(input,21,FOLLOW_21_in_range792); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range796); 

                    match(input,40,FOLLOW_40_in_range798); 

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
    // Orderly.g:116:1: property_name : ( IDENTIFIER | STRING );
    public final OrderlyParser.property_name_return property_name() throws RecognitionException {
        OrderlyParser.property_name_return retval = new OrderlyParser.property_name_return();
        retval.start = input.LT(1);


        try {
            // Orderly.g:117:2: ( IDENTIFIER | STRING )
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
    // Orderly.g:121:1: perl_regex returns [RegularExpression regex] : exp= REGEX ;
    public final RegularExpression perl_regex() throws RecognitionException {
        RegularExpression regex = null;


        Token exp=null;

        try {
            // Orderly.g:122:2: (exp= REGEX )
            // Orderly.g:122:4: exp= REGEX
            {
            exp=(Token)match(input,REGEX,FOLLOW_REGEX_in_perl_regex833); 

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
    // Orderly.g:186:1: jsonValue : ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray );
    public final void jsonValue() throws RecognitionException {
        try {
            // Orderly.g:187:5: ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray )
            int alt33=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt33=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt33=2;
                }
                break;
            case STRING:
                {
                alt33=3;
                }
                break;
            case NUMBER:
                {
                alt33=4;
                }
                break;
            case 39:
                {
                alt33=5;
                }
                break;
            case 28:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // Orderly.g:187:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_jsonValue1333); 

                    }
                    break;
                case 2 :
                    // Orderly.g:188:7: jsonBooleanLiteral
                    {
                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue1341);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Orderly.g:189:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_jsonValue1349); 

                    }
                    break;
                case 4 :
                    // Orderly.g:190:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue1357); 

                    }
                    break;
                case 5 :
                    // Orderly.g:191:7: jsonObject
                    {
                    pushFollow(FOLLOW_jsonObject_in_jsonValue1365);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Orderly.g:192:7: jsonArray
                    {
                    pushFollow(FOLLOW_jsonArray_in_jsonValue1373);
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
    // Orderly.g:195:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // Orderly.g:196:5: ( TRUE | FALSE )
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
    // Orderly.g:200:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // Orderly.g:201:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==40) ) {
                    alt34=1;
                }
                else if ( (LA34_1==STRING) ) {
                    alt34=2;
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
                    // Orderly.g:201:7: '{' '}'
                    {
                    match(input,39,FOLLOW_39_in_jsonObject1419); 

                    match(input,40,FOLLOW_40_in_jsonObject1421); 

                    }
                    break;
                case 2 :
                    // Orderly.g:202:7: '{' jsonMemberList '}'
                    {
                    match(input,39,FOLLOW_39_in_jsonObject1429); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject1431);
                    jsonMemberList();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_jsonObject1433); 

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
    // Orderly.g:205:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // Orderly.g:206:5: ( STRING ':' jsonValue )
            // Orderly.g:206:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember1450); 

            match(input,22,FOLLOW_22_in_jsonMember1452); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember1454);
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
    // Orderly.g:209:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // Orderly.g:210:5: ( jsonMember ( ',' jsonMemberList )? )
            // Orderly.g:210:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList1471);
            jsonMember();

            state._fsp--;


            // Orderly.g:210:18: ( ',' jsonMemberList )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Orderly.g:210:19: ',' jsonMemberList
                    {
                    match(input,21,FOLLOW_21_in_jsonMemberList1474); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList1476);
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
    // Orderly.g:213:1: jsonArray : ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // Orderly.g:214:5: ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==29) ) {
                    alt37=1;
                }
                else if ( (LA37_1==FALSE||(LA37_1 >= NULL && LA37_1 <= NUMBER)||(LA37_1 >= STRING && LA37_1 <= TRUE)||LA37_1==28||LA37_1==39) ) {
                    alt37=2;
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
                    // Orderly.g:214:7: '[' ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1495); 

                    match(input,29,FOLLOW_29_in_jsonArray1497); 

                    }
                    break;
                case 2 :
                    // Orderly.g:215:7: '[' jsonValue ( ',' jsonValue )* ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1505); 

                    pushFollow(FOLLOW_jsonValue_in_jsonArray1507);
                    jsonValue();

                    state._fsp--;


                    // Orderly.g:215:21: ( ',' jsonValue )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==21) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Orderly.g:215:22: ',' jsonValue
                    	    {
                    	    match(input,21,FOLLOW_21_in_jsonArray1510); 

                    	    pushFollow(FOLLOW_jsonValue_in_jsonArray1512);
                    	    jsonValue();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_jsonArray1516); 

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


 

    public static final BitSet FOLLOW_unnamed_entry_in_orderly_schema57 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_orderly_schema59 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_unnamed_entry87 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_unnamed_entry99 = new BitSet(new long[]{0x000000801A008000L});
    public static final BitSet FOLLOW_range_in_unnamed_entry103 = new BitSet(new long[]{0x000000001A008000L});
    public static final BitSet FOLLOW_perl_regex_in_unnamed_entry110 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optional_marker_in_definition_suffix132 = new BitSet(new long[]{0x0000000012000002L});
    public static final BitSet FOLLOW_enum_values_in_definition_suffix135 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_default_value_in_definition_suffix138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_definition_prefix171 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_definition_prefix186 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_definition_prefix201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_definition_prefix211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definition_prefix221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix236 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix241 = new BitSet(new long[]{0x0000017DC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix243 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_definition_prefix248 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix266 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definition_prefix270 = new BitSet(new long[]{0x0000007DE0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix277 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition_prefix283 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_definition_prefix296 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix300 = new BitSet(new long[]{0x0000017DC0002000L});
    public static final BitSet FOLLOW_named_entries_in_definition_prefix302 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_definition_prefix307 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_definition_prefix322 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix327 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix329 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_definition_prefix331 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix333 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_definition_prefix335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_named_entry357 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry361 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry365 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_named_entry367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_named_entry376 = new BitSet(new long[]{0x0000008000010800L});
    public static final BitSet FOLLOW_range_in_named_entry380 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry385 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_named_entry391 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry396 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_named_entry398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_entry_in_named_entries428 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries433 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_named_entry_in_named_entries437 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries472 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries477 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries481 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_require_conditional524 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_require_conditional538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_require_conditional550 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_require_conditional552 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional558 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional566 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_require_conditional573 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional579 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional587 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_require_conditional595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_name_in_require_property620 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_require_conditional_in_require_property624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_requires641 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires643 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_requires646 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires648 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_requires652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optional_marker666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_additional_marker685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_enum_values702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_default_value719 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_default_value721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_range750 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range754 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range756 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range760 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_range762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_range772 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range776 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range778 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_range780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_range790 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range792 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range796 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_range798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_perl_regex833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_jsonObject1419 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_jsonObject1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_jsonObject1429 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject1431 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_jsonObject1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember1450 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_jsonMember1452 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList1471 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonMemberList1474 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1495 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1505 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1507 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_jsonArray1510 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1512 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_jsonArray1516 = new BitSet(new long[]{0x0000000000000002L});

}