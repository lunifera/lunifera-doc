/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

/*
 * generated by Xtext
 */
package org.lunifera.doc.dsl;

import org.eclipse.emf.ecore.EPackage;
import org.lunifera.doc.dsl.luniferadoc.LDocPackage;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LDocCompilerPackage;
import org.lunifera.dsl.semantic.entity.EntityPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class LuniferaDocGrammarStandaloneSetup extends
		LuniferaDocGrammarStandaloneSetupGenerated {

	public static void doSetup() {
		new LuniferaDocGrammarStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey(EntityPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(EntityPackage.eNS_URI,
					LDocPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE.containsKey(LDocPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(LDocPackage.eNS_URI,
					LDocPackage.eINSTANCE);
		}
		if (!EPackage.Registry.INSTANCE
				.containsKey(LDocCompilerPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(LDocCompilerPackage.eNS_URI,
					LDocCompilerPackage.eINSTANCE);
		}
		super.register(injector);
	}

}
