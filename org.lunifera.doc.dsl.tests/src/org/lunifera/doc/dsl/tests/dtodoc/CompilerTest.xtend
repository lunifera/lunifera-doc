/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.tests.dtodoc

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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class CompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void compareGeneratedJava() {
		val testDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/DTODocument.luniferadoc")
		testDoc.compile[assertEquals('''
			package org.lunifera.sample;
			
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.IMetaPojo;
			
			@SuppressWarnings("all")
			public class MyDTODocument implements IMetaPojo {
			  private String documentation;
			  
			  public String getDocumentation() {
			    return serializeHeader();
			  }
			  
			  public void setDocumentation(final String documentation) {
			    this.documentation = documentation;
			  }
			  
			  public CharSequence serializeHeader() {
			    StringConcatenation _builder = new StringConcatenation();
			    _builder.append("<h1>");
			    _builder.append("This is MyDTO.");
			    _builder.append("</h1>");
			    return _builder;
			  }
			}
		'''.toString, getSingleGeneratedCode)
		]
	}	
	
}