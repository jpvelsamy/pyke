/*
 * generated by Xtext 2.25.0
 */
package pazmysaz.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import pazmysaz.parser.antlr.internal.InternalPykeParser;
import pazmysaz.services.PykeGrammarAccess;

public class PykeParser extends AbstractAntlrParser {

	@Inject
	private PykeGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPykeParser createParser(XtextTokenStream stream) {
		return new InternalPykeParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Dashboard";
	}

	public PykeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PykeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
