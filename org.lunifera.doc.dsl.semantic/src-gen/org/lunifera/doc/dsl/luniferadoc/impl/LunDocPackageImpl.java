/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xtype.XtypePackage;

import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocType;
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;
import org.lunifera.doc.dsl.luniferadoc.LunDocFactory;
import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.impl.LunDocRichstringPackageImpl;

import org.lunifera.dsl.semantic.common.types.LunTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LunDocPackageImpl extends EPackageImpl implements LunDocPackage
{
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
  private EClass lDocUIDocumentEClass = null;

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
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LunDocPackageImpl()
  {
    super(eNS_URI, LunDocFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link LunDocPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LunDocPackage init()
  {
    if (isInited) return (LunDocPackage)EPackage.Registry.INSTANCE.getEPackage(LunDocPackage.eNS_URI);

    // Obtain or create and register package
    LunDocPackageImpl theLunDocPackage = (LunDocPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LunDocPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LunDocPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    LunTypesPackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    LunDocRichstringPackageImpl theLunDocRichstringPackage = (LunDocRichstringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LunDocRichstringPackage.eNS_URI) instanceof LunDocRichstringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LunDocRichstringPackage.eNS_URI) : LunDocRichstringPackage.eINSTANCE);

    // Create package meta-data objects
    theLunDocPackage.createPackageContents();
    theLunDocRichstringPackage.createPackageContents();

    // Initialize created meta-data
    theLunDocPackage.initializePackageContents();
    theLunDocRichstringPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLunDocPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LunDocPackage.eNS_URI, theLunDocPackage);
    return theLunDocPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocNamedDocument()
  {
    return lDocNamedDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocNamedDocument_Name()
  {
    return (EAttribute)lDocNamedDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocNamedDocument_Language()
  {
    return (EAttribute)lDocNamedDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocInclude()
  {
    return lDocIncludeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocInclude_Document()
  {
    return (EReference)lDocIncludeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocInclude_VarName()
  {
    return (EAttribute)lDocIncludeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocInclude_Provided()
  {
    return (EAttribute)lDocIncludeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocInclude_ProvidedType()
  {
    return (EAttribute)lDocIncludeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocInclude_ProvidedJVMType()
  {
    return (EReference)lDocIncludeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocDocument()
  {
    return lDocDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocDocument_Description()
  {
    return (EReference)lDocDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocEntityDocument()
  {
    return lDocEntityDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocEntityDocument_Fields()
  {
    return (EReference)lDocEntityDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocEntityDocument_Model()
  {
    return (EReference)lDocEntityDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocEntityField()
  {
    return lDocEntityFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocEntityField_TypeField()
  {
    return (EReference)lDocEntityFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocEntityField_Description()
  {
    return (EReference)lDocEntityFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocDtoDocument()
  {
    return lDocDtoDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocDtoDocument_Fields()
  {
    return (EReference)lDocDtoDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocDtoDocument_Model()
  {
    return (EReference)lDocDtoDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocDtoProperty()
  {
    return lDocDtoPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocDtoProperty_Name()
  {
    return (EAttribute)lDocDtoPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocDtoProperty_TypeField()
  {
    return (EReference)lDocDtoPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocDtoProperty_Description()
  {
    return (EReference)lDocDtoPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocBPMProcessDocument()
  {
    return lDocBPMProcessDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocBPMProcessDocument_Process()
  {
    return (EAttribute)lDocBPMProcessDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocHumanTaskDocument()
  {
    return lDocHumanTaskDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocHumanTaskDocument_Task()
  {
    return (EAttribute)lDocHumanTaskDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocViewDocument()
  {
    return lDocViewDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocViewDocument_View()
  {
    return (EAttribute)lDocViewDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocUIDocument()
  {
    return lDocUIDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLDocUIDocument_Ui()
  {
    return (EAttribute)lDocUIDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLDocLayouter()
  {
    return lDocLayouterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocLayouter_Content()
  {
    return (EReference)lDocLayouterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocLayouter_Imports()
  {
    return (EReference)lDocLayouterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLDocLayouter_Includes()
  {
    return (EReference)lDocLayouterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLDocType()
  {
    return lDocTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LunDocFactory getLunDocFactory()
  {
    return (LunDocFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
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
    createEReference(lDocEntityDocumentEClass, LDOC_ENTITY_DOCUMENT__FIELDS);
    createEReference(lDocEntityDocumentEClass, LDOC_ENTITY_DOCUMENT__MODEL);

    lDocEntityFieldEClass = createEClass(LDOC_ENTITY_FIELD);
    createEReference(lDocEntityFieldEClass, LDOC_ENTITY_FIELD__TYPE_FIELD);
    createEReference(lDocEntityFieldEClass, LDOC_ENTITY_FIELD__DESCRIPTION);

    lDocDtoDocumentEClass = createEClass(LDOC_DTO_DOCUMENT);
    createEReference(lDocDtoDocumentEClass, LDOC_DTO_DOCUMENT__FIELDS);
    createEReference(lDocDtoDocumentEClass, LDOC_DTO_DOCUMENT__MODEL);

    lDocDtoPropertyEClass = createEClass(LDOC_DTO_PROPERTY);
    createEAttribute(lDocDtoPropertyEClass, LDOC_DTO_PROPERTY__NAME);
    createEReference(lDocDtoPropertyEClass, LDOC_DTO_PROPERTY__TYPE_FIELD);
    createEReference(lDocDtoPropertyEClass, LDOC_DTO_PROPERTY__DESCRIPTION);

    lDocBPMProcessDocumentEClass = createEClass(LDOC_BPM_PROCESS_DOCUMENT);
    createEAttribute(lDocBPMProcessDocumentEClass, LDOC_BPM_PROCESS_DOCUMENT__PROCESS);

    lDocHumanTaskDocumentEClass = createEClass(LDOC_HUMAN_TASK_DOCUMENT);
    createEAttribute(lDocHumanTaskDocumentEClass, LDOC_HUMAN_TASK_DOCUMENT__TASK);

    lDocViewDocumentEClass = createEClass(LDOC_VIEW_DOCUMENT);
    createEAttribute(lDocViewDocumentEClass, LDOC_VIEW_DOCUMENT__VIEW);

    lDocUIDocumentEClass = createEClass(LDOC_UI_DOCUMENT);
    createEAttribute(lDocUIDocumentEClass, LDOC_UI_DOCUMENT__UI);

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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    LunDocRichstringPackage theLunDocRichstringPackage = (LunDocRichstringPackage)EPackage.Registry.INSTANCE.getEPackage(LunDocRichstringPackage.eNS_URI);
    LunTypesPackage theLunTypesPackage = (LunTypesPackage)EPackage.Registry.INSTANCE.getEPackage(LunTypesPackage.eNS_URI);
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    lDocDocumentEClass.getESuperTypes().add(this.getLDocNamedDocument());
    lDocEntityDocumentEClass.getESuperTypes().add(this.getLDocDocument());
    lDocDtoDocumentEClass.getESuperTypes().add(this.getLDocDocument());
    lDocBPMProcessDocumentEClass.getESuperTypes().add(this.getLDocDocument());
    lDocHumanTaskDocumentEClass.getESuperTypes().add(this.getLDocDocument());
    lDocViewDocumentEClass.getESuperTypes().add(this.getLDocDocument());
    lDocUIDocumentEClass.getESuperTypes().add(this.getLDocDocument());
    lDocLayouterEClass.getESuperTypes().add(this.getLDocNamedDocument());

    // Initialize classes and features; add operations and parameters
    initEClass(lDocNamedDocumentEClass, LDocNamedDocument.class, "LDocNamedDocument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLDocNamedDocument_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LDocNamedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLDocNamedDocument_Language(), theEcorePackage.getEString(), "language", null, 0, 1, LDocNamedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocIncludeEClass, LDocInclude.class, "LDocInclude", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDocInclude_Document(), this.getLDocDocument(), null, "document", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLDocInclude_VarName(), theEcorePackage.getEString(), "varName", null, 1, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLDocInclude_Provided(), theEcorePackage.getEBoolean(), "provided", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLDocInclude_ProvidedType(), this.getLDocType(), "providedType", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocInclude_ProvidedJVMType(), theTypesPackage.getJvmTypeReference(), null, "providedJVMType", null, 0, 1, LDocInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocDocumentEClass, LDocDocument.class, "LDocDocument", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDocDocument_Description(), theLunDocRichstringPackage.getRichString(), null, "description", null, 0, 1, LDocDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocEntityDocumentEClass, LDocEntityDocument.class, "LDocEntityDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDocEntityDocument_Fields(), this.getLDocEntityField(), null, "fields", null, 0, -1, LDocEntityDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocEntityDocument_Model(), theLunTypesPackage.getLType(), null, "model", null, 0, 1, LDocEntityDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocEntityFieldEClass, LDocEntityField.class, "LDocEntityField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDocEntityField_TypeField(), theLunTypesPackage.getLFeature(), null, "typeField", null, 0, 1, LDocEntityField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocEntityField_Description(), theLunDocRichstringPackage.getRichString(), null, "description", null, 0, 1, LDocEntityField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocDtoDocumentEClass, LDocDtoDocument.class, "LDocDtoDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDocDtoDocument_Fields(), this.getLDocDtoProperty(), null, "fields", null, 0, -1, LDocDtoDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocDtoDocument_Model(), theLunTypesPackage.getLType(), null, "model", null, 0, 1, LDocDtoDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocDtoPropertyEClass, LDocDtoProperty.class, "LDocDtoProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLDocDtoProperty_Name(), theEcorePackage.getEString(), "name", null, 0, 1, LDocDtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocDtoProperty_TypeField(), theLunTypesPackage.getLFeature(), null, "typeField", null, 0, 1, LDocDtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocDtoProperty_Description(), theLunDocRichstringPackage.getRichString(), null, "description", null, 0, 1, LDocDtoProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocBPMProcessDocumentEClass, LDocBPMProcessDocument.class, "LDocBPMProcessDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLDocBPMProcessDocument_Process(), theEcorePackage.getEString(), "process", null, 0, 1, LDocBPMProcessDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocHumanTaskDocumentEClass, LDocHumanTaskDocument.class, "LDocHumanTaskDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLDocHumanTaskDocument_Task(), theEcorePackage.getEString(), "task", null, 0, 1, LDocHumanTaskDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocViewDocumentEClass, LDocViewDocument.class, "LDocViewDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLDocViewDocument_View(), theEcorePackage.getEString(), "view", null, 0, 1, LDocViewDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocUIDocumentEClass, LDocUIDocument.class, "LDocUIDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLDocUIDocument_Ui(), theEcorePackage.getEString(), "ui", null, 0, 1, LDocUIDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(lDocLayouterEClass, LDocLayouter.class, "LDocLayouter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLDocLayouter_Content(), theLunDocRichstringPackage.getRichString(), null, "content", null, 0, 1, LDocLayouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocLayouter_Imports(), theXtypePackage.getXImportDeclaration(), null, "imports", null, 0, -1, LDocLayouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLDocLayouter_Includes(), this.getLDocInclude(), null, "includes", null, 0, -1, LDocLayouter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(lDocTypeEEnum, LDocType.class, "LDocType");
    addEEnumLiteral(lDocTypeEEnum, LDocType.DTO);
    addEEnumLiteral(lDocTypeEEnum, LDocType.ENTITY);

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
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "rootPackage", "luniferadoc"
       });
  }

} //LunDocPackageImpl
