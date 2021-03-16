package pazmysaz.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pazmysaz.services.PykeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPykeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dashboard'", "'{'", "'}'", "'trendsummary'", "'distributionsummary'", "'labelsummary'", "'identitylevel'", "'grid'", "'presented'", "'as'", "'fields'", "'from'", "'through'", "'reportcard'", "'eventiles'", "'pie'", "'histogram'", "'dbar'", "'badge'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPykeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPykeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPykeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPyke.g"; }



     	private PykeGrammarAccess grammarAccess;

        public InternalPykeParser(TokenStream input, PykeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dashboard";
       	}

       	@Override
       	protected PykeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDashboard"
    // InternalPyke.g:65:1: entryRuleDashboard returns [EObject current=null] : iv_ruleDashboard= ruleDashboard EOF ;
    public final EObject entryRuleDashboard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashboard = null;


        try {
            // InternalPyke.g:65:50: (iv_ruleDashboard= ruleDashboard EOF )
            // InternalPyke.g:66:2: iv_ruleDashboard= ruleDashboard EOF
            {
             newCompositeNode(grammarAccess.getDashboardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDashboard=ruleDashboard();

            state._fsp--;

             current =iv_ruleDashboard; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // InternalPyke.g:72:1: ruleDashboard returns [EObject current=null] : (otherlv_0= 'dashboard' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_identity_3_0= ruleIdentity ) )? ( (lv_labelSummary_4_0= ruleLabelSummary ) )? ( (lv_distributionSummary_5_0= ruleDistributionSummary ) )? ( (lv_trendSummary_6_0= ruleTrendSummary ) )? ( (lv_report_7_0= ruleReport ) )? otherlv_8= '}' ) ;
    public final EObject ruleDashboard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_identity_3_0 = null;

        EObject lv_labelSummary_4_0 = null;

        EObject lv_distributionSummary_5_0 = null;

        EObject lv_trendSummary_6_0 = null;

        EObject lv_report_7_0 = null;



        	enterRule();

        try {
            // InternalPyke.g:78:2: ( (otherlv_0= 'dashboard' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_identity_3_0= ruleIdentity ) )? ( (lv_labelSummary_4_0= ruleLabelSummary ) )? ( (lv_distributionSummary_5_0= ruleDistributionSummary ) )? ( (lv_trendSummary_6_0= ruleTrendSummary ) )? ( (lv_report_7_0= ruleReport ) )? otherlv_8= '}' ) )
            // InternalPyke.g:79:2: (otherlv_0= 'dashboard' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_identity_3_0= ruleIdentity ) )? ( (lv_labelSummary_4_0= ruleLabelSummary ) )? ( (lv_distributionSummary_5_0= ruleDistributionSummary ) )? ( (lv_trendSummary_6_0= ruleTrendSummary ) )? ( (lv_report_7_0= ruleReport ) )? otherlv_8= '}' )
            {
            // InternalPyke.g:79:2: (otherlv_0= 'dashboard' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_identity_3_0= ruleIdentity ) )? ( (lv_labelSummary_4_0= ruleLabelSummary ) )? ( (lv_distributionSummary_5_0= ruleDistributionSummary ) )? ( (lv_trendSummary_6_0= ruleTrendSummary ) )? ( (lv_report_7_0= ruleReport ) )? otherlv_8= '}' )
            // InternalPyke.g:80:3: otherlv_0= 'dashboard' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_identity_3_0= ruleIdentity ) )? ( (lv_labelSummary_4_0= ruleLabelSummary ) )? ( (lv_distributionSummary_5_0= ruleDistributionSummary ) )? ( (lv_trendSummary_6_0= ruleTrendSummary ) )? ( (lv_report_7_0= ruleReport ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDashboardAccess().getDashboardKeyword_0());
            		
            // InternalPyke.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPyke.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPyke.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalPyke.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDashboardAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDashboardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getDashboardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPyke.g:106:3: ( (lv_identity_3_0= ruleIdentity ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPyke.g:107:4: (lv_identity_3_0= ruleIdentity )
                    {
                    // InternalPyke.g:107:4: (lv_identity_3_0= ruleIdentity )
                    // InternalPyke.g:108:5: lv_identity_3_0= ruleIdentity
                    {

                    					newCompositeNode(grammarAccess.getDashboardAccess().getIdentityIdentityParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_identity_3_0=ruleIdentity();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDashboardRule());
                    					}
                    					set(
                    						current,
                    						"identity",
                    						lv_identity_3_0,
                    						"pazmysaz.Pyke.Identity");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:125:3: ( (lv_labelSummary_4_0= ruleLabelSummary ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPyke.g:126:4: (lv_labelSummary_4_0= ruleLabelSummary )
                    {
                    // InternalPyke.g:126:4: (lv_labelSummary_4_0= ruleLabelSummary )
                    // InternalPyke.g:127:5: lv_labelSummary_4_0= ruleLabelSummary
                    {

                    					newCompositeNode(grammarAccess.getDashboardAccess().getLabelSummaryLabelSummaryParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_labelSummary_4_0=ruleLabelSummary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDashboardRule());
                    					}
                    					set(
                    						current,
                    						"labelSummary",
                    						lv_labelSummary_4_0,
                    						"pazmysaz.Pyke.LabelSummary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:144:3: ( (lv_distributionSummary_5_0= ruleDistributionSummary ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPyke.g:145:4: (lv_distributionSummary_5_0= ruleDistributionSummary )
                    {
                    // InternalPyke.g:145:4: (lv_distributionSummary_5_0= ruleDistributionSummary )
                    // InternalPyke.g:146:5: lv_distributionSummary_5_0= ruleDistributionSummary
                    {

                    					newCompositeNode(grammarAccess.getDashboardAccess().getDistributionSummaryDistributionSummaryParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_distributionSummary_5_0=ruleDistributionSummary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDashboardRule());
                    					}
                    					set(
                    						current,
                    						"distributionSummary",
                    						lv_distributionSummary_5_0 != null,
                    						"pazmysaz.Pyke.DistributionSummary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:163:3: ( (lv_trendSummary_6_0= ruleTrendSummary ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPyke.g:164:4: (lv_trendSummary_6_0= ruleTrendSummary )
                    {
                    // InternalPyke.g:164:4: (lv_trendSummary_6_0= ruleTrendSummary )
                    // InternalPyke.g:165:5: lv_trendSummary_6_0= ruleTrendSummary
                    {

                    					newCompositeNode(grammarAccess.getDashboardAccess().getTrendSummaryTrendSummaryParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_trendSummary_6_0=ruleTrendSummary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDashboardRule());
                    					}
                    					set(
                    						current,
                    						"trendSummary",
                    						lv_trendSummary_6_0 != null,
                    						"pazmysaz.Pyke.TrendSummary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:182:3: ( (lv_report_7_0= ruleReport ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPyke.g:183:4: (lv_report_7_0= ruleReport )
                    {
                    // InternalPyke.g:183:4: (lv_report_7_0= ruleReport )
                    // InternalPyke.g:184:5: lv_report_7_0= ruleReport
                    {

                    					newCompositeNode(grammarAccess.getDashboardAccess().getReportReportParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_report_7_0=ruleReport();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDashboardRule());
                    					}
                    					set(
                    						current,
                    						"report",
                    						lv_report_7_0,
                    						"pazmysaz.Pyke.Report");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDashboardAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRuleTrendSummary"
    // InternalPyke.g:209:1: entryRuleTrendSummary returns [EObject current=null] : iv_ruleTrendSummary= ruleTrendSummary EOF ;
    public final EObject entryRuleTrendSummary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrendSummary = null;


        try {
            // InternalPyke.g:209:53: (iv_ruleTrendSummary= ruleTrendSummary EOF )
            // InternalPyke.g:210:2: iv_ruleTrendSummary= ruleTrendSummary EOF
            {
             newCompositeNode(grammarAccess.getTrendSummaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrendSummary=ruleTrendSummary();

            state._fsp--;

             current =iv_ruleTrendSummary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTrendSummary"


    // $ANTLR start "ruleTrendSummary"
    // InternalPyke.g:216:1: ruleTrendSummary returns [EObject current=null] : (otherlv_0= 'trendsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) ;
    public final EObject ruleTrendSummary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_mhs_4_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_edge_6_0 = null;



        	enterRule();

        try {
            // InternalPyke.g:222:2: ( (otherlv_0= 'trendsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) )
            // InternalPyke.g:223:2: (otherlv_0= 'trendsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            {
            // InternalPyke.g:223:2: (otherlv_0= 'trendsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            // InternalPyke.g:224:3: otherlv_0= 'trendsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTrendSummaryAccess().getTrendsummaryKeyword_0());
            		
            // InternalPyke.g:228:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPyke.g:229:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPyke.g:229:4: (lv_name_1_0= RULE_STRING )
            // InternalPyke.g:230:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTrendSummaryAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrendSummaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTrendSummaryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPyke.g:250:3: ( (lv_lhs_3_0= ruleSection ) )
            // InternalPyke.g:251:4: (lv_lhs_3_0= ruleSection )
            {
            // InternalPyke.g:251:4: (lv_lhs_3_0= ruleSection )
            // InternalPyke.g:252:5: lv_lhs_3_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getTrendSummaryAccess().getLhsSectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_lhs_3_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrendSummaryRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_3_0,
            						"pazmysaz.Pyke.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPyke.g:269:3: ( (lv_mhs_4_0= ruleSection ) )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalPyke.g:270:4: (lv_mhs_4_0= ruleSection )
                    {
                    // InternalPyke.g:270:4: (lv_mhs_4_0= ruleSection )
                    // InternalPyke.g:271:5: lv_mhs_4_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getTrendSummaryAccess().getMhsSectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_mhs_4_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTrendSummaryRule());
                    					}
                    					set(
                    						current,
                    						"mhs",
                    						lv_mhs_4_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:288:3: ( (lv_rhs_5_0= ruleSection ) )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalPyke.g:289:4: (lv_rhs_5_0= ruleSection )
                    {
                    // InternalPyke.g:289:4: (lv_rhs_5_0= ruleSection )
                    // InternalPyke.g:290:5: lv_rhs_5_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getTrendSummaryAccess().getRhsSectionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_rhs_5_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTrendSummaryRule());
                    					}
                    					set(
                    						current,
                    						"rhs",
                    						lv_rhs_5_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:307:3: ( (lv_edge_6_0= ruleSection ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPyke.g:308:4: (lv_edge_6_0= ruleSection )
            	    {
            	    // InternalPyke.g:308:4: (lv_edge_6_0= ruleSection )
            	    // InternalPyke.g:309:5: lv_edge_6_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getTrendSummaryAccess().getEdgeSectionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_edge_6_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTrendSummaryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edge",
            	    						lv_edge_6_0,
            	    						"pazmysaz.Pyke.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTrendSummaryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTrendSummary"


    // $ANTLR start "entryRuleDistributionSummary"
    // InternalPyke.g:334:1: entryRuleDistributionSummary returns [EObject current=null] : iv_ruleDistributionSummary= ruleDistributionSummary EOF ;
    public final EObject entryRuleDistributionSummary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributionSummary = null;


        try {
            // InternalPyke.g:334:60: (iv_ruleDistributionSummary= ruleDistributionSummary EOF )
            // InternalPyke.g:335:2: iv_ruleDistributionSummary= ruleDistributionSummary EOF
            {
             newCompositeNode(grammarAccess.getDistributionSummaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistributionSummary=ruleDistributionSummary();

            state._fsp--;

             current =iv_ruleDistributionSummary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDistributionSummary"


    // $ANTLR start "ruleDistributionSummary"
    // InternalPyke.g:341:1: ruleDistributionSummary returns [EObject current=null] : (otherlv_0= 'distributionsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) ;
    public final EObject ruleDistributionSummary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_mhs_4_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_edge_6_0 = null;



        	enterRule();

        try {
            // InternalPyke.g:347:2: ( (otherlv_0= 'distributionsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) )
            // InternalPyke.g:348:2: (otherlv_0= 'distributionsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            {
            // InternalPyke.g:348:2: (otherlv_0= 'distributionsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            // InternalPyke.g:349:3: otherlv_0= 'distributionsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDistributionSummaryAccess().getDistributionsummaryKeyword_0());
            		
            // InternalPyke.g:353:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPyke.g:354:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPyke.g:354:4: (lv_name_1_0= RULE_STRING )
            // InternalPyke.g:355:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDistributionSummaryAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistributionSummaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDistributionSummaryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPyke.g:375:3: ( (lv_lhs_3_0= ruleSection ) )
            // InternalPyke.g:376:4: (lv_lhs_3_0= ruleSection )
            {
            // InternalPyke.g:376:4: (lv_lhs_3_0= ruleSection )
            // InternalPyke.g:377:5: lv_lhs_3_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getDistributionSummaryAccess().getLhsSectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_lhs_3_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistributionSummaryRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_3_0,
            						"pazmysaz.Pyke.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPyke.g:394:3: ( (lv_mhs_4_0= ruleSection ) )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalPyke.g:395:4: (lv_mhs_4_0= ruleSection )
                    {
                    // InternalPyke.g:395:4: (lv_mhs_4_0= ruleSection )
                    // InternalPyke.g:396:5: lv_mhs_4_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getDistributionSummaryAccess().getMhsSectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_mhs_4_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDistributionSummaryRule());
                    					}
                    					set(
                    						current,
                    						"mhs",
                    						lv_mhs_4_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:413:3: ( (lv_rhs_5_0= ruleSection ) )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalPyke.g:414:4: (lv_rhs_5_0= ruleSection )
                    {
                    // InternalPyke.g:414:4: (lv_rhs_5_0= ruleSection )
                    // InternalPyke.g:415:5: lv_rhs_5_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getDistributionSummaryAccess().getRhsSectionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_rhs_5_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDistributionSummaryRule());
                    					}
                    					set(
                    						current,
                    						"rhs",
                    						lv_rhs_5_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:432:3: ( (lv_edge_6_0= ruleSection ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPyke.g:433:4: (lv_edge_6_0= ruleSection )
            	    {
            	    // InternalPyke.g:433:4: (lv_edge_6_0= ruleSection )
            	    // InternalPyke.g:434:5: lv_edge_6_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getDistributionSummaryAccess().getEdgeSectionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_edge_6_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDistributionSummaryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edge",
            	    						lv_edge_6_0,
            	    						"pazmysaz.Pyke.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDistributionSummaryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDistributionSummary"


    // $ANTLR start "entryRuleLabelSummary"
    // InternalPyke.g:459:1: entryRuleLabelSummary returns [EObject current=null] : iv_ruleLabelSummary= ruleLabelSummary EOF ;
    public final EObject entryRuleLabelSummary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelSummary = null;


        try {
            // InternalPyke.g:459:53: (iv_ruleLabelSummary= ruleLabelSummary EOF )
            // InternalPyke.g:460:2: iv_ruleLabelSummary= ruleLabelSummary EOF
            {
             newCompositeNode(grammarAccess.getLabelSummaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelSummary=ruleLabelSummary();

            state._fsp--;

             current =iv_ruleLabelSummary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabelSummary"


    // $ANTLR start "ruleLabelSummary"
    // InternalPyke.g:466:1: ruleLabelSummary returns [EObject current=null] : (otherlv_0= 'labelsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) ;
    public final EObject ruleLabelSummary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_mhs_4_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_edge_6_0 = null;



        	enterRule();

        try {
            // InternalPyke.g:472:2: ( (otherlv_0= 'labelsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) )
            // InternalPyke.g:473:2: (otherlv_0= 'labelsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            {
            // InternalPyke.g:473:2: (otherlv_0= 'labelsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            // InternalPyke.g:474:3: otherlv_0= 'labelsummary' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelSummaryAccess().getLabelsummaryKeyword_0());
            		
            // InternalPyke.g:478:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPyke.g:479:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPyke.g:479:4: (lv_name_1_0= RULE_STRING )
            // InternalPyke.g:480:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLabelSummaryAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelSummaryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelSummaryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPyke.g:500:3: ( (lv_lhs_3_0= ruleSection ) )
            // InternalPyke.g:501:4: (lv_lhs_3_0= ruleSection )
            {
            // InternalPyke.g:501:4: (lv_lhs_3_0= ruleSection )
            // InternalPyke.g:502:5: lv_lhs_3_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getLabelSummaryAccess().getLhsSectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_lhs_3_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelSummaryRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_3_0,
            						"pazmysaz.Pyke.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPyke.g:519:3: ( (lv_mhs_4_0= ruleSection ) )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalPyke.g:520:4: (lv_mhs_4_0= ruleSection )
                    {
                    // InternalPyke.g:520:4: (lv_mhs_4_0= ruleSection )
                    // InternalPyke.g:521:5: lv_mhs_4_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getLabelSummaryAccess().getMhsSectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_mhs_4_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLabelSummaryRule());
                    					}
                    					set(
                    						current,
                    						"mhs",
                    						lv_mhs_4_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:538:3: ( (lv_rhs_5_0= ruleSection ) )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalPyke.g:539:4: (lv_rhs_5_0= ruleSection )
                    {
                    // InternalPyke.g:539:4: (lv_rhs_5_0= ruleSection )
                    // InternalPyke.g:540:5: lv_rhs_5_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getLabelSummaryAccess().getRhsSectionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_rhs_5_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLabelSummaryRule());
                    					}
                    					set(
                    						current,
                    						"rhs",
                    						lv_rhs_5_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:557:3: ( (lv_edge_6_0= ruleSection ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPyke.g:558:4: (lv_edge_6_0= ruleSection )
            	    {
            	    // InternalPyke.g:558:4: (lv_edge_6_0= ruleSection )
            	    // InternalPyke.g:559:5: lv_edge_6_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getLabelSummaryAccess().getEdgeSectionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_edge_6_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLabelSummaryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edge",
            	    						lv_edge_6_0,
            	    						"pazmysaz.Pyke.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLabelSummaryAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLabelSummary"


    // $ANTLR start "entryRuleIdentity"
    // InternalPyke.g:584:1: entryRuleIdentity returns [EObject current=null] : iv_ruleIdentity= ruleIdentity EOF ;
    public final EObject entryRuleIdentity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdentity = null;


        try {
            // InternalPyke.g:584:49: (iv_ruleIdentity= ruleIdentity EOF )
            // InternalPyke.g:585:2: iv_ruleIdentity= ruleIdentity EOF
            {
             newCompositeNode(grammarAccess.getIdentityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIdentity=ruleIdentity();

            state._fsp--;

             current =iv_ruleIdentity; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIdentity"


    // $ANTLR start "ruleIdentity"
    // InternalPyke.g:591:1: ruleIdentity returns [EObject current=null] : (otherlv_0= 'identitylevel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) ;
    public final EObject ruleIdentity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_mhs_4_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_edge_6_0 = null;



        	enterRule();

        try {
            // InternalPyke.g:597:2: ( (otherlv_0= 'identitylevel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' ) )
            // InternalPyke.g:598:2: (otherlv_0= 'identitylevel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            {
            // InternalPyke.g:598:2: (otherlv_0= 'identitylevel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}' )
            // InternalPyke.g:599:3: otherlv_0= 'identitylevel' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_lhs_3_0= ruleSection ) ) ( (lv_mhs_4_0= ruleSection ) )? ( (lv_rhs_5_0= ruleSection ) )? ( (lv_edge_6_0= ruleSection ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIdentityAccess().getIdentitylevelKeyword_0());
            		
            // InternalPyke.g:603:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPyke.g:604:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPyke.g:604:4: (lv_name_1_0= RULE_STRING )
            // InternalPyke.g:605:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIdentityAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIdentityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getIdentityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPyke.g:625:3: ( (lv_lhs_3_0= ruleSection ) )
            // InternalPyke.g:626:4: (lv_lhs_3_0= ruleSection )
            {
            // InternalPyke.g:626:4: (lv_lhs_3_0= ruleSection )
            // InternalPyke.g:627:5: lv_lhs_3_0= ruleSection
            {

            					newCompositeNode(grammarAccess.getIdentityAccess().getLhsSectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_lhs_3_0=ruleSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIdentityRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_3_0,
            						"pazmysaz.Pyke.Section");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPyke.g:644:3: ( (lv_mhs_4_0= ruleSection ) )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalPyke.g:645:4: (lv_mhs_4_0= ruleSection )
                    {
                    // InternalPyke.g:645:4: (lv_mhs_4_0= ruleSection )
                    // InternalPyke.g:646:5: lv_mhs_4_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getIdentityAccess().getMhsSectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_mhs_4_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIdentityRule());
                    					}
                    					set(
                    						current,
                    						"mhs",
                    						lv_mhs_4_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:663:3: ( (lv_rhs_5_0= ruleSection ) )?
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalPyke.g:664:4: (lv_rhs_5_0= ruleSection )
                    {
                    // InternalPyke.g:664:4: (lv_rhs_5_0= ruleSection )
                    // InternalPyke.g:665:5: lv_rhs_5_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getIdentityAccess().getRhsSectionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_rhs_5_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getIdentityRule());
                    					}
                    					set(
                    						current,
                    						"rhs",
                    						lv_rhs_5_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPyke.g:682:3: ( (lv_edge_6_0= ruleSection ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPyke.g:683:4: (lv_edge_6_0= ruleSection )
            	    {
            	    // InternalPyke.g:683:4: (lv_edge_6_0= ruleSection )
            	    // InternalPyke.g:684:5: lv_edge_6_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getIdentityAccess().getEdgeSectionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_edge_6_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIdentityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"edge",
            	    						lv_edge_6_0,
            	    						"pazmysaz.Pyke.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getIdentityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleIdentity"


    // $ANTLR start "entryRuleReport"
    // InternalPyke.g:709:1: entryRuleReport returns [EObject current=null] : iv_ruleReport= ruleReport EOF ;
    public final EObject entryRuleReport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReport = null;


        try {
            // InternalPyke.g:709:47: (iv_ruleReport= ruleReport EOF )
            // InternalPyke.g:710:2: iv_ruleReport= ruleReport EOF
            {
             newCompositeNode(grammarAccess.getReportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReport=ruleReport();

            state._fsp--;

             current =iv_ruleReport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReport"


    // $ANTLR start "ruleReport"
    // InternalPyke.g:716:1: ruleReport returns [EObject current=null] : (otherlv_0= 'grid' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_section_3_0= ruleSection ) )? otherlv_4= '}' ) ;
    public final EObject ruleReport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_section_3_0 = null;



        	enterRule();

        try {
            // InternalPyke.g:722:2: ( (otherlv_0= 'grid' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_section_3_0= ruleSection ) )? otherlv_4= '}' ) )
            // InternalPyke.g:723:2: (otherlv_0= 'grid' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_section_3_0= ruleSection ) )? otherlv_4= '}' )
            {
            // InternalPyke.g:723:2: (otherlv_0= 'grid' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_section_3_0= ruleSection ) )? otherlv_4= '}' )
            // InternalPyke.g:724:3: otherlv_0= 'grid' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_section_3_0= ruleSection ) )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReportAccess().getGridKeyword_0());
            		
            // InternalPyke.g:728:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalPyke.g:729:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalPyke.g:729:4: (lv_name_1_0= RULE_STRING )
            // InternalPyke.g:730:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getReportAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getReportAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPyke.g:750:3: ( (lv_section_3_0= ruleSection ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPyke.g:751:4: (lv_section_3_0= ruleSection )
                    {
                    // InternalPyke.g:751:4: (lv_section_3_0= ruleSection )
                    // InternalPyke.g:752:5: lv_section_3_0= ruleSection
                    {

                    					newCompositeNode(grammarAccess.getReportAccess().getSectionSectionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_section_3_0=ruleSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getReportRule());
                    					}
                    					set(
                    						current,
                    						"section",
                    						lv_section_3_0,
                    						"pazmysaz.Pyke.Section");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReportAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleReport"


    // $ANTLR start "entryRuleSection"
    // InternalPyke.g:777:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalPyke.g:777:48: (iv_ruleSection= ruleSection EOF )
            // InternalPyke.g:778:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalPyke.g:784:1: ruleSection returns [EObject current=null] : (otherlv_0= 'presented' otherlv_1= 'as' ( (lv_presentationType_2_0= ruleWidget ) ) otherlv_3= 'fields' otherlv_4= 'from' ( (lv_source_5_0= RULE_STRING ) ) otherlv_6= 'through' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_source_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_value_8_0=null;
        Token otherlv_9=null;
        Enumerator lv_presentationType_2_0 = null;



        	enterRule();

        try {
            // InternalPyke.g:790:2: ( (otherlv_0= 'presented' otherlv_1= 'as' ( (lv_presentationType_2_0= ruleWidget ) ) otherlv_3= 'fields' otherlv_4= 'from' ( (lv_source_5_0= RULE_STRING ) ) otherlv_6= 'through' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' ) )
            // InternalPyke.g:791:2: (otherlv_0= 'presented' otherlv_1= 'as' ( (lv_presentationType_2_0= ruleWidget ) ) otherlv_3= 'fields' otherlv_4= 'from' ( (lv_source_5_0= RULE_STRING ) ) otherlv_6= 'through' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' )
            {
            // InternalPyke.g:791:2: (otherlv_0= 'presented' otherlv_1= 'as' ( (lv_presentationType_2_0= ruleWidget ) ) otherlv_3= 'fields' otherlv_4= 'from' ( (lv_source_5_0= RULE_STRING ) ) otherlv_6= 'through' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}' )
            // InternalPyke.g:792:3: otherlv_0= 'presented' otherlv_1= 'as' ( (lv_presentationType_2_0= ruleWidget ) ) otherlv_3= 'fields' otherlv_4= 'from' ( (lv_source_5_0= RULE_STRING ) ) otherlv_6= 'through' otherlv_7= '{' ( (lv_value_8_0= RULE_STRING ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getPresentedKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSectionAccess().getAsKeyword_1());
            		
            // InternalPyke.g:800:3: ( (lv_presentationType_2_0= ruleWidget ) )
            // InternalPyke.g:801:4: (lv_presentationType_2_0= ruleWidget )
            {
            // InternalPyke.g:801:4: (lv_presentationType_2_0= ruleWidget )
            // InternalPyke.g:802:5: lv_presentationType_2_0= ruleWidget
            {

            					newCompositeNode(grammarAccess.getSectionAccess().getPresentationTypeWidgetEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_presentationType_2_0=ruleWidget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSectionRule());
            					}
            					set(
            						current,
            						"presentationType",
            						lv_presentationType_2_0,
            						"pazmysaz.Pyke.Widget");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getSectionAccess().getFieldsKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getFromKeyword_4());
            		
            // InternalPyke.g:827:3: ( (lv_source_5_0= RULE_STRING ) )
            // InternalPyke.g:828:4: (lv_source_5_0= RULE_STRING )
            {
            // InternalPyke.g:828:4: (lv_source_5_0= RULE_STRING )
            // InternalPyke.g:829:5: lv_source_5_0= RULE_STRING
            {
            lv_source_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_source_5_0, grammarAccess.getSectionAccess().getSourceSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getSectionAccess().getThroughKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSectionAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalPyke.g:853:3: ( (lv_value_8_0= RULE_STRING ) )
            // InternalPyke.g:854:4: (lv_value_8_0= RULE_STRING )
            {
            // InternalPyke.g:854:4: (lv_value_8_0= RULE_STRING )
            // InternalPyke.g:855:5: lv_value_8_0= RULE_STRING
            {
            lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_8_0, grammarAccess.getSectionAccess().getValueSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSectionAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "ruleWidget"
    // InternalPyke.g:879:1: ruleWidget returns [Enumerator current=null] : ( (enumLiteral_0= 'reportcard' ) | (enumLiteral_1= 'eventiles' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'histogram' ) | (enumLiteral_4= 'dbar' ) | (enumLiteral_5= 'badge' ) | (enumLiteral_6= 'grid' ) ) ;
    public final Enumerator ruleWidget() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalPyke.g:885:2: ( ( (enumLiteral_0= 'reportcard' ) | (enumLiteral_1= 'eventiles' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'histogram' ) | (enumLiteral_4= 'dbar' ) | (enumLiteral_5= 'badge' ) | (enumLiteral_6= 'grid' ) ) )
            // InternalPyke.g:886:2: ( (enumLiteral_0= 'reportcard' ) | (enumLiteral_1= 'eventiles' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'histogram' ) | (enumLiteral_4= 'dbar' ) | (enumLiteral_5= 'badge' ) | (enumLiteral_6= 'grid' ) )
            {
            // InternalPyke.g:886:2: ( (enumLiteral_0= 'reportcard' ) | (enumLiteral_1= 'eventiles' ) | (enumLiteral_2= 'pie' ) | (enumLiteral_3= 'histogram' ) | (enumLiteral_4= 'dbar' ) | (enumLiteral_5= 'badge' ) | (enumLiteral_6= 'grid' ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt19=1;
                }
                break;
            case 25:
                {
                alt19=2;
                }
                break;
            case 26:
                {
                alt19=3;
                }
                break;
            case 27:
                {
                alt19=4;
                }
                break;
            case 28:
                {
                alt19=5;
                }
                break;
            case 29:
                {
                alt19=6;
                }
                break;
            case 18:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPyke.g:887:3: (enumLiteral_0= 'reportcard' )
                    {
                    // InternalPyke.g:887:3: (enumLiteral_0= 'reportcard' )
                    // InternalPyke.g:888:4: enumLiteral_0= 'reportcard'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getWidgetAccess().getReportcardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWidgetAccess().getReportcardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPyke.g:895:3: (enumLiteral_1= 'eventiles' )
                    {
                    // InternalPyke.g:895:3: (enumLiteral_1= 'eventiles' )
                    // InternalPyke.g:896:4: enumLiteral_1= 'eventiles'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getWidgetAccess().getEventilesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWidgetAccess().getEventilesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPyke.g:903:3: (enumLiteral_2= 'pie' )
                    {
                    // InternalPyke.g:903:3: (enumLiteral_2= 'pie' )
                    // InternalPyke.g:904:4: enumLiteral_2= 'pie'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getWidgetAccess().getPieEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWidgetAccess().getPieEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPyke.g:911:3: (enumLiteral_3= 'histogram' )
                    {
                    // InternalPyke.g:911:3: (enumLiteral_3= 'histogram' )
                    // InternalPyke.g:912:4: enumLiteral_3= 'histogram'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getWidgetAccess().getHistogramEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWidgetAccess().getHistogramEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPyke.g:919:3: (enumLiteral_4= 'dbar' )
                    {
                    // InternalPyke.g:919:3: (enumLiteral_4= 'dbar' )
                    // InternalPyke.g:920:4: enumLiteral_4= 'dbar'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getWidgetAccess().getDbarEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWidgetAccess().getDbarEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPyke.g:927:3: (enumLiteral_5= 'badge' )
                    {
                    // InternalPyke.g:927:3: (enumLiteral_5= 'badge' )
                    // InternalPyke.g:928:4: enumLiteral_5= 'badge'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getWidgetAccess().getBadgeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getWidgetAccess().getBadgeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPyke.g:935:3: (enumLiteral_6= 'grid' )
                    {
                    // InternalPyke.g:935:3: (enumLiteral_6= 'grid' )
                    // InternalPyke.g:936:4: enumLiteral_6= 'grid'
                    {
                    enumLiteral_6=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getWidgetAccess().getGridEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getWidgetAccess().getGridEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleWidget"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\15\1\24\1\uffff\1\22\7\25\1\26\1\4\1\27\1\14\1\4\1\15\1\uffff";
    static final String dfa_3s = "\1\23\1\24\1\uffff\1\35\7\25\1\26\1\4\1\27\1\14\1\4\1\15\1\uffff";
    static final String dfa_4s = "\2\uffff\1\2\16\uffff\1\1";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\5\uffff\1\1",
            "\1\3",
            "",
            "\1\12\5\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "269:3: ( (lv_mhs_4_0= ruleSection ) )?";
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "288:3: ( (lv_rhs_5_0= ruleSection ) )?";
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "394:3: ( (lv_mhs_4_0= ruleSection ) )?";
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "413:3: ( (lv_rhs_5_0= ruleSection ) )?";
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "519:3: ( (lv_mhs_4_0= ruleSection ) )?";
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "538:3: ( (lv_rhs_5_0= ruleSection ) )?";
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "644:3: ( (lv_mhs_4_0= ruleSection ) )?";
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "663:3: ( (lv_rhs_5_0= ruleSection ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000005E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000004E000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000046000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000003F040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});

}