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
import org.lunifera.doc.dsl.luniferadoc.document.DTODescription;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperties;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentFactory;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDescription;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.document.EntityField;
import org.lunifera.doc.dsl.luniferadoc.document.EntityFields;
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument;
import org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage;
import org.lunifera.doc.dsl.luniferadoc.markup.impl.MarkupPackageImpl;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocumentPackageImpl extends EPackageImpl implements DocumentPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass luniferaDocDocumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityDocumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityFieldsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityFieldEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dtoDocumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dtoDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dtoPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dtoPropertyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bpmProcessDocumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass bpmTaskDocumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vaaclipseViewDocumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass uiDocumentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass generalDocumentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocumentPackageImpl() {
		super(eNS_URI, DocumentFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DocumentPackage#eINSTANCE} when that field is accessed. Clients should
	 * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocumentPackage init() {
		if (isInited)
			return (DocumentPackage) EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI);

		// Obtain or create and register package
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new DocumentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LuniferaDocPackageImpl theLuniferaDocPackage = (LuniferaDocPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LuniferaDocPackage.eNS_URI) instanceof LuniferaDocPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LuniferaDocPackage.eNS_URI) : LuniferaDocPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);
		RichstringPackageImpl theRichstringPackage = (RichstringPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RichstringPackage.eNS_URI) instanceof RichstringPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(RichstringPackage.eNS_URI) : RichstringPackage.eINSTANCE);
		MarkupPackageImpl theMarkupPackage = (MarkupPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(MarkupPackage.eNS_URI) instanceof MarkupPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(MarkupPackage.eNS_URI) : MarkupPackage.eINSTANCE);

		// Create package meta-data objects
		theDocumentPackage.createPackageContents();
		theLuniferaDocPackage.createPackageContents();
		theLayoutPackage.createPackageContents();
		theRichstringPackage.createPackageContents();
		theMarkupPackage.createPackageContents();

		// Initialize created meta-data
		theDocumentPackage.initializePackageContents();
		theLuniferaDocPackage.initializePackageContents();
		theLayoutPackage.initializePackageContents();
		theRichstringPackage.initializePackageContents();
		theMarkupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocumentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocumentPackage.eNS_URI, theDocumentPackage);
		return theDocumentPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLuniferaDocDocument() {
		return luniferaDocDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityDocument() {
		return entityDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityDocument_EntityClass() {
		return (EAttribute) entityDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDocument_Description() {
		return (EReference) entityDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDocument_Fields() {
		return (EReference) entityDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityDescription() {
		return entityDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityDescription_Content() {
		return (EReference) entityDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityFields() {
		return entityFieldsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityFields_Fields() {
		return (EReference) entityFieldsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityField() {
		return entityFieldEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityField_Name() {
		return (EAttribute) entityFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityField_Type() {
		return (EAttribute) entityFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityField_Length() {
		return (EAttribute) entityFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityField_Pk() {
		return (EAttribute) entityFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEntityField_Nullable() {
		return (EAttribute) entityFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityField_Description() {
		return (EReference) entityFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDTODocument() {
		return dtoDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDTODocument_DtoClass() {
		return (EAttribute) dtoDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTODocument_Description() {
		return (EReference) dtoDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTODocument_Properties() {
		return (EReference) dtoDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDTODescription() {
		return dtoDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTODescription_Content() {
		return (EReference) dtoDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDTOProperties() {
		return dtoPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTOProperties_Properties() {
		return (EReference) dtoPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDTOProperty() {
		return dtoPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDTOProperty_Name() {
		return (EAttribute) dtoPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTOProperty_Description() {
		return (EReference) dtoPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBPMProcessDocument() {
		return bpmProcessDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBPMTaskDocument() {
		return bpmTaskDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVaaclipseViewDocument() {
		return vaaclipseViewDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUIDocument() {
		return uiDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGeneralDocument() {
		return generalDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGeneralDocument_Includes() {
		return (EReference) generalDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentFactory getDocumentFactory() {
		return (DocumentFactory) getEFactoryInstance();
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
		luniferaDocDocumentEClass = createEClass(LUNIFERA_DOC_DOCUMENT);

		entityDocumentEClass = createEClass(ENTITY_DOCUMENT);
		createEAttribute(entityDocumentEClass, ENTITY_DOCUMENT__ENTITY_CLASS);
		createEReference(entityDocumentEClass, ENTITY_DOCUMENT__DESCRIPTION);
		createEReference(entityDocumentEClass, ENTITY_DOCUMENT__FIELDS);

		entityDescriptionEClass = createEClass(ENTITY_DESCRIPTION);
		createEReference(entityDescriptionEClass, ENTITY_DESCRIPTION__CONTENT);

		entityFieldsEClass = createEClass(ENTITY_FIELDS);
		createEReference(entityFieldsEClass, ENTITY_FIELDS__FIELDS);

		entityFieldEClass = createEClass(ENTITY_FIELD);
		createEAttribute(entityFieldEClass, ENTITY_FIELD__NAME);
		createEAttribute(entityFieldEClass, ENTITY_FIELD__TYPE);
		createEAttribute(entityFieldEClass, ENTITY_FIELD__LENGTH);
		createEAttribute(entityFieldEClass, ENTITY_FIELD__PK);
		createEAttribute(entityFieldEClass, ENTITY_FIELD__NULLABLE);
		createEReference(entityFieldEClass, ENTITY_FIELD__DESCRIPTION);

		dtoDocumentEClass = createEClass(DTO_DOCUMENT);
		createEAttribute(dtoDocumentEClass, DTO_DOCUMENT__DTO_CLASS);
		createEReference(dtoDocumentEClass, DTO_DOCUMENT__DESCRIPTION);
		createEReference(dtoDocumentEClass, DTO_DOCUMENT__PROPERTIES);

		dtoDescriptionEClass = createEClass(DTO_DESCRIPTION);
		createEReference(dtoDescriptionEClass, DTO_DESCRIPTION__CONTENT);

		dtoPropertiesEClass = createEClass(DTO_PROPERTIES);
		createEReference(dtoPropertiesEClass, DTO_PROPERTIES__PROPERTIES);

		dtoPropertyEClass = createEClass(DTO_PROPERTY);
		createEAttribute(dtoPropertyEClass, DTO_PROPERTY__NAME);
		createEReference(dtoPropertyEClass, DTO_PROPERTY__DESCRIPTION);

		bpmProcessDocumentEClass = createEClass(BPM_PROCESS_DOCUMENT);

		bpmTaskDocumentEClass = createEClass(BPM_TASK_DOCUMENT);

		vaaclipseViewDocumentEClass = createEClass(VAACLIPSE_VIEW_DOCUMENT);

		uiDocumentEClass = createEClass(UI_DOCUMENT);

		generalDocumentEClass = createEClass(GENERAL_DOCUMENT);
		createEReference(generalDocumentEClass, GENERAL_DOCUMENT__INCLUDES);
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
		LuniferaDocPackage theLuniferaDocPackage = (LuniferaDocPackage) EPackage.Registry.INSTANCE
				.getEPackage(LuniferaDocPackage.eNS_URI);
		RichstringPackage theRichstringPackage = (RichstringPackage) EPackage.Registry.INSTANCE
				.getEPackage(RichstringPackage.eNS_URI);
		LayoutPackage theLayoutPackage = (LayoutPackage) EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		luniferaDocDocumentEClass.getESuperTypes().add(theLuniferaDocPackage.getNamedDocument());
		entityDocumentEClass.getESuperTypes().add(this.getLuniferaDocDocument());
		dtoDocumentEClass.getESuperTypes().add(this.getLuniferaDocDocument());
		bpmProcessDocumentEClass.getESuperTypes().add(this.getLuniferaDocDocument());
		bpmTaskDocumentEClass.getESuperTypes().add(this.getLuniferaDocDocument());
		vaaclipseViewDocumentEClass.getESuperTypes().add(this.getLuniferaDocDocument());
		uiDocumentEClass.getESuperTypes().add(this.getLuniferaDocDocument());
		generalDocumentEClass.getESuperTypes().add(theLayoutPackage.getLuniferaDocLayout());

		// Initialize classes and features; add operations and parameters
		initEClass(luniferaDocDocumentEClass, LuniferaDocDocument.class, "LuniferaDocDocument", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityDocumentEClass, EntityDocument.class, "EntityDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityDocument_EntityClass(), ecorePackage.getEString(), "entityClass", null, 0, 1,
				EntityDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEntityDocument_Description(), this.getEntityDescription(), null, "description", null, 0, 1,
				EntityDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityDocument_Fields(), this.getEntityFields(), null, "fields", null, 0, 1,
				EntityDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityDescriptionEClass, EntityDescription.class, "EntityDescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityDescription_Content(), theRichstringPackage.getRichString(), null, "content", null, 0,
				1, EntityDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityFieldsEClass, EntityFields.class, "EntityFields", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityFields_Fields(), this.getEntityField(), null, "fields", null, 0, -1,
				EntityFields.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityFieldEClass, EntityField.class, "EntityField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntityField_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityField_Type(), ecorePackage.getEString(), "type", null, 0, 1, EntityField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityField_Length(), ecorePackage.getEInt(), "length", null, 0, 1, EntityField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityField_Pk(), ecorePackage.getEBoolean(), "pk", null, 0, 1, EntityField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityField_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1,
				EntityField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEntityField_Description(), theRichstringPackage.getRichString(), null, "description", null,
				0, 1, EntityField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoDocumentEClass, DTODocument.class, "DTODocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTODocument_DtoClass(), ecorePackage.getEString(), "dtoClass", null, 0, 1, DTODocument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTODocument_Description(), this.getDTODescription(), null, "description", null, 0, 1,
				DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTODocument_Properties(), this.getDTOProperties(), null, "properties", null, 0, 1,
				DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoDescriptionEClass, DTODescription.class, "DTODescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTODescription_Content(), theRichstringPackage.getRichString(), null, "content", null, 0, 1,
				DTODescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoPropertiesEClass, DTOProperties.class, "DTOProperties", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTOProperties_Properties(), this.getDTOProperty(), null, "properties", null, 0, -1,
				DTOProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoPropertyEClass, DTOProperty.class, "DTOProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTOProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DTOProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTOProperty_Description(), theRichstringPackage.getRichString(), null, "description", null,
				0, 1, DTOProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpmProcessDocumentEClass, BPMProcessDocument.class, "BPMProcessDocument", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmTaskDocumentEClass, BPMTaskDocument.class, "BPMTaskDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaaclipseViewDocumentEClass, VaaclipseViewDocument.class, "VaaclipseViewDocument", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiDocumentEClass, UIDocument.class, "UIDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalDocumentEClass, GeneralDocument.class, "GeneralDocument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralDocument_Includes(), theLuniferaDocPackage.getDocumentInclude(), null, "includes",
				null, 0, -1, GeneralDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} // DocumentPackageImpl
