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

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class CompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void compareGeneratedJava() {
		val testDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/GeneralDocument.luniferadoc")
		testDoc.compile[assertEquals('''
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.IDocLayout;
			import org.lunifera.doc.dsl.api.IMetaPojo;
			
			@SuppressWarnings("all")
			public class IntroductionDocument implements IDocLayout {
			  private IMetaPojo myDTODoc;
			  
			  private IMetaPojo anotherDTODoc;
			  
			  public IntroductionDocument() {
			    this.myDTODoc = new org.lunifera.sample.MyDTODocument();
			    this.anotherDTODoc = new org.lunifera.sample.AnotherDTODocument();
			    
			  }
			  
			  private IMetaPojo it;
			  
			  public void setIt(final IMetaPojo it) {
			    this.it = it;
			  }
			  
			  public String serialize() {
			    StringConcatenation _builder = new StringConcatenation();
			    _builder.append("<html>");
			    _builder.append("<body>");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("<h1>");
			      _builder.append("Once there was a Pojo named ");
			      String _name = this.myDTODoc.getName();
			      _builder.append(_name, "	");
			      _builder.append(".");
			      _builder.append("</h1>");
			      _builder.newLineIfNotEmpty();
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