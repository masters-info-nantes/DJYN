/*
 * generated by Xtext
 */
grammar InternalUseCase;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.alma.djynx.usecase.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleUseCase
entryRuleUseCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUseCaseRule()); }
	 iv_ruleUseCase=ruleUseCase 
	 { $current=$iv_ruleUseCase.current; } 
	 EOF 
;

// Rule UseCase
ruleUseCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getUseCaseAccess().getSystemsSubsystemParserRuleCall_0_0()); 
	    }
		lv_systems_0_0=ruleSubsystem		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUseCaseRule());
	        }
       		add(
       			$current, 
       			"systems",
        		lv_systems_0_0, 
        		"Subsystem");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getUseCaseAccess().getActorsActorParserRuleCall_1_0()); 
	    }
		lv_actors_1_0=ruleActor		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUseCaseRule());
	        }
       		add(
       			$current, 
       			"actors",
        		lv_actors_1_0, 
        		"Actor");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleSubsystem
entryRuleSubsystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSubsystemRule()); }
	 iv_ruleSubsystem=ruleSubsystem 
	 { $current=$iv_ruleSubsystem.current; } 
	 EOF 
;

// Rule Subsystem
ruleSubsystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Subsystem: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSubsystemAccess().getSubsystemKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSubsystemAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSubsystemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getSubsystemAccess().getCasesCaseParserRuleCall_2_0()); 
	    }
		lv_cases_2_0=ruleCase		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSubsystemRule());
	        }
       		add(
       			$current, 
       			"cases",
        		lv_cases_2_0, 
        		"Case");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleCase
entryRuleCase returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCaseRule()); }
	 iv_ruleCase=ruleCase 
	 { $current=$iv_ruleCase.current; } 
	 EOF 
;

// Rule Case
ruleCase returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Case: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCaseAccess().getCaseKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getCaseAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCaseRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCaseAccess().getExtensionsExtensionPointParserRuleCall_2_0()); 
	    }
		lv_extensions_2_0=ruleExtensionPoint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCaseRule());
	        }
       		add(
       			$current, 
       			"extensions",
        		lv_extensions_2_0, 
        		"ExtensionPoint");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getCaseAccess().getIncludesIncludesParserRuleCall_3_0()); 
	    }
		lv_includes_3_0=ruleIncludes		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCaseRule());
	        }
       		add(
       			$current, 
       			"includes",
        		lv_includes_3_0, 
        		"Includes");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getCaseAccess().getExtendsExtendsParserRuleCall_4_0()); 
	    }
		lv_extends_4_0=ruleExtends		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCaseRule());
	        }
       		add(
       			$current, 
       			"extends",
        		lv_extends_4_0, 
        		"Extends");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleExtensionPoint
entryRuleExtensionPoint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExtensionPointRule()); }
	 iv_ruleExtensionPoint=ruleExtensionPoint 
	 { $current=$iv_ruleExtensionPoint.current; } 
	 EOF 
;

// Rule ExtensionPoint
ruleExtensionPoint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ExtensionPoint: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExtensionPointAccess().getExtensionPointKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getExtensionPointAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExtensionPointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleIncludes
entryRuleIncludes returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIncludesRule()); }
	 iv_ruleIncludes=ruleIncludes 
	 { $current=$iv_ruleIncludes.current; } 
	 EOF 
;

// Rule Includes
ruleIncludes returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Includes: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIncludesAccess().getIncludesKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getIncludesAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIncludesRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getIncludesAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		lv_rules_3_0=RULE_ID
		{
			newLeafNode(lv_rules_3_0, grammarAccess.getIncludesAccess().getRulesIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getIncludesRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"rules",
        		lv_rules_3_0, 
        		"ID");
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getIncludesAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleExtends
entryRuleExtends returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExtendsRule()); }
	 iv_ruleExtends=ruleExtends 
	 { $current=$iv_ruleExtends.current; } 
	 EOF 
;

// Rule Extends
ruleExtends returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Extends: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getExtendsAccess().getExtendsKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getExtendsAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExtendsRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getExtendsAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		lv_rules_3_0=RULE_ID
		{
			newLeafNode(lv_rules_3_0, grammarAccess.getExtendsAccess().getRulesIDTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getExtendsRule());
	        }
       		addWithLastConsumed(
       			$current, 
       			"rules",
        		lv_rules_3_0, 
        		"ID");
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getExtendsAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleActor
entryRuleActor returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getActorRule()); }
	 iv_ruleActor=ruleActor 
	 { $current=$iv_ruleActor.current; } 
	 EOF 
;

// Rule Actor
ruleActor returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Actor: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getActorRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getActorAccess().getInheritancesInheritanceParserRuleCall_2_0()); 
	    }
		lv_inheritances_2_0=ruleInheritance		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActorRule());
	        }
       		add(
       			$current, 
       			"inheritances",
        		lv_inheritances_2_0, 
        		"Inheritance");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getActorAccess().getUsesUsesParserRuleCall_3_0()); 
	    }
		lv_uses_3_0=ruleUses		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getActorRule());
	        }
       		add(
       			$current, 
       			"uses",
        		lv_uses_3_0, 
        		"Uses");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleInheritance
entryRuleInheritance returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getInheritanceRule()); }
	 iv_ruleInheritance=ruleInheritance 
	 { $current=$iv_ruleInheritance.current; } 
	 EOF 
;

// Rule Inheritance
ruleInheritance returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Extends: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getInheritanceAccess().getExtendsKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getInheritanceAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getInheritanceRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleUses
entryRuleUses returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUsesRule()); }
	 iv_ruleUses=ruleUses 
	 { $current=$iv_ruleUses.current; } 
	 EOF 
;

// Rule Uses
ruleUses returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Uses: ' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getUsesAccess().getUsesKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getUsesAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUsesRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getUsesAccess().getMultiplicityMultiplicityParserRuleCall_2_0()); 
	    }
		lv_multiplicity_2_0=ruleMultiplicity		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUsesRule());
	        }
       		set(
       			$current, 
       			"multiplicity",
        		lv_multiplicity_2_0, 
        		"Multiplicity");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleMultiplicity
entryRuleMultiplicity returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultiplicityRule()); } 
	 iv_ruleMultiplicity=ruleMultiplicity 
	 { $current=$iv_ruleMultiplicity.current.getText(); }  
	 EOF 
;

// Rule Multiplicity
ruleMultiplicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='{' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getMultiplicityAccess().getLeftCurlyBracketKeyword_0_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_0_1()); 
    }
    this_Number_1=ruleNumber    {
		$current.merge(this_Number_1);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    |(
    { 
        newCompositeNode(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_0()); 
    }
    this_Star_2=ruleStar    {
		$current.merge(this_Star_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
((
	kw=',' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getMultiplicityAccess().getCommaKeyword_1_1_0_0()); 
    }

    { 
        newCompositeNode(grammarAccess.getMultiplicityAccess().getNumberParserRuleCall_1_1_0_1()); 
    }
    this_Number_4=ruleNumber    {
		$current.merge(this_Number_4);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    |
    { 
        newCompositeNode(grammarAccess.getMultiplicityAccess().getStarParserRuleCall_1_1_1()); 
    }
    this_Star_5=ruleStar    {
		$current.merge(this_Star_5);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)?
	kw='}' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getMultiplicityAccess().getRightCurlyBracketKeyword_1_2()); 
    }
))
    ;





// Entry rule entryRuleNumber
entryRuleNumber returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getNumberRule()); } 
	 iv_ruleNumber=ruleNumber 
	 { $current=$iv_ruleNumber.current.getText(); }  
	 EOF 
;

// Rule Number
ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='0' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitZeroKeyword_0()); 
    }

    |
	kw='1' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitOneKeyword_1()); 
    }

    |
	kw='2' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitTwoKeyword_2()); 
    }

    |
	kw='3' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitThreeKeyword_3()); 
    }

    |
	kw='4' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFourKeyword_4()); 
    }

    |
	kw='5' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitFiveKeyword_5()); 
    }

    |
	kw='6' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSixKeyword_6()); 
    }

    |
	kw='7' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitSevenKeyword_7()); 
    }

    |
	kw='8' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitEightKeyword_8()); 
    }

    |
	kw='9' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getNumberAccess().getDigitNineKeyword_9()); 
    }
)*
    ;





// Entry rule entryRuleStar
entryRuleStar returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getStarRule()); } 
	 iv_ruleStar=ruleStar 
	 { $current=$iv_ruleStar.current.getText(); }  
	 EOF 
;

// Rule Star
ruleStar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getStarAccess().getAsteriskKeyword()); 
    }

    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


