// $ANTLR 3.4 Orderly.g 2012-11-03 18:43:49

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
    public String getGrammarFileName() { return "Orderly.g"; }


        JsonProperty currentProperty;



    // $ANTLR start "orderly_schema"
    // Orderly.g:25:1: orderly_schema returns [JsonProperty rootProperty] : unnamed_entry ( ';' )? ;
    public final JsonProperty orderly_schema() throws RecognitionException {
        JsonProperty rootProperty = null;


        JsonProperty unnamed_entry1 =null;


        try {
            // Orderly.g:26:5: ( unnamed_entry ( ';' )? )
            // Orderly.g:26:7: unnamed_entry ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_orderly_schema57);
            unnamed_entry1=unnamed_entry();

            state._fsp--;


            // Orderly.g:26:21: ( ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Orderly.g:26:21: ';'
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
    // Orderly.g:29:1: unnamed_entry returns [JsonProperty property] : ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix );
    public final JsonProperty unnamed_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix2 =null;

        Range range3 =null;


        try {
            // Orderly.g:30:5: ( definition_prefix definition_suffix | 'string' ( range )? (regex= perl_regex )? definition_suffix )
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
                    // Orderly.g:30:7: definition_prefix definition_suffix
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
                    // Orderly.g:31:7: 'string' ( range )? (regex= perl_regex )? definition_suffix
                    {
                    match(input,36,FOLLOW_36_in_unnamed_entry99); 

                     property = new JsonString(); 

                    // Orderly.g:31:50: ( range )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==38) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Orderly.g:31:50: range
                            {
                            pushFollow(FOLLOW_range_in_unnamed_entry103);
                            range3=range();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonString.class.cast(property).setRange(range3);

                    // Orderly.g:31:121: (regex= perl_regex )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==REGEX) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Orderly.g:31:121: regex= perl_regex
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
    // Orderly.g:34:1: definition_suffix : ( enum_values )? ( default_value )? ( requires )? ( optional_marker )? ;
    public final void definition_suffix() throws RecognitionException {
        try {
            // Orderly.g:35:5: ( ( enum_values )? ( default_value )? ( requires )? ( optional_marker )? )
            // Orderly.g:35:7: ( enum_values )? ( default_value )? ( requires )? ( optional_marker )?
            {
            // Orderly.g:35:7: ( enum_values )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Orderly.g:35:7: enum_values
                    {
                    pushFollow(FOLLOW_enum_values_in_definition_suffix132);
                    enum_values();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:35:20: ( default_value )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Orderly.g:35:20: default_value
                    {
                    pushFollow(FOLLOW_default_value_in_definition_suffix135);
                    default_value();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:35:35: ( requires )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Orderly.g:35:35: requires
                    {
                    pushFollow(FOLLOW_requires_in_definition_suffix138);
                    requires();

                    state._fsp--;


                    }
                    break;

            }


            // Orderly.g:35:45: ( optional_marker )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Orderly.g:35:45: optional_marker
                    {
                    pushFollow(FOLLOW_optional_marker_in_definition_suffix141);
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
    // Orderly.g:38:1: definition_prefix returns [JsonProperty property] : ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' );
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
            // Orderly.g:41:5: ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( range )? | 'array' '[' (un= unnamed_entry )? ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' )
            int alt17=9;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt17=1;
                }
                break;
            case 34:
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

                if ( (LA17_6==38) ) {
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
            case 35:
                {
                alt17=8;
                }
                break;
            case 37:
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
                    // Orderly.g:41:7: 'integer' ( range )?
                    {
                    match(input,33,FOLLOW_33_in_definition_prefix174); 

                     property = new JsonInteger(); 

                    // Orderly.g:41:52: ( range )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==38) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Orderly.g:41:52: range
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
                    // Orderly.g:42:7: 'number' ( range )?
                    {
                    match(input,34,FOLLOW_34_in_definition_prefix189); 

                     property = new JsonNumber(); 

                    // Orderly.g:42:50: ( range )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==38) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Orderly.g:42:50: range
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
                    // Orderly.g:43:7: 'boolean'
                    {
                    match(input,32,FOLLOW_32_in_definition_prefix204); 

                     property = new JsonBoolean(); 

                    }
                    break;
                case 4 :
                    // Orderly.g:44:7: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_definition_prefix214); 

                     property = new JsonNull(); 

                    }
                    break;
                case 5 :
                    // Orderly.g:45:7: 'any'
                    {
                    match(input,30,FOLLOW_30_in_definition_prefix224); 

                     property = new JsonAny(); 

                    }
                    break;
                case 6 :
                    // Orderly.g:47:7: 'array' '{' ( unnamed_entries )? '}' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix239); 

                     property = new JsonArray(); 

                    match(input,38,FOLLOW_38_in_definition_prefix244); 

                    // Orderly.g:47:53: ( unnamed_entries )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NULL||(LA11_0 >= 30 && LA11_0 <= 37)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Orderly.g:47:53: unnamed_entries
                            {
                            pushFollow(FOLLOW_unnamed_entries_in_definition_prefix246);
                            unnamed_entries6=unnamed_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    JsonArray.class.cast(property).setProperties(unnamed_entries6);

                    match(input,39,FOLLOW_39_in_definition_prefix251); 

                    // Orderly.g:47:152: ( range )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==38) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // Orderly.g:47:152: range
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
                    // Orderly.g:49:7: 'array' '[' (un= unnamed_entry )? ']' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix269); 

                     property = new JsonArray(); 

                    match(input,28,FOLLOW_28_in_definition_prefix273); 

                    // Orderly.g:49:52: (un= unnamed_entry )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==NULL||(LA13_0 >= 30 && LA13_0 <= 37)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // Orderly.g:49:53: un= unnamed_entry
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

                    // Orderly.g:49:267: ( range )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==38) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Orderly.g:49:267: range
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
                    // Orderly.g:50:7: 'object' '{' ( named_entries )? '}' ( additional_marker )?
                    {
                    match(input,35,FOLLOW_35_in_definition_prefix299); 

                     property = new JsonObject(); 

                    match(input,38,FOLLOW_38_in_definition_prefix303); 

                    // Orderly.g:50:54: ( named_entries )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NULL||(LA15_0 >= 30 && LA15_0 <= 37)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Orderly.g:50:54: named_entries
                            {
                            pushFollow(FOLLOW_named_entries_in_definition_prefix305);
                            named_entries9=named_entries();

                            state._fsp--;


                            }
                            break;

                    }


                     JsonObject.class.cast(property).setProperties(named_entries9); 

                    match(input,39,FOLLOW_39_in_definition_prefix310); 

                    // Orderly.g:50:152: ( additional_marker )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==20) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Orderly.g:50:153: additional_marker
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
                    // Orderly.g:51:7: 'union' '{' unnamed_entry ';' unnamed_entries '}'
                    {
                    match(input,37,FOLLOW_37_in_definition_prefix325); 

                     property = new JsonUnion(); 

                    match(input,38,FOLLOW_38_in_definition_prefix330); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix332);
                    unnamed_entry();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_definition_prefix334); 

                    pushFollow(FOLLOW_unnamed_entries_in_definition_prefix336);
                    unnamed_entries();

                    state._fsp--;


                    match(input,39,FOLLOW_39_in_definition_prefix338); 

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
    // Orderly.g:54:1: named_entry returns [JsonProperty property] : ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix );
    public final JsonProperty named_entry() throws RecognitionException {
        JsonProperty property = null;


        RegularExpression regex =null;

        JsonProperty definition_prefix10 =null;

        OrderlyParser.property_name_return property_name11 =null;

        Range range12 =null;

        OrderlyParser.property_name_return property_name13 =null;


        try {
            // Orderly.g:55:5: ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name (regex= perl_regex )? definition_suffix )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NULL||(LA20_0 >= 30 && LA20_0 <= 35)||LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==36) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Orderly.g:55:7: definition_prefix property_name definition_suffix
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
                    // Orderly.g:56:7: 'string' ( range )? property_name (regex= perl_regex )? definition_suffix
                    {
                    match(input,36,FOLLOW_36_in_named_entry376); 

                     property = new JsonString(); 

                    // Orderly.g:56:50: ( range )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==38) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Orderly.g:56:50: range
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

                    // Orderly.g:56:200: (regex= perl_regex )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==REGEX) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // Orderly.g:56:200: regex= perl_regex
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
    // Orderly.g:59:1: named_entries returns [HashMap<String, JsonProperty> properties] : n1= named_entry ( ';' n2= named_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> named_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty n1 =null;

        JsonProperty n2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:61:5: (n1= named_entry ( ';' n2= named_entry )* ( ';' )? )
            // Orderly.g:61:7: n1= named_entry ( ';' n2= named_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_named_entry_in_named_entries425);
            n1=named_entry();

            state._fsp--;


            properties.put(n1.getName(),n1);

            // Orderly.g:61:78: ( ';' n2= named_entry )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1==NULL||(LA21_1 >= 30 && LA21_1 <= 37)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // Orderly.g:61:79: ';' n2= named_entry
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


            // Orderly.g:61:155: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Orderly.g:61:155: ';'
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
    // Orderly.g:64:1: unnamed_entries returns [HashMap<String, JsonProperty> properties] : un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? ;
    public final HashMap<String, JsonProperty> unnamed_entries() throws RecognitionException {
        HashMap<String, JsonProperty> properties = null;


        JsonProperty un1 =null;

        JsonProperty un2 =null;


         properties = new HashMap<String, JsonProperty>(); 
        try {
            // Orderly.g:66:5: (un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )? )
            // Orderly.g:66:7: un1= unnamed_entry ( ';' un2= unnamed_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries469);
            un1=unnamed_entry();

            state._fsp--;


            properties.put(un1.getClass().getName(),un1);

            // Orderly.g:66:94: ( ';' un2= unnamed_entry )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==23) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==NULL||(LA23_1 >= 30 && LA23_1 <= 37)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // Orderly.g:66:95: ';' un2= unnamed_entry
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


            // Orderly.g:66:190: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Orderly.g:66:190: ';'
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



    // $ANTLR start "csv_property_names"
    // Orderly.g:69:1: csv_property_names : property_name ( ',' property_name )* ;
    public final void csv_property_names() throws RecognitionException {
        try {
            // Orderly.g:70:5: ( property_name ( ',' property_name )* )
            // Orderly.g:70:7: property_name ( ',' property_name )*
            {
            pushFollow(FOLLOW_property_name_in_csv_property_names503);
            property_name();

            state._fsp--;


            // Orderly.g:70:21: ( ',' property_name )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // Orderly.g:70:22: ',' property_name
            	    {
            	    match(input,21,FOLLOW_21_in_csv_property_names506); 

            	    pushFollow(FOLLOW_property_name_in_csv_property_names508);
            	    property_name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // Orderly.g:73:1: requires : '<' csv_property_names '>' ;
    public final void requires() throws RecognitionException {
        try {
            // Orderly.g:74:5: ( '<' csv_property_names '>' )
            // Orderly.g:74:7: '<' csv_property_names '>'
            {
            match(input,24,FOLLOW_24_in_requires524); 

            pushFollow(FOLLOW_csv_property_names_in_requires526);
            csv_property_names();

            state._fsp--;


            match(input,26,FOLLOW_26_in_requires528); 

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
    // Orderly.g:77:1: optional_marker : '?' ;
    public final void optional_marker() throws RecognitionException {
        try {
            // Orderly.g:78:5: ( '?' )
            // Orderly.g:78:7: '?'
            {
            match(input,27,FOLLOW_27_in_optional_marker542); 

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
    // Orderly.g:81:1: additional_marker : '*' ;
    public final void additional_marker() throws RecognitionException {
        try {
            // Orderly.g:82:5: ( '*' )
            // Orderly.g:82:7: '*'
            {
            match(input,20,FOLLOW_20_in_additional_marker561); 

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
    // Orderly.g:85:1: enum_values : jsonArray ;
    public final void enum_values() throws RecognitionException {
        try {
            // Orderly.g:86:5: ( jsonArray )
            // Orderly.g:86:7: jsonArray
            {
            pushFollow(FOLLOW_jsonArray_in_enum_values578);
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
    // Orderly.g:89:1: default_value : '=' jsonValue ;
    public final void default_value() throws RecognitionException {
        try {
            // Orderly.g:90:5: ( '=' jsonValue )
            // Orderly.g:90:7: '=' jsonValue
            {
            match(input,25,FOLLOW_25_in_default_value595); 

            pushFollow(FOLLOW_jsonValue_in_default_value597);
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
    // Orderly.g:93:1: range returns [Range range] : ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' );
    public final Range range() throws RecognitionException {
        Range range = null;


        Token lower=null;
        Token upper=null;

        range = new Range(); BigDecimal lowerBound; BigDecimal upperBound;
        try {
            // Orderly.g:95:5: ( '{' lower= NUMBER ',' upper= NUMBER '}' | '{' lower= NUMBER ',' '}' | '{' ',' upper= NUMBER '}' )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==NUMBER) ) {
                    int LA26_2 = input.LA(3);

                    if ( (LA26_2==21) ) {
                        int LA26_4 = input.LA(4);

                        if ( (LA26_4==NUMBER) ) {
                            alt26=1;
                        }
                        else if ( (LA26_4==39) ) {
                            alt26=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA26_1==21) ) {
                    alt26=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // Orderly.g:95:7: '{' lower= NUMBER ',' upper= NUMBER '}'
                    {
                    match(input,38,FOLLOW_38_in_range626); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range630); 

                    match(input,21,FOLLOW_21_in_range632); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range636); 

                    match(input,39,FOLLOW_39_in_range638); 

                    range.lowerBound = new BigDecimal(lower.getText()); range.upperBound = new BigDecimal(upper.getText());

                    }
                    break;
                case 2 :
                    // Orderly.g:96:7: '{' lower= NUMBER ',' '}'
                    {
                    match(input,38,FOLLOW_38_in_range648); 

                    lower=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range652); 

                    match(input,21,FOLLOW_21_in_range654); 

                    match(input,39,FOLLOW_39_in_range656); 

                    range.lowerBound = new BigDecimal(lower.getText());

                    }
                    break;
                case 3 :
                    // Orderly.g:97:7: '{' ',' upper= NUMBER '}'
                    {
                    match(input,38,FOLLOW_38_in_range666); 

                    match(input,21,FOLLOW_21_in_range668); 

                    upper=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_range672); 

                    match(input,39,FOLLOW_39_in_range674); 

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
    // Orderly.g:100:1: property_name : ( IDENTIFIER | STRING );
    public final OrderlyParser.property_name_return property_name() throws RecognitionException {
        OrderlyParser.property_name_return retval = new OrderlyParser.property_name_return();
        retval.start = input.LT(1);


        try {
            // Orderly.g:101:2: ( IDENTIFIER | STRING )
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
    // Orderly.g:105:1: perl_regex returns [RegularExpression regex] : exp= REGEX ;
    public final RegularExpression perl_regex() throws RecognitionException {
        RegularExpression regex = null;


        Token exp=null;

        try {
            // Orderly.g:106:2: (exp= REGEX )
            // Orderly.g:106:4: exp= REGEX
            {
            exp=(Token)match(input,REGEX,FOLLOW_REGEX_in_perl_regex709); 

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
    // Orderly.g:170:1: jsonValue : ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray );
    public final void jsonValue() throws RecognitionException {
        try {
            // Orderly.g:171:5: ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray )
            int alt27=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt27=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt27=2;
                }
                break;
            case STRING:
                {
                alt27=3;
                }
                break;
            case NUMBER:
                {
                alt27=4;
                }
                break;
            case 38:
                {
                alt27=5;
                }
                break;
            case 28:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // Orderly.g:171:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_jsonValue1209); 

                    }
                    break;
                case 2 :
                    // Orderly.g:172:7: jsonBooleanLiteral
                    {
                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue1217);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // Orderly.g:173:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_jsonValue1225); 

                    }
                    break;
                case 4 :
                    // Orderly.g:174:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue1233); 

                    }
                    break;
                case 5 :
                    // Orderly.g:175:7: jsonObject
                    {
                    pushFollow(FOLLOW_jsonObject_in_jsonValue1241);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // Orderly.g:176:7: jsonArray
                    {
                    pushFollow(FOLLOW_jsonArray_in_jsonValue1249);
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
    // Orderly.g:179:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // Orderly.g:180:5: ( TRUE | FALSE )
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
    // Orderly.g:184:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // Orderly.g:185:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==39) ) {
                    alt28=1;
                }
                else if ( (LA28_1==STRING) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // Orderly.g:185:7: '{' '}'
                    {
                    match(input,38,FOLLOW_38_in_jsonObject1295); 

                    match(input,39,FOLLOW_39_in_jsonObject1297); 

                    }
                    break;
                case 2 :
                    // Orderly.g:186:7: '{' jsonMemberList '}'
                    {
                    match(input,38,FOLLOW_38_in_jsonObject1305); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject1307);
                    jsonMemberList();

                    state._fsp--;


                    match(input,39,FOLLOW_39_in_jsonObject1309); 

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
    // Orderly.g:189:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // Orderly.g:190:5: ( STRING ':' jsonValue )
            // Orderly.g:190:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember1326); 

            match(input,22,FOLLOW_22_in_jsonMember1328); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember1330);
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
    // Orderly.g:193:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // Orderly.g:194:5: ( jsonMember ( ',' jsonMemberList )? )
            // Orderly.g:194:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList1347);
            jsonMember();

            state._fsp--;


            // Orderly.g:194:18: ( ',' jsonMemberList )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // Orderly.g:194:19: ',' jsonMemberList
                    {
                    match(input,21,FOLLOW_21_in_jsonMemberList1350); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList1352);
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
    // Orderly.g:197:1: jsonArray : ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // Orderly.g:198:5: ( '[' ']' | '[' jsonValue ( ',' jsonValue )* ']' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==29) ) {
                    alt31=1;
                }
                else if ( (LA31_1==FALSE||(LA31_1 >= NULL && LA31_1 <= NUMBER)||(LA31_1 >= STRING && LA31_1 <= TRUE)||LA31_1==28||LA31_1==38) ) {
                    alt31=2;
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
                    // Orderly.g:198:7: '[' ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1371); 

                    match(input,29,FOLLOW_29_in_jsonArray1373); 

                    }
                    break;
                case 2 :
                    // Orderly.g:199:7: '[' jsonValue ( ',' jsonValue )* ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1381); 

                    pushFollow(FOLLOW_jsonValue_in_jsonArray1383);
                    jsonValue();

                    state._fsp--;


                    // Orderly.g:199:21: ( ',' jsonValue )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==21) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // Orderly.g:199:22: ',' jsonValue
                    	    {
                    	    match(input,21,FOLLOW_21_in_jsonArray1386); 

                    	    pushFollow(FOLLOW_jsonValue_in_jsonArray1388);
                    	    jsonValue();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    match(input,29,FOLLOW_29_in_jsonArray1392); 

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
    public static final BitSet FOLLOW_36_in_unnamed_entry99 = new BitSet(new long[]{0x000000401B008000L});
    public static final BitSet FOLLOW_range_in_unnamed_entry103 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_unnamed_entry110 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_values_in_definition_suffix132 = new BitSet(new long[]{0x000000000B000002L});
    public static final BitSet FOLLOW_default_value_in_definition_suffix135 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_requires_in_definition_suffix138 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_optional_marker_in_definition_suffix141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_definition_prefix174 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_definition_prefix189 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_definition_prefix204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_definition_prefix214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definition_prefix224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix239 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix244 = new BitSet(new long[]{0x000000BFC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix246 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix251 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix269 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definition_prefix273 = new BitSet(new long[]{0x0000003FE0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix280 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition_prefix286 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_definition_prefix299 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix303 = new BitSet(new long[]{0x000000BFC0002000L});
    public static final BitSet FOLLOW_named_entries_in_definition_prefix305 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix310 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_definition_prefix325 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix330 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix332 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_definition_prefix334 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix336 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_named_entry360 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry364 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_named_entry376 = new BitSet(new long[]{0x0000004000010800L});
    public static final BitSet FOLLOW_range_in_named_entry380 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry385 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_named_entry391 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_entry_in_named_entries425 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries430 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_named_entry_in_named_entries434 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries469 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries474 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries478 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_name_in_csv_property_names503 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_csv_property_names506 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_csv_property_names508 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24_in_requires524 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_csv_property_names_in_requires526 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_requires528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optional_marker542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_additional_marker561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_enum_values578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_default_value595 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_default_value597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range626 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range630 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range632 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range636 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range648 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range652 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range654 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range666 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range668 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range672 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_perl_regex709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_jsonObject1295 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_jsonObject1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_jsonObject1305 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject1307 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_jsonObject1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember1326 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_jsonMember1328 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList1347 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonMemberList1350 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1371 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1381 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1383 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_21_in_jsonArray1386 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray1388 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_29_in_jsonArray1392 = new BitSet(new long[]{0x0000000000000002L});

}