/*
 * generated by Xtext 2.25.0
 */
package pazmysaz.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import pazmysaz.PykeRuntimeModule;
import pazmysaz.PykeStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class PykeIdeSetup extends PykeStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PykeRuntimeModule(), new PykeIdeModule()));
	}
	
}
