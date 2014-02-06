/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.generaldoc;

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
      final StringBuilder testDoc = LuniferaDocTestHelper.loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/GeneralDocument.luniferadoc");
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("package doc.general;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("import org.eclipse.xtend2.lib.StringConcatenation;");
          _builder.newLine();
          _builder.append("import org.lunifera.doc.dsl.api.layout.IGenericLayout;");
          _builder.newLine();
          _builder.newLine();
          _builder.append("@SuppressWarnings(\"all\")");
          _builder.newLine();
          _builder.append("public class SampleGeneralDoc implements IGenericLayout {");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("public SampleGeneralDoc() {");
          _builder.newLine();
          _builder.append("    ");
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
          _builder.append("_builder.append(\"<h1>\");");
          _builder.newLine();
          _builder.append("      ");
          _builder.append("_builder.append(\"Example of a general document\");");
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
