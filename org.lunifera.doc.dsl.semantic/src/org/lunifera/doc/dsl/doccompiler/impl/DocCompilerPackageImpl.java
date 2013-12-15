/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.lunifera.doc.dsl.doccompiler.BoldEnd;
import org.lunifera.doc.dsl.doccompiler.BoldStart;
import org.lunifera.doc.dsl.doccompiler.ChapterEnd;
import org.lunifera.doc.dsl.doccompiler.ChapterStart;
import org.lunifera.doc.dsl.doccompiler.CodeEnd;
import org.lunifera.doc.dsl.doccompiler.CodeStart;
import org.lunifera.doc.dsl.doccompiler.DTORefEnd;
import org.lunifera.doc.dsl.doccompiler.DTORefStart;
import org.lunifera.doc.dsl.doccompiler.DocCompilerFactory;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.DocumentEnd;
import org.lunifera.doc.dsl.doccompiler.DocumentStart;
import org.lunifera.doc.dsl.doccompiler.ElseIfCondition;
import org.lunifera.doc.dsl.doccompiler.ElseStart;
import org.lunifera.doc.dsl.doccompiler.EndIf;
import org.lunifera.doc.dsl.doccompiler.EntityRefEnd;
import org.lunifera.doc.dsl.doccompiler.EntityRefStart;
import org.lunifera.doc.dsl.doccompiler.ExampleEnd;
import org.lunifera.doc.dsl.doccompiler.ExampleStart;
import org.lunifera.doc.dsl.doccompiler.ForLoopEnd;
import org.lunifera.doc.dsl.doccompiler.ForLoopStart;
import org.lunifera.doc.dsl.doccompiler.H1End;
import org.lunifera.doc.dsl.doccompiler.H1Start;
import org.lunifera.doc.dsl.doccompiler.H2End;
import org.lunifera.doc.dsl.doccompiler.H2Start;
import org.lunifera.doc.dsl.doccompiler.IfConditionStart;
import org.lunifera.doc.dsl.doccompiler.ImgStart;
import org.lunifera.doc.dsl.doccompiler.ItalicEnd;
import org.lunifera.doc.dsl.doccompiler.ItalicStart;
import org.lunifera.doc.dsl.doccompiler.Line;
import org.lunifera.doc.dsl.doccompiler.LineBreak;
import org.lunifera.doc.dsl.doccompiler.LinePart;
import org.lunifera.doc.dsl.doccompiler.ListElementEnd;
import org.lunifera.doc.dsl.doccompiler.ListElementStart;
import org.lunifera.doc.dsl.doccompiler.ListEnd;
import org.lunifera.doc.dsl.doccompiler.ListStart;
import org.lunifera.doc.dsl.doccompiler.Literal;
import org.lunifera.doc.dsl.doccompiler.MailtoEnd;
import org.lunifera.doc.dsl.doccompiler.MailtoStart;
import org.lunifera.doc.dsl.doccompiler.Markup;
import org.lunifera.doc.dsl.doccompiler.MovieEnd;
import org.lunifera.doc.dsl.doccompiler.MovieStart;
import org.lunifera.doc.dsl.doccompiler.OpenViewEnd;
import org.lunifera.doc.dsl.doccompiler.OpenViewStart;
import org.lunifera.doc.dsl.doccompiler.PrintedExpression;
import org.lunifera.doc.dsl.doccompiler.ProcessRefEnd;
import org.lunifera.doc.dsl.doccompiler.ProcessRefStart;
import org.lunifera.doc.dsl.doccompiler.ProcessedRichString;
import org.lunifera.doc.dsl.doccompiler.RefEnd;
import org.lunifera.doc.dsl.doccompiler.RefStart;
import org.lunifera.doc.dsl.doccompiler.SectionEnd;
import org.lunifera.doc.dsl.doccompiler.SectionStart;
import org.lunifera.doc.dsl.doccompiler.SkypeEnd;
import org.lunifera.doc.dsl.doccompiler.SkypeStart;
import org.lunifera.doc.dsl.doccompiler.StartProcessEnd;
import org.lunifera.doc.dsl.doccompiler.StartProcessStart;
import org.lunifera.doc.dsl.doccompiler.SubsectionEnd;
import org.lunifera.doc.dsl.doccompiler.SubsectionStart;
import org.lunifera.doc.dsl.doccompiler.TableDataEnd;
import org.lunifera.doc.dsl.doccompiler.TableDataStart;
import org.lunifera.doc.dsl.doccompiler.TableEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowStart;
import org.lunifera.doc.dsl.doccompiler.TableStart;
import org.lunifera.doc.dsl.doccompiler.TaskRefEnd;
import org.lunifera.doc.dsl.doccompiler.TaskRefStart;
import org.lunifera.doc.dsl.doccompiler.UIRefEnd;
import org.lunifera.doc.dsl.doccompiler.UIRefStart;
import org.lunifera.doc.dsl.doccompiler.URLEnd;
import org.lunifera.doc.dsl.doccompiler.URLStart;
import org.lunifera.doc.dsl.doccompiler.UnderlineEnd;
import org.lunifera.doc.dsl.doccompiler.UnderlineStart;
import org.lunifera.doc.dsl.doccompiler.ViewRefEnd;
import org.lunifera.doc.dsl.doccompiler.ViewRefStart;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class DocCompilerPackageImpl extends EPackageImpl implements DocCompilerPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass documentEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass processedRichStringEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass linePartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass lineBreakEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass forLoopStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass forLoopEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass printedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass ifConditionStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elseIfConditionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elseStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass endIfEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass markupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass h1StartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass h1EndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass h2StartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass h2EndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass exampleStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass exampleEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass urlStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass urlEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass refStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass refEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass boldStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass boldEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass underlineStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass underlineEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass italicStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass italicEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass imgStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mailtoStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass mailtoEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass skypeStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass skypeEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass movieStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass movieEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass codeEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tableStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tableEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tableRowStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tableRowEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tableDataStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass tableDataEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass chapterStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass chapterEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sectionStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass sectionEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass subsectionStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass subsectionEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass openViewStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass openViewEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass startProcessStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass startProcessEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityRefStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass entityRefEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dtoRefStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass dtoRefEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass processRefStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass processRefEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass taskRefStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass taskRefEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass viewRefStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass viewRefEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass uiRefStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass uiRefEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass listStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass listEndEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass listElementStartEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass listElementEndEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocCompilerPackageImpl() {
		super(eNS_URI, DocCompilerFactory.eINSTANCE);
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
	 * This method is used to initialize {@link DocCompilerPackage#eINSTANCE} when that field is accessed. Clients
	 * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocCompilerPackage init() {
		if (isInited)
			return (DocCompilerPackage) EPackage.Registry.INSTANCE
					.getEPackage(DocCompilerPackage.eNS_URI);

		// Obtain or create and register package
		DocCompilerPackageImpl theDocCompilerPackage = (DocCompilerPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof DocCompilerPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DocCompilerPackageImpl());

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDocumentStart() {
		return documentStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentStart_Content() {
		return (EReference) documentStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentStart_End() {
		return (EReference) documentStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentStart_Document() {
		return (EReference) documentStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDocumentEnd() {
		return documentEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDocumentEnd_Start() {
		return (EReference) documentEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProcessedRichString() {
		return processedRichStringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProcessedRichString_RichString() {
		return (EReference) processedRichStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProcessedRichString_Lines() {
		return (EReference) processedRichStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLine_Parts() {
		return (EReference) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLine_RichString() {
		return (EReference) lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLinePart() {
		return linePartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLinePart_Line() {
		return (EReference) linePartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getLiteral_Literal() {
		return (EReference) literalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLiteral_Offset() {
		return (EAttribute) literalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getLiteral_Length() {
		return (EAttribute) literalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getLineBreak() {
		return lineBreakEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getForLoopStart() {
		return forLoopStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getForLoopStart_Loop() {
		return (EReference) forLoopStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getForLoopStart_End() {
		return (EReference) forLoopStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getForLoopEnd() {
		return forLoopEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getForLoopEnd_Start() {
		return (EReference) forLoopEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPrintedExpression() {
		return printedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getPrintedExpression_Expression() {
		return (EReference) printedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIfConditionStart() {
		return ifConditionStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIfConditionStart_RichStringIf() {
		return (EReference) ifConditionStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIfConditionStart_ElseStart() {
		return (EReference) ifConditionStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIfConditionStart_ElseIfConditions() {
		return (EReference) ifConditionStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIfConditionStart_EndIf() {
		return (EReference) ifConditionStartEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getElseIfCondition() {
		return elseIfConditionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getElseIfCondition_RichStringElseIf() {
		return (EReference) elseIfConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getElseIfCondition_IfConditionStart() {
		return (EReference) elseIfConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getElseStart() {
		return elseStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getElseStart_IfConditionStart() {
		return (EReference) elseStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEndIf() {
		return endIfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEndIf_IfConditionStart() {
		return (EReference) endIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMarkup() {
		return markupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMarkup_Markup() {
		return (EReference) markupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getH1Start() {
		return h1StartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getH1Start_Content() {
		return (EReference) h1StartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getH1Start_End() {
		return (EReference) h1StartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getH1End() {
		return h1EndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getH1End_Start() {
		return (EReference) h1EndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getH2Start() {
		return h2StartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getH2Start_Content() {
		return (EReference) h2StartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getH2Start_End() {
		return (EReference) h2StartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getH2End() {
		return h2EndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getH2End_Start() {
		return (EReference) h2EndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExampleStart() {
		return exampleStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getExampleStart_Content() {
		return (EReference) exampleStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getExampleStart_End() {
		return (EReference) exampleStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getExampleEnd() {
		return exampleEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getExampleEnd_Start() {
		return (EReference) exampleEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getURLStart() {
		return urlStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getURLStart_Content() {
		return (EReference) urlStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getURLStart_End() {
		return (EReference) urlStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getURLEnd() {
		return urlEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getURLEnd_Start() {
		return (EReference) urlEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRefStart() {
		return refStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRefStart_Content() {
		return (EReference) refStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRefStart_End() {
		return (EReference) refStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRefEnd() {
		return refEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRefEnd_Start() {
		return (EReference) refEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBoldStart() {
		return boldStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBoldStart_Content() {
		return (EReference) boldStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBoldStart_End() {
		return (EReference) boldStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getBoldEnd() {
		return boldEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getBoldEnd_Start() {
		return (EReference) boldEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnderlineStart() {
		return underlineStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnderlineStart_Content() {
		return (EReference) underlineStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnderlineStart_End() {
		return (EReference) underlineStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUnderlineEnd() {
		return underlineEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUnderlineEnd_Start() {
		return (EReference) underlineEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getItalicStart() {
		return italicStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getItalicStart_Content() {
		return (EReference) italicStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getItalicStart_End() {
		return (EReference) italicStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getItalicEnd() {
		return italicEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getItalicEnd_Start() {
		return (EReference) italicEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getImgStart() {
		return imgStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getImgStart_Content() {
		return (EReference) imgStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMailtoStart() {
		return mailtoStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMailtoStart_Content() {
		return (EReference) mailtoStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMailtoStart_End() {
		return (EReference) mailtoStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMailtoEnd() {
		return mailtoEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMailtoEnd_Start() {
		return (EReference) mailtoEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSkypeStart() {
		return skypeStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSkypeStart_Content() {
		return (EReference) skypeStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSkypeStart_End() {
		return (EReference) skypeStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSkypeEnd() {
		return skypeEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSkypeEnd_Start() {
		return (EReference) skypeEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMovieStart() {
		return movieStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMovieStart_Content() {
		return (EReference) movieStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMovieStart_End() {
		return (EReference) movieStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getMovieEnd() {
		return movieEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getMovieEnd_Start() {
		return (EReference) movieEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeStart() {
		return codeStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeStart_Content() {
		return (EReference) codeStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeStart_End() {
		return (EReference) codeStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getCodeEnd() {
		return codeEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getCodeEnd_Start() {
		return (EReference) codeEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTableStart() {
		return tableStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableStart_Rows() {
		return (EReference) tableStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableStart_End() {
		return (EReference) tableStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTableEnd() {
		return tableEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableEnd_Start() {
		return (EReference) tableEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTableRowStart() {
		return tableRowStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableRowStart_Columns() {
		return (EReference) tableRowStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableRowStart_End() {
		return (EReference) tableRowStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableRowStart_TableStart() {
		return (EReference) tableRowStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTableRowEnd() {
		return tableRowEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableRowEnd_Start() {
		return (EReference) tableRowEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTableDataStart() {
		return tableDataStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableDataStart_Content() {
		return (EReference) tableDataStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableDataStart_End() {
		return (EReference) tableDataStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableDataStart_TableRowStart() {
		return (EReference) tableDataStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTableDataEnd() {
		return tableDataEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTableDataEnd_Start() {
		return (EReference) tableDataEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChapterStart() {
		return chapterStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChapterStart_Content() {
		return (EReference) chapterStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChapterStart_End() {
		return (EReference) chapterStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getChapterEnd() {
		return chapterEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getChapterEnd_Start() {
		return (EReference) chapterEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSectionStart() {
		return sectionStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSectionStart_Content() {
		return (EReference) sectionStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSectionStart_End() {
		return (EReference) sectionStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSectionEnd() {
		return sectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSectionEnd_Start() {
		return (EReference) sectionEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSubsectionStart() {
		return subsectionStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSubsectionStart_Content() {
		return (EReference) subsectionStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSubsectionStart_End() {
		return (EReference) subsectionStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSubsectionEnd() {
		return subsectionEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSubsectionEnd_Start() {
		return (EReference) subsectionEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOpenViewStart() {
		return openViewStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOpenViewStart_Content() {
		return (EReference) openViewStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOpenViewStart_End() {
		return (EReference) openViewStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getOpenViewEnd() {
		return openViewEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getOpenViewEnd_Start() {
		return (EReference) openViewEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStartProcessStart() {
		return startProcessStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStartProcessStart_Content() {
		return (EReference) startProcessStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStartProcessStart_End() {
		return (EReference) startProcessStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getStartProcessEnd() {
		return startProcessEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getStartProcessEnd_Start() {
		return (EReference) startProcessEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityRefStart() {
		return entityRefStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityRefStart_Content() {
		return (EReference) entityRefStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityRefStart_End() {
		return (EReference) entityRefStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEntityRefEnd() {
		return entityRefEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEntityRefEnd_Start() {
		return (EReference) entityRefEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDTORefStart() {
		return dtoRefStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTORefStart_Content() {
		return (EReference) dtoRefStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTORefStart_End() {
		return (EReference) dtoRefStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDTORefEnd() {
		return dtoRefEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDTORefEnd_Start() {
		return (EReference) dtoRefEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProcessRefStart() {
		return processRefStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProcessRefStart_Content() {
		return (EReference) processRefStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProcessRefStart_End() {
		return (EReference) processRefStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getProcessRefEnd() {
		return processRefEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getProcessRefEnd_Start() {
		return (EReference) processRefEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTaskRefStart() {
		return taskRefStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTaskRefStart_Content() {
		return (EReference) taskRefStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTaskRefStart_End() {
		return (EReference) taskRefStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTaskRefEnd() {
		return taskRefEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getTaskRefEnd_Start() {
		return (EReference) taskRefEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getViewRefStart() {
		return viewRefStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getViewRefStart_Content() {
		return (EReference) viewRefStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getViewRefStart_End() {
		return (EReference) viewRefStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getViewRefEnd() {
		return viewRefEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getViewRefEnd_Start() {
		return (EReference) viewRefEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUIRefStart() {
		return uiRefStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUIRefStart_Content() {
		return (EReference) uiRefStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUIRefStart_End() {
		return (EReference) uiRefStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getUIRefEnd() {
		return uiRefEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getUIRefEnd_Start() {
		return (EReference) uiRefEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getListStart() {
		return listStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getListStart_Content() {
		return (EReference) listStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getListStart_Elements() {
		return (EReference) listStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getListStart_End() {
		return (EReference) listStartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getListEnd() {
		return listEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getListEnd_Start() {
		return (EReference) listEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getListElementStart() {
		return listElementStartEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getListElementStart_Content() {
		return (EReference) listElementStartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getListElementStart_End() {
		return (EReference) listElementStartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getListElementEnd() {
		return listElementEndEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getListElementEnd_Start() {
		return (EReference) listElementEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocCompilerFactory getDocCompilerFactory() {
		return (DocCompilerFactory) getEFactoryInstance();
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

		urlStartEClass = createEClass(URL_START);
		createEReference(urlStartEClass, URL_START__CONTENT);
		createEReference(urlStartEClass, URL_START__END);

		urlEndEClass = createEClass(URL_END);
		createEReference(urlEndEClass, URL_END__START);

		refStartEClass = createEClass(REF_START);
		createEReference(refStartEClass, REF_START__CONTENT);
		createEReference(refStartEClass, REF_START__END);

		refEndEClass = createEClass(REF_END);
		createEReference(refEndEClass, REF_END__START);

		boldStartEClass = createEClass(BOLD_START);
		createEReference(boldStartEClass, BOLD_START__CONTENT);
		createEReference(boldStartEClass, BOLD_START__END);

		boldEndEClass = createEClass(BOLD_END);
		createEReference(boldEndEClass, BOLD_END__START);

		underlineStartEClass = createEClass(UNDERLINE_START);
		createEReference(underlineStartEClass, UNDERLINE_START__CONTENT);
		createEReference(underlineStartEClass, UNDERLINE_START__END);

		underlineEndEClass = createEClass(UNDERLINE_END);
		createEReference(underlineEndEClass, UNDERLINE_END__START);

		italicStartEClass = createEClass(ITALIC_START);
		createEReference(italicStartEClass, ITALIC_START__CONTENT);
		createEReference(italicStartEClass, ITALIC_START__END);

		italicEndEClass = createEClass(ITALIC_END);
		createEReference(italicEndEClass, ITALIC_END__START);

		imgStartEClass = createEClass(IMG_START);
		createEReference(imgStartEClass, IMG_START__CONTENT);

		mailtoStartEClass = createEClass(MAILTO_START);
		createEReference(mailtoStartEClass, MAILTO_START__CONTENT);
		createEReference(mailtoStartEClass, MAILTO_START__END);

		mailtoEndEClass = createEClass(MAILTO_END);
		createEReference(mailtoEndEClass, MAILTO_END__START);

		skypeStartEClass = createEClass(SKYPE_START);
		createEReference(skypeStartEClass, SKYPE_START__CONTENT);
		createEReference(skypeStartEClass, SKYPE_START__END);

		skypeEndEClass = createEClass(SKYPE_END);
		createEReference(skypeEndEClass, SKYPE_END__START);

		movieStartEClass = createEClass(MOVIE_START);
		createEReference(movieStartEClass, MOVIE_START__CONTENT);
		createEReference(movieStartEClass, MOVIE_START__END);

		movieEndEClass = createEClass(MOVIE_END);
		createEReference(movieEndEClass, MOVIE_END__START);

		codeStartEClass = createEClass(CODE_START);
		createEReference(codeStartEClass, CODE_START__CONTENT);
		createEReference(codeStartEClass, CODE_START__END);

		codeEndEClass = createEClass(CODE_END);
		createEReference(codeEndEClass, CODE_END__START);

		tableStartEClass = createEClass(TABLE_START);
		createEReference(tableStartEClass, TABLE_START__ROWS);
		createEReference(tableStartEClass, TABLE_START__END);

		tableEndEClass = createEClass(TABLE_END);
		createEReference(tableEndEClass, TABLE_END__START);

		tableRowStartEClass = createEClass(TABLE_ROW_START);
		createEReference(tableRowStartEClass, TABLE_ROW_START__COLUMNS);
		createEReference(tableRowStartEClass, TABLE_ROW_START__END);
		createEReference(tableRowStartEClass, TABLE_ROW_START__TABLE_START);

		tableRowEndEClass = createEClass(TABLE_ROW_END);
		createEReference(tableRowEndEClass, TABLE_ROW_END__START);

		tableDataStartEClass = createEClass(TABLE_DATA_START);
		createEReference(tableDataStartEClass, TABLE_DATA_START__CONTENT);
		createEReference(tableDataStartEClass, TABLE_DATA_START__END);
		createEReference(tableDataStartEClass, TABLE_DATA_START__TABLE_ROW_START);

		tableDataEndEClass = createEClass(TABLE_DATA_END);
		createEReference(tableDataEndEClass, TABLE_DATA_END__START);

		chapterStartEClass = createEClass(CHAPTER_START);
		createEReference(chapterStartEClass, CHAPTER_START__CONTENT);
		createEReference(chapterStartEClass, CHAPTER_START__END);

		chapterEndEClass = createEClass(CHAPTER_END);
		createEReference(chapterEndEClass, CHAPTER_END__START);

		sectionStartEClass = createEClass(SECTION_START);
		createEReference(sectionStartEClass, SECTION_START__CONTENT);
		createEReference(sectionStartEClass, SECTION_START__END);

		sectionEndEClass = createEClass(SECTION_END);
		createEReference(sectionEndEClass, SECTION_END__START);

		subsectionStartEClass = createEClass(SUBSECTION_START);
		createEReference(subsectionStartEClass, SUBSECTION_START__CONTENT);
		createEReference(subsectionStartEClass, SUBSECTION_START__END);

		subsectionEndEClass = createEClass(SUBSECTION_END);
		createEReference(subsectionEndEClass, SUBSECTION_END__START);

		openViewStartEClass = createEClass(OPEN_VIEW_START);
		createEReference(openViewStartEClass, OPEN_VIEW_START__CONTENT);
		createEReference(openViewStartEClass, OPEN_VIEW_START__END);

		openViewEndEClass = createEClass(OPEN_VIEW_END);
		createEReference(openViewEndEClass, OPEN_VIEW_END__START);

		startProcessStartEClass = createEClass(START_PROCESS_START);
		createEReference(startProcessStartEClass, START_PROCESS_START__CONTENT);
		createEReference(startProcessStartEClass, START_PROCESS_START__END);

		startProcessEndEClass = createEClass(START_PROCESS_END);
		createEReference(startProcessEndEClass, START_PROCESS_END__START);

		entityRefStartEClass = createEClass(ENTITY_REF_START);
		createEReference(entityRefStartEClass, ENTITY_REF_START__CONTENT);
		createEReference(entityRefStartEClass, ENTITY_REF_START__END);

		entityRefEndEClass = createEClass(ENTITY_REF_END);
		createEReference(entityRefEndEClass, ENTITY_REF_END__START);

		dtoRefStartEClass = createEClass(DTO_REF_START);
		createEReference(dtoRefStartEClass, DTO_REF_START__CONTENT);
		createEReference(dtoRefStartEClass, DTO_REF_START__END);

		dtoRefEndEClass = createEClass(DTO_REF_END);
		createEReference(dtoRefEndEClass, DTO_REF_END__START);

		processRefStartEClass = createEClass(PROCESS_REF_START);
		createEReference(processRefStartEClass, PROCESS_REF_START__CONTENT);
		createEReference(processRefStartEClass, PROCESS_REF_START__END);

		processRefEndEClass = createEClass(PROCESS_REF_END);
		createEReference(processRefEndEClass, PROCESS_REF_END__START);

		taskRefStartEClass = createEClass(TASK_REF_START);
		createEReference(taskRefStartEClass, TASK_REF_START__CONTENT);
		createEReference(taskRefStartEClass, TASK_REF_START__END);

		taskRefEndEClass = createEClass(TASK_REF_END);
		createEReference(taskRefEndEClass, TASK_REF_END__START);

		viewRefStartEClass = createEClass(VIEW_REF_START);
		createEReference(viewRefStartEClass, VIEW_REF_START__CONTENT);
		createEReference(viewRefStartEClass, VIEW_REF_START__END);

		viewRefEndEClass = createEClass(VIEW_REF_END);
		createEReference(viewRefEndEClass, VIEW_REF_END__START);

		uiRefStartEClass = createEClass(UI_REF_START);
		createEReference(uiRefStartEClass, UI_REF_START__CONTENT);
		createEReference(uiRefStartEClass, UI_REF_START__END);

		uiRefEndEClass = createEClass(UI_REF_END);
		createEReference(uiRefEndEClass, UI_REF_END__START);

		listStartEClass = createEClass(LIST_START);
		createEReference(listStartEClass, LIST_START__CONTENT);
		createEReference(listStartEClass, LIST_START__ELEMENTS);
		createEReference(listStartEClass, LIST_START__END);

		listEndEClass = createEClass(LIST_END);
		createEReference(listEndEClass, LIST_END__START);

		listElementStartEClass = createEClass(LIST_ELEMENT_START);
		createEReference(listElementStartEClass, LIST_ELEMENT_START__CONTENT);
		createEReference(listElementStartEClass, LIST_ELEMENT_START__END);

		listElementEndEClass = createEClass(LIST_ELEMENT_END);
		createEReference(listElementEndEClass, LIST_ELEMENT_END__START);
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
		XbasePackage theXbasePackage = (XbasePackage) EPackage.Registry.INSTANCE
				.getEPackage(XbasePackage.eNS_URI);

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
		urlStartEClass.getESuperTypes().add(this.getLinePart());
		urlEndEClass.getESuperTypes().add(this.getLinePart());
		refStartEClass.getESuperTypes().add(this.getLinePart());
		refEndEClass.getESuperTypes().add(this.getLinePart());
		boldStartEClass.getESuperTypes().add(this.getLinePart());
		boldEndEClass.getESuperTypes().add(this.getLinePart());
		underlineStartEClass.getESuperTypes().add(this.getLinePart());
		underlineEndEClass.getESuperTypes().add(this.getLinePart());
		italicStartEClass.getESuperTypes().add(this.getLinePart());
		italicEndEClass.getESuperTypes().add(this.getLinePart());
		imgStartEClass.getESuperTypes().add(this.getLinePart());
		mailtoStartEClass.getESuperTypes().add(this.getLinePart());
		mailtoEndEClass.getESuperTypes().add(this.getLinePart());
		skypeStartEClass.getESuperTypes().add(this.getLinePart());
		skypeEndEClass.getESuperTypes().add(this.getLinePart());
		movieStartEClass.getESuperTypes().add(this.getLinePart());
		movieEndEClass.getESuperTypes().add(this.getLinePart());
		codeStartEClass.getESuperTypes().add(this.getLinePart());
		codeEndEClass.getESuperTypes().add(this.getLinePart());
		tableStartEClass.getESuperTypes().add(this.getLinePart());
		tableEndEClass.getESuperTypes().add(this.getLinePart());
		tableRowStartEClass.getESuperTypes().add(this.getLinePart());
		tableRowEndEClass.getESuperTypes().add(this.getLinePart());
		tableDataStartEClass.getESuperTypes().add(this.getLinePart());
		tableDataEndEClass.getESuperTypes().add(this.getLinePart());
		chapterStartEClass.getESuperTypes().add(this.getLinePart());
		chapterEndEClass.getESuperTypes().add(this.getLinePart());
		sectionStartEClass.getESuperTypes().add(this.getLinePart());
		sectionEndEClass.getESuperTypes().add(this.getLinePart());
		subsectionStartEClass.getESuperTypes().add(this.getLinePart());
		subsectionEndEClass.getESuperTypes().add(this.getLinePart());
		openViewStartEClass.getESuperTypes().add(this.getLinePart());
		openViewEndEClass.getESuperTypes().add(this.getLinePart());
		startProcessStartEClass.getESuperTypes().add(this.getLinePart());
		startProcessEndEClass.getESuperTypes().add(this.getLinePart());
		entityRefStartEClass.getESuperTypes().add(this.getLinePart());
		entityRefEndEClass.getESuperTypes().add(this.getLinePart());
		dtoRefStartEClass.getESuperTypes().add(this.getLinePart());
		dtoRefEndEClass.getESuperTypes().add(this.getLinePart());
		processRefStartEClass.getESuperTypes().add(this.getLinePart());
		processRefEndEClass.getESuperTypes().add(this.getLinePart());
		taskRefStartEClass.getESuperTypes().add(this.getLinePart());
		taskRefEndEClass.getESuperTypes().add(this.getLinePart());
		viewRefStartEClass.getESuperTypes().add(this.getLinePart());
		viewRefEndEClass.getESuperTypes().add(this.getLinePart());
		uiRefStartEClass.getESuperTypes().add(this.getLinePart());
		uiRefEndEClass.getESuperTypes().add(this.getLinePart());
		listStartEClass.getESuperTypes().add(this.getLinePart());
		listEndEClass.getESuperTypes().add(this.getLinePart());
		listElementStartEClass.getESuperTypes().add(this.getLinePart());
		listElementEndEClass.getESuperTypes().add(this.getLinePart());

		// Initialize classes, features, and operations; add parameters
		initEClass(documentStartEClass, DocumentStart.class, "DocumentStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentStart_Content(), this.getProcessedRichString(), null, "content",
				null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDocumentStart_End(), this.getDocumentEnd(), this.getDocumentEnd_Start(),
				"end", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDocumentStart_Document(), theLuniferaDocPackage.getNamedDocument(), null,
				"document", null, 0, 1, DocumentStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(documentEndEClass, DocumentEnd.class, "DocumentEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentEnd_Start(), this.getDocumentStart(),
				this.getDocumentStart_End(), "start", null, 0, 1, DocumentEnd.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processedRichStringEClass, ProcessedRichString.class, "ProcessedRichString",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessedRichString_RichString(), theRichstringPackage.getRichString(),
				null, "richString", null, 0, 1, ProcessedRichString.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessedRichString_Lines(), this.getLine(), this.getLine_RichString(),
				"lines", null, 0, -1, ProcessedRichString.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Parts(), this.getLinePart(), this.getLinePart_Line(), "parts", null,
				0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_RichString(), this.getProcessedRichString(),
				this.getProcessedRichString_Lines(), "richString", null, 0, 1, Line.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linePartEClass, LinePart.class, "LinePart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinePart_Line(), this.getLine(), this.getLine_Parts(), "line", null, 0,
				1, LinePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteral_Literal(), theRichstringPackage.getRichStringLiteral(), null,
				"literal", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLiteral_Offset(), ecorePackage.getEInt(), "offset", null, 0, 1,
				Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteral_Length(), ecorePackage.getEInt(), "length", null, 0, 1,
				Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineBreakEClass, LineBreak.class, "LineBreak", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(forLoopStartEClass, ForLoopStart.class, "ForLoopStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoopStart_Loop(), theRichstringPackage.getRichStringForLoop(), null,
				"loop", null, 0, 1, ForLoopStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getForLoopStart_End(), this.getForLoopEnd(), this.getForLoopEnd_Start(),
				"end", null, 0, 1, ForLoopStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(forLoopEndEClass, ForLoopEnd.class, "ForLoopEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForLoopEnd_Start(), this.getForLoopStart(), this.getForLoopStart_End(),
				"start", null, 0, 1, ForLoopEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(printedExpressionEClass, PrintedExpression.class, "PrintedExpression",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrintedExpression_Expression(), theXbasePackage.getXExpression(), null,
				"expression", null, 0, 1, PrintedExpression.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ifConditionStartEClass, IfConditionStart.class, "IfConditionStart",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfConditionStart_RichStringIf(), theRichstringPackage.getRichStringIf(),
				null, "richStringIf", null, 0, 1, IfConditionStart.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfConditionStart_ElseStart(), this.getElseStart(),
				this.getElseStart_IfConditionStart(), "elseStart", null, 0, 1,
				IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfConditionStart_ElseIfConditions(), this.getElseIfCondition(),
				this.getElseIfCondition_IfConditionStart(), "elseIfConditions", null, 0, -1,
				IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfConditionStart_EndIf(), this.getEndIf(), null, "endIf", null, 0, 1,
				IfConditionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseIfConditionEClass, ElseIfCondition.class, "ElseIfCondition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseIfCondition_RichStringElseIf(),
				theRichstringPackage.getRichStringElseIf(), null, "richStringElseIf", null, 0, 1,
				ElseIfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElseIfCondition_IfConditionStart(), this.getIfConditionStart(),
				this.getIfConditionStart_ElseIfConditions(), "ifConditionStart", null, 0, 1,
				ElseIfCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseStartEClass, ElseStart.class, "ElseStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElseStart_IfConditionStart(), this.getIfConditionStart(),
				this.getIfConditionStart_ElseStart(), "ifConditionStart", null, 0, 1,
				ElseStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endIfEClass, EndIf.class, "EndIf", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndIf_IfConditionStart(), this.getIfConditionStart(), null,
				"ifConditionStart", null, 0, 1, EndIf.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(markupEClass, Markup.class, "Markup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarkup_Markup(), theRichstringPackage.getRichStringMarkup(), null,
				"markup", null, 0, 1, Markup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(h1StartEClass, H1Start.class, "H1Start", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH1Start_Content(), theRichstringPackage.getRichStringH1(), null,
				"content", null, 0, 1, H1Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getH1Start_End(), this.getH1End(), this.getH1End_Start(), "end", null, 0, 1,
				H1Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h1EndEClass, H1End.class, "H1End", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH1End_Start(), this.getH1Start(), this.getH1Start_End(), "start", null,
				0, 1, H1End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h2StartEClass, H2Start.class, "H2Start", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH2Start_Content(), theRichstringPackage.getRichStringH2(), null,
				"content", null, 0, 1, H2Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getH2Start_End(), this.getH2End(), this.getH2End_Start(), "end", null, 0, 1,
				H2Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h2EndEClass, H2End.class, "H2End", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getH2End_Start(), this.getH2Start(), this.getH2Start_End(), "start", null,
				0, 1, H2End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exampleStartEClass, ExampleStart.class, "ExampleStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExampleStart_Content(), theRichstringPackage.getRichStringExample(),
				null, "content", null, 0, 1, ExampleStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExampleStart_End(), this.getExampleEnd(), this.getExampleEnd_Start(),
				"end", null, 0, 1, ExampleStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(exampleEndEClass, ExampleEnd.class, "ExampleEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExampleEnd_Start(), this.getExampleStart(), this.getExampleStart_End(),
				"start", null, 0, 1, ExampleEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(urlStartEClass, URLStart.class, "URLStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getURLStart_Content(), theRichstringPackage.getRichStringURL(), null,
				"content", null, 0, 1, URLStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getURLStart_End(), this.getURLEnd(), this.getURLEnd_Start(), "end", null, 0,
				1, URLStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlEndEClass, URLEnd.class, "URLEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getURLEnd_Start(), this.getURLStart(), this.getURLStart_End(), "start",
				null, 0, 1, URLEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(refStartEClass, RefStart.class, "RefStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefStart_Content(), theRichstringPackage.getRichStringRef(), null,
				"content", null, 0, 1, RefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRefStart_End(), this.getRefEnd(), this.getRefEnd_Start(), "end", null, 0,
				1, RefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refEndEClass, RefEnd.class, "RefEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefEnd_Start(), this.getRefStart(), this.getRefStart_End(), "start",
				null, 0, 1, RefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(boldStartEClass, BoldStart.class, "BoldStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoldStart_Content(), theRichstringPackage.getRichStringBold(), null,
				"content", null, 0, 1, BoldStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBoldStart_End(), this.getBoldEnd(), null, "end", null, 0, 1,
				BoldStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boldEndEClass, BoldEnd.class, "BoldEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoldEnd_Start(), this.getBoldStart(), null, "start", null, 0, 1,
				BoldEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(underlineStartEClass, UnderlineStart.class, "UnderlineStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnderlineStart_Content(), theRichstringPackage.getRichStringUnderline(),
				null, "content", null, 0, 1, UnderlineStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUnderlineStart_End(), this.getUnderlineEnd(), null, "end", null, 0, 1,
				UnderlineStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(underlineEndEClass, UnderlineEnd.class, "UnderlineEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnderlineEnd_Start(), this.getUnderlineStart(), null, "start", null, 0,
				1, UnderlineEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(italicStartEClass, ItalicStart.class, "ItalicStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItalicStart_Content(), theRichstringPackage.getRichStringItalic(), null,
				"content", null, 0, 1, ItalicStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getItalicStart_End(), this.getItalicEnd(), null, "end", null, 0, 1,
				ItalicStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(italicEndEClass, ItalicEnd.class, "ItalicEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItalicEnd_Start(), this.getItalicStart(), null, "start", null, 0, 1,
				ItalicEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imgStartEClass, ImgStart.class, "ImgStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImgStart_Content(), theRichstringPackage.getRichStringImg(), null,
				"content", null, 0, 1, ImgStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mailtoStartEClass, MailtoStart.class, "MailtoStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMailtoStart_Content(), theRichstringPackage.getRichStringMailto(), null,
				"content", null, 0, 1, MailtoStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMailtoStart_End(), this.getMailtoEnd(), this.getMailtoEnd_Start(), "end",
				null, 0, 1, MailtoStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(mailtoEndEClass, MailtoEnd.class, "MailtoEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMailtoEnd_Start(), this.getMailtoStart(), this.getMailtoStart_End(),
				"start", null, 0, 1, MailtoEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(skypeStartEClass, SkypeStart.class, "SkypeStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkypeStart_Content(), theRichstringPackage.getRichStringSkype(), null,
				"content", null, 0, 1, SkypeStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSkypeStart_End(), this.getSkypeEnd(), this.getSkypeEnd_Start(), "end",
				null, 0, 1, SkypeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(skypeEndEClass, SkypeEnd.class, "SkypeEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkypeEnd_Start(), this.getSkypeStart(), this.getSkypeStart_End(),
				"start", null, 0, 1, SkypeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(movieStartEClass, MovieStart.class, "MovieStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMovieStart_Content(), theRichstringPackage.getRichStringMovie(), null,
				"content", null, 0, 1, MovieStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMovieStart_End(), this.getMovieEnd(), this.getMovieEnd_Start(), "end",
				null, 0, 1, MovieStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(movieEndEClass, MovieEnd.class, "MovieEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMovieEnd_Start(), this.getMovieStart(), this.getMovieStart_End(),
				"start", null, 0, 1, MovieEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(codeStartEClass, CodeStart.class, "CodeStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeStart_Content(), theRichstringPackage.getRichStringCode(), null,
				"content", null, 0, 1, CodeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCodeStart_End(), this.getCodeEnd(), this.getCodeEnd_Start(), "end", null,
				0, 1, CodeStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEndEClass, CodeEnd.class, "CodeEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeEnd_Start(), this.getCodeStart(), this.getCodeStart_End(), "start",
				null, 0, 1, CodeEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tableStartEClass, TableStart.class, "TableStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableStart_Rows(), theRichstringPackage.getRichStringTableRow(), null,
				"rows", null, 0, -1, TableStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTableStart_End(), this.getTableEnd(), null, "end", null, 0, 1,
				TableStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEndEClass, TableEnd.class, "TableEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableEnd_Start(), this.getTableStart(), null, "start", null, 0, 1,
				TableEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowStartEClass, TableRowStart.class, "TableRowStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRowStart_Columns(), theRichstringPackage.getRichStringTableData(),
				null, "columns", null, 0, -1, TableRowStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTableRowStart_End(), this.getTableRowEnd(), null, "end", null, 0, 1,
				TableRowStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableRowStart_TableStart(), this.getTableStart(), null, "tableStart",
				null, 0, 1, TableRowStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(tableRowEndEClass, TableRowEnd.class, "TableRowEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRowEnd_Start(), this.getTableRowStart(), null, "start", null, 0, 1,
				TableRowEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableDataStartEClass, TableDataStart.class, "TableDataStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableDataStart_Content(), theRichstringPackage.getRichStringTableData(),
				null, "content", null, 0, 1, TableDataStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTableDataStart_End(), this.getTableDataEnd(), null, "end", null, 0, 1,
				TableDataStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableDataStart_TableRowStart(), this.getTableRowStart(), null,
				"tableRowStart", null, 0, 1, TableDataStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(tableDataEndEClass, TableDataEnd.class, "TableDataEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableDataEnd_Start(), this.getTableDataStart(), null, "start", null, 0,
				1, TableDataEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chapterStartEClass, ChapterStart.class, "ChapterStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChapterStart_Content(), theRichstringPackage.getRichStringChapter(),
				null, "content", null, 0, 1, ChapterStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getChapterStart_End(), this.getChapterEnd(), this.getChapterEnd_Start(),
				"end", null, 0, 1, ChapterStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(chapterEndEClass, ChapterEnd.class, "ChapterEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChapterEnd_Start(), this.getChapterStart(), this.getChapterStart_End(),
				"start", null, 0, 1, ChapterEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sectionStartEClass, SectionStart.class, "SectionStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionStart_Content(), theRichstringPackage.getRichStringSection(),
				null, "content", null, 0, 1, SectionStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSectionStart_End(), this.getSectionEnd(), this.getSectionEnd_Start(),
				"end", null, 0, 1, SectionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sectionEndEClass, SectionEnd.class, "SectionEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSectionEnd_Start(), this.getSectionStart(), this.getSectionStart_End(),
				"start", null, 0, 1, SectionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(subsectionStartEClass, SubsectionStart.class, "SubsectionStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubsectionStart_Content(),
				theRichstringPackage.getRichStringSubsection(), null, "content", null, 0, 1,
				SubsectionStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubsectionStart_End(), this.getSubsectionEnd(),
				this.getSubsectionEnd_Start(), "end", null, 0, 1, SubsectionStart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subsectionEndEClass, SubsectionEnd.class, "SubsectionEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubsectionEnd_Start(), this.getSubsectionStart(),
				this.getSubsectionStart_End(), "start", null, 0, 1, SubsectionEnd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openViewStartEClass, OpenViewStart.class, "OpenViewStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenViewStart_Content(), theRichstringPackage.getRichStringOpenView(),
				null, "content", null, 0, 1, OpenViewStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOpenViewStart_End(), this.getOpenViewEnd(), this.getOpenViewEnd_Start(),
				"end", null, 0, 1, OpenViewStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(openViewEndEClass, OpenViewEnd.class, "OpenViewEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpenViewEnd_Start(), this.getOpenViewStart(),
				this.getOpenViewStart_End(), "start", null, 0, 1, OpenViewEnd.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startProcessStartEClass, StartProcessStart.class, "StartProcessStart",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartProcessStart_Content(),
				theRichstringPackage.getRichStringStartProcess(), null, "content", null, 0, 1,
				StartProcessStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartProcessStart_End(), this.getStartProcessEnd(),
				this.getStartProcessEnd_Start(), "end", null, 0, 1, StartProcessStart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startProcessEndEClass, StartProcessEnd.class, "StartProcessEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartProcessEnd_Start(), this.getStartProcessStart(),
				this.getStartProcessStart_End(), "start", null, 0, 1, StartProcessEnd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityRefStartEClass, EntityRefStart.class, "EntityRefStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityRefStart_Content(), theRichstringPackage.getRichStringEntityRef(),
				null, "content", null, 0, 1, EntityRefStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEntityRefStart_End(), this.getEntityRefEnd(),
				this.getEntityRefEnd_Start(), "end", null, 0, 1, EntityRefStart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityRefEndEClass, EntityRefEnd.class, "EntityRefEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityRefEnd_Start(), this.getEntityRefStart(),
				this.getEntityRefStart_End(), "start", null, 0, 1, EntityRefEnd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoRefStartEClass, DTORefStart.class, "DTORefStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTORefStart_Content(), theRichstringPackage.getRichStringDTORef(), null,
				"content", null, 0, 1, DTORefStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDTORefStart_End(), this.getDTORefEnd(), this.getDTORefEnd_Start(), "end",
				null, 0, 1, DTORefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dtoRefEndEClass, DTORefEnd.class, "DTORefEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDTORefEnd_Start(), this.getDTORefStart(), this.getDTORefStart_End(),
				"start", null, 0, 1, DTORefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(processRefStartEClass, ProcessRefStart.class, "ProcessRefStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessRefStart_Content(),
				theRichstringPackage.getRichStringProcessRef(), null, "content", null, 0, 1,
				ProcessRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessRefStart_End(), this.getProcessRefEnd(),
				this.getProcessRefEnd_Start(), "end", null, 0, 1, ProcessRefStart.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processRefEndEClass, ProcessRefEnd.class, "ProcessRefEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessRefEnd_Start(), this.getProcessRefStart(),
				this.getProcessRefStart_End(), "start", null, 0, 1, ProcessRefEnd.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRefStartEClass, TaskRefStart.class, "TaskRefStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRefStart_Content(), theRichstringPackage.getRichStringTaskRef(),
				null, "content", null, 0, 1, TaskRefStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRefStart_End(), this.getTaskRefEnd(), this.getTaskRefEnd_Start(),
				"end", null, 0, 1, TaskRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(taskRefEndEClass, TaskRefEnd.class, "TaskRefEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRefEnd_Start(), this.getTaskRefStart(), this.getTaskRefStart_End(),
				"start", null, 0, 1, TaskRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(viewRefStartEClass, ViewRefStart.class, "ViewRefStart", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewRefStart_Content(), theRichstringPackage.getRichStringViewRef(),
				null, "content", null, 0, 1, ViewRefStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getViewRefStart_End(), this.getViewRefEnd(), this.getViewRefEnd_Start(),
				"end", null, 0, 1, ViewRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(viewRefEndEClass, ViewRefEnd.class, "ViewRefEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewRefEnd_Start(), this.getViewRefStart(), this.getViewRefStart_End(),
				"start", null, 0, 1, ViewRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(uiRefStartEClass, UIRefStart.class, "UIRefStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIRefStart_Content(), theRichstringPackage.getRichStringUIRef(), null,
				"content", null, 0, 1, UIRefStart.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getUIRefStart_End(), this.getUIRefEnd(), this.getUIRefEnd_Start(), "end",
				null, 0, 1, UIRefStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(uiRefEndEClass, UIRefEnd.class, "UIRefEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIRefEnd_Start(), this.getUIRefStart(), this.getUIRefStart_End(),
				"start", null, 0, 1, UIRefEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(listStartEClass, ListStart.class, "ListStart", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListStart_Content(), theRichstringPackage.getRichStringList(), null,
				"content", null, 0, 1, ListStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getListStart_Elements(), this.getListElementStart(), null, "elements", null,
				0, -1, ListStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListStart_End(), this.getListEnd(), null, "end", null, 0, 1,
				ListStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listEndEClass, ListEnd.class, "ListEnd", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListEnd_Start(), this.getListStart(), null, "start", null, 0, 1,
				ListEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listElementStartEClass, ListElementStart.class, "ListElementStart",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListElementStart_Content(),
				theRichstringPackage.getRichStringListElement(), null, "content", null, 0, 1,
				ListElementStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListElementStart_End(), this.getListElementEnd(), null, "end", null, 0,
				1, ListElementStart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(listElementEndEClass, ListElementEnd.class, "ListElementEnd", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListElementEnd_Start(), this.getListElementStart(), null, "start", null,
				0, 1, ListElementEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // DocCompilerPackageImpl
