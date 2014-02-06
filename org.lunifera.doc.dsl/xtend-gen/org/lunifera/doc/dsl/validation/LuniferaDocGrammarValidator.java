/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.validation.AbstractLuniferaDocGrammarValidator;

@SuppressWarnings("all")
public class LuniferaDocGrammarValidator extends AbstractLuniferaDocGrammarValidator {
  public boolean isValueExpectedRecursive(final XExpression expr) {
    final EObject container = expr.eContainer();
    boolean _or = false;
    if ((container instanceof RichString)) {
      _or = true;
    } else {
      _or = (container instanceof RichStringForLoop);
    }
    if (_or) {
      return true;
    }
    return super.isValueExpectedRecursive(expr);
  }
}
