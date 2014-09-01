/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.entitydoc;

import com.google.inject.Inject;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.List;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider;
import org.lunifera.doc.dsl.api.document.IEntityDocument;
import org.lunifera.doc.dsl.api.document.IEntityField;
import org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper;

@RunWith(XtextRunner.class)
@InjectWith(LuniferaDocGrammarInjectorProvider.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  @Extension
  private ParseHelper<IEntityDocument> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Test
  public void testParsing() {
    try {
      StringBuilder _loadTestModel = LuniferaDocTestHelper.loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/EntityDocument.luniferadoc");
      final IEntityDocument entityDoc = this._parseHelper.parse(_loadTestModel);
      String _name = entityDoc.getName();
      Assert.assertEquals("doc.entity.MyEntityDoc", _name);
      String _entityName = entityDoc.getEntityName();
      Assert.assertEquals("org.lunifera.sample.MyEntity", _entityName);
      URI _entityURI = entityDoc.getEntityURI();
      String _string = _entityURI.toString();
      Assert.assertEquals("lunentity://org.lunifera.sample.MyEntity", _string);
      List<IEntityField> _fields = entityDoc.getFields();
      int _size = _fields.size();
      Assert.assertEquals(
        2, _size);
      IEntityField _accessField = this.accessField(entityDoc, "name");
      String _name_1 = _accessField.getName();
      Assert.assertEquals("name", _name_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public IEntityField accessField(final IEntityDocument doc, final String name) {
    try {
      Class<? extends IEntityDocument> _class = doc.getClass();
      Method[] _methods = _class.getMethods();
      for (final Method method : _methods) {
        String _name = method.getName();
        String _firstUpper = StringExtensions.toFirstUpper(name);
        String _plus = ("getForField" + _firstUpper);
        boolean _equals = _name.equals(_plus);
        if (_equals) {
          Object _invoke = method.invoke(doc, null);
          return ((IEntityField) _invoke);
        }
      }
      Assert.fail((name + " not valid"));
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
