/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtype.XtypePackage;
import org.lunifera.doc.dsl.luniferadoc.DocType;
import org.lunifera.doc.dsl.luniferadoc.DocumentInclude;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocFactory;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuniferaDocPackageImpl extends EPackageImpl implements LuniferaDocPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luniferaDocDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum docTypeEEnum = null;

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
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LuniferaDocPackageImpl() {
		super(eNS_URI, LuniferaDocFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LuniferaDocPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LuniferaDocPackage init() {
		if (isInited) return (LuniferaDocPackage)EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI);

		// Obtain or create and register package
		LuniferaDocPackageImpl theLuniferaDocPackage = (LuniferaDocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LuniferaDocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LuniferaDocPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) : DocumentPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);
		RichstringPackageImpl theRichstringPackage = (RichstringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) instanceof RichstringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) : RichstringPackage.eINSTANCE);

		// Create package meta-data objects
		theLuniferaDocPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
		theLayoutPackage.createPackageContents();
		theRichstringPackage.createPackageContents();

		// Initialize created meta-data
		theLuniferaDocPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();
		theRichstringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLuniferaDocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LuniferaDocPackage.eNS_URI, theLuniferaDocPackage);
		return theLuniferaDocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuniferaDocDocument() {
		return luniferaDocDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuniferaDocDocument_Name() {
		return (EAttribute)luniferaDocDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentInclude() {
		return documentIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentInclude_Include() {
		return (EReference)documentIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentInclude_VarName() {
		return (EAttribute)documentIncludeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocType() {
		return docTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuniferaDocFactory getLuniferaDocFactory() {
		return (LuniferaDocFactory)getEFactoryInstance();
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
		luniferaDocDocumentEClass = createEClass(LUNIFERA_DOC_DOCUMENT);
		createEAttribute(luniferaDocDocumentEClass, LUNIFERA_DOC_DOCUMENT__NAME);

		documentIncludeEClass = createEClass(DOCUMENT_INCLUDE);
		createEReference(documentIncludeEClass, DOCUMENT_INCLUDE__INCLUDE);
		createEAttribute(documentIncludeEClass, DOCUMENT_INCLUDE__VAR_NAME);

		// Create enums
		docTypeEEnum = createEEnum(DOC_TYPE);
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
		DocumentPackage theDocumentPackage = (DocumentPackage)EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI);
		LayoutPackage theLayoutPackage = (LayoutPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);
		RichstringPackage theRichstringPackage = (RichstringPackage)EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDocumentPackage);
		getESubpackages().add(theLayoutPackage);
		getESubpackages().add(theRichstringPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(luniferaDocDocumentEClass, LuniferaDocDocument.class, "LuniferaDocDocument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLuniferaDocDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, LuniferaDocDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentIncludeEClass, DocumentInclude.class, "DocumentInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentInclude_Include(), this.getLuniferaDocDocument(), null, "include", null, 0, 1, DocumentInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentInclude_VarName(), ecorePackage.getEString(), "varName", null, 1, 1, DocumentInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(docTypeEEnum, DocType.class, "DocType");
		addEEnumLiteral(docTypeEEnum, DocType.ENTITY);
		addEEnumLiteral(docTypeEEnum, DocType.DTO);
		addEEnumLiteral(docTypeEEnum, DocType.BPM_PROCESS);
		addEEnumLiteral(docTypeEEnum, DocType.BPM_TASK);
		addEEnumLiteral(docTypeEEnum, DocType.VAACLIPSE_VIEW);
		addEEnumLiteral(docTypeEEnum, DocType.UI);

		// Create resource
		createResource(eNS_URI);
	}

} //LuniferaDocPackageImpl
