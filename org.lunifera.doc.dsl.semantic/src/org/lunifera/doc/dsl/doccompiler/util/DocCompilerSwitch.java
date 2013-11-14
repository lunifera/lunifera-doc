/**
 */
package org.lunifera.doc.dsl.doccompiler.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage
 * @generated
 */
public class DocCompilerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocCompilerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocCompilerSwitch() {
		if (modelPackage == null) {
			modelPackage = DocCompilerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DocCompilerPackage.DOCUMENT_START: {
				DocumentStart documentStart = (DocumentStart)theEObject;
				T result = caseDocumentStart(documentStart);
				if (result == null) result = caseLinePart(documentStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.DOCUMENT_END: {
				DocumentEnd documentEnd = (DocumentEnd)theEObject;
				T result = caseDocumentEnd(documentEnd);
				if (result == null) result = caseLinePart(documentEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.PROCESSED_RICH_STRING: {
				ProcessedRichString processedRichString = (ProcessedRichString)theEObject;
				T result = caseProcessedRichString(processedRichString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.LINE: {
				Line line = (Line)theEObject;
				T result = caseLine(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.LINE_PART: {
				LinePart linePart = (LinePart)theEObject;
				T result = caseLinePart(linePart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseLinePart(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.LINE_BREAK: {
				LineBreak lineBreak = (LineBreak)theEObject;
				T result = caseLineBreak(lineBreak);
				if (result == null) result = caseLiteral(lineBreak);
				if (result == null) result = caseLinePart(lineBreak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.FOR_LOOP_START: {
				ForLoopStart forLoopStart = (ForLoopStart)theEObject;
				T result = caseForLoopStart(forLoopStart);
				if (result == null) result = caseLinePart(forLoopStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.FOR_LOOP_END: {
				ForLoopEnd forLoopEnd = (ForLoopEnd)theEObject;
				T result = caseForLoopEnd(forLoopEnd);
				if (result == null) result = caseLinePart(forLoopEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.PRINTED_EXPRESSION: {
				PrintedExpression printedExpression = (PrintedExpression)theEObject;
				T result = casePrintedExpression(printedExpression);
				if (result == null) result = caseLinePart(printedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.IF_CONDITION_START: {
				IfConditionStart ifConditionStart = (IfConditionStart)theEObject;
				T result = caseIfConditionStart(ifConditionStart);
				if (result == null) result = caseLinePart(ifConditionStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.ELSE_IF_CONDITION: {
				ElseIfCondition elseIfCondition = (ElseIfCondition)theEObject;
				T result = caseElseIfCondition(elseIfCondition);
				if (result == null) result = caseLinePart(elseIfCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.ELSE_START: {
				ElseStart elseStart = (ElseStart)theEObject;
				T result = caseElseStart(elseStart);
				if (result == null) result = caseLinePart(elseStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.END_IF: {
				EndIf endIf = (EndIf)theEObject;
				T result = caseEndIf(endIf);
				if (result == null) result = caseLinePart(endIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.MARKUP: {
				Markup markup = (Markup)theEObject;
				T result = caseMarkup(markup);
				if (result == null) result = caseLinePart(markup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.H1_START: {
				H1Start h1Start = (H1Start)theEObject;
				T result = caseH1Start(h1Start);
				if (result == null) result = caseLinePart(h1Start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.H1_END: {
				H1End h1End = (H1End)theEObject;
				T result = caseH1End(h1End);
				if (result == null) result = caseLinePart(h1End);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.H2_START: {
				H2Start h2Start = (H2Start)theEObject;
				T result = caseH2Start(h2Start);
				if (result == null) result = caseLinePart(h2Start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.H2_END: {
				H2End h2End = (H2End)theEObject;
				T result = caseH2End(h2End);
				if (result == null) result = caseLinePart(h2End);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.EXAMPLE_START: {
				ExampleStart exampleStart = (ExampleStart)theEObject;
				T result = caseExampleStart(exampleStart);
				if (result == null) result = caseLinePart(exampleStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocCompilerPackage.EXAMPLE_END: {
				ExampleEnd exampleEnd = (ExampleEnd)theEObject;
				T result = caseExampleEnd(exampleEnd);
				if (result == null) result = caseLinePart(exampleEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentStart(DocumentStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentEnd(DocumentEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processed Rich String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processed Rich String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessedRichString(ProcessedRichString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinePart(LinePart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineBreak(LineBreak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoopStart(ForLoopStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoopEnd(ForLoopEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Printed Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Printed Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrintedExpression(PrintedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Condition Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Condition Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfConditionStart(IfConditionStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else If Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else If Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseIfCondition(ElseIfCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseStart(ElseStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndIf(EndIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarkup(Markup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1Start(H1Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1End(H1End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H2 Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H2 Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH2Start(H2Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H2 End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H2 End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH2End(H2End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleStart(ExampleStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleEnd(ExampleEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DocCompilerSwitch
