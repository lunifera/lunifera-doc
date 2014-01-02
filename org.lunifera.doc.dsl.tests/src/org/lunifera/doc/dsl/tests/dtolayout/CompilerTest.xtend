/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.tests.dtolayout

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
		val testDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/DTOLayout.luniferadoc")
		testDoc.compile[assertEquals('''
			package doc.dto;
			
			import java.util.List;
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.document.IDTODocument;
			import org.lunifera.doc.dsl.api.document.IDTOProperty;
			import org.lunifera.doc.dsl.api.layout.IDTOLayout;
			
			@SuppressWarnings("all")
			public class DefaultDTOLayout implements IDTOLayout {
			  private IDTODocument doc;
			  
			  public void setDoc(final IDTODocument doc) {
			    this.doc = doc;
			  }
			  
			  public String serialize() {
			    StringConcatenation _builder = new StringConcatenation();
			    _builder.append("<html>");
			    _builder.append("<body>");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("Some text before the first headline.");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("<h1>");
			      _builder.append("This is a headline");
			      _builder.append("</h1>");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("<h2>");
			      _builder.append("Description");
			      _builder.append("</h2>");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      String _description = this.doc.getDescription();
			      _builder.append(_description, "	");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("<h2>");
			      _builder.append("Properties");
			      _builder.append("</h2>");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      {
			        List<IDTOProperty> _properties = this.doc.getProperties();
			        for(final IDTOProperty prop : _properties) {
			          _builder.newLine();
			          _builder.append("\t");
			          _builder.append("Name: ");
			          String _name = prop.getName();
			          _builder.append(_name, "	");
			          _builder.newLineIfNotEmpty();
			          _builder.newLine();
			          _builder.append("\t");
			          _builder.append("Description: ");
			          String _description_1 = prop.getDescription();
			          _builder.append(_description_1, "	");
			          _builder.newLineIfNotEmpty();
			          _builder.newLine();
			        }
			      }
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