/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

/*
 * generated by Xtext
 */
package org.lunifera.doc.dsl.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.XExpression
import org.lunifera.doc.dsl.luniferadoc.RichString
import org.lunifera.doc.dsl.luniferadoc.RichStringForLoop

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class LuniferaDocGrammarValidator extends AbstractLuniferaDocGrammarValidator { //  public static val INVALID_NAME = 'invalidName'
	override boolean isValueExpectedRecursive(XExpression expr) {
		val EObject container = expr.eContainer();
		if (container instanceof RichString || container instanceof RichStringForLoop) {
			return true;
		}
		return super.isValueExpectedRecursive(expr);
	}
}
