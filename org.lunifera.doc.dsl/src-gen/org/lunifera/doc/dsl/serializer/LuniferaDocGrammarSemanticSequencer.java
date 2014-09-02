package org.lunifera.doc.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XListLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XPostfixOperation;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSetLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;
import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
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
import org.lunifera.doc.dsl.services.LuniferaDocGrammarGrammarAccess;

@SuppressWarnings("all")
public class LuniferaDocGrammarSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private LuniferaDocGrammarGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LunDocPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LunDocPackage.LDOC_BPM_PROCESS_DOCUMENT:
				if(context == grammarAccess.getBPMProcessDocumentRule() ||
				   context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getNamedDocumentRule()) {
					sequence_BPMProcessDocument(context, (LDocBPMProcessDocument) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_DTO_DOCUMENT:
				if(context == grammarAccess.getDTODocumentRule() ||
				   context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getNamedDocumentRule()) {
					sequence_DTODocument(context, (LDocDtoDocument) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_DTO_PROPERTY:
				if(context == grammarAccess.getDTOPropertyRule()) {
					sequence_DTOProperty(context, (LDocDtoProperty) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_ENTITY_DOCUMENT:
				if(context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getEntityDocumentRule() ||
				   context == grammarAccess.getNamedDocumentRule()) {
					sequence_EntityDocument(context, (LDocEntityDocument) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_ENTITY_FIELD:
				if(context == grammarAccess.getEntityFieldRule()) {
					sequence_EntityField(context, (LDocEntityField) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_HUMAN_TASK_DOCUMENT:
				if(context == grammarAccess.getBPMHumanTaskDocumentRule() ||
				   context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getNamedDocumentRule()) {
					sequence_BPMHumanTaskDocument(context, (LDocHumanTaskDocument) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_INCLUDE:
				if(context == grammarAccess.getDocumentIncludeRule()) {
					sequence_DocumentInclude(context, (LDocInclude) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_LAYOUTER:
				if(context == grammarAccess.getDocLayouterRule() ||
				   context == grammarAccess.getGeneralDocumentRule() ||
				   context == grammarAccess.getNamedDocumentRule()) {
					sequence_GeneralDocument(context, (LDocLayouter) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_UI_DOCUMENT:
				if(context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getNamedDocumentRule() ||
				   context == grammarAccess.getUIDocumentRule()) {
					sequence_UIDocument(context, (LDocUIDocument) semanticObject); 
					return; 
				}
				else break;
			case LunDocPackage.LDOC_VIEW_DOCUMENT:
				if(context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getNamedDocumentRule() ||
				   context == grammarAccess.getVaaclipseViewDocumentRule()) {
					sequence_VaaclipseViewDocument(context, (LDocViewDocument) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == LunDocRichstringPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LunDocRichstringPackage.RICH_STRING:
				if(context == grammarAccess.getInternalRichStringRule()) {
					sequence_InternalRichString(context, (RichString) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringRule()) {
					sequence_RichString(context, (RichString) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_BOLD:
				if(context == grammarAccess.getRichStringBoldRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringBold(context, (RichStringBold) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_BOX:
				if(context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringAbstractsBox_RichStringBioBox_RichStringChecklistBox_RichStringErrorBox_RichStringInfoBox_RichStringPart_RichStringSideNoteBox_RichStringWarningBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringAbstractsBoxRule()) {
					sequence_RichStringAbstractsBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringBioBoxRule()) {
					sequence_RichStringBioBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringChecklistBoxRule()) {
					sequence_RichStringChecklistBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringErrorBoxRule()) {
					sequence_RichStringErrorBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringInfoBoxRule()) {
					sequence_RichStringInfoBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringSideNoteBoxRule()) {
					sequence_RichStringSideNoteBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringWarningBoxRule()) {
					sequence_RichStringWarningBox(context, (RichStringBox) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_CHAPTER:
				if(context == grammarAccess.getRichStringChapterRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringChapter(context, (RichStringChapter) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_CODE:
				if(context == grammarAccess.getRichStringCodeRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringCode(context, (RichStringCode) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_COLUMN:
				if(context == grammarAccess.getRichStringColumnRule()) {
					sequence_RichStringColumn(context, (RichStringColumn) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_COLUMN_LAYOUT:
				if(context == grammarAccess.getRichStringColumnLayoutRule()) {
					sequence_RichStringColumnLayout(context, (RichStringColumnLayout) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_CONTAINER:
				if(context == grammarAccess.getRichStringContainerRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringContainer(context, (RichStringContainer) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_DTO_REF:
				if(context == grammarAccess.getRichStringDTORefRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringDTORef(context, (RichStringDTORef) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_ELSE_IF:
				if(context == grammarAccess.getRichStringElseIfRule()) {
					sequence_RichStringElseIf(context, (RichStringElseIf) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_ENTITY_REF:
				if(context == grammarAccess.getRichStringEntityRefRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringEntityRef(context, (RichStringEntityRef) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_EXAMPLE:
				if(context == grammarAccess.getRichStringExampleRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringExample(context, (RichStringExample) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_FOOTER:
				if(context == grammarAccess.getRichStringFooterRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringFooter(context, (RichStringFooter) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_FOR_LOOP:
				if(context == grammarAccess.getRichStringForLoopRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringForLoop(context, (RichStringForLoop) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_H1:
				if(context == grammarAccess.getRichStringH1Rule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringH1(context, (RichStringH1) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_H2:
				if(context == grammarAccess.getRichStringH2Rule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringH2(context, (RichStringH2) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_H3:
				if(context == grammarAccess.getRichStringH3Rule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringH3(context, (RichStringH3) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_H4:
				if(context == grammarAccess.getRichStringH4Rule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringH4(context, (RichStringH4) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_H5:
				if(context == grammarAccess.getRichStringH5Rule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringH5(context, (RichStringH5) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_H6:
				if(context == grammarAccess.getRichStringH6Rule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringH6(context, (RichStringH6) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_HEADER:
				if(context == grammarAccess.getRichStringHeaderRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringHeader(context, (RichStringHeader) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_IF:
				if(context == grammarAccess.getRichStringIfRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringIf(context, (RichStringIf) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_IMG:
				if(context == grammarAccess.getRichStringImgRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringImg(context, (RichStringImg) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_INDEX:
				if(context == grammarAccess.getRichStringIndexRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringIndex(context, (RichStringIndex) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT:
				if(context == grammarAccess.getRichStringIndexElementRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringIndexElement(context, (RichStringIndexElement) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_ITALIC:
				if(context == grammarAccess.getRichStringItalicRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringItalic(context, (RichStringItalic) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_LIST:
				if(context == grammarAccess.getRichStringListRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringList(context, (RichStringList) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_LIST_ELEMENT:
				if(context == grammarAccess.getRichStringListElementRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringListElement(context, (RichStringListElement) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_LITERAL:
				if(context == grammarAccess.getRichStringLiteralEndRule()) {
					sequence_RichStringLiteralEnd(context, (RichStringLiteral) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringLiteralInbetweenRule()) {
					sequence_RichStringLiteralInbetween(context, (RichStringLiteral) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringLiteralStartRule()) {
					sequence_RichStringLiteralStart(context, (RichStringLiteral) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRichStringLiteralRule()) {
					sequence_RichStringLiteral(context, (RichStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_MAILTO:
				if(context == grammarAccess.getRichStringMailtoRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringMailto(context, (RichStringMailto) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_MOVIE:
				if(context == grammarAccess.getRichStringMovieRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringMovie(context, (RichStringMovie) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_OPEN_VIEW:
				if(context == grammarAccess.getRichStringOpenViewRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringOpenView(context, (RichStringOpenView) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_ORDERED_LIST:
				if(context == grammarAccess.getRichStringOrderedListRule() ||
				   context == grammarAccess.getRichStringPartRule()) {
					sequence_RichStringOrderedList(context, (RichStringOrderedList) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_PROCESS_REF:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringProcessRefRule()) {
					sequence_RichStringProcessRef(context, (RichStringProcessRef) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_REF:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringRefRule()) {
					sequence_RichStringRef(context, (RichStringRef) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_SECTION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringSectionRule()) {
					sequence_RichStringSection(context, (RichStringSection) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_SKYPE:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringSkypeRule()) {
					sequence_RichStringSkype(context, (RichStringSkype) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_SPAN:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringSpanRule()) {
					sequence_RichStringSpan(context, (RichStringSpan) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_START_PROCESS:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringStartProcessRule()) {
					sequence_RichStringStartProcess(context, (RichStringStartProcess) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_SUBSECTION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringSubsectionRule()) {
					sequence_RichStringSubsection(context, (RichStringSubsection) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_TABLE:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringTableRule()) {
					sequence_RichStringTable(context, (RichStringTable) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_TABLE_CELL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringTableCellRule()) {
					sequence_RichStringTableCell(context, (RichStringTableCell) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_TABLE_ROW:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringTableRowRule()) {
					sequence_RichStringTableRow(context, (RichStringTableRow) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_TASK_REF:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringTaskRefRule()) {
					sequence_RichStringTaskRef(context, (RichStringTaskRef) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_UI_REF:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringUIRefRule()) {
					sequence_RichStringUIRef(context, (RichStringUIRef) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_URL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringURLRule()) {
					sequence_RichStringURL(context, (RichStringURL) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_UNDERLINE:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringUnderlineRule()) {
					sequence_RichStringUnderline(context, (RichStringUnderline) semanticObject); 
					return; 
				}
				else break;
			case LunDocRichstringPackage.RICH_STRING_VIEW_REF:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getRichStringViewRefRule()) {
					sequence_RichStringViewRef(context, (RichStringViewRef) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				if(context == grammarAccess.getJvmTypeParameterRule()) {
					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBASIC_FOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBasicForLoopExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBasicForLoopExpression(context, (XBasicForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBINARY_OPERATION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBlockExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBooleanLiteralRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASE_PART:
				if(context == grammarAccess.getXCasePartRule()) {
					sequence_XCasePart(context, (XCasePart) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASTED_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCATCH_CLAUSE:
				if(context == grammarAccess.getXCatchClauseRule()) {
					sequence_XCatchClause(context, (XCatchClause) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCLOSURE:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXClosureRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXConstructorCallRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XDO_WHILE_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXDoWhileExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFEATURE_CALL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXForLoopExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XIF_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XLIST_LITERAL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXListLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNULL_LITERAL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNullLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNUMBER_LITERAL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNumberLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XPOSTFIX_OPERATION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XPostfixOperation(context, (XPostfixOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XRETURN_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXReturnExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSET_LITERAL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSetLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSTRING_LITERAL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXStringLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSWITCH_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSwitchExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSYNCHRONIZED_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSynchronizedExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSynchronizedExpression(context, (XSynchronizedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTHROW_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXThrowExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTryCatchFinallyExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTYPE_LITERAL:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTypeLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XUNARY_OPERATION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XVARIABLE_DECLARATION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXVariableDeclarationRule()) {
					sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getRichStringPartRule() ||
				   context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionOrVarDeclarationRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPostfixOperationRule() ||
				   context == grammarAccess.getXPostfixOperationAccess().getXPostfixOperationOperandAction_1_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getXFunctionTypeRefRule()) {
					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_DECLARATION:
				if(context == grammarAccess.getXImportDeclarationRule()) {
					sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XtypePackage.XIMPORT_SECTION:
				if(context == grammarAccess.getXImportSectionRule()) {
					sequence_XImportSection(context, (XImportSection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=QualifiedName task=STRING language=ID description=RichString)
	 */
	protected void sequence_BPMHumanTaskDocument(EObject context, LDocHumanTaskDocument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_HUMAN_TASK_DOCUMENT__TASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_HUMAN_TASK_DOCUMENT__TASK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBPMHumanTaskDocumentAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBPMHumanTaskDocumentAccess().getTaskSTRINGTerminalRuleCall_3_0(), semanticObject.getTask());
		feeder.accept(grammarAccess.getBPMHumanTaskDocumentAccess().getLanguageIDTerminalRuleCall_5_1_0(), semanticObject.getLanguage());
		feeder.accept(grammarAccess.getBPMHumanTaskDocumentAccess().getDescriptionRichStringParserRuleCall_8_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName process=STRING language=ID description=RichString)
	 */
	protected void sequence_BPMProcessDocument(EObject context, LDocBPMProcessDocument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_BPM_PROCESS_DOCUMENT__PROCESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_BPM_PROCESS_DOCUMENT__PROCESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBPMProcessDocumentAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBPMProcessDocumentAccess().getProcessSTRINGTerminalRuleCall_3_0(), semanticObject.getProcess());
		feeder.accept(grammarAccess.getBPMProcessDocumentAccess().getLanguageIDTerminalRuleCall_5_1_0(), semanticObject.getLanguage());
		feeder.accept(grammarAccess.getBPMProcessDocumentAccess().getDescriptionRichStringParserRuleCall_8_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName model=[LType|QualifiedName] language=ID description=RichString? fields+=DTOProperty*)
	 */
	protected void sequence_DTODocument(EObject context, LDocDtoDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=RichString)
	 */
	protected void sequence_DTOProperty(EObject context, LDocDtoProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (document=[LDocDocument|QualifiedName] varName=ID) | 
	 *         (provided?='provided' (providedType=ProvidedType | providedJVMType=JvmTypeReference) varName=ID)
	 *     )
	 */
	protected void sequence_DocumentInclude(EObject context, LDocInclude semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName model=[LType|QualifiedName] language=ID description=RichString? fields+=EntityField*)
	 */
	protected void sequence_EntityDocument(EObject context, LDocEntityDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (typeField=[LFeature|ID] description=RichString?)
	 */
	protected void sequence_EntityField(EObject context, LDocEntityField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName imports+=XImportDeclaration* includes+=DocumentInclude* language=ID content=RichString)
	 */
	protected void sequence_GeneralDocument(EObject context, LDocLayouter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=RichStringLiteralInbetween (expressions+=RichStringPart? expressions+=RichStringLiteralInbetween)*)
	 */
	protected void sequence_InternalRichString(EObject context, RichString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (info?='infobox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString) | 
	 *         (error?='errorbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString) | 
	 *         (warning?='warningbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString) | 
	 *         (abstracts?='abstractsbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString) | 
	 *         (checklist?='checklistbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString) | 
	 *         (bio?='biobox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString) | 
	 *         (sidenote?='sidenotebox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 *     )
	 */
	protected void sequence_RichStringAbstractsBox_RichStringBioBox_RichStringChecklistBox_RichStringErrorBox_RichStringInfoBox_RichStringPart_RichStringSideNoteBox_RichStringWarningBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (abstracts?='abstractsbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringAbstractsBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bio?='biobox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringBioBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringBold(EObject context, RichStringBold semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID expression=InternalRichString)
	 */
	protected void sequence_RichStringChapter(EObject context, RichStringChapter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (checklist?='checklistbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringChecklistBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lang=STRING? content=InternalRichString)
	 */
	protected void sequence_RichStringCode(EObject context, RichStringCode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringColumnLayout(EObject context, RichStringColumnLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringColumn(EObject context, RichStringColumn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringContainer(EObject context, RichStringContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (dtoDoc=[LDocDtoDocument|QualifiedName] expression=InternalRichString)
	 */
	protected void sequence_RichStringDTORef(EObject context, RichStringDTORef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=XExpression then=InternalRichString)
	 */
	protected void sequence_RichStringElseIf(EObject context, RichStringElseIf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LunDocRichstringPackage.Literals.RICH_STRING_ELSE_IF__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocRichstringPackage.Literals.RICH_STRING_ELSE_IF__IF));
			if(transientValues.isValueTransient(semanticObject, LunDocRichstringPackage.Literals.RICH_STRING_ELSE_IF__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocRichstringPackage.Literals.RICH_STRING_ELSE_IF__THEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichStringElseIfAccess().getIfXExpressionParserRuleCall_2_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getRichStringElseIfAccess().getThenInternalRichStringParserRuleCall_3_0(), semanticObject.getThen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (entityDoc=[LDocEntityDocument|QualifiedName] expression=InternalRichString)
	 */
	protected void sequence_RichStringEntityRef(EObject context, RichStringEntityRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (error?='errorbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringErrorBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringExample(EObject context, RichStringExample semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringFooter(EObject context, RichStringFooter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         declaredParam=JvmFormalParameter 
	 *         forExpression=XExpression 
	 *         before=XExpression? 
	 *         separator=XExpression? 
	 *         after=XExpression? 
	 *         eachExpression=InternalRichString
	 *     )
	 */
	protected void sequence_RichStringForLoop(EObject context, RichStringForLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringH1(EObject context, RichStringH1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringH2(EObject context, RichStringH2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringH3(EObject context, RichStringH3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringH4(EObject context, RichStringH4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringH5(EObject context, RichStringH5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringH6(EObject context, RichStringH6 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringHeader(EObject context, RichStringHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=XExpression then=InternalRichString elseIfs+=RichStringElseIf* else=InternalRichString?)
	 */
	protected void sequence_RichStringIf(EObject context, RichStringIf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=STRING alt=STRING? small?='small'? orientation=MarkupOrientation?)
	 */
	protected void sequence_RichStringImg(EObject context, RichStringImg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (indexElement=[IndexElement|ID] expression=InternalRichString)
	 */
	protected void sequence_RichStringIndexElement(EObject context, RichStringIndexElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringIndex(EObject context, RichStringIndex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (info?='infobox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringInfoBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringItalic(EObject context, RichStringItalic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringListElement(EObject context, RichStringListElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringList(EObject context, RichStringList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=RICH_TEXT_END | value=COMMENT_RICH_TEXT_END)
	 */
	protected void sequence_RichStringLiteralEnd(EObject context, RichStringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=RICH_TEXT_INBETWEEN | value=COMMENT_RICH_TEXT_INBETWEEN)
	 */
	protected void sequence_RichStringLiteralInbetween(EObject context, RichStringLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=RICH_TEXT_START
	 */
	protected void sequence_RichStringLiteralStart(EObject context, RichStringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XbasePackage.Literals.XSTRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XbasePackage.Literals.XSTRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichStringLiteralStartAccess().getValueRICH_TEXT_STARTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=RICH_TEXT
	 */
	protected void sequence_RichStringLiteral(EObject context, RichStringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, XbasePackage.Literals.XSTRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XbasePackage.Literals.XSTRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRichStringLiteralAccess().getValueRICH_TEXTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (email=STRING content=InternalRichString)
	 */
	protected void sequence_RichStringMailto(EObject context, RichStringMailto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (src=STRING type=STRING width=STRING height=STRING content=InternalRichString)
	 */
	protected void sequence_RichStringMovie(EObject context, RichStringMovie semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (viewId=STRING expression=InternalRichString)
	 */
	protected void sequence_RichStringOpenView(EObject context, RichStringOpenView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringOrderedList(EObject context, RichStringOrderedList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (bpmDoc=[LDocBPMProcessDocument|QualifiedName] expression=InternalRichString)
	 */
	protected void sequence_RichStringProcessRef(EObject context, RichStringProcessRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (refId=STRING expression=InternalRichString)
	 */
	protected void sequence_RichStringRef(EObject context, RichStringRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID expression=InternalRichString)
	 */
	protected void sequence_RichStringSection(EObject context, RichStringSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sidenote?='sidenotebox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringSideNoteBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=STRING content=InternalRichString)
	 */
	protected void sequence_RichStringSkype(EObject context, RichStringSkype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (style=STRING expression=InternalRichString)
	 */
	protected void sequence_RichStringSpan(EObject context, RichStringSpan semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (processId=STRING expression=InternalRichString)
	 */
	protected void sequence_RichStringStartProcess(EObject context, RichStringStartProcess semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ValidID expression=InternalRichString)
	 */
	protected void sequence_RichStringSubsection(EObject context, RichStringSubsection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringTableCell(EObject context, RichStringTableCell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringTableRow(EObject context, RichStringTableRow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringTable(EObject context, RichStringTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (taskDoc=[LDocHumanTaskDocument|QualifiedName] expression=InternalRichString)
	 */
	protected void sequence_RichStringTaskRef(EObject context, RichStringTaskRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uiDoc=[LDocUIDocument|QualifiedName] expression=InternalRichString)
	 */
	protected void sequence_RichStringUIRef(EObject context, RichStringUIRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (location=STRING text=InternalRichString)
	 */
	protected void sequence_RichStringURL(EObject context, RichStringURL semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=InternalRichString
	 */
	protected void sequence_RichStringUnderline(EObject context, RichStringUnderline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (viewDoc=[LDocViewDocument|QualifiedName] expression=InternalRichString)
	 */
	protected void sequence_RichStringViewRef(EObject context, RichStringViewRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (warning?='warningbox' title=STRING small?='small'? orientation=MarkupOrientation? expression=InternalRichString)
	 */
	protected void sequence_RichStringWarningBox(EObject context, RichStringBox semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         expressions+=RichStringLiteral | 
	 *         (
	 *             expressions+=RichStringLiteralStart 
	 *             expressions+=RichStringPart? 
	 *             (expressions+=RichStringLiteralInbetween expressions+=RichStringPart?)* 
	 *             expressions+=RichStringLiteralEnd
	 *         )
	 *     )
	 */
	protected void sequence_RichString(EObject context, RichString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName ui=STRING language=ID description=RichString)
	 */
	protected void sequence_UIDocument(EObject context, LDocUIDocument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_UI_DOCUMENT__UI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_UI_DOCUMENT__UI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUIDocumentAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getUIDocumentAccess().getUiSTRINGTerminalRuleCall_3_0(), semanticObject.getUi());
		feeder.accept(grammarAccess.getUIDocumentAccess().getLanguageIDTerminalRuleCall_5_1_0(), semanticObject.getLanguage());
		feeder.accept(grammarAccess.getUIDocumentAccess().getDescriptionRichStringParserRuleCall_8_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName view=STRING language=ID description=RichString)
	 */
	protected void sequence_VaaclipseViewDocument(EObject context, LDocViewDocument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_NAMED_DOCUMENT__LANGUAGE));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_DOCUMENT__DESCRIPTION));
			if(transientValues.isValueTransient(semanticObject, LunDocPackage.Literals.LDOC_VIEW_DOCUMENT__VIEW) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LunDocPackage.Literals.LDOC_VIEW_DOCUMENT__VIEW));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVaaclipseViewDocumentAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVaaclipseViewDocumentAccess().getViewSTRINGTerminalRuleCall_3_0(), semanticObject.getView());
		feeder.accept(grammarAccess.getVaaclipseViewDocumentAccess().getLanguageIDTerminalRuleCall_5_1_0(), semanticObject.getLanguage());
		feeder.accept(grammarAccess.getVaaclipseViewDocumentAccess().getDescriptionRichStringParserRuleCall_8_0(), semanticObject.getDescription());
		feeder.finish();
	}
}
