/*
* generated by Xtext
*/
package org.lunifera.doc.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LuniferaDocGrammarUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.lunifera.doc.dsl.ui.internal.LuniferaDocGrammarActivator.getInstance().getInjector("org.lunifera.doc.dsl.LuniferaDocGrammar");
	}
	
}