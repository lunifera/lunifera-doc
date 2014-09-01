/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.generaldoc;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider;
import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImpl;
import org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper;

@RunWith(XtextRunner.class)
@InjectWith(LuniferaDocGrammarInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  @Extension
  private ParseHelper<LDocLayouter> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Test
  public void testParsing() {
    try {
      StringBuilder _loadTestModel = LuniferaDocTestHelper.loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/GeneralDocument.luniferadoc");
      final LDocLayouter testDoc = this._parseHelper.parse(_loadTestModel);
      String _name = testDoc.getName();
      Assert.assertEquals("doc.general.SampleGeneralDoc", _name);
      EList<LDocInclude> _includes = testDoc.getIncludes();
      int _size = _includes.size();
      Assert.assertEquals(1, _size);
      EList<LDocInclude> _includes_1 = testDoc.getIncludes();
      LDocInclude _get = _includes_1.get(0);
      LDocDocument _document = _get.getDocument();
      String _name_1 = _document.getName();
      Assert.assertEquals("doc.dto.MyDTO", _name_1);
      EList<LDocInclude> _includes_2 = testDoc.getIncludes();
      LDocInclude _get_1 = _includes_2.get(0);
      String _varName = _get_1.getVarName();
      Assert.assertEquals("myDTO", _varName);
      RichString _content = testDoc.getContent();
      Class<? extends RichString> _class = _content.getClass();
      Assert.assertEquals(RichStringImpl.class, _class);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
