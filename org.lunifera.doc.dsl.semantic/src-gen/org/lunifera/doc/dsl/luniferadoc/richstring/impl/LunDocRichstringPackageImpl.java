/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.xbase.XbasePackage;

import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.IndexElement;
import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringFactory;
import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.MarkupOrientation;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LunDocRichstringPackageImpl extends EPackageImpl implements LunDocRichstringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringElseIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringForLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringMarkupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringExampleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringH1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringH2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringH3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringH4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringH5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringH6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringChapterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringSubsectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringURLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringBoldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringUnderlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringItalicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringImgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringMailtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringSkypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringMovieEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringTableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringTableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringOpenViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringStartProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringEntityRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringDTORefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringTaskRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringProcessRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringViewRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringUIRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringOrderedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringListElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringSpanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringColumnLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringFooterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringIndexElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum markupOrientationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LunDocRichstringPackageImpl() {
		super(eNS_URI, LunDocRichstringFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LunDocRichstringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LunDocRichstringPackage init() {
		if (isInited) return (LunDocRichstringPackage)EPackage.Registry.INSTANCE.getEPackage(LunDocRichstringPackage.eNS_URI);

		// Obtain or create and register package
		LunDocRichstringPackageImpl theLunDocRichstringPackage = (LunDocRichstringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LunDocRichstringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LunDocRichstringPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XbasePackage.eINSTANCE.eClass();
		LunDocPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLunDocRichstringPackage.createPackageContents();

		// Initialize created meta-data
		theLunDocRichstringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLunDocRichstringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LunDocRichstringPackage.eNS_URI, theLunDocRichstringPackage);
		return theLunDocRichstringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichString() {
		return richStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringIf() {
		return richStringIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringIf_If() {
		return (EReference)richStringIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringIf_Then() {
		return (EReference)richStringIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringIf_ElseIfs() {
		return (EReference)richStringIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringIf_Else() {
		return (EReference)richStringIfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringElseIf() {
		return richStringElseIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringElseIf_If() {
		return (EReference)richStringElseIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringElseIf_Then() {
		return (EReference)richStringElseIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringLiteral() {
		return richStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringForLoop() {
		return richStringForLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringForLoop_Before() {
		return (EReference)richStringForLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringForLoop_Separator() {
		return (EReference)richStringForLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringForLoop_After() {
		return (EReference)richStringForLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringMarkup() {
		return richStringMarkupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMarkup_Id() {
		return (EAttribute)richStringMarkupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMarkup_Style() {
		return (EAttribute)richStringMarkupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMarkup_Small() {
		return (EAttribute)richStringMarkupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMarkup_Orientation() {
		return (EAttribute)richStringMarkupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringMarkup_Expression() {
		return (EReference)richStringMarkupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringExample() {
		return richStringExampleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringH1() {
		return richStringH1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringH2() {
		return richStringH2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringH3() {
		return richStringH3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringH4() {
		return richStringH4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringH5() {
		return richStringH5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringH6() {
		return richStringH6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexElement() {
		return indexElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringChapter() {
		return richStringChapterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringChapter_Name() {
		return (EAttribute)richStringChapterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringSection() {
		return richStringSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringSection_Name() {
		return (EAttribute)richStringSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringSubsection() {
		return richStringSubsectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringSubsection_Name() {
		return (EAttribute)richStringSubsectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringURL() {
		return richStringURLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringURL_Location() {
		return (EAttribute)richStringURLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringURL_Text() {
		return (EReference)richStringURLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringRef() {
		return richStringRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringRef_RefId() {
		return (EAttribute)richStringRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringBold() {
		return richStringBoldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringUnderline() {
		return richStringUnderlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringItalic() {
		return richStringItalicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringImg() {
		return richStringImgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringImg_Src() {
		return (EAttribute)richStringImgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringImg_Alt() {
		return (EAttribute)richStringImgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringMailto() {
		return richStringMailtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMailto_Email() {
		return (EAttribute)richStringMailtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringMailto_Content() {
		return (EReference)richStringMailtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringSkype() {
		return richStringSkypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringSkype_Target() {
		return (EAttribute)richStringSkypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringSkype_Content() {
		return (EReference)richStringSkypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringMovie() {
		return richStringMovieEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMovie_Src() {
		return (EAttribute)richStringMovieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMovie_Width() {
		return (EAttribute)richStringMovieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMovie_Height() {
		return (EAttribute)richStringMovieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringMovie_Type() {
		return (EAttribute)richStringMovieEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringMovie_Content() {
		return (EReference)richStringMovieEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringCode() {
		return richStringCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringCode_Lang() {
		return (EAttribute)richStringCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringCode_Content() {
		return (EReference)richStringCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringTable() {
		return richStringTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringTableRow() {
		return richStringTableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringTableCell() {
		return richStringTableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringOpenView() {
		return richStringOpenViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringOpenView_ViewId() {
		return (EAttribute)richStringOpenViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringStartProcess() {
		return richStringStartProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringStartProcess_ProcessId() {
		return (EAttribute)richStringStartProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringEntityRef() {
		return richStringEntityRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringEntityRef_EntityDoc() {
		return (EReference)richStringEntityRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringDTORef() {
		return richStringDTORefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringDTORef_DtoDoc() {
		return (EReference)richStringDTORefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringTaskRef() {
		return richStringTaskRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringTaskRef_TaskDoc() {
		return (EReference)richStringTaskRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringProcessRef() {
		return richStringProcessRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringProcessRef_BpmDoc() {
		return (EReference)richStringProcessRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringViewRef() {
		return richStringViewRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringViewRef_ViewDoc() {
		return (EReference)richStringViewRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringUIRef() {
		return richStringUIRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringUIRef_UiDoc() {
		return (EReference)richStringUIRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringList() {
		return richStringListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringOrderedList() {
		return richStringOrderedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringListElement() {
		return richStringListElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringSpan() {
		return richStringSpanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringBox() {
		return richStringBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Error() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Warning() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Info() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Abstracts() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Checklist() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Bio() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Sidenote() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichStringBox_Title() {
		return (EAttribute)richStringBoxEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringContainer() {
		return richStringContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringColumnLayout() {
		return richStringColumnLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringColumn() {
		return richStringColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringFooter() {
		return richStringFooterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringHeader() {
		return richStringHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringIndex() {
		return richStringIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichStringIndexElement() {
		return richStringIndexElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringIndexElement_IndexElement() {
		return (EReference)richStringIndexElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMarkupOrientation() {
		return markupOrientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LunDocRichstringFactory getLunDocRichstringFactory() {
		return (LunDocRichstringFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		richStringEClass = createEClass(RICH_STRING);

		richStringIfEClass = createEClass(RICH_STRING_IF);
		createEReference(richStringIfEClass, RICH_STRING_IF__IF);
		createEReference(richStringIfEClass, RICH_STRING_IF__THEN);
		createEReference(richStringIfEClass, RICH_STRING_IF__ELSE_IFS);
		createEReference(richStringIfEClass, RICH_STRING_IF__ELSE);

		richStringElseIfEClass = createEClass(RICH_STRING_ELSE_IF);
		createEReference(richStringElseIfEClass, RICH_STRING_ELSE_IF__IF);
		createEReference(richStringElseIfEClass, RICH_STRING_ELSE_IF__THEN);

		richStringLiteralEClass = createEClass(RICH_STRING_LITERAL);

		richStringForLoopEClass = createEClass(RICH_STRING_FOR_LOOP);
		createEReference(richStringForLoopEClass, RICH_STRING_FOR_LOOP__BEFORE);
		createEReference(richStringForLoopEClass, RICH_STRING_FOR_LOOP__SEPARATOR);
		createEReference(richStringForLoopEClass, RICH_STRING_FOR_LOOP__AFTER);

		richStringMarkupEClass = createEClass(RICH_STRING_MARKUP);
		createEAttribute(richStringMarkupEClass, RICH_STRING_MARKUP__ID);
		createEAttribute(richStringMarkupEClass, RICH_STRING_MARKUP__STYLE);
		createEAttribute(richStringMarkupEClass, RICH_STRING_MARKUP__SMALL);
		createEAttribute(richStringMarkupEClass, RICH_STRING_MARKUP__ORIENTATION);
		createEReference(richStringMarkupEClass, RICH_STRING_MARKUP__EXPRESSION);

		richStringExampleEClass = createEClass(RICH_STRING_EXAMPLE);

		richStringH1EClass = createEClass(RICH_STRING_H1);

		richStringH2EClass = createEClass(RICH_STRING_H2);

		richStringH3EClass = createEClass(RICH_STRING_H3);

		richStringH4EClass = createEClass(RICH_STRING_H4);

		richStringH5EClass = createEClass(RICH_STRING_H5);

		richStringH6EClass = createEClass(RICH_STRING_H6);

		indexElementEClass = createEClass(INDEX_ELEMENT);

		richStringChapterEClass = createEClass(RICH_STRING_CHAPTER);
		createEAttribute(richStringChapterEClass, RICH_STRING_CHAPTER__NAME);

		richStringSectionEClass = createEClass(RICH_STRING_SECTION);
		createEAttribute(richStringSectionEClass, RICH_STRING_SECTION__NAME);

		richStringSubsectionEClass = createEClass(RICH_STRING_SUBSECTION);
		createEAttribute(richStringSubsectionEClass, RICH_STRING_SUBSECTION__NAME);

		richStringURLEClass = createEClass(RICH_STRING_URL);
		createEAttribute(richStringURLEClass, RICH_STRING_URL__LOCATION);
		createEReference(richStringURLEClass, RICH_STRING_URL__TEXT);

		richStringRefEClass = createEClass(RICH_STRING_REF);
		createEAttribute(richStringRefEClass, RICH_STRING_REF__REF_ID);

		richStringBoldEClass = createEClass(RICH_STRING_BOLD);

		richStringUnderlineEClass = createEClass(RICH_STRING_UNDERLINE);

		richStringItalicEClass = createEClass(RICH_STRING_ITALIC);

		richStringImgEClass = createEClass(RICH_STRING_IMG);
		createEAttribute(richStringImgEClass, RICH_STRING_IMG__SRC);
		createEAttribute(richStringImgEClass, RICH_STRING_IMG__ALT);

		richStringMailtoEClass = createEClass(RICH_STRING_MAILTO);
		createEAttribute(richStringMailtoEClass, RICH_STRING_MAILTO__EMAIL);
		createEReference(richStringMailtoEClass, RICH_STRING_MAILTO__CONTENT);

		richStringSkypeEClass = createEClass(RICH_STRING_SKYPE);
		createEAttribute(richStringSkypeEClass, RICH_STRING_SKYPE__TARGET);
		createEReference(richStringSkypeEClass, RICH_STRING_SKYPE__CONTENT);

		richStringMovieEClass = createEClass(RICH_STRING_MOVIE);
		createEAttribute(richStringMovieEClass, RICH_STRING_MOVIE__SRC);
		createEAttribute(richStringMovieEClass, RICH_STRING_MOVIE__WIDTH);
		createEAttribute(richStringMovieEClass, RICH_STRING_MOVIE__HEIGHT);
		createEAttribute(richStringMovieEClass, RICH_STRING_MOVIE__TYPE);
		createEReference(richStringMovieEClass, RICH_STRING_MOVIE__CONTENT);

		richStringCodeEClass = createEClass(RICH_STRING_CODE);
		createEAttribute(richStringCodeEClass, RICH_STRING_CODE__LANG);
		createEReference(richStringCodeEClass, RICH_STRING_CODE__CONTENT);

		richStringTableEClass = createEClass(RICH_STRING_TABLE);

		richStringTableRowEClass = createEClass(RICH_STRING_TABLE_ROW);

		richStringTableCellEClass = createEClass(RICH_STRING_TABLE_CELL);

		richStringOpenViewEClass = createEClass(RICH_STRING_OPEN_VIEW);
		createEAttribute(richStringOpenViewEClass, RICH_STRING_OPEN_VIEW__VIEW_ID);

		richStringStartProcessEClass = createEClass(RICH_STRING_START_PROCESS);
		createEAttribute(richStringStartProcessEClass, RICH_STRING_START_PROCESS__PROCESS_ID);

		richStringEntityRefEClass = createEClass(RICH_STRING_ENTITY_REF);
		createEReference(richStringEntityRefEClass, RICH_STRING_ENTITY_REF__ENTITY_DOC);

		richStringDTORefEClass = createEClass(RICH_STRING_DTO_REF);
		createEReference(richStringDTORefEClass, RICH_STRING_DTO_REF__DTO_DOC);

		richStringTaskRefEClass = createEClass(RICH_STRING_TASK_REF);
		createEReference(richStringTaskRefEClass, RICH_STRING_TASK_REF__TASK_DOC);

		richStringProcessRefEClass = createEClass(RICH_STRING_PROCESS_REF);
		createEReference(richStringProcessRefEClass, RICH_STRING_PROCESS_REF__BPM_DOC);

		richStringViewRefEClass = createEClass(RICH_STRING_VIEW_REF);
		createEReference(richStringViewRefEClass, RICH_STRING_VIEW_REF__VIEW_DOC);

		richStringUIRefEClass = createEClass(RICH_STRING_UI_REF);
		createEReference(richStringUIRefEClass, RICH_STRING_UI_REF__UI_DOC);

		richStringListEClass = createEClass(RICH_STRING_LIST);

		richStringOrderedListEClass = createEClass(RICH_STRING_ORDERED_LIST);

		richStringListElementEClass = createEClass(RICH_STRING_LIST_ELEMENT);

		richStringSpanEClass = createEClass(RICH_STRING_SPAN);

		richStringBoxEClass = createEClass(RICH_STRING_BOX);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__ERROR);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__WARNING);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__INFO);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__ABSTRACTS);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__CHECKLIST);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__BIO);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__SIDENOTE);
		createEAttribute(richStringBoxEClass, RICH_STRING_BOX__TITLE);

		richStringContainerEClass = createEClass(RICH_STRING_CONTAINER);

		richStringColumnLayoutEClass = createEClass(RICH_STRING_COLUMN_LAYOUT);

		richStringColumnEClass = createEClass(RICH_STRING_COLUMN);

		richStringFooterEClass = createEClass(RICH_STRING_FOOTER);

		richStringHeaderEClass = createEClass(RICH_STRING_HEADER);

		richStringIndexEClass = createEClass(RICH_STRING_INDEX);

		richStringIndexElementEClass = createEClass(RICH_STRING_INDEX_ELEMENT);
		createEReference(richStringIndexElementEClass, RICH_STRING_INDEX_ELEMENT__INDEX_ELEMENT);

		// Create enums
		markupOrientationEEnum = createEEnum(MARKUP_ORIENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		LunDocPackage theLunDocPackage = (LunDocPackage)EPackage.Registry.INSTANCE.getEPackage(LunDocPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		richStringEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());
		richStringIfEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringElseIfEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringLiteralEClass.getESuperTypes().add(theXbasePackage.getXStringLiteral());
		richStringForLoopEClass.getESuperTypes().add(theXbasePackage.getXForLoopExpression());
		richStringMarkupEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringExampleEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH1EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH2EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH3EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH4EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH5EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH6EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringChapterEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringChapterEClass.getESuperTypes().add(this.getIndexElement());
		richStringSectionEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringSectionEClass.getESuperTypes().add(this.getIndexElement());
		richStringSubsectionEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringSubsectionEClass.getESuperTypes().add(this.getIndexElement());
		richStringURLEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringBoldEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringUnderlineEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringItalicEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringImgEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringMailtoEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringSkypeEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringMovieEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringCodeEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringTableEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringTableRowEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringTableCellEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringOpenViewEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringStartProcessEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringEntityRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringDTORefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringTaskRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringProcessRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringViewRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringUIRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringListEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringOrderedListEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringListElementEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringSpanEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringBoxEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringContainerEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringColumnLayoutEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringColumnEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringFooterEClass.getESuperTypes().add(this.getRichStringContainer());
		richStringHeaderEClass.getESuperTypes().add(this.getRichStringContainer());
		richStringIndexEClass.getESuperTypes().add(this.getRichStringContainer());
		richStringIndexElementEClass.getESuperTypes().add(this.getRichStringMarkup());

		// Initialize classes and features; add operations and parameters
		initEClass(richStringEClass, RichString.class, "RichString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringIfEClass, RichStringIf.class, "RichStringIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringIf_If(), theXbasePackage.getXExpression(), null, "if", null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringIf_Then(), theXbasePackage.getXExpression(), null, "then", null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringIf_ElseIfs(), this.getRichStringElseIf(), null, "elseIfs", null, 0, -1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringIf_Else(), theXbasePackage.getXExpression(), null, "else", null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringElseIfEClass, RichStringElseIf.class, "RichStringElseIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringElseIf_If(), theXbasePackage.getXExpression(), null, "if", null, 0, 1, RichStringElseIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringElseIf_Then(), theXbasePackage.getXExpression(), null, "then", null, 0, 1, RichStringElseIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringLiteralEClass, RichStringLiteral.class, "RichStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringForLoopEClass, RichStringForLoop.class, "RichStringForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringForLoop_Before(), theXbasePackage.getXExpression(), null, "before", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringForLoop_Separator(), theXbasePackage.getXExpression(), null, "separator", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringForLoop_After(), theXbasePackage.getXExpression(), null, "after", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringMarkupEClass, RichStringMarkup.class, "RichStringMarkup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringMarkup_Id(), theEcorePackage.getEString(), "id", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMarkup_Style(), theEcorePackage.getEString(), "style", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMarkup_Small(), theEcorePackage.getEBoolean(), "small", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMarkup_Orientation(), this.getMarkupOrientation(), "orientation", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringMarkup_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringExampleEClass, RichStringExample.class, "RichStringExample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH1EClass, RichStringH1.class, "RichStringH1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH2EClass, RichStringH2.class, "RichStringH2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH3EClass, RichStringH3.class, "RichStringH3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH4EClass, RichStringH4.class, "RichStringH4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH5EClass, RichStringH5.class, "RichStringH5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH6EClass, RichStringH6.class, "RichStringH6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indexElementEClass, IndexElement.class, "IndexElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringChapterEClass, RichStringChapter.class, "RichStringChapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringChapter_Name(), theEcorePackage.getEString(), "name", null, 1, 1, RichStringChapter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringSectionEClass, RichStringSection.class, "RichStringSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringSection_Name(), theEcorePackage.getEString(), "name", null, 1, 1, RichStringSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringSubsectionEClass, RichStringSubsection.class, "RichStringSubsection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringSubsection_Name(), theEcorePackage.getEString(), "name", null, 1, 1, RichStringSubsection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringURLEClass, RichStringURL.class, "RichStringURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringURL_Location(), theEcorePackage.getEString(), "location", null, 1, 1, RichStringURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringURL_Text(), theXbasePackage.getXExpression(), null, "text", null, 0, 1, RichStringURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringRefEClass, RichStringRef.class, "RichStringRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringRef_RefId(), theEcorePackage.getEString(), "refId", null, 0, 1, RichStringRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringBoldEClass, RichStringBold.class, "RichStringBold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringUnderlineEClass, RichStringUnderline.class, "RichStringUnderline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringItalicEClass, RichStringItalic.class, "RichStringItalic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringImgEClass, RichStringImg.class, "RichStringImg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringImg_Src(), theEcorePackage.getEString(), "src", null, 1, 1, RichStringImg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringImg_Alt(), theEcorePackage.getEString(), "alt", null, 0, 1, RichStringImg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringMailtoEClass, RichStringMailto.class, "RichStringMailto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringMailto_Email(), theEcorePackage.getEString(), "email", null, 1, 1, RichStringMailto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringMailto_Content(), theXbasePackage.getXExpression(), null, "content", null, 0, 1, RichStringMailto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringSkypeEClass, RichStringSkype.class, "RichStringSkype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringSkype_Target(), theEcorePackage.getEString(), "target", null, 1, 1, RichStringSkype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringSkype_Content(), theXbasePackage.getXExpression(), null, "content", null, 0, 1, RichStringSkype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringMovieEClass, RichStringMovie.class, "RichStringMovie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringMovie_Src(), theEcorePackage.getEString(), "src", null, 1, 1, RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMovie_Width(), theEcorePackage.getEString(), "width", null, 1, 1, RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMovie_Height(), theEcorePackage.getEString(), "height", null, 1, 1, RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMovie_Type(), theEcorePackage.getEString(), "type", null, 1, 1, RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringMovie_Content(), theXbasePackage.getXExpression(), null, "content", null, 0, 1, RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringCodeEClass, RichStringCode.class, "RichStringCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringCode_Lang(), theEcorePackage.getEString(), "lang", null, 0, 1, RichStringCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringCode_Content(), theXbasePackage.getXExpression(), null, "content", null, 0, 1, RichStringCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringTableEClass, RichStringTable.class, "RichStringTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringTableRowEClass, RichStringTableRow.class, "RichStringTableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringTableCellEClass, RichStringTableCell.class, "RichStringTableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringOpenViewEClass, RichStringOpenView.class, "RichStringOpenView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringOpenView_ViewId(), theEcorePackage.getEString(), "viewId", null, 0, 1, RichStringOpenView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringStartProcessEClass, RichStringStartProcess.class, "RichStringStartProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringStartProcess_ProcessId(), theEcorePackage.getEString(), "processId", null, 0, 1, RichStringStartProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringEntityRefEClass, RichStringEntityRef.class, "RichStringEntityRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringEntityRef_EntityDoc(), theLunDocPackage.getLDocEntityDocument(), null, "entityDoc", null, 0, 1, RichStringEntityRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringDTORefEClass, RichStringDTORef.class, "RichStringDTORef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringDTORef_DtoDoc(), theLunDocPackage.getLDocDtoDocument(), null, "dtoDoc", null, 0, 1, RichStringDTORef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringTaskRefEClass, RichStringTaskRef.class, "RichStringTaskRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringTaskRef_TaskDoc(), theLunDocPackage.getLDocHumanTaskDocument(), null, "taskDoc", null, 0, 1, RichStringTaskRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringProcessRefEClass, RichStringProcessRef.class, "RichStringProcessRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringProcessRef_BpmDoc(), theLunDocPackage.getLDocBPMProcessDocument(), null, "bpmDoc", null, 0, 1, RichStringProcessRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringViewRefEClass, RichStringViewRef.class, "RichStringViewRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringViewRef_ViewDoc(), theLunDocPackage.getLDocViewDocument(), null, "viewDoc", null, 0, 1, RichStringViewRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringUIRefEClass, RichStringUIRef.class, "RichStringUIRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringUIRef_UiDoc(), theLunDocPackage.getLDocUIDocument(), null, "uiDoc", null, 0, 1, RichStringUIRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringListEClass, RichStringList.class, "RichStringList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringOrderedListEClass, RichStringOrderedList.class, "RichStringOrderedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringListElementEClass, RichStringListElement.class, "RichStringListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringSpanEClass, RichStringSpan.class, "RichStringSpan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringBoxEClass, RichStringBox.class, "RichStringBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringBox_Error(), theEcorePackage.getEBoolean(), "error", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringBox_Warning(), theEcorePackage.getEBoolean(), "warning", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringBox_Info(), theEcorePackage.getEBoolean(), "info", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringBox_Abstracts(), theEcorePackage.getEBoolean(), "abstracts", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringBox_Checklist(), theEcorePackage.getEBoolean(), "checklist", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringBox_Bio(), theEcorePackage.getEBoolean(), "bio", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringBox_Sidenote(), theEcorePackage.getEBoolean(), "sidenote", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringBox_Title(), theEcorePackage.getEString(), "title", null, 0, 1, RichStringBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringContainerEClass, RichStringContainer.class, "RichStringContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringColumnLayoutEClass, RichStringColumnLayout.class, "RichStringColumnLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringColumnEClass, RichStringColumn.class, "RichStringColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringFooterEClass, RichStringFooter.class, "RichStringFooter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringHeaderEClass, RichStringHeader.class, "RichStringHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringIndexEClass, RichStringIndex.class, "RichStringIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringIndexElementEClass, RichStringIndexElement.class, "RichStringIndexElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringIndexElement_IndexElement(), this.getIndexElement(), null, "indexElement", null, 0, 1, RichStringIndexElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(markupOrientationEEnum, MarkupOrientation.class, "MarkupOrientation");
		addEEnumLiteral(markupOrientationEEnum, MarkupOrientation.LEFT);
		addEEnumLiteral(markupOrientationEEnum, MarkupOrientation.NONE);
		addEEnumLiteral(markupOrientationEEnum, MarkupOrientation.RIGHT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "rootPackage", "richstring"
		   });
	}

} //LunDocRichstringPackageImpl
