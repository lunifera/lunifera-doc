/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage
 * @generated
 */
public interface DocCompilerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	DocCompilerFactory eINSTANCE = org.lunifera.doc.dsl.doccompiler.impl.DocCompilerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Start</em>'.
	 * @generated
	 */
	DocumentStart createDocumentStart();

	/**
	 * Returns a new object of class '<em>Document End</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Document End</em>'.
	 * @generated
	 */
	DocumentEnd createDocumentEnd();

	/**
	 * Returns a new object of class '<em>Processed Rich String</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Processed Rich String</em>'.
	 * @generated
	 */
	ProcessedRichString createProcessedRichString();

	/**
	 * Returns a new object of class '<em>Line</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Line</em>'.
	 * @generated
	 */
	Line createLine();

	/**
	 * Returns a new object of class '<em>Line Part</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Part</em>'.
	 * @generated
	 */
	LinePart createLinePart();

	/**
	 * Returns a new object of class '<em>Literal</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal</em>'.
	 * @generated
	 */
	Literal createLiteral();

	/**
	 * Returns a new object of class '<em>Line Break</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Break</em>'.
	 * @generated
	 */
	LineBreak createLineBreak();

	/**
	 * Returns a new object of class '<em>For Loop Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>For Loop Start</em>'.
	 * @generated
	 */
	ForLoopStart createForLoopStart();

	/**
	 * Returns a new object of class '<em>For Loop End</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>For Loop End</em>'.
	 * @generated
	 */
	ForLoopEnd createForLoopEnd();

	/**
	 * Returns a new object of class '<em>Printed Expression</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Printed Expression</em>'.
	 * @generated
	 */
	PrintedExpression createPrintedExpression();

	/**
	 * Returns a new object of class '<em>If Condition Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>If Condition Start</em>'.
	 * @generated
	 */
	IfConditionStart createIfConditionStart();

	/**
	 * Returns a new object of class '<em>Else If Condition</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Else If Condition</em>'.
	 * @generated
	 */
	ElseIfCondition createElseIfCondition();

	/**
	 * Returns a new object of class '<em>Else Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Else Start</em>'.
	 * @generated
	 */
	ElseStart createElseStart();

	/**
	 * Returns a new object of class '<em>End If</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>End If</em>'.
	 * @generated
	 */
	EndIf createEndIf();

	/**
	 * Returns a new object of class '<em>Markup</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Markup</em>'.
	 * @generated
	 */
	Markup createMarkup();

	/**
	 * Returns a new object of class '<em>H1 Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>H1 Start</em>'.
	 * @generated
	 */
	H1Start createH1Start();

	/**
	 * Returns a new object of class '<em>H1 End</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>H1 End</em>'.
	 * @generated
	 */
	H1End createH1End();

	/**
	 * Returns a new object of class '<em>H2 Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>H2 Start</em>'.
	 * @generated
	 */
	H2Start createH2Start();

	/**
	 * Returns a new object of class '<em>H2 End</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>H2 End</em>'.
	 * @generated
	 */
	H2End createH2End();

	/**
	 * Returns a new object of class '<em>Example Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Start</em>'.
	 * @generated
	 */
	ExampleStart createExampleStart();

	/**
	 * Returns a new object of class '<em>Example End</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>Example End</em>'.
	 * @generated
	 */
	ExampleEnd createExampleEnd();

	/**
	 * Returns a new object of class '<em>URL Start</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Start</em>'.
	 * @generated
	 */
	URLStart createURLStart();

	/**
	 * Returns a new object of class '<em>URL End</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>URL End</em>'.
	 * @generated
	 */
	URLEnd createURLEnd();

	/**
	 * Returns a new object of class '<em>Bold Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bold Start</em>'.
	 * @generated
	 */
	BoldStart createBoldStart();

	/**
	 * Returns a new object of class '<em>Underline Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Underline Start</em>'.
	 * @generated
	 */
	UnderlineStart createUnderlineStart();

	/**
	 * Returns a new object of class '<em>Italic Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Italic Start</em>'.
	 * @generated
	 */
	ItalicStart createItalicStart();

	/**
	 * Returns a new object of class '<em>Bold End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bold End</em>'.
	 * @generated
	 */
	BoldEnd createBoldEnd();

	/**
	 * Returns a new object of class '<em>Underline End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Underline End</em>'.
	 * @generated
	 */
	UnderlineEnd createUnderlineEnd();

	/**
	 * Returns a new object of class '<em>Italic End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Italic End</em>'.
	 * @generated
	 */
	ItalicEnd createItalicEnd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocCompilerPackage getDocCompilerPackage();

} // DocCompilerFactory
