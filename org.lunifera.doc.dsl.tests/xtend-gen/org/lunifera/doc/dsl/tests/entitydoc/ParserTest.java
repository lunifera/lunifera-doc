/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.entitydoc;

import com.google.inject.Inject;
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
  private /* ParseHelper<IEntityDocument> */Object _parseHelper;
  
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
      + "\nentityName cannot be resolved"
      + "\nentityURI cannot be resolved"
      + "\ntoString cannot be resolved"
      + "\nfields cannot be resolved"
      + "\nsize cannot be resolved"
      + "\naccessField cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public /* IEntityField */Object accessField(final /* IEntityDocument */Object doc, final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\nIEntityField cannot be resolved to a type."
      + "\nThe method name is undefined for the type ParserTest"
      + "\nThe method invoke is undefined for the type ParserTest"
      + "\nclass cannot be resolved"
      + "\nmethods cannot be resolved"
      + "\nequals cannot be resolved");
  }
}
