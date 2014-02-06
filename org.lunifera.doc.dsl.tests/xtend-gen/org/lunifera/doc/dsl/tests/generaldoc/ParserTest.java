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
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(LuniferaDocGrammarInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  @Extension
  private /* ParseHelper<GeneralDocument> */Object _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Test
  public void testParsing() {
    throw new Error("Unresolved compilation problems:"
      + "\nname cannot be resolved"
      + "\nincludes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nincludes cannot be resolved"
      + "\nget cannot be resolved"
      + "\ninclude cannot be resolved"
      + "\nincludes cannot be resolved"
      + "\nget cannot be resolved"
      + "\nvarName cannot be resolved"
      + "\ncontent cannot be resolved"
      + "\nclass cannot be resolved");
  }
  
  /**
   * Currently unused but kept as a sample
   */
  @SuppressWarnings("unused")
  private String generateTestDoc() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("GeneralDocument Introduction {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("include org.lunifera.sample.MyDTODocument as myDTODoc");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("include org.lunifera.sample.AnotherDTODocument as anotherDTODoc");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\'\'\'", "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("«", "\t\t\t");
    _builder.append("h1");
    _builder.append("»", "\t\t\t");
    _builder.append("Once there was a Pojo named ");
    _builder.append("«", "\t\t\t");
    _builder.append("myDTODoc.^name");
    _builder.append("»", "\t\t\t");
    _builder.append(".");
    _builder.append("«", "\t\t\t");
    _builder.append("/h1");
    _builder.append("»", "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("\'\'\'", "\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
