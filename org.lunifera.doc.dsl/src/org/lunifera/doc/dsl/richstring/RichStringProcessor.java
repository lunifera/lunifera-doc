/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.richstring;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.*;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.util.LDocCompilerSwitch;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBox;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumn;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumnLayout;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringContainer;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringFooter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH3;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH4;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH5;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH6;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringHeader;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndex;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndexElement;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringListElement;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;
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
import org.lunifera.doc.dsl.luniferadoc.richstring.util.LDocRichstringSwitch;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class RichStringProcessor {

	public void process(RichString richString,
			IRichStringPartAcceptor acceptor,
			IRichStringIndentationHandler indentationHandler) {
		ProcessedRichString rootRichString = new ProcessedRichStringBuilder()
				.processRichString(richString);
		Implementation implementation = new Implementation(acceptor,
				indentationHandler);
		implementation.doSwitch(rootRichString);
	}

	public static class ProcessedRichStringBuilder extends
			LDocRichstringSwitch<Boolean> {

		@Inject
		private LDocCompilerFactory factory = LDocCompilerFactory.eINSTANCE;

		private ProcessedRichString rootRichString = null;

		private Line currentLine = null;

		public ProcessedRichString processRichString(RichString richString) {
			if (rootRichString != null || currentLine != null)
				throw new IllegalStateException("result is already set");
			doSwitch(richString);
			return rootRichString;
		}

		@Override
		public Boolean doSwitch(EObject theEObject) {
			if (theEObject == null)
				return Boolean.TRUE;
			return super.doSwitch(theEObject);
		}

		protected void addToCurrentLine(LinePart part) {
			if (currentLine == null) {
				currentLine = factory.createLine();
				if (!(part instanceof Literal)
						&& !rootRichString.getLines().isEmpty()) {
					Line prevLine = rootRichString.getLines().get(
							rootRichString.getLines().size() - 1);
					LineBreak lineBreak = (LineBreak) prevLine.getParts().get(
							prevLine.getParts().size() - 1);
					Literal literal = factory.createLiteral();
					literal.setLength(0);
					literal.setOffset(lineBreak.getLiteral().getValue()
							.length());
					literal.setLiteral(lineBreak.getLiteral());
					currentLine.getParts().add(literal);
				}
				rootRichString.getLines().add(currentLine);
			}
			if (part != null)
				currentLine.getParts().add(part);
		}

		@Override
		public Boolean caseRichString(RichString object) {

			boolean root = object.eContainer() instanceof LDocLayouter;

			DocumentStart start = null;
			if (rootRichString == null) {
				rootRichString = factory.createProcessedRichString();
				rootRichString.setRichString(object);

				if (root) {
					start = factory.createDocumentStart();
					start.setContent(rootRichString);
					start.setDocument((LDocNamedDocument) object.eContainer());
					addToCurrentLine(start);
				}
			}
			List<XExpression> elements = object.getExpressions();
			for (XExpression element : elements) {
				doSwitch(element);
			}
			if (currentLine == null && !rootRichString.getLines().isEmpty()) {
				// add next line with empty text since the previous ends with a
				// line break
				addToCurrentLine(null);
			}

			if (root) {
				DocumentEnd end = factory.createDocumentEnd();
				end.setStart(start);
				addToCurrentLine(end);
			}

			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringMarkup(RichStringMarkup object) {
			Markup markup = factory.createMarkup();
			markup.setMarkup(object);
			addToCurrentLine(markup);
			doSwitch(object.getExpression());
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringForLoop(RichStringForLoop object) {
			ForLoopStart start = factory.createForLoopStart();
			start.setLoop(object);
			addToCurrentLine(start);
			doSwitch(object.getEachExpression());
			ForLoopEnd end = factory.createForLoopEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringIf(RichStringIf object) {
			IfConditionStart start = factory.createIfConditionStart();
			start.setRichStringIf(object);
			addToCurrentLine(start);
			doSwitch(object.getThen());
			for (RichStringElseIf elseIf : object.getElseIfs()) {
				ElseIfCondition elseIfStart = factory.createElseIfCondition();
				elseIfStart.setIfConditionStart(start);
				elseIfStart.setRichStringElseIf(elseIf);
				addToCurrentLine(elseIfStart);
				doSwitch(elseIf.getThen());
			}
			if (object.getElse() != null) {
				ElseStart elseStart = factory.createElseStart();
				elseStart.setIfConditionStart(start);
				addToCurrentLine(elseStart);
				doSwitch(object.getElse());
			}
			EndIf end = factory.createEndIf();
			end.setIfConditionStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean defaultCase(EObject object) {
			if (object instanceof XExpression) {
				PrintedExpression printedExpression = factory
						.createPrintedExpression();
				printedExpression.setExpression((XExpression) object);
				addToCurrentLine(printedExpression);
			}
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringLiteral(RichStringLiteral object) {
			String value = object.getValue();
			List<TextLine> lines = TextLines.splitString(value);
			if (lines.isEmpty()) {
				Literal literal = factory.createLiteral();
				literal.setLength(0);
				literal.setOffset(0);
				literal.setLiteral(object);
				addToCurrentLine(literal);
			} else {
				for (TextLine textLine : lines) {
					Literal literal = factory.createLiteral();
					literal.setLength(textLine.length());
					literal.setOffset(textLine.getRelativeOffset());
					literal.setLiteral(object);
					addToCurrentLine(literal);
					if (textLine.hasTrailingLineBreak()) {
						LineBreak lineBreak = factory.createLineBreak();
						lineBreak.setLength(textLine.getDelimiterLength());
						lineBreak.setOffset(textLine.getRelativeOffset()
								+ textLine.length());
						lineBreak.setLiteral(object);
						addToCurrentLine(lineBreak);
						currentLine = null;
					}
				}
			}
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringH1(RichStringH1 object) {
			H1Start start = factory.createH1Start();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			H1End end = factory.createH1End();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringH2(RichStringH2 object) {
			H2Start start = factory.createH2Start();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			H2End end = factory.createH2End();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringH3(RichStringH3 object) {
			H3Start start = factory.createH3Start();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			H3End end = factory.createH3End();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringH4(RichStringH4 object) {
			H4Start start = factory.createH4Start();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			H4End end = factory.createH4End();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringH5(RichStringH5 object) {
			H5Start start = factory.createH5Start();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			H5End end = factory.createH5End();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringH6(RichStringH6 object) {
			H6Start start = factory.createH6Start();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			H6End end = factory.createH6End();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringChapter(RichStringChapter object) {
			ChapterStart start = factory.createChapterStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ChapterEnd end = factory.createChapterEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringSection(RichStringSection object) {
			SectionStart start = factory.createSectionStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			SectionEnd end = factory.createSectionEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringSubsection(RichStringSubsection object) {
			SubSectionStart start = factory.createSubSectionStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			SubSectionEnd end = factory.createSubSectionEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringExample(RichStringExample object) {
			ExampleStart start = factory.createExampleStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ExampleEnd end = factory.createExampleEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringURL(RichStringURL object) {
			URLStart start = factory.createURLStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getText());

			URLEnd end = factory.createURLEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringRef(RichStringRef object) {
			RefStart start = factory.createRefStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			RefEnd end = factory.createRefEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringMailto(RichStringMailto object) {
			MailtoStart start = factory.createMailtoStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getContent());

			MailtoEnd end = factory.createMailtoEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringSkype(RichStringSkype object) {
			SkypeStart start = factory.createSkypeStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getContent());

			SkypeEnd end = factory.createSkypeEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringMovie(RichStringMovie object) {
			MovieStart start = factory.createMovieStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getContent());

			MovieEnd end = factory.createMovieEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringCode(RichStringCode object) {
			CodeStart start = factory.createCodeStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getContent());

			CodeEnd end = factory.createCodeEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringTable(RichStringTable object) {
			TableStart start = factory.createTableStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			TableEnd end = factory.createTableEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringTableRow(RichStringTableRow object) {
			TableRowStart start = factory.createTableRowStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			TableRowEnd end = factory.createTableRowEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringTableCell(RichStringTableCell object) {
			TableCellStart start = factory.createTableCellStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			TableCellEnd end = factory.createTableCellEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringList(RichStringList object) {
			ListStart start = factory.createListStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ListEnd end = factory.createListEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringOrderedList(RichStringOrderedList object) {
			OrderedListStart start = factory.createOrderedListStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			OrderedListEnd end = factory.createOrderedListEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringListElement(RichStringListElement object) {
			ListElementStart start = factory.createListElementStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ListElementEnd end = factory.createListElementEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringImg(RichStringImg object) {
			ImgStart start = factory.createImgStart();
			start.setContent(object);
			addToCurrentLine(start);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringBold(RichStringBold object) {
			BoldStart start = factory.createBoldStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			BoldEnd end = factory.createBoldEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringUnderline(RichStringUnderline object) {
			UnderlineStart start = factory.createUnderlineStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			UnderlineEnd end = factory.createUnderlineEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringItalic(RichStringItalic object) {
			ItalicStart start = factory.createItalicStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ItalicEnd end = factory.createItalicEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringSpan(RichStringSpan object) {
			SpanStart start = factory.createSpanStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			SpanEnd end = factory.createSpanEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringOpenView(RichStringOpenView object) {
			OpenViewStart start = factory.createOpenViewStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			OpenViewEnd end = factory.createOpenViewEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringStartProcess(RichStringStartProcess object) {
			StartProcessStart start = factory.createStartProcessStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			StartProcessEnd end = factory.createStartProcessEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringEntityRef(RichStringEntityRef object) {
			EntityRefStart start = factory.createEntityRefStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			EntityRefEnd end = factory.createEntityRefEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringDTORef(RichStringDTORef object) {
			DTORefStart start = factory.createDTORefStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			DTORefEnd end = factory.createDTORefEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringProcessRef(RichStringProcessRef object) {
			ProcessRefStart start = factory.createProcessRefStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ProcessRefEnd end = factory.createProcessRefEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringTaskRef(RichStringTaskRef object) {
			TaskRefStart start = factory.createTaskRefStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			TaskRefEnd end = factory.createTaskRefEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringViewRef(RichStringViewRef object) {
			ViewRefStart start = factory.createViewRefStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ViewRefEnd end = factory.createViewRefEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringUIRef(RichStringUIRef object) {
			UIRefStart start = factory.createUIRefStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			UIRefEnd end = factory.createUIRefEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringBox(RichStringBox object) {
			BoxStart start = factory.createBoxStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			BoxEnd end = factory.createBoxEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringContainer(RichStringContainer object) {
			ContainerStart start = factory.createContainerStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ContainerEnd end = factory.createContainerEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringColumnLayout(RichStringColumnLayout object) {
			ColumnLayoutStart start = factory.createColumnLayoutStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ColumnLayoutEnd end = factory.createColumnLayoutEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringColumn(RichStringColumn object) {
			ColumnStart start = factory.createColumnStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			ColumnEnd end = factory.createColumnEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringFooter(RichStringFooter object) {
			FooterStart start = factory.createFooterStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			FooterEnd end = factory.createFooterEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringHeader(RichStringHeader object) {
			HeaderStart start = factory.createHeaderStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			HeaderEnd end = factory.createHeaderEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringIndex(RichStringIndex object) {
			IndexStart start = factory.createIndexStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			IndexEnd end = factory.createIndexEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRichStringIndexElement(RichStringIndexElement object) {
			IndexElementStart start = factory.createIndexElementStart();
			start.setContent(object);
			addToCurrentLine(start);

			doSwitch(object.getExpression());

			IndexElementEnd end = factory.createIndexElementEnd();
			end.setStart(start);
			addToCurrentLine(end);
			return Boolean.TRUE;
		}
	}

	public static class Implementation extends LDocCompilerSwitch<Boolean> {

		private final IRichStringPartAcceptor acceptor;

		private final IRichStringIndentationHandler indentationHandler;

		private LinePart nextPart;

		private RichStringLiteral announced;

		private int skipCount = 0;

		public Implementation(IRichStringPartAcceptor acceptor,
				IRichStringIndentationHandler indentationHandler) {
			this.acceptor = acceptor;
			this.indentationHandler = indentationHandler;
		}

		@Override
		public Boolean doSwitch(EObject theEObject) {
			if (theEObject == null)
				return Boolean.TRUE;
			return super.doSwitch(theEObject);
		}

		@Override
		public Boolean caseProcessedRichString(ProcessedRichString object) {
			String indentation = computeInitialIndentation(object
					.getRichString());
			pushTemplateIndentation(indentation);
			List<Line> lines = object.getLines();
			if (!lines.isEmpty()) {
				int i = 0;
				nextPart = null;
				Line currentLine = lines.get(i);
				while (currentLine.getParts().isEmpty() && i < lines.size()) {
					currentLine = lines.get(i);
				}
				if (!currentLine.getParts().isEmpty()) {
					nextPart = currentLine.getParts().get(0);
				}
				while (nextPart != null) {
					doSwitch(nextPart);
				}
			}
			popIndentation();
			return Boolean.TRUE;
		}

		protected void computeNextPart(LinePart part) {
			Line line = part.getLine();
			int index = line.getParts().indexOf(part);
			if (index == line.getParts().size() - 1) {
				ProcessedRichString richString = line.getRichString();
				index = richString.getLines().indexOf(line);
				if (index == richString.getLines().size() - 1)
					nextPart = null;
				else {
					int i = index + 1;
					nextPart = null;
					line = richString.getLines().get(i);
					while (line.getParts().isEmpty()
							&& i < richString.getLines().size()) {
						line = richString.getLines().get(i);
					}
					if (!line.getParts().isEmpty()) {
						nextPart = line.getParts().get(0);
					}
				}
			} else {
				nextPart = line.getParts().get(index + 1);
			}
		}

		@Override
		public Boolean caseForLoopStart(ForLoopStart object) {
			RichStringForLoop loop = object.getLoop();
			acceptor.acceptForLoop(loop.getDeclaredParam(),
					loop.getForExpression());
			pushTemplateIndentationTwice(computeInitialIndentation((RichString) loop
					.getEachExpression()));
			boolean hasNext = acceptor.forLoopHasNext(loop.getBefore(),
					loop.getSeparator(),
					indentationHandler.getTotalSemanticIndentation());
			if (hasNext) {
				while (hasNext) {
					computeNextPart(object);
					while (nextPart != object.getEnd()) {
						doSwitch(nextPart);
					}
					hasNext = acceptor.forLoopHasNext(loop.getBefore(),
							loop.getSeparator(),
							indentationHandler.getTotalSemanticIndentation());
				}
			} else {
				nextPart = object.getEnd();
			}
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseForLoopEnd(ForLoopEnd object) {
			popIndentationTwice();
			acceptor.acceptEndFor(object.getStart().getLoop().getAfter(),
					indentationHandler.getTotalSemanticIndentation());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseIfConditionStart(IfConditionStart object) {
			RichStringIf richStringIf = object.getRichStringIf();
			acceptor.acceptIfCondition(richStringIf.getIf());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation((RichString) richStringIf
					.getThen()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseElseIfCondition(ElseIfCondition object) {
			popIndentationTwice();
			RichStringElseIf elseIf = object.getRichStringElseIf();
			acceptor.acceptElseIfCondition(elseIf.getIf());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation((RichString) elseIf
					.getThen()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseElseStart(ElseStart object) {
			popIndentationTwice();
			acceptor.acceptElse();
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation((RichString) object
					.getIfConditionStart().getRichStringIf().getElse()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseEndIf(EndIf object) {
			popIndentationTwice();
			acceptor.acceptEndIf();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseDocumentStart(DocumentStart object) {
			acceptor.acceptDocumentStart(object.getDocument());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseDocumentEnd(DocumentEnd object) {
			acceptor.acceptDocumentEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH1Start(H1Start object) {
			acceptor.acceptH1Start(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH1End(H1End object) {
			acceptor.acceptH1End();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH2Start(H2Start object) {
			acceptor.acceptH2Start(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH2End(H2End object) {
			acceptor.acceptH2End();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH3Start(H3Start object) {
			acceptor.acceptH3Start(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH3End(H3End object) {
			acceptor.acceptH3End();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH4Start(H4Start object) {
			acceptor.acceptH4Start(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH4End(H4End object) {
			acceptor.acceptH4End();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH5Start(H5Start object) {
			acceptor.acceptH5Start(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH5End(H5End object) {
			acceptor.acceptH5End();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH6Start(H6Start object) {
			acceptor.acceptH6Start(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseH6End(H6End object) {
			acceptor.acceptH6End();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseChapterStart(ChapterStart object) {
			acceptor.acceptChapterStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseChapterEnd(ChapterEnd object) {
			acceptor.acceptChapterEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSectionStart(SectionStart object) {
			acceptor.acceptSectionStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSectionEnd(SectionEnd object) {
			acceptor.acceptSectionEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSubSectionStart(SubSectionStart object) {
			acceptor.acceptSubsectionStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSubSectionEnd(SubSectionEnd object) {
			acceptor.acceptSubsectionEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseBoldStart(BoldStart object) {
			acceptor.acceptBoldStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseBoldEnd(BoldEnd object) {
			acceptor.acceptBoldEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseUnderlineStart(UnderlineStart object) {
			acceptor.acceptUnderlineStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseUnderlineEnd(UnderlineEnd object) {
			acceptor.acceptUnderlineEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseItalicStart(ItalicStart object) {
			acceptor.acceptItalicStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseItalicEnd(ItalicEnd object) {
			acceptor.acceptItalicEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSpanStart(SpanStart object) {
			acceptor.acceptSpanStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSpanEnd(SpanEnd object) {
			acceptor.acceptSpanEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseImgStart(ImgStart object) {
			acceptor.acceptImgStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseURLStart(URLStart object) {
			acceptor.acceptURLStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseURLEnd(URLEnd object) {
			acceptor.acceptURLEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRefStart(RefStart object) {
			acceptor.acceptRefStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseRefEnd(RefEnd object) {
			acceptor.acceptRefEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseMailtoStart(MailtoStart object) {
			acceptor.acceptMailtoStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseMailtoEnd(MailtoEnd object) {
			acceptor.acceptMailtoEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSkypeStart(SkypeStart object) {
			acceptor.acceptSkypeStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseSkypeEnd(SkypeEnd object) {
			acceptor.acceptSkypeEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseMovieStart(MovieStart object) {
			acceptor.acceptMovieStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseMovieEnd(MovieEnd object) {
			acceptor.acceptMovieEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseCodeStart(CodeStart object) {
			acceptor.acceptCodeStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseCodeEnd(CodeEnd object) {
			acceptor.acceptCodeEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTableStart(TableStart object) {
			acceptor.acceptTableStart(object.getContent());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation(object
					.getContent().getExpression()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTableEnd(TableEnd object) {
			popIndentationTwice();
			acceptor.acceptTableEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTableRowStart(TableRowStart object) {
			acceptor.acceptTableRowStart(object.getContent());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation(object
					.getContent().getExpression()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTableRowEnd(TableRowEnd object) {
			popIndentationTwice();
			acceptor.acceptTableRowEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTableCellStart(TableCellStart object) {
			acceptor.acceptTableCellStart(object.getContent());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation(object
					.getContent().getExpression()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTableCellEnd(TableCellEnd object) {
			popIndentationTwice();
			acceptor.acceptTableCellEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseListStart(ListStart object) {
			acceptor.acceptListStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseListEnd(ListEnd object) {
			acceptor.acceptListEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseOrderedListStart(OrderedListStart object) {
			acceptor.acceptOrderedListStart(object.getContent());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation(object
					.getContent().getExpression()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseOrderedListEnd(OrderedListEnd object) {
			popIndentationTwice();
			acceptor.acceptOrderedListEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseListElementStart(ListElementStart object) {
			acceptor.acceptListElementStart(object.getContent());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation(object
					.getContent().getExpression()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseListElementEnd(ListElementEnd object) {
			popIndentationTwice();
			acceptor.acceptListElementEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseExampleStart(ExampleStart object) {
			acceptor.acceptExampleStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseExampleEnd(ExampleEnd object) {
			acceptor.acceptExampleEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseOpenViewStart(OpenViewStart object) {
			acceptor.acceptOpenViewStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseOpenViewEnd(OpenViewEnd object) {
			acceptor.acceptOpenViewEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseStartProcessStart(StartProcessStart object) {
			acceptor.acceptStartProcessStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseStartProcessEnd(StartProcessEnd object) {
			acceptor.acceptStartProcessEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseEntityRefStart(EntityRefStart object) {
			acceptor.acceptEntityRefStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseEntityRefEnd(EntityRefEnd object) {
			acceptor.acceptEntityRefEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseDTORefStart(DTORefStart object) {
			acceptor.acceptDTORefStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseDTORefEnd(DTORefEnd object) {
			acceptor.acceptDTORefEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseProcessRefStart(ProcessRefStart object) {
			acceptor.acceptProcessRefStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseProcessRefEnd(ProcessRefEnd object) {
			acceptor.acceptProcessRefEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTaskRefStart(TaskRefStart object) {
			acceptor.acceptTaskRefStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseTaskRefEnd(TaskRefEnd object) {
			acceptor.acceptTaskRefEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseViewRefStart(ViewRefStart object) {
			acceptor.acceptViewRefStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseViewRefEnd(ViewRefEnd object) {
			acceptor.acceptViewRefEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseUIRefStart(UIRefStart object) {
			acceptor.acceptUIRefStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseUIRefEnd(UIRefEnd object) {
			acceptor.acceptUIRefEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseBoxStart(BoxStart object) {
			acceptor.acceptBoxStart(object.getContent());
			computeNextPart(object);
			pushSemanticIndentation(indentationHandler.getTotalIndentation());
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseBoxEnd(BoxEnd object) {
			acceptor.acceptBoxEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseContainerStart(ContainerStart object) {
			acceptor.acceptContainerStart(object.getContent());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation(object
					.getContent().getExpression()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseContainerEnd(ContainerEnd object) {
			acceptor.acceptContainerEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseColumnLayoutStart(ColumnLayoutStart object) {
			acceptor.acceptColumnLayoutStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseColumnLayoutEnd(ColumnLayoutEnd object) {
			acceptor.acceptColumnLayoutEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseColumnStart(ColumnStart object) {
			acceptor.acceptColumnStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseColumnEnd(ColumnEnd object) {
			acceptor.acceptColumnEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseFooterStart(FooterStart object) {
			acceptor.acceptFooterStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseFooterEnd(FooterEnd object) {
			acceptor.acceptFooterEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseHeaderStart(HeaderStart object) {
			acceptor.acceptHeaderStart(object.getContent());
			computeNextPart(object);
			pushTemplateIndentationTwice(computeInitialIndentation(object
					.getContent().getExpression()));
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseHeaderEnd(HeaderEnd object) {
			popIndentationTwice();
			acceptor.acceptHeaderEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseIndexStart(IndexStart object) {
			acceptor.acceptIndexStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseIndexEnd(IndexEnd object) {
			acceptor.acceptIndexEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseIndexElementStart(IndexElementStart object) {
			acceptor.acceptIndexElementStart(object.getContent());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseIndexElementEnd(IndexElementEnd object) {
			acceptor.acceptIndexElementEnd();
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean casePrintedExpression(PrintedExpression object) {
			acceptor.acceptExpression(object.getExpression(),
					indentationHandler.getTotalSemanticIndentation());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseLineBreak(LineBreak object) {
			Line line = object.getLine();
			if (isTemplateLine(line)) {
				announceTemplateLinebreak(object);
				ProcessedRichString string = line.getRichString();
				boolean firstOrLast = string.getLines().get(0) == line
						|| string.getLines().get(string.getLines().size() - 1) == line;
				if (!firstOrLast)
					popIndentation();
			} else {
				announceSemanticLinebreak(object);
				popIndentation();
			}
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseLiteral(Literal object) {
			if (announced == null || announced != object.getLiteral()) {
				acceptor.announceNextLiteral(object.getLiteral());
				announced = object.getLiteral();
			}
			Line line = object.getLine();
			TextLine textLine = new TextLine(Strings.emptyIfNull(object
					.getLiteral().getValue()), object.getOffset(),
					object.getLength(), 0);
			CharSequence ws = textLine.getLeadingWhiteSpace();
			ProcessedRichString string = line.getRichString();
			boolean firstOrLast = string.getLines().get(0) == line
					|| string.getLines().get(string.getLines().size() - 1) == line;
			if (isTemplateLine(line)) {
				if (line.getParts().get(0) == object) {
					if (!firstOrLast) {
						boolean followedByOpening = false;
						if (line.getParts().size() >= 2) {
							LinePart next = line.getParts().get(1);
							if (next instanceof ForLoopStart
									|| next instanceof IfConditionStart) {
								followedByOpening = true;
							}
						}
						if (!followedByOpening) {
							pushSemanticIndentation(indentationHandler
									.getTotalIndentation());
						} else {
							pushSemanticIndentation(ws);
						}
					}
				}
				announceTemplateText(textLine, object.getLiteral());
			} else {
				if (skipCount <= 1) {
					firstOrLast = false;
					if (skipCount == 0 && line.getParts().get(0) == object) {
						if (textLine.length() == ws.length()) {
							for (int i = 1; i < line.getParts().size(); i++) {
								if (line.getParts().get(i) instanceof Literal
										&& !(line.getParts().get(i) instanceof LineBreak)) {
									Literal nextLiteralInSameLine = (Literal) line
											.getParts().get(i);
									TextLine nextLiteralLine = new TextLine(
											nextLiteralInSameLine.getLiteral()
													.getValue(),
											nextLiteralInSameLine.getOffset(),
											nextLiteralInSameLine.getLength(),
											0);
									CharSequence nextLeading = nextLiteralLine
											.getLeadingWhiteSpace();
									if (nextLeading.length() > 0) {
										ws = ws.toString() + nextLeading;
									}
									skipCount++;
									if (nextLeading.length() != nextLiteralLine
											.length()) {
										break;
									}
								} else {
									break;
								}
							}
							if (skipCount != 0) {
								pushSemanticIndentation(ws);
							} else {
								pushSemanticIndentation(ws);
								announceIndentation();
								announceSemanticText(textLine.subSequence(
										ws.length(), textLine.length()),
										object.getLiteral());
							}
						} else {
							pushSemanticIndentation(ws);
							announceIndentation();
							announceSemanticText(
									textLine.subSequence(ws.length(),
											textLine.length()),
									object.getLiteral());
						}
					} else {
						if (skipCount == 1) {
							skipCount--;
							announceIndentation();
							announceSemanticText(
									textLine.subSequence(ws.length(),
											textLine.length()),
									object.getLiteral());
						} else {
							announceSemanticText(textLine, object.getLiteral());
						}
					}
				} else {
					skipCount--;
				}
			}
			if (!firstOrLast
					&& line.getParts().get(line.getParts().size() - 1) == object) {
				popIndentation();
			}
			computeNextPart(object);
			return Boolean.TRUE;
		}

		@Override
		public Boolean caseMarkup(Markup object) {
			RichStringMarkup markup = object.getMarkup();
			acceptor.acceptExpression(markup.getExpression(),
					indentationHandler.getTotalSemanticIndentation());
			computeNextPart(object);
			return Boolean.TRUE;
		}

		protected boolean isTemplateLine(Line line) {
			ProcessedRichString string = line.getRichString();
			if (string.getLines().size() == 1) {
				return false;
			}
			boolean firstOrLast = string.getLines().get(0) == line;
			if (!firstOrLast) {
				if (string.getLines().get(string.getLines().size() - 1) == line) {
					if (!(line.getParts().get(line.getParts().size() - 1) instanceof LineBreak))
						firstOrLast = true;
				}
			}
			boolean onlyLiterals = true;
			for (LinePart part : line.getParts()) {
				if (part instanceof PrintedExpression)
					return false;
				if (part instanceof Literal) {
					Literal literal = (Literal) part;
					if (literal instanceof LineBreak) {
						if (firstOrLast)
							return onlyLiterals;
						return !onlyLiterals;
					}
					if (!(new TextLine(literal.getLiteral().getValue(),
							literal.getOffset(), literal.getLength(), 0)
							.containsOnlyWhitespace()))
						return false;
				} else if (firstOrLast) {
					return false;
				} else {
					onlyLiterals = false;
				}
			}
			if (firstOrLast)
				return onlyLiterals;
			return !onlyLiterals;
		}

		protected void pushSemanticIndentation(CharSequence line) {
			indentationHandler.pushSemanticIndentation(line);
		}

		protected void popIndentation() {
			indentationHandler.popIndentation();
		}

		protected void popIndentationTwice() {
			popIndentation();
			popIndentation();
		}

		protected void pushTemplateIndentationTwice(CharSequence indentation) {
			pushTemplateIndentation(indentation);
			pushTemplateIndentation(indentation);
		}

		protected void pushTemplateIndentation(CharSequence indentation) {
			indentationHandler.pushTemplateIndentation(indentation);
		}

		protected void announceSemanticText(CharSequence text,
				RichStringLiteral origin) {
			acceptor.acceptSemanticText(text, origin);
		}

		public void announceTemplateText(CharSequence text,
				RichStringLiteral origin) {
			acceptor.acceptTemplateText(text, origin);
		}

		public void announceIndentation() {
			indentationHandler.accept(acceptor);
		}

		protected void announceTemplateLinebreak(LineBreak lineBreak) {
			acceptor.acceptTemplateLineBreak(lineBreak.getLength(),
					lineBreak.getLiteral());
		}

		public void announceSemanticLinebreak(LineBreak lineBreak) {
			boolean controlStructureSeen = false;
			for (LinePart part : lineBreak.getLine().getParts()) {
				if (!(part instanceof Literal)) {
					controlStructureSeen = true;
					break;
				}
			}
			acceptor.acceptSemanticLineBreak(lineBreak.getLength(),
					lineBreak.getLiteral(), controlStructureSeen);
		}

		public String computeInitialIndentation(EObject object) {
			if (object == null) {
				return indentationHandler.getTotalIndentation().toString();
			}
			InitialTemplateIndentationComputer computer = new InitialTemplateIndentationComputer(
					indentationHandler.getTotalIndentation());
			String result = computer.doSwitch(object);
			return result;
		}
	}

}
