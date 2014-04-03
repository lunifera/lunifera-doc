/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.dtolayout;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider;
import org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper;

@RunWith(XtextRunner.class)
@InjectWith(LuniferaDocGrammarInjectorProvider.class)
@SuppressWarnings("all")
public class CompilerTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void compareGeneratedJava() {
    try {
      final StringBuilder testDoc = LuniferaDocTestHelper.loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/DTOLayout.luniferadoc");
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("package doc.dto;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("import java.util.List;");
          _builder.newLine();
          _builder.append("import org.eclipse.xtend2.lib.StringConcatenation;");
          _builder.newLine();
          _builder.append("import org.lunifera.doc.dsl.api.document.IDTODocument;");
          _builder.newLine();
          _builder.append("import org.lunifera.doc.dsl.api.document.IDTOProperty;");
          _builder.newLine();
          _builder.append("import org.lunifera.doc.dsl.api.layout.IDTOLayout;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("@SuppressWarnings(\"all\")");
          _builder.newLine();
          _builder.append("public class DefaultDTOLayout implements IDTOLayout {");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("private IDTODocument doc;");
          _builder.newLine();
          _builder.append("  ");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("public void setDoc(final IDTODocument doc) {");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("this.doc = doc;");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("  ");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("public String serialize() {");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("StringConcatenation _builder = new StringConcatenation();");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("_builder.append(\"<html>\");");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("_builder.append(\"<body>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLineIfNotEmpty();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"Some text before the first headline.\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"<h1>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"This is a headline\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"</h1>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLineIfNotEmpty();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"<h2>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"Description\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"</h2>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLineIfNotEmpty();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("String _description = this.doc.getDescription();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(_description, \"\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLineIfNotEmpty();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"<h2>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"Properties\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"</h2>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLineIfNotEmpty();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("{");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("List<IDTOProperty> _properties = this.doc.getProperties();");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("for(final IDTOProperty prop : _properties) {");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.append(\"Name: \");");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("String _name = prop.getName();");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.append(_name, \"\t\");");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.newLineIfNotEmpty();");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.append(\"Description: \");");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("String _description_1 = prop.getDescription();");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.append(_description_1, \"\t\");");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.newLineIfNotEmpty();");
          _builder.newLine();
          _builder.append("          ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.newLine();");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"\\t\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"</body>\");_builder.append(\"</html>\");");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("return _builder.toString();");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          String _string = _builder.toString();
          String _singleGeneratedCode = it.getSingleGeneratedCode();
          Assert.assertEquals(_string, _singleGeneratedCode);
        }
      };
      this._compilationTestHelper.compile(testDoc, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}