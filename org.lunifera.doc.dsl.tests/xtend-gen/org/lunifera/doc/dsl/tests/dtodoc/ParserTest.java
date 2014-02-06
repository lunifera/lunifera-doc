/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.dtodoc;

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
  private /* ParseHelper<DTODocument> */Object _parseHelper;
  
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
      + "\ndtoClass cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nget cannot be resolved"
      + "\nname cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nget cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nclass cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nget cannot be resolved"
      + "\nname cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nget cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nproperties cannot be resolved"
      + "\nget cannot be resolved"
      + "\ndescription cannot be resolved"
      + "\nexpressions cannot be resolved"
      + "\nget cannot be resolved");
  }
}
