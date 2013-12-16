/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.richstring;

import java.util.BitSet;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.doc.dsl.luniferadoc.NamedDocument;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
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
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef;

/**
 * No-op implementation of the {@link IRichStringPartAcceptor}. Clients should inherit from this class if they do not
 * want to implement all methods. It is mandatory to implement {@link #forLoopHasNext()}.
 */
@NonNullByDefault
public abstract class AbstractRichStringPartAcceptor implements IRichStringPartAcceptor {

	public void acceptSemanticText(CharSequence text, @Nullable RichStringLiteral origin) {
	}

	public void acceptTemplateText(CharSequence text, @Nullable RichStringLiteral origin) {
	}

	public void acceptSemanticLineBreak(int charCount, RichStringLiteral origin,
			boolean controlStructureSeen) {
	}

	public void acceptTemplateLineBreak(int charCount, RichStringLiteral origin) {
	}

	public void acceptIfCondition(XExpression condition) {
	}

	public void acceptElseIfCondition(XExpression condition) {
	}

	public void acceptElse() {
	}

	public void acceptEndIf() {
	}

	public void acceptForLoop(JvmFormalParameter parameter, XExpression expression) {
	}

	public void acceptEndFor(@Nullable XExpression after, CharSequence indentation) {
	}

	public void acceptExpression(XExpression expression, CharSequence indentation) {
	}

	public void announceNextLiteral(RichStringLiteral object) {
	}

	@Override
	public void acceptH1Start(RichStringH1 object) {
	}

	@Override
	public void acceptH1End() {
	}

	@Override
	public void acceptH2Start(RichStringH2 object) {
	}

	@Override
	public void acceptH2End() {
	}

	@Override
	public void acceptChapterStart(RichStringChapter object) {
	}

	@Override
	public void acceptChapterEnd() {
	}

	@Override
	public void acceptSectionStart(RichStringSection object) {
	}

	@Override
	public void acceptSectionEnd() {
	}

	@Override
	public void acceptSubsectionStart(RichStringSubsection object) {
	}

	@Override
	public void acceptSubsectionEnd() {
	}

	@Override
	public void acceptURLStart(RichStringURL object) {
	}

	@Override
	public void acceptURLEnd() {
	}

	@Override
	public void acceptRefStart(RichStringRef object) {
	}

	@Override
	public void acceptRefEnd() {
	}

	@Override
	public void acceptMailtoStart(RichStringMailto object) {
	}

	@Override
	public void acceptMailtoEnd() {
	}

	@Override
	public void acceptSkypeStart(RichStringSkype object) {
	}

	@Override
	public void acceptSkypeEnd() {
	}

	@Override
	public void acceptMovieStart(RichStringMovie object) {
	}

	@Override
	public void acceptMovieEnd() {
	}

	@Override
	public void acceptCodeStart(RichStringCode object) {
	}

	@Override
	public void acceptCodeEnd() {
	}

	@Override
	public void acceptTableStart(RichStringTable object) {
	}

	@Override
	public void acceptTableEnd() {
	}

	@Override
	public void acceptTableRowStart(RichStringTableRow object) {
	}

	@Override
	public void acceptTableRowEnd() {
	}

	@Override
	public void acceptTableDataStart(RichStringTableData object) {
	}

	@Override
	public void acceptTableDataEnd() {
	}

	@Override
	public void acceptListStart(RichStringList object) {
	}

	@Override
	public void acceptListEnd() {
	}

	@Override
	public void acceptOrderedListStart(RichStringOrderedList object) {
	}

	@Override
	public void acceptOrderedListEnd() {
	}

	@Override
	public void acceptListElementStart(RichStringListElement object) {
	}

	@Override
	public void acceptListElementEnd() {
	}

	@Override
	public void acceptImgStart(RichStringImg object) {
	}

	@Override
	public void acceptBoldStart(RichStringBold object) {
	}

	@Override
	public void acceptBoldEnd() {
	}

	@Override
	public void acceptUnderlineStart(RichStringUnderline object) {
	}

	@Override
	public void acceptUnderlineEnd() {
	}

	@Override
	public void acceptItalicStart(RichStringItalic object) {
	}

	@Override
	public void acceptItalicEnd() {
	}

	@Override
	public void acceptExampleStart(RichStringExample object) {
	}

	@Override
	public void acceptExampleEnd() {
	}

	@Override
	public void acceptOpenViewStart(RichStringOpenView object) {
	}

	@Override
	public void acceptOpenViewEnd() {
	}

	@Override
	public void acceptStartProcessStart(RichStringStartProcess object) {
	}

	@Override
	public void acceptStartProcessEnd() {
	}

	@Override
	public void acceptEntityRefStart(RichStringEntityRef object) {
	}

	@Override
	public void acceptEntityRefEnd() {
	}

	@Override
	public void acceptDTORefStart(RichStringDTORef object) {
	}

	@Override
	public void acceptDTORefEnd() {
	}

	@Override
	public void acceptProcessRefStart(RichStringProcessRef object) {
	}

	@Override
	public void acceptProcessRefEnd() {
	}

	@Override
	public void acceptTaskRefStart(RichStringTaskRef object) {
	}

	@Override
	public void acceptTaskRefEnd() {
	}

	@Override
	public void acceptViewRefStart(RichStringViewRef object) {
	}

	@Override
	public void acceptViewRefEnd() {
	}

	@Override
	public void acceptUIRefStart(RichStringUIRef object) {
	}

	@Override
	public void acceptUIRefEnd() {
	}

	@Override
	public void acceptDocumentStart(NamedDocument object) {
	}

	@Override
	public void acceptDocumentEnd() {
	}

	@NonNullByDefault
	// currently necessary here due to a bug in JDT
	public static class ForLoopOnce extends AbstractRichStringPartAcceptor {

		private BitSet forLoopStack = new BitSet();
		private int forLoopStackPointer = -1;

		@Override
		public void acceptForLoop(JvmFormalParameter parameter, @Nullable XExpression expression) {
			forLoopStackPointer++;
			forLoopStack.set(forLoopStackPointer);
		}

		public boolean forLoopHasNext(@Nullable XExpression before,
				@Nullable XExpression separator, CharSequence indentation) {
			if (forLoopStack.get(forLoopStackPointer)) {
				forLoopStack.set(forLoopStackPointer, false);
				return true;
			}
			return false;
		}

		@Override
		public void acceptEndFor(@Nullable XExpression after, CharSequence indentation) {
			forLoopStackPointer--;
		}
	}
}
