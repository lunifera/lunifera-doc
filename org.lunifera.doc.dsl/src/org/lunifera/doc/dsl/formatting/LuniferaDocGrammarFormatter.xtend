/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
/*
 * generated by Xtext
 */
package org.lunifera.doc.dsl.formatting

import com.google.inject.Inject
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
import org.lunifera.doc.dsl.services.LuniferaDocGrammarGrammarAccess
import org.eclipse.xtext.util.Pair

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class LuniferaDocGrammarFormatter extends AbstractDeclarativeFormatter {

	@Inject extension LuniferaDocGrammarGrammarAccess

	override protected void configureFormatting(FormattingConfig c) {
		c.setAutoLinewrap(120);

		// preserve newlines around comments
		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)

		for (Pair<Keyword, Keyword> pair : findKeywordPairs("«", "»")) {
			c.setNoSpace().after(pair.first);
			c.setNoSpace().before(pair.second);
		}
		
		for (Pair<Keyword, Keyword> pair : findKeywordPairs("(", ")")) {
			c.setNoSpace().after(pair.first);
			c.setNoSpace().before(pair.second);
		}
		
		for (Pair<Keyword, Keyword> pair : findKeywordPairs("{", "}")) {
			c.setIndentationIncrement().after(pair.first)
			c.setLinewrap(1).after(pair.first)
			c.setIndentationDecrement().before(pair.second)
			c.setLinewrap(1).around(pair.second)
		}
		
		for (Pair<Keyword, Keyword> pair : findKeywordPairs("'''", "'''")) {
			c.setIndentationIncrement().after(pair.first)
			c.setLinewrap(1).after(pair.first)
			c.setIndentationDecrement().before(pair.second)
			c.setLinewrap(1).around(pair.second)
		}
		
		// LAYOUTS
		
		// DOCUMENTS
		
		// FORMATTING/RICHSTRINGS
		
		// h1
		c.setNoSpace().around(richStringH1Access.h1Keyword_1)
		c.setNoSpace().around(richStringH1Access.h1Keyword_3)
		
		// h2
		c.setNoSpace().around(richStringH2Access.h2Keyword_1)
		c.setNoSpace().around(richStringH2Access.h2Keyword_3)
		
		// h3
		c.setNoSpace().around(richStringH3Access.h3Keyword_1)
		c.setNoSpace().around(richStringH3Access.h3Keyword_3)
		
		// h4
		c.setNoSpace().around(richStringH4Access.h4Keyword_1)
		c.setNoSpace().around(richStringH4Access.h4Keyword_3)
		
		// h5
		c.setNoSpace().around(richStringH5Access.h5Keyword_1)
		c.setNoSpace().around(richStringH5Access.h5Keyword_3)
		
		// h6
		c.setNoSpace().around(richStringH6Access.h6Keyword_1)
		c.setNoSpace().around(richStringH6Access.h6Keyword_3)
		
		// chapter
		c.setNoSpace().before(richStringChapterAccess.chapterKeyword_1)
		c.setNoSpace().around(richStringChapterAccess.chapterKeyword_4)
		
		// section
		c.setNoSpace().before(richStringSectionAccess.sectionKeyword_1)
		c.setNoSpace().around(richStringSectionAccess.sectionKeyword_4)
		
		// subsection
		c.setNoSpace().before(richStringSubsectionAccess.subsectionKeyword_1)
		c.setNoSpace().around(richStringSubsectionAccess.subsectionKeyword_4)
		
		// URL
		c.setNoSpace().before(richStringURLAccess.urlKeyword_1)
		c.setNoSpace().before(richStringURLAccess.locationAssignment_2)
		c.setNoSpace().around(richStringURLAccess.urlKeyword_4)
		
		// Ref
		c.setNoSpace().before(richStringRefAccess.refKeyword_1)
		c.setNoSpace().before(richStringRefAccess.refIdAssignment_2)
		c.setNoSpace().around(richStringRefAccess.refKeyword_4)
		
		// bold
		c.setNoSpace().around(richStringBoldAccess.BKeyword_1)
		c.setNoSpace().around(richStringBoldAccess.BKeyword_3)
		
		// italic
		c.setNoSpace().around(richStringItalicAccess.IKeyword_1)
		c.setNoSpace().around(richStringItalicAccess.IKeyword_3)
		
		// underline
		c.setNoSpace().around(richStringUnderlineAccess.UKeyword_1)
		c.setNoSpace().around(richStringUnderlineAccess.UKeyword_3)
		
		// img
		c.setNoSpace().before(richStringImgAccess.imgKeyword_1)
		
		// mailto
		c.setNoSpace().before(richStringMailtoAccess.mailtoKeyword_1)
		c.setNoSpace().around(richStringMailtoAccess.mailtoKeyword_4)
		
		// skype
		c.setNoSpace().before(richStringSkypeAccess.skypeKeyword_1)
		c.setNoSpace().around(richStringSkypeAccess.skypeKeyword_4)
		
		// movie
		c.setNoSpace().before(richStringMovieAccess.movieKeyword_1)
		c.setNoSpace().before(richStringMovieAccess.srcAssignment_3)
		c.setNoSpace().before(richStringMovieAccess.typeAssignment_5)
		c.setNoSpace().before(richStringMovieAccess.widthAssignment_7)
		c.setNoSpace().before(richStringMovieAccess.heightAssignment_9)
		c.setNoSpace().around(richStringMovieAccess.movieKeyword_11)
		
		// code
		c.setNoSpace().before(richStringCodeAccess.codeKeyword_1)
		c.setNoSpace().around(richStringCodeAccess.codeKeyword_4)
		
		// example
		c.setNoSpace().around(richStringExampleAccess.exampleKeyword_1)
		c.setNoSpace().around(richStringExampleAccess.exampleKeyword_3)
		
		// table
		c.setNoSpace().around(richStringTableAccess.tableKeyword_1)
		c.setNoSpace().around(richStringTableAccess.tableKeyword_3)
		
		// table row
		c.setNoSpace().around(richStringTableRowAccess.rowKeyword_1)
		c.setNoSpace().around(richStringTableRowAccess.rowKeyword_3)
		
		// table date (column)
		c.setNoSpace().around(richStringTableCellAccess.cellKeyword_1)
		c.setNoSpace().around(richStringTableCellAccess.cellKeyword_3)
		
		// open view
		c.setNoSpace().around(richStringOpenViewAccess.openviewKeyword_1)
		c.setNoSpace().around(richStringOpenViewAccess.openviewKeyword_4)
		
		// start process
		c.setNoSpace().around(richStringStartProcessAccess.startprocessKeyword_1)
		c.setNoSpace().around(richStringStartProcessAccess.startprocessKeyword_4)
		
		// entity ref
		c.setNoSpace().around(richStringEntityRefAccess.entityRefKeyword_1)
		c.setNoSpace().around(richStringEntityRefAccess.entityRefKeyword_4)
		
		// dto ref
		c.setNoSpace().before(richStringDTORefAccess.dtoRefKeyword_1)
		c.setNoSpace().around(richStringDTORefAccess.dtoRefKeyword_4)
		
		// process ref
		c.setNoSpace().before(richStringProcessRefAccess.processRefKeyword_1)
		c.setNoSpace().around(richStringProcessRefAccess.processRefKeyword_4)
		
		// task ref
		c.setNoSpace().before(richStringTaskRefAccess.taskRefKeyword_1)
		c.setNoSpace().around(richStringTaskRefAccess.taskRefKeyword_4)
		
		// view ref
		c.setNoSpace().before(richStringViewRefAccess.viewRefKeyword_1)
		c.setNoSpace().around(richStringViewRefAccess.viewRefKeyword_4)
		
		// ui ref
		c.setNoSpace().before(richStringUIRefAccess.uiRefKeyword_1)
		c.setNoSpace().around(richStringUIRefAccess.uiRefKeyword_4)
		
		// unordered list
		c.setNoSpace().around(richStringListAccess.ulKeyword_1)
		c.setNoSpace().around(richStringListAccess.ulKeyword_3)
		
		// ordered list
		c.setNoSpace().around(richStringOrderedListAccess.olKeyword_1)
		c.setNoSpace().around(richStringOrderedListAccess.olKeyword_3)
		
		// list element
		c.setNoSpace().around(richStringListElementAccess.liKeyword_1)
		c.setNoSpace().around(richStringListElementAccess.liKeyword_3)
		
		// span/style
		c.setNoSpace().before(richStringSpanAccess.styleKeyword_1)
		c.setNoSpace().around(richStringSpanAccess.styleKeyword_4)
		
		
	}
}
