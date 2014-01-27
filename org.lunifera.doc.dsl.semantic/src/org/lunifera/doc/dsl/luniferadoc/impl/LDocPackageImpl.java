/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocFactory;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocPackage;
import org.lunifera.doc.dsl.luniferadoc.LDocType;
import org.lunifera.doc.dsl.luniferadoc.LDocUiDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;

import org.lunifera.doc.dsl.luniferadoc.richstring.LDocRichstringPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.impl.LDocRichstringPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDocPackageImpl extends EPackageImpl implements LDocPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocNamedDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocEntityDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocEntityFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocDtoDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocDtoPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocBPMProcessDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocHumanTaskDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocViewDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocUiDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lDocLayouterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lDocTypeEEnum = null;

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
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LDocPackageImpl() {
		super(eNS_URI, LDocFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LDocPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LDocPackage init() {
		if (isInited) return (LDocPackage)EPackage.Registry.INSTANCE.getEPackage(LDocPackage.eNS_URI);

		// Obtain or create and register package
		LDocPackageImpl theLDocPackage = (LDocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LDocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LDocPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LDocRichstringPackageImpl theLDocRichstringPackage = (LDocRichstringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LDocRichstringPackage.eNS_URI) instanceof LDocRichstringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LDocRichstringPackage.eNS_URI) : LDocRichstringPackage.eINSTANCE);

		// Create package meta-data objects
		theLDocPackage.createPackageContents();
		theLDocRichstringPackage.createPackageContents();

		// Initialize created meta-data
		theLDocPackage.initializePackageContents();
		theLDocRichstringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLDocPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LDocPackage.eNS_URI, theLDocPackage);
		return theLDocPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocNamedDocument() {
		return lDocNamedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocNamedDocument_Name() {
		return (EAttribute)lDocNamedDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocNamedDocument_Language() {
		return (EAttribute)lDocNamedDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocInclude() {
		return lDocIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocInclude_Document() {
		return (EReference)lDocIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocInclude_VarName() {
		return (EAttribute)lDocIncludeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocInclude_Provided() {
		return (EAttribute)lDocIncludeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocInclude_ProvidedType() {
		return (EAttribute)lDocIncludeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocInclude_ProvidedJVMType() {
		return (EReference)lDocIncludeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocDocument() {
		return lDocDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocDocument_Description() {
		return (EReference)lDocDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocEntityDocument() {
		return lDocEntityDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocEntityDocument_EntityClass() {
		return (EAttribute)lDocEntityDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocEntityDocument_Fields() {
		return (EReference)lDocEntityDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocEntityField() {
		return lDocEntityFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocEntityField_Name() {
		return (EAttribute)lDocEntityFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocEntityField_Description() {
		return (EReference)lDocEntityFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocDtoDocument() {
		return lDocDtoDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocDtoDocument_DtoClass() {
		return (EAttribute)lDocDtoDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocDtoDocument_Fields() {
		return (EReference)lDocDtoDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocDtoProperty() {
		return lDocDtoPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocDtoProperty_Name() {
		return (EAttribute)lDocDtoPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocDtoProperty_Description() {
		return (EReference)lDocDtoPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocBPMProcessDocument() {
		return lDocBPMProcessDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocBPMProcessDocument_Process() {
		return (EAttribute)lDocBPMProcessDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocHumanTaskDocument() {
		return lDocHumanTaskDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocHumanTaskDocument_Task() {
		return (EAttribute)lDocHumanTaskDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocViewDocument() {
		return lDocViewDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocViewDocument_View() {
		return (EAttribute)lDocViewDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocUiDocument() {
		return lDocUiDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLDocUiDocument_Ui() {
		return (EAttribute)lDocUiDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDocLayouter() {
		return lDocLayouterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocLayouter_Content() {
		return (EReference)lDocLayouterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocLayouter_Imports() {
		return (EReference)lDocLayouterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLDocLayouter_Includes() {
		return (EReference)lDocLayouterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLDocType() {
		return lDocTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocFactory getLDocFactory() {
		return (LDocFactory)getEFactoryInstance();
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
		lDocNamedDocumentEClass = createEClass(LDOC_NAMED_DOCUMENT);
		createEAttribute(lDocNamedDocumentEClass, LDOC_NAMED_DOCUMENT__NAME);
		createEAttribute(lDocNamedDocumentEClass, LDOC_NAMED_DOCUMENT__LANGUAGE);

		lDocIncludeEClass = createEClass(LDOC_INCLUDE);
		createEReference(lDocIncludeEClass, LDOC_INCLUDE__DOCUMENT);
		createEAttribute(lDocIncludeEClass, LDOC_INCLUDE__VAR_NAME);
		createEAttribute(lDocIncludeEClass, LDOC_INCLUDE__PROVIDED);
		createEAttribute(lDocIncludeEClass, LDOC_INCLUDE__PROVIDED_TYPE);
		createEReference(lDocIncludeEClass, LDOC_INCLUDE__PROVIDED_JVM_TYPE);

		lDocDocumentEClass = createEClass(LDOC_DOCUMENT);
		createEReference(lDocDocumentEClass, LDOC_DOCUMENT__DESCRIPTION);

		lDocEntityDocumentEClass = createEClass(LDOC_ENTITY_DOCUMENT);
		createEAttribute(lDocEntityDocumentEClass, LDOC_ENTITY_DOCUMENT__ENTITY_CLASS);
		createEReference(lDocEntityDocumentEClass, LDOC_ENTITY_DOCUMENT__FIELDS);

		lDocEntityFieldEClass = createEClass(LDOC_ENTITY_FIELD);
		createEAttribute(lDocEntityFieldEClass, LDOC_ENTITY_FIELD__NAME);
		createEReference(lDocEntityFieldEClass, LDOC_ENTITY_FIELD__DESCRIPTION);

		lDocDtoDocumentEClass = createEClass(LDOC_DTO_DOCUMENT);
		createEAttribute(lDocDtoDocumentEClass, LDOC_DTO_DOCUMENT__DTO_CLASS);
		createEReference(lDocDtoDocumentEClass, LDOC_DTO_DOCUMENT__FIELDS);

		lDocDtoPropertyEClass = createEClass(LDOC_DTO_PROPERTY);
		createEAttribute(lDocDtoPropertyEClass, LDOC_DTO_PROPERTY__NAME);
		createEReference(lDocDtoPropertyEClass, LDOC_DTO_PROPERTY__DESCRIPTION);

		lDocBPMProcessDocumentEClass = createEClass(LDOC_BPM_PROCESS_DOCUMENT);
		createEAttribute(lDocBPMProcessDocumentEClass, LDOC_BPM_PROCESS_DOCUMENT__PROCESS);

		lDocHumanTaskDocumentEClass = createEClass(LDOC_HUMAN_TASK_DOCUMENT);
		createEAttribute(lDocHumanTaskDocumentEClass, LDOC_HUMAN_TASK_DOCUMENT__TASK);

		lDocViewDocumentEClass = createEClass(LDOC_VIEW_DOCUMENT);
		createEAttribute(lDocViewDocumentEClass, LDOC_VIEW_DOCUMENT__VIEW);

		lDocUiDocumentEClass = createEClass(LDOC_UI_DOCUMENT);
		createEAttribute(lDocUiDocumentEClass, LDOC_UI_DOCUMENT__UI);

		lDocLayouterEClass = createEClass(LDOC_LAYOUTER);
		createEReference(lDocLayouterEClass, LDOC_LAYOUTER__CONTENT);
		createEReference(lDocLayouterEClass, LDOC_LAYOUTER__IMPORTS);
		createEReference(lDocLayouterEClass, LDOC_LAYOUTER__INCLUDES);

		// Create enums
		lDocTypeEEnum = createEEnum(LDOC_TYPE);
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
		LDocRichstringPackage theLDocRichstringPackage = (LDocRichstringPackage)EPackage.Registry.INSTANCE.getEPackage(LDocRichstringPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theLDocRichstringPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		lDocDocumentEClass.getESuperTypes().add(this.getLDocNamedDocument());
		lDocEntityDocumentEClass.getESuperTypes().add(this.getLDocDocument());
		lDocDtoDocumentEClass.getESuperTypes().add(this.getLDocDocument());
		lDocBPMProcessDocumentEClass.getESuperTypes().add(this.getLDocDocument());
		lDocHumanTaskDocumentEClass.getESuperTypes().add(this.getLDocDocument());
		lDocViewDocumentEClass.getESuperTypes().add(this.getLDocDocument());
		lDocUiDocumentEClass.getESuperTypes().add(this.getLDocDocument());
		lDocLayouterEClass.getESuperTypes().add(this.getLDocNamedDocument());

		// Initialize classes and features; add operations and parameters
		initEClass(lDocNamedDocumentEClass, LDocNamedDocument.class, "LDocNamedDocument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocNamedDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, LDocNamedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLDocNamedDocument_Language(), ecorePackage.getEString(), "language", null, 0, 1, LDocNamedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocIncludeEClass, LDocInclude.class, "LDocInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLDocInclude_Document(), this.getLDocDocument(), null, "document", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLDocInclude_VarName(), ecorePackage.getEString(), "varName", null, 1, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLDocInclude_Provided(), ecorePackage.getEBoolean(), "provided", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLDocInclude_ProvidedType(), this.getLDocType(), "providedType", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLDocInclude_ProvidedJVMType(), theTypesPackage.getJvmTypeReference(), null, "providedJVMType", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocDocumentEClass, LDocDocument.class, "LDocDocument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLDocDocument_Description(), theLDocRichstringPackage.getRichString(), null, "description", null, 0, 1, LDocDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocEntityDocumentEClass, LDocEntityDocument.class, "LDocEntityDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocEntityDocument_EntityClass(), ecorePackage.getEString(), "entityClass", null, 0, 1, LDocEntityDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLDocEntityDocument_Fields(), this.getLDocEntityField(), null, "fields", null, 0, -1, LDocEntityDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocEntityFieldEClass, LDocEntityField.class, "LDocEntityField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocEntityField_Name(), ecorePackage.getEString(), "name", null, 0, 1, LDocEntityField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLDocEntityField_Description(), theLDocRichstringPackage.getRichString(), null, "description", null, 0, 1, LDocEntityField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocDtoDocumentEClass, LDocDtoDocument.class, "LDocDtoDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocDtoDocument_DtoClass(), ecorePackage.getEString(), "dtoClass", null, 0, 1, LDocDtoDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLDocDtoDocument_Fields(), this.getLDocDtoProperty(), null, "fields", null, 0, -1, LDocDtoDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocDtoPropertyEClass, LDocDtoProperty.class, "LDocDtoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocDtoProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, LDocDtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLDocDtoProperty_Description(), theLDocRichstringPackage.getRichString(), null, "description", null, 0, 1, LDocDtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocBPMProcessDocumentEClass, LDocBPMProcessDocument.class, "LDocBPMProcessDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocBPMProcessDocument_Process(), ecorePackage.getEString(), "process", null, 0, 1, LDocBPMProcessDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocHumanTaskDocumentEClass, LDocHumanTaskDocument.class, "LDocHumanTaskDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocHumanTaskDocument_Task(), ecorePackage.getEString(), "task", null, 0, 1, LDocHumanTaskDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocViewDocumentEClass, LDocViewDocument.class, "LDocViewDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocViewDocument_View(), ecorePackage.getEString(), "view", null, 0, 1, LDocViewDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocUiDocumentEClass, LDocUiDocument.class, "LDocUiDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLDocUiDocument_Ui(), ecorePackage.getEString(), "ui", null, 0, 1, LDocUiDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lDocLayouterEClass, LDocLayouter.class, "LDocLayouter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLDocLayouter_Content(), theLDocRichstringPackage.getRichString(), null, "content", null, 0, 1, LDocLayouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLDocLayouter_Imports(), theXtypePackage.getXImportDeclaration(), null, "imports", null, 0, -1, LDocLayouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLDocLayouter_Includes(), this.getLDocInclude(), null, "includes", null, 0, -1, LDocLayouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(lDocTypeEEnum, LDocType.class, "LDocType");
		addEEnumLiteral(lDocTypeEEnum, LDocType.DTO);
		addEEnumLiteral(lDocTypeEEnum, LDocType.ENTITY);

		// Create resource
		createResource(eNS_URI);
	}

} //LDocPackageImpl
