/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
import org.lunifera.doc.dsl.doccompiler.URLEnd;
import org.lunifera.doc.dsl.doccompiler.URLStart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocCompilerFactoryImpl extends EFactoryImpl implements DocCompilerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocCompilerFactory init() {
		try {
			DocCompilerFactory theDocCompilerFactory = (DocCompilerFactory)EPackage.Registry.INSTANCE.getEFactory(DocCompilerPackage.eNS_URI);
			if (theDocCompilerFactory != null) {
				return theDocCompilerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocCompilerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocCompilerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DocCompilerPackage.DOCUMENT_START: return createDocumentStart();
			case DocCompilerPackage.DOCUMENT_END: return createDocumentEnd();
			case DocCompilerPackage.PROCESSED_RICH_STRING: return createProcessedRichString();
			case DocCompilerPackage.LINE: return createLine();
			case DocCompilerPackage.LINE_PART: return createLinePart();
			case DocCompilerPackage.LITERAL: return createLiteral();
			case DocCompilerPackage.LINE_BREAK: return createLineBreak();
			case DocCompilerPackage.FOR_LOOP_START: return createForLoopStart();
			case DocCompilerPackage.FOR_LOOP_END: return createForLoopEnd();
			case DocCompilerPackage.PRINTED_EXPRESSION: return createPrintedExpression();
			case DocCompilerPackage.IF_CONDITION_START: return createIfConditionStart();
			case DocCompilerPackage.ELSE_IF_CONDITION: return createElseIfCondition();
			case DocCompilerPackage.ELSE_START: return createElseStart();
			case DocCompilerPackage.END_IF: return createEndIf();
			case DocCompilerPackage.MARKUP: return createMarkup();
			case DocCompilerPackage.H1_START: return createH1Start();
			case DocCompilerPackage.H1_END: return createH1End();
			case DocCompilerPackage.H2_START: return createH2Start();
			case DocCompilerPackage.H2_END: return createH2End();
			case DocCompilerPackage.EXAMPLE_START: return createExampleStart();
			case DocCompilerPackage.EXAMPLE_END: return createExampleEnd();
			case DocCompilerPackage.URL_START: return createURLStart();
			case DocCompilerPackage.URL_END: return createURLEnd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentStart createDocumentStart() {
		DocumentStartImpl documentStart = new DocumentStartImpl();
		return documentStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentEnd createDocumentEnd() {
		DocumentEndImpl documentEnd = new DocumentEndImpl();
		return documentEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessedRichString createProcessedRichString() {
		ProcessedRichStringImpl processedRichString = new ProcessedRichStringImpl();
		return processedRichString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinePart createLinePart() {
		LinePartImpl linePart = new LinePartImpl();
		return linePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreak createLineBreak() {
		LineBreakImpl lineBreak = new LineBreakImpl();
		return lineBreak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoopStart createForLoopStart() {
		ForLoopStartImpl forLoopStart = new ForLoopStartImpl();
		return forLoopStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoopEnd createForLoopEnd() {
		ForLoopEndImpl forLoopEnd = new ForLoopEndImpl();
		return forLoopEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrintedExpression createPrintedExpression() {
		PrintedExpressionImpl printedExpression = new PrintedExpressionImpl();
		return printedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfConditionStart createIfConditionStart() {
		IfConditionStartImpl ifConditionStart = new IfConditionStartImpl();
		return ifConditionStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseIfCondition createElseIfCondition() {
		ElseIfConditionImpl elseIfCondition = new ElseIfConditionImpl();
		return elseIfCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseStart createElseStart() {
		ElseStartImpl elseStart = new ElseStartImpl();
		return elseStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndIf createEndIf() {
		EndIfImpl endIf = new EndIfImpl();
		return endIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markup createMarkup() {
		MarkupImpl markup = new MarkupImpl();
		return markup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1Start createH1Start() {
		H1StartImpl h1Start = new H1StartImpl();
		return h1Start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1End createH1End() {
		H1EndImpl h1End = new H1EndImpl();
		return h1End;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H2Start createH2Start() {
		H2StartImpl h2Start = new H2StartImpl();
		return h2Start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H2End createH2End() {
		H2EndImpl h2End = new H2EndImpl();
		return h2End;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleStart createExampleStart() {
		ExampleStartImpl exampleStart = new ExampleStartImpl();
		return exampleStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleEnd createExampleEnd() {
		ExampleEndImpl exampleEnd = new ExampleEndImpl();
		return exampleEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLStart createURLStart() {
		URLStartImpl urlStart = new URLStartImpl();
		return urlStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLEnd createURLEnd() {
		URLEndImpl urlEnd = new URLEndImpl();
		return urlEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocCompilerPackage getDocCompilerPackage() {
		return (DocCompilerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocCompilerPackage getPackage() {
		return DocCompilerPackage.eINSTANCE;
	}

} //DocCompilerFactoryImpl
