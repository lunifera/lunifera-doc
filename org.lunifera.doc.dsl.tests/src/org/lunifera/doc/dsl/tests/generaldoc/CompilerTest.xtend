/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.tests.generaldoc

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider

import static org.junit.Assert.*
import static org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper.*
import org.junit.Ignore

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class CompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void compareGeneratedJava() {
		val testDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/GeneralDocument.luniferadoc")
		testDoc.compile[assertEquals('''
			package doc.general;
			
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.layout.IGenericLayout;
			
			@SuppressWarnings("all")
			public class SampleGeneralDoc implements IGenericLayout {
			  public SampleGeneralDoc() {
			    
			  }
			  
			  public String serialize() {
			    StringConcatenation _builder = new StringConcatenation();
			    _builder.append("<html>");
			    _builder.append("<body>");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("<h1>");
			      _builder.append("Example of a general document");
			      _builder.append("</h1>");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("</body>");_builder.append("</html>");
			    return _builder.toString();
			  }
			}
		'''.toString, getSingleGeneratedCode)
		]
	}	
	
}