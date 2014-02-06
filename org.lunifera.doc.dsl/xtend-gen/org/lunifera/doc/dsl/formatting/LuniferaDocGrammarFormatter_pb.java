/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.formatting;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.Extension;
import org.lunifera.doc.dsl.services.LuniferaDocGrammarGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class LuniferaDocGrammarFormatter_pb extends AbstractDeclarativeFormatter {
  @Inject
  @Extension
  private LuniferaDocGrammarGrammarAccess _luniferaDocGrammarGrammarAccess;
  
  protected void configureFormatting(final FormattingConfig c) {
    c.setAutoLinewrap(120);
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this._luniferaDocGrammarGrammarAccess.getSL_COMMENTRule();
    _setLinewrap.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this._luniferaDocGrammarGrammarAccess.getML_COMMENTRule();
    _setLinewrap_1.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this._luniferaDocGrammarGrammarAccess.getML_COMMENTRule();
    _setLinewrap_2.after(_mL_COMMENTRule_1);
    List<Pair<Keyword,Keyword>> _findKeywordPairs = this._luniferaDocGrammarGrammarAccess.findKeywordPairs("«", "»");
    for (final Pair<Keyword,Keyword> pair : _findKeywordPairs) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first = pair.getFirst();
        _setNoSpace.after(_first);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _second = pair.getSecond();
        _setNoSpace_1.before(_second);
      }
    }
    List<Pair<Keyword,Keyword>> _findKeywordPairs_1 = this._luniferaDocGrammarGrammarAccess.findKeywordPairs("(", ")");
    for (final Pair<Keyword,Keyword> pair_1 : _findKeywordPairs_1) {
      {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first = pair_1.getFirst();
        _setNoSpace.after(_first);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _second = pair_1.getSecond();
        _setNoSpace_1.before(_second);
      }
    }
    List<Pair<Keyword,Keyword>> _findKeywordPairs_2 = this._luniferaDocGrammarGrammarAccess.findKeywordPairs("{", "}");
    for (final Pair<Keyword,Keyword> pair_2 : _findKeywordPairs_2) {
      {
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement = c.setIndentationIncrement();
        Keyword _first = pair_2.getFirst();
        _setIndentationIncrement.after(_first);
        FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap(1);
        Keyword _first_1 = pair_2.getFirst();
        _setLinewrap_3.after(_first_1);
        FormattingConfig.IndentationLocatorEnd _setIndentationDecrement = c.setIndentationDecrement();
        Keyword _second = pair_2.getSecond();
        _setIndentationDecrement.before(_second);
        FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap(1);
        Keyword _second_1 = pair_2.getSecond();
        _setLinewrap_4.around(_second_1);
      }
    }
    List<Pair<Keyword,Keyword>> _findKeywordPairs_3 = this._luniferaDocGrammarGrammarAccess.findKeywordPairs("\'\'\'", "\'\'\'");
    for (final Pair<Keyword,Keyword> pair_3 : _findKeywordPairs_3) {
      {
        FormattingConfig.IndentationLocatorStart _setIndentationIncrement = c.setIndentationIncrement();
        Keyword _first = pair_3.getFirst();
        _setIndentationIncrement.after(_first);
        FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap(1);
        Keyword _first_1 = pair_3.getFirst();
        _setLinewrap_3.after(_first_1);
        FormattingConfig.IndentationLocatorEnd _setIndentationDecrement = c.setIndentationDecrement();
        Keyword _second = pair_3.getSecond();
        _setIndentationDecrement.before(_second);
        FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap(1);
        Keyword _second_1 = pair_3.getSecond();
        _setLinewrap_4.around(_second_1);
      }
    }
    FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH1Elements _richStringH1Access = this._luniferaDocGrammarGrammarAccess.getRichStringH1Access();
    Keyword _h1Keyword_1 = _richStringH1Access.getH1Keyword_1();
    _setNoSpace.around(_h1Keyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH1Elements _richStringH1Access_1 = this._luniferaDocGrammarGrammarAccess.getRichStringH1Access();
    Keyword _h1Keyword_3 = _richStringH1Access_1.getH1Keyword_3();
    _setNoSpace_1.around(_h1Keyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH2Elements _richStringH2Access = this._luniferaDocGrammarGrammarAccess.getRichStringH2Access();
    Keyword _h2Keyword_1 = _richStringH2Access.getH2Keyword_1();
    _setNoSpace_2.around(_h2Keyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_3 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH2Elements _richStringH2Access_1 = this._luniferaDocGrammarGrammarAccess.getRichStringH2Access();
    Keyword _h2Keyword_3 = _richStringH2Access_1.getH2Keyword_3();
    _setNoSpace_3.around(_h2Keyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_4 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH3Elements _richStringH3Access = this._luniferaDocGrammarGrammarAccess.getRichStringH3Access();
    Keyword _h3Keyword_1 = _richStringH3Access.getH3Keyword_1();
    _setNoSpace_4.around(_h3Keyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_5 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH3Elements _richStringH3Access_1 = this._luniferaDocGrammarGrammarAccess.getRichStringH3Access();
    Keyword _h3Keyword_3 = _richStringH3Access_1.getH3Keyword_3();
    _setNoSpace_5.around(_h3Keyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_6 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH4Elements _richStringH4Access = this._luniferaDocGrammarGrammarAccess.getRichStringH4Access();
    Keyword _h4Keyword_1 = _richStringH4Access.getH4Keyword_1();
    _setNoSpace_6.around(_h4Keyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_7 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH4Elements _richStringH4Access_1 = this._luniferaDocGrammarGrammarAccess.getRichStringH4Access();
    Keyword _h4Keyword_3 = _richStringH4Access_1.getH4Keyword_3();
    _setNoSpace_7.around(_h4Keyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_8 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH5Elements _richStringH5Access = this._luniferaDocGrammarGrammarAccess.getRichStringH5Access();
    Keyword _h5Keyword_1 = _richStringH5Access.getH5Keyword_1();
    _setNoSpace_8.around(_h5Keyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_9 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH5Elements _richStringH5Access_1 = this._luniferaDocGrammarGrammarAccess.getRichStringH5Access();
    Keyword _h5Keyword_3 = _richStringH5Access_1.getH5Keyword_3();
    _setNoSpace_9.around(_h5Keyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_10 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH6Elements _richStringH6Access = this._luniferaDocGrammarGrammarAccess.getRichStringH6Access();
    Keyword _h6Keyword_1 = _richStringH6Access.getH6Keyword_1();
    _setNoSpace_10.around(_h6Keyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_11 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringH6Elements _richStringH6Access_1 = this._luniferaDocGrammarGrammarAccess.getRichStringH6Access();
    Keyword _h6Keyword_3 = _richStringH6Access_1.getH6Keyword_3();
    _setNoSpace_11.around(_h6Keyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_12 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringChapterElements _richStringChapterAccess = this._luniferaDocGrammarGrammarAccess.getRichStringChapterAccess();
    Keyword _chapterKeyword_1 = _richStringChapterAccess.getChapterKeyword_1();
    _setNoSpace_12.before(_chapterKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_13 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringChapterElements _richStringChapterAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringChapterAccess();
    Keyword _chapterKeyword_4 = _richStringChapterAccess_1.getChapterKeyword_4();
    _setNoSpace_13.around(_chapterKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_14 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSectionElements _richStringSectionAccess = this._luniferaDocGrammarGrammarAccess.getRichStringSectionAccess();
    Keyword _sectionKeyword_1 = _richStringSectionAccess.getSectionKeyword_1();
    _setNoSpace_14.before(_sectionKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_15 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSectionElements _richStringSectionAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringSectionAccess();
    Keyword _sectionKeyword_4 = _richStringSectionAccess_1.getSectionKeyword_4();
    _setNoSpace_15.around(_sectionKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_16 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSubsectionElements _richStringSubsectionAccess = this._luniferaDocGrammarGrammarAccess.getRichStringSubsectionAccess();
    Keyword _subsectionKeyword_1 = _richStringSubsectionAccess.getSubsectionKeyword_1();
    _setNoSpace_16.before(_subsectionKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_17 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSubsectionElements _richStringSubsectionAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringSubsectionAccess();
    Keyword _subsectionKeyword_4 = _richStringSubsectionAccess_1.getSubsectionKeyword_4();
    _setNoSpace_17.around(_subsectionKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_18 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringURLElements _richStringURLAccess = this._luniferaDocGrammarGrammarAccess.getRichStringURLAccess();
    Keyword _urlKeyword_1 = _richStringURLAccess.getUrlKeyword_1();
    _setNoSpace_18.before(_urlKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_19 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringURLElements _richStringURLAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringURLAccess();
    Assignment _locationAssignment_2 = _richStringURLAccess_1.getLocationAssignment_2();
    _setNoSpace_19.before(_locationAssignment_2);
    FormattingConfig.NoSpaceLocator _setNoSpace_20 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringURLElements _richStringURLAccess_2 = this._luniferaDocGrammarGrammarAccess.getRichStringURLAccess();
    Keyword _urlKeyword_4 = _richStringURLAccess_2.getUrlKeyword_4();
    _setNoSpace_20.around(_urlKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_21 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringRefElements _richStringRefAccess = this._luniferaDocGrammarGrammarAccess.getRichStringRefAccess();
    Keyword _refKeyword_1 = _richStringRefAccess.getRefKeyword_1();
    _setNoSpace_21.before(_refKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_22 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringRefElements _richStringRefAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringRefAccess();
    Assignment _refIdAssignment_2 = _richStringRefAccess_1.getRefIdAssignment_2();
    _setNoSpace_22.before(_refIdAssignment_2);
    FormattingConfig.NoSpaceLocator _setNoSpace_23 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringRefElements _richStringRefAccess_2 = this._luniferaDocGrammarGrammarAccess.getRichStringRefAccess();
    Keyword _refKeyword_4 = _richStringRefAccess_2.getRefKeyword_4();
    _setNoSpace_23.around(_refKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_24 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringBoldElements _richStringBoldAccess = this._luniferaDocGrammarGrammarAccess.getRichStringBoldAccess();
    Keyword _bKeyword_1 = _richStringBoldAccess.getBKeyword_1();
    _setNoSpace_24.around(_bKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_25 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringBoldElements _richStringBoldAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringBoldAccess();
    Keyword _bKeyword_3 = _richStringBoldAccess_1.getBKeyword_3();
    _setNoSpace_25.around(_bKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_26 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringItalicElements _richStringItalicAccess = this._luniferaDocGrammarGrammarAccess.getRichStringItalicAccess();
    Keyword _iKeyword_1 = _richStringItalicAccess.getIKeyword_1();
    _setNoSpace_26.around(_iKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_27 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringItalicElements _richStringItalicAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringItalicAccess();
    Keyword _iKeyword_3 = _richStringItalicAccess_1.getIKeyword_3();
    _setNoSpace_27.around(_iKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_28 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringUnderlineElements _richStringUnderlineAccess = this._luniferaDocGrammarGrammarAccess.getRichStringUnderlineAccess();
    Keyword _uKeyword_1 = _richStringUnderlineAccess.getUKeyword_1();
    _setNoSpace_28.around(_uKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_29 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringUnderlineElements _richStringUnderlineAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringUnderlineAccess();
    Keyword _uKeyword_3 = _richStringUnderlineAccess_1.getUKeyword_3();
    _setNoSpace_29.around(_uKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_30 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringImgElements _richStringImgAccess = this._luniferaDocGrammarGrammarAccess.getRichStringImgAccess();
    Keyword _imgKeyword_1 = _richStringImgAccess.getImgKeyword_1();
    _setNoSpace_30.before(_imgKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_31 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMailtoElements _richStringMailtoAccess = this._luniferaDocGrammarGrammarAccess.getRichStringMailtoAccess();
    Keyword _mailtoKeyword_1 = _richStringMailtoAccess.getMailtoKeyword_1();
    _setNoSpace_31.before(_mailtoKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_32 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMailtoElements _richStringMailtoAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringMailtoAccess();
    Keyword _mailtoKeyword_4 = _richStringMailtoAccess_1.getMailtoKeyword_4();
    _setNoSpace_32.around(_mailtoKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_33 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSkypeElements _richStringSkypeAccess = this._luniferaDocGrammarGrammarAccess.getRichStringSkypeAccess();
    Keyword _skypeKeyword_1 = _richStringSkypeAccess.getSkypeKeyword_1();
    _setNoSpace_33.before(_skypeKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_34 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSkypeElements _richStringSkypeAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringSkypeAccess();
    Keyword _skypeKeyword_4 = _richStringSkypeAccess_1.getSkypeKeyword_4();
    _setNoSpace_34.around(_skypeKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_35 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMovieElements _richStringMovieAccess = this._luniferaDocGrammarGrammarAccess.getRichStringMovieAccess();
    Keyword _movieKeyword_1 = _richStringMovieAccess.getMovieKeyword_1();
    _setNoSpace_35.before(_movieKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_36 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMovieElements _richStringMovieAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringMovieAccess();
    Assignment _srcAssignment_3 = _richStringMovieAccess_1.getSrcAssignment_3();
    _setNoSpace_36.before(_srcAssignment_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_37 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMovieElements _richStringMovieAccess_2 = this._luniferaDocGrammarGrammarAccess.getRichStringMovieAccess();
    Assignment _typeAssignment_5 = _richStringMovieAccess_2.getTypeAssignment_5();
    _setNoSpace_37.before(_typeAssignment_5);
    FormattingConfig.NoSpaceLocator _setNoSpace_38 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMovieElements _richStringMovieAccess_3 = this._luniferaDocGrammarGrammarAccess.getRichStringMovieAccess();
    Assignment _widthAssignment_7 = _richStringMovieAccess_3.getWidthAssignment_7();
    _setNoSpace_38.before(_widthAssignment_7);
    FormattingConfig.NoSpaceLocator _setNoSpace_39 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMovieElements _richStringMovieAccess_4 = this._luniferaDocGrammarGrammarAccess.getRichStringMovieAccess();
    Assignment _heightAssignment_9 = _richStringMovieAccess_4.getHeightAssignment_9();
    _setNoSpace_39.before(_heightAssignment_9);
    FormattingConfig.NoSpaceLocator _setNoSpace_40 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringMovieElements _richStringMovieAccess_5 = this._luniferaDocGrammarGrammarAccess.getRichStringMovieAccess();
    Keyword _movieKeyword_11 = _richStringMovieAccess_5.getMovieKeyword_11();
    _setNoSpace_40.around(_movieKeyword_11);
    FormattingConfig.NoSpaceLocator _setNoSpace_41 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringCodeElements _richStringCodeAccess = this._luniferaDocGrammarGrammarAccess.getRichStringCodeAccess();
    Keyword _codeKeyword_1 = _richStringCodeAccess.getCodeKeyword_1();
    _setNoSpace_41.before(_codeKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_42 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringCodeElements _richStringCodeAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringCodeAccess();
    Keyword _codeKeyword_4 = _richStringCodeAccess_1.getCodeKeyword_4();
    _setNoSpace_42.around(_codeKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_43 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringExampleElements _richStringExampleAccess = this._luniferaDocGrammarGrammarAccess.getRichStringExampleAccess();
    Keyword _exampleKeyword_1 = _richStringExampleAccess.getExampleKeyword_1();
    _setNoSpace_43.around(_exampleKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_44 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringExampleElements _richStringExampleAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringExampleAccess();
    Keyword _exampleKeyword_3 = _richStringExampleAccess_1.getExampleKeyword_3();
    _setNoSpace_44.around(_exampleKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_45 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTableElements _richStringTableAccess = this._luniferaDocGrammarGrammarAccess.getRichStringTableAccess();
    Keyword _tableKeyword_1 = _richStringTableAccess.getTableKeyword_1();
    _setNoSpace_45.around(_tableKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_46 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTableElements _richStringTableAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringTableAccess();
    Keyword _tableKeyword_3 = _richStringTableAccess_1.getTableKeyword_3();
    _setNoSpace_46.around(_tableKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_47 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTableRowElements _richStringTableRowAccess = this._luniferaDocGrammarGrammarAccess.getRichStringTableRowAccess();
    Keyword _rowKeyword_1 = _richStringTableRowAccess.getRowKeyword_1();
    _setNoSpace_47.around(_rowKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_48 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTableRowElements _richStringTableRowAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringTableRowAccess();
    Keyword _rowKeyword_3 = _richStringTableRowAccess_1.getRowKeyword_3();
    _setNoSpace_48.around(_rowKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_49 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTableCellElements _richStringTableCellAccess = this._luniferaDocGrammarGrammarAccess.getRichStringTableCellAccess();
    Keyword _cellKeyword_1 = _richStringTableCellAccess.getCellKeyword_1();
    _setNoSpace_49.around(_cellKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_50 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTableCellElements _richStringTableCellAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringTableCellAccess();
    Keyword _cellKeyword_3 = _richStringTableCellAccess_1.getCellKeyword_3();
    _setNoSpace_50.around(_cellKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_51 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringOpenViewElements _richStringOpenViewAccess = this._luniferaDocGrammarGrammarAccess.getRichStringOpenViewAccess();
    Keyword _openviewKeyword_1 = _richStringOpenViewAccess.getOpenviewKeyword_1();
    _setNoSpace_51.around(_openviewKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_52 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringOpenViewElements _richStringOpenViewAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringOpenViewAccess();
    Keyword _openviewKeyword_4 = _richStringOpenViewAccess_1.getOpenviewKeyword_4();
    _setNoSpace_52.around(_openviewKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_53 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringStartProcessElements _richStringStartProcessAccess = this._luniferaDocGrammarGrammarAccess.getRichStringStartProcessAccess();
    Keyword _startprocessKeyword_1 = _richStringStartProcessAccess.getStartprocessKeyword_1();
    _setNoSpace_53.around(_startprocessKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_54 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringStartProcessElements _richStringStartProcessAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringStartProcessAccess();
    Keyword _startprocessKeyword_4 = _richStringStartProcessAccess_1.getStartprocessKeyword_4();
    _setNoSpace_54.around(_startprocessKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_55 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringEntityRefElements _richStringEntityRefAccess = this._luniferaDocGrammarGrammarAccess.getRichStringEntityRefAccess();
    Keyword _entityRefKeyword_1 = _richStringEntityRefAccess.getEntityRefKeyword_1();
    _setNoSpace_55.around(_entityRefKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_56 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringEntityRefElements _richStringEntityRefAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringEntityRefAccess();
    Keyword _entityRefKeyword_4 = _richStringEntityRefAccess_1.getEntityRefKeyword_4();
    _setNoSpace_56.around(_entityRefKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_57 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringDTORefElements _richStringDTORefAccess = this._luniferaDocGrammarGrammarAccess.getRichStringDTORefAccess();
    Keyword _dtoRefKeyword_1 = _richStringDTORefAccess.getDtoRefKeyword_1();
    _setNoSpace_57.before(_dtoRefKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_58 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringDTORefElements _richStringDTORefAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringDTORefAccess();
    Keyword _dtoRefKeyword_4 = _richStringDTORefAccess_1.getDtoRefKeyword_4();
    _setNoSpace_58.around(_dtoRefKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_59 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringProcessRefElements _richStringProcessRefAccess = this._luniferaDocGrammarGrammarAccess.getRichStringProcessRefAccess();
    Keyword _processRefKeyword_1 = _richStringProcessRefAccess.getProcessRefKeyword_1();
    _setNoSpace_59.before(_processRefKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_60 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringProcessRefElements _richStringProcessRefAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringProcessRefAccess();
    Keyword _processRefKeyword_4 = _richStringProcessRefAccess_1.getProcessRefKeyword_4();
    _setNoSpace_60.around(_processRefKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_61 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTaskRefElements _richStringTaskRefAccess = this._luniferaDocGrammarGrammarAccess.getRichStringTaskRefAccess();
    Keyword _taskRefKeyword_1 = _richStringTaskRefAccess.getTaskRefKeyword_1();
    _setNoSpace_61.before(_taskRefKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_62 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringTaskRefElements _richStringTaskRefAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringTaskRefAccess();
    Keyword _taskRefKeyword_4 = _richStringTaskRefAccess_1.getTaskRefKeyword_4();
    _setNoSpace_62.around(_taskRefKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_63 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringViewRefElements _richStringViewRefAccess = this._luniferaDocGrammarGrammarAccess.getRichStringViewRefAccess();
    Keyword _viewRefKeyword_1 = _richStringViewRefAccess.getViewRefKeyword_1();
    _setNoSpace_63.before(_viewRefKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_64 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringViewRefElements _richStringViewRefAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringViewRefAccess();
    Keyword _viewRefKeyword_4 = _richStringViewRefAccess_1.getViewRefKeyword_4();
    _setNoSpace_64.around(_viewRefKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_65 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringUIRefElements _richStringUIRefAccess = this._luniferaDocGrammarGrammarAccess.getRichStringUIRefAccess();
    Keyword _uiRefKeyword_1 = _richStringUIRefAccess.getUiRefKeyword_1();
    _setNoSpace_65.before(_uiRefKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_66 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringUIRefElements _richStringUIRefAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringUIRefAccess();
    Keyword _uiRefKeyword_4 = _richStringUIRefAccess_1.getUiRefKeyword_4();
    _setNoSpace_66.around(_uiRefKeyword_4);
    FormattingConfig.NoSpaceLocator _setNoSpace_67 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringListElements _richStringListAccess = this._luniferaDocGrammarGrammarAccess.getRichStringListAccess();
    Keyword _ulKeyword_1 = _richStringListAccess.getUlKeyword_1();
    _setNoSpace_67.around(_ulKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_68 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringListElements _richStringListAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringListAccess();
    Keyword _ulKeyword_3 = _richStringListAccess_1.getUlKeyword_3();
    _setNoSpace_68.around(_ulKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_69 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringOrderedListElements _richStringOrderedListAccess = this._luniferaDocGrammarGrammarAccess.getRichStringOrderedListAccess();
    Keyword _olKeyword_1 = _richStringOrderedListAccess.getOlKeyword_1();
    _setNoSpace_69.around(_olKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_70 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringOrderedListElements _richStringOrderedListAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringOrderedListAccess();
    Keyword _olKeyword_3 = _richStringOrderedListAccess_1.getOlKeyword_3();
    _setNoSpace_70.around(_olKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_71 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringListElementElements _richStringListElementAccess = this._luniferaDocGrammarGrammarAccess.getRichStringListElementAccess();
    Keyword _liKeyword_1 = _richStringListElementAccess.getLiKeyword_1();
    _setNoSpace_71.around(_liKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_72 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringListElementElements _richStringListElementAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringListElementAccess();
    Keyword _liKeyword_3 = _richStringListElementAccess_1.getLiKeyword_3();
    _setNoSpace_72.around(_liKeyword_3);
    FormattingConfig.NoSpaceLocator _setNoSpace_73 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSpanElements _richStringSpanAccess = this._luniferaDocGrammarGrammarAccess.getRichStringSpanAccess();
    Keyword _styleKeyword_1 = _richStringSpanAccess.getStyleKeyword_1();
    _setNoSpace_73.before(_styleKeyword_1);
    FormattingConfig.NoSpaceLocator _setNoSpace_74 = c.setNoSpace();
    LuniferaDocGrammarGrammarAccess.RichStringSpanElements _richStringSpanAccess_1 = this._luniferaDocGrammarGrammarAccess.getRichStringSpanAccess();
    Keyword _styleKeyword_4 = _richStringSpanAccess_1.getStyleKeyword_4();
    _setNoSpace_74.around(_styleKeyword_4);
  }
}
