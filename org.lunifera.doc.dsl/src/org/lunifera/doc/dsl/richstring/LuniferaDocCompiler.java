/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Work based on org.eclipse.xtend.core.compiler.XtendCompiler
 *******************************************************************************/
package org.lunifera.doc.dsl.richstring;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.trace.LocationData;
import org.eclipse.xtext.util.ITextRegionWithLineInformation;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.lunifera.doc.dsl.luniferadoc.DocLayout;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.RichString;
import org.lunifera.doc.dsl.luniferadoc.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.RichStringLiteral;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("deprecation")
@NonNullByDefault
public class LuniferaDocCompiler extends XbaseCompiler {

	@Inject
	private RichStringProcessor richStringProcessor;

	@Inject
	private Provider<DefaultIndentationHandler> indentationHandler;

	@Inject
	private ITypeProvider typeProvider;

	@Override
	protected String getFavoriteVariableName(EObject ex) {
		if (ex instanceof RichStringForLoop)
			return "hasAnyElements";
		return super.getFavoriteVariableName(ex);
	}

	@SuppressWarnings("restriction")
	public class RichStringPrepareCompiler extends
			AbstractRichStringPartAcceptor.ForLoopOnce {

		private final LinkedList<ITreeAppendable> appendableStack;
		private final LinkedList<RichStringIf> ifStack;
		private final LinkedList<RichStringForLoop> forStack;
		private final String variableName;
		private ITreeAppendable appendable;
		private ITreeAppendable currentAppendable;

		public RichStringPrepareCompiler(ITreeAppendable appendable,
				String variableName, RichString richString) {
			this.ifStack = Lists.newLinkedList();
			this.forStack = Lists.newLinkedList();
			this.appendableStack = Lists.newLinkedList();
			this.appendable = appendable;
			this.variableName = variableName;
			List<XExpression> expressions = richString.getExpressions();
			if (!expressions.isEmpty()
					&& expressions.get(0) instanceof RichStringLiteral)
				setCurrentAppendable((RichStringLiteral) expressions.get(0));
		}

		@Override
		public void acceptSemanticLineBreak(int charCount,
				RichStringLiteral origin, boolean controlStructureSeen) {
			setCurrentAppendable(origin);
			currentAppendable.newLine();
			currentAppendable.append(variableName);
			if (!controlStructureSeen) {
				currentAppendable.append(".newLine();");
			} else {
				currentAppendable.append(".newLineIfNotEmpty();");
			}
		}

		protected void setCurrentAppendable(@Nullable RichStringLiteral origin) {
			if (currentAppendable == null && origin != null) {
				ITextRegionWithLineInformation region = (ITextRegionWithLineInformation) getLocationInFileProvider()
						.getSignificantTextRegion(origin,
								XbasePackage.Literals.XSTRING_LITERAL__VALUE, 0);
				currentAppendable = appendable.trace(new LocationData(region,
						null), true);
			}
		}

		@Override
		public void acceptTemplateLineBreak(int charCount,
				RichStringLiteral origin) {
			setCurrentAppendable(origin);
		}

		@Override
		public void acceptSemanticText(CharSequence text,
				@Nullable RichStringLiteral origin) {
			setCurrentAppendable(origin);
			if (text.length() == 0)
				return;
			currentAppendable.newLine();
			currentAppendable.append(variableName);
			currentAppendable.append(".append(\"");
			currentAppendable.append(Strings.convertToJavaString(text
					.toString()));
			currentAppendable.append("\");");
		}

		@Override
		public void acceptIfCondition(XExpression condition) {
			currentAppendable = null;
			ifStack.add((RichStringIf) condition.eContainer());
			appendable.newLine();
			pushAppendable(condition.eContainer());
			appendable.append("{").increaseIndentation();
			writeIf(condition);
		}

		protected void pushAppendable(EObject traceInfo) {
			appendableStack.add(appendable);
			appendable = appendable.trace(traceInfo);
		}

		protected void popAppendable() {
			appendable = appendableStack.removeLast();
		}

		@Override
		public void acceptElseIfCondition(XExpression condition) {
			currentAppendable = null;
			writeElse();
			writeIf(condition);
		}

		@Override
		public void acceptDocumentStart(LuniferaDocDocument object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<html>");
			appendable.newLine();
			appendable.increaseIndentation();
			append("<body>");
		}

		@Override
		public void acceptDocumentEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</body>");
			appendable.decreaseIndentation();
			append("</html>");
			popAppendable();
		}

		@Override
		public void acceptH1Start(RichStringH1 object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<h1>");
		}

		@Override
		public void acceptH1End() {
			currentAppendable = null;
			appendable.newLine();
			append("</h1>");
			popAppendable();
		}

		@Override
		public void acceptH2Start(RichStringH2 object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<h2>");
		}

		@Override
		public void acceptH2End() {
			currentAppendable = null;
			appendable.newLine();
			append("</h2>");
			popAppendable();
		}

		@Override
		public void acceptExampleStart(RichStringExample object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<div class=\"lun_example\">");
		}

		@Override
		public void acceptExampleEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</div>");
			popAppendable();
		}

		protected void writeIf(XExpression condition) {
			ITreeAppendable debugAppendable = appendable.trace(
					condition.eContainer(), true);
			internalToJavaStatement(condition, debugAppendable, true);
			debugAppendable.newLine();
			debugAppendable.append("if (");
			internalToJavaExpression(condition, debugAppendable);
			debugAppendable.append(") {").increaseIndentation();
		}

		protected void writeElse() {
			currentAppendable = null;
			appendable.decreaseIndentation();
			appendable.newLine();
			appendable.append("} else {");
			appendable.increaseIndentation();
		}

		public void append(CharSequence text) {
			if (text.length() == 0)
				return;

			appendable.append(variableName);
			appendable.append(".append(\"");
			appendable.append(Strings.convertToJavaString(text.toString()));
			appendable.append("\");");
		}

		@Override
		public void acceptElse() {
			currentAppendable = null;
			writeElse();
		}

		@Override
		public void acceptEndIf() {
			currentAppendable = null;
			RichStringIf richStringIf = ifStack.removeLast();
			for (int i = 0; i < richStringIf.getElseIfs().size() + 2; i++) {
				appendable.decreaseIndentation();
				appendable.newLine();
				appendable.append("}");
			}
			popAppendable();
		}

		@Override
		public void acceptForLoop(JvmFormalParameter parameter,
				@Nullable XExpression expression) {
			currentAppendable = null;
			super.acceptForLoop(parameter, expression);
			if (expression == null)
				throw new IllegalArgumentException("expression may not be null");
			RichStringForLoop forLoop = (RichStringForLoop) expression
					.eContainer();
			forStack.add(forLoop);
			appendable.newLine();
			pushAppendable(forLoop);
			appendable.append("{").increaseIndentation();

			ITreeAppendable debugAppendable = appendable.trace(forLoop, true);
			internalToJavaStatement(expression, debugAppendable, true);
			String variableName = null;
			if (forLoop.getBefore() != null || forLoop.getSeparator() != null
					|| forLoop.getAfter() != null) {
				variableName = debugAppendable.declareSyntheticVariable(
						forLoop, "_hasElements");
				debugAppendable.newLine();
				debugAppendable.append("boolean ");
				debugAppendable.append(variableName);
				debugAppendable.append(" = false;");
			}
			debugAppendable.newLine();
			debugAppendable.append("for(final ");
			LightweightTypeReference paramType = getTypeResolver()
					.resolveTypes(parameter).getActualType(parameter);
			debugAppendable.append(paramType);
			debugAppendable.append(" ");
			String loopParam = debugAppendable.declareVariable(parameter,
					parameter.getName());
			debugAppendable.append(loopParam);
			debugAppendable.append(" : ");
			internalToJavaExpression(expression, debugAppendable);
			debugAppendable.append(") {").increaseIndentation();
		}

		@Override
		public boolean forLoopHasNext(@Nullable XExpression before,
				@Nullable XExpression separator, CharSequence indentation) {
			currentAppendable = null;
			if (!super.forLoopHasNext(before, separator, indentation))
				return false;
			RichStringForLoop forLoop = forStack.getLast();
			if (appendable.hasName(forLoop)) {
				String varName = getVarName(forLoop, appendable);
				appendable.newLine();
				appendable.append("if (!");
				appendable.append(varName);
				appendable.append(") {");
				appendable.increaseIndentation();
				appendable.newLine();
				appendable.append(varName);
				appendable.append(" = true;");
				if (before != null) {
					writeExpression(before, indentation, false);
				}
				appendable.decreaseIndentation();
				appendable.newLine();
				appendable.append("}");
				if (separator != null) {
					appendable.append(" else {");
					appendable.increaseIndentation();
					writeExpression(separator, indentation, true);
					appendable.decreaseIndentation();
					appendable.newLine();
					appendable.append("}");
				}
			}
			return true;
		}

		@Override
		public void acceptEndFor(@Nullable XExpression after,
				CharSequence indentation) {
			currentAppendable = null;
			super.acceptEndFor(after, indentation);
			appendable.decreaseIndentation();
			appendable.newLine();
			appendable.append("}");

			RichStringForLoop forLoop = forStack.removeLast();
			if (after != null) {
				String varName = getVarName(forLoop, appendable);
				appendable.newLine();
				appendable.append("if (");
				appendable.append(varName);
				appendable.append(") {");
				appendable.increaseIndentation();
				writeExpression(after, indentation, false);
				appendable.decreaseIndentation();
				appendable.newLine();
				appendable.append("}");
			}

			appendable.decreaseIndentation();
			appendable.newLine();
			appendable.append("}");
			popAppendable();
		}

		@Override
		public void acceptExpression(XExpression expression,
				CharSequence indentation) {
			currentAppendable = null;
			writeExpression(expression, indentation, false);
		}

		protected void writeExpression(XExpression expression,
				CharSequence indentation, boolean immediate) {
			boolean referenced = !isPrimitiveVoid(expression);
			internalToJavaStatement(expression, appendable, referenced);
			if (referenced) {
				ITreeAppendable tracingAppendable = appendable.trace(
						expression, true);
				tracingAppendable.newLine();
				tracingAppendable.append(variableName);
				if (immediate)
					tracingAppendable.append(".appendImmediate(");
				else
					tracingAppendable.append(".append(");
				internalToJavaExpression(expression, tracingAppendable);
				tracingAppendable.append(", \"");
				tracingAppendable.append(indentation.toString());
				tracingAppendable.append("\");");
			}
		}

	}

	@Override
	protected XExpression normalizeBlockExpression(XExpression expr) {
		if (expr instanceof RichString)
			return expr;
		return super.normalizeBlockExpression(expr);
	}

	@Override
	public void doInternalToJavaStatement(XExpression obj,
			ITreeAppendable appendable, boolean isReferenced) {
		if (obj instanceof RichString)
			_toJavaStatement((RichString) obj, appendable, isReferenced);
		else
			super.doInternalToJavaStatement(obj, appendable, isReferenced);
	}

	public void _toJavaStatement(RichString richString, ITreeAppendable b,
			boolean isReferenced) {
		b = b.trace(richString);
		// declare variable
		JvmTypeReference type = getTypeReferences().getTypeForName(
				StringConcatenation.class, richString);
		String variableName = b
				.declareSyntheticVariable(richString, "_builder");
		b.newLine();
		serialize(type, richString, b);
		b.append(" ");
		b.append(variableName);
		b.append(" = new ");
		serialize(type, richString, b);
		b.append("();");
		RichStringPrepareCompiler compiler = new RichStringPrepareCompiler(b,
				variableName, richString);
		richStringProcessor.process(richString, compiler,
				indentationHandler.get());
	}

	@Override
	public void internalToConvertedExpression(XExpression obj,
			ITreeAppendable appendable) {
		if (obj instanceof RichString)
			_toJavaExpression((RichString) obj, appendable);
		else
			super.internalToConvertedExpression(obj, appendable);
	}

	public void _toJavaExpression(RichString richString, ITreeAppendable b) {
		b.append(getVarName(richString, b));
		if (getTypeReferences().is(typeProvider.getType(richString),
				String.class))
			b.append(".toString()");
	}

}
