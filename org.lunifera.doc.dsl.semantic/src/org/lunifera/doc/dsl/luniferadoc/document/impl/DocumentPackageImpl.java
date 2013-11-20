/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtype.XtypePackage;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTOHeader;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentFactory;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument;
import org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl;
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
public class DocumentPackageImpl extends EPackageImpl implements DocumentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoDetailsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmProcessDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmTaskDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaaclipseViewDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalDocumentEClass = null;

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
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocumentPackageImpl() {
		super(eNS_URI, DocumentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DocumentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocumentPackage init() {
		if (isInited) return (DocumentPackage)EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI);

		// Obtain or create and register package
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DocumentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LuniferaDocPackageImpl theLuniferaDocPackage = (LuniferaDocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) instanceof LuniferaDocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) : LuniferaDocPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);
		RichstringPackageImpl theRichstringPackage = (RichstringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) instanceof RichstringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) : RichstringPackage.eINSTANCE);

		// Create package meta-data objects
		theDocumentPackage.createPackageContents();
		theLuniferaDocPackage.createPackageContents();
		theLayoutPackage.createPackageContents();
		theRichstringPackage.createPackageContents();

		// Initialize created meta-data
		theDocumentPackage.initializePackageContents();
		theLuniferaDocPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();
		theRichstringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentPackage.eNS_URI, theDocumentPackage);
		return theDocumentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTODocument() {
		return dtoDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTODocument_DtoClass() {
		return (EAttribute)dtoDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTODocument_Header() {
		return (EReference)dtoDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTODocument_Details() {
		return (EReference)dtoDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTOHeader() {
		return dtoHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTOHeader_Content() {
		return (EReference)dtoHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTODetails() {
		return dtoDetailsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTODetails_Properties() {
		return (EReference)dtoDetailsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTOProperty() {
		return dtoPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDTOProperty_Name() {
		return (EAttribute)dtoPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDTOProperty_Description() {
		return (EReference)dtoPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityDocument() {
		return entityDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMProcessDocument() {
		return bpmProcessDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMTaskDocument() {
		return bpmTaskDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVaaclipseViewDocument() {
		return vaaclipseViewDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIDocument() {
		return uiDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralDocument() {
		return generalDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralDocument_Includes() {
		return (EReference)generalDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentFactory getDocumentFactory() {
		return (DocumentFactory)getEFactoryInstance();
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
		dtoDocumentEClass = createEClass(DTO_DOCUMENT);
		createEAttribute(dtoDocumentEClass, DTO_DOCUMENT__DTO_CLASS);
		createEReference(dtoDocumentEClass, DTO_DOCUMENT__HEADER);
		createEReference(dtoDocumentEClass, DTO_DOCUMENT__DETAILS);

		dtoHeaderEClass = createEClass(DTO_HEADER);
		createEReference(dtoHeaderEClass, DTO_HEADER__CONTENT);

		dtoDetailsEClass = createEClass(DTO_DETAILS);
		createEReference(dtoDetailsEClass, DTO_DETAILS__PROPERTIES);

		dtoPropertyEClass = createEClass(DTO_PROPERTY);
		createEAttribute(dtoPropertyEClass, DTO_PROPERTY__NAME);
		createEReference(dtoPropertyEClass, DTO_PROPERTY__DESCRIPTION);

		entityDocumentEClass = createEClass(ENTITY_DOCUMENT);

		bpmProcessDocumentEClass = createEClass(BPM_PROCESS_DOCUMENT);

		bpmTaskDocumentEClass = createEClass(BPM_TASK_DOCUMENT);

		vaaclipseViewDocumentEClass = createEClass(VAACLIPSE_VIEW_DOCUMENT);

		uiDocumentEClass = createEClass(UI_DOCUMENT);

		generalDocumentEClass = createEClass(GENERAL_DOCUMENT);
		createEReference(generalDocumentEClass, GENERAL_DOCUMENT__INCLUDES);
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
		LuniferaDocPackage theLuniferaDocPackage = (LuniferaDocPackage)EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI);
		RichstringPackage theRichstringPackage = (RichstringPackage)EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI);
		LayoutPackage theLayoutPackage = (LayoutPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dtoDocumentEClass.getESuperTypes().add(theLuniferaDocPackage.getLuniferaDocDocument());
		entityDocumentEClass.getESuperTypes().add(theLuniferaDocPackage.getLuniferaDocDocument());
		bpmProcessDocumentEClass.getESuperTypes().add(theLuniferaDocPackage.getLuniferaDocDocument());
		bpmTaskDocumentEClass.getESuperTypes().add(theLuniferaDocPackage.getLuniferaDocDocument());
		vaaclipseViewDocumentEClass.getESuperTypes().add(theLuniferaDocPackage.getLuniferaDocDocument());
		uiDocumentEClass.getESuperTypes().add(theLuniferaDocPackage.getLuniferaDocDocument());
		generalDocumentEClass.getESuperTypes().add(theLayoutPackage.getLuniferaDocLayout());

		// Initialize classes and features; add operations and parameters
		initEClass(dtoDocumentEClass, DTODocument.class, "DTODocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTODocument_DtoClass(), ecorePackage.getEString(), "dtoClass", null, 0, 1, DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTODocument_Header(), this.getDTOHeader(), null, "header", null, 0, 1, DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTODocument_Details(), this.getDTODetails(), null, "details", null, 0, 1, DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoHeaderEClass, DTOHeader.class, "DTOHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTOHeader_Content(), theRichstringPackage.getRichString(), null, "content", null, 0, 1, DTOHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoDetailsEClass, DTODetails.class, "DTODetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTODetails_Properties(), this.getDTOProperty(), null, "properties", null, 0, -1, DTODetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoPropertyEClass, DTOProperty.class, "DTOProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTOProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DTOProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTOProperty_Description(), theRichstringPackage.getRichString(), null, "description", null, 0, 1, DTOProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDocumentEClass, EntityDocument.class, "EntityDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmProcessDocumentEClass, BPMProcessDocument.class, "BPMProcessDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmTaskDocumentEClass, BPMTaskDocument.class, "BPMTaskDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaaclipseViewDocumentEClass, VaaclipseViewDocument.class, "VaaclipseViewDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiDocumentEClass, UIDocument.class, "UIDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalDocumentEClass, GeneralDocument.class, "GeneralDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralDocument_Includes(), theLuniferaDocPackage.getDocumentInclude(), null, "includes", null, 0, -1, GeneralDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DocumentPackageImpl
