/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.typing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.Primitives;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.annotations.typing.XbaseWithAnnotationsTypeProvider;
import org.eclipse.xtext.xbase.controlflow.IEarlyExitComputer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Type provider that is aware of Xtend specific expressions and the inferred JVM model.
 */
@Singleton
public class LuniferaDocTypeProvider extends XbaseWithAnnotationsTypeProvider {

	@Inject
	private IJvmModelAssociations xtendjvmAssociations;

	@Inject
	private IEarlyExitComputer earlyExitComputer;

	@Inject
	private Primitives primitives;

	@Override
	protected JvmTypeReference type(XExpression expression, JvmTypeReference rawExpectation,
			boolean rawType) {
		if (expression instanceof RichString) {
			return _type((RichString) expression, rawExpectation, rawType);
		} else if (expression instanceof RichStringForLoop) {
			return _type((RichStringForLoop) expression, rawExpectation, rawType);
		} else if (expression instanceof RichStringIf) {
			return _type((RichStringIf) expression, rawExpectation, rawType);
		} else if (expression instanceof RichStringLiteral) {
			return _type((RichStringLiteral) expression, rawExpectation, rawType);
		} else {
			return super.type(expression, rawExpectation, rawType);
		}
	}

	@Override
	protected JvmTypeReference expectedType(EObject container, EReference reference, int index,
			boolean rawType) {
		if (container instanceof RichStringElseIf) {
			return _expectedType((RichStringElseIf) container, reference, index, rawType);
		} else if (container instanceof RichStringForLoop) {
			return _expectedType((RichStringForLoop) container, reference, index, rawType);
		} else if (container instanceof RichStringIf) {
			return _expectedType((RichStringIf) container, reference, index, rawType);
		} else {
			return super.expectedType(container, reference, index, rawType);
		}
	}

	protected JvmTypeReference _type(RichString richString, JvmTypeReference rawExpectation,
			boolean rawType) {
		JvmTypeReference stringType = getTypeReferences().getTypeForName(String.class, richString);
		if (getTypeReferences().is(getExpectedType(richString, rawType), String.class))
			return stringType;
		return getTypeReferences().getTypeForName(CharSequence.class, richString);
	}

	protected JvmTypeReference _type(RichStringLiteral stringLiteral,
			JvmTypeReference rawExpectation, boolean rawType) {
		return getTypeReferences().getTypeForName(CharSequence.class, stringLiteral);
	}

	protected JvmTypeReference _type(RichStringIf richStringIf, JvmTypeReference rawExpectation,
			boolean rawType) {
		return getTypeReferences().getTypeForName(CharSequence.class, richStringIf);
	}

	protected JvmTypeReference _type(RichStringForLoop richStringFor,
			JvmTypeReference rawExpectation, boolean rawType) {
		return getTypeReferences().getTypeForName(CharSequence.class, richStringFor);
	}

	protected JvmTypeReference _expectedType(RichStringIf container, EReference reference,
			int index, boolean rawType) {
		if (reference == RichstringPackage.Literals.RICH_STRING_IF__IF) {
			return getTypeReferences().getTypeForName(Boolean.TYPE, container);
		}
		return getTypeReferences().getTypeForName(CharSequence.class, container);
	}

	protected JvmTypeReference _expectedType(RichStringElseIf container, EReference reference,
			int index, boolean rawType) {
		if (reference == RichstringPackage.Literals.RICH_STRING_ELSE_IF__IF) {
			return getTypeReferences().getTypeForName(Boolean.TYPE, container);
		}
		return getTypeReferences().getTypeForName(CharSequence.class, container);
	}

	protected JvmTypeReference _expectedType(RichStringForLoop expr, EReference reference,
			int index, boolean rawType) {
		if (reference == RichstringPackage.Literals.RICH_STRING_FOR_LOOP__BEFORE
				|| reference == RichstringPackage.Literals.RICH_STRING_FOR_LOOP__SEPARATOR
				|| reference == RichstringPackage.Literals.RICH_STRING_FOR_LOOP__AFTER)
			return getTypeReferences().getTypeForName(Object.class, expr);
		return _expectedType((XForLoopExpression) expr, reference, index, rawType);
	}

}
