/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtype.XtypePackage;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg;
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
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringFactory;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class RichstringPackageImpl extends EPackageImpl implements RichstringPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringElseIfEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringLiteralEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringForLoopEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringIfEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringMarkupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringExampleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringH1EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringH2EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringChapterEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringSectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringSubsectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringURLEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringRefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringBoldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringUnderlineEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringItalicEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringImgEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringMailtoEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringSkypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringMovieEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringCodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringTableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringTableRowEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringTableDataEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringOpenViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringStartProcessEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringEntityRefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringDTORefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringProcessRefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringTaskRefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringViewRefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringUIRefEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringOrderedListEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass richStringListElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RichstringPackageImpl() {
		super(eNS_URI, RichstringFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link RichstringPackage#eINSTANCE} when that field is accessed. Clients should
	 * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RichstringPackage init() {
		if (isInited)
			return (RichstringPackage) EPackage.Registry.INSTANCE
					.getEPackage(RichstringPackage.eNS_URI);

		// Obtain or create and register package
		RichstringPackageImpl theRichstringPackage = (RichstringPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RichstringPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new RichstringPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LuniferaDocPackageImpl theLuniferaDocPackage = (LuniferaDocPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LuniferaDocPackage.eNS_URI) instanceof LuniferaDocPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LuniferaDocPackage.eNS_URI) : LuniferaDocPackage.eINSTANCE);
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(DocumentPackage.eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(DocumentPackage.eNS_URI) : DocumentPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);

		// Create package meta-data objects
		theRichstringPackage.createPackageContents();
		theLuniferaDocPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
		theLayoutPackage.createPackageContents();

		// Initialize created meta-data
		theRichstringPackage.initializePackageContents();
		theLuniferaDocPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRichstringPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RichstringPackage.eNS_URI, theRichstringPackage);
		return theRichstringPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringElseIf() {
		return richStringElseIfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringElseIf_If() {
		return (EReference) richStringElseIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringElseIf_Then() {
		return (EReference) richStringElseIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichString() {
		return richStringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringLiteral() {
		return richStringLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringForLoop() {
		return richStringForLoopEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringForLoop_Before() {
		return (EReference) richStringForLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringForLoop_Separator() {
		return (EReference) richStringForLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringForLoop_After() {
		return (EReference) richStringForLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringIf() {
		return richStringIfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringIf_If() {
		return (EReference) richStringIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringIf_Then() {
		return (EReference) richStringIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringIf_ElseIfs() {
		return (EReference) richStringIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringIf_Else() {
		return (EReference) richStringIfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringMarkup() {
		return richStringMarkupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringMarkup_Id() {
		return (EAttribute) richStringMarkupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringMarkup_Class() {
		return (EAttribute) richStringMarkupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringMarkup_Expression() {
		return (EReference) richStringMarkupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringExample() {
		return richStringExampleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringH1() {
		return richStringH1EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringH2() {
		return richStringH2EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringChapter() {
		return richStringChapterEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringSection() {
		return richStringSectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringSubsection() {
		return richStringSubsectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringURL() {
		return richStringURLEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringURL_Location() {
		return (EAttribute) richStringURLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringURL_Text() {
		return (EReference) richStringURLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringRef() {
		return richStringRefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringRef_RefId() {
		return (EAttribute) richStringRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringBold() {
		return richStringBoldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringUnderline() {
		return richStringUnderlineEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringItalic() {
		return richStringItalicEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringImg() {
		return richStringImgEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringImg_Src() {
		return (EAttribute) richStringImgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringImg_Alt() {
		return (EAttribute) richStringImgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringImg_Width() {
		return (EAttribute) richStringImgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringImg_Height() {
		return (EAttribute) richStringImgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringMailto() {
		return richStringMailtoEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringMailto_Email() {
		return (EAttribute) richStringMailtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringMailto_Content() {
		return (EReference) richStringMailtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringSkype() {
		return richStringSkypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringSkype_Target() {
		return (EAttribute) richStringSkypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringSkype_Content() {
		return (EReference) richStringSkypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringMovie() {
		return richStringMovieEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringMovie_Src() {
		return (EAttribute) richStringMovieEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringMovie_Width() {
		return (EAttribute) richStringMovieEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringMovie_Height() {
		return (EAttribute) richStringMovieEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringMovie_Type() {
		return (EAttribute) richStringMovieEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringMovie_Content() {
		return (EReference) richStringMovieEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringCode() {
		return richStringCodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringCode_Lang() {
		return (EAttribute) richStringCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringCode_Content() {
		return (EReference) richStringCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringTable() {
		return richStringTableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringTable_Rows() {
		return (EReference) richStringTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringTableRow() {
		return richStringTableRowEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringTableRow_Columns() {
		return (EReference) richStringTableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringTableData() {
		return richStringTableDataEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringOpenView() {
		return richStringOpenViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringOpenView_ViewId() {
		return (EAttribute) richStringOpenViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringStartProcess() {
		return richStringStartProcessEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getRichStringStartProcess_ProcessId() {
		return (EAttribute) richStringStartProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringEntityRef() {
		return richStringEntityRefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringEntityRef_EntityDoc() {
		return (EReference) richStringEntityRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringDTORef() {
		return richStringDTORefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringDTORef_DtoDoc() {
		return (EReference) richStringDTORefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringProcessRef() {
		return richStringProcessRefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringProcessRef_ProcessDoc() {
		return (EReference) richStringProcessRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringTaskRef() {
		return richStringTaskRefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringTaskRef_TaskDoc() {
		return (EReference) richStringTaskRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringViewRef() {
		return richStringViewRefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringViewRef_ViewDoc() {
		return (EReference) richStringViewRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringUIRef() {
		return richStringUIRefEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringUIRef_UiDoc() {
		return (EReference) richStringUIRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringList() {
		return richStringListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringList_Elements() {
		return (EReference) richStringListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringList_Expressions() {
		return (EReference) richStringListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringOrderedList() {
		return richStringOrderedListEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringOrderedList_Elements() {
		return (EReference) richStringOrderedListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRichStringOrderedList_Expressions() {
		return (EReference) richStringOrderedListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRichStringListElement() {
		return richStringListElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RichstringFactory getRichstringFactory() {
		return (RichstringFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		richStringElseIfEClass = createEClass(RICH_STRING_ELSE_IF);
		createEReference(richStringElseIfEClass, RICH_STRING_ELSE_IF__IF);
		createEReference(richStringElseIfEClass, RICH_STRING_ELSE_IF__THEN);

		richStringEClass = createEClass(RICH_STRING);

		richStringLiteralEClass = createEClass(RICH_STRING_LITERAL);

		richStringForLoopEClass = createEClass(RICH_STRING_FOR_LOOP);
		createEReference(richStringForLoopEClass, RICH_STRING_FOR_LOOP__BEFORE);
		createEReference(richStringForLoopEClass, RICH_STRING_FOR_LOOP__SEPARATOR);
		createEReference(richStringForLoopEClass, RICH_STRING_FOR_LOOP__AFTER);

		richStringIfEClass = createEClass(RICH_STRING_IF);
		createEReference(richStringIfEClass, RICH_STRING_IF__IF);
		createEReference(richStringIfEClass, RICH_STRING_IF__THEN);
		createEReference(richStringIfEClass, RICH_STRING_IF__ELSE_IFS);
		createEReference(richStringIfEClass, RICH_STRING_IF__ELSE);

		richStringMarkupEClass = createEClass(RICH_STRING_MARKUP);
		createEAttribute(richStringMarkupEClass, RICH_STRING_MARKUP__ID);
		createEAttribute(richStringMarkupEClass, RICH_STRING_MARKUP__CLASS);
		createEReference(richStringMarkupEClass, RICH_STRING_MARKUP__EXPRESSION);

		richStringExampleEClass = createEClass(RICH_STRING_EXAMPLE);

		richStringH1EClass = createEClass(RICH_STRING_H1);

		richStringH2EClass = createEClass(RICH_STRING_H2);

		richStringChapterEClass = createEClass(RICH_STRING_CHAPTER);

		richStringSectionEClass = createEClass(RICH_STRING_SECTION);

		richStringSubsectionEClass = createEClass(RICH_STRING_SUBSECTION);

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
		createEAttribute(richStringImgEClass, RICH_STRING_IMG__WIDTH);
		createEAttribute(richStringImgEClass, RICH_STRING_IMG__HEIGHT);

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
		createEReference(richStringTableEClass, RICH_STRING_TABLE__ROWS);

		richStringTableRowEClass = createEClass(RICH_STRING_TABLE_ROW);
		createEReference(richStringTableRowEClass, RICH_STRING_TABLE_ROW__COLUMNS);

		richStringTableDataEClass = createEClass(RICH_STRING_TABLE_DATA);

		richStringOpenViewEClass = createEClass(RICH_STRING_OPEN_VIEW);
		createEAttribute(richStringOpenViewEClass, RICH_STRING_OPEN_VIEW__VIEW_ID);

		richStringStartProcessEClass = createEClass(RICH_STRING_START_PROCESS);
		createEAttribute(richStringStartProcessEClass, RICH_STRING_START_PROCESS__PROCESS_ID);

		richStringEntityRefEClass = createEClass(RICH_STRING_ENTITY_REF);
		createEReference(richStringEntityRefEClass, RICH_STRING_ENTITY_REF__ENTITY_DOC);

		richStringDTORefEClass = createEClass(RICH_STRING_DTO_REF);
		createEReference(richStringDTORefEClass, RICH_STRING_DTO_REF__DTO_DOC);

		richStringProcessRefEClass = createEClass(RICH_STRING_PROCESS_REF);
		createEReference(richStringProcessRefEClass, RICH_STRING_PROCESS_REF__PROCESS_DOC);

		richStringTaskRefEClass = createEClass(RICH_STRING_TASK_REF);
		createEReference(richStringTaskRefEClass, RICH_STRING_TASK_REF__TASK_DOC);

		richStringViewRefEClass = createEClass(RICH_STRING_VIEW_REF);
		createEReference(richStringViewRefEClass, RICH_STRING_VIEW_REF__VIEW_DOC);

		richStringUIRefEClass = createEClass(RICH_STRING_UI_REF);
		createEReference(richStringUIRefEClass, RICH_STRING_UI_REF__UI_DOC);

		richStringListEClass = createEClass(RICH_STRING_LIST);
		createEReference(richStringListEClass, RICH_STRING_LIST__ELEMENTS);
		createEReference(richStringListEClass, RICH_STRING_LIST__EXPRESSIONS);

		richStringOrderedListEClass = createEClass(RICH_STRING_ORDERED_LIST);
		createEReference(richStringOrderedListEClass, RICH_STRING_ORDERED_LIST__ELEMENTS);
		createEReference(richStringOrderedListEClass, RICH_STRING_ORDERED_LIST__EXPRESSIONS);

		richStringListElementEClass = createEClass(RICH_STRING_LIST_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XbasePackage theXbasePackage = (XbasePackage) EPackage.Registry.INSTANCE
				.getEPackage(XbasePackage.eNS_URI);
		DocumentPackage theDocumentPackage = (DocumentPackage) EPackage.Registry.INSTANCE
				.getEPackage(DocumentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		richStringEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());
		richStringLiteralEClass.getESuperTypes().add(theXbasePackage.getXStringLiteral());
		richStringForLoopEClass.getESuperTypes().add(theXbasePackage.getXForLoopExpression());
		richStringIfEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringMarkupEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringExampleEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH1EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH2EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringChapterEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringSectionEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringSubsectionEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringURLEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringBoldEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringUnderlineEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringItalicEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringImgEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringMailtoEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringSkypeEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringMovieEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringCodeEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringTableEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringTableRowEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringTableDataEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringOpenViewEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringStartProcessEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringEntityRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringDTORefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringProcessRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringTaskRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringViewRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringUIRefEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringListEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringOrderedListEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringListElementEClass.getESuperTypes().add(this.getRichStringMarkup());

		// Initialize classes and features; add operations and parameters
		initEClass(richStringElseIfEClass, RichStringElseIf.class, "RichStringElseIf",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringElseIf_If(), theXbasePackage.getXExpression(), null, "if",
				null, 0, 1, RichStringElseIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRichStringElseIf_Then(), theXbasePackage.getXExpression(), null, "then",
				null, 0, 1, RichStringElseIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(richStringEClass, RichString.class, "RichString", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringLiteralEClass, RichStringLiteral.class, "RichStringLiteral",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringForLoopEClass, RichStringForLoop.class, "RichStringForLoop",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringForLoop_Before(), theXbasePackage.getXExpression(), null,
				"before", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringForLoop_Separator(), theXbasePackage.getXExpression(), null,
				"separator", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringForLoop_After(), theXbasePackage.getXExpression(), null,
				"after", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringIfEClass, RichStringIf.class, "RichStringIf", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringIf_If(), theXbasePackage.getXExpression(), null, "if", null, 0,
				1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringIf_Then(), theXbasePackage.getXExpression(), null, "then",
				null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRichStringIf_ElseIfs(), this.getRichStringElseIf(), null, "elseIfs",
				null, 0, -1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRichStringIf_Else(), theXbasePackage.getXExpression(), null, "else",
				null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(richStringMarkupEClass, RichStringMarkup.class, "RichStringMarkup",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringMarkup_Id(), ecorePackage.getEString(), "id", null, 0, 1,
				RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMarkup_Class(), ecorePackage.getEString(), "class", null, 0, 1,
				RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringMarkup_Expression(), theXbasePackage.getXExpression(), null,
				"expression", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringExampleEClass, RichStringExample.class, "RichStringExample",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH1EClass, RichStringH1.class, "RichStringH1", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH2EClass, RichStringH2.class, "RichStringH2", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringChapterEClass, RichStringChapter.class, "RichStringChapter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringSectionEClass, RichStringSection.class, "RichStringSection",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringSubsectionEClass, RichStringSubsection.class, "RichStringSubsection",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringURLEClass, RichStringURL.class, "RichStringURL", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringURL_Location(), ecorePackage.getEString(), "location", null, 1,
				1, RichStringURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringURL_Text(), theXbasePackage.getXExpression(), null, "text",
				null, 0, 1, RichStringURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(richStringRefEClass, RichStringRef.class, "RichStringRef", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringRef_RefId(), ecorePackage.getEString(), "refId", null, 0, 1,
				RichStringRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringBoldEClass, RichStringBold.class, "RichStringBold", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringUnderlineEClass, RichStringUnderline.class, "RichStringUnderline",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringItalicEClass, RichStringItalic.class, "RichStringItalic",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringImgEClass, RichStringImg.class, "RichStringImg", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringImg_Src(), ecorePackage.getEString(), "src", null, 1, 1,
				RichStringImg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringImg_Alt(), ecorePackage.getEString(), "alt", null, 1, 1,
				RichStringImg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringImg_Width(), ecorePackage.getEString(), "width", null, 1, 1,
				RichStringImg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringImg_Height(), ecorePackage.getEString(), "height", null, 1, 1,
				RichStringImg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringMailtoEClass, RichStringMailto.class, "RichStringMailto",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringMailto_Email(), ecorePackage.getEString(), "email", null, 1, 1,
				RichStringMailto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringMailto_Content(), theXbasePackage.getXExpression(), null,
				"content", null, 0, 1, RichStringMailto.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringSkypeEClass, RichStringSkype.class, "RichStringSkype", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringSkype_Target(), ecorePackage.getEString(), "target", null, 1,
				1, RichStringSkype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringSkype_Content(), theXbasePackage.getXExpression(), null,
				"content", null, 0, 1, RichStringSkype.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringMovieEClass, RichStringMovie.class, "RichStringMovie", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringMovie_Src(), ecorePackage.getEString(), "src", null, 1, 1,
				RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMovie_Width(), ecorePackage.getEString(), "width", null, 1, 1,
				RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMovie_Height(), ecorePackage.getEString(), "height", null, 1,
				1, RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichStringMovie_Type(), ecorePackage.getEString(), "type", null, 1, 1,
				RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringMovie_Content(), theXbasePackage.getXExpression(), null,
				"content", null, 0, 1, RichStringMovie.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringCodeEClass, RichStringCode.class, "RichStringCode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringCode_Lang(), ecorePackage.getEString(), "lang", null, 0, 1,
				RichStringCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringCode_Content(), theXbasePackage.getXExpression(), null,
				"content", null, 0, 1, RichStringCode.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringTableEClass, RichStringTable.class, "RichStringTable", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringTable_Rows(), this.getRichStringTableRow(), null, "rows", null,
				0, -1, RichStringTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(richStringTableRowEClass, RichStringTableRow.class, "RichStringTableRow",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringTableRow_Columns(), this.getRichStringTableData(), null,
				"columns", null, 0, -1, RichStringTableRow.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringTableDataEClass, RichStringTableData.class, "RichStringTableData",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringOpenViewEClass, RichStringOpenView.class, "RichStringOpenView",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringOpenView_ViewId(), ecorePackage.getEString(), "viewId", null,
				0, 1, RichStringOpenView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringStartProcessEClass, RichStringStartProcess.class,
				"RichStringStartProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichStringStartProcess_ProcessId(), ecorePackage.getEString(),
				"processId", null, 0, 1, RichStringStartProcess.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringEntityRefEClass, RichStringEntityRef.class, "RichStringEntityRef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringEntityRef_EntityDoc(), theDocumentPackage.getEntityDocument(),
				null, "entityDoc", null, 0, 1, RichStringEntityRef.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringDTORefEClass, RichStringDTORef.class, "RichStringDTORef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringDTORef_DtoDoc(), theDocumentPackage.getDTODocument(), null,
				"dtoDoc", null, 0, 1, RichStringDTORef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringProcessRefEClass, RichStringProcessRef.class, "RichStringProcessRef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringProcessRef_ProcessDoc(),
				theDocumentPackage.getBPMProcessDocument(), null, "processDoc", null, 0, 1,
				RichStringProcessRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(richStringTaskRefEClass, RichStringTaskRef.class, "RichStringTaskRef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringTaskRef_TaskDoc(),
				theDocumentPackage.getBPMHumanTaskDocument(), null, "taskDoc", null, 0, 1,
				RichStringTaskRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringViewRefEClass, RichStringViewRef.class, "RichStringViewRef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringViewRef_ViewDoc(),
				theDocumentPackage.getVaaclipseViewDocument(), null, "viewDoc", null, 0, 1,
				RichStringViewRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringUIRefEClass, RichStringUIRef.class, "RichStringUIRef", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringUIRef_UiDoc(), theDocumentPackage.getUIDocument(), null,
				"uiDoc", null, 0, 1, RichStringUIRef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringListEClass, RichStringList.class, "RichStringList", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringList_Elements(), this.getRichStringListElement(), null,
				"elements", null, 0, -1, RichStringList.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringList_Expressions(), theXbasePackage.getXExpression(), null,
				"expressions", null, 0, -1, RichStringList.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(richStringOrderedListEClass, RichStringOrderedList.class,
				"RichStringOrderedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringOrderedList_Elements(), this.getRichStringListElement(), null,
				"elements", null, 0, -1, RichStringOrderedList.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringOrderedList_Expressions(), theXbasePackage.getXExpression(),
				null, "expressions", null, 0, -1, RichStringOrderedList.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringListElementEClass, RichStringListElement.class,
				"RichStringListElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} // RichstringPackageImpl
