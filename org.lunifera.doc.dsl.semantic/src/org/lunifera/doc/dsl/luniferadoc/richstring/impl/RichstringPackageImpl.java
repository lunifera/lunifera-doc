/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

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
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringFactory;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RichstringPackageImpl extends EPackageImpl implements RichstringPackage {
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
	private EClass richStringURLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richStringMarkupEClass = null;

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
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RichstringPackageImpl() {
		super(eNS_URI, RichstringFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RichstringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RichstringPackage init() {
		if (isInited) return (RichstringPackage)EPackage.Registry.INSTANCE.getEPackage(RichstringPackage.eNS_URI);

		// Obtain or create and register package
		RichstringPackageImpl theRichstringPackage = (RichstringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RichstringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RichstringPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XAnnotationsPackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		LuniferaDocPackageImpl theLuniferaDocPackage = (LuniferaDocPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) instanceof LuniferaDocPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LuniferaDocPackage.eNS_URI) : LuniferaDocPackage.eINSTANCE);
		DocumentPackageImpl theDocumentPackage = (DocumentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) instanceof DocumentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DocumentPackage.eNS_URI) : DocumentPackage.eINSTANCE);
		LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LayoutPackage.eNS_URI) : LayoutPackage.eINSTANCE);

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
	public EClass getRichStringURL() {
		return richStringURLEClass;
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
	public RichstringFactory getRichstringFactory() {
		return (RichstringFactory)getEFactoryInstance();
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

		richStringURLEClass = createEClass(RICH_STRING_URL);

		richStringMarkupEClass = createEClass(RICH_STRING_MARKUP);
		createEReference(richStringMarkupEClass, RICH_STRING_MARKUP__EXPRESSION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		richStringEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());
		richStringLiteralEClass.getESuperTypes().add(theXbasePackage.getXStringLiteral());
		richStringForLoopEClass.getESuperTypes().add(theXbasePackage.getXForLoopExpression());
		richStringIfEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		richStringExampleEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH1EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringH2EClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringURLEClass.getESuperTypes().add(this.getRichStringMarkup());
		richStringMarkupEClass.getESuperTypes().add(theXbasePackage.getXExpression());

		// Initialize classes and features; add operations and parameters
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

		initEClass(richStringURLEClass, RichStringURL.class, "RichStringURL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richStringMarkupEClass, RichStringMarkup.class, "RichStringMarkup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichStringMarkup_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, RichStringMarkup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //RichstringPackageImpl
