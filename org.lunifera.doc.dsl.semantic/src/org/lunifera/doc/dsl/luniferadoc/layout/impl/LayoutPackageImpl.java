/**
 */
package org.lunifera.doc.dsl.luniferadoc.layout.impl;

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
import org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.BPMTaskLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutFactory;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.UILayout;
import org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutPackageImpl extends EPackageImpl implements LayoutPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luniferaDocLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmProcessLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmTaskLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vaaclipseViewLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiLayoutEClass = null;

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
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LayoutPackageImpl() {
		super(eNS_URI, LayoutFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LayoutPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LayoutPackage init() {
		if (isInited) return (LayoutPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI);

		// Obtain or create and register package
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LayoutPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LuniferaDocPackageImpl theLuniferaDocPackage = (LuniferaDocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) instanceof LuniferaDocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) : LuniferaDocPackage.eINSTANCE);
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) : DocumentPackage.eINSTANCE);
		RichstringPackageImpl theRichstringPackage = (RichstringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) instanceof RichstringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI) : RichstringPackage.eINSTANCE);

		// Create package meta-data objects
		theLayoutPackage.createPackageContents();
		theLuniferaDocPackage.createPackageContents();
		theDocumentPackage.createPackageContents();
		theRichstringPackage.createPackageContents();

		// Initialize created meta-data
		theLayoutPackage.initializePackageContents();
		theLuniferaDocPackage.initializePackageContents();
		theDocumentPackage.initializePackageContents();
		theRichstringPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLayoutPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LayoutPackage.eNS_URI, theLayoutPackage);
		return theLayoutPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuniferaDocLayout() {
		return luniferaDocLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuniferaDocLayout_Content() {
		return (EReference)luniferaDocLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuniferaDocLayout_Name() {
		return (EAttribute)luniferaDocLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLuniferaDocLayout_Imports() {
		return (EReference)luniferaDocLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityLayout() {
		return entityLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTOLayout() {
		return dtoLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMProcessLayout() {
		return bpmProcessLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMTaskLayout() {
		return bpmTaskLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVaaclipseViewLayout() {
		return vaaclipseViewLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUILayout() {
		return uiLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFactory getLayoutFactory() {
		return (LayoutFactory)getEFactoryInstance();
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
		luniferaDocLayoutEClass = createEClass(LUNIFERA_DOC_LAYOUT);
		createEReference(luniferaDocLayoutEClass, LUNIFERA_DOC_LAYOUT__CONTENT);
		createEAttribute(luniferaDocLayoutEClass, LUNIFERA_DOC_LAYOUT__NAME);
		createEReference(luniferaDocLayoutEClass, LUNIFERA_DOC_LAYOUT__IMPORTS);

		entityLayoutEClass = createEClass(ENTITY_LAYOUT);

		dtoLayoutEClass = createEClass(DTO_LAYOUT);

		bpmProcessLayoutEClass = createEClass(BPM_PROCESS_LAYOUT);

		bpmTaskLayoutEClass = createEClass(BPM_TASK_LAYOUT);

		vaaclipseViewLayoutEClass = createEClass(VAACLIPSE_VIEW_LAYOUT);

		uiLayoutEClass = createEClass(UI_LAYOUT);
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
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		luniferaDocLayoutEClass.getESuperTypes().add(theLuniferaDocPackage.getLuniferaDocDocument());
		entityLayoutEClass.getESuperTypes().add(this.getLuniferaDocLayout());
		dtoLayoutEClass.getESuperTypes().add(this.getLuniferaDocLayout());
		bpmProcessLayoutEClass.getESuperTypes().add(this.getLuniferaDocLayout());
		bpmTaskLayoutEClass.getESuperTypes().add(this.getLuniferaDocLayout());
		vaaclipseViewLayoutEClass.getESuperTypes().add(this.getLuniferaDocLayout());
		uiLayoutEClass.getESuperTypes().add(this.getLuniferaDocLayout());

		// Initialize classes and features; add operations and parameters
		initEClass(luniferaDocLayoutEClass, LuniferaDocLayout.class, "LuniferaDocLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLuniferaDocLayout_Content(), theRichstringPackage.getRichString(), null, "content", null, 0, 1, LuniferaDocLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuniferaDocLayout_Name(), ecorePackage.getEString(), "name", null, 0, 1, LuniferaDocLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLuniferaDocLayout_Imports(), theXtypePackage.getXImportDeclaration(), null, "imports", null, 0, -1, LuniferaDocLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityLayoutEClass, EntityLayout.class, "EntityLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtoLayoutEClass, DTOLayout.class, "DTOLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmProcessLayoutEClass, BPMProcessLayout.class, "BPMProcessLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpmTaskLayoutEClass, BPMTaskLayout.class, "BPMTaskLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vaaclipseViewLayoutEClass, VaaclipseViewLayout.class, "VaaclipseViewLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiLayoutEClass, UILayout.class, "UILayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //LayoutPackageImpl
