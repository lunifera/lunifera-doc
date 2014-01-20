/** 
 * Caution! Commented-out code below, remove before push!
 */
package org.lunifera.doc.dsl.formatting

import com.google.inject.Inject
import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.formatting.FormattableDocument
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory
import org.eclipse.xtext.xbase.formatting.NewLineData
import org.eclipse.xtext.xbase.formatting.NodeModelAccess
import org.eclipse.xtext.xbase.formatting.WhitespaceData
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage
import org.lunifera.doc.dsl.richstring.AbstractRichStringPartAcceptor
import org.lunifera.doc.dsl.richstring.DefaultIndentationHandler
import org.lunifera.doc.dsl.richstring.RichStringProcessor
 
/**
 * cases to distinguish:
 * 	1. single-line
 *  2. multi-line with text after opening ''': lines start with semantic whitespace
 *  3. multi-line with text before closing ''': no indentation
 *  4. multi-line with only whitespace after opening ''' and before closing ''': one level of extra indentation between ''' and '''
 */
class RichStringFormatter {
	@Inject RichStringProcessor richStringProcessor
	@Inject extension NodeModelAccess
	@Inject extension FormattingDataFactory

	def void format((EObject, FormattableDocument)=>void formatter, FormattableDocument doc, RichString richString) {
		if (EcoreUtil2.getContainerOfType(richString.eContainer, RichString) != null)
			return;
		if (richString.hasSyntaxError)
			return;
		val impl = new RichStringToLineModel(_nodeModelAccess, richString)
		richStringProcessor.process(richString, impl, new DefaultIndentationHandler())
		impl.finish()

		//		println()
		//		println("-------------------------")
		//		println(richString.nodeForEObject.text)
		//		println("-------------------------")
		//		println(impl.model)
		//		println("-------------------------")
		fmt(formatter, doc, richString)
		val lines = impl.model.lines
		val canIndent = !lines.empty && lines.last.content.nullOrEmpty
		for (line : lines) {
			if (impl.model.rootIndentLenght > 0) {
				val increaseIndentationChange = if(canIndent && line == lines.head) 1 else 0
				val decraseIndentationChange = if(canIndent && line == lines.last) -1 else 0
				val nloffset = if(line.leadingSemanticNewLine) line.offset + line.newLineCharCount else line.offset
				val i = Math.min(line.indentLength, impl.model.rootIndentLenght)
				val nllength = if(line.leadingSemanticNewLine) i else line.newLineCharCount + i
				if (line.leadingSemanticNewLine)
					doc +=
						new NewLineData(nloffset, nllength, increaseIndentationChange, decraseIndentationChange,
							if(doc.debugConflicts) new RuntimeException, 0)
				else {
					doc +=
						new NewLineData(nloffset, nllength, increaseIndentationChange, decraseIndentationChange,
							if(doc.debugConflicts) new RuntimeException, 1)
				}
				if (!line.chunks.empty) {
					val offset = nloffset + nllength
					val length = line.indentLength - impl.model.rootIndentLenght
					val text = line.chunks.map[chunk|
						switch chunk { SemanticWhitespace: chunk.text TemplateWhitespace: doc.getIndentation(1) }].join
					doc += new WhitespaceData(offset, length, 0, 0, if(doc.debugConflicts) new RuntimeException, text)
				}
			}
		}
	}

	def protected boolean hasSyntaxError(EObject obj) {
		val node = obj.nodeForEObject
		if (node == null || node.syntaxErrorMessage != null)
			return true;
		node.asTreeIterable.exists[syntaxErrorMessage != null]
	}

	def protected dispatch void fmt((EObject, FormattableDocument)=>void formatter, FormattableDocument doc,
		RichString expr) {
		for (e : expr.expressions)
			fmt(formatter, doc, e)
	}

	def protected dispatch void fmt((EObject, FormattableDocument)=>void formatter, FormattableDocument doc,
		RichStringLiteral expr) {
	}

	def protected dispatch void fmt((EObject, FormattableDocument)=>void formatter, FormattableDocument doc, Void expr) {
	}

	def protected dispatch void fmt((EObject, FormattableDocument)=>void formatter, FormattableDocument doc,
		XExpression expr) {
		doc += expr.nodeForEObject.surround[noSpace]
		formatter.apply(expr, doc)
	}
  
	def protected dispatch void fmt((EObject, FormattableDocument)=>void formatter, FormattableDocument doc,
		RichStringIf expr) {
		doc += expr.nodeForKeyword("IF").surround([noSpace], [oneSpace])
		doc += expr.nodeForFeature(RichstringPackage.Literals::RICH_STRING_ELSE_IF__IF).append[noSpace]
		formatter.apply(expr.^if, doc)
		fmt(formatter, doc, expr.then)
		for (elseif : expr.elseIfs)
			fmt(formatter, doc, elseif)
		doc += expr.nodeForKeyword("ELSE").surround[noSpace]
		fmt(formatter, doc, expr.^else)
		doc += expr.nodeForKeyword("ENDIF").surround[noSpace]
	}

	def protected dispatch void fmt((EObject, FormattableDocument)=>void formatter, FormattableDocument doc,
		RichStringElseIf expr) {
		doc += expr.nodeForKeyword("ELSEIF").surround([noSpace], [oneSpace])
		doc += expr.nodeForFeature(RichstringPackage.Literals.RICH_STRING_ELSE_IF__IF).append[noSpace]
		formatter.apply(expr.^if, doc)
	}

	def protected dispatch void fmt((EObject, FormattableDocument)=>void formatter, FormattableDocument doc,
		RichStringForLoop expr) {
		doc += expr.nodeForKeyword("FOR").surround([noSpace], [oneSpace])
		doc += expr.nodeForKeyword(":").surround([oneSpace], [oneSpace])
		formatter.apply(expr.declaredParam, doc)
		formatter.apply(expr.forExpression, doc)
		fmt(formatter, doc, expr.eachExpression)
		doc += expr.nodeForKeyword("BEFORE").surround[oneSpace]
		formatter.apply(expr.before, doc)
		doc += expr.nodeForKeyword("SEPARATOR").surround[oneSpace]
		formatter.apply(expr.separator, doc)
		doc += expr.nodeForKeyword("AFTER").surround[oneSpace]
		formatter.apply(expr.after, doc)
		doc += expr.nodeForFeature(XbasePackage.Literals.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION).prepend[noSpace]
		doc += expr.nodeForKeyword("ENDFOR").surround[noSpace]
	}
}

class RichStringToLineModel extends AbstractRichStringPartAcceptor.ForLoopOnce {
	private val RichString string
	private val String document
	private val NodeModelAccess nodeModelAccess
	@Property val LineModel model = new LineModel
	int offset = - 1
	int contentStartOffset = - 1
	int contentStartColumn = - 1
	private Stack<Chunk> indentationStack = new Stack
	private boolean content = false
	private boolean indentNextLine = false
	private boolean _outdentThisLine = false
	private int lastLiteralEndOffset

	new(NodeModelAccess nodeModelAccess, RichString string) {
		this.nodeModelAccess = nodeModelAccess
		this.string = string
		this.document = nodeModelAccess.nodeForEObject(string).rootNode.text
	}

	def outdentThisLine() {
		if (indentNextLine)
			indentNextLine = false
		else
			_outdentThisLine = true
	}

	def finish() {
		acceptLineBreak(0, false, false)
	}

	def protected literalPrefixLenght(INode node) {
		switch t:node.text {
			case t.startsWith("'''"): 3
			case t.startsWith("��"): 2
			case t.startsWith("�"): 1
			default: 1
		}
	}

	def protected literalPostfixLenght(INode node) {
		switch t:node.text {
			case t.endsWith("'''"): 3
			case t.endsWith('��'): 2
			case t.endsWith("�"): 1
			default: 1
		}
	}

	override announceNextLiteral(RichStringLiteral object) {
		super.announceNextLiteral(object)

		//		println("announceNextLiteral()")
		if (lastLiteralEndOffset > 0 && contentStartOffset < 0)
			contentStartOffset = lastLiteralEndOffset
		val node = nodeModelAccess.nodeForFeature(object, XbasePackage.Literals.XSTRING_LITERAL__VALUE)
		if (node != null) {
			offset = node.offset + node.literalPrefixLenght
			lastLiteralEndOffset = node.endOffset - node.literalPostfixLenght
		}
		content = true
	}

	override acceptSemanticLineBreak(int charCount, RichStringLiteral origin, boolean controlStructureSeen) {
		super.acceptSemanticLineBreak(charCount, origin, controlStructureSeen)

		//		println("acceptSemanticLineBreak()")
		acceptLineBreak(charCount, true, true)
		offset = offset + charCount
	}

	override acceptTemplateLineBreak(int charCount, RichStringLiteral origin) {
		super.acceptTemplateLineBreak(charCount, origin)

		//		println("acceptTemplateLineBreak()")
		acceptLineBreak(charCount, false, true)
		offset = offset + charCount
	}

	def void acceptLineBreak(int charCount, boolean semantic, boolean startNewLine) {
		startContent()
		if (contentStartOffset > 0) {
			val lastLinesContent = document.substring(contentStartOffset, offset)
			if (model.lines.empty) {
				model.leadingText = lastLinesContent
				contentStartColumn = 0
			} else {
				val lastLine = model.lines.last
				lastLine.content = lastLinesContent
				val newContentStartColumn = contentStartOffset - (lastLine.offset + lastLine.newLineCharCount)
				if (lastLine.leadingSemanticNewLine) {
					if (newContentStartColumn > contentStartColumn) {
						val length = newContentStartColumn - contentStartColumn
						val text = document.substring(contentStartOffset - length, contentStartOffset)
						indentationStack.push(new SemanticWhitespace(text, newContentStartColumn))
					}
				}
				if (newContentStartColumn < contentStartColumn)
					for (ws : indentationStack.filter(SemanticWhitespace).toList)
						if (ws.column > newContentStartColumn)
							indentationStack.remove(ws)
				if (_outdentThisLine) {
					if (!indentationStack.empty())
						indentationStack.pop()
					_outdentThisLine = false
				}
				lastLine.indentLength = newContentStartColumn

				// newContentStartColumn is 0 when the line before had a SN and no content -> This shouldn't have impact to a greyspace and should not lead to a increment for the following lines.
				// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=398718
				if (newContentStartColumn != 0)
					contentStartColumn = newContentStartColumn
				model.lines.last.chunks += indentationStack
			}
		}
		if (indentNextLine) {
			indentationStack.push(new TemplateWhitespace(""))
			indentNextLine = false
		}
		contentStartOffset = -1
		content = false
		if (startNewLine)
			model.lines += new Line(offset, semantic, charCount)
	}

	def void startContent() {
		if (!content) {
			contentStartOffset = offset
			content = true
		}
	}

	override acceptSemanticText(CharSequence text, RichStringLiteral origin) {
		super.acceptSemanticText(text, origin)

		//		println('''acceptSemanticText("�text�")''')
		if (!content) {
			if (text.length > 0 &&
				(0 .. (text.length - 1)).fold(false, [v, i|v || !Character.isWhitespace(text.charAt(i))]))
				startContent()
		}
		offset = offset + text.length
	}

	override acceptTemplateText(CharSequence text, RichStringLiteral origin) {
		super.acceptTemplateText(text, origin)

		//		println('''acceptTemplateText("�text�")''')
		if (!content) {
			if (model.rootIndentLenght < 0) {
				model.rootIndentLenght = text.length
				contentStartColumn = text.length
			}
		}
		offset = offset + text.length
	}

	override acceptExpression(XExpression expression, CharSequence indentation) {

		//		println("acceptExpression()")
		super.acceptExpression(expression, indentation)
		startContent()
	}

	override void acceptIfCondition(XExpression condition) {
		super.acceptIfCondition(condition)
		startContent()
		indentNextLine = true
	}

	override void acceptElseIfCondition(XExpression condition) {
		super.acceptElseIfCondition(condition)
		outdentThisLine()
		startContent()
		indentNextLine = true
	}

	override void acceptElse() {
		super.acceptElse()
		outdentThisLine()
		startContent()
		indentNextLine = true
	}

	override void acceptEndIf() {
		super.acceptEndIf()
		outdentThisLine()
		startContent()
	}

	override void acceptForLoop(JvmFormalParameter parameter, XExpression expression) {
		super.acceptForLoop(parameter, expression)
		startContent()
		indentNextLine = true
	}

	override void acceptEndFor(XExpression after, CharSequence indentation) {
		super.acceptEndFor(after, indentation)
		outdentThisLine()
		startContent()
	}
}

class LineModel {
	@Property String leadingText
	@Property int rootIndentLenght = -1
	@Property val List<Line> lines = newArrayList

	override toString() '''
		rootIndentLenght=�rootIndentLenght�
		�leadingText��lines.join�
	'''
}

class Line {
	@Property val int offset
	@Property val boolean leadingSemanticNewLine
	@Property val int newLineCharCount
	@Property val List<Chunk> chunks = newArrayList
	@Property String content
	@Property int indentLength

	new(int offset, boolean leadingSemanticNewLine, int newLineCharCount) {
		this._offset = offset
		this._leadingSemanticNewLine = leadingSemanticNewLine
		this._newLineCharCount = newLineCharCount
	}

	override toString() {
		(if(leadingSemanticNewLine) "SN" else "") + "\n" + chunks.join + content
	}
}

@Data abstract class Chunk {
	CharSequence text

	def int getLength() {
		text.length
	}
}

@Data class TemplateWhitespace extends Chunk {
	override toString() {
		"T" + text.length
	}
}

@Data class SemanticWhitespace extends Chunk {
	int column

	override toString() {
		"S" + text.length
	}
}

@Data class SemanitcText extends Chunk {
	override toString() {
		text.toString
	}
}
///*******************************************************************************
// * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
// *  All rights reserved. This program and the accompanying materials
// *  are made available under the terms of the Eclipse Public License v1.0
// *  which accompanies this distribution, and is available at
// *  http://www.eclipse.org/legal/epl-v10.html
// ******************************************************************************/
///*
// * generated by Xtext
// */
//package org.lunifera.doc.dsl.formatting
//
//
//
//import com.google.inject.Inject
//import org.eclipse.xtext.Keyword
//import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
//import org.eclipse.xtext.formatting.impl.FormattingConfig
//import org.lunifera.doc.dsl.services.LuniferaDocGrammarGrammarAccess
//import org.eclipse.xtext.util.Pair
//
///**
// * This class contains custom formatting description.
// * 
// * see : http://www.eclipse.org/Xtext/documentation.html#formatting
// * on how and when to use it 
// * 
// * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
// */
//class LuniferaDocGrammarFormatter extends AbstractDeclarativeFormatter {
//
//	@Inject extension LuniferaDocGrammarGrammarAccess
//
//	override protected void configureFormatting(FormattingConfig c) {
//		c.setAutoLinewrap(120);
//
//		// preserve newlines around comments
//		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
//		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
//		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
//
//		for (Pair<Keyword, Keyword> pair : findKeywordPairs("«", "»")) {
//			c.setNoSpace().after(pair.first);
//			c.setNoSpace().before(pair.second);
//		}
//
//		for (Pair<Keyword, Keyword> pair : findKeywordPairs("(", ")")) {
//			c.setNoSpace().after(pair.first);
//			c.setNoSpace().before(pair.second);
//		}
//
//		for (Pair<Keyword, Keyword> pair : findKeywordPairs("{", "}")) {
//			c.setIndentationIncrement().after(pair.first)
//			c.setLinewrap(1).after(pair.first)
//			c.setIndentationDecrement().before(pair.second)
//			c.setLinewrap(1).around(pair.second)
//		}
//
//		for (Pair<Keyword, Keyword> pair : findKeywordPairs("'''", "'''")) {
//			c.setIndentationIncrement().after(pair.first)
//			c.setLinewrap(1).after(pair.first)
//			c.setIndentationDecrement().before(pair.second)
//			c.setLinewrap(1).around(pair.second)
//		}
//
//		// LAYOUTS
//		// DOCUMENTS
//		// FORMATTING/RICHSTRINGS
//		// h1
//		c.setNoSpace().around(richStringH1Access.h1Keyword_1)
//		c.setNoSpace().around(richStringH1Access.h1Keyword_3)
//
//		// h2
//		c.setNoSpace().around(richStringH2Access.h2Keyword_1)
//		c.setNoSpace().around(richStringH2Access.h2Keyword_3)
//
//		// h3
//		c.setNoSpace().around(richStringH3Access.h3Keyword_1)
//		c.setNoSpace().around(richStringH3Access.h3Keyword_3)
//
//		// h4
//		c.setNoSpace().around(richStringH4Access.h4Keyword_1)
//		c.setNoSpace().around(richStringH4Access.h4Keyword_3)
//
//		// h5
//		c.setNoSpace().around(richStringH5Access.h5Keyword_1)
//		c.setNoSpace().around(richStringH5Access.h5Keyword_3)
//
//		// h6
//		c.setNoSpace().around(richStringH6Access.h6Keyword_1)
//		c.setNoSpace().around(richStringH6Access.h6Keyword_3)
//
//		// chapter
//		c.setNoSpace().before(richStringChapterAccess.chapterKeyword_1)
//		c.setNoSpace().before(richStringChapterAccess.expressionAssignment_3)
//		c.setIndentationIncrement().after(richStringChapterAccess.expressionInternalRichStringParserRuleCall_3_0)
//		c.setIndentationIncrement().before(richStringChapterAccess.expressionInternalRichStringParserRuleCall_3_0)
//		c.setNoSpace().around(richStringChapterAccess.chapterKeyword_4)
//		c.setIndentationDecrement().before(richStringChapterAccess.chapterKeyword_4)
//
//		// section
//		c.setNoSpace().before(richStringSectionAccess.sectionKeyword_1)
//		c.setNoSpace().before(richStringSectionAccess.expressionAssignment_3)
//		c.setIndentationIncrement().after(richStringSectionAccess.sectionKeyword_1)
//		c.setNoSpace().around(richStringSectionAccess.sectionKeyword_4)
//		c.setIndentationDecrement().before(richStringSectionAccess.sectionKeyword_4)
//
//		// subsection
//		c.setNoSpace().before(richStringSubsectionAccess.subsectionKeyword_1)
//		c.setNoSpace().before(richStringSubsectionAccess.expressionAssignment_3)
//		c.setIndentationIncrement().after(richStringSubsectionAccess.subsectionKeyword_1)
//		c.setNoSpace().around(richStringSubsectionAccess.subsectionKeyword_4)
//		c.setIndentationDecrement().before(richStringSubsectionAccess.subsectionKeyword_4)
//
//		// URL
//		c.setNoSpace().before(richStringURLAccess.urlKeyword_1)
//		c.setNoSpace().before(richStringURLAccess.locationAssignment_2)
//		c.setNoSpace().around(richStringURLAccess.urlKeyword_4)
//
//		// Ref
//		c.setNoSpace().before(richStringRefAccess.refKeyword_1)
//		c.setNoSpace().before(richStringRefAccess.refIdAssignment_2)
//		c.setNoSpace().around(richStringRefAccess.refKeyword_4)
//
//		// bold
//		c.setNoSpace().around(richStringBoldAccess.BKeyword_1)
//		c.setNoSpace().around(richStringBoldAccess.BKeyword_3)
//
//		// italic
//		c.setNoSpace().around(richStringItalicAccess.IKeyword_1)
//		c.setNoSpace().around(richStringItalicAccess.IKeyword_3)
//
//		// underline
//		c.setNoSpace().around(richStringUnderlineAccess.UKeyword_1)
//		c.setNoSpace().around(richStringUnderlineAccess.UKeyword_3)
//
//		// img
//		c.setNoSpace().before(richStringImgAccess.imgKeyword_1)
//		c.setNoSpace().around(richStringImgAccess.imgKeyword_10_1_1)
//
//		// mailto
//		c.setNoSpace().before(richStringMailtoAccess.mailtoKeyword_1)
//		c.setNoSpace().around(richStringMailtoAccess.mailtoKeyword_4)
//
//		// skype
//		c.setNoSpace().before(richStringSkypeAccess.skypeKeyword_1)
//		c.setNoSpace().around(richStringSkypeAccess.skypeKeyword_4)
//
//		// movie
//		c.setNoSpace().before(richStringMovieAccess.movieKeyword_1)
//		c.setNoSpace().before(richStringMovieAccess.srcAssignment_3)
//		c.setNoSpace().before(richStringMovieAccess.typeAssignment_5)
//		c.setNoSpace().before(richStringMovieAccess.widthAssignment_7)
//		c.setNoSpace().before(richStringMovieAccess.heightAssignment_9)
//		c.setNoSpace().around(richStringMovieAccess.movieKeyword_1)
//		c.setNoSpace().around(richStringMovieAccess.movieKeyword_10_1_1)
//
//		// code
//		c.setNoSpace().before(richStringCodeAccess.codeKeyword_1)
//		c.setNoSpace().around(richStringCodeAccess.codeKeyword_4)
//
//		// example
//		c.setNoSpace().around(richStringExampleAccess.exampleKeyword_1)
//		c.setNoSpace().around(richStringExampleAccess.exampleKeyword_3)
//
//		// table
//		c.setNoSpace().around(richStringTableAccess.tableKeyword_1)
//		c.setNoSpace().around(richStringTableAccess.tableKeyword_3)
//
//		// table row
//		c.setNoSpace().around(richStringTableRowAccess.rowKeyword_1)
//		c.setNoSpace().around(richStringTableRowAccess.rowKeyword_3)
//
//		// table date (column)
//		c.setNoSpace().around(richStringTableDataAccess.columnKeyword_1)
//		c.setNoSpace().around(richStringTableDataAccess.columnKeyword_3)
//
//		// open view
//		c.setNoSpace().around(richStringOpenViewAccess.openviewKeyword_1)
//		c.setNoSpace().around(richStringOpenViewAccess.openviewKeyword_4)
//
//		// start process
//		c.setNoSpace().around(richStringStartProcessAccess.startprocessKeyword_1)
//		c.setNoSpace().around(richStringStartProcessAccess.startprocessKeyword_4)
//
//		// entity ref
//		c.setNoSpace().around(richStringEntityRefAccess.entityRefKeyword_1)
//		c.setNoSpace().around(richStringEntityRefAccess.entityRefKeyword_4)
//
//		// dto ref
//		c.setNoSpace().before(richStringDTORefAccess.dtoRefKeyword_1)
//		c.setNoSpace().around(richStringDTORefAccess.dtoRefKeyword_4)
//
//		// process ref
//		c.setNoSpace().before(richStringProcessRefAccess.processRefKeyword_1)
//		c.setNoSpace().around(richStringProcessRefAccess.processRefKeyword_4)
//
//		// task ref
//		c.setNoSpace().before(richStringTaskRefAccess.taskRefKeyword_1)
//		c.setNoSpace().around(richStringTaskRefAccess.taskRefKeyword_4)
//
//		// view ref
//		c.setNoSpace().before(richStringViewRefAccess.viewRefKeyword_1)
//		c.setNoSpace().around(richStringViewRefAccess.viewRefKeyword_4)
//
//		// ui ref
//		c.setNoSpace().before(richStringUIRefAccess.uiRefKeyword_1)
//		c.setNoSpace().around(richStringUIRefAccess.uiRefKeyword_4)
//
//		// unordered list
//		c.setNoSpace().around(richStringListAccess.ulKeyword_1)
//		c.setIndentationIncrement().after(richStringListAccess.ulKeyword_1)
//		c.setNoSpace().around(richStringListAccess.ulKeyword_3)
//		c.setIndentationDecrement().before(richStringListAccess.ulKeyword_3)
//
//		// ordered list
//		c.setNoSpace().around(richStringOrderedListAccess.olKeyword_1)
//		c.setIndentationIncrement().after(richStringOrderedListAccess.olKeyword_1)
//		c.setNoSpace().around(richStringOrderedListAccess.olKeyword_3)
//		c.setIndentationDecrement().before(richStringOrderedListAccess.olKeyword_3)
//
//		// list element
//		c.setNoSpace().around(richStringListElementAccess.liKeyword_1)
//		c.setNoSpace().around(richStringListElementAccess.liKeyword_3)
//
//		// span/style
//		c.setNoSpace().before(richStringSpanAccess.styleKeyword_1)
//		c.setNoSpace().around(richStringSpanAccess.styleKeyword_4)
//
//	}
//}
