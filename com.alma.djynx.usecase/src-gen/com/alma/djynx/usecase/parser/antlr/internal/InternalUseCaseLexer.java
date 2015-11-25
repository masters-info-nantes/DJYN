package com.alma.djynx.usecase.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalUseCaseLexer() {;} 
    public InternalUseCaseLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUseCaseLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:11:7: ( 'Subsystem: ' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:11:9: 'Subsystem: '
            {
            match("Subsystem: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:12:7: ( 'Case: ' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:12:9: 'Case: '
            {
            match("Case: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:13:7: ( 'ExtensionPoint: ' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:13:9: 'ExtensionPoint: '
            {
            match("ExtensionPoint: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:14:7: ( 'Includes: ' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:14:9: 'Includes: '
            {
            match("Includes: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:15:7: ( '{' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:16:7: ( '}' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:17:7: ( 'Extends: ' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:17:9: 'Extends: '
            {
            match("Extends: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:18:7: ( 'Actor: ' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:18:9: 'Actor: '
            {
            match("Actor: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:19:7: ( 'Uses: ' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:19:9: 'Uses: '
            {
            match("Uses: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:20:7: ( ',' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:21:7: ( '0' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:21:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:22:7: ( '1' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:22:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:23:7: ( '2' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:23:9: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:24:7: ( '3' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:24:9: '3'
            {
            match('3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:25:7: ( '4' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:25:9: '4'
            {
            match('4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:26:7: ( '5' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:26:9: '5'
            {
            match('5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:27:7: ( '6' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:27:9: '6'
            {
            match('6'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:28:7: ( '7' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:28:9: '7'
            {
            match('7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:29:7: ( '8' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:29:9: '8'
            {
            match('8'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:30:7: ( '9' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:30:9: '9'
            {
            match('9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:31:7: ( '*' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:31:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:847:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:847:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:847:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:847:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:847:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:849:10: ( ( '0' .. '9' )+ )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:849:12: ( '0' .. '9' )+
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:849:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:849:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:851:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:853:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:853:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:853:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:853:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:41: ( '\\r' )? '\\n'
                    {
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:855:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:857:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:857:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:857:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:859:16: ( . )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:859:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=28;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:136: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:144: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:153: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:165: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:181: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:197: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:1:205: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\35\2\uffff\2\35\1\uffff\1\46\1\50\1\51\1\52\1\53\1\54"+
        "\1\55\1\56\1\57\1\60\1\uffff\1\33\1\uffff\3\33\2\uffff\1\35\1\uffff"+
        "\3\35\2\uffff\2\35\21\uffff\15\35\1\uffff\3\35\1\uffff\4\35\1\uffff"+
        "\6\35\1\uffff\3\35\2\uffff\5\35\1\uffff";
    static final String DFA12_eofS =
        "\137\uffff";
    static final String DFA12_minS =
        "\1\0\1\165\1\141\1\170\1\156\2\uffff\1\143\1\163\1\uffff\12\60"+
        "\1\uffff\1\101\1\uffff\2\0\1\52\2\uffff\1\142\1\uffff\1\163\1\164"+
        "\1\143\2\uffff\1\164\1\145\21\uffff\1\163\2\145\1\154\1\157\1\163"+
        "\1\171\1\72\1\156\1\165\1\162\1\72\1\163\1\uffff\2\144\1\72\1\uffff"+
        "\1\164\1\151\1\163\1\145\1\uffff\1\145\1\157\1\72\1\163\1\155\1"+
        "\156\1\uffff\2\72\1\120\2\uffff\1\157\1\151\1\156\1\164\1\72\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\165\1\141\1\170\1\156\2\uffff\1\143\1\163\1\uffff\12"+
        "\71\1\uffff\1\172\1\uffff\2\uffff\1\57\2\uffff\1\142\1\uffff\1\163"+
        "\1\164\1\143\2\uffff\1\164\1\145\21\uffff\1\163\2\145\1\154\1\157"+
        "\1\163\1\171\1\72\1\156\1\165\1\162\1\72\1\163\1\uffff\1\163\1\144"+
        "\1\72\1\uffff\1\164\1\151\1\163\1\145\1\uffff\1\145\1\157\1\72\1"+
        "\163\1\155\1\156\1\uffff\2\72\1\120\2\uffff\1\157\1\151\1\156\1"+
        "\164\1\72\1\uffff";
    static final String DFA12_acceptS =
        "\5\uffff\1\5\1\6\2\uffff\1\12\12\uffff\1\25\1\uffff\1\26\3\uffff"+
        "\1\33\1\34\1\uffff\1\26\3\uffff\1\5\1\6\2\uffff\1\12\1\13\1\27\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\30\1\31\1\32"+
        "\1\33\15\uffff\1\2\3\uffff\1\11\4\uffff\1\10\6\uffff\1\7\3\uffff"+
        "\1\4\1\1\5\uffff\1\3";
    static final String DFA12_specialS =
        "\1\1\26\uffff\1\0\1\2\106\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\2\33\1"+
            "\24\1\33\1\11\2\33\1\31\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1"+
            "\21\1\22\1\23\7\33\1\7\1\26\1\2\1\26\1\3\3\26\1\4\11\26\1\1"+
            "\1\26\1\10\5\26\3\33\1\25\1\26\1\33\32\26\1\5\1\33\1\6\uff82"+
            "\33",
            "\1\34",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "",
            "\1\43",
            "\1\44",
            "",
            "\12\47",
            "\12\47",
            "\12\47",
            "\12\47",
            "\12\47",
            "\12\47",
            "\12\47",
            "\12\47",
            "\12\47",
            "\12\47",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\0\62",
            "\0\62",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "\1\66",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\112\16\uffff\1\111",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 50;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='S') ) {s = 1;}

                        else if ( (LA12_0=='C') ) {s = 2;}

                        else if ( (LA12_0=='E') ) {s = 3;}

                        else if ( (LA12_0=='I') ) {s = 4;}

                        else if ( (LA12_0=='{') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='A') ) {s = 7;}

                        else if ( (LA12_0=='U') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0=='0') ) {s = 10;}

                        else if ( (LA12_0=='1') ) {s = 11;}

                        else if ( (LA12_0=='2') ) {s = 12;}

                        else if ( (LA12_0=='3') ) {s = 13;}

                        else if ( (LA12_0=='4') ) {s = 14;}

                        else if ( (LA12_0=='5') ) {s = 15;}

                        else if ( (LA12_0=='6') ) {s = 16;}

                        else if ( (LA12_0=='7') ) {s = 17;}

                        else if ( (LA12_0=='8') ) {s = 18;}

                        else if ( (LA12_0=='9') ) {s = 19;}

                        else if ( (LA12_0=='*') ) {s = 20;}

                        else if ( (LA12_0=='^') ) {s = 21;}

                        else if ( (LA12_0=='B'||LA12_0=='D'||(LA12_0>='F' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='R')||LA12_0=='T'||(LA12_0>='V' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {s = 22;}

                        else if ( (LA12_0=='\"') ) {s = 23;}

                        else if ( (LA12_0=='\'') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 26;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<=')')||LA12_0=='+'||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 50;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}