/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsPackage;
import org.eclipse.xtext.xtype.XtypePackage;
import org.lunifera.doc.dsl.luniferadoc.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.DTOHeader;
import org.lunifera.doc.dsl.luniferadoc.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.DocLayout;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocFactory;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.RichString;
import org.lunifera.doc.dsl.luniferadoc.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.RichStringMarkup;

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
	private EClass docLayoutEClass = null;

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
	private EClass richStringEClass = null;

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
	private EClass richStringIfEClass = null;

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
	private EClass richStringMarkupEClass = null;

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

		// Create package meta-data objects
		theLuniferaDocPackage.createPackageContents();

		// Initialize created meta-data
		theLuniferaDocPackage.initializePackageContents();

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
	public EClass getDocLayout() {
		return docLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocLayout_Content() {
		return (EReference)docLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocLayout_Name() {
		return (EAttribute)docLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocLayout_Imports() {
		return (EReference)docLayoutEClass.getEStructuralFeatures().get(2);
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
	public EClass getRichString() {
		return richStringEClass;
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
	public EClass getRichStringMarkup() {
		return richStringMarkupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichStringMarkup_Expression() {
		return (EReference)richStringMarkupEClass.getEStructuralFeatures().get(0);
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

		docLayoutEClass = createEClass(DOC_LAYOUT);
		createEReference(docLayoutEClass, DOC_LAYOUT__CONTENT);
		createEAttribute(docLayoutEClass, DOC_LAYOUT__NAME);
		createEReference(docLayoutEClass, DOC_LAYOUT__IMPORTS);

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

		richStringExampleEClass = createEClass(RICH_STRING_EXAMPLE);

		richStringH1EClass = createEClass(RICH_STRING_H1);

		richStringH2EClass = createEClass(RICH_STRING_H2);

		richStringMarkupEClass = createEClass(RICH_STRING_MARKUP);
		createEReference(richStringMarkupEClass, RICH_STRING_MARKUP__EXPRESSION);

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
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		docLayoutEClass.getESuperTypes().add(this.getLuniferaDocDocument());
		richStringEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());
		richStringLiteralEClass.getESuperTypes().add(theXbasePackage.getXStringLiteral());
		richStringForLoopEClass.getESuperTypes().add(theXbasePackage.getXForLoopExpression());
		richStringIfEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringExampleEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH1EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH2EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringMarkupEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		dtoDocumentEClass.getESuperTypes().add(this.getLuniferaDocDocument());

		// Initialize classes and features; add operations and parameters
		initEClass(luniferaDocDocumentEClass, LuniferaDocDocument.class, "LuniferaDocDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(docLayoutEClass, DocLayout.class, "DocLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocLayout_Content(), this.getRichString(), null, "content", null, 0, 1, DocLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocLayout_Name(), ecorePackage.getEString(), "name", null, 0, 1, DocLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocLayout_Imports(), theXtypePackage.getXImportDeclaration(), null, "imports", null, 0, -1, DocLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringElseIfEClass, RichStringElseIf.class, "RichStringElseIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringElseIf_If(), theXbasePackage.getXExpression(), null, "if", null, 0, 1, RichStringElseIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringElseIf_Then(), theXbasePackage.getXExpression(), null, "then", null, 0, 1, RichStringElseIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringEClass, RichString.class, "RichString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringLiteralEClass, RichStringLiteral.class, "RichStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringForLoopEClass, RichStringForLoop.class, "RichStringForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringForLoop_Before(), theXbasePackage.getXExpression(), null, "before", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringForLoop_Separator(), theXbasePackage.getXExpression(), null, "separator", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringForLoop_After(), theXbasePackage.getXExpression(), null, "after", null, 0, 1, RichStringForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringIfEClass, RichStringIf.class, "RichStringIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringIf_If(), theXbasePackage.getXExpression(), null, "if", null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringIf_Then(), theXbasePackage.getXExpression(), null, "then", null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringIf_ElseIfs(), this.getRichStringElseIf(), null, "elseIfs", null, 0, -1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichStringIf_Else(), theXbasePackage.getXExpression(), null, "else", null, 0, 1, RichStringIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richStringExampleEClass, RichStringExample.class, "RichStringExample", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH1EClass, RichStringH1.class, "RichStringH1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringH2EClass, RichStringH2.class, "RichStringH2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringMarkupEClass, RichStringMarkup.class, "RichStringMarkup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringMarkup_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoDocumentEClass, DTODocument.class, "DTODocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTODocument_DtoClass(), ecorePackage.getEString(), "dtoClass", null, 0, 1, DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTODocument_Header(), this.getDTOHeader(), null, "header", null, 0, 1, DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTODocument_Details(), this.getDTODetails(), null, "details", null, 0, 1, DTODocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoHeaderEClass, DTOHeader.class, "DTOHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTOHeader_Content(), this.getRichString(), null, "content", null, 0, 1, DTOHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoDetailsEClass, DTODetails.class, "DTODetails", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTODetails_Properties(), this.getDTOProperty(), null, "properties", null, 0, -1, DTODetails.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoPropertyEClass, DTOProperty.class, "DTOProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDTOProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, DTOProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDTOProperty_Description(), this.getRichString(), null, "description", null, 0, 1, DTOProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LuniferaDocPackageImpl
