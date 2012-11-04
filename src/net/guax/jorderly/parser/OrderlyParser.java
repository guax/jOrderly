// $ANTLR 3.4 Orderly.g 2012-11-04 19:20:17

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
    // Orderly.g:36:1: definition_suffix : ( optional_marker )? ( enum_values )? ( default_value )? ( requires )? ;
    public final void definition_suffix() throws RecognitionException {
        try {
            // Orderly.g:37:5: ( ( optional_marker )? ( enum_values )? ( default_value )? ( requires )? )
            // Orderly.g:37:7: ( optional_marker )? ( enum_values )? ( default_value )? ( requires )?
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


            // Orderly.g:37:52: ( requires )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Orderly.g:37:52: requires
                    {
                    pushFollow(FOLLOW_requires_in_definition_suffix141);
                    requires();

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
            int alt17=9;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt17=1;
                }
                break;
            case 35:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            case NULL:
                {
                alt17=4;
                }
                break;
            case 30:
                {
                alt17=5;
                }
                break;
            case 31:
                {
                int LA17_6 = input.LA(2);

                if ( (LA17_6==39) ) {
                    alt17=6;
                }
                else if ( (LA17_6==28) ) {
                    alt17=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 6, input);

                    throw nvae;

                }
                }
                break;
            case 36:
                {
                alt17=8;
                }
                break;
            case 38:
                {
                alt17=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // Orderly.g:43:7: 'integer' ( range )?
                    {
                    match(input,34,FOLLOW_34_in_definition_prefix174); 

                     property = new JsonInteger(); 

                    // Orderly.g:43:52: ( range )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==39) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Orderly.g:43:52: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix178);
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
                    match(input,35,FOLLOW_35_in_definition_prefix189); 

                     property = new JsonNumber(); 

                    // Orderly.g:44:50: ( range )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==39) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Orderly.g:44:50: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix193);
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
                    match(input,32,FOLLOW_32_in_definition_prefix204); 

                     property = new JsonBoolean(); 

                    }
                    break;
                case 4 :
                    // Orderly.g:46:7: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_definition_prefix214); 

                     property = new JsonNull(); 

                    }
                    break;
                case 5 :
                    // Orderly.g:47:7: 'any'
                    {
                    match(input,30,FOLLOW_30_in_definition_prefix224); 

                     property = new JsonAny(); 

                    }
                    break;
                case 6 :
                    // Orderly.g:49:7: 'array' '{' ( unnamed_entries )? '}' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix239); 

                     property = new JsonArray(); 

                    match(input,39,FOLLOW_39_in_definition_prefix244); 

                    // Orderly.g:49:53: ( unnamed_entries )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NULL||(LA11_0 >= 30 && LA11_0 <= 32)||(LA11_0 >= 34 && LA11_0 <= 38)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Orderly.g:49:53: unnamed_entries
                            {
                            pushFollow(FOLLOW_unnamed_entries_in_definition_prefix246);
                            unnamed_entries6=unnamed_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setProperties(unnamed_entries6);

                    match(input,40,FOLLOW_40_in_definition_prefix251); 

                    // Orderly.g:49:152: ( range )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==39) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Orderly.g:49:152: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix253);
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
                    match(input,31,FOLLOW_31_in_definition_prefix269); 

                     property = new JsonArray(); 

                    match(input,28,FOLLOW_28_in_definition_prefix273); 

                    // Orderly.g:51:52: (un= unnamed_entry )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NULL||(LA13_0 >= 30 && LA13_0 <= 32)||(LA13_0 >= 34 && LA13_0 <= 38)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Orderly.g:51:53: un= unnamed_entry
                            {
                             HashMap propertyMap = new HashMap<String, JsonProperty>(); 

                            pushFollow(FOLLOW_unnamed_entry_in_definition_prefix280);
                            un=unnamed_entry();

                            state._fsp--;


                            propertyMap.put(un.getClass().getName(),un); JsonArray.class.cast(property).setProperties(propertyMap); 

                            }
                            break;

                    }


                    match(input,29,FOLLOW_29_in_definition_prefix286); 

                    // Orderly.g:51:267: ( range )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==39) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Orderly.g:51:267: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix288);
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
                    match(input,36,FOLLOW_36_in_definition_prefix299); 

                     property = new JsonObject(); 

                    match(input,39,FOLLOW_39_in_definition_prefix303); 

                    // Orderly.g:52:54: ( named_entries )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NULL||(LA15_0 >= 30 && LA15_0 <= 32)||(LA15_0 >= 34 && LA15_0 <= 38)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Orderly.g:52:54: named_entries
                            {
                            pushFollow(FOLLOW_named_entries_in_definition_prefix305);
                            named_entries9=named_entries();

                            state._fsp--;


                            }
                            break;

                    }


                     JsonObject.class.cast(property).setProperties(named_entries9); 

                    match(input,40,FOLLOW_40_in_definition_prefix310); 

                    // Orderly.g:52:152: ( additional_marker )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==20) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Orderly.g:52:153: additional_marker
                            {
                            pushFollow(FOLLOW_additional_marker_in_definition_prefix313);
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
                    match(input,38,FOLLOW_38_in_definition_prefix325); 

                     property = new JsonUnion(); 

                    match(input,39,FOLLOW_39_in_definition_prefix330); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix332);
                    unnamed_entry();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_definition_prefix334); 

                    pushFollow(FOLLOW_unnamed_entries_in_definition_prefix336);
                    unnamed_entries();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_definition_prefix338); 

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
    // Orderly.g:56:1: named_entry returns [JsonProperty property] : ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix );
    public final JsonProperty named_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix10 =null;

        OrderlyParser.property_name_return property_name11 =null;

        Range range12 =null;

        OrderlyParser.property_name_return property_name13 =null;


        try {
            // Orderly.g:57:5: ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NULL||(LA20_0 >= 30 && LA20_0 <= 32)||(LA20_0 >= 34 && LA20_0 <= 36)||LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==37) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Orderly.g:57:7: definition_prefix property_name definition_suffix
                    {
                    pushFollow(FOLLOW_definition_prefix_in_named_entry360);
                    definition_prefix10=definition_prefix();

                    state._fsp--;


                     property = definition_prefix10; 

                    pushFollow(FOLLOW_property_name_in_named_entry364);
                    property_name11=property_name();

                    state._fsp--;


                     property.setName(JsonString.trimQuotes((property_name11!=null?input.toString(property_name11.start,property_name11.stop):null))); 

                    pushFollow(FOLLOW_definition_suffix_in_named_entry368);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Orderly.g:58:7: 'string' ( range )? property_name (regex= perl_regex )? definition_suffix
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
            pushFollow(FOLLOW_named_entry_in_named_entries425);
            n1=named_entry();

            state._fsp--;


            properties.put(n1.getName(),n1);

            // Orderly.g:63:78: ( ';' n2= named_entry )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==NULL||(LA21_1 >= 30 && LA21_1 <= 32)||(LA21_1 >= 34 && LA21_1 <= 38)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // Orderly.g:63:79: ';' n2= named_entry
            	    {
            	    match(input,23,FOLLOW_23_in_named_entries430); 

            	    pushFollow(FOLLOW_named_entry_in_named_entries434);
            	    n2=named_entry();

            	    state._fsp--;


            	    properties.put(n2.getName(),n2);

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // Orderly.g:63:155: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Orderly.g:63:155: ';'
                    {
                    match(input,23,FOLLOW_23_in_named_entries439); 

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
            pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries469);
            un1=unnamed_entry();

            state._fsp--;


            properties.put(un1.getClass().getName(),un1);

            // Orderly.g:68:94: ( ';' un2= unnamed_entry )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==NULL||(LA23_1 >= 30 && LA23_1 <= 32)||(LA23_1 >= 34 && LA23_1 <= 38)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // Orderly.g:68:95: ';' un2= unnamed_entry
            	    {
            	    match(input,23,FOLLOW_23_in_unnamed_entries474); 

            	    pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries478);
            	    un2=unnamed_entry();

            	    state._fsp--;


            	    properties.put(un2.getClass().getName(), un2);

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // Orderly.g:68:190: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Orderly.g:68:190: ';'
                    {
                    match(input,23,FOLLOW_23_in_unnamed_entries485); 

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
            
        try {
            // Orderly.g:78:5: ( '=' (number= NUMBER |string= STRING ) | 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']' |)
            int alt29=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt29=1;
                }
                break;
            case 33:
                {
                alt29=2;
                }
                break;
            case 21:
            case 26:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // Orderly.g:78:7: '=' (number= NUMBER |string= STRING )
                    {
                    match(input,25,FOLLOW_25_in_require_conditional521); 

                    // Orderly.g:78:11: (number= NUMBER |string= STRING )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==NUMBER) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==STRING) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;

                    }
                    switch (alt25) {
                        case 1 :
                            // Orderly.g:78:13: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional527); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:78:80: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional535); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Orderly.g:79:7: 'in' '[' (number= NUMBER |string= STRING ) ( ',' (number= NUMBER |string= STRING ) )* ']'
                    {
                    match(input,33,FOLLOW_33_in_require_conditional547); 

                    match(input,28,FOLLOW_28_in_require_conditional549); 

                    // Orderly.g:79:16: (number= NUMBER |string= STRING )
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
                            // Orderly.g:79:18: number= NUMBER
                            {
                            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional555); 

                            requires.add(new JsonNumber(number.getText()));

                            }
                            break;
                        case 2 :
                            // Orderly.g:79:85: string= STRING
                            {
                            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional563); 

                            requires.add(new JsonString(string.getText()));

                            }
                            break;

                    }


                    // Orderly.g:79:152: ( ',' (number= NUMBER |string= STRING ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==21) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // Orderly.g:79:153: ',' (number= NUMBER |string= STRING )
                    	    {
                    	    match(input,21,FOLLOW_21_in_require_conditional570); 

                    	    // Orderly.g:79:157: (number= NUMBER |string= STRING )
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
                    	            // Orderly.g:79:159: number= NUMBER
                    	            {
                    	            number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_require_conditional576); 

                    	            requires.add(new JsonNumber(number.getText()));

                    	            }
                    	            break;
                    	        case 2 :
                    	            // Orderly.g:79:226: string= STRING
                    	            {
                    	            string=(Token)match(input,STRING,FOLLOW_STRING_in_require_conditional584); 

                    	            requires.add(new JsonString(string.getText()));

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_require_conditional592); 

                    }
                    break;
                case 3 :
                    // Orderly.g:80:7: 
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
    // Orderly.g:83:1: require_property : property_name require_conditional ;
    public final void require_property() throws RecognitionException {
        OrderlyParser.property_name_return property_name14 =null;


        try {
            // Orderly.g:84:5: ( property_name require_conditional )
            // Orderly.g:84:7: property_name require_conditional
            {
            pushFollow(FOLLOW_property_name_in_require_property617);
            property_name14=property_name();

            state._fsp--;


            this.currentRequire = JsonString.trimQuotes((property_name14!=null?input.toString(property_name14.start,property_name14.stop):null));

            pushFollow(FOLLOW_require_conditional_in_require_property621);
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
    // Orderly.g:87:1: requires : '<' require_property ( ',' require_property )* '>' ;
    public final void requires() throws RecognitionException {
        try {
            // Orderly.g:88:5: ( '<' require_property ( ',' require_property )* '>' )
            // Orderly.g:88:7: '<' require_property ( ',' require_property )* '>'
            {
            match(input,24,FOLLOW_24_in_requires638); 

            pushFollow(FOLLOW_require_property_in_requires640);
            require_property();

            state._fsp--;


            // Orderly.g:88:28: ( ',' require_property )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==21) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Orderly.g:88:29: ',' require_property
            	    {
            	    match(input,21,FOLLOW_21_in_requires643); 

            	    pushFollow(FOLLOW_require_property_in_requires645);
            	    require_property();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            match(input,26,FOLLOW_26_in_requires649); 

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
    // Orderly.g:91:1: optional_marker : '?' ;
    public final void optional_marker() throws RecognitionException {
        try {
            // Orderly.g:92:5: ( '?' )
            // Orderly.g:92:7: '?'
            {
            match(input,27,FOLLOW_27_in_optional_marker663); 

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
    // Orderly.g:95:1: additional_marker : '*' ;
    public final void additional_marker() throws RecognitionException {
        try {
            // Orderly.g:96:5: ( '*' )
            // Orderly.g:96:7: '*'
            {
            match(input,20,FOLLOW_20_in_additional_marker682); 

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
    // Orderly.g:99:1: enum_values : jsonArray ;
    public final void enum_values() throws RecognitionException {
        try {
            // Orderly.g:100:5: ( jsonArray )
            // Orderly.g:100:7: jsonArray
            {
            pushFollow(FOLLOW_jsonArray_in_enum_values699);
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
    // Orderly.g:103:1: default_value : '=' jsonValue ;
    public final void default_value() throws RecognitionException {
        try {
            // Orderly.g:104:5: ( '=' jsonValue )
            // Orderly.g:104:7: '=' jsonValue
            {
            match(input,25,FOLLOW_25_in_default_value716); 

            pushFollow(FOLLOW_jsonValue_in_default_value718);
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
    // Orderly.g:107:1: range returns [Range range] : ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' );
    public final Range range() throws RecognitionException {
        Range range = null;


        Token lower=null;
        Token upper=null;

        range = new Range(); BigDecimal lowerBound; BigDecimal upperBound;
        try {
            // Orderly.g:109:5: ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==NUMBER) ) {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==21) ) {
                        int LA31_4 = input.LA(4);

                        if ( (LA31_4==NUMBER) ) {
                            alt31=1;
                        }
                        else if ( (LA31_4==40) ) {
                            alt31=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA31_1==21) ) {
                    alt31=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // Orderly.g:109:7: '{' lower= NUMBER ',' upper= NUMBER '}'
                    {
                    match(input,39,FOLLOW_39_in_range747); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range751); 

                    match(input,21,FOLLOW_21_in_range753); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range757); 

                    match(input,40,FOLLOW_40_in_range759); 

                    range.lowerBound = new BigDecimal(lower.getText()); range.upperBound = new BigDecimal(upper.getText());

                    }
                    break;
                case 2 :
                    // Orderly.g:110:7: '{' lower= NUMBER ',' '}'
                    {
                    match(input,39,FOLLOW_39_in_range769); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range773); 

                    match(input,21,FOLLOW_21_in_range775); 

                    match(input,40,FOLLOW_40_in_range777); 

                    range.lowerBound = new BigDecimal(lower.getText());

                    }
                    break;
                case 3 :
                    // Orderly.g:111:7: '{' ',' upper= NUMBER '}'
                    {
                    match(input,39,FOLLOW_39_in_range787); 

                    match(input,21,FOLLOW_21_in_range789); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range793); 

                    match(input,40,FOLLOW_40_in_range795); 

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
    // Orderly.g:114:1: property_name : ( IDENTIFIER | STRING );
    public final OrderlyParser.property_name_return property_name() throws RecognitionException {
        OrderlyParser.property_name_return retval = new OrderlyParser.property_name_return();
        retval.start = input.LT(1);


        try {
            // Orderly.g:115:2: ( IDENTIFIER | STRING )
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
    // Orderly.g:119:1: perl_regex returns [RegularExpression regex] : exp= REGEX ;
    public final RegularExpression perl_regex() throws RecognitionException {
        RegularExpression regex = null;


        Token exp=null;

        try {
            // Orderly.g:120:2: (exp= REGEX )
            // Orderly.g:120:4: exp= REGEX
            {
            exp=(Token)match(input,REGEX,FOLLOW_REGEX_in_perl_regex830); 

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
    // Orderly.g:184:1: jsonValue : ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray );
    public final void jsonValue() throws RecognitionException {
        try {
            // Orderly.g:185:5: ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray )
            int alt32=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt32=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt32=2;
                }
                break;
            case STRING:
                {
                alt32=3;
                }
                break;
            case NUMBER:
                {
                alt32=4;
                }
                break;
            case 39:
                {
                alt32=5;
                }
                break;
            case 28:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }

            switch (alt32) {
                case 1 :
                    // Orderly.g:185:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_jsonValue1330); 

                    }
                    break;
                case 2 :
                    // Orderly.g:186:7: jsonBooleanLiteral
                    {
                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue1338);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Orderly.g:187:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_jsonValue1346); 

                    }
                    break;
                case 4 :
                    // Orderly.g:188:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue1354); 

                    }
                    break;
                case 5 :
                    // Orderly.g:189:7: jsonObject
                    {
                    pushFollow(FOLLOW_jsonObject_in_jsonValue1362);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Orderly.g:190:7: jsonArray
                    {
                    pushFollow(FOLLOW_jsonArray_in_jsonValue1370);
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
    // Orderly.g:193:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // Orderly.g:194:5: ( TRUE | FALSE )
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
    // Orderly.g:198:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // Orderly.g:199:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==40) ) {
                    alt33=1;
                }
                else if ( (LA33_1==STRING) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // Orderly.g:199:7: '{' '}'
                    {
                    match(input,39,FOLLOW_39_in_jsonObject1416); 

                    match(input,40,FOLLOW_40_in_jsonObject1418); 

                    }
                    break;
                case 2 :
                    // Orderly.g:200:7: '{' jsonMemberList '}'
                    {
                    match(input,39,FOLLOW_39_in_jsonObject1426); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject1428);
                    jsonMemberList();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_jsonObject1430); 

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
    // Orderly.g:203:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // Orderly.g:204:5: ( STRING ':' jsonValue )
            // Orderly.g:204:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember1447); 

            match(input,22,FOLLOW_22_in_jsonMember1449); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember1451);
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
    // Orderly.g:207:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // Orderly.g:208:5: ( jsonMember ( ',' jsonMemberList )? )
            // Orderly.g:208:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList1468);
            jsonMember();

            state._fsp--;


            // Orderly.g:208:18: ( ',' jsonMemberList )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Orderly.g:208:19: ',' jsonMemberList
                    {
                    match(input,21,FOLLOW_21_in_jsonMemberList1471); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList1473);
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
    // Orderly.g:211:1: jsonArray : ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // Orderly.g:212:5: ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==29) ) {
                    alt36=1;
                }
                else if ( (LA36_1==FALSE||(LA36_1 >= NULL && LA36_1 <= NUMBER)||(LA36_1 >= STRING && LA36_1 <= TRUE)||LA36_1==28||LA36_1==39) ) {
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
                    // Orderly.g:212:7: '[' ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1492); 

                    match(input,29,FOLLOW_29_in_jsonArray1494); 

                    }
                    break;
                case 2 :
                    // Orderly.g:213:7: '[' jsonValue ( ',' jsonValue )* ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1502); 

                    pushFollow(FOLLOW_jsonValue_in_jsonArray1504);
                    jsonValue();

                    state._fsp--;


                    // Orderly.g:213:21: ( ',' jsonValue )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==21) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // Orderly.g:213:22: ',' jsonValue
                    	    {
                    	    match(input,21,FOLLOW_21_in_jsonArray1507); 

                    	    pushFollow(FOLLOW_jsonValue_in_jsonArray1509);
                    	    jsonValue();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_jsonArray1513); 

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
    public static final BitSet FOLLOW_definition_prefix_in_unnamed_entry87 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_unnamed_entry99 = new BitSet(new long[]{0x000000801B008000L});
    public static final BitSet FOLLOW_range_in_unnamed_entry103 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_unnamed_entry110 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optional_marker_in_definition_suffix132 = new BitSet(new long[]{0x0000000013000002L});
    public static final BitSet FOLLOW_enum_values_in_definition_suffix135 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_default_value_in_definition_suffix138 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_requires_in_definition_suffix141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_definition_prefix174 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_definition_prefix189 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_definition_prefix204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_definition_prefix214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definition_prefix224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix239 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix244 = new BitSet(new long[]{0x0000017DC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix246 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_definition_prefix251 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix269 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definition_prefix273 = new BitSet(new long[]{0x0000007DE0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix280 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition_prefix286 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_definition_prefix299 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix303 = new BitSet(new long[]{0x0000017DC0002000L});
    public static final BitSet FOLLOW_named_entries_in_definition_prefix305 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_definition_prefix310 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_definition_prefix325 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix330 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix332 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_definition_prefix334 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix336 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_definition_prefix338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_named_entry360 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry364 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_named_entry376 = new BitSet(new long[]{0x0000008000010800L});
    public static final BitSet FOLLOW_range_in_named_entry380 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry385 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_named_entry391 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_entry_in_named_entries425 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries430 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_named_entry_in_named_entries434 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries469 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries474 = new BitSet(new long[]{0x0000007DC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries478 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_require_conditional521 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_require_conditional535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_require_conditional547 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_require_conditional549 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional555 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional563 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_require_conditional570 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_NUMBER_in_require_conditional576 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_STRING_in_require_conditional584 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_require_conditional592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_name_in_require_property617 = new BitSet(new long[]{0x0000000202000000L});
    public static final BitSet FOLLOW_require_conditional_in_require_property621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_requires638 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires640 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_requires643 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_require_property_in_requires645 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_requires649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optional_marker663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_additional_marker682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_enum_values699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_default_value716 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_default_value718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_range747 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range751 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range753 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range757 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_range759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_range769 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range773 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range775 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_range777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_range787 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range789 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range793 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_range795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_perl_regex830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_jsonObject1416 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_jsonObject1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_jsonObject1426 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject1428 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_jsonObject1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember1447 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_jsonMember1449 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList1468 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonMemberList1471 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1492 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1502 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1504 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_jsonArray1507 = new BitSet(new long[]{0x0000008010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1509 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_jsonArray1513 = new BitSet(new long[]{0x0000000000000002L});

}