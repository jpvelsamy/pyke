/*
 * generated by Xtext 2.25.0
 */
package pazmysaz.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PykeAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("pazmysaz/parser/antlr/internal/InternalPyke.tokens");
	}
}
