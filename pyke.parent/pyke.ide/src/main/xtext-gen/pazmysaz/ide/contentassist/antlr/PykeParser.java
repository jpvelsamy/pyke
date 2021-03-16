/*
 * generated by Xtext 2.25.0
 */
package pazmysaz.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import pazmysaz.ide.contentassist.antlr.internal.InternalPykeParser;
import pazmysaz.services.PykeGrammarAccess;

public class PykeParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PykeGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PykeGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getWidgetAccess().getAlternatives(), "rule__Widget__Alternatives");
			builder.put(grammarAccess.getDashboardAccess().getGroup(), "rule__Dashboard__Group__0");
			builder.put(grammarAccess.getTrendSummaryAccess().getGroup(), "rule__TrendSummary__Group__0");
			builder.put(grammarAccess.getDistributionSummaryAccess().getGroup(), "rule__DistributionSummary__Group__0");
			builder.put(grammarAccess.getLabelSummaryAccess().getGroup(), "rule__LabelSummary__Group__0");
			builder.put(grammarAccess.getIdentityAccess().getGroup(), "rule__Identity__Group__0");
			builder.put(grammarAccess.getReportAccess().getGroup(), "rule__Report__Group__0");
			builder.put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
			builder.put(grammarAccess.getDashboardAccess().getNameAssignment_1(), "rule__Dashboard__NameAssignment_1");
			builder.put(grammarAccess.getDashboardAccess().getIdentityAssignment_3(), "rule__Dashboard__IdentityAssignment_3");
			builder.put(grammarAccess.getDashboardAccess().getLabelSummaryAssignment_4(), "rule__Dashboard__LabelSummaryAssignment_4");
			builder.put(grammarAccess.getDashboardAccess().getDistributionSummaryAssignment_5(), "rule__Dashboard__DistributionSummaryAssignment_5");
			builder.put(grammarAccess.getDashboardAccess().getTrendSummaryAssignment_6(), "rule__Dashboard__TrendSummaryAssignment_6");
			builder.put(grammarAccess.getDashboardAccess().getReportAssignment_7(), "rule__Dashboard__ReportAssignment_7");
			builder.put(grammarAccess.getTrendSummaryAccess().getNameAssignment_1(), "rule__TrendSummary__NameAssignment_1");
			builder.put(grammarAccess.getTrendSummaryAccess().getLhsAssignment_3(), "rule__TrendSummary__LhsAssignment_3");
			builder.put(grammarAccess.getTrendSummaryAccess().getMhsAssignment_4(), "rule__TrendSummary__MhsAssignment_4");
			builder.put(grammarAccess.getTrendSummaryAccess().getRhsAssignment_5(), "rule__TrendSummary__RhsAssignment_5");
			builder.put(grammarAccess.getTrendSummaryAccess().getEdgeAssignment_6(), "rule__TrendSummary__EdgeAssignment_6");
			builder.put(grammarAccess.getDistributionSummaryAccess().getNameAssignment_1(), "rule__DistributionSummary__NameAssignment_1");
			builder.put(grammarAccess.getDistributionSummaryAccess().getLhsAssignment_3(), "rule__DistributionSummary__LhsAssignment_3");
			builder.put(grammarAccess.getDistributionSummaryAccess().getMhsAssignment_4(), "rule__DistributionSummary__MhsAssignment_4");
			builder.put(grammarAccess.getDistributionSummaryAccess().getRhsAssignment_5(), "rule__DistributionSummary__RhsAssignment_5");
			builder.put(grammarAccess.getDistributionSummaryAccess().getEdgeAssignment_6(), "rule__DistributionSummary__EdgeAssignment_6");
			builder.put(grammarAccess.getLabelSummaryAccess().getNameAssignment_1(), "rule__LabelSummary__NameAssignment_1");
			builder.put(grammarAccess.getLabelSummaryAccess().getLhsAssignment_3(), "rule__LabelSummary__LhsAssignment_3");
			builder.put(grammarAccess.getLabelSummaryAccess().getMhsAssignment_4(), "rule__LabelSummary__MhsAssignment_4");
			builder.put(grammarAccess.getLabelSummaryAccess().getRhsAssignment_5(), "rule__LabelSummary__RhsAssignment_5");
			builder.put(grammarAccess.getLabelSummaryAccess().getEdgeAssignment_6(), "rule__LabelSummary__EdgeAssignment_6");
			builder.put(grammarAccess.getIdentityAccess().getNameAssignment_1(), "rule__Identity__NameAssignment_1");
			builder.put(grammarAccess.getIdentityAccess().getLhsAssignment_3(), "rule__Identity__LhsAssignment_3");
			builder.put(grammarAccess.getIdentityAccess().getMhsAssignment_4(), "rule__Identity__MhsAssignment_4");
			builder.put(grammarAccess.getIdentityAccess().getRhsAssignment_5(), "rule__Identity__RhsAssignment_5");
			builder.put(grammarAccess.getIdentityAccess().getEdgeAssignment_6(), "rule__Identity__EdgeAssignment_6");
			builder.put(grammarAccess.getReportAccess().getNameAssignment_1(), "rule__Report__NameAssignment_1");
			builder.put(grammarAccess.getReportAccess().getSectionAssignment_3(), "rule__Report__SectionAssignment_3");
			builder.put(grammarAccess.getSectionAccess().getPresentationTypeAssignment_2(), "rule__Section__PresentationTypeAssignment_2");
			builder.put(grammarAccess.getSectionAccess().getSourceAssignment_5(), "rule__Section__SourceAssignment_5");
			builder.put(grammarAccess.getSectionAccess().getValueAssignment_8(), "rule__Section__ValueAssignment_8");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PykeGrammarAccess grammarAccess;

	@Override
	protected InternalPykeParser createParser() {
		InternalPykeParser result = new InternalPykeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PykeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PykeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}