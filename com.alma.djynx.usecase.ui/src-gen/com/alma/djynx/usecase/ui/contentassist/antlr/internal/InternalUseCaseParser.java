package com.alma.djynx.usecase.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.alma.djynx.usecase.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'Subsystem: '", "'Case: '", "'ExtensionPoint: '", "'Includes: '", "'{'", "'}'", "'Extends: '", "'Actor: '", "'Uses: '", "','"
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
    public String getGrammarFileName() { return "../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g"; }


     
     	private UseCaseGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(UseCaseGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleUseCase"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:60:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:61:1: ( ruleUseCase EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:62:1: ruleUseCase EOF
            {
             before(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_ruleUseCase_in_entryRuleUseCase61);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUseCase68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:69:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:73:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:74:1: ( ( rule__UseCase__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:74:1: ( ( rule__UseCase__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:75:1: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:76:1: ( rule__UseCase__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:76:2: rule__UseCase__Group__0
            {
            pushFollow(FOLLOW_rule__UseCase__Group__0_in_ruleUseCase94);
            rule__UseCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleSubsystem"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:88:1: entryRuleSubsystem : ruleSubsystem EOF ;
    public final void entryRuleSubsystem() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:89:1: ( ruleSubsystem EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:90:1: ruleSubsystem EOF
            {
             before(grammarAccess.getSubsystemRule()); 
            pushFollow(FOLLOW_ruleSubsystem_in_entryRuleSubsystem121);
            ruleSubsystem();

            state._fsp--;

             after(grammarAccess.getSubsystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubsystem128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubsystem"


    // $ANTLR start "ruleSubsystem"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:97:1: ruleSubsystem : ( ( rule__Subsystem__Group__0 ) ) ;
    public final void ruleSubsystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:101:2: ( ( ( rule__Subsystem__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:102:1: ( ( rule__Subsystem__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:102:1: ( ( rule__Subsystem__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:103:1: ( rule__Subsystem__Group__0 )
            {
             before(grammarAccess.getSubsystemAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:104:1: ( rule__Subsystem__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:104:2: rule__Subsystem__Group__0
            {
            pushFollow(FOLLOW_rule__Subsystem__Group__0_in_ruleSubsystem154);
            rule__Subsystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubsystem"


    // $ANTLR start "entryRuleCase"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:116:1: entryRuleCase : ruleCase EOF ;
    public final void entryRuleCase() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:117:1: ( ruleCase EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:118:1: ruleCase EOF
            {
             before(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase181);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getCaseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:125:1: ruleCase : ( ( rule__Case__Group__0 ) ) ;
    public final void ruleCase() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:129:2: ( ( ( rule__Case__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:130:1: ( ( rule__Case__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:130:1: ( ( rule__Case__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:131:1: ( rule__Case__Group__0 )
            {
             before(grammarAccess.getCaseAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:132:1: ( rule__Case__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:132:2: rule__Case__Group__0
            {
            pushFollow(FOLLOW_rule__Case__Group__0_in_ruleCase214);
            rule__Case__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleExtensionPoint"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:144:1: entryRuleExtensionPoint : ruleExtensionPoint EOF ;
    public final void entryRuleExtensionPoint() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:145:1: ( ruleExtensionPoint EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:146:1: ruleExtensionPoint EOF
            {
             before(grammarAccess.getExtensionPointRule()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint241);
            ruleExtensionPoint();

            state._fsp--;

             after(grammarAccess.getExtensionPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtensionPoint248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtensionPoint"


    // $ANTLR start "ruleExtensionPoint"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:153:1: ruleExtensionPoint : ( ( rule__ExtensionPoint__Group__0 ) ) ;
    public final void ruleExtensionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:157:2: ( ( ( rule__ExtensionPoint__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:158:1: ( ( rule__ExtensionPoint__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:158:1: ( ( rule__ExtensionPoint__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:159:1: ( rule__ExtensionPoint__Group__0 )
            {
             before(grammarAccess.getExtensionPointAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:160:1: ( rule__ExtensionPoint__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:160:2: rule__ExtensionPoint__Group__0
            {
            pushFollow(FOLLOW_rule__ExtensionPoint__Group__0_in_ruleExtensionPoint274);
            rule__ExtensionPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtensionPointAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtensionPoint"


    // $ANTLR start "entryRuleIncludes"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:172:1: entryRuleIncludes : ruleIncludes EOF ;
    public final void entryRuleIncludes() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:173:1: ( ruleIncludes EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:174:1: ruleIncludes EOF
            {
             before(grammarAccess.getIncludesRule()); 
            pushFollow(FOLLOW_ruleIncludes_in_entryRuleIncludes301);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getIncludesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIncludes308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIncludes"


    // $ANTLR start "ruleIncludes"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:181:1: ruleIncludes : ( ( rule__Includes__Group__0 ) ) ;
    public final void ruleIncludes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:185:2: ( ( ( rule__Includes__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:186:1: ( ( rule__Includes__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:186:1: ( ( rule__Includes__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:187:1: ( rule__Includes__Group__0 )
            {
             before(grammarAccess.getIncludesAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:188:1: ( rule__Includes__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:188:2: rule__Includes__Group__0
            {
            pushFollow(FOLLOW_rule__Includes__Group__0_in_ruleIncludes334);
            rule__Includes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncludes"


    // $ANTLR start "entryRuleExtends"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:200:1: entryRuleExtends : ruleExtends EOF ;
    public final void entryRuleExtends() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:201:1: ( ruleExtends EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:202:1: ruleExtends EOF
            {
             before(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_ruleExtends_in_entryRuleExtends361);
            ruleExtends();

            state._fsp--;

             after(grammarAccess.getExtendsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtends368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:209:1: ruleExtends : ( ( rule__Extends__Group__0 ) ) ;
    public final void ruleExtends() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:213:2: ( ( ( rule__Extends__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:214:1: ( ( rule__Extends__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:214:1: ( ( rule__Extends__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:215:1: ( rule__Extends__Group__0 )
            {
             before(grammarAccess.getExtendsAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:216:1: ( rule__Extends__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:216:2: rule__Extends__Group__0
            {
            pushFollow(FOLLOW_rule__Extends__Group__0_in_ruleExtends394);
            rule__Extends__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRuleActor"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:228:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:229:1: ( ruleActor EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:230:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor421);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:237:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:241:2: ( ( ( rule__Actor__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:242:1: ( ( rule__Actor__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:242:1: ( ( rule__Actor__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:243:1: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:244:1: ( rule__Actor__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:244:2: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor454);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleInheritance"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:256:1: entryRuleInheritance : ruleInheritance EOF ;
    public final void entryRuleInheritance() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:257:1: ( ruleInheritance EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:258:1: ruleInheritance EOF
            {
             before(grammarAccess.getInheritanceRule()); 
            pushFollow(FOLLOW_ruleInheritance_in_entryRuleInheritance481);
            ruleInheritance();

            state._fsp--;

             after(grammarAccess.getInheritanceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInheritance488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInheritance"


    // $ANTLR start "ruleInheritance"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:265:1: ruleInheritance : ( ( rule__Inheritance__Group__0 ) ) ;
    public final void ruleInheritance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:269:2: ( ( ( rule__Inheritance__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:270:1: ( ( rule__Inheritance__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:270:1: ( ( rule__Inheritance__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:271:1: ( rule__Inheritance__Group__0 )
            {
             before(grammarAccess.getInheritanceAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:272:1: ( rule__Inheritance__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:272:2: rule__Inheritance__Group__0
            {
            pushFollow(FOLLOW_rule__Inheritance__Group__0_in_ruleInheritance514);
            rule__Inheritance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInheritance"


    // $ANTLR start "entryRuleUses"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:284:1: entryRuleUses : ruleUses EOF ;
    public final void entryRuleUses() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:285:1: ( ruleUses EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:286:1: ruleUses EOF
            {
             before(grammarAccess.getUsesRule()); 
            pushFollow(FOLLOW_ruleUses_in_entryRuleUses541);
            ruleUses();

            state._fsp--;

             after(grammarAccess.getUsesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUses548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUses"


    // $ANTLR start "ruleUses"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:293:1: ruleUses : ( ( rule__Uses__Group__0 ) ) ;
    public final void ruleUses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:297:2: ( ( ( rule__Uses__Group__0 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:298:1: ( ( rule__Uses__Group__0 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:298:1: ( ( rule__Uses__Group__0 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:299:1: ( rule__Uses__Group__0 )
            {
             before(grammarAccess.getUsesAccess().getGroup()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:300:1: ( rule__Uses__Group__0 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:300:2: rule__Uses__Group__0
            {
            pushFollow(FOLLOW_rule__Uses__Group__0_in_ruleUses574);
            rule__Uses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUses"


    // $ANTLR start "entryRuleMultiplicity"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:312:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:313:1: ( ruleMultiplicity EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:314:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity601);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:321:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:325:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:326:1: ( ( rule__Multiplicity__Alternatives ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:326:1: ( ( rule__Multiplicity__Alternatives ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:327:1: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:328:1: ( rule__Multiplicity__Alternatives )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:328:2: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity634);
            rule__Multiplicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleNumber"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:340:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:341:1: ( ruleNumber EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:342:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber661);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:349:1: ruleNumber : ( ( rule__Number__Alternatives )* ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:353:2: ( ( ( rule__Number__Alternatives )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:354:1: ( ( rule__Number__Alternatives )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:354:1: ( ( rule__Number__Alternatives )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:355:1: ( rule__Number__Alternatives )*
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:356:1: ( rule__Number__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:356:2: rule__Number__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Number__Alternatives_in_ruleNumber694);
            	    rule__Number__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleStar"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:368:1: entryRuleStar : ruleStar EOF ;
    public final void entryRuleStar() throws RecognitionException {
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:369:1: ( ruleStar EOF )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:370:1: ruleStar EOF
            {
             before(grammarAccess.getStarRule()); 
            pushFollow(FOLLOW_ruleStar_in_entryRuleStar722);
            ruleStar();

            state._fsp--;

             after(grammarAccess.getStarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStar729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStar"


    // $ANTLR start "ruleStar"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:377:1: ruleStar : ( '*' ) ;
    public final void ruleStar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:381:2: ( ( '*' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:382:1: ( '*' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:382:1: ( '*' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:383:1: '*'
            {
             before(grammarAccess.getStarAccess().getAsteriskKeyword()); 
            match(input,11,FOLLOW_11_in_ruleStar756); 
             after(grammarAccess.getStarAccess().getAsteriskKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStar"


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:398:1: rule__Multiplicity__Alternatives : ( ( ( rule__Multiplicity__Group_0__0 ) ) | ( ( rule__Multiplicity__Group_1__0 ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:402:1: ( ( ( rule__Multiplicity__Group_0__0 ) ) | ( ( rule__Multiplicity__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:403:1: ( ( rule__Multiplicity__Group_0__0 ) )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:403:1: ( ( rule__Multiplicity__Group_0__0 ) )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:404:1: ( rule__Multiplicity__Group_0__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_0()); 
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:405:1: ( rule__Multiplicity__Group_0__0 )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:405:2: rule__Multiplicity__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__Group_0__0_in_rule__Multiplicity__Alternatives793);
                    rule__Multiplicity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:409:6: ( ( rule__Multiplicity__Group_1__0 ) )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:409:6: ( ( rule__Multiplicity__Group_1__0 ) )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:410:1: ( rule__Multiplicity__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_1()); 
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:411:1: ( rule__Multiplicity__Group_1__0 )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:411:2: rule__Multiplicity__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__Group_1__0_in_rule__Multiplicity__Alternatives811);
                    rule__Multiplicity__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getGroup_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives"


    // $ANTLR start "rule__Multiplicity__Alternatives_1_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:420:1: rule__Multiplicity__Alternatives_1_1 : ( ( ( rule__Multiplicity__Group_1_1_0__0 ) ) | ( ruleStar ) );
    public final void rule__Multiplicity__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:424:1: ( ( ( rule__Multiplicity__Group_1_1_0__0 ) ) | ( ruleStar ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:425:1: ( ( rule__Multiplicity__Group_1_1_0__0 ) )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:425:1: ( ( rule__Multiplicity__Group_1_1_0__0 ) )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:426:1: ( rule__Multiplicity__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_1_1_0()); 
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:427:1: ( rule__Multiplicity__Group_1_1_0__0 )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:427:2: rule__Multiplicity__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__Group_1_1_0__0_in_rule__Multiplicity__Alternatives_1_1844);
                    rule__Multiplicity__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:431:6: ( ruleStar )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:431:6: ( ruleStar )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:432:1: ruleStar
                    {
                     before(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_1_1()); 
                    pushFollow(FOLLOW_ruleStar_in_rule__Multiplicity__Alternatives_1_1862);
                    ruleStar();

                    state._fsp--;

                     after(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_1_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives_1_1"


    // $ANTLR start "rule__Number__Alternatives"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:442:1: rule__Number__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:446:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            case 19:
                {
                alt4=8;
                }
                break;
            case 20:
                {
                alt4=9;
                }
                break;
            case 21:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:447:1: ( '0' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:447:1: ( '0' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:448:1: '0'
                    {
                     before(grammarAccess.getNumberAccess().getDigitZeroKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Number__Alternatives895); 
                     after(grammarAccess.getNumberAccess().getDigitZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:455:6: ( '1' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:455:6: ( '1' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:456:1: '1'
                    {
                     before(grammarAccess.getNumberAccess().getDigitOneKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Number__Alternatives915); 
                     after(grammarAccess.getNumberAccess().getDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:463:6: ( '2' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:463:6: ( '2' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:464:1: '2'
                    {
                     before(grammarAccess.getNumberAccess().getDigitTwoKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__Number__Alternatives935); 
                     after(grammarAccess.getNumberAccess().getDigitTwoKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:471:6: ( '3' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:471:6: ( '3' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:472:1: '3'
                    {
                     before(grammarAccess.getNumberAccess().getDigitThreeKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__Number__Alternatives955); 
                     after(grammarAccess.getNumberAccess().getDigitThreeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:479:6: ( '4' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:479:6: ( '4' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:480:1: '4'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFourKeyword_4()); 
                    match(input,16,FOLLOW_16_in_rule__Number__Alternatives975); 
                     after(grammarAccess.getNumberAccess().getDigitFourKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:487:6: ( '5' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:487:6: ( '5' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:488:1: '5'
                    {
                     before(grammarAccess.getNumberAccess().getDigitFiveKeyword_5()); 
                    match(input,17,FOLLOW_17_in_rule__Number__Alternatives995); 
                     after(grammarAccess.getNumberAccess().getDigitFiveKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:495:6: ( '6' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:495:6: ( '6' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:496:1: '6'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSixKeyword_6()); 
                    match(input,18,FOLLOW_18_in_rule__Number__Alternatives1015); 
                     after(grammarAccess.getNumberAccess().getDigitSixKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:503:6: ( '7' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:503:6: ( '7' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:504:1: '7'
                    {
                     before(grammarAccess.getNumberAccess().getDigitSevenKeyword_7()); 
                    match(input,19,FOLLOW_19_in_rule__Number__Alternatives1035); 
                     after(grammarAccess.getNumberAccess().getDigitSevenKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:511:6: ( '8' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:511:6: ( '8' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:512:1: '8'
                    {
                     before(grammarAccess.getNumberAccess().getDigitEightKeyword_8()); 
                    match(input,20,FOLLOW_20_in_rule__Number__Alternatives1055); 
                     after(grammarAccess.getNumberAccess().getDigitEightKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:519:6: ( '9' )
                    {
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:519:6: ( '9' )
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:520:1: '9'
                    {
                     before(grammarAccess.getNumberAccess().getDigitNineKeyword_9()); 
                    match(input,21,FOLLOW_21_in_rule__Number__Alternatives1075); 
                     after(grammarAccess.getNumberAccess().getDigitNineKeyword_9()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__UseCase__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:534:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:538:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:539:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__01107);
            rule__UseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__01110);
            rule__UseCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0"


    // $ANTLR start "rule__UseCase__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:546:1: rule__UseCase__Group__0__Impl : ( ( rule__UseCase__SystemsAssignment_0 )* ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:550:1: ( ( ( rule__UseCase__SystemsAssignment_0 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:551:1: ( ( rule__UseCase__SystemsAssignment_0 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:551:1: ( ( rule__UseCase__SystemsAssignment_0 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:552:1: ( rule__UseCase__SystemsAssignment_0 )*
            {
             before(grammarAccess.getUseCaseAccess().getSystemsAssignment_0()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:553:1: ( rule__UseCase__SystemsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:553:2: rule__UseCase__SystemsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__UseCase__SystemsAssignment_0_in_rule__UseCase__Group__0__Impl1137);
            	    rule__UseCase__SystemsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getSystemsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0__Impl"


    // $ANTLR start "rule__UseCase__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:563:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:567:1: ( rule__UseCase__Group__1__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:568:2: rule__UseCase__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__11168);
            rule__UseCase__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1"


    // $ANTLR start "rule__UseCase__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:574:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__ActorsAssignment_1 )* ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:578:1: ( ( ( rule__UseCase__ActorsAssignment_1 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:579:1: ( ( rule__UseCase__ActorsAssignment_1 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:579:1: ( ( rule__UseCase__ActorsAssignment_1 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:580:1: ( rule__UseCase__ActorsAssignment_1 )*
            {
             before(grammarAccess.getUseCaseAccess().getActorsAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:581:1: ( rule__UseCase__ActorsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:581:2: rule__UseCase__ActorsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__UseCase__ActorsAssignment_1_in_rule__UseCase__Group__1__Impl1195);
            	    rule__UseCase__ActorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getActorsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1__Impl"


    // $ANTLR start "rule__Subsystem__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:595:1: rule__Subsystem__Group__0 : rule__Subsystem__Group__0__Impl rule__Subsystem__Group__1 ;
    public final void rule__Subsystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:599:1: ( rule__Subsystem__Group__0__Impl rule__Subsystem__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:600:2: rule__Subsystem__Group__0__Impl rule__Subsystem__Group__1
            {
            pushFollow(FOLLOW_rule__Subsystem__Group__0__Impl_in_rule__Subsystem__Group__01230);
            rule__Subsystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subsystem__Group__1_in_rule__Subsystem__Group__01233);
            rule__Subsystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__Group__0"


    // $ANTLR start "rule__Subsystem__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:607:1: rule__Subsystem__Group__0__Impl : ( 'Subsystem: ' ) ;
    public final void rule__Subsystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:611:1: ( ( 'Subsystem: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:612:1: ( 'Subsystem: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:612:1: ( 'Subsystem: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:613:1: 'Subsystem: '
            {
             before(grammarAccess.getSubsystemAccess().getSubsystemKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Subsystem__Group__0__Impl1261); 
             after(grammarAccess.getSubsystemAccess().getSubsystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__Group__0__Impl"


    // $ANTLR start "rule__Subsystem__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:626:1: rule__Subsystem__Group__1 : rule__Subsystem__Group__1__Impl rule__Subsystem__Group__2 ;
    public final void rule__Subsystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:630:1: ( rule__Subsystem__Group__1__Impl rule__Subsystem__Group__2 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:631:2: rule__Subsystem__Group__1__Impl rule__Subsystem__Group__2
            {
            pushFollow(FOLLOW_rule__Subsystem__Group__1__Impl_in_rule__Subsystem__Group__11292);
            rule__Subsystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subsystem__Group__2_in_rule__Subsystem__Group__11295);
            rule__Subsystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__Group__1"


    // $ANTLR start "rule__Subsystem__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:638:1: rule__Subsystem__Group__1__Impl : ( ( rule__Subsystem__NameAssignment_1 ) ) ;
    public final void rule__Subsystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:642:1: ( ( ( rule__Subsystem__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:643:1: ( ( rule__Subsystem__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:643:1: ( ( rule__Subsystem__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:644:1: ( rule__Subsystem__NameAssignment_1 )
            {
             before(grammarAccess.getSubsystemAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:645:1: ( rule__Subsystem__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:645:2: rule__Subsystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Subsystem__NameAssignment_1_in_rule__Subsystem__Group__1__Impl1322);
            rule__Subsystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__Group__1__Impl"


    // $ANTLR start "rule__Subsystem__Group__2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:655:1: rule__Subsystem__Group__2 : rule__Subsystem__Group__2__Impl ;
    public final void rule__Subsystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:659:1: ( rule__Subsystem__Group__2__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:660:2: rule__Subsystem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Subsystem__Group__2__Impl_in_rule__Subsystem__Group__21352);
            rule__Subsystem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__Group__2"


    // $ANTLR start "rule__Subsystem__Group__2__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:666:1: rule__Subsystem__Group__2__Impl : ( ( rule__Subsystem__CasesAssignment_2 )* ) ;
    public final void rule__Subsystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:670:1: ( ( ( rule__Subsystem__CasesAssignment_2 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:671:1: ( ( rule__Subsystem__CasesAssignment_2 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:671:1: ( ( rule__Subsystem__CasesAssignment_2 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:672:1: ( rule__Subsystem__CasesAssignment_2 )*
            {
             before(grammarAccess.getSubsystemAccess().getCasesAssignment_2()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:673:1: ( rule__Subsystem__CasesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:673:2: rule__Subsystem__CasesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Subsystem__CasesAssignment_2_in_rule__Subsystem__Group__2__Impl1379);
            	    rule__Subsystem__CasesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSubsystemAccess().getCasesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:689:1: rule__Case__Group__0 : rule__Case__Group__0__Impl rule__Case__Group__1 ;
    public final void rule__Case__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:693:1: ( rule__Case__Group__0__Impl rule__Case__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:694:2: rule__Case__Group__0__Impl rule__Case__Group__1
            {
            pushFollow(FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__01416);
            rule__Case__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__1_in_rule__Case__Group__01419);
            rule__Case__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0"


    // $ANTLR start "rule__Case__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:701:1: rule__Case__Group__0__Impl : ( 'Case: ' ) ;
    public final void rule__Case__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:705:1: ( ( 'Case: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:706:1: ( 'Case: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:706:1: ( 'Case: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:707:1: 'Case: '
            {
             before(grammarAccess.getCaseAccess().getCaseKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Case__Group__0__Impl1447); 
             after(grammarAccess.getCaseAccess().getCaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__0__Impl"


    // $ANTLR start "rule__Case__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:720:1: rule__Case__Group__1 : rule__Case__Group__1__Impl rule__Case__Group__2 ;
    public final void rule__Case__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:724:1: ( rule__Case__Group__1__Impl rule__Case__Group__2 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:725:2: rule__Case__Group__1__Impl rule__Case__Group__2
            {
            pushFollow(FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__11478);
            rule__Case__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__2_in_rule__Case__Group__11481);
            rule__Case__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1"


    // $ANTLR start "rule__Case__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:732:1: rule__Case__Group__1__Impl : ( ( rule__Case__NameAssignment_1 ) ) ;
    public final void rule__Case__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:736:1: ( ( ( rule__Case__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:737:1: ( ( rule__Case__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:737:1: ( ( rule__Case__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:738:1: ( rule__Case__NameAssignment_1 )
            {
             before(grammarAccess.getCaseAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:739:1: ( rule__Case__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:739:2: rule__Case__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Case__NameAssignment_1_in_rule__Case__Group__1__Impl1508);
            rule__Case__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCaseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__1__Impl"


    // $ANTLR start "rule__Case__Group__2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:749:1: rule__Case__Group__2 : rule__Case__Group__2__Impl rule__Case__Group__3 ;
    public final void rule__Case__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:753:1: ( rule__Case__Group__2__Impl rule__Case__Group__3 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:754:2: rule__Case__Group__2__Impl rule__Case__Group__3
            {
            pushFollow(FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__21538);
            rule__Case__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__3_in_rule__Case__Group__21541);
            rule__Case__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2"


    // $ANTLR start "rule__Case__Group__2__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:761:1: rule__Case__Group__2__Impl : ( ( rule__Case__ExtensionsAssignment_2 )* ) ;
    public final void rule__Case__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:765:1: ( ( ( rule__Case__ExtensionsAssignment_2 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:766:1: ( ( rule__Case__ExtensionsAssignment_2 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:766:1: ( ( rule__Case__ExtensionsAssignment_2 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:767:1: ( rule__Case__ExtensionsAssignment_2 )*
            {
             before(grammarAccess.getCaseAccess().getExtensionsAssignment_2()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:768:1: ( rule__Case__ExtensionsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:768:2: rule__Case__ExtensionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Case__ExtensionsAssignment_2_in_rule__Case__Group__2__Impl1568);
            	    rule__Case__ExtensionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getExtensionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__2__Impl"


    // $ANTLR start "rule__Case__Group__3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:778:1: rule__Case__Group__3 : rule__Case__Group__3__Impl rule__Case__Group__4 ;
    public final void rule__Case__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:782:1: ( rule__Case__Group__3__Impl rule__Case__Group__4 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:783:2: rule__Case__Group__3__Impl rule__Case__Group__4
            {
            pushFollow(FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__31599);
            rule__Case__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Case__Group__4_in_rule__Case__Group__31602);
            rule__Case__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3"


    // $ANTLR start "rule__Case__Group__3__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:790:1: rule__Case__Group__3__Impl : ( ( rule__Case__IncludesAssignment_3 )* ) ;
    public final void rule__Case__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:794:1: ( ( ( rule__Case__IncludesAssignment_3 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:795:1: ( ( rule__Case__IncludesAssignment_3 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:795:1: ( ( rule__Case__IncludesAssignment_3 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:796:1: ( rule__Case__IncludesAssignment_3 )*
            {
             before(grammarAccess.getCaseAccess().getIncludesAssignment_3()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:797:1: ( rule__Case__IncludesAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:797:2: rule__Case__IncludesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Case__IncludesAssignment_3_in_rule__Case__Group__3__Impl1629);
            	    rule__Case__IncludesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getIncludesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__3__Impl"


    // $ANTLR start "rule__Case__Group__4"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:807:1: rule__Case__Group__4 : rule__Case__Group__4__Impl ;
    public final void rule__Case__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:811:1: ( rule__Case__Group__4__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:812:2: rule__Case__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__41660);
            rule__Case__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4"


    // $ANTLR start "rule__Case__Group__4__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:818:1: rule__Case__Group__4__Impl : ( ( rule__Case__ExtendsAssignment_4 )* ) ;
    public final void rule__Case__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:822:1: ( ( ( rule__Case__ExtendsAssignment_4 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:823:1: ( ( rule__Case__ExtendsAssignment_4 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:823:1: ( ( rule__Case__ExtendsAssignment_4 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:824:1: ( rule__Case__ExtendsAssignment_4 )*
            {
             before(grammarAccess.getCaseAccess().getExtendsAssignment_4()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:825:1: ( rule__Case__ExtendsAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:825:2: rule__Case__ExtendsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Case__ExtendsAssignment_4_in_rule__Case__Group__4__Impl1687);
            	    rule__Case__ExtendsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCaseAccess().getExtendsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__Group__4__Impl"


    // $ANTLR start "rule__ExtensionPoint__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:845:1: rule__ExtensionPoint__Group__0 : rule__ExtensionPoint__Group__0__Impl rule__ExtensionPoint__Group__1 ;
    public final void rule__ExtensionPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:849:1: ( rule__ExtensionPoint__Group__0__Impl rule__ExtensionPoint__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:850:2: rule__ExtensionPoint__Group__0__Impl rule__ExtensionPoint__Group__1
            {
            pushFollow(FOLLOW_rule__ExtensionPoint__Group__0__Impl_in_rule__ExtensionPoint__Group__01728);
            rule__ExtensionPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExtensionPoint__Group__1_in_rule__ExtensionPoint__Group__01731);
            rule__ExtensionPoint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionPoint__Group__0"


    // $ANTLR start "rule__ExtensionPoint__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:857:1: rule__ExtensionPoint__Group__0__Impl : ( 'ExtensionPoint: ' ) ;
    public final void rule__ExtensionPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:861:1: ( ( 'ExtensionPoint: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:862:1: ( 'ExtensionPoint: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:862:1: ( 'ExtensionPoint: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:863:1: 'ExtensionPoint: '
            {
             before(grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__ExtensionPoint__Group__0__Impl1759); 
             after(grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionPoint__Group__0__Impl"


    // $ANTLR start "rule__ExtensionPoint__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:876:1: rule__ExtensionPoint__Group__1 : rule__ExtensionPoint__Group__1__Impl ;
    public final void rule__ExtensionPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:880:1: ( rule__ExtensionPoint__Group__1__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:881:2: rule__ExtensionPoint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtensionPoint__Group__1__Impl_in_rule__ExtensionPoint__Group__11790);
            rule__ExtensionPoint__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionPoint__Group__1"


    // $ANTLR start "rule__ExtensionPoint__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:887:1: rule__ExtensionPoint__Group__1__Impl : ( ( rule__ExtensionPoint__NameAssignment_1 ) ) ;
    public final void rule__ExtensionPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:891:1: ( ( ( rule__ExtensionPoint__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:892:1: ( ( rule__ExtensionPoint__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:892:1: ( ( rule__ExtensionPoint__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:893:1: ( rule__ExtensionPoint__NameAssignment_1 )
            {
             before(grammarAccess.getExtensionPointAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:894:1: ( rule__ExtensionPoint__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:894:2: rule__ExtensionPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ExtensionPoint__NameAssignment_1_in_rule__ExtensionPoint__Group__1__Impl1817);
            rule__ExtensionPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtensionPointAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionPoint__Group__1__Impl"


    // $ANTLR start "rule__Includes__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:908:1: rule__Includes__Group__0 : rule__Includes__Group__0__Impl rule__Includes__Group__1 ;
    public final void rule__Includes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:912:1: ( rule__Includes__Group__0__Impl rule__Includes__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:913:2: rule__Includes__Group__0__Impl rule__Includes__Group__1
            {
            pushFollow(FOLLOW_rule__Includes__Group__0__Impl_in_rule__Includes__Group__01851);
            rule__Includes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Includes__Group__1_in_rule__Includes__Group__01854);
            rule__Includes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__0"


    // $ANTLR start "rule__Includes__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:920:1: rule__Includes__Group__0__Impl : ( 'Includes: ' ) ;
    public final void rule__Includes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:924:1: ( ( 'Includes: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:925:1: ( 'Includes: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:925:1: ( 'Includes: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:926:1: 'Includes: '
            {
             before(grammarAccess.getIncludesAccess().getIncludesKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Includes__Group__0__Impl1882); 
             after(grammarAccess.getIncludesAccess().getIncludesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__0__Impl"


    // $ANTLR start "rule__Includes__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:939:1: rule__Includes__Group__1 : rule__Includes__Group__1__Impl rule__Includes__Group__2 ;
    public final void rule__Includes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:943:1: ( rule__Includes__Group__1__Impl rule__Includes__Group__2 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:944:2: rule__Includes__Group__1__Impl rule__Includes__Group__2
            {
            pushFollow(FOLLOW_rule__Includes__Group__1__Impl_in_rule__Includes__Group__11913);
            rule__Includes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Includes__Group__2_in_rule__Includes__Group__11916);
            rule__Includes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__1"


    // $ANTLR start "rule__Includes__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:951:1: rule__Includes__Group__1__Impl : ( ( rule__Includes__NameAssignment_1 ) ) ;
    public final void rule__Includes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:955:1: ( ( ( rule__Includes__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:956:1: ( ( rule__Includes__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:956:1: ( ( rule__Includes__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:957:1: ( rule__Includes__NameAssignment_1 )
            {
             before(grammarAccess.getIncludesAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:958:1: ( rule__Includes__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:958:2: rule__Includes__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Includes__NameAssignment_1_in_rule__Includes__Group__1__Impl1943);
            rule__Includes__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__1__Impl"


    // $ANTLR start "rule__Includes__Group__2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:968:1: rule__Includes__Group__2 : rule__Includes__Group__2__Impl rule__Includes__Group__3 ;
    public final void rule__Includes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:972:1: ( rule__Includes__Group__2__Impl rule__Includes__Group__3 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:973:2: rule__Includes__Group__2__Impl rule__Includes__Group__3
            {
            pushFollow(FOLLOW_rule__Includes__Group__2__Impl_in_rule__Includes__Group__21973);
            rule__Includes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Includes__Group__3_in_rule__Includes__Group__21976);
            rule__Includes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__2"


    // $ANTLR start "rule__Includes__Group__2__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:980:1: rule__Includes__Group__2__Impl : ( '{' ) ;
    public final void rule__Includes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:984:1: ( ( '{' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:985:1: ( '{' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:985:1: ( '{' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:986:1: '{'
            {
             before(grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Includes__Group__2__Impl2004); 
             after(grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__2__Impl"


    // $ANTLR start "rule__Includes__Group__3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:999:1: rule__Includes__Group__3 : rule__Includes__Group__3__Impl rule__Includes__Group__4 ;
    public final void rule__Includes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1003:1: ( rule__Includes__Group__3__Impl rule__Includes__Group__4 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1004:2: rule__Includes__Group__3__Impl rule__Includes__Group__4
            {
            pushFollow(FOLLOW_rule__Includes__Group__3__Impl_in_rule__Includes__Group__32035);
            rule__Includes__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Includes__Group__4_in_rule__Includes__Group__32038);
            rule__Includes__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__3"


    // $ANTLR start "rule__Includes__Group__3__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1011:1: rule__Includes__Group__3__Impl : ( ( rule__Includes__RulesAssignment_3 )* ) ;
    public final void rule__Includes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1015:1: ( ( ( rule__Includes__RulesAssignment_3 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1016:1: ( ( rule__Includes__RulesAssignment_3 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1016:1: ( ( rule__Includes__RulesAssignment_3 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1017:1: ( rule__Includes__RulesAssignment_3 )*
            {
             before(grammarAccess.getIncludesAccess().getRulesAssignment_3()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1018:1: ( rule__Includes__RulesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1018:2: rule__Includes__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Includes__RulesAssignment_3_in_rule__Includes__Group__3__Impl2065);
            	    rule__Includes__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getIncludesAccess().getRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__3__Impl"


    // $ANTLR start "rule__Includes__Group__4"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1028:1: rule__Includes__Group__4 : rule__Includes__Group__4__Impl ;
    public final void rule__Includes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1032:1: ( rule__Includes__Group__4__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1033:2: rule__Includes__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Includes__Group__4__Impl_in_rule__Includes__Group__42096);
            rule__Includes__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__4"


    // $ANTLR start "rule__Includes__Group__4__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1039:1: rule__Includes__Group__4__Impl : ( '}' ) ;
    public final void rule__Includes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1043:1: ( ( '}' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1044:1: ( '}' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1044:1: ( '}' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1045:1: '}'
            {
             before(grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Includes__Group__4__Impl2124); 
             after(grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__Group__4__Impl"


    // $ANTLR start "rule__Extends__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1068:1: rule__Extends__Group__0 : rule__Extends__Group__0__Impl rule__Extends__Group__1 ;
    public final void rule__Extends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1072:1: ( rule__Extends__Group__0__Impl rule__Extends__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1073:2: rule__Extends__Group__0__Impl rule__Extends__Group__1
            {
            pushFollow(FOLLOW_rule__Extends__Group__0__Impl_in_rule__Extends__Group__02165);
            rule__Extends__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Extends__Group__1_in_rule__Extends__Group__02168);
            rule__Extends__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__0"


    // $ANTLR start "rule__Extends__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1080:1: rule__Extends__Group__0__Impl : ( 'Extends: ' ) ;
    public final void rule__Extends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1084:1: ( ( 'Extends: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1085:1: ( 'Extends: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1085:1: ( 'Extends: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1086:1: 'Extends: '
            {
             before(grammarAccess.getExtendsAccess().getExtendsKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Extends__Group__0__Impl2196); 
             after(grammarAccess.getExtendsAccess().getExtendsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__0__Impl"


    // $ANTLR start "rule__Extends__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1099:1: rule__Extends__Group__1 : rule__Extends__Group__1__Impl rule__Extends__Group__2 ;
    public final void rule__Extends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1103:1: ( rule__Extends__Group__1__Impl rule__Extends__Group__2 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1104:2: rule__Extends__Group__1__Impl rule__Extends__Group__2
            {
            pushFollow(FOLLOW_rule__Extends__Group__1__Impl_in_rule__Extends__Group__12227);
            rule__Extends__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Extends__Group__2_in_rule__Extends__Group__12230);
            rule__Extends__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__1"


    // $ANTLR start "rule__Extends__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1111:1: rule__Extends__Group__1__Impl : ( ( rule__Extends__NameAssignment_1 ) ) ;
    public final void rule__Extends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1115:1: ( ( ( rule__Extends__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1116:1: ( ( rule__Extends__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1116:1: ( ( rule__Extends__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1117:1: ( rule__Extends__NameAssignment_1 )
            {
             before(grammarAccess.getExtendsAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1118:1: ( rule__Extends__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1118:2: rule__Extends__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Extends__NameAssignment_1_in_rule__Extends__Group__1__Impl2257);
            rule__Extends__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__1__Impl"


    // $ANTLR start "rule__Extends__Group__2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1128:1: rule__Extends__Group__2 : rule__Extends__Group__2__Impl rule__Extends__Group__3 ;
    public final void rule__Extends__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1132:1: ( rule__Extends__Group__2__Impl rule__Extends__Group__3 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1133:2: rule__Extends__Group__2__Impl rule__Extends__Group__3
            {
            pushFollow(FOLLOW_rule__Extends__Group__2__Impl_in_rule__Extends__Group__22287);
            rule__Extends__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Extends__Group__3_in_rule__Extends__Group__22290);
            rule__Extends__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__2"


    // $ANTLR start "rule__Extends__Group__2__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1140:1: rule__Extends__Group__2__Impl : ( '{' ) ;
    public final void rule__Extends__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1144:1: ( ( '{' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1145:1: ( '{' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1145:1: ( '{' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1146:1: '{'
            {
             before(grammarAccess.getExtendsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Extends__Group__2__Impl2318); 
             after(grammarAccess.getExtendsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__2__Impl"


    // $ANTLR start "rule__Extends__Group__3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1159:1: rule__Extends__Group__3 : rule__Extends__Group__3__Impl rule__Extends__Group__4 ;
    public final void rule__Extends__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1163:1: ( rule__Extends__Group__3__Impl rule__Extends__Group__4 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1164:2: rule__Extends__Group__3__Impl rule__Extends__Group__4
            {
            pushFollow(FOLLOW_rule__Extends__Group__3__Impl_in_rule__Extends__Group__32349);
            rule__Extends__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Extends__Group__4_in_rule__Extends__Group__32352);
            rule__Extends__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__3"


    // $ANTLR start "rule__Extends__Group__3__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1171:1: rule__Extends__Group__3__Impl : ( ( rule__Extends__RulesAssignment_3 )* ) ;
    public final void rule__Extends__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1175:1: ( ( ( rule__Extends__RulesAssignment_3 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1176:1: ( ( rule__Extends__RulesAssignment_3 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1176:1: ( ( rule__Extends__RulesAssignment_3 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1177:1: ( rule__Extends__RulesAssignment_3 )*
            {
             before(grammarAccess.getExtendsAccess().getRulesAssignment_3()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1178:1: ( rule__Extends__RulesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1178:2: rule__Extends__RulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Extends__RulesAssignment_3_in_rule__Extends__Group__3__Impl2379);
            	    rule__Extends__RulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getExtendsAccess().getRulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__3__Impl"


    // $ANTLR start "rule__Extends__Group__4"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1188:1: rule__Extends__Group__4 : rule__Extends__Group__4__Impl ;
    public final void rule__Extends__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1192:1: ( rule__Extends__Group__4__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1193:2: rule__Extends__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Extends__Group__4__Impl_in_rule__Extends__Group__42410);
            rule__Extends__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__4"


    // $ANTLR start "rule__Extends__Group__4__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1199:1: rule__Extends__Group__4__Impl : ( '}' ) ;
    public final void rule__Extends__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1203:1: ( ( '}' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1204:1: ( '}' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1204:1: ( '}' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1205:1: '}'
            {
             before(grammarAccess.getExtendsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Extends__Group__4__Impl2438); 
             after(grammarAccess.getExtendsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1228:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1232:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1233:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02479);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02482);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1240:1: rule__Actor__Group__0__Impl : ( 'Actor: ' ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1244:1: ( ( 'Actor: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1245:1: ( 'Actor: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1245:1: ( 'Actor: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1246:1: 'Actor: '
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Actor__Group__0__Impl2510); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1259:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1263:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1264:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12541);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12544);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1271:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__NameAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1275:1: ( ( ( rule__Actor__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1276:1: ( ( rule__Actor__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1276:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1277:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1278:1: ( rule__Actor__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1278:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__1__Impl2571);
            rule__Actor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1288:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1292:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1293:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22601);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22604);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1300:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__InheritancesAssignment_2 )* ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1304:1: ( ( ( rule__Actor__InheritancesAssignment_2 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1305:1: ( ( rule__Actor__InheritancesAssignment_2 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1305:1: ( ( rule__Actor__InheritancesAssignment_2 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1306:1: ( rule__Actor__InheritancesAssignment_2 )*
            {
             before(grammarAccess.getActorAccess().getInheritancesAssignment_2()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1307:1: ( rule__Actor__InheritancesAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1307:2: rule__Actor__InheritancesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Actor__InheritancesAssignment_2_in_rule__Actor__Group__2__Impl2631);
            	    rule__Actor__InheritancesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getInheritancesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1317:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1321:1: ( rule__Actor__Group__3__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1322:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__32662);
            rule__Actor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1328:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__UsesAssignment_3 )* ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1332:1: ( ( ( rule__Actor__UsesAssignment_3 )* ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1333:1: ( ( rule__Actor__UsesAssignment_3 )* )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1333:1: ( ( rule__Actor__UsesAssignment_3 )* )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1334:1: ( rule__Actor__UsesAssignment_3 )*
            {
             before(grammarAccess.getActorAccess().getUsesAssignment_3()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1335:1: ( rule__Actor__UsesAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1335:2: rule__Actor__UsesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Actor__UsesAssignment_3_in_rule__Actor__Group__3__Impl2689);
            	    rule__Actor__UsesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getUsesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Inheritance__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1353:1: rule__Inheritance__Group__0 : rule__Inheritance__Group__0__Impl rule__Inheritance__Group__1 ;
    public final void rule__Inheritance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1357:1: ( rule__Inheritance__Group__0__Impl rule__Inheritance__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1358:2: rule__Inheritance__Group__0__Impl rule__Inheritance__Group__1
            {
            pushFollow(FOLLOW_rule__Inheritance__Group__0__Impl_in_rule__Inheritance__Group__02728);
            rule__Inheritance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__02731);
            rule__Inheritance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group__0"


    // $ANTLR start "rule__Inheritance__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1365:1: rule__Inheritance__Group__0__Impl : ( 'Extends: ' ) ;
    public final void rule__Inheritance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1369:1: ( ( 'Extends: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1370:1: ( 'Extends: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1370:1: ( 'Extends: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1371:1: 'Extends: '
            {
             before(grammarAccess.getInheritanceAccess().getExtendsKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Inheritance__Group__0__Impl2759); 
             after(grammarAccess.getInheritanceAccess().getExtendsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group__0__Impl"


    // $ANTLR start "rule__Inheritance__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1384:1: rule__Inheritance__Group__1 : rule__Inheritance__Group__1__Impl ;
    public final void rule__Inheritance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1388:1: ( rule__Inheritance__Group__1__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1389:2: rule__Inheritance__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Inheritance__Group__1__Impl_in_rule__Inheritance__Group__12790);
            rule__Inheritance__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group__1"


    // $ANTLR start "rule__Inheritance__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1395:1: rule__Inheritance__Group__1__Impl : ( ( rule__Inheritance__NameAssignment_1 ) ) ;
    public final void rule__Inheritance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1399:1: ( ( ( rule__Inheritance__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1400:1: ( ( rule__Inheritance__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1400:1: ( ( rule__Inheritance__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1401:1: ( rule__Inheritance__NameAssignment_1 )
            {
             before(grammarAccess.getInheritanceAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1402:1: ( rule__Inheritance__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1402:2: rule__Inheritance__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Inheritance__NameAssignment_1_in_rule__Inheritance__Group__1__Impl2817);
            rule__Inheritance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInheritanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__Group__1__Impl"


    // $ANTLR start "rule__Uses__Group__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1416:1: rule__Uses__Group__0 : rule__Uses__Group__0__Impl rule__Uses__Group__1 ;
    public final void rule__Uses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1420:1: ( rule__Uses__Group__0__Impl rule__Uses__Group__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1421:2: rule__Uses__Group__0__Impl rule__Uses__Group__1
            {
            pushFollow(FOLLOW_rule__Uses__Group__0__Impl_in_rule__Uses__Group__02851);
            rule__Uses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Uses__Group__1_in_rule__Uses__Group__02854);
            rule__Uses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__Group__0"


    // $ANTLR start "rule__Uses__Group__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1428:1: rule__Uses__Group__0__Impl : ( 'Uses: ' ) ;
    public final void rule__Uses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1432:1: ( ( 'Uses: ' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1433:1: ( 'Uses: ' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1433:1: ( 'Uses: ' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1434:1: 'Uses: '
            {
             before(grammarAccess.getUsesAccess().getUsesKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Uses__Group__0__Impl2882); 
             after(grammarAccess.getUsesAccess().getUsesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__Group__0__Impl"


    // $ANTLR start "rule__Uses__Group__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1447:1: rule__Uses__Group__1 : rule__Uses__Group__1__Impl rule__Uses__Group__2 ;
    public final void rule__Uses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1451:1: ( rule__Uses__Group__1__Impl rule__Uses__Group__2 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1452:2: rule__Uses__Group__1__Impl rule__Uses__Group__2
            {
            pushFollow(FOLLOW_rule__Uses__Group__1__Impl_in_rule__Uses__Group__12913);
            rule__Uses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Uses__Group__2_in_rule__Uses__Group__12916);
            rule__Uses__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__Group__1"


    // $ANTLR start "rule__Uses__Group__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1459:1: rule__Uses__Group__1__Impl : ( ( rule__Uses__NameAssignment_1 ) ) ;
    public final void rule__Uses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1463:1: ( ( ( rule__Uses__NameAssignment_1 ) ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1464:1: ( ( rule__Uses__NameAssignment_1 ) )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1464:1: ( ( rule__Uses__NameAssignment_1 ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1465:1: ( rule__Uses__NameAssignment_1 )
            {
             before(grammarAccess.getUsesAccess().getNameAssignment_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1466:1: ( rule__Uses__NameAssignment_1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1466:2: rule__Uses__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Uses__NameAssignment_1_in_rule__Uses__Group__1__Impl2943);
            rule__Uses__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__Group__1__Impl"


    // $ANTLR start "rule__Uses__Group__2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1476:1: rule__Uses__Group__2 : rule__Uses__Group__2__Impl ;
    public final void rule__Uses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1480:1: ( rule__Uses__Group__2__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1481:2: rule__Uses__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Uses__Group__2__Impl_in_rule__Uses__Group__22973);
            rule__Uses__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__Group__2"


    // $ANTLR start "rule__Uses__Group__2__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1487:1: rule__Uses__Group__2__Impl : ( ( rule__Uses__MultiplicityAssignment_2 )? ) ;
    public final void rule__Uses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1491:1: ( ( ( rule__Uses__MultiplicityAssignment_2 )? ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1492:1: ( ( rule__Uses__MultiplicityAssignment_2 )? )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1492:1: ( ( rule__Uses__MultiplicityAssignment_2 )? )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1493:1: ( rule__Uses__MultiplicityAssignment_2 )?
            {
             before(grammarAccess.getUsesAccess().getMultiplicityAssignment_2()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1494:1: ( rule__Uses__MultiplicityAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11||LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1494:2: rule__Uses__MultiplicityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Uses__MultiplicityAssignment_2_in_rule__Uses__Group__2__Impl3000);
                    rule__Uses__MultiplicityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUsesAccess().getMultiplicityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__Group__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group_0__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1510:1: rule__Multiplicity__Group_0__0 : rule__Multiplicity__Group_0__0__Impl rule__Multiplicity__Group_0__1 ;
    public final void rule__Multiplicity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1514:1: ( rule__Multiplicity__Group_0__0__Impl rule__Multiplicity__Group_0__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1515:2: rule__Multiplicity__Group_0__0__Impl rule__Multiplicity__Group_0__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_0__0__Impl_in_rule__Multiplicity__Group_0__03037);
            rule__Multiplicity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group_0__1_in_rule__Multiplicity__Group_0__03040);
            rule__Multiplicity__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_0__0"


    // $ANTLR start "rule__Multiplicity__Group_0__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1522:1: rule__Multiplicity__Group_0__0__Impl : ( '{' ) ;
    public final void rule__Multiplicity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1526:1: ( ( '{' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1527:1: ( '{' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1527:1: ( '{' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1528:1: '{'
            {
             before(grammarAccess.getMultiplicityAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Multiplicity__Group_0__0__Impl3068); 
             after(grammarAccess.getMultiplicityAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_0__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_0__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1541:1: rule__Multiplicity__Group_0__1 : rule__Multiplicity__Group_0__1__Impl ;
    public final void rule__Multiplicity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1545:1: ( rule__Multiplicity__Group_0__1__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1546:2: rule__Multiplicity__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_0__1__Impl_in_rule__Multiplicity__Group_0__13099);
            rule__Multiplicity__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_0__1"


    // $ANTLR start "rule__Multiplicity__Group_0__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1552:1: rule__Multiplicity__Group_0__1__Impl : ( ruleNumber ) ;
    public final void rule__Multiplicity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1556:1: ( ( ruleNumber ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1557:1: ( ruleNumber )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1557:1: ( ruleNumber )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1558:1: ruleNumber
            {
             before(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Multiplicity__Group_0__1__Impl3126);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_0__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1573:1: rule__Multiplicity__Group_1__0 : rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 ;
    public final void rule__Multiplicity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1577:1: ( rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1578:2: rule__Multiplicity__Group_1__0__Impl rule__Multiplicity__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__0__Impl_in_rule__Multiplicity__Group_1__03159);
            rule__Multiplicity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group_1__1_in_rule__Multiplicity__Group_1__03162);
            rule__Multiplicity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__0"


    // $ANTLR start "rule__Multiplicity__Group_1__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1585:1: rule__Multiplicity__Group_1__0__Impl : ( ruleStar ) ;
    public final void rule__Multiplicity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1589:1: ( ( ruleStar ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1590:1: ( ruleStar )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1590:1: ( ruleStar )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1591:1: ruleStar
            {
             before(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStar_in_rule__Multiplicity__Group_1__0__Impl3189);
            ruleStar();

            state._fsp--;

             after(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1602:1: rule__Multiplicity__Group_1__1 : rule__Multiplicity__Group_1__1__Impl rule__Multiplicity__Group_1__2 ;
    public final void rule__Multiplicity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1606:1: ( rule__Multiplicity__Group_1__1__Impl rule__Multiplicity__Group_1__2 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1607:2: rule__Multiplicity__Group_1__1__Impl rule__Multiplicity__Group_1__2
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__1__Impl_in_rule__Multiplicity__Group_1__13218);
            rule__Multiplicity__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group_1__2_in_rule__Multiplicity__Group_1__13221);
            rule__Multiplicity__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__1"


    // $ANTLR start "rule__Multiplicity__Group_1__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1614:1: rule__Multiplicity__Group_1__1__Impl : ( ( rule__Multiplicity__Alternatives_1_1 )? ) ;
    public final void rule__Multiplicity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1618:1: ( ( ( rule__Multiplicity__Alternatives_1_1 )? ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1619:1: ( ( rule__Multiplicity__Alternatives_1_1 )? )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1619:1: ( ( rule__Multiplicity__Alternatives_1_1 )? )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1620:1: ( rule__Multiplicity__Alternatives_1_1 )?
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives_1_1()); 
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1621:1: ( rule__Multiplicity__Alternatives_1_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==11||LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1621:2: rule__Multiplicity__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_rule__Multiplicity__Alternatives_1_1_in_rule__Multiplicity__Group_1__1__Impl3248);
                    rule__Multiplicity__Alternatives_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1__2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1631:1: rule__Multiplicity__Group_1__2 : rule__Multiplicity__Group_1__2__Impl ;
    public final void rule__Multiplicity__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1635:1: ( rule__Multiplicity__Group_1__2__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1636:2: rule__Multiplicity__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1__2__Impl_in_rule__Multiplicity__Group_1__23279);
            rule__Multiplicity__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__2"


    // $ANTLR start "rule__Multiplicity__Group_1__2__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1642:1: rule__Multiplicity__Group_1__2__Impl : ( '}' ) ;
    public final void rule__Multiplicity__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1646:1: ( ( '}' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1647:1: ( '}' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1647:1: ( '}' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1648:1: '}'
            {
             before(grammarAccess.getMultiplicityAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,27,FOLLOW_27_in_rule__Multiplicity__Group_1__2__Impl3307); 
             after(grammarAccess.getMultiplicityAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1_1_0__0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1667:1: rule__Multiplicity__Group_1_1_0__0 : rule__Multiplicity__Group_1_1_0__0__Impl rule__Multiplicity__Group_1_1_0__1 ;
    public final void rule__Multiplicity__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1671:1: ( rule__Multiplicity__Group_1_1_0__0__Impl rule__Multiplicity__Group_1_1_0__1 )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1672:2: rule__Multiplicity__Group_1_1_0__0__Impl rule__Multiplicity__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1_1_0__0__Impl_in_rule__Multiplicity__Group_1_1_0__03344);
            rule__Multiplicity__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Multiplicity__Group_1_1_0__1_in_rule__Multiplicity__Group_1_1_0__03347);
            rule__Multiplicity__Group_1_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1_1_0__0"


    // $ANTLR start "rule__Multiplicity__Group_1_1_0__0__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1679:1: rule__Multiplicity__Group_1_1_0__0__Impl : ( ',' ) ;
    public final void rule__Multiplicity__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1683:1: ( ( ',' ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1684:1: ( ',' )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1684:1: ( ',' )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1685:1: ','
            {
             before(grammarAccess.getMultiplicityAccess().getCommaKeyword_1_1_0_0()); 
            match(input,31,FOLLOW_31_in_rule__Multiplicity__Group_1_1_0__0__Impl3375); 
             after(grammarAccess.getMultiplicityAccess().getCommaKeyword_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_1_1_0__1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1698:1: rule__Multiplicity__Group_1_1_0__1 : rule__Multiplicity__Group_1_1_0__1__Impl ;
    public final void rule__Multiplicity__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1702:1: ( rule__Multiplicity__Group_1_1_0__1__Impl )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1703:2: rule__Multiplicity__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplicity__Group_1_1_0__1__Impl_in_rule__Multiplicity__Group_1_1_0__13406);
            rule__Multiplicity__Group_1_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1_1_0__1"


    // $ANTLR start "rule__Multiplicity__Group_1_1_0__1__Impl"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1709:1: rule__Multiplicity__Group_1_1_0__1__Impl : ( ruleNumber ) ;
    public final void rule__Multiplicity__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1713:1: ( ( ruleNumber ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1714:1: ( ruleNumber )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1714:1: ( ruleNumber )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1715:1: ruleNumber
            {
             before(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_ruleNumber_in_rule__Multiplicity__Group_1_1_0__1__Impl3433);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_1_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__UseCase__SystemsAssignment_0"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1731:1: rule__UseCase__SystemsAssignment_0 : ( ruleSubsystem ) ;
    public final void rule__UseCase__SystemsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1735:1: ( ( ruleSubsystem ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1736:1: ( ruleSubsystem )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1736:1: ( ruleSubsystem )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1737:1: ruleSubsystem
            {
             before(grammarAccess.getUseCaseAccess().getSystemsSubsystemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSubsystem_in_rule__UseCase__SystemsAssignment_03471);
            ruleSubsystem();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getSystemsSubsystemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__SystemsAssignment_0"


    // $ANTLR start "rule__UseCase__ActorsAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1746:1: rule__UseCase__ActorsAssignment_1 : ( ruleActor ) ;
    public final void rule__UseCase__ActorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1750:1: ( ( ruleActor ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1751:1: ( ruleActor )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1751:1: ( ruleActor )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1752:1: ruleActor
            {
             before(grammarAccess.getUseCaseAccess().getActorsActorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleActor_in_rule__UseCase__ActorsAssignment_13502);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getActorsActorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ActorsAssignment_1"


    // $ANTLR start "rule__Subsystem__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1761:1: rule__Subsystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Subsystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1765:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1766:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1766:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1767:1: RULE_ID
            {
             before(grammarAccess.getSubsystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subsystem__NameAssignment_13533); 
             after(grammarAccess.getSubsystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__NameAssignment_1"


    // $ANTLR start "rule__Subsystem__CasesAssignment_2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1776:1: rule__Subsystem__CasesAssignment_2 : ( ruleCase ) ;
    public final void rule__Subsystem__CasesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1780:1: ( ( ruleCase ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1781:1: ( ruleCase )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1781:1: ( ruleCase )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1782:1: ruleCase
            {
             before(grammarAccess.getSubsystemAccess().getCasesCaseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCase_in_rule__Subsystem__CasesAssignment_23564);
            ruleCase();

            state._fsp--;

             after(grammarAccess.getSubsystemAccess().getCasesCaseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsystem__CasesAssignment_2"


    // $ANTLR start "rule__Case__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1791:1: rule__Case__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Case__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1795:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1796:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1796:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1797:1: RULE_ID
            {
             before(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Case__NameAssignment_13595); 
             after(grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__NameAssignment_1"


    // $ANTLR start "rule__Case__ExtensionsAssignment_2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1806:1: rule__Case__ExtensionsAssignment_2 : ( ruleExtensionPoint ) ;
    public final void rule__Case__ExtensionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1810:1: ( ( ruleExtensionPoint ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1811:1: ( ruleExtensionPoint )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1811:1: ( ruleExtensionPoint )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1812:1: ruleExtensionPoint
            {
             before(grammarAccess.getCaseAccess().getExtensionsExtensionPointParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExtensionPoint_in_rule__Case__ExtensionsAssignment_23626);
            ruleExtensionPoint();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getExtensionsExtensionPointParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__ExtensionsAssignment_2"


    // $ANTLR start "rule__Case__IncludesAssignment_3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1821:1: rule__Case__IncludesAssignment_3 : ( ruleIncludes ) ;
    public final void rule__Case__IncludesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1825:1: ( ( ruleIncludes ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1826:1: ( ruleIncludes )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1826:1: ( ruleIncludes )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1827:1: ruleIncludes
            {
             before(grammarAccess.getCaseAccess().getIncludesIncludesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleIncludes_in_rule__Case__IncludesAssignment_33657);
            ruleIncludes();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getIncludesIncludesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__IncludesAssignment_3"


    // $ANTLR start "rule__Case__ExtendsAssignment_4"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1836:1: rule__Case__ExtendsAssignment_4 : ( ruleExtends ) ;
    public final void rule__Case__ExtendsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1840:1: ( ( ruleExtends ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1841:1: ( ruleExtends )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1841:1: ( ruleExtends )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1842:1: ruleExtends
            {
             before(grammarAccess.getCaseAccess().getExtendsExtendsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleExtends_in_rule__Case__ExtendsAssignment_43688);
            ruleExtends();

            state._fsp--;

             after(grammarAccess.getCaseAccess().getExtendsExtendsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Case__ExtendsAssignment_4"


    // $ANTLR start "rule__ExtensionPoint__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1851:1: rule__ExtensionPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExtensionPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1855:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1856:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1856:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1857:1: RULE_ID
            {
             before(grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtensionPoint__NameAssignment_13719); 
             after(grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtensionPoint__NameAssignment_1"


    // $ANTLR start "rule__Includes__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1866:1: rule__Includes__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Includes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1870:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1871:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1871:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1872:1: RULE_ID
            {
             before(grammarAccess.getIncludesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Includes__NameAssignment_13750); 
             after(grammarAccess.getIncludesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__NameAssignment_1"


    // $ANTLR start "rule__Includes__RulesAssignment_3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1881:1: rule__Includes__RulesAssignment_3 : ( RULE_ID ) ;
    public final void rule__Includes__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1885:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1886:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1886:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1887:1: RULE_ID
            {
             before(grammarAccess.getIncludesAccess().getRulesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Includes__RulesAssignment_33781); 
             after(grammarAccess.getIncludesAccess().getRulesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Includes__RulesAssignment_3"


    // $ANTLR start "rule__Extends__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1896:1: rule__Extends__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Extends__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1900:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1901:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1901:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1902:1: RULE_ID
            {
             before(grammarAccess.getExtendsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Extends__NameAssignment_13812); 
             after(grammarAccess.getExtendsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__NameAssignment_1"


    // $ANTLR start "rule__Extends__RulesAssignment_3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1911:1: rule__Extends__RulesAssignment_3 : ( RULE_ID ) ;
    public final void rule__Extends__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1915:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1916:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1916:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1917:1: RULE_ID
            {
             before(grammarAccess.getExtendsAccess().getRulesIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Extends__RulesAssignment_33843); 
             after(grammarAccess.getExtendsAccess().getRulesIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Extends__RulesAssignment_3"


    // $ANTLR start "rule__Actor__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1926:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1930:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1931:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1931:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1932:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_13874); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_1"


    // $ANTLR start "rule__Actor__InheritancesAssignment_2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1941:1: rule__Actor__InheritancesAssignment_2 : ( ruleInheritance ) ;
    public final void rule__Actor__InheritancesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1945:1: ( ( ruleInheritance ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1946:1: ( ruleInheritance )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1946:1: ( ruleInheritance )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1947:1: ruleInheritance
            {
             before(grammarAccess.getActorAccess().getInheritancesInheritanceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleInheritance_in_rule__Actor__InheritancesAssignment_23905);
            ruleInheritance();

            state._fsp--;

             after(grammarAccess.getActorAccess().getInheritancesInheritanceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__InheritancesAssignment_2"


    // $ANTLR start "rule__Actor__UsesAssignment_3"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1956:1: rule__Actor__UsesAssignment_3 : ( ruleUses ) ;
    public final void rule__Actor__UsesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1960:1: ( ( ruleUses ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1961:1: ( ruleUses )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1961:1: ( ruleUses )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1962:1: ruleUses
            {
             before(grammarAccess.getActorAccess().getUsesUsesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUses_in_rule__Actor__UsesAssignment_33936);
            ruleUses();

            state._fsp--;

             after(grammarAccess.getActorAccess().getUsesUsesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__UsesAssignment_3"


    // $ANTLR start "rule__Inheritance__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1971:1: rule__Inheritance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Inheritance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1975:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1976:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1976:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1977:1: RULE_ID
            {
             before(grammarAccess.getInheritanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Inheritance__NameAssignment_13967); 
             after(grammarAccess.getInheritanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inheritance__NameAssignment_1"


    // $ANTLR start "rule__Uses__NameAssignment_1"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1986:1: rule__Uses__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Uses__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1990:1: ( ( RULE_ID ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1991:1: ( RULE_ID )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1991:1: ( RULE_ID )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:1992:1: RULE_ID
            {
             before(grammarAccess.getUsesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Uses__NameAssignment_13998); 
             after(grammarAccess.getUsesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__NameAssignment_1"


    // $ANTLR start "rule__Uses__MultiplicityAssignment_2"
    // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:2001:1: rule__Uses__MultiplicityAssignment_2 : ( ruleMultiplicity ) ;
    public final void rule__Uses__MultiplicityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:2005:1: ( ( ruleMultiplicity ) )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:2006:1: ( ruleMultiplicity )
            {
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:2006:1: ( ruleMultiplicity )
            // ../com.alma.djynx.usecase.ui/src-gen/com/alma/djynx/usecase/ui/contentassist/antlr/internal/InternalUseCase.g:2007:1: ruleMultiplicity
            {
             before(grammarAccess.getUsesAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMultiplicity_in_rule__Uses__MultiplicityAssignment_24029);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getUsesAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Uses__MultiplicityAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleUseCase_in_entryRuleUseCase61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUseCase68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__0_in_ruleUseCase94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsystem_in_entryRuleSubsystem121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubsystem128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subsystem__Group__0_in_ruleSubsystem154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__0_in_ruleCase214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_entryRuleExtensionPoint241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtensionPoint248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionPoint__Group__0_in_ruleExtensionPoint274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludes_in_entryRuleIncludes301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIncludes308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Includes__Group__0_in_ruleIncludes334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtends_in_entryRuleExtends361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtends368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extends__Group__0_in_ruleExtends394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_entryRuleInheritance481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInheritance488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__0_in_ruleInheritance514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUses_in_entryRuleUses541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUses548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uses__Group__0_in_ruleUses574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Alternatives_in_ruleMultiplicity634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Alternatives_in_ruleNumber694 = new BitSet(new long[]{0x00000000003FF002L});
    public static final BitSet FOLLOW_ruleStar_in_entryRuleStar722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStar729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStar756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_0__0_in_rule__Multiplicity__Alternatives793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__0_in_rule__Multiplicity__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1_1_0__0_in_rule__Multiplicity__Alternatives_1_1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStar_in_rule__Multiplicity__Alternatives_1_1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Number__Alternatives895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Number__Alternatives915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Number__Alternatives935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Number__Alternatives955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Number__Alternatives975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Number__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Number__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Number__Alternatives1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Number__Alternatives1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Number__Alternatives1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__0__Impl_in_rule__UseCase__Group__01107 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__UseCase__Group__1_in_rule__UseCase__Group__01110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__SystemsAssignment_0_in_rule__UseCase__Group__0__Impl1137 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__UseCase__Group__1__Impl_in_rule__UseCase__Group__11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UseCase__ActorsAssignment_1_in_rule__UseCase__Group__1__Impl1195 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Subsystem__Group__0__Impl_in_rule__Subsystem__Group__01230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Subsystem__Group__1_in_rule__Subsystem__Group__01233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Subsystem__Group__0__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subsystem__Group__1__Impl_in_rule__Subsystem__Group__11292 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Subsystem__Group__2_in_rule__Subsystem__Group__11295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subsystem__NameAssignment_1_in_rule__Subsystem__Group__1__Impl1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subsystem__Group__2__Impl_in_rule__Subsystem__Group__21352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subsystem__CasesAssignment_2_in_rule__Subsystem__Group__2__Impl1379 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Case__Group__0__Impl_in_rule__Case__Group__01416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Case__Group__1_in_rule__Case__Group__01419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Case__Group__0__Impl1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__1__Impl_in_rule__Case__Group__11478 = new BitSet(new long[]{0x0000000013000000L});
    public static final BitSet FOLLOW_rule__Case__Group__2_in_rule__Case__Group__11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__NameAssignment_1_in_rule__Case__Group__1__Impl1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__Group__2__Impl_in_rule__Case__Group__21538 = new BitSet(new long[]{0x0000000013000000L});
    public static final BitSet FOLLOW_rule__Case__Group__3_in_rule__Case__Group__21541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ExtensionsAssignment_2_in_rule__Case__Group__2__Impl1568 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Case__Group__3__Impl_in_rule__Case__Group__31599 = new BitSet(new long[]{0x0000000013000000L});
    public static final BitSet FOLLOW_rule__Case__Group__4_in_rule__Case__Group__31602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__IncludesAssignment_3_in_rule__Case__Group__3__Impl1629 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Case__Group__4__Impl_in_rule__Case__Group__41660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Case__ExtendsAssignment_4_in_rule__Case__Group__4__Impl1687 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__ExtensionPoint__Group__0__Impl_in_rule__ExtensionPoint__Group__01728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExtensionPoint__Group__1_in_rule__ExtensionPoint__Group__01731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ExtensionPoint__Group__0__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionPoint__Group__1__Impl_in_rule__ExtensionPoint__Group__11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtensionPoint__NameAssignment_1_in_rule__ExtensionPoint__Group__1__Impl1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Includes__Group__0__Impl_in_rule__Includes__Group__01851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Includes__Group__1_in_rule__Includes__Group__01854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Includes__Group__0__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Includes__Group__1__Impl_in_rule__Includes__Group__11913 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Includes__Group__2_in_rule__Includes__Group__11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Includes__NameAssignment_1_in_rule__Includes__Group__1__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Includes__Group__2__Impl_in_rule__Includes__Group__21973 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Includes__Group__3_in_rule__Includes__Group__21976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Includes__Group__2__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Includes__Group__3__Impl_in_rule__Includes__Group__32035 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Includes__Group__4_in_rule__Includes__Group__32038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Includes__RulesAssignment_3_in_rule__Includes__Group__3__Impl2065 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Includes__Group__4__Impl_in_rule__Includes__Group__42096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Includes__Group__4__Impl2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extends__Group__0__Impl_in_rule__Extends__Group__02165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Extends__Group__1_in_rule__Extends__Group__02168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Extends__Group__0__Impl2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extends__Group__1__Impl_in_rule__Extends__Group__12227 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Extends__Group__2_in_rule__Extends__Group__12230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extends__NameAssignment_1_in_rule__Extends__Group__1__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extends__Group__2__Impl_in_rule__Extends__Group__22287 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Extends__Group__3_in_rule__Extends__Group__22290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Extends__Group__2__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extends__Group__3__Impl_in_rule__Extends__Group__32349 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Extends__Group__4_in_rule__Extends__Group__32352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Extends__RulesAssignment_3_in_rule__Extends__Group__3__Impl2379 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Extends__Group__4__Impl_in_rule__Extends__Group__42410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Extends__Group__4__Impl2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Actor__Group__0__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12541 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__1__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22601 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__22604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__InheritancesAssignment_2_in_rule__Actor__Group__2__Impl2631 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__32662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__UsesAssignment_3_in_rule__Actor__Group__3__Impl2689 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__0__Impl_in_rule__Inheritance__Group__02728 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__1_in_rule__Inheritance__Group__02731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Inheritance__Group__0__Impl2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__Group__1__Impl_in_rule__Inheritance__Group__12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Inheritance__NameAssignment_1_in_rule__Inheritance__Group__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uses__Group__0__Impl_in_rule__Uses__Group__02851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Uses__Group__1_in_rule__Uses__Group__02854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Uses__Group__0__Impl2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uses__Group__1__Impl_in_rule__Uses__Group__12913 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_rule__Uses__Group__2_in_rule__Uses__Group__12916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uses__NameAssignment_1_in_rule__Uses__Group__1__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uses__Group__2__Impl_in_rule__Uses__Group__22973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Uses__MultiplicityAssignment_2_in_rule__Uses__Group__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_0__0__Impl_in_rule__Multiplicity__Group_0__03037 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_0__1_in_rule__Multiplicity__Group_0__03040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Multiplicity__Group_0__0__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_0__1__Impl_in_rule__Multiplicity__Group_0__13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Multiplicity__Group_0__1__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__0__Impl_in_rule__Multiplicity__Group_1__03159 = new BitSet(new long[]{0x000000008C000800L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__1_in_rule__Multiplicity__Group_1__03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStar_in_rule__Multiplicity__Group_1__0__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__1__Impl_in_rule__Multiplicity__Group_1__13218 = new BitSet(new long[]{0x000000008C000800L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__2_in_rule__Multiplicity__Group_1__13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Alternatives_1_1_in_rule__Multiplicity__Group_1__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1__2__Impl_in_rule__Multiplicity__Group_1__23279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Multiplicity__Group_1__2__Impl3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1_1_0__0__Impl_in_rule__Multiplicity__Group_1_1_0__03344 = new BitSet(new long[]{0x00000000003FF000L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1_1_0__1_in_rule__Multiplicity__Group_1_1_0__03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Multiplicity__Group_1_1_0__0__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplicity__Group_1_1_0__1__Impl_in_rule__Multiplicity__Group_1_1_0__13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__Multiplicity__Group_1_1_0__1__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubsystem_in_rule__UseCase__SystemsAssignment_03471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__UseCase__ActorsAssignment_13502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subsystem__NameAssignment_13533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_rule__Subsystem__CasesAssignment_23564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Case__NameAssignment_13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtensionPoint_in_rule__Case__ExtensionsAssignment_23626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIncludes_in_rule__Case__IncludesAssignment_33657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtends_in_rule__Case__ExtendsAssignment_43688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtensionPoint__NameAssignment_13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Includes__NameAssignment_13750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Includes__RulesAssignment_33781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Extends__NameAssignment_13812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Extends__RulesAssignment_33843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInheritance_in_rule__Actor__InheritancesAssignment_23905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUses_in_rule__Actor__UsesAssignment_33936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Inheritance__NameAssignment_13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Uses__NameAssignment_13998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_rule__Uses__MultiplicityAssignment_24029 = new BitSet(new long[]{0x0000000000000002L});

}