/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.tests.doclayout

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
			import java.util.List;
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.IDocLayout;
			import org.lunifera.doc.dsl.api.document.IMetaPojo;
			import org.lunifera.doc.dsl.api.document.IMetaPojoProperty;
			
			@SuppressWarnings("all")
			public class DefaultDTOLayout implements IDocLayout {
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
			      final int i = 2;
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      final List<IMetaPojoProperty> a = this.it.getProperties();
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      final String b = this.it.getDocumentation();
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      final String c = this.it.getName();
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      {
			        boolean _lessThan = (i < 10);
			        if (_lessThan) {
			          _builder.newLine();
			          _builder.append("\t");
			          _builder.append(i, "	");
			          _builder.append(" is smaller than 10");
			          _builder.newLineIfNotEmpty();
			          _builder.newLine();
			        }
			      }
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.newLine();
			      _builder.newLine();
			      _builder.append("\t");
			      _builder.append("test");
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