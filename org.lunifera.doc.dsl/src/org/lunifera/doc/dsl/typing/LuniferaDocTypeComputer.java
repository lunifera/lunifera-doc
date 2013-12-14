/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.typing;

import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.typesystem.XbaseWithAnnotationsTypeComputer;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState;
import org.eclipse.xtext.xbase.typesystem.computation.ITypeExpectation;
import org.eclipse.xtext.xbase.typesystem.conformance.ConformanceHint;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;

/**
 * Customized type computer for Xtend specific expressions.
 * 
 * The template expression and its dedicated child expressions are handled.
 * 
 * TODO: RichStringIf with instanceof cascades should downcast the checked values iff immutable.
 */
@NonNullByDefault
@SuppressWarnings("restriction")
public class LuniferaDocTypeComputer extends XbaseWithAnnotationsTypeComputer {

	@Override
	public void computeTypes(XExpression expression, ITypeComputationState state) {
		if (expression instanceof RichStringMarkup) {
			_computeTypes((RichStringMarkup) expression, state);
		} else if (expression instanceof RichStringURL) {
			_computeTypes((RichStringURL) expression, state);
		} else if (expression instanceof RichStringMailto) {
			_computeTypes((RichStringMailto) expression, state);
		} else if (expression instanceof RichStringSkype) {
			_computeTypes((RichStringSkype) expression, state);
		} else if (expression instanceof RichStringMovie) {
			_computeTypes((RichStringMovie) expression, state);
		} else if (expression instanceof RichStringCode) {
			_computeTypes((RichStringCode) expression, state);
		} else if (expression instanceof RichStringTable) {
			_computeTypes((RichStringTable) expression, state);
		} else if (expression instanceof RichStringTableRow) {
			_computeTypes((RichStringTableRow) expression, state);
		} else if (expression instanceof RichStringTableData) {
			_computeTypes((RichStringTableData) expression, state);
		} else if (expression instanceof RichStringImg) {
			_computeTypes((RichStringImg) expression, state);
		} else if (expression instanceof RichString) {
			_computeTypes((RichString) expression, state);
		} else if (expression instanceof RichStringForLoop) {
			_computeTypes((RichStringForLoop) expression, state);
		} else if (expression instanceof RichStringIf) {
			_computeTypes((RichStringIf) expression, state);
		} else if (expression instanceof RichStringLiteral) {
			_computeTypes((RichStringLiteral) expression, state);
		} else {
			super.computeTypes(expression, state);
		}
	}

	protected void _computeTypes(RichString object, ITypeComputationState state) {
		List<XExpression> expressions = object.getExpressions();
		if (!expressions.isEmpty()) {
			for (XExpression expression : expressions) {
				ITypeComputationState expressionState = state.withoutExpectation();
				expressionState.computeTypes(expression);
				if (expression instanceof XVariableDeclaration) {
					addLocalToCurrentScope((XVariableDeclaration) expression, state);
				}
			}
		}
		for (ITypeExpectation expectation : state.getExpectations()) {
			LightweightTypeReference expectedType = expectation.getExpectedType();
			if (expectedType != null && expectedType.isType(StringConcatenation.class)) {
				expectation.acceptActualType(expectedType, ConformanceHint.SUCCESS,
						ConformanceHint.CHECKED, ConformanceHint.DEMAND_CONVERSION);
			} else if (expectedType != null && expectedType.isType(String.class)) {
				expectation.acceptActualType(expectedType, ConformanceHint.SUCCESS,
						ConformanceHint.CHECKED, ConformanceHint.DEMAND_CONVERSION);
				// TODO this special treatment here should become obsolete as
				// soon as the expectations are properly propagated
			} else if (!(object.eContainer() instanceof XCastedExpression)
					&& object.eContainingFeature() != XbasePackage.Literals.XMEMBER_FEATURE_CALL__MEMBER_CALL_TARGET
					&& (expectedType != null && !expectedType.isResolved() || expectedType == null
							&& !expectation.isVoidTypeAllowed())) {
				LightweightTypeReference type = getTypeForName(String.class, state);
				expectation.acceptActualType(type, ConformanceHint.UNCHECKED,
						ConformanceHint.DEMAND_CONVERSION);
			} else {
				LightweightTypeReference type = getTypeForName(CharSequence.class, state);
				expectation.acceptActualType(type, ConformanceHint.UNCHECKED);
			}
		}
	}

	protected void _computeTypes(RichStringForLoop object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);
		ITypeComputationState eachState = state.withExpectation(charSequence);
		JvmFormalParameter parameter = object.getDeclaredParam();
		if (parameter != null) {
			LightweightTypeReference parameterType = computeForLoopParameterType(object, state);
			eachState = eachState.assignType(parameter, parameterType);
		}
		eachState.computeTypes(object.getEachExpression());

		state.withNonVoidExpectation().computeTypes(object.getBefore());
		state.withNonVoidExpectation().computeTypes(object.getSeparator());
		state.withNonVoidExpectation().computeTypes(object.getAfter());

		LightweightTypeReference primitiveVoid = getPrimitiveVoid(state);
		state.acceptActualType(primitiveVoid);

		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringIf object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);
		LightweightTypeReference booleanType = getTypeForName(Boolean.TYPE, state);

		ITypeComputationState conditionExpectation = state.withExpectation(booleanType);
		conditionExpectation.computeTypes(object.getIf());
		// TODO instanceof may specialize the types in the nested expression
		state.withExpectation(charSequence).computeTypes(object.getThen());
		for (RichStringElseIf elseIf : object.getElseIfs()) {
			state.withExpectation(booleanType).computeTypes(elseIf.getIf());
			state.withExpectation(charSequence).computeTypes(elseIf.getThen());
		}
		state.withExpectation(charSequence).computeTypes(object.getElse());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringLiteral object, ITypeComputationState state) {
		LightweightTypeReference type = getTypeForName(CharSequence.class, state);
		state.acceptActualType(type);
	}

	protected void _computeTypes(RichStringMarkup object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.withExpectation(charSequence).computeTypes(object.getExpression());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringURL object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.withExpectation(charSequence).computeTypes(object.getText());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringMailto object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.withExpectation(charSequence).computeTypes(object.getContent());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringSkype object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.withExpectation(charSequence).computeTypes(object.getContent());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringMovie object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.withExpectation(charSequence).computeTypes(object.getContent());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringCode object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.withExpectation(charSequence).computeTypes(object.getContent());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringTable object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		for (RichStringTableRow row : object.getRows()) {
			state.withExpectation(charSequence).computeTypes(row);
		}
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringTableRow object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		for (RichStringTableData td : object.getColumns()) {
			state.withExpectation(charSequence).computeTypes(td);
		}
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringTableData object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.withExpectation(charSequence).computeTypes(object.getExpression());
		state.acceptActualType(charSequence);
	}

	protected void _computeTypes(RichStringImg object, ITypeComputationState state) {
		LightweightTypeReference charSequence = getTypeForName(CharSequence.class, state);

		state.acceptActualType(charSequence);
	}
}
