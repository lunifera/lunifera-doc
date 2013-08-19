/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Work based org.eclipse.xtend.core.typing.XtendExpressionHelper
 *******************************************************************************/
package org.lunifera.doc.dsl.typing;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.util.XExpressionHelper;
import org.lunifera.doc.dsl.luniferadoc.RichString;

public class LuniferaDocExpressionHelper extends XExpressionHelper {
	
	@Override
	public boolean hasSideEffects(XExpression expr) {
		if (expr instanceof RichString) {
			return false;
		}
		return super.hasSideEffects(expr);
	}
}
