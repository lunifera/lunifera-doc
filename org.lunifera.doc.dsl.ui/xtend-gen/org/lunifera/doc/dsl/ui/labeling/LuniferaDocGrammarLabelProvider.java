/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.ui.labeling.XbaseLabelProvider;
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;
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

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class LuniferaDocGrammarLabelProvider extends XbaseLabelProvider {
  @Inject
  public LuniferaDocGrammarLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final LDocEntityDocument elem) {
    return "Entity Document";
  }
  
  public String image(final LDocEntityDocument elem) {
    return "document.gif";
  }
  
  public String text(final LDocEntityField elem) {
    return "Entity Field";
  }
  
  public String image(final LDocEntityField elem) {
    return "field.gif";
  }
  
  public String text(final LDocDtoDocument elem) {
    return "DTO Document";
  }
  
  public String image(final LDocDtoDocument elem) {
    return "document.gif";
  }
  
  public String text(final LDocDtoProperty elem) {
    return "DTO Property";
  }
  
  public String image(final LDocDtoProperty elem) {
    return "property.gif";
  }
  
  public String text(final LDocBPMProcessDocument elem) {
    return "BPM Process Document";
  }
  
  public String image(final LDocBPMProcessDocument elem) {
    return "document.gif";
  }
  
  public String text(final LDocHumanTaskDocument elem) {
    return "BPM Human Task Document";
  }
  
  public String image(final LDocHumanTaskDocument elem) {
    return "document.gif";
  }
  
  public String text(final LDocViewDocument elem) {
    return "Vaaclipse View Document";
  }
  
  public String image(final LDocViewDocument elem) {
    return "document.gif";
  }
  
  public String text(final LDocUIDocument elem) {
    return "UI Document";
  }
  
  public String image(final LDocUIDocument elem) {
    return "document.gif";
  }
  
  public String text(final LDocLayouter elem) {
    return "General Document";
  }
  
  public String image(final LDocLayouter elem) {
    return "document.gif";
  }
  
  public String text(final RichString elem) {
    return "RichString";
  }
  
  public String image(final RichString elem) {
    return "richstring.gif";
  }
  
  public String text(final RichStringForLoop elem) {
    return "For Loop";
  }
  
  public String image(final RichStringForLoop elem) {
    return "richstringfor.gif";
  }
  
  public String text(final RichStringIf elem) {
    return "If Statement";
  }
  
  public String image(final RichStringIf elem) {
    return "richstringif.gif";
  }
  
  public String text(final RichStringH1 elem) {
    return "H1";
  }
  
  public String image(final RichStringH1 elem) {
    return "richstringh1.gif";
  }
  
  public String text(final RichStringH2 elem) {
    return "H2";
  }
  
  public String image(final RichStringH2 elem) {
    return "richstringh2.gif";
  }
  
  public String text(final RichStringH3 elem) {
    return "H3";
  }
  
  public String image(final RichStringH3 elem) {
    return "richstringh3.gif";
  }
  
  public String text(final RichStringH4 elem) {
    return "H4";
  }
  
  public String image(final RichStringH4 elem) {
    return "richstringh4.gif";
  }
  
  public String text(final RichStringH5 elem) {
    return "H5";
  }
  
  public String image(final RichStringH5 elem) {
    return "richstringh5.gif";
  }
  
  public String text(final RichStringH6 elem) {
    return "H6";
  }
  
  public String image(final RichStringH6 elem) {
    return "richstringh6.gif";
  }
  
  public String text(final RichStringChapter elem) {
    return "Chapter";
  }
  
  public String image(final RichStringChapter elem) {
    return "richstringchapter.gif";
  }
  
  public String text(final RichStringSection elem) {
    return "Section";
  }
  
  public String image(final RichStringSection elem) {
    return "richstringsection.gif";
  }
  
  public String text(final RichStringSubsection elem) {
    return "Subsection";
  }
  
  public String image(final RichStringSubsection elem) {
    return "richstringsubsection.gif";
  }
  
  public String text(final RichStringURL elem) {
    return "URL";
  }
  
  public String image(final RichStringURL elem) {
    return "richstringurl.gif";
  }
  
  public String text(final RichStringRef elem) {
    return "Reference";
  }
  
  public String image(final RichStringRef elem) {
    return "richstringref.gif";
  }
  
  public String text(final RichStringBold elem) {
    return "Format Bold";
  }
  
  public String image(final RichStringBold elem) {
    return "richstringbold.gif";
  }
  
  public String text(final RichStringUnderline elem) {
    return "Format Underline";
  }
  
  public String image(final RichStringUnderline elem) {
    return "richstringunderline.gif";
  }
  
  public String text(final RichStringItalic elem) {
    return "Format Italic";
  }
  
  public String image(final RichStringItalic elem) {
    return "richstringitalic.gif";
  }
  
  public String text(final RichStringImg elem) {
    return "Image";
  }
  
  public String image(final RichStringImg elem) {
    return "richstringimage.gif";
  }
  
  public String text(final RichStringMailto elem) {
    return "Mailto";
  }
  
  public String image(final RichStringMailto elem) {
    return "richstringmailto.gif";
  }
  
  public String text(final RichStringSkype elem) {
    return "Skype";
  }
  
  public String image(final RichStringSkype elem) {
    return "richstringskype.gif";
  }
  
  public String text(final RichStringMovie elem) {
    return "Movie";
  }
  
  public String image(final RichStringMovie elem) {
    return "richstringmovie.gif";
  }
  
  public String text(final RichStringCode elem) {
    return "Code";
  }
  
  public String image(final RichStringCode elem) {
    return "richstringcode.gif";
  }
  
  public String text(final RichStringTable elem) {
    return "Table";
  }
  
  public String image(final RichStringTable elem) {
    return "richstringtable.gif";
  }
  
  public String text(final RichStringTableRow elem) {
    return "Table Row";
  }
  
  public String image(final RichStringTableRow elem) {
    return "richstringtablerow.gif";
  }
  
  public String text(final RichStringTableCell elem) {
    return "Table Data";
  }
  
  public String image(final RichStringTableCell elem) {
    return "richstringtabledata.gif";
  }
  
  public String text(final RichStringOpenView elem) {
    return "Open View";
  }
  
  public String image(final RichStringOpenView elem) {
    return "richstringopenview.gif";
  }
  
  public String text(final RichStringStartProcess elem) {
    return "Start Process";
  }
  
  public String image(final RichStringStartProcess elem) {
    return "richstringstartprocess.gif";
  }
  
  public String text(final RichStringEntityRef elem) {
    return "Entity Reference";
  }
  
  public String image(final RichStringEntityRef elem) {
    return "richstringentityref.gif";
  }
  
  public String text(final RichStringDTORef elem) {
    return "DTO Reference";
  }
  
  public String image(final RichStringDTORef elem) {
    return "richstringdtoref.gif";
  }
  
  public String text(final RichStringProcessRef elem) {
    return "Process Reference";
  }
  
  public String image(final RichStringProcessRef elem) {
    return "richstringprocessref.gif";
  }
  
  public String text(final RichStringTaskRef elem) {
    return "Task Reference";
  }
  
  public String image(final RichStringTaskRef elem) {
    return "richstringtaskref.gif";
  }
  
  public String text(final RichStringViewRef elem) {
    return "View Reference";
  }
  
  public String image(final RichStringViewRef elem) {
    return "richstringviewref.gif";
  }
  
  public String text(final RichStringUIRef elem) {
    return "UI Reference";
  }
  
  public String image(final RichStringUIRef elem) {
    return "richstringuiref.gif";
  }
  
  public String text(final RichStringList elem) {
    return "Unordered List";
  }
  
  public String image(final RichStringList elem) {
    return "richstringlist.gif";
  }
  
  public String text(final RichStringOrderedList elem) {
    return "Ordered List";
  }
  
  public String image(final RichStringOrderedList elem) {
    return "richstringorderedlist.gif";
  }
  
  public String text(final RichStringListElement elem) {
    return "List Element";
  }
  
  public String image(final RichStringListElement elem) {
    return "richstringlistelement.gif";
  }
  
  public String text(final RichStringSpan elem) {
    return "Span Style";
  }
  
  public String image(final RichStringSpan elem) {
    return "richstringspan.gif";
  }
  
  public String text(final RichStringExample elem) {
    return "Example";
  }
  
  public String image(final RichStringExample elem) {
    return "richstringexample.gif";
  }
  
  public String text(final RichStringLiteral elem) {
    return "Literal";
  }
  
  public String image(final RichStringLiteral elem) {
    return "richstringliteral.gif";
  }
  
  public String text(final XExpression elem) {
    return "Expression";
  }
  
  public String image(final XExpression elem) {
    return "xexpression.gif";
  }
}
