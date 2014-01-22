/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.doc.dsl.luniferadoc.richstring.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDocRichstringFactoryImpl extends EFactoryImpl implements LDocRichstringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LDocRichstringFactory init() {
		try {
			LDocRichstringFactory theLDocRichstringFactory = (LDocRichstringFactory)EPackage.Registry.INSTANCE.getEFactory(LDocRichstringPackage.eNS_URI);
			if (theLDocRichstringFactory != null) {
				return theLDocRichstringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LDocRichstringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocRichstringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LDocRichstringPackage.RICH_STRING_ELSE_IF: return createRichStringElseIf();
			case LDocRichstringPackage.RICH_STRING: return createRichString();
			case LDocRichstringPackage.RICH_STRING_LITERAL: return createRichStringLiteral();
			case LDocRichstringPackage.RICH_STRING_FOR_LOOP: return createRichStringForLoop();
			case LDocRichstringPackage.RICH_STRING_IF: return createRichStringIf();
			case LDocRichstringPackage.RICH_STRING_MARKUP: return createRichStringMarkup();
			case LDocRichstringPackage.RICH_STRING_EXAMPLE: return createRichStringExample();
			case LDocRichstringPackage.RICH_STRING_H1: return createRichStringH1();
			case LDocRichstringPackage.RICH_STRING_H2: return createRichStringH2();
			case LDocRichstringPackage.RICH_STRING_H3: return createRichStringH3();
			case LDocRichstringPackage.RICH_STRING_H4: return createRichStringH4();
			case LDocRichstringPackage.RICH_STRING_H5: return createRichStringH5();
			case LDocRichstringPackage.RICH_STRING_H6: return createRichStringH6();
			case LDocRichstringPackage.RICH_STRING_CHAPTER: return createRichStringChapter();
			case LDocRichstringPackage.RICH_STRING_SECTION: return createRichStringSection();
			case LDocRichstringPackage.RICH_STRING_SUBSECTION: return createRichStringSubsection();
			case LDocRichstringPackage.RICH_STRING_URL: return createRichStringURL();
			case LDocRichstringPackage.RICH_STRING_REF: return createRichStringRef();
			case LDocRichstringPackage.RICH_STRING_BOLD: return createRichStringBold();
			case LDocRichstringPackage.RICH_STRING_UNDERLINE: return createRichStringUnderline();
			case LDocRichstringPackage.RICH_STRING_ITALIC: return createRichStringItalic();
			case LDocRichstringPackage.RICH_STRING_IMG: return createRichStringImg();
			case LDocRichstringPackage.RICH_STRING_MAILTO: return createRichStringMailto();
			case LDocRichstringPackage.RICH_STRING_SKYPE: return createRichStringSkype();
			case LDocRichstringPackage.RICH_STRING_MOVIE: return createRichStringMovie();
			case LDocRichstringPackage.RICH_STRING_CODE: return createRichStringCode();
			case LDocRichstringPackage.RICH_STRING_TABLE: return createRichStringTable();
			case LDocRichstringPackage.RICH_STRING_TABLE_ROW: return createRichStringTableRow();
			case LDocRichstringPackage.RICH_STRING_TABLE_DATA: return createRichStringTableData();
			case LDocRichstringPackage.RICH_STRING_OPEN_VIEW: return createRichStringOpenView();
			case LDocRichstringPackage.RICH_STRING_START_PROCESS: return createRichStringStartProcess();
			case LDocRichstringPackage.RICH_STRING_ENTITY_REF: return createRichStringEntityRef();
			case LDocRichstringPackage.RICH_STRING_DTO_REF: return createRichStringDTORef();
			case LDocRichstringPackage.RICH_STRING_PROCESS_REF: return createRichStringProcessRef();
			case LDocRichstringPackage.RICH_STRING_TASK_REF: return createRichStringTaskRef();
			case LDocRichstringPackage.RICH_STRING_VIEW_REF: return createRichStringViewRef();
			case LDocRichstringPackage.RICH_STRING_UI_REF: return createRichStringUIRef();
			case LDocRichstringPackage.RICH_STRING_LIST: return createRichStringList();
			case LDocRichstringPackage.RICH_STRING_ORDERED_LIST: return createRichStringOrderedList();
			case LDocRichstringPackage.RICH_STRING_LIST_ELEMENT: return createRichStringListElement();
			case LDocRichstringPackage.RICH_STRING_SPAN: return createRichStringSpan();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringElseIf createRichStringElseIf() {
		RichStringElseIfImpl richStringElseIf = new RichStringElseIfImpl();
		return richStringElseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichString createRichString() {
		RichStringImpl richString = new RichStringImpl();
		return richString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringLiteral createRichStringLiteral() {
		RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
		return richStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringForLoop createRichStringForLoop() {
		RichStringForLoopImpl richStringForLoop = new RichStringForLoopImpl();
		return richStringForLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringIf createRichStringIf() {
		RichStringIfImpl richStringIf = new RichStringIfImpl();
		return richStringIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringMarkup createRichStringMarkup() {
		RichStringMarkupImpl richStringMarkup = new RichStringMarkupImpl();
		return richStringMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringExample createRichStringExample() {
		RichStringExampleImpl richStringExample = new RichStringExampleImpl();
		return richStringExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH1 createRichStringH1() {
		RichStringH1Impl richStringH1 = new RichStringH1Impl();
		return richStringH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH2 createRichStringH2() {
		RichStringH2Impl richStringH2 = new RichStringH2Impl();
		return richStringH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH3 createRichStringH3() {
		RichStringH3Impl richStringH3 = new RichStringH3Impl();
		return richStringH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH4 createRichStringH4() {
		RichStringH4Impl richStringH4 = new RichStringH4Impl();
		return richStringH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH5 createRichStringH5() {
		RichStringH5Impl richStringH5 = new RichStringH5Impl();
		return richStringH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH6 createRichStringH6() {
		RichStringH6Impl richStringH6 = new RichStringH6Impl();
		return richStringH6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringChapter createRichStringChapter() {
		RichStringChapterImpl richStringChapter = new RichStringChapterImpl();
		return richStringChapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringSection createRichStringSection() {
		RichStringSectionImpl richStringSection = new RichStringSectionImpl();
		return richStringSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringSubsection createRichStringSubsection() {
		RichStringSubsectionImpl richStringSubsection = new RichStringSubsectionImpl();
		return richStringSubsection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringURL createRichStringURL() {
		RichStringURLImpl richStringURL = new RichStringURLImpl();
		return richStringURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringRef createRichStringRef() {
		RichStringRefImpl richStringRef = new RichStringRefImpl();
		return richStringRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringBold createRichStringBold() {
		RichStringBoldImpl richStringBold = new RichStringBoldImpl();
		return richStringBold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringUnderline createRichStringUnderline() {
		RichStringUnderlineImpl richStringUnderline = new RichStringUnderlineImpl();
		return richStringUnderline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringItalic createRichStringItalic() {
		RichStringItalicImpl richStringItalic = new RichStringItalicImpl();
		return richStringItalic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringImg createRichStringImg() {
		RichStringImgImpl richStringImg = new RichStringImgImpl();
		return richStringImg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringMailto createRichStringMailto() {
		RichStringMailtoImpl richStringMailto = new RichStringMailtoImpl();
		return richStringMailto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringSkype createRichStringSkype() {
		RichStringSkypeImpl richStringSkype = new RichStringSkypeImpl();
		return richStringSkype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringMovie createRichStringMovie() {
		RichStringMovieImpl richStringMovie = new RichStringMovieImpl();
		return richStringMovie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringCode createRichStringCode() {
		RichStringCodeImpl richStringCode = new RichStringCodeImpl();
		return richStringCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringTable createRichStringTable() {
		RichStringTableImpl richStringTable = new RichStringTableImpl();
		return richStringTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringTableRow createRichStringTableRow() {
		RichStringTableRowImpl richStringTableRow = new RichStringTableRowImpl();
		return richStringTableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringTableData createRichStringTableData() {
		RichStringTableDataImpl richStringTableData = new RichStringTableDataImpl();
		return richStringTableData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringOpenView createRichStringOpenView() {
		RichStringOpenViewImpl richStringOpenView = new RichStringOpenViewImpl();
		return richStringOpenView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringStartProcess createRichStringStartProcess() {
		RichStringStartProcessImpl richStringStartProcess = new RichStringStartProcessImpl();
		return richStringStartProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringEntityRef createRichStringEntityRef() {
		RichStringEntityRefImpl richStringEntityRef = new RichStringEntityRefImpl();
		return richStringEntityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringDTORef createRichStringDTORef() {
		RichStringDTORefImpl richStringDTORef = new RichStringDTORefImpl();
		return richStringDTORef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringProcessRef createRichStringProcessRef() {
		RichStringProcessRefImpl richStringProcessRef = new RichStringProcessRefImpl();
		return richStringProcessRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringTaskRef createRichStringTaskRef() {
		RichStringTaskRefImpl richStringTaskRef = new RichStringTaskRefImpl();
		return richStringTaskRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringViewRef createRichStringViewRef() {
		RichStringViewRefImpl richStringViewRef = new RichStringViewRefImpl();
		return richStringViewRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringUIRef createRichStringUIRef() {
		RichStringUIRefImpl richStringUIRef = new RichStringUIRefImpl();
		return richStringUIRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringList createRichStringList() {
		RichStringListImpl richStringList = new RichStringListImpl();
		return richStringList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringOrderedList createRichStringOrderedList() {
		RichStringOrderedListImpl richStringOrderedList = new RichStringOrderedListImpl();
		return richStringOrderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringListElement createRichStringListElement() {
		RichStringListElementImpl richStringListElement = new RichStringListElementImpl();
		return richStringListElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringSpan createRichStringSpan() {
		RichStringSpanImpl richStringSpan = new RichStringSpanImpl();
		return richStringSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocRichstringPackage getLDocRichstringPackage() {
		return (LDocRichstringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LDocRichstringPackage getPackage() {
		return LDocRichstringPackage.eINSTANCE;
	}

} //LDocRichstringFactoryImpl
