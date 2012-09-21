// $ANTLR 3.4 /Users/guax/jOrderly/grammar/Orderly.g 2012-09-21 20:33:45

package net.guax.jorderly.parser;
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
    // /Users/guax/jOrderly/grammar/Orderly.g:16:1: orderly_schema : unnamed_entry ( ';' )? EOF ;
    public final void orderly_schema() throws RecognitionException {
        JsonProperty unnamed_entry1 =null;


        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:17:5: ( unnamed_entry ( ';' )? EOF )
            // /Users/guax/jOrderly/grammar/Orderly.g:17:7: unnamed_entry ( ';' )? EOF
            {
            pushFollow(FOLLOW_unnamed_entry_in_orderly_schema46);
            unnamed_entry1=unnamed_entry();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:17:21: ( ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==23) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:17:21: ';'
                    {
                    match(input,23,FOLLOW_23_in_orderly_schema48); 

                    }
                    break;

            }


            match(input,EOF,FOLLOW_EOF_in_orderly_schema51); 

            System.out.println(unnamed_entry1);

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
    // $ANTLR end "orderly_schema"



    // $ANTLR start "unnamed_entry"
    // /Users/guax/jOrderly/grammar/Orderly.g:20:1: unnamed_entry returns [JsonProperty property] : ( definition_prefix definition_suffix | 'string' ( range )? ( perl_regex )? definition_suffix );
    public final JsonProperty unnamed_entry() throws RecognitionException {
        JsonProperty property = null;


        JsonProperty definition_prefix2 =null;


        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:21:5: ( definition_prefix definition_suffix | 'string' ( range )? ( perl_regex )? definition_suffix )
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:21:7: definition_prefix definition_suffix
                    {
                    pushFollow(FOLLOW_definition_prefix_in_unnamed_entry78);
                    definition_prefix2=definition_prefix();

                    state._fsp--;


                     property = definition_prefix2; 

                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry82);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:22:7: 'string' ( range )? ( perl_regex )? definition_suffix
                    {
                    match(input,36,FOLLOW_36_in_unnamed_entry90); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:22:16: ( range )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==38) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:22:16: range
                            {
                            pushFollow(FOLLOW_range_in_unnamed_entry92);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    // /Users/guax/jOrderly/grammar/Orderly.g:22:23: ( perl_regex )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==REGEX) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:22:23: perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_unnamed_entry95);
                            perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_definition_suffix_in_unnamed_entry98);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:25:1: definition_suffix : ( enum_values )? ( default_value )? ( requires )? ( optional_marker )? ;
    public final void definition_suffix() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:26:5: ( ( enum_values )? ( default_value )? ( requires )? ( optional_marker )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:26:7: ( enum_values )? ( default_value )? ( requires )? ( optional_marker )?
            {
            // /Users/guax/jOrderly/grammar/Orderly.g:26:7: ( enum_values )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:26:7: enum_values
                    {
                    pushFollow(FOLLOW_enum_values_in_definition_suffix115);
                    enum_values();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/guax/jOrderly/grammar/Orderly.g:26:20: ( default_value )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:26:20: default_value
                    {
                    pushFollow(FOLLOW_default_value_in_definition_suffix118);
                    default_value();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/guax/jOrderly/grammar/Orderly.g:26:35: ( requires )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:26:35: requires
                    {
                    pushFollow(FOLLOW_requires_in_definition_suffix121);
                    requires();

                    state._fsp--;


                    }
                    break;

            }


            // /Users/guax/jOrderly/grammar/Orderly.g:26:45: ( optional_marker )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:26:45: optional_marker
                    {
                    pushFollow(FOLLOW_optional_marker_in_definition_suffix124);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:29:1: definition_prefix returns [JsonProperty property] : ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( additional_marker )? ( range )? | 'array' '[' unnamed_entry ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' );
    public final JsonProperty definition_prefix() throws RecognitionException {
        JsonProperty property = null;


        property = null;
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:31:5: ( 'integer' ( range )? | 'number' ( range )? | 'boolean' | 'null' | 'any' | 'array' '{' ( unnamed_entries )? '}' ( additional_marker )? ( range )? | 'array' '[' unnamed_entry ']' ( range )? | 'object' '{' ( named_entries )? '}' ( additional_marker )? | 'union' '{' unnamed_entry ';' unnamed_entries '}' )
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:31:7: 'integer' ( range )?
                    {
                    match(input,33,FOLLOW_33_in_definition_prefix149); 

                     property = new JsonInteger(); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:31:52: ( range )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==38) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:31:52: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix153);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:32:7: 'number' ( range )?
                    {
                    match(input,34,FOLLOW_34_in_definition_prefix162); 

                     property = new JsonNumber(); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:32:50: ( range )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==38) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:32:50: range
                            {
                            pushFollow(FOLLOW_range_in_definition_prefix166);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:33:7: 'boolean'
                    {
                    match(input,32,FOLLOW_32_in_definition_prefix175); 

                     property = new JsonBoolean(); 

                    }
                    break;
                case 4 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:34:7: 'null'
                    {
                    match(input,NULL,FOLLOW_NULL_in_definition_prefix185); 

                     property = new JsonNull(); 

                    }
                    break;
                case 5 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:35:7: 'any'
                    {
                    match(input,30,FOLLOW_30_in_definition_prefix195); 

                     property = new JsonAny(); 

                    }
                    break;
                case 6 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:37:7: 'array' '{' ( unnamed_entries )? '}' ( additional_marker )? ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix210); 

                     property = new JsonArray(); 

                    match(input,38,FOLLOW_38_in_definition_prefix215); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:37:53: ( unnamed_entries )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NULL||(LA11_0 >= 30 && LA11_0 <= 37)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:37:53: unnamed_entries
                            {
                            pushFollow(FOLLOW_unnamed_entries_in_definition_prefix217);
                            unnamed_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,39,FOLLOW_39_in_definition_prefix220); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:37:74: ( additional_marker )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==20) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:37:74: additional_marker
                            {
                            pushFollow(FOLLOW_additional_marker_in_definition_prefix222);
                            additional_marker();

                            state._fsp--;


                            }
                            break;

                    }


                    // /Users/guax/jOrderly/grammar/Orderly.g:37:93: ( range )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==38) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:37:93: range
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:39:7: 'array' '[' unnamed_entry ']' ( range )?
                    {
                    match(input,31,FOLLOW_31_in_definition_prefix239); 

                     property = new JsonArray(); 

                    match(input,28,FOLLOW_28_in_definition_prefix243); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix245);
                    unnamed_entry();

                    state._fsp--;


                    match(input,29,FOLLOW_29_in_definition_prefix247); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:39:70: ( range )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==38) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:39:70: range
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:40:7: 'object' '{' ( named_entries )? '}' ( additional_marker )?
                    {
                    match(input,35,FOLLOW_35_in_definition_prefix258); 

                     property = new JsonObject(); 

                    match(input,38,FOLLOW_38_in_definition_prefix262); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:40:54: ( named_entries )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==NULL||(LA15_0 >= 30 && LA15_0 <= 37)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:40:54: named_entries
                            {
                            pushFollow(FOLLOW_named_entries_in_definition_prefix264);
                            named_entries();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,39,FOLLOW_39_in_definition_prefix267); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:40:73: ( additional_marker )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==20) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:40:73: additional_marker
                            {
                            pushFollow(FOLLOW_additional_marker_in_definition_prefix269);
                            additional_marker();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:41:7: 'union' '{' unnamed_entry ';' unnamed_entries '}'
                    {
                    match(input,37,FOLLOW_37_in_definition_prefix278); 

                     property = new JsonUnion(); 

                    match(input,38,FOLLOW_38_in_definition_prefix283); 

                    pushFollow(FOLLOW_unnamed_entry_in_definition_prefix285);
                    unnamed_entry();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_definition_prefix287); 

                    pushFollow(FOLLOW_unnamed_entries_in_definition_prefix289);
                    unnamed_entries();

                    state._fsp--;


                    match(input,39,FOLLOW_39_in_definition_prefix291); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:44:1: named_entry : ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name ( perl_regex )? definition_suffix );
    public final void named_entry() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:45:5: ( definition_prefix property_name definition_suffix | 'string' ( range )? property_name ( perl_regex )? definition_suffix )
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:45:7: definition_prefix property_name definition_suffix
                    {
                    pushFollow(FOLLOW_definition_prefix_in_named_entry309);
                    definition_prefix();

                    state._fsp--;


                    pushFollow(FOLLOW_property_name_in_named_entry311);
                    property_name();

                    state._fsp--;


                    pushFollow(FOLLOW_definition_suffix_in_named_entry313);
                    definition_suffix();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:46:7: 'string' ( range )? property_name ( perl_regex )? definition_suffix
                    {
                    match(input,36,FOLLOW_36_in_named_entry321); 

                    // /Users/guax/jOrderly/grammar/Orderly.g:46:16: ( range )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==38) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:46:16: range
                            {
                            pushFollow(FOLLOW_range_in_named_entry323);
                            range();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_property_name_in_named_entry326);
                    property_name();

                    state._fsp--;


                    // /Users/guax/jOrderly/grammar/Orderly.g:46:37: ( perl_regex )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==REGEX) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/guax/jOrderly/grammar/Orderly.g:46:37: perl_regex
                            {
                            pushFollow(FOLLOW_perl_regex_in_named_entry328);
                            perl_regex();

                            state._fsp--;


                            }
                            break;

                    }


                    pushFollow(FOLLOW_definition_suffix_in_named_entry331);
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
        return ;
    }
    // $ANTLR end "named_entry"



    // $ANTLR start "named_entries"
    // /Users/guax/jOrderly/grammar/Orderly.g:49:1: named_entries : named_entry ( ';' named_entry )* ( ';' )? ;
    public final void named_entries() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:50:5: ( named_entry ( ';' named_entry )* ( ';' )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:50:7: named_entry ( ';' named_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_named_entry_in_named_entries348);
            named_entry();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:50:19: ( ';' named_entry )*
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
            	    // /Users/guax/jOrderly/grammar/Orderly.g:50:20: ';' named_entry
            	    {
            	    match(input,23,FOLLOW_23_in_named_entries351); 

            	    pushFollow(FOLLOW_named_entry_in_named_entries353);
            	    named_entry();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // /Users/guax/jOrderly/grammar/Orderly.g:50:38: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:50:38: ';'
                    {
                    match(input,23,FOLLOW_23_in_named_entries357); 

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
    // $ANTLR end "named_entries"



    // $ANTLR start "unnamed_entries"
    // /Users/guax/jOrderly/grammar/Orderly.g:53:1: unnamed_entries : unnamed_entry ( ';' unnamed_entry )* ( ';' )? ;
    public final void unnamed_entries() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:54:5: ( unnamed_entry ( ';' unnamed_entry )* ( ';' )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:54:7: unnamed_entry ( ';' unnamed_entry )* ( ';' )?
            {
            pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries375);
            unnamed_entry();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:54:21: ( ';' unnamed_entry )*
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
            	    // /Users/guax/jOrderly/grammar/Orderly.g:54:22: ';' unnamed_entry
            	    {
            	    match(input,23,FOLLOW_23_in_unnamed_entries378); 

            	    pushFollow(FOLLOW_unnamed_entry_in_unnamed_entries380);
            	    unnamed_entry();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // /Users/guax/jOrderly/grammar/Orderly.g:54:42: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:54:42: ';'
                    {
                    match(input,23,FOLLOW_23_in_unnamed_entries384); 

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
    // $ANTLR end "unnamed_entries"



    // $ANTLR start "csv_property_names"
    // /Users/guax/jOrderly/grammar/Orderly.g:57:1: csv_property_names : property_name ( ',' property_name )* ;
    public final void csv_property_names() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:58:5: ( property_name ( ',' property_name )* )
            // /Users/guax/jOrderly/grammar/Orderly.g:58:7: property_name ( ',' property_name )*
            {
            pushFollow(FOLLOW_property_name_in_csv_property_names402);
            property_name();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:58:21: ( ',' property_name )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/guax/jOrderly/grammar/Orderly.g:58:22: ',' property_name
            	    {
            	    match(input,21,FOLLOW_21_in_csv_property_names405); 

            	    pushFollow(FOLLOW_property_name_in_csv_property_names407);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:61:1: requires : '<' csv_property_names '>' ;
    public final void requires() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:62:5: ( '<' csv_property_names '>' )
            // /Users/guax/jOrderly/grammar/Orderly.g:62:7: '<' csv_property_names '>'
            {
            match(input,24,FOLLOW_24_in_requires423); 

            pushFollow(FOLLOW_csv_property_names_in_requires425);
            csv_property_names();

            state._fsp--;


            match(input,26,FOLLOW_26_in_requires427); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:65:1: optional_marker : '?' ;
    public final void optional_marker() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:66:5: ( '?' )
            // /Users/guax/jOrderly/grammar/Orderly.g:66:7: '?'
            {
            match(input,27,FOLLOW_27_in_optional_marker441); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:69:1: additional_marker : '*' ;
    public final void additional_marker() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:70:5: ( '*' )
            // /Users/guax/jOrderly/grammar/Orderly.g:70:7: '*'
            {
            match(input,20,FOLLOW_20_in_additional_marker458); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:73:1: enum_values : jsonArray ;
    public final void enum_values() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:74:5: ( jsonArray )
            // /Users/guax/jOrderly/grammar/Orderly.g:74:7: jsonArray
            {
            pushFollow(FOLLOW_jsonArray_in_enum_values475);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:77:1: default_value : '=' jsonValue ;
    public final void default_value() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:78:5: ( '=' jsonValue )
            // /Users/guax/jOrderly/grammar/Orderly.g:78:7: '=' jsonValue
            {
            match(input,25,FOLLOW_25_in_default_value492); 

            pushFollow(FOLLOW_jsonValue_in_default_value494);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:81:1: range : ( '{' NUMBER ',' NUMBER '}' | '{' NUMBER ',' '}' | '{' ',' NUMBER '}' );
    public final void range() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:82:5: ( '{' NUMBER ',' NUMBER '}' | '{' NUMBER ',' '}' | '{' ',' NUMBER '}' )
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:82:7: '{' NUMBER ',' NUMBER '}'
                    {
                    match(input,38,FOLLOW_38_in_range508); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range510); 

                    match(input,21,FOLLOW_21_in_range512); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range514); 

                    match(input,39,FOLLOW_39_in_range516); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:83:7: '{' NUMBER ',' '}'
                    {
                    match(input,38,FOLLOW_38_in_range524); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range526); 

                    match(input,21,FOLLOW_21_in_range528); 

                    match(input,39,FOLLOW_39_in_range530); 

                    }
                    break;
                case 3 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:84:7: '{' ',' NUMBER '}'
                    {
                    match(input,38,FOLLOW_38_in_range538); 

                    match(input,21,FOLLOW_21_in_range540); 

                    match(input,NUMBER,FOLLOW_NUMBER_in_range542); 

                    match(input,39,FOLLOW_39_in_range544); 

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



    // $ANTLR start "property_name"
    // /Users/guax/jOrderly/grammar/Orderly.g:87:1: property_name : ( IDENTIFIER | STRING );
    public final void property_name() throws RecognitionException {
        Token IDENTIFIER3=null;
        Token STRING4=null;

        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:88:2: ( IDENTIFIER | STRING )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IDENTIFIER) ) {
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:88:4: IDENTIFIER
                    {
                    IDENTIFIER3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_property_name555); 

                     System.out.println("Property Name: " + (IDENTIFIER3!=null?IDENTIFIER3.getText():null)); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:89:4: STRING
                    {
                    STRING4=(Token)match(input,STRING,FOLLOW_STRING_in_property_name562); 

                     System.out.println("Property Name: " + (STRING4!=null?STRING4.getText():null)); 

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
    // $ANTLR end "property_name"



    // $ANTLR start "perl_regex"
    // /Users/guax/jOrderly/grammar/Orderly.g:92:1: perl_regex : REGEX ;
    public final void perl_regex() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:93:2: ( REGEX )
            // /Users/guax/jOrderly/grammar/Orderly.g:93:4: REGEX
            {
            match(input,REGEX,FOLLOW_REGEX_in_perl_regex575); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:157:1: jsonValue : ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray );
    public final void jsonValue() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:158:5: ( NULL | jsonBooleanLiteral | STRING | NUMBER | jsonObject | jsonArray )
            int alt28=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt28=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt28=2;
                }
                break;
            case STRING:
                {
                alt28=3;
                }
                break;
            case NUMBER:
                {
                alt28=4;
                }
                break;
            case 38:
                {
                alt28=5;
                }
                break;
            case 28:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:158:7: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_jsonValue1073); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:159:7: jsonBooleanLiteral
                    {
                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue1081);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:160:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_jsonValue1089); 

                    }
                    break;
                case 4 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:161:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue1097); 

                    }
                    break;
                case 5 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:162:7: jsonObject
                    {
                    pushFollow(FOLLOW_jsonObject_in_jsonValue1105);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:163:7: jsonArray
                    {
                    pushFollow(FOLLOW_jsonArray_in_jsonValue1113);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:166:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:167:5: ( TRUE | FALSE )
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
    // /Users/guax/jOrderly/grammar/Orderly.g:171:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:172:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==39) ) {
                    alt29=1;
                }
                else if ( (LA29_1==STRING) ) {
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:172:7: '{' '}'
                    {
                    match(input,38,FOLLOW_38_in_jsonObject1159); 

                    match(input,39,FOLLOW_39_in_jsonObject1161); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:173:7: '{' jsonMemberList '}'
                    {
                    match(input,38,FOLLOW_38_in_jsonObject1169); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject1171);
                    jsonMemberList();

                    state._fsp--;


                    match(input,39,FOLLOW_39_in_jsonObject1173); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:176:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:177:5: ( STRING ':' jsonValue )
            // /Users/guax/jOrderly/grammar/Orderly.g:177:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember1190); 

            match(input,22,FOLLOW_22_in_jsonMember1192); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember1194);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:180:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:181:5: ( jsonMember ( ',' jsonMemberList )? )
            // /Users/guax/jOrderly/grammar/Orderly.g:181:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList1211);
            jsonMember();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:181:18: ( ',' jsonMemberList )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:181:19: ',' jsonMemberList
                    {
                    match(input,21,FOLLOW_21_in_jsonMemberList1214); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList1216);
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
    // /Users/guax/jOrderly/grammar/Orderly.g:184:1: jsonArray : ( '[' ']' | '[' jsonElementList ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:185:5: ( '[' ']' | '[' jsonElementList ']' )
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
                    // /Users/guax/jOrderly/grammar/Orderly.g:185:7: '[' ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1235); 

                    match(input,29,FOLLOW_29_in_jsonArray1237); 

                    }
                    break;
                case 2 :
                    // /Users/guax/jOrderly/grammar/Orderly.g:186:7: '[' jsonElementList ']'
                    {
                    match(input,28,FOLLOW_28_in_jsonArray1245); 

                    pushFollow(FOLLOW_jsonElementList_in_jsonArray1247);
                    jsonElementList();

                    state._fsp--;


                    match(input,29,FOLLOW_29_in_jsonArray1249); 

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
    // /Users/guax/jOrderly/grammar/Orderly.g:189:1: jsonElementList : jsonValue ( ',' jsonValue )* ;
    public final void jsonElementList() throws RecognitionException {
        try {
            // /Users/guax/jOrderly/grammar/Orderly.g:190:5: ( jsonValue ( ',' jsonValue )* )
            // /Users/guax/jOrderly/grammar/Orderly.g:190:7: jsonValue ( ',' jsonValue )*
            {
            pushFollow(FOLLOW_jsonValue_in_jsonElementList1266);
            jsonValue();

            state._fsp--;


            // /Users/guax/jOrderly/grammar/Orderly.g:190:17: ( ',' jsonValue )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /Users/guax/jOrderly/grammar/Orderly.g:190:18: ',' jsonValue
            	    {
            	    match(input,21,FOLLOW_21_in_jsonElementList1269); 

            	    pushFollow(FOLLOW_jsonValue_in_jsonElementList1271);
            	    jsonValue();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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


 

    public static final BitSet FOLLOW_unnamed_entry_in_orderly_schema46 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_orderly_schema48 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_orderly_schema51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_unnamed_entry78 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry82 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_unnamed_entry90 = new BitSet(new long[]{0x000000401B008000L});
    public static final BitSet FOLLOW_range_in_unnamed_entry92 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_unnamed_entry95 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_unnamed_entry98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_values_in_definition_suffix115 = new BitSet(new long[]{0x000000000B000002L});
    public static final BitSet FOLLOW_default_value_in_definition_suffix118 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_requires_in_definition_suffix121 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_optional_marker_in_definition_suffix124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_definition_prefix149 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_definition_prefix162 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_definition_prefix175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_definition_prefix185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definition_prefix195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix210 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix215 = new BitSet(new long[]{0x000000BFC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix217 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix220 = new BitSet(new long[]{0x0000004000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix222 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definition_prefix239 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_definition_prefix243 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix245 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_definition_prefix247 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_range_in_definition_prefix249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_definition_prefix258 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix262 = new BitSet(new long[]{0x000000BFC0002000L});
    public static final BitSet FOLLOW_named_entries_in_definition_prefix264 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix267 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_additional_marker_in_definition_prefix269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_definition_prefix278 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_definition_prefix283 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_definition_prefix285 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_definition_prefix287 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entries_in_definition_prefix289 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_definition_prefix291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_prefix_in_named_entry309 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry311 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_named_entry321 = new BitSet(new long[]{0x0000004000010800L});
    public static final BitSet FOLLOW_range_in_named_entry323 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_named_entry326 = new BitSet(new long[]{0x000000001B008000L});
    public static final BitSet FOLLOW_perl_regex_in_named_entry328 = new BitSet(new long[]{0x000000001B000000L});
    public static final BitSet FOLLOW_definition_suffix_in_named_entry331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_entry_in_named_entries348 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries351 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_named_entry_in_named_entries353 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_named_entries357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries375 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries378 = new BitSet(new long[]{0x0000003FC0002000L});
    public static final BitSet FOLLOW_unnamed_entry_in_unnamed_entries380 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_unnamed_entries384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_name_in_csv_property_names402 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_csv_property_names405 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_property_name_in_csv_property_names407 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_24_in_requires423 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_csv_property_names_in_requires425 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_requires427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_optional_marker441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_additional_marker458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_enum_values475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_default_value492 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_default_value494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range508 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range510 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range512 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range514 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range524 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range526 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range528 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_range538 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_range540 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_NUMBER_in_range542 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_range544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_property_name555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_property_name562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGEX_in_perl_regex575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_jsonObject1159 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_jsonObject1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_jsonObject1169 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject1171 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_jsonObject1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember1190 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_jsonMember1192 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList1211 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonMemberList1214 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1235 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_jsonArray1245 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonElementList_in_jsonArray1247 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_jsonArray1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonValue_in_jsonElementList1266 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_jsonElementList1269 = new BitSet(new long[]{0x0000004010036100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonElementList1271 = new BitSet(new long[]{0x0000000000200002L});

}