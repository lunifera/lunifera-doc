/**
 */
package org.lunifera.doc.dsl.luniferadoc.markup.impl;

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
import org.lunifera.doc.dsl.luniferadoc.markup.MarkupFactory;
import org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage;
import org.lunifera.doc.dsl.luniferadoc.markup.TagURL;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MarkupPackageImpl extends EPackageImpl implements MarkupPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagURLEClass = null;

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
	 * @see org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MarkupPackageImpl() {
		super(eNS_URI, MarkupFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MarkupPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MarkupPackage init() {
		if (isInited) return (MarkupPackage)EPackage.Registry.INSTANCE.getEPackage(MarkupPackage.eNS_URI);

		// Obtain or create and register package
		MarkupPackageImpl theMarkupPackage = (MarkupPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MarkupPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MarkupPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LuniferaDocPackageImpl theLuniferaDocPackage = (LuniferaDocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) instanceof LuniferaDocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) : LuniferaDocPackage.eINSTANCE);
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) : DocumentPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);
		RichstringPackageImpl theRichstringPackage = (RichstringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) instanceof RichstringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) : RichstringPackage.eINSTANCE);

		// Create package meta-data objects
		theMarkupPackage.createPackageContents();
		theLuniferaDocPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
		theLayoutPackage.createPackageContents();
		theRichstringPackage.createPackageContents();

		// Initialize created meta-data
		theMarkupPackage.initializePackageContents();
		theLuniferaDocPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();
		theRichstringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMarkupPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MarkupPackage.eNS_URI, theMarkupPackage);
		return theMarkupPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagURL() {
		return tagURLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagURL_Url() {
		return (EAttribute)tagURLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagURL_Text() {
		return (EReference)tagURLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupFactory getMarkupFactory() {
		return (MarkupFactory)getEFactoryInstance();
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
		tagURLEClass = createEClass(TAG_URL);
		createEAttribute(tagURLEClass, TAG_URL__URL);
		createEReference(tagURLEClass, TAG_URL__TEXT);
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
		RichstringPackage theRichstringPackage = (RichstringPackage)EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(tagURLEClass, TagURL.class, "TagURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagURL_Url(), ecorePackage.getEString(), "url", null, 1, 1, TagURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTagURL_Text(), theRichstringPackage.getRichString(), null, "text", null, 0, 1, TagURL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //MarkupPackageImpl
