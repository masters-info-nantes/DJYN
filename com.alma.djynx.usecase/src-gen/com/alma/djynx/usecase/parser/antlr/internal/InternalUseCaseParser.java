package com.alma.djynx.usecase.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.alma.djynx.usecase.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Subsystem: '", "'Case: '", "'ExtensionPoint: '", "'Includes: '", "'{'", "'}'", "'Extends: '", "'Actor: '", "'Uses: '", "','", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'*'"
    };
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
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


        public InternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g"; }



     	private UseCaseGrammarAccess grammarAccess;
     	
        public InternalUseCaseParser(TokenStream input, UseCaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "UseCase";	
       	}
       	
       	@Override
       	protected UseCaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleUseCase"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:67:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:68:2: (iv_ruleUseCase= ruleUseCase EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:69:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase75);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:76:1: ruleUseCase returns [EObject current=null] : ( ( (lv_systems_0_0= ruleSubsystem ) )+ ( (lv_actors_1_0= ruleActor ) )* ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        EObject lv_systems_0_0 = null;

        EObject lv_actors_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:79:28: ( ( ( (lv_systems_0_0= ruleSubsystem ) )+ ( (lv_actors_1_0= ruleActor ) )* ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:80:1: ( ( (lv_systems_0_0= ruleSubsystem ) )+ ( (lv_actors_1_0= ruleActor ) )* )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:80:1: ( ( (lv_systems_0_0= ruleSubsystem ) )+ ( (lv_actors_1_0= ruleActor ) )* )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:80:2: ( (lv_systems_0_0= ruleSubsystem ) )+ ( (lv_actors_1_0= ruleActor ) )*
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:80:2: ( (lv_systems_0_0= ruleSubsystem ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:81:1: (lv_systems_0_0= ruleSubsystem )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:81:1: (lv_systems_0_0= ruleSubsystem )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:82:3: lv_systems_0_0= ruleSubsystem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getSystemsSubsystemParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubsystem_in_ruleUseCase131);
            	    lv_systems_0_0=ruleSubsystem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"systems",
            	            		lv_systems_0_0, 
            	            		"Subsystem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:98:3: ( (lv_actors_1_0= ruleActor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:99:1: (lv_actors_1_0= ruleActor )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:99:1: (lv_actors_1_0= ruleActor )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:100:3: lv_actors_1_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorsActorParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_ruleUseCase153);
            	    lv_actors_1_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUseCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actors",
            	            		lv_actors_1_0, 
            	            		"Actor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleSubsystem"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:124:1: entryRuleSubsystem returns [EObject current=null] : iv_ruleSubsystem= ruleSubsystem EOF ;
    public final EObject entryRuleSubsystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsystem = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:125:2: (iv_ruleSubsystem= ruleSubsystem EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:126:2: iv_ruleSubsystem= ruleSubsystem EOF
            {
             newCompositeNode(grammarAccess.getSubsystemRule()); 
            pushFollow(FOLLOW_ruleSubsystem_in_entryRuleSubsystem190);
            iv_ruleSubsystem=ruleSubsystem();

            state._fsp--;

             current =iv_ruleSubsystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsystem200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsystem"


    // $ANTLR start "ruleSubsystem"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:133:1: ruleSubsystem returns [EObject current=null] : (otherlv_0= 'Subsystem: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cases_2_0= ruleCase ) )* ) ;
    public final EObject ruleSubsystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_cases_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:136:28: ( (otherlv_0= 'Subsystem: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cases_2_0= ruleCase ) )* ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:137:1: (otherlv_0= 'Subsystem: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cases_2_0= ruleCase ) )* )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:137:1: (otherlv_0= 'Subsystem: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cases_2_0= ruleCase ) )* )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:137:3: otherlv_0= 'Subsystem: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_cases_2_0= ruleCase ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSubsystem237); 

                	newLeafNode(otherlv_0, grammarAccess.getSubsystemAccess().getSubsystemKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:141:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:142:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:142:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:143:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubsystem254); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubsystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubsystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:159:2: ( (lv_cases_2_0= ruleCase ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:160:1: (lv_cases_2_0= ruleCase )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:160:1: (lv_cases_2_0= ruleCase )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:161:3: lv_cases_2_0= ruleCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSubsystemAccess().getCasesCaseParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCase_in_ruleSubsystem280);
            	    lv_cases_2_0=ruleCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSubsystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_2_0, 
            	            		"Case");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsystem"


    // $ANTLR start "entryRuleCase"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:185:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:186:2: (iv_ruleCase= ruleCase EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:187:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase317);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase327); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:194:1: ruleCase returns [EObject current=null] : (otherlv_0= 'Case: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_extensions_2_0= ruleExtensionPoint ) )* ( (lv_includes_3_0= ruleIncludes ) )* ( (lv_extends_4_0= ruleExtends ) )* ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_extensions_2_0 = null;

        EObject lv_includes_3_0 = null;

        EObject lv_extends_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:197:28: ( (otherlv_0= 'Case: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_extensions_2_0= ruleExtensionPoint ) )* ( (lv_includes_3_0= ruleIncludes ) )* ( (lv_extends_4_0= ruleExtends ) )* ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:198:1: (otherlv_0= 'Case: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_extensions_2_0= ruleExtensionPoint ) )* ( (lv_includes_3_0= ruleIncludes ) )* ( (lv_extends_4_0= ruleExtends ) )* )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:198:1: (otherlv_0= 'Case: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_extensions_2_0= ruleExtensionPoint ) )* ( (lv_includes_3_0= ruleIncludes ) )* ( (lv_extends_4_0= ruleExtends ) )* )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:198:3: otherlv_0= 'Case: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_extensions_2_0= ruleExtensionPoint ) )* ( (lv_includes_3_0= ruleIncludes ) )* ( (lv_extends_4_0= ruleExtends ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleCase364); 

                	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:202:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:203:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:203:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:204:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCase381); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:220:2: ( (lv_extensions_2_0= ruleExtensionPoint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:221:1: (lv_extensions_2_0= ruleExtensionPoint )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:221:1: (lv_extensions_2_0= ruleExtensionPoint )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:222:3: lv_extensions_2_0= ruleExtensionPoint
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getExtensionsExtensionPointParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtensionPoint_in_ruleCase407);
            	    lv_extensions_2_0=ruleExtensionPoint();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extensions",
            	            		lv_extensions_2_0, 
            	            		"ExtensionPoint");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:238:3: ( (lv_includes_3_0= ruleIncludes ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:239:1: (lv_includes_3_0= ruleIncludes )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:239:1: (lv_includes_3_0= ruleIncludes )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:240:3: lv_includes_3_0= ruleIncludes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getIncludesIncludesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIncludes_in_ruleCase429);
            	    lv_includes_3_0=ruleIncludes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_3_0, 
            	            		"Includes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:256:3: ( (lv_extends_4_0= ruleExtends ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:257:1: (lv_extends_4_0= ruleExtends )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:257:1: (lv_extends_4_0= ruleExtends )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:258:3: lv_extends_4_0= ruleExtends
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCaseAccess().getExtendsExtendsParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtends_in_ruleCase451);
            	    lv_extends_4_0=ruleExtends();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extends",
            	            		lv_extends_4_0, 
            	            		"Extends");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleExtensionPoint"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:282:1: entryRuleExtensionPoint returns [EObject current=null] : iv_ruleExtensionPoint= ruleExtensionPoint EOF ;
    public final EObject entryRuleExtensionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtensionPoint = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:283:2: (iv_ruleExtensionPoint= ruleExtensionPoint EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:284:2: iv_ruleExtensionPoint= ruleExtensionPoint EOF
            {
             newCompositeNode(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint488);
            iv_ruleExtensionPoint=ruleExtensionPoint();

            state._fsp--;

             current =iv_ruleExtensionPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionPoint498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtensionPoint"


    // $ANTLR start "ruleExtensionPoint"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:291:1: ruleExtensionPoint returns [EObject current=null] : (otherlv_0= 'ExtensionPoint: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleExtensionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:294:28: ( (otherlv_0= 'ExtensionPoint: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:295:1: (otherlv_0= 'ExtensionPoint: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:295:1: (otherlv_0= 'ExtensionPoint: ' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:295:3: otherlv_0= 'ExtensionPoint: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleExtensionPoint535); 

                	newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:299:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:300:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:300:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtensionPoint552); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtensionPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtensionPoint"


    // $ANTLR start "entryRuleIncludes"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:325:1: entryRuleIncludes returns [EObject current=null] : iv_ruleIncludes= ruleIncludes EOF ;
    public final EObject entryRuleIncludes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludes = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:326:2: (iv_ruleIncludes= ruleIncludes EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:327:2: iv_ruleIncludes= ruleIncludes EOF
            {
             newCompositeNode(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_ruleIncludes_in_entryRuleIncludes593);
            iv_ruleIncludes=ruleIncludes();

            state._fsp--;

             current =iv_ruleIncludes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludes603); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:334:1: ruleIncludes returns [EObject current=null] : (otherlv_0= 'Includes: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleIncludes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_rules_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:337:28: ( (otherlv_0= 'Includes: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:338:1: (otherlv_0= 'Includes: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:338:1: (otherlv_0= 'Includes: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:338:3: otherlv_0= 'Includes: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleIncludes640); 

                	newLeafNode(otherlv_0, grammarAccess.getIncludesAccess().getIncludesKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:342:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:343:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:343:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:344:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIncludes657); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIncludesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleIncludes674); 

                	newLeafNode(otherlv_2, grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:364:1: ( (lv_rules_3_0= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:365:1: (lv_rules_3_0= RULE_ID )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:365:1: (lv_rules_3_0= RULE_ID )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:366:3: lv_rules_3_0= RULE_ID
            	    {
            	    lv_rules_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIncludes691); 

            	    			newLeafNode(lv_rules_3_0, grammarAccess.getIncludesAccess().getRulesIDTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIncludesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"rules",
            	            		lv_rules_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleIncludes709); 

                	newLeafNode(otherlv_4, grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleExtends"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:394:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:395:2: (iv_ruleExtends= ruleExtends EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:396:2: iv_ruleExtends= ruleExtends EOF
            {
             newCompositeNode(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_ruleExtends_in_entryRuleExtends745);
            iv_ruleExtends=ruleExtends();

            state._fsp--;

             current =iv_ruleExtends; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtends755); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:403:1: ruleExtends returns [EObject current=null] : (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' ) ;
    public final EObject ruleExtends() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_rules_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:406:28: ( (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:407:1: (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:407:1: (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:407:3: otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_rules_3_0= RULE_ID ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleExtends792); 

                	newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:411:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:412:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:412:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:413:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtends809); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExtendsAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExtendsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExtends826); 

                	newLeafNode(otherlv_2, grammarAccess.getExtendsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:433:1: ( (lv_rules_3_0= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:434:1: (lv_rules_3_0= RULE_ID )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:434:1: (lv_rules_3_0= RULE_ID )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:435:3: lv_rules_3_0= RULE_ID
            	    {
            	    lv_rules_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtends843); 

            	    			newLeafNode(lv_rules_3_0, grammarAccess.getExtendsAccess().getRulesIDTerminalRuleCall_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtendsRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"rules",
            	            		lv_rules_3_0, 
            	            		"ID");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleExtends861); 

                	newLeafNode(otherlv_4, grammarAccess.getExtendsAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRuleActor"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:463:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:464:2: (iv_ruleActor= ruleActor EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:465:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor897);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor907); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:472:1: ruleActor returns [EObject current=null] : (otherlv_0= 'Actor: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inheritances_2_0= ruleInheritance ) )* ( (lv_uses_3_0= ruleUses ) )* ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_inheritances_2_0 = null;

        EObject lv_uses_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:475:28: ( (otherlv_0= 'Actor: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inheritances_2_0= ruleInheritance ) )* ( (lv_uses_3_0= ruleUses ) )* ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:476:1: (otherlv_0= 'Actor: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inheritances_2_0= ruleInheritance ) )* ( (lv_uses_3_0= ruleUses ) )* )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:476:1: (otherlv_0= 'Actor: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inheritances_2_0= ruleInheritance ) )* ( (lv_uses_3_0= ruleUses ) )* )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:476:3: otherlv_0= 'Actor: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_inheritances_2_0= ruleInheritance ) )* ( (lv_uses_3_0= ruleUses ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleActor944); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:480:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:481:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:481:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:482:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor961); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:498:2: ( (lv_inheritances_2_0= ruleInheritance ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:499:1: (lv_inheritances_2_0= ruleInheritance )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:499:1: (lv_inheritances_2_0= ruleInheritance )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:500:3: lv_inheritances_2_0= ruleInheritance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getInheritancesInheritanceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInheritance_in_ruleActor987);
            	    lv_inheritances_2_0=ruleInheritance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"inheritances",
            	            		lv_inheritances_2_0, 
            	            		"Inheritance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:516:3: ( (lv_uses_3_0= ruleUses ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:517:1: (lv_uses_3_0= ruleUses )
            	    {
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:517:1: (lv_uses_3_0= ruleUses )
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:518:3: lv_uses_3_0= ruleUses
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getUsesUsesParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUses_in_ruleActor1009);
            	    lv_uses_3_0=ruleUses();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uses",
            	            		lv_uses_3_0, 
            	            		"Uses");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleInheritance"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:542:1: entryRuleInheritance returns [EObject current=null] : iv_ruleInheritance= ruleInheritance EOF ;
    public final EObject entryRuleInheritance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInheritance = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:543:2: (iv_ruleInheritance= ruleInheritance EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:544:2: iv_ruleInheritance= ruleInheritance EOF
            {
             newCompositeNode(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance1046);
            iv_ruleInheritance=ruleInheritance();

            state._fsp--;

             current =iv_ruleInheritance; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance1056); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInheritance"


    // $ANTLR start "ruleInheritance"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:551:1: ruleInheritance returns [EObject current=null] : (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleInheritance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:554:28: ( (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:555:1: (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:555:1: (otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:555:3: otherlv_0= 'Extends: ' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleInheritance1093); 

                	newLeafNode(otherlv_0, grammarAccess.getInheritanceAccess().getExtendsKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:559:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:560:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:560:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:561:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInheritance1110); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInheritanceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInheritanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInheritance"


    // $ANTLR start "entryRuleUses"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:585:1: entryRuleUses returns [EObject current=null] : iv_ruleUses= ruleUses EOF ;
    public final EObject entryRuleUses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUses = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:586:2: (iv_ruleUses= ruleUses EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:587:2: iv_ruleUses= ruleUses EOF
            {
             newCompositeNode(grammarAccess.getUsesRule()); 
            pushFollow(FOLLOW_ruleUses_in_entryRuleUses1151);
            iv_ruleUses=ruleUses();

            state._fsp--;

             current =iv_ruleUses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUses1161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUses"


    // $ANTLR start "ruleUses"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:594:1: ruleUses returns [EObject current=null] : (otherlv_0= 'Uses: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ) ;
    public final EObject ruleUses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_multiplicity_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:597:28: ( (otherlv_0= 'Uses: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:598:1: (otherlv_0= 'Uses: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:598:1: (otherlv_0= 'Uses: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )? )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:598:3: otherlv_0= 'Uses: ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleUses1198); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesAccess().getUsesKeyword_0());
                
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:602:1: ( (lv_name_1_0= RULE_ID ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:603:1: (lv_name_1_0= RULE_ID )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:603:1: (lv_name_1_0= RULE_ID )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:604:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUses1215); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUsesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUsesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:620:2: ( (lv_multiplicity_2_0= ruleMultiplicity ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15||LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:621:1: (lv_multiplicity_2_0= ruleMultiplicity )
                    {
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:621:1: (lv_multiplicity_2_0= ruleMultiplicity )
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:622:3: lv_multiplicity_2_0= ruleMultiplicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getUsesAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleUses1241);
                    lv_multiplicity_2_0=ruleMultiplicity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUsesRule());
                    	        }
                           		set(
                           			current, 
                           			"multiplicity",
                            		lv_multiplicity_2_0, 
                            		"Multiplicity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUses"


    // $ANTLR start "entryRuleMultiplicity"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:646:1: entryRuleMultiplicity returns [String current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final String entryRuleMultiplicity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicity = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:647:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:648:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity1279);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity1290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:655:1: ruleMultiplicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' this_Number_1= ruleNumber ) | (this_Star_2= ruleStar ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )? kw= '}' ) ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Number_1 = null;

        AntlrDatatypeRuleToken this_Star_2 = null;

        AntlrDatatypeRuleToken this_Number_4 = null;

        AntlrDatatypeRuleToken this_Star_5 = null;


         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:658:28: ( ( (kw= '{' this_Number_1= ruleNumber ) | (this_Star_2= ruleStar ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )? kw= '}' ) ) )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:659:1: ( (kw= '{' this_Number_1= ruleNumber ) | (this_Star_2= ruleStar ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )? kw= '}' ) )
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:659:1: ( (kw= '{' this_Number_1= ruleNumber ) | (this_Star_2= ruleStar ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )? kw= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:659:2: (kw= '{' this_Number_1= ruleNumber )
                    {
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:659:2: (kw= '{' this_Number_1= ruleNumber )
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:660:2: kw= '{' this_Number_1= ruleNumber
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleMultiplicity1329); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplicityAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleNumber_in_ruleMultiplicity1351);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                    		current.merge(this_Number_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:677:6: (this_Star_2= ruleStar ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )? kw= '}' )
                    {
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:677:6: (this_Star_2= ruleStar ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )? kw= '}' )
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:678:5: this_Star_2= ruleStar ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )? kw= '}'
                    {
                     
                            newCompositeNode(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleStar_in_ruleMultiplicity1386);
                    this_Star_2=ruleStar();

                    state._fsp--;


                    		current.merge(this_Star_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:688:1: ( (kw= ',' this_Number_4= ruleNumber ) | this_Star_5= ruleStar )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==20) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==31) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:688:2: (kw= ',' this_Number_4= ruleNumber )
                            {
                            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:688:2: (kw= ',' this_Number_4= ruleNumber )
                            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:689:2: kw= ',' this_Number_4= ruleNumber
                            {
                            kw=(Token)match(input,20,FOLLOW_20_in_ruleMultiplicity1406); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMultiplicityAccess().getCommaKeyword_1_1_0_0()); 
                                
                             
                                    newCompositeNode(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_1_1_0_1()); 
                                
                            pushFollow(FOLLOW_ruleNumber_in_ruleMultiplicity1428);
                            this_Number_4=ruleNumber();

                            state._fsp--;


                            		current.merge(this_Number_4);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:707:5: this_Star_5= ruleStar
                            {
                             
                                    newCompositeNode(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_1_1()); 
                                
                            pushFollow(FOLLOW_ruleStar_in_ruleMultiplicity1462);
                            this_Star_5=ruleStar();

                            state._fsp--;


                            		current.merge(this_Star_5);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    kw=(Token)match(input,16,FOLLOW_16_in_ruleMultiplicity1482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMultiplicityAccess().getRightCurlyBracketKeyword_1_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleNumber"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:731:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:732:2: (iv_ruleNumber= ruleNumber EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:733:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber1524);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber1535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:740:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:743:28: ( (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )* )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:744:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )*
            {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:744:1: (kw= '0' | kw= '1' | kw= '2' | kw= '3' | kw= '4' | kw= '5' | kw= '6' | kw= '7' | kw= '8' | kw= '9' )*
            loop14:
            do {
                int alt14=11;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    alt14=1;
                    }
                    break;
                case 22:
                    {
                    alt14=2;
                    }
                    break;
                case 23:
                    {
                    alt14=3;
                    }
                    break;
                case 24:
                    {
                    alt14=4;
                    }
                    break;
                case 25:
                    {
                    alt14=5;
                    }
                    break;
                case 26:
                    {
                    alt14=6;
                    }
                    break;
                case 27:
                    {
                    alt14=7;
                    }
                    break;
                case 28:
                    {
                    alt14=8;
                    }
                    break;
                case 29:
                    {
                    alt14=9;
                    }
                    break;
                case 30:
                    {
                    alt14=10;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:745:2: kw= '0'
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleNumber1573); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitZeroKeyword_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:752:2: kw= '1'
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleNumber1592); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitOneKeyword_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:759:2: kw= '2'
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleNumber1611); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitTwoKeyword_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:766:2: kw= '3'
            	    {
            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleNumber1630); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitThreeKeyword_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:773:2: kw= '4'
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleNumber1649); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFourKeyword_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:780:2: kw= '5'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleNumber1668); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFiveKeyword_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:787:2: kw= '6'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_27_in_ruleNumber1687); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSixKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:794:2: kw= '7'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_28_in_ruleNumber1706); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSevenKeyword_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:801:2: kw= '8'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_29_in_ruleNumber1725); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitEightKeyword_8()); 
            	        

            	    }
            	    break;
            	case 10 :
            	    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:808:2: kw= '9'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleNumber1744); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getNumberAccess().getDigitNineKeyword_9()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleStar"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:821:1: entryRuleStar returns [String current=null] : iv_ruleStar= ruleStar EOF ;
    public final String entryRuleStar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStar = null;


        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:822:2: (iv_ruleStar= ruleStar EOF )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:823:2: iv_ruleStar= ruleStar EOF
            {
             newCompositeNode(grammarAccess.getStarRule()); 
            pushFollow(FOLLOW_ruleStar_in_entryRuleStar1786);
            iv_ruleStar=ruleStar();

            state._fsp--;

             current =iv_ruleStar.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStar1797); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStar"


    // $ANTLR start "ruleStar"
    // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:830:1: ruleStar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken ruleStar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:833:28: (kw= '*' )
            // ../com.alma.djynx.usecase/src-gen/com/alma/djynx/usecase/parser/antlr/internal/InternalUseCase.g:835:2: kw= '*'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleStar1834); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getStarAccess().getAsteriskKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStar"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsystem_in_ruleUseCase131 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_ruleActor_in_ruleUseCase153 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleSubsystem_in_entryRuleSubsystem190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsystem200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSubsystem237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubsystem254 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleCase_in_ruleSubsystem280 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleCase364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCase381 = new BitSet(new long[]{0x0000000000026002L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_ruleCase407 = new BitSet(new long[]{0x0000000000026002L});
    public static final BitSet FOLLOW_ruleIncludes_in_ruleCase429 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_ruleExtends_in_ruleCase451 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionPoint498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleExtensionPoint535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtensionPoint552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludes_in_entryRuleIncludes593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludes603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIncludes640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIncludes657 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIncludes674 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIncludes691 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleIncludes709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtends_in_entryRuleExtends745 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtends755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleExtends792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtends809 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExtends826 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtends843 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleExtends861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleActor944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor961 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_ruleInheritance_in_ruleActor987 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_ruleUses_in_ruleActor1009 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleInheritance1093 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInheritance1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUses_in_entryRuleUses1151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUses1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUses1198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUses1215 = new BitSet(new long[]{0x0000000080008002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleUses1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity1279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMultiplicity1329 = new BitSet(new long[]{0x000000007FE00000L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleMultiplicity1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStar_in_ruleMultiplicity1386 = new BitSet(new long[]{0x0000000080118000L});
    public static final BitSet FOLLOW_20_in_ruleMultiplicity1406 = new BitSet(new long[]{0x000000007FE10000L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleMultiplicity1428 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleStar_in_ruleMultiplicity1462 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultiplicity1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber1524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNumber1573 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_22_in_ruleNumber1592 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_23_in_ruleNumber1611 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_24_in_ruleNumber1630 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_25_in_ruleNumber1649 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_26_in_ruleNumber1668 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_27_in_ruleNumber1687 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_28_in_ruleNumber1706 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_29_in_ruleNumber1725 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_30_in_ruleNumber1744 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_ruleStar_in_entryRuleStar1786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStar1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStar1834 = new BitSet(new long[]{0x0000000000000002L});

}