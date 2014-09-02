/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.richstring;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBox;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumn;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumnLayout;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringContainer;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringFooter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH3;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH4;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH5;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH6;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringHeader;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndex;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndexElement;
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

/**
 * The {@link IRichStringPartAcceptor} can be passed into a
 * {@link RichStringProcessor} to handle the semantics of a
 * {@link org.eclipse.xtend.core.xtend.RichString} for a specific use case. It's
 * mainly an event sink but may influence the control flow of the
 * {@link RichStringProcessor} by means of {@link #forLoopHasNext()}.
 */

public interface IRichStringPartAcceptor {

	/**
	 * @param text
	 *            the semantic text. May not be <code>null</code>.
	 * @param origin
	 *            the value holder for the full text or null, if unknown.
	 */
	void acceptSemanticText(CharSequence text, RichStringLiteral origin);

	/**
	 * @param text
	 *            the template text. May not be <code>null</code>.
	 * @param origin
	 *            the value holder for the full text or null, if unknown.
	 */
	void acceptTemplateText(CharSequence text, RichStringLiteral origin);

	/**
	 * Indicates a semantic line break in a rich string literal.
	 * 
	 * @param origin
	 *            the instance holding the complete text value that contains the
	 *            line break.
	 * @param charCount
	 *            the number of characters in the line break.
	 * @param whether
	 *            or not the line break occurs in a line that contains a control
	 *            structure.
	 */
	void acceptSemanticLineBreak(int charCount, RichStringLiteral origin,
			boolean controlStructureSeen);

	/**
	 * Indicates a template line break in a rich string literal.
	 * 
	 * @param origin
	 *            the instance holding the complete text value that contains the
	 *            line break.
	 * @param charCount
	 *            the number of characters in the line break.
	 */
	void acceptTemplateLineBreak(int charCount, RichStringLiteral origin);

	/**
	 * Announces that an
	 * 
	 * <pre>
	 * �IF condition�
	 * </pre>
	 * 
	 * has been consumed.
	 * 
	 * @param condition
	 *            the condition of an
	 *            {@link org.eclipse.xtend.core.xtend.RichStringIf}.
	 */
	void acceptIfCondition(XExpression condition);

	/**
	 * Announces that an
	 * 
	 * <pre>
	 * �ELSEIF condition�
	 * </pre>
	 * 
	 * has been consumed.
	 * 
	 * @param condition
	 *            the condition of an
	 *            {@link org.eclipse.xtend.core.xtend.RichStringElseIf}.
	 */
	void acceptElseIfCondition(XExpression condition);

	/**
	 * Announces that an
	 * 
	 * <pre>
	 * �ELSE�
	 * </pre>
	 * 
	 * has been consumed.
	 */
	void acceptElse();

	/**
	 * Announces that an
	 * 
	 * <pre>
	 * �ENDIF�
	 * </pre>
	 * 
	 * has been consumed.
	 */
	void acceptEndIf();

	/**
	 * Announces that a
	 * 
	 * <pre>
	 * �FOR parameter: expression�
	 * </pre>
	 * 
	 * has been consumed.
	 * 
	 * @param parameter
	 *            the declared parameter in the for-loop.
	 * @param expression
	 *            the expression that produces an {@link Iterable}.
	 */
	void acceptForLoop(JvmFormalParameter parameter, XExpression expression);

	/**
	 * Queried to determine whether the body of the for-loop should be evaluated
	 * (again).
	 * 
	 * @param before
	 *            the expression that should be evaluated prior to the first
	 *            item of the loop, if any.
	 * @param separator
	 *            the expression that should be evaluated prior to the second
	 *            and all subsequent items of the loop.
	 * @param indentation
	 *            the additional indentation for any line besides the first one.
	 * @return <code>true</code> if the for-loop body should be evaluated.
	 */
	boolean forLoopHasNext(XExpression before, XExpression separator,
			CharSequence indentation);

	/**
	 * Announces that an
	 * 
	 * <pre>
	 * �ENDFOR�
	 * </pre>
	 * 
	 * has been consumed.
	 * 
	 * @param after
	 *            the expression that should be evaluated after the last item of
	 *            the loop, if any.
	 * @param indentation
	 *            the additional indentation for any line besides the first one.
	 */
	void acceptEndFor(XExpression after, CharSequence indentation);

	/**
	 * Announces that an
	 * 
	 * <pre>
	 * �expression�
	 * </pre>
	 * 
	 * has been consumed. If the expression's evaluation result contains more
	 * than one line, any line besides the first one may be prefixed with the
	 * given indentation.
	 * 
	 * @param expression
	 *            the consumed expression. May not be <code>null</code>.
	 * @param indentation
	 *            the additional indentation for any line besides the first one.
	 */
	void acceptExpression(XExpression expression, CharSequence indentation);

	/**
	 * Announces that a next literal will be processed.
	 * 
	 * @param literal
	 *            the literal.
	 */
	void announceNextLiteral(RichStringLiteral literal);

	void acceptDocumentStart(LDocNamedDocument object);

	void acceptDocumentEnd();

	void acceptH1Start(RichStringH1 object);

	void acceptH1End();

	void acceptH2Start(RichStringH2 object);

	void acceptH2End();

	void acceptH3Start(RichStringH3 object);

	void acceptH3End();

	void acceptH4Start(RichStringH4 object);

	void acceptH4End();

	void acceptH5Start(RichStringH5 object);

	void acceptH5End();

	void acceptH6Start(RichStringH6 object);

	void acceptH6End();

	void acceptChapterStart(RichStringChapter object);

	void acceptChapterEnd();

	void acceptSectionStart(RichStringSection object);

	void acceptSectionEnd();

	void acceptSubsectionStart(RichStringSubsection object);

	void acceptSubsectionEnd();

	void acceptURLStart(RichStringURL object);

	void acceptURLEnd();

	void acceptRefStart(RichStringRef object);

	void acceptRefEnd();

	void acceptMailtoStart(RichStringMailto object);

	void acceptMailtoEnd();

	void acceptSkypeStart(RichStringSkype object);

	void acceptSkypeEnd();

	void acceptMovieStart(RichStringMovie object);

	void acceptMovieEnd();

	void acceptCodeStart(RichStringCode object);

	void acceptCodeEnd();

	void acceptTableStart(RichStringTable object);

	void acceptTableEnd();

	void acceptTableRowStart(RichStringTableRow object);

	void acceptTableRowEnd();

	void acceptTableCellStart(RichStringTableCell object);

	void acceptTableCellEnd();

	void acceptListStart(RichStringList object);

	void acceptListEnd();

	void acceptOrderedListStart(RichStringOrderedList object);

	void acceptOrderedListEnd();

	void acceptListElementStart(RichStringListElement object);

	void acceptListElementEnd();

	void acceptImgStart(RichStringImg object);

	void acceptBoldStart(RichStringBold object);

	void acceptBoldEnd();

	void acceptUnderlineStart(RichStringUnderline object);

	void acceptUnderlineEnd();

	void acceptItalicStart(RichStringItalic object);

	void acceptItalicEnd();

	void acceptSpanStart(RichStringSpan object);

	void acceptSpanEnd();

	void acceptExampleStart(RichStringExample object);

	void acceptExampleEnd();

	void acceptOpenViewStart(RichStringOpenView object);

	void acceptOpenViewEnd();

	void acceptStartProcessStart(RichStringStartProcess object);

	void acceptStartProcessEnd();

	void acceptEntityRefStart(RichStringEntityRef object);

	void acceptEntityRefEnd();

	void acceptDTORefStart(RichStringDTORef object);

	void acceptDTORefEnd();

	void acceptProcessRefStart(RichStringProcessRef object);

	void acceptProcessRefEnd();

	void acceptTaskRefStart(RichStringTaskRef object);

	void acceptTaskRefEnd();

	void acceptViewRefStart(RichStringViewRef object);

	void acceptViewRefEnd();

	void acceptUIRefStart(RichStringUIRef object);

	void acceptUIRefEnd();

	void acceptBoxStart(RichStringBox object);

	void acceptBoxEnd();

	void acceptContainerStart(RichStringContainer object);

	void acceptContainerEnd();

	void acceptColumnLayoutStart(RichStringColumnLayout object);

	void acceptColumnLayoutEnd();

	void acceptColumnStart(RichStringColumn object);

	void acceptColumnEnd();

	void acceptFooterStart(RichStringFooter object);

	void acceptFooterEnd();

	void acceptHeaderStart(RichStringHeader object);

	void acceptHeaderEnd();

	void acceptIndexStart(RichStringIndex object);

	void acceptIndexEnd();

	void acceptIndexElementStart(RichStringIndexElement object);

	void acceptIndexElementEnd();

}
