/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

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
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH3;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH4;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH5;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH6;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringListElement;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOrderedList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSpan;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableCell;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

@NonNullByDefault
@SuppressWarnings("restriction")
public class LuniferaDocCompiler extends XbaseCompiler {

	@Inject
	private RichStringProcessor richStringProcessor;

	@Inject
	private Provider<DefaultIndentationHandler> indentationHandler;

	@Inject
	private IBatchTypeResolver batchTypeResolver;

	@Override
	protected String getFavoriteVariableName(EObject ex) {
		if (ex instanceof RichStringForLoop)
			return "hasAnyElements";
		return super.getFavoriteVariableName(ex);
	}

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
		public void acceptDocumentStart(LDocNamedDocument object) {
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
		public void acceptH3Start(RichStringH3 object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<h3>");
		}

		@Override
		public void acceptH3End() {
			currentAppendable = null;
			appendable.newLine();
			append("</h3>");
			popAppendable();
		}

		@Override
		public void acceptH4Start(RichStringH4 object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<h4>");
		}

		@Override
		public void acceptH4End() {
			currentAppendable = null;
			appendable.newLine();
			append("</h4>");
			popAppendable();
		}

		@Override
		public void acceptH5Start(RichStringH5 object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<h5>");
		}

		@Override
		public void acceptH5End() {
			currentAppendable = null;
			appendable.newLine();
			append("</h5>");
			popAppendable();
		}

		@Override
		public void acceptH6Start(RichStringH6 object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<h6>");
		}

		@Override
		public void acceptH6End() {
			currentAppendable = null;
			appendable.newLine();
			append("</h6>");
			popAppendable();
		}

		@Override
		public void acceptChapterStart(RichStringChapter object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a id=\">");
			append(object.getName());
			append("\" class=\"lundoc-chapter\">");
		}

		@Override
		public void acceptChapterEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptSectionStart(RichStringSection object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a id=\">");
			append(object.getName());
			append("\" class=\"lundoc-section\">");
		}

		@Override
		public void acceptSectionEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptSubsectionStart(RichStringSubsection object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a id=\">");
			append(object.getName());
			append("\" class=\"lundoc-subsection\">");
		}

		@Override
		public void acceptSubsectionEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptURLStart(RichStringURL object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"");
			append(object.getLocation());
			append("\">");
		}

		@Override
		public void acceptURLEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptRefStart(RichStringRef object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"#");
			append(object.getRefId());
			append("\">");
		}

		@Override
		public void acceptRefEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptMailtoStart(RichStringMailto object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"mailto:");
			append(object.getEmail());
			append("\">");
		}

		@Override
		public void acceptMailtoEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptSkypeStart(RichStringSkype object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"skype:");
			append(object.getTarget());
			append("?call\">");
		}

		@Override
		public void acceptSkypeEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptMovieStart(RichStringMovie object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<video width=\"");
			append(object.getWidth());
			append("\" height=\"");
			append(object.getHeight());
			append("\" controls>");
			append("<source src=\"");
			append(object.getSrc());
			append("\" type=\"");
			append(object.getType());
			append("\" />");
		}

		@Override
		public void acceptMovieEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</video>");
			popAppendable();
		}

		@Override
		public void acceptCodeStart(RichStringCode object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<div class=\"lundoc-sourcecode\">");
		}

		@Override
		public void acceptCodeEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</div>");
			popAppendable();
		}

		@Override
		public void acceptTableStart(RichStringTable object) {
			currentAppendable = null;
			appendable.newLine();
			append("<table>");
		}

		@Override
		public void acceptTableEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</table>");
		}

		@Override
		public void acceptTableRowStart(RichStringTableRow object) {
			currentAppendable = null;
			appendable.newLine();
			append("<tr>");
		}

		@Override
		public void acceptTableRowEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</tr>");
		}

		@Override
		public void acceptTableCellStart(RichStringTableCell object) {
			currentAppendable = null;
			appendable.newLine();
			append("<td>");
		}

		@Override
		public void acceptTableCellEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</td>");
		}

		@Override
		public void acceptListStart(RichStringList object) {
			currentAppendable = null;
			appendable.newLine();
			append("<ul>");
		}

		@Override
		public void acceptListEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</ul>");
		}

		@Override
		public void acceptOrderedListStart(RichStringOrderedList object) {
			currentAppendable = null;
			appendable.newLine();
			append("<ol>");
		}

		@Override
		public void acceptOrderedListEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</ol>");
		}

		@Override
		public void acceptListElementStart(RichStringListElement object) {
			currentAppendable = null;
			appendable.newLine();
			append("<li>");
		}

		@Override
		public void acceptListElementEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</li>");
		}

		@Override
		public void acceptImgStart(RichStringImg object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<img src=\"");
			append(object.getSrc());
			append("\" alt=\"");
			append(object.getAlt());
			append("\" width=\"");
			append(object.getWidth());
			append("\" height=\"");
			append(object.getHeight());
			append("\" />");
		}

		@Override
		public void acceptBoldStart(RichStringBold object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<b>");
		}

		@Override
		public void acceptBoldEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</b>");
			popAppendable();
		}

		@Override
		public void acceptUnderlineStart(RichStringUnderline object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<span style=\"text-decoration: underline;\">");
		}

		@Override
		public void acceptUnderlineEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</span>");
			popAppendable();
		}

		@Override
		public void acceptItalicStart(RichStringItalic object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<i>");
		}

		@Override
		public void acceptItalicEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</i>");
			popAppendable();
		}

		@Override
		public void acceptSpanStart(RichStringSpan object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<span style=\"" + object.getStyleClass() + "\">");
		}

		@Override
		public void acceptSpanEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</span>");
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

		@Override
		public void acceptOpenViewStart(RichStringOpenView object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"link/to/");
			append(object.getViewId());
			append("\">");
		}

		@Override
		public void acceptOpenViewEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptStartProcessStart(RichStringStartProcess object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"link/to/");
			append(object.getProcessId());
			append("\">");
		}

		@Override
		public void acceptStartProcessEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptEntityRefStart(RichStringEntityRef object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"ref/to/");
			append(object.getEntityDoc().getName());
			append("\">");
		}

		@Override
		public void acceptEntityRefEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptDTORefStart(RichStringDTORef object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"ref/to/");
			append(object.getDtoDoc().getName());
			append("\">");
		}

		@Override
		public void acceptDTORefEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptProcessRefStart(RichStringProcessRef object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"ref/to/");
			append(object.getBpmDoc().getName());
			append("\">");
		}

		@Override
		public void acceptProcessRefEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptTaskRefStart(RichStringTaskRef object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"ref/to/");
			append(object.getTaskDoc().getName());
			append("\">");
		}

		@Override
		public void acceptTaskRefEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptViewRefStart(RichStringViewRef object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"ref/to/");
			append(object.getViewDoc().getName());
			append("\">");
		}

		@Override
		public void acceptViewRefEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
			popAppendable();
		}

		@Override
		public void acceptUIRefStart(RichStringUIRef object) {
			currentAppendable = null;
			pushAppendable(object);
			appendable.newLine();
			append("<a href=\"ref/to/");
			append(object.getUiDoc().getName());
			append("\">");
		}

		@Override
		public void acceptUIRefEnd() {
			currentAppendable = null;
			appendable.newLine();
			append("</a>");
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
		LightweightTypeReference literalType = batchTypeResolver.resolveTypes(
				richString).getActualType(richString);
		if (literalType != null && literalType.isType(String.class))
			b.append(".toString()");
	}

}
