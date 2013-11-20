/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.lunifera.doc.dsl.doccompiler.DocCompilerFactory;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.DocumentEnd;
import org.lunifera.doc.dsl.doccompiler.DocumentStart;
import org.lunifera.doc.dsl.doccompiler.ElseIfCondition;
import org.lunifera.doc.dsl.doccompiler.ElseStart;
import org.lunifera.doc.dsl.doccompiler.EndIf;
import org.lunifera.doc.dsl.doccompiler.ExampleEnd;
import org.lunifera.doc.dsl.doccompiler.ExampleStart;
import org.lunifera.doc.dsl.doccompiler.ForLoopEnd;
import org.lunifera.doc.dsl.doccompiler.ForLoopStart;
import org.lunifera.doc.dsl.doccompiler.H1End;
import org.lunifera.doc.dsl.doccompiler.H1Start;
import org.lunifera.doc.dsl.doccompiler.H2End;
import org.lunifera.doc.dsl.doccompiler.H2Start;
import org.lunifera.doc.dsl.doccompiler.IfConditionStart;
import org.lunifera.doc.dsl.doccompiler.Line;
import org.lunifera.doc.dsl.doccompiler.LineBreak;
import org.lunifera.doc.dsl.doccompiler.LinePart;
import org.lunifera.doc.dsl.doccompiler.Literal;
import org.lunifera.doc.dsl.doccompiler.Markup;
import org.lunifera.doc.dsl.doccompiler.PrintedExpression;
import org.lunifera.doc.dsl.doccompiler.ProcessedRichString;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocCompilerPackageImpl extends EPackageImpl implements DocCompilerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processedRichStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linePartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineBreakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass printedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifConditionStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseIfConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1StartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1EndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h2StartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h2EndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleEndEClass = null;

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
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocCompilerPackageImpl() {
		super(eNS_URI, DocCompilerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DocCompilerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocCompilerPackage init() {
		if (isInited) return (DocCompilerPackage)EPackage.Registry.INSTANCE.getEPackage(DocCompilerPackage.eNS_URI);

		// Obtain or create and register package
		DocCompilerPackageImpl theDocCompilerPackage = (DocCompilerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DocCompilerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DocCompilerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LuniferaDocPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDocCompilerPackage.createPackageContents();

		// Initialize created meta-data
		theDocCompilerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocCompilerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocCompilerPackage.eNS_URI, theDocCompilerPackage);
		return theDocCompilerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentStart() {
		return documentStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStart_Content() {
		return (EReference)documentStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStart_End() {
		return (EReference)documentStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentStart_Document() {
		return (EReference)documentStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentEnd() {
		return documentEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentEnd_Start() {
		return (EReference)documentEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessedRichString() {
		return processedRichStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessedRichString_RichString() {
		return (EReference)processedRichStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessedRichString_Lines() {
		return (EReference)processedRichStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Parts() {
		return (EReference)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_RichString() {
		return (EReference)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinePart() {
		return linePartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinePart_Line() {
		return (EReference)linePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteral_Literal() {
		return (EReference)literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Offset() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteral_Length() {
		return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineBreak() {
		return lineBreakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoopStart() {
		return forLoopStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoopStart_Loop() {
		return (EReference)forLoopStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoopStart_End() {
		return (EReference)forLoopStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoopEnd() {
		return forLoopEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForLoopEnd_Start() {
		return (EReference)forLoopEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrintedExpression() {
		return printedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrintedExpression_Expression() {
		return (EReference)printedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIfConditionStart() {
		return ifConditionStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfConditionStart_RichStringIf() {
		return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfConditionStart_ElseStart() {
		return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfConditionStart_ElseIfConditions() {
		return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIfConditionStart_EndIf() {
		return (EReference)ifConditionStartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseIfCondition() {
		return elseIfConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfCondition_RichStringElseIf() {
		return (EReference)elseIfConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseIfCondition_IfConditionStart() {
		return (EReference)elseIfConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElseStart() {
		return elseStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseStart_IfConditionStart() {
		return (EReference)elseStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndIf() {
		return endIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndIf_IfConditionStart() {
		return (EReference)endIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMarkup() {
		return markupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMarkup_Markup() {
		return (EReference)markupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1Start() {
		return h1StartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getH1Start_Content() {
		return (EReference)h1StartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getH1Start_End() {
		return (EReference)h1StartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1End() {
		return h1EndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getH1End_Start() {
		return (EReference)h1EndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH2Start() {
		return h2StartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getH2Start_Content() {
		return (EReference)h2StartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getH2Start_End() {
		return (EReference)h2StartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH2End() {
		return h2EndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getH2End_Start() {
		return (EReference)h2EndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleStart() {
		return exampleStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleStart_Content() {
		return (EReference)exampleStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleStart_End() {
		return (EReference)exampleStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleEnd() {
		return exampleEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleEnd_Start() {
		return (EReference)exampleEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocCompilerFactory getDocCompilerFactory() {
		return (DocCompilerFactory)getEFactoryInstance();
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
		documentStartEClass = createEClass(DOCUMENT_START);
		createEReference(documentStartEClass, DOCUMENT_START__CONTENT);
		createEReference(documentStartEClass, DOCUMENT_START__END);
		createEReference(documentStartEClass, DOCUMENT_START__DOCUMENT);

		documentEndEClass = createEClass(DOCUMENT_END);
		createEReference(documentEndEClass, DOCUMENT_END__START);

		processedRichStringEClass = createEClass(PROCESSED_RICH_STRING);
		createEReference(processedRichStringEClass, PROCESSED_RICH_STRING__RICH_STRING);
		createEReference(processedRichStringEClass, PROCESSED_RICH_STRING__LINES);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__PARTS);
		createEReference(lineEClass, LINE__RICH_STRING);

		linePartEClass = createEClass(LINE_PART);
		createEReference(linePartEClass, LINE_PART__LINE);

		literalEClass = createEClass(LITERAL);
		createEReference(literalEClass, LITERAL__LITERAL);
		createEAttribute(literalEClass, LITERAL__OFFSET);
		createEAttribute(literalEClass, LITERAL__LENGTH);

		lineBreakEClass = createEClass(LINE_BREAK);

		forLoopStartEClass = createEClass(FOR_LOOP_START);
		createEReference(forLoopStartEClass, FOR_LOOP_START__LOOP);
		createEReference(forLoopStartEClass, FOR_LOOP_START__END);

		forLoopEndEClass = createEClass(FOR_LOOP_END);
		createEReference(forLoopEndEClass, FOR_LOOP_END__START);

		printedExpressionEClass = createEClass(PRINTED_EXPRESSION);
		createEReference(printedExpressionEClass, PRINTED_EXPRESSION__EXPRESSION);

		ifConditionStartEClass = createEClass(IF_CONDITION_START);
		createEReference(ifConditionStartEClass, IF_CONDITION_START__RICH_STRING_IF);
		createEReference(ifConditionStartEClass, IF_CONDITION_START__ELSE_START);
		createEReference(ifConditionStartEClass, IF_CONDITION_START__ELSE_IF_CONDITIONS);
		createEReference(ifConditionStartEClass, IF_CONDITION_START__END_IF);

		elseIfConditionEClass = createEClass(ELSE_IF_CONDITION);
		createEReference(elseIfConditionEClass, ELSE_IF_CONDITION__RICH_STRING_ELSE_IF);
		createEReference(elseIfConditionEClass, ELSE_IF_CONDITION__IF_CONDITION_START);

		elseStartEClass = createEClass(ELSE_START);
		createEReference(elseStartEClass, ELSE_START__IF_CONDITION_START);

		endIfEClass = createEClass(END_IF);
		createEReference(endIfEClass, END_IF__IF_CONDITION_START);

		markupEClass = createEClass(MARKUP);
		createEReference(markupEClass, MARKUP__MARKUP);

		h1StartEClass = createEClass(H1_START);
		createEReference(h1StartEClass, H1_START__CONTENT);
		createEReference(h1StartEClass, H1_START__END);

		h1EndEClass = createEClass(H1_END);
		createEReference(h1EndEClass, H1_END__START);

		h2StartEClass = createEClass(H2_START);
		createEReference(h2StartEClass, H2_START__CONTENT);
		createEReference(h2StartEClass, H2_START__END);

		h2EndEClass = createEClass(H2_END);
		createEReference(h2EndEClass, H2_END__START);

		exampleStartEClass = createEClass(EXAMPLE_START);
		createEReference(exampleStartEClass, EXAMPLE_START__CONTENT);
		createEReference(exampleStartEClass, EXAMPLE_START__END);

		exampleEndEClass = createEClass(EXAMPLE_END);
		createEReference(exampleEndEClass, EXAMPLE_END__START);
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
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		documentStartEClass.getESuperTypes().add(this.getLinePart());
		documentEndEClass.getESuperTypes().add(this.getLinePart());
		literalEClass.getESuperTypes().add(this.getLinePart());
		lineBreakEClass.getESuperTypes().add(this.getLiteral());
		forLoopStartEClass.getESuperTypes().add(this.getLinePart());
		forLoopEndEClass.getESuperTypes().add(this.getLinePart());
		printedExpressionEClass.getESuperTypes().add(this.getLinePart());
		ifConditionStartEClass.getESuperTypes().add(this.getLinePart());
		elseIfConditionEClass.getESuperTypes().add(this.getLinePart());
		elseStartEClass.getESuperTypes().add(this.getLinePart());
		endIfEClass.getESuperTypes().add(this.getLinePart());
		markupEClass.getESuperTypes().add(this.getLinePart());
		h1StartEClass.getESuperTypes().add(this.getLinePart());
		h1EndEClass.getESuperTypes().add(this.getLinePart());
		h2StartEClass.getESuperTypes().add(this.getLinePart());
		h2EndEClass.getESuperTypes().add(this.getLinePart());
		exampleStartEClass.getESuperTypes().add(this.getLinePart());
		exampleEndEClass.getESuperTypes().add(this.getLinePart());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentStartEClass, DocumentStart.class, "DocumentStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentStart_Content(), this.getProcessedRichString(), null, "content", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentStart_End(), this.getDocumentEnd(), this.getDocumentEnd_Start(), "end", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentStart_Document(), theLuniferaDocPackage.getLuniferaDocDocument(), null, "document", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentEndEClass, DocumentEnd.class, "DocumentEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentEnd_Start(), this.getDocumentStart(), this.getDocumentStart_End(), "start", null, 0, 1, DocumentEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processedRichStringEClass, ProcessedRichString.class, "ProcessedRichString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessedRichString_RichString(), theRichstringPackage.getRichString(), null, "richString", null, 0, 1, ProcessedRichString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessedRichString_Lines(), this.getLine(), this.getLine_RichString(), "lines", null, 0, -1, ProcessedRichString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Parts(), this.getLinePart(), this.getLinePart_Line(), "parts", null, 0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_RichString(), this.getProcessedRichString(), this.getProcessedRichString_Lines(), "richString", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linePartEClass, LinePart.class, "LinePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinePart_Line(), this.getLine(), this.getLine_Parts(), "line", null, 0, 1, LinePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteral_Literal(), theRichstringPackage.getRichStringLiteral(), null, "literal", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Offset(), ecorePackage.getEInt(), "offset", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineBreakEClass, LineBreak.class, "LineBreak", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forLoopStartEClass, ForLoopStart.class, "ForLoopStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoopStart_Loop(), theRichstringPackage.getRichStringForLoop(), null, "loop", null, 0, 1, ForLoopStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForLoopStart_End(), this.getForLoopEnd(), this.getForLoopEnd_Start(), "end", null, 0, 1, ForLoopStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forLoopEndEClass, ForLoopEnd.class, "ForLoopEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoopEnd_Start(), this.getForLoopStart(), this.getForLoopStart_End(), "start", null, 0, 1, ForLoopEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(printedExpressionEClass, PrintedExpression.class, "PrintedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrintedExpression_Expression(), theXbasePackage.getXExpression(), null, "expression", null, 0, 1, PrintedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifConditionStartEClass, IfConditionStart.class, "IfConditionStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfConditionStart_RichStringIf(), theRichstringPackage.getRichStringIf(), null, "richStringIf", null, 0, 1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfConditionStart_ElseStart(), this.getElseStart(), this.getElseStart_IfConditionStart(), "elseStart", null, 0, 1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfConditionStart_ElseIfConditions(), this.getElseIfCondition(), this.getElseIfCondition_IfConditionStart(), "elseIfConditions", null, 0, -1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfConditionStart_EndIf(), this.getEndIf(), null, "endIf", null, 0, 1, IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseIfConditionEClass, ElseIfCondition.class, "ElseIfCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseIfCondition_RichStringElseIf(), theRichstringPackage.getRichStringElseIf(), null, "richStringElseIf", null, 0, 1, ElseIfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElseIfCondition_IfConditionStart(), this.getIfConditionStart(), this.getIfConditionStart_ElseIfConditions(), "ifConditionStart", null, 0, 1, ElseIfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseStartEClass, ElseStart.class, "ElseStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseStart_IfConditionStart(), this.getIfConditionStart(), this.getIfConditionStart_ElseStart(), "ifConditionStart", null, 0, 1, ElseStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endIfEClass, EndIf.class, "EndIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndIf_IfConditionStart(), this.getIfConditionStart(), null, "ifConditionStart", null, 0, 1, EndIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markupEClass, Markup.class, "Markup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkup_Markup(), theRichstringPackage.getRichStringMarkup(), null, "markup", null, 0, 1, Markup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h1StartEClass, H1Start.class, "H1Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH1Start_Content(), theRichstringPackage.getRichStringH1(), null, "content", null, 0, 1, H1Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getH1Start_End(), this.getH1End(), this.getH1End_Start(), "end", null, 0, 1, H1Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h1EndEClass, H1End.class, "H1End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH1End_Start(), this.getH1Start(), this.getH1Start_End(), "start", null, 0, 1, H1End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h2StartEClass, H2Start.class, "H2Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH2Start_Content(), theRichstringPackage.getRichStringH2(), null, "content", null, 0, 1, H2Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getH2Start_End(), this.getH2End(), this.getH2End_Start(), "end", null, 0, 1, H2Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h2EndEClass, H2End.class, "H2End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH2End_Start(), this.getH2Start(), this.getH2Start_End(), "start", null, 0, 1, H2End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleStartEClass, ExampleStart.class, "ExampleStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExampleStart_Content(), theRichstringPackage.getRichStringExample(), null, "content", null, 0, 1, ExampleStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleStart_End(), this.getExampleEnd(), this.getExampleEnd_Start(), "end", null, 0, 1, ExampleStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleEndEClass, ExampleEnd.class, "ExampleEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExampleEnd_Start(), this.getExampleStart(), this.getExampleStart_End(), "start", null, 0, 1, ExampleEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DocCompilerPackageImpl
