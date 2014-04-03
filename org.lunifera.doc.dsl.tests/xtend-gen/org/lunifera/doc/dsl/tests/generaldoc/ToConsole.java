/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.generaldoc;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lunifera.doc.dsl.api.layout.IGenericLayout;
import org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper;

@RunWith(XtextRunner.class)
@InjectWith(void.class)
@SuppressWarnings("all")
public class ToConsole {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void compareGeneratedJava() {
    try {
      final StringBuilder testDoc = LuniferaDocTestHelper.loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/EntityDoc.luniferadoc");
      final IAcceptor<CompilationTestHelper.Result> _function = new IAcceptor<CompilationTestHelper.Result>() {
        public void accept(final CompilationTestHelper.Result it) {
          try {
            Class<? extends Object> _compiledClass = it.getCompiledClass();
            Object _newInstance = _compiledClass.newInstance();
            final IGenericLayout doc = ((IGenericLayout) _newInstance);
            String _serialize = doc.serialize();
            System.out.println(_serialize);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        }
      };
      this._compilationTestHelper.compile(testDoc, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
