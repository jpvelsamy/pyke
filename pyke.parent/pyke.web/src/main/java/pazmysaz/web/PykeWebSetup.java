/*
 * generated by Xtext 2.25.0
 */
package pazmysaz.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import pazmysaz.PykeRuntimeModule;
import pazmysaz.PykeStandaloneSetup;
import pazmysaz.ide.PykeIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class PykeWebSetup extends PykeStandaloneSetup {
	
	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PykeRuntimeModule(), new PykeIdeModule(), new PykeWebModule()));
	}
	
}