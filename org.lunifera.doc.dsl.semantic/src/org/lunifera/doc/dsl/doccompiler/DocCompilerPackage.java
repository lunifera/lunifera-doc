/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerFactory
 * @model kind="package"
 * @generated
 */
public interface DocCompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "doccompiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/doccompiler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "doccompiler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocCompilerPackage eINSTANCE = org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LinePartImpl <em>Line Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LinePartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLinePart()
	 * @generated
	 */
	int LINE_PART = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PART__LINE = 0;

	/**
	 * The number of structural features of the '<em>Line Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Line Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl <em>Document Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentStart()
	 * @generated
	 */
	int DOCUMENT_START = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__DOCUMENT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Document Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Document Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl <em>Document End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentEnd()
	 * @generated
	 */
	int DOCUMENT_END = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl <em>Processed Rich String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessedRichString()
	 * @generated
	 */
	int PROCESSED_RICH_STRING = 2;

	/**
	 * The feature id for the '<em><b>Rich String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING__RICH_STRING = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING__LINES = 1;

	/**
	 * The number of structural features of the '<em>Processed Rich String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processed Rich String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LineImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Rich String</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__RICH_STRING = 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LiteralImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LITERAL = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__OFFSET = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LENGTH = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl <em>Line Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLineBreak()
	 * @generated
	 */
	int LINE_BREAK = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__LINE = LITERAL__LINE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__LITERAL = LITERAL__LITERAL;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__OFFSET = LITERAL__OFFSET;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__LENGTH = LITERAL__LENGTH;

	/**
	 * The number of structural features of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl <em>For Loop Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopStart()
	 * @generated
	 */
	int FOR_LOOP_START = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START__LOOP = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Loop Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>For Loop Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl <em>For Loop End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopEnd()
	 * @generated
	 */
	int FOR_LOOP_END = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For Loop End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>For Loop End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl <em>Printed Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getPrintedExpression()
	 * @generated
	 */
	int PRINTED_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION__EXPRESSION = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Printed Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Printed Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl <em>If Condition Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getIfConditionStart()
	 * @generated
	 */
	int IF_CONDITION_START = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Rich String If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__RICH_STRING_IF = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__ELSE_START = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__ELSE_IF_CONDITIONS = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__END_IF = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If Condition Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>If Condition Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseIfCondition()
	 * @generated
	 */
	int ELSE_IF_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Rich String Else If</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION__RICH_STRING_ELSE_IF = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Condition Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Else If Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Else If Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl <em>Else Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseStart()
	 * @generated
	 */
	int ELSE_START = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>If Condition Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_START__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Else Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Else Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl <em>End If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEndIf()
	 * @generated
	 */
	int END_IF = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_IF__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>If Condition Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_IF__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_IF_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_IF_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl <em>Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMarkup()
	 * @generated
	 */
	int MARKUP = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Markup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__MARKUP = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl <em>H1 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1Start()
	 * @generated
	 */
	int H1_START = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H1 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H1 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl <em>H1 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1End()
	 * @generated
	 */
	int H1_END = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H1 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H1 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl <em>H2 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2Start()
	 * @generated
	 */
	int H2_START = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H2 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H2 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl <em>H2 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2End()
	 * @generated
	 */
	int H2_END = 18;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H2 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H2 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H3StartImpl <em>H3 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H3StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH3Start()
	 * @generated
	 */
	int H3_START = 19;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H3 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H3 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H3EndImpl <em>H3 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H3EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH3End()
	 * @generated
	 */
	int H3_END = 20;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H3 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H3 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H4StartImpl <em>H4 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H4StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH4Start()
	 * @generated
	 */
	int H4_START = 21;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H4 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H4 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H4EndImpl <em>H4 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H4EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH4End()
	 * @generated
	 */
	int H4_END = 22;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H4 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H4 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H5StartImpl <em>H5 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H5StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH5Start()
	 * @generated
	 */
	int H5_START = 23;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H5 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H5 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H5EndImpl <em>H5 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H5EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH5End()
	 * @generated
	 */
	int H5_END = 24;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H5 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H5 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H6StartImpl <em>H6 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H6StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH6Start()
	 * @generated
	 */
	int H6_START = 25;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H6 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H6 Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H6EndImpl <em>H6 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H6EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH6End()
	 * @generated
	 */
	int H6_END = 26;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H6 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H6 End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl <em>Example Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleStart()
	 * @generated
	 */
	int EXAMPLE_START = 27;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Example Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Example Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl <em>Example End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleEnd()
	 * @generated
	 */
	int EXAMPLE_END = 28;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Example End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Example End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl <em>URL Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLStart()
	 * @generated
	 */
	int URL_START = 29;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>URL Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>URL Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl <em>URL End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLEnd()
	 * @generated
	 */
	int URL_END = 30;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>URL End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.RefStartImpl <em>Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.RefStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getRefStart()
	 * @generated
	 */
	int REF_START = 31;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.RefEndImpl <em>Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.RefEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getRefEnd()
	 * @generated
	 */
	int REF_END = 32;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl <em>Bold Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getBoldStart()
	 * @generated
	 */
	int BOLD_START = 33;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bold Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bold Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.BoldEndImpl <em>Bold End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.BoldEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getBoldEnd()
	 * @generated
	 */
	int BOLD_END = 34;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bold End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bold End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UnderlineStartImpl <em>Underline Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.UnderlineStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUnderlineStart()
	 * @generated
	 */
	int UNDERLINE_START = 35;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Underline Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Underline Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UnderlineEndImpl <em>Underline End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.UnderlineEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUnderlineEnd()
	 * @generated
	 */
	int UNDERLINE_END = 36;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Underline End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Underline End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDERLINE_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ItalicStartImpl <em>Italic Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ItalicStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getItalicStart()
	 * @generated
	 */
	int ITALIC_START = 37;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Italic Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Italic Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ItalicEndImpl <em>Italic End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ItalicEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getItalicEnd()
	 * @generated
	 */
	int ITALIC_END = 38;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Italic End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Italic End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SpanStartImpl <em>Span Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SpanStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSpanStart()
	 * @generated
	 */
	int SPAN_START = 39;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Span Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Span Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SpanEndImpl <em>Span End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SpanEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSpanEnd()
	 * @generated
	 */
	int SPAN_END = 40;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Span End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Span End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ImgStartImpl <em>Img Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ImgStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getImgStart()
	 * @generated
	 */
	int IMG_START = 41;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Img Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Img Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ImgEndImpl <em>Img End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ImgEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getImgEnd()
	 * @generated
	 */
	int IMG_END = 42;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Img End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Img End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MailtoStartImpl <em>Mailto Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.MailtoStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMailtoStart()
	 * @generated
	 */
	int MAILTO_START = 43;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mailto Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mailto Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MailtoEndImpl <em>Mailto End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.MailtoEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMailtoEnd()
	 * @generated
	 */
	int MAILTO_END = 44;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mailto End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mailto End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILTO_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SkypeStartImpl <em>Skype Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SkypeStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSkypeStart()
	 * @generated
	 */
	int SKYPE_START = 45;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Skype Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Skype Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SkypeEndImpl <em>Skype End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SkypeEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSkypeEnd()
	 * @generated
	 */
	int SKYPE_END = 46;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Skype End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Skype End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKYPE_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MovieStartImpl <em>Movie Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.MovieStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMovieStart()
	 * @generated
	 */
	int MOVIE_START = 47;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Movie Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Movie Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MovieEndImpl <em>Movie End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.MovieEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMovieEnd()
	 * @generated
	 */
	int MOVIE_END = 48;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Movie End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Movie End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVIE_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.CodeStartImpl <em>Code Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.CodeStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getCodeStart()
	 * @generated
	 */
	int CODE_START = 49;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Code Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Code Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.CodeEndImpl <em>Code End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.CodeEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getCodeEnd()
	 * @generated
	 */
	int CODE_END = 50;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableStartImpl <em>Table Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TableStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableStart()
	 * @generated
	 */
	int TABLE_START = 51;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_START__ROWS = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_START__END = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableEndImpl <em>Table End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TableEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableEnd()
	 * @generated
	 */
	int TABLE_END = 52;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableRowStartImpl <em>Table Row Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TableRowStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableRowStart()
	 * @generated
	 */
	int TABLE_ROW_START = 53;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_START__COLUMNS = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_START__END = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table Row Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table Row Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableRowEndImpl <em>Table Row End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TableRowEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableRowEnd()
	 * @generated
	 */
	int TABLE_ROW_END = 54;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Row End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Row End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableDataStartImpl <em>Table Data Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TableDataStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableDataStart()
	 * @generated
	 */
	int TABLE_DATA_START = 55;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Data Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table Data Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableDataEndImpl <em>Table Data End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TableDataEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableDataEnd()
	 * @generated
	 */
	int TABLE_DATA_END = 56;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Data End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Data End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_DATA_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListStartImpl <em>List Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ListStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListStart()
	 * @generated
	 */
	int LIST_START = 57;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_START__ELEMENTS = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_START__END = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>List Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListEndImpl <em>List End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ListEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListEnd()
	 * @generated
	 */
	int LIST_END = 58;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OrderedListStartImpl <em>Ordered List Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.OrderedListStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOrderedListStart()
	 * @generated
	 */
	int ORDERED_LIST_START = 59;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_START__ELEMENTS = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_START__END = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ordered List Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ordered List Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OrderedListEndImpl <em>Ordered List End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.OrderedListEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOrderedListEnd()
	 * @generated
	 */
	int ORDERED_LIST_END = 60;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ordered List End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ordered List End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListElementStartImpl <em>List Element Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ListElementStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListElementStart()
	 * @generated
	 */
	int LIST_ELEMENT_START = 61;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Element Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Element Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListElementEndImpl <em>List Element End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ListElementEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListElementEnd()
	 * @generated
	 */
	int LIST_ELEMENT_END = 62;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Element End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Element End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ChapterStartImpl <em>Chapter Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ChapterStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getChapterStart()
	 * @generated
	 */
	int CHAPTER_START = 63;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chapter Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Chapter Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ChapterEndImpl <em>Chapter End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ChapterEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getChapterEnd()
	 * @generated
	 */
	int CHAPTER_END = 64;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chapter End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chapter End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SectionStartImpl <em>Section Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SectionStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSectionStart()
	 * @generated
	 */
	int SECTION_START = 65;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SectionEndImpl <em>Section End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SectionEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSectionEnd()
	 * @generated
	 */
	int SECTION_END = 66;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SubsectionStartImpl <em>Subsection Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SubsectionStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSubsectionStart()
	 * @generated
	 */
	int SUBSECTION_START = 67;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subsection Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Subsection Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SubsectionEndImpl <em>Subsection End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.SubsectionEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSubsectionEnd()
	 * @generated
	 */
	int SUBSECTION_END = 68;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subsection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subsection End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSECTION_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OpenViewStartImpl <em>Open View Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.OpenViewStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOpenViewStart()
	 * @generated
	 */
	int OPEN_VIEW_START = 69;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Open View Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Open View Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OpenViewEndImpl <em>Open View End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.OpenViewEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOpenViewEnd()
	 * @generated
	 */
	int OPEN_VIEW_END = 70;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Open View End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Open View End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_VIEW_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.StartProcessStartImpl <em>Start Process Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.StartProcessStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getStartProcessStart()
	 * @generated
	 */
	int START_PROCESS_START = 71;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Start Process Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Start Process Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.StartProcessEndImpl <em>Start Process End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.StartProcessEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getStartProcessEnd()
	 * @generated
	 */
	int START_PROCESS_END = 72;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Process End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start Process End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PROCESS_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EntityRefStartImpl <em>Entity Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.EntityRefStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEntityRefStart()
	 * @generated
	 */
	int ENTITY_REF_START = 73;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entity Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Entity Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EntityRefEndImpl <em>Entity Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.EntityRefEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEntityRefEnd()
	 * @generated
	 */
	int ENTITY_REF_END = 74;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_REF_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DTORefStartImpl <em>DTO Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DTORefStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDTORefStart()
	 * @generated
	 */
	int DTO_REF_START = 75;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DTO Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>DTO Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DTORefEndImpl <em>DTO Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DTORefEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDTORefEnd()
	 * @generated
	 */
	int DTO_REF_END = 76;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DTO Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DTO Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_REF_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessRefStartImpl <em>Process Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessRefStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessRefStart()
	 * @generated
	 */
	int PROCESS_REF_START = 77;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Process Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Process Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessRefEndImpl <em>Process Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessRefEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessRefEnd()
	 * @generated
	 */
	int PROCESS_REF_END = 78;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REF_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TaskRefStartImpl <em>Task Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TaskRefStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTaskRefStart()
	 * @generated
	 */
	int TASK_REF_START = 79;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Task Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Task Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TaskRefEndImpl <em>Task Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.TaskRefEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTaskRefEnd()
	 * @generated
	 */
	int TASK_REF_END = 80;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REF_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ViewRefStartImpl <em>View Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ViewRefStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getViewRefStart()
	 * @generated
	 */
	int VIEW_REF_START = 81;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ViewRefEndImpl <em>View Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ViewRefEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getViewRefEnd()
	 * @generated
	 */
	int VIEW_REF_END = 82;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_REF_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UIRefStartImpl <em>UI Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.UIRefStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUIRefStart()
	 * @generated
	 */
	int UI_REF_START = 83;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>UI Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>UI Ref Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UIRefEndImpl <em>UI Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.UIRefEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUIRefEnd()
	 * @generated
	 */
	int UI_REF_END = 84;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>UI Ref End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_REF_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart <em>Document Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart
	 * @generated
	 */
	EClass getDocumentStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart#getContent()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart#getEnd()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart#getDocument()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_Document();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.DocumentEnd <em>Document End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentEnd
	 * @generated
	 */
	EClass getDocumentEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentEnd#getStart()
	 * @see #getDocumentEnd()
	 * @generated
	 */
	EReference getDocumentEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString <em>Processed Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processed Rich String</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessedRichString
	 * @generated
	 */
	EClass getProcessedRichString();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getRichString()
	 * @see #getProcessedRichString()
	 * @generated
	 */
	EReference getProcessedRichString_RichString();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getLines()
	 * @see #getProcessedRichString()
	 * @generated
	 */
	EReference getProcessedRichString_Lines();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.doccompiler.Line#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Line#getParts()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Parts();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.doc.dsl.doccompiler.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rich String</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Line#getRichString()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_RichString();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.LinePart <em>Line Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Part</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.LinePart
	 * @generated
	 */
	EClass getLinePart();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.doc.dsl.doccompiler.LinePart#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Line</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.LinePart#getLine()
	 * @see #getLinePart()
	 * @generated
	 */
	EReference getLinePart_Line();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.Literal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal#getLiteral()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.doccompiler.Literal#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal#getOffset()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.doccompiler.Literal#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal#getLength()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Length();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.LineBreak
	 * @generated
	 */
	EClass getLineBreak();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ForLoopStart <em>For Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopStart
	 * @generated
	 */
	EClass getForLoopStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ForLoopStart#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopStart#getLoop()
	 * @see #getForLoopStart()
	 * @generated
	 */
	EReference getForLoopStart_Loop();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ForLoopStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopStart#getEnd()
	 * @see #getForLoopStart()
	 * @generated
	 */
	EReference getForLoopStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ForLoopEnd <em>For Loop End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopEnd
	 * @generated
	 */
	EClass getForLoopEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ForLoopEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopEnd#getStart()
	 * @see #getForLoopEnd()
	 * @generated
	 */
	EReference getForLoopEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.PrintedExpression <em>Printed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printed Expression</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.PrintedExpression
	 * @generated
	 */
	EClass getPrintedExpression();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.PrintedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.PrintedExpression#getExpression()
	 * @see #getPrintedExpression()
	 * @generated
	 */
	EReference getPrintedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart
	 * @generated
	 */
	EClass getIfConditionStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getRichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getRichStringIf()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_RichStringIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseStart()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_ElseStart();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Else If Conditions</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseIfConditions()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_ElseIfConditions();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getEndIf <em>End If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getEndIf()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_EndIf();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ElseIfCondition <em>Else If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If Condition</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseIfCondition
	 * @generated
	 */
	EClass getElseIfCondition();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getRichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String Else If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getRichStringElseIf()
	 * @see #getElseIfCondition()
	 * @generated
	 */
	EReference getElseIfCondition_RichStringElseIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getIfConditionStart()
	 * @see #getElseIfCondition()
	 * @generated
	 */
	EReference getElseIfCondition_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseStart
	 * @generated
	 */
	EClass getElseStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ElseStart#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseStart#getIfConditionStart()
	 * @see #getElseStart()
	 * @generated
	 */
	EReference getElseStart_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.EndIf <em>End If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EndIf
	 * @generated
	 */
	EClass getEndIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.EndIf#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EndIf#getIfConditionStart()
	 * @see #getEndIf()
	 * @generated
	 */
	EReference getEndIf_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.Markup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Markup
	 * @generated
	 */
	EClass getMarkup();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.Markup#getMarkup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Markup</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Markup#getMarkup()
	 * @see #getMarkup()
	 * @generated
	 */
	EReference getMarkup_Markup();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H1Start <em>H1 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1Start
	 * @generated
	 */
	EClass getH1Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H1Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1Start#getContent()
	 * @see #getH1Start()
	 * @generated
	 */
	EReference getH1Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H1Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1Start#getEnd()
	 * @see #getH1Start()
	 * @generated
	 */
	EReference getH1Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H1End <em>H1 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1End
	 * @generated
	 */
	EClass getH1End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H1End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1End#getStart()
	 * @see #getH1End()
	 * @generated
	 */
	EReference getH1End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H2Start <em>H2 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2Start
	 * @generated
	 */
	EClass getH2Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H2Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2Start#getContent()
	 * @see #getH2Start()
	 * @generated
	 */
	EReference getH2Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H2Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2Start#getEnd()
	 * @see #getH2Start()
	 * @generated
	 */
	EReference getH2Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H2End <em>H2 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2End
	 * @generated
	 */
	EClass getH2End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H2End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2End#getStart()
	 * @see #getH2End()
	 * @generated
	 */
	EReference getH2End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H3Start <em>H3 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H3Start
	 * @generated
	 */
	EClass getH3Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H3Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H3Start#getContent()
	 * @see #getH3Start()
	 * @generated
	 */
	EReference getH3Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H3Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H3Start#getEnd()
	 * @see #getH3Start()
	 * @generated
	 */
	EReference getH3Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H3End <em>H3 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H3End
	 * @generated
	 */
	EClass getH3End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H3End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H3End#getStart()
	 * @see #getH3End()
	 * @generated
	 */
	EReference getH3End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H4Start <em>H4 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H4Start
	 * @generated
	 */
	EClass getH4Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H4Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H4Start#getContent()
	 * @see #getH4Start()
	 * @generated
	 */
	EReference getH4Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H4Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H4Start#getEnd()
	 * @see #getH4Start()
	 * @generated
	 */
	EReference getH4Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H4End <em>H4 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H4End
	 * @generated
	 */
	EClass getH4End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H4End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H4End#getStart()
	 * @see #getH4End()
	 * @generated
	 */
	EReference getH4End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H5Start <em>H5 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H5 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H5Start
	 * @generated
	 */
	EClass getH5Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H5Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H5Start#getContent()
	 * @see #getH5Start()
	 * @generated
	 */
	EReference getH5Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H5Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H5Start#getEnd()
	 * @see #getH5Start()
	 * @generated
	 */
	EReference getH5Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H5End <em>H5 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H5 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H5End
	 * @generated
	 */
	EClass getH5End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H5End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H5End#getStart()
	 * @see #getH5End()
	 * @generated
	 */
	EReference getH5End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H6Start <em>H6 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H6 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H6Start
	 * @generated
	 */
	EClass getH6Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H6Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H6Start#getContent()
	 * @see #getH6Start()
	 * @generated
	 */
	EReference getH6Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H6Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H6Start#getEnd()
	 * @see #getH6Start()
	 * @generated
	 */
	EReference getH6Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H6End <em>H6 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H6 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H6End
	 * @generated
	 */
	EClass getH6End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H6End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H6End#getStart()
	 * @see #getH6End()
	 * @generated
	 */
	EReference getH6End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart <em>Example Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart
	 * @generated
	 */
	EClass getExampleStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart#getContent()
	 * @see #getExampleStart()
	 * @generated
	 */
	EReference getExampleStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart#getEnd()
	 * @see #getExampleStart()
	 * @generated
	 */
	EReference getExampleStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ExampleEnd <em>Example End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleEnd
	 * @generated
	 */
	EClass getExampleEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ExampleEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleEnd#getStart()
	 * @see #getExampleEnd()
	 * @generated
	 */
	EReference getExampleEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.URLStart <em>URL Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLStart
	 * @generated
	 */
	EClass getURLStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.URLStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLStart#getContent()
	 * @see #getURLStart()
	 * @generated
	 */
	EReference getURLStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.URLStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLStart#getEnd()
	 * @see #getURLStart()
	 * @generated
	 */
	EReference getURLStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.URLEnd <em>URL End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLEnd
	 * @generated
	 */
	EClass getURLEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.URLEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLEnd#getStart()
	 * @see #getURLEnd()
	 * @generated
	 */
	EReference getURLEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.RefStart <em>Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.RefStart
	 * @generated
	 */
	EClass getRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.RefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.RefStart#getContent()
	 * @see #getRefStart()
	 * @generated
	 */
	EReference getRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.RefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.RefStart#getEnd()
	 * @see #getRefStart()
	 * @generated
	 */
	EReference getRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.RefEnd <em>Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.RefEnd
	 * @generated
	 */
	EClass getRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.RefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.RefEnd#getStart()
	 * @see #getRefEnd()
	 * @generated
	 */
	EReference getRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.BoldStart <em>Bold Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.BoldStart
	 * @generated
	 */
	EClass getBoldStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.BoldStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.BoldStart#getContent()
	 * @see #getBoldStart()
	 * @generated
	 */
	EReference getBoldStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.BoldStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.BoldStart#getEnd()
	 * @see #getBoldStart()
	 * @generated
	 */
	EReference getBoldStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.BoldEnd <em>Bold End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.BoldEnd
	 * @generated
	 */
	EClass getBoldEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.BoldEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.BoldEnd#getStart()
	 * @see #getBoldEnd()
	 * @generated
	 */
	EReference getBoldEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.UnderlineStart <em>Underline Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underline Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UnderlineStart
	 * @generated
	 */
	EClass getUnderlineStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.UnderlineStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UnderlineStart#getContent()
	 * @see #getUnderlineStart()
	 * @generated
	 */
	EReference getUnderlineStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.UnderlineStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UnderlineStart#getEnd()
	 * @see #getUnderlineStart()
	 * @generated
	 */
	EReference getUnderlineStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.UnderlineEnd <em>Underline End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underline End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UnderlineEnd
	 * @generated
	 */
	EClass getUnderlineEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.UnderlineEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UnderlineEnd#getStart()
	 * @see #getUnderlineEnd()
	 * @generated
	 */
	EReference getUnderlineEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ItalicStart <em>Italic Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ItalicStart
	 * @generated
	 */
	EClass getItalicStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ItalicStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ItalicStart#getContent()
	 * @see #getItalicStart()
	 * @generated
	 */
	EReference getItalicStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ItalicStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ItalicStart#getEnd()
	 * @see #getItalicStart()
	 * @generated
	 */
	EReference getItalicStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ItalicEnd <em>Italic End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ItalicEnd
	 * @generated
	 */
	EClass getItalicEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ItalicEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ItalicEnd#getStart()
	 * @see #getItalicEnd()
	 * @generated
	 */
	EReference getItalicEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SpanStart <em>Span Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SpanStart
	 * @generated
	 */
	EClass getSpanStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SpanStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SpanStart#getContent()
	 * @see #getSpanStart()
	 * @generated
	 */
	EReference getSpanStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SpanStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SpanStart#getEnd()
	 * @see #getSpanStart()
	 * @generated
	 */
	EReference getSpanStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SpanEnd <em>Span End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SpanEnd
	 * @generated
	 */
	EClass getSpanEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SpanEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SpanEnd#getStart()
	 * @see #getSpanEnd()
	 * @generated
	 */
	EReference getSpanEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ImgStart <em>Img Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Img Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ImgStart
	 * @generated
	 */
	EClass getImgStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ImgStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ImgStart#getContent()
	 * @see #getImgStart()
	 * @generated
	 */
	EReference getImgStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ImgStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ImgStart#getEnd()
	 * @see #getImgStart()
	 * @generated
	 */
	EReference getImgStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ImgEnd <em>Img End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Img End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ImgEnd
	 * @generated
	 */
	EClass getImgEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ImgEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ImgEnd#getStart()
	 * @see #getImgEnd()
	 * @generated
	 */
	EReference getImgEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.MailtoStart <em>Mailto Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailto Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoStart
	 * @generated
	 */
	EClass getMailtoStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.MailtoStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoStart#getContent()
	 * @see #getMailtoStart()
	 * @generated
	 */
	EReference getMailtoStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.MailtoStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoStart#getEnd()
	 * @see #getMailtoStart()
	 * @generated
	 */
	EReference getMailtoStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.MailtoEnd <em>Mailto End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailto End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoEnd
	 * @generated
	 */
	EClass getMailtoEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.MailtoEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoEnd#getStart()
	 * @see #getMailtoEnd()
	 * @generated
	 */
	EReference getMailtoEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SkypeStart <em>Skype Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skype Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SkypeStart
	 * @generated
	 */
	EClass getSkypeStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SkypeStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SkypeStart#getContent()
	 * @see #getSkypeStart()
	 * @generated
	 */
	EReference getSkypeStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SkypeStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SkypeStart#getEnd()
	 * @see #getSkypeStart()
	 * @generated
	 */
	EReference getSkypeStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SkypeEnd <em>Skype End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skype End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SkypeEnd
	 * @generated
	 */
	EClass getSkypeEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SkypeEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SkypeEnd#getStart()
	 * @see #getSkypeEnd()
	 * @generated
	 */
	EReference getSkypeEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.MovieStart <em>Movie Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MovieStart
	 * @generated
	 */
	EClass getMovieStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.MovieStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MovieStart#getContent()
	 * @see #getMovieStart()
	 * @generated
	 */
	EReference getMovieStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.MovieStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MovieStart#getEnd()
	 * @see #getMovieStart()
	 * @generated
	 */
	EReference getMovieStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.MovieEnd <em>Movie End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MovieEnd
	 * @generated
	 */
	EClass getMovieEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.MovieEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.MovieEnd#getStart()
	 * @see #getMovieEnd()
	 * @generated
	 */
	EReference getMovieEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.CodeStart <em>Code Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.CodeStart
	 * @generated
	 */
	EClass getCodeStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.CodeStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.CodeStart#getContent()
	 * @see #getCodeStart()
	 * @generated
	 */
	EReference getCodeStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.CodeStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.CodeStart#getEnd()
	 * @see #getCodeStart()
	 * @generated
	 */
	EReference getCodeStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.CodeEnd <em>Code End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.CodeEnd
	 * @generated
	 */
	EClass getCodeEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.CodeEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.CodeEnd#getStart()
	 * @see #getCodeEnd()
	 * @generated
	 */
	EReference getCodeEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TableStart <em>Table Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableStart
	 * @generated
	 */
	EClass getTableStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableStart#getContent()
	 * @see #getTableStart()
	 * @generated
	 */
	EReference getTableStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.doccompiler.TableStart#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rows</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableStart#getRows()
	 * @see #getTableStart()
	 * @generated
	 */
	EReference getTableStart_Rows();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableStart#getEnd()
	 * @see #getTableStart()
	 * @generated
	 */
	EReference getTableStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TableEnd <em>Table End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableEnd
	 * @generated
	 */
	EClass getTableEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableEnd#getStart()
	 * @see #getTableEnd()
	 * @generated
	 */
	EReference getTableEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart <em>Table Row Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowStart
	 * @generated
	 */
	EClass getTableRowStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowStart#getContent()
	 * @see #getTableRowStart()
	 * @generated
	 */
	EReference getTableRowStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowStart#getColumns()
	 * @see #getTableRowStart()
	 * @generated
	 */
	EReference getTableRowStart_Columns();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowStart#getEnd()
	 * @see #getTableRowStart()
	 * @generated
	 */
	EReference getTableRowStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TableRowEnd <em>Table Row End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowEnd
	 * @generated
	 */
	EClass getTableRowEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableRowEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableRowEnd#getStart()
	 * @see #getTableRowEnd()
	 * @generated
	 */
	EReference getTableRowEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TableDataStart <em>Table Data Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Data Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableDataStart
	 * @generated
	 */
	EClass getTableDataStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableDataStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableDataStart#getContent()
	 * @see #getTableDataStart()
	 * @generated
	 */
	EReference getTableDataStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableDataStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableDataStart#getEnd()
	 * @see #getTableDataStart()
	 * @generated
	 */
	EReference getTableDataStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TableDataEnd <em>Table Data End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Data End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableDataEnd
	 * @generated
	 */
	EClass getTableDataEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TableDataEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TableDataEnd#getStart()
	 * @see #getTableDataEnd()
	 * @generated
	 */
	EReference getTableDataEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ListStart <em>List Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListStart
	 * @generated
	 */
	EClass getListStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ListStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListStart#getContent()
	 * @see #getListStart()
	 * @generated
	 */
	EReference getListStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.doccompiler.ListStart#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListStart#getElements()
	 * @see #getListStart()
	 * @generated
	 */
	EReference getListStart_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ListStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListStart#getEnd()
	 * @see #getListStart()
	 * @generated
	 */
	EReference getListStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ListEnd <em>List End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListEnd
	 * @generated
	 */
	EClass getListEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ListEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListEnd#getStart()
	 * @see #getListEnd()
	 * @generated
	 */
	EReference getListEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.OrderedListStart <em>Ordered List Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OrderedListStart
	 * @generated
	 */
	EClass getOrderedListStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.OrderedListStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OrderedListStart#getContent()
	 * @see #getOrderedListStart()
	 * @generated
	 */
	EReference getOrderedListStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.doccompiler.OrderedListStart#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OrderedListStart#getElements()
	 * @see #getOrderedListStart()
	 * @generated
	 */
	EReference getOrderedListStart_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.OrderedListStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OrderedListStart#getEnd()
	 * @see #getOrderedListStart()
	 * @generated
	 */
	EReference getOrderedListStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.OrderedListEnd <em>Ordered List End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OrderedListEnd
	 * @generated
	 */
	EClass getOrderedListEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.OrderedListEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OrderedListEnd#getStart()
	 * @see #getOrderedListEnd()
	 * @generated
	 */
	EReference getOrderedListEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ListElementStart <em>List Element Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListElementStart
	 * @generated
	 */
	EClass getListElementStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ListElementStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListElementStart#getContent()
	 * @see #getListElementStart()
	 * @generated
	 */
	EReference getListElementStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ListElementStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListElementStart#getEnd()
	 * @see #getListElementStart()
	 * @generated
	 */
	EReference getListElementStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ListElementEnd <em>List Element End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListElementEnd
	 * @generated
	 */
	EClass getListElementEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ListElementEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ListElementEnd#getStart()
	 * @see #getListElementEnd()
	 * @generated
	 */
	EReference getListElementEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ChapterStart <em>Chapter Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ChapterStart
	 * @generated
	 */
	EClass getChapterStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ChapterStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ChapterStart#getContent()
	 * @see #getChapterStart()
	 * @generated
	 */
	EReference getChapterStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ChapterStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ChapterStart#getEnd()
	 * @see #getChapterStart()
	 * @generated
	 */
	EReference getChapterStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ChapterEnd <em>Chapter End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ChapterEnd
	 * @generated
	 */
	EClass getChapterEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ChapterEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ChapterEnd#getStart()
	 * @see #getChapterEnd()
	 * @generated
	 */
	EReference getChapterEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SectionStart <em>Section Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SectionStart
	 * @generated
	 */
	EClass getSectionStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SectionStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SectionStart#getContent()
	 * @see #getSectionStart()
	 * @generated
	 */
	EReference getSectionStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SectionStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SectionStart#getEnd()
	 * @see #getSectionStart()
	 * @generated
	 */
	EReference getSectionStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SectionEnd <em>Section End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SectionEnd
	 * @generated
	 */
	EClass getSectionEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SectionEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SectionEnd#getStart()
	 * @see #getSectionEnd()
	 * @generated
	 */
	EReference getSectionEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SubsectionStart <em>Subsection Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsection Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SubsectionStart
	 * @generated
	 */
	EClass getSubsectionStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SubsectionStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SubsectionStart#getContent()
	 * @see #getSubsectionStart()
	 * @generated
	 */
	EReference getSubsectionStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SubsectionStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SubsectionStart#getEnd()
	 * @see #getSubsectionStart()
	 * @generated
	 */
	EReference getSubsectionStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.SubsectionEnd <em>Subsection End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsection End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SubsectionEnd
	 * @generated
	 */
	EClass getSubsectionEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.SubsectionEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.SubsectionEnd#getStart()
	 * @see #getSubsectionEnd()
	 * @generated
	 */
	EReference getSubsectionEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.OpenViewStart <em>Open View Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open View Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OpenViewStart
	 * @generated
	 */
	EClass getOpenViewStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.OpenViewStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OpenViewStart#getContent()
	 * @see #getOpenViewStart()
	 * @generated
	 */
	EReference getOpenViewStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.OpenViewStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OpenViewStart#getEnd()
	 * @see #getOpenViewStart()
	 * @generated
	 */
	EReference getOpenViewStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.OpenViewEnd <em>Open View End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open View End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OpenViewEnd
	 * @generated
	 */
	EClass getOpenViewEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.OpenViewEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.OpenViewEnd#getStart()
	 * @see #getOpenViewEnd()
	 * @generated
	 */
	EReference getOpenViewEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.StartProcessStart <em>Start Process Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Process Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.StartProcessStart
	 * @generated
	 */
	EClass getStartProcessStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.StartProcessStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.StartProcessStart#getContent()
	 * @see #getStartProcessStart()
	 * @generated
	 */
	EReference getStartProcessStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.StartProcessStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.StartProcessStart#getEnd()
	 * @see #getStartProcessStart()
	 * @generated
	 */
	EReference getStartProcessStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.StartProcessEnd <em>Start Process End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Process End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.StartProcessEnd
	 * @generated
	 */
	EClass getStartProcessEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.StartProcessEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.StartProcessEnd#getStart()
	 * @see #getStartProcessEnd()
	 * @generated
	 */
	EReference getStartProcessEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.EntityRefStart <em>Entity Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EntityRefStart
	 * @generated
	 */
	EClass getEntityRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.EntityRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EntityRefStart#getContent()
	 * @see #getEntityRefStart()
	 * @generated
	 */
	EReference getEntityRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.EntityRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EntityRefStart#getEnd()
	 * @see #getEntityRefStart()
	 * @generated
	 */
	EReference getEntityRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.EntityRefEnd <em>Entity Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Ref End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EntityRefEnd
	 * @generated
	 */
	EClass getEntityRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.EntityRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EntityRefEnd#getStart()
	 * @see #getEntityRefEnd()
	 * @generated
	 */
	EReference getEntityRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.DTORefStart <em>DTO Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DTORefStart
	 * @generated
	 */
	EClass getDTORefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DTORefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DTORefStart#getContent()
	 * @see #getDTORefStart()
	 * @generated
	 */
	EReference getDTORefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DTORefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DTORefStart#getEnd()
	 * @see #getDTORefStart()
	 * @generated
	 */
	EReference getDTORefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.DTORefEnd <em>DTO Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Ref End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DTORefEnd
	 * @generated
	 */
	EClass getDTORefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DTORefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DTORefEnd#getStart()
	 * @see #getDTORefEnd()
	 * @generated
	 */
	EReference getDTORefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ProcessRefStart <em>Process Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessRefStart
	 * @generated
	 */
	EClass getProcessRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getContent()
	 * @see #getProcessRefStart()
	 * @generated
	 */
	EReference getProcessRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getEnd()
	 * @see #getProcessRefStart()
	 * @generated
	 */
	EReference getProcessRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ProcessRefEnd <em>Process Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Ref End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessRefEnd
	 * @generated
	 */
	EClass getProcessRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ProcessRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessRefEnd#getStart()
	 * @see #getProcessRefEnd()
	 * @generated
	 */
	EReference getProcessRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TaskRefStart <em>Task Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TaskRefStart
	 * @generated
	 */
	EClass getTaskRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TaskRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TaskRefStart#getContent()
	 * @see #getTaskRefStart()
	 * @generated
	 */
	EReference getTaskRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TaskRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TaskRefStart#getEnd()
	 * @see #getTaskRefStart()
	 * @generated
	 */
	EReference getTaskRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.TaskRefEnd <em>Task Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ref End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TaskRefEnd
	 * @generated
	 */
	EClass getTaskRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.TaskRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.TaskRefEnd#getStart()
	 * @see #getTaskRefEnd()
	 * @generated
	 */
	EReference getTaskRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ViewRefStart <em>View Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ViewRefStart
	 * @generated
	 */
	EClass getViewRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ViewRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ViewRefStart#getContent()
	 * @see #getViewRefStart()
	 * @generated
	 */
	EReference getViewRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ViewRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ViewRefStart#getEnd()
	 * @see #getViewRefStart()
	 * @generated
	 */
	EReference getViewRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ViewRefEnd <em>View Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Ref End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ViewRefEnd
	 * @generated
	 */
	EClass getViewRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ViewRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ViewRefEnd#getStart()
	 * @see #getViewRefEnd()
	 * @generated
	 */
	EReference getViewRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.UIRefStart <em>UI Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UIRefStart
	 * @generated
	 */
	EClass getUIRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.UIRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UIRefStart#getContent()
	 * @see #getUIRefStart()
	 * @generated
	 */
	EReference getUIRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.UIRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UIRefStart#getEnd()
	 * @see #getUIRefStart()
	 * @generated
	 */
	EReference getUIRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.UIRefEnd <em>UI Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ref End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UIRefEnd
	 * @generated
	 */
	EClass getUIRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.UIRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.UIRefEnd#getStart()
	 * @see #getUIRefEnd()
	 * @generated
	 */
	EReference getUIRefEnd_Start();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocCompilerFactory getDocCompilerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl <em>Document Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentStart()
		 * @generated
		 */
		EClass DOCUMENT_START = eINSTANCE.getDocumentStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_START__CONTENT = eINSTANCE.getDocumentStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_START__END = eINSTANCE.getDocumentStart_End();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_START__DOCUMENT = eINSTANCE.getDocumentStart_Document();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl <em>Document End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentEnd()
		 * @generated
		 */
		EClass DOCUMENT_END = eINSTANCE.getDocumentEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_END__START = eINSTANCE.getDocumentEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl <em>Processed Rich String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessedRichString()
		 * @generated
		 */
		EClass PROCESSED_RICH_STRING = eINSTANCE.getProcessedRichString();

		/**
		 * The meta object literal for the '<em><b>Rich String</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSED_RICH_STRING__RICH_STRING = eINSTANCE.getProcessedRichString_RichString();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSED_RICH_STRING__LINES = eINSTANCE.getProcessedRichString_Lines();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.LineImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__PARTS = eINSTANCE.getLine_Parts();

		/**
		 * The meta object literal for the '<em><b>Rich String</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__RICH_STRING = eINSTANCE.getLine_RichString();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LinePartImpl <em>Line Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.LinePartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLinePart()
		 * @generated
		 */
		EClass LINE_PART = eINSTANCE.getLinePart();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_PART__LINE = eINSTANCE.getLinePart_Line();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.LiteralImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__LITERAL = eINSTANCE.getLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__OFFSET = eINSTANCE.getLiteral_Offset();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LENGTH = eINSTANCE.getLiteral_Length();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl <em>Line Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLineBreak()
		 * @generated
		 */
		EClass LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl <em>For Loop Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopStart()
		 * @generated
		 */
		EClass FOR_LOOP_START = eINSTANCE.getForLoopStart();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP_START__LOOP = eINSTANCE.getForLoopStart_Loop();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP_START__END = eINSTANCE.getForLoopStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl <em>For Loop End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopEnd()
		 * @generated
		 */
		EClass FOR_LOOP_END = eINSTANCE.getForLoopEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP_END__START = eINSTANCE.getForLoopEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl <em>Printed Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getPrintedExpression()
		 * @generated
		 */
		EClass PRINTED_EXPRESSION = eINSTANCE.getPrintedExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRINTED_EXPRESSION__EXPRESSION = eINSTANCE.getPrintedExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl <em>If Condition Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getIfConditionStart()
		 * @generated
		 */
		EClass IF_CONDITION_START = eINSTANCE.getIfConditionStart();

		/**
		 * The meta object literal for the '<em><b>Rich String If</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION_START__RICH_STRING_IF = eINSTANCE.getIfConditionStart_RichStringIf();

		/**
		 * The meta object literal for the '<em><b>Else Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION_START__ELSE_START = eINSTANCE.getIfConditionStart_ElseStart();

		/**
		 * The meta object literal for the '<em><b>Else If Conditions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION_START__ELSE_IF_CONDITIONS = eINSTANCE.getIfConditionStart_ElseIfConditions();

		/**
		 * The meta object literal for the '<em><b>End If</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION_START__END_IF = eINSTANCE.getIfConditionStart_EndIf();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseIfCondition()
		 * @generated
		 */
		EClass ELSE_IF_CONDITION = eINSTANCE.getElseIfCondition();

		/**
		 * The meta object literal for the '<em><b>Rich String Else If</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_CONDITION__RICH_STRING_ELSE_IF = eINSTANCE.getElseIfCondition_RichStringElseIf();

		/**
		 * The meta object literal for the '<em><b>If Condition Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_CONDITION__IF_CONDITION_START = eINSTANCE.getElseIfCondition_IfConditionStart();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl <em>Else Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseStart()
		 * @generated
		 */
		EClass ELSE_START = eINSTANCE.getElseStart();

		/**
		 * The meta object literal for the '<em><b>If Condition Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_START__IF_CONDITION_START = eINSTANCE.getElseStart_IfConditionStart();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl <em>End If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEndIf()
		 * @generated
		 */
		EClass END_IF = eINSTANCE.getEndIf();

		/**
		 * The meta object literal for the '<em><b>If Condition Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_IF__IF_CONDITION_START = eINSTANCE.getEndIf_IfConditionStart();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl <em>Markup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMarkup()
		 * @generated
		 */
		EClass MARKUP = eINSTANCE.getMarkup();

		/**
		 * The meta object literal for the '<em><b>Markup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKUP__MARKUP = eINSTANCE.getMarkup_Markup();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl <em>H1 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1Start()
		 * @generated
		 */
		EClass H1_START = eINSTANCE.getH1Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H1_START__CONTENT = eINSTANCE.getH1Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H1_START__END = eINSTANCE.getH1Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl <em>H1 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1End()
		 * @generated
		 */
		EClass H1_END = eINSTANCE.getH1End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H1_END__START = eINSTANCE.getH1End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl <em>H2 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2Start()
		 * @generated
		 */
		EClass H2_START = eINSTANCE.getH2Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H2_START__CONTENT = eINSTANCE.getH2Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H2_START__END = eINSTANCE.getH2Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl <em>H2 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2End()
		 * @generated
		 */
		EClass H2_END = eINSTANCE.getH2End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H2_END__START = eINSTANCE.getH2End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H3StartImpl <em>H3 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H3StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH3Start()
		 * @generated
		 */
		EClass H3_START = eINSTANCE.getH3Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H3_START__CONTENT = eINSTANCE.getH3Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H3_START__END = eINSTANCE.getH3Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H3EndImpl <em>H3 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H3EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH3End()
		 * @generated
		 */
		EClass H3_END = eINSTANCE.getH3End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H3_END__START = eINSTANCE.getH3End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H4StartImpl <em>H4 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H4StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH4Start()
		 * @generated
		 */
		EClass H4_START = eINSTANCE.getH4Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H4_START__CONTENT = eINSTANCE.getH4Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H4_START__END = eINSTANCE.getH4Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H4EndImpl <em>H4 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H4EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH4End()
		 * @generated
		 */
		EClass H4_END = eINSTANCE.getH4End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H4_END__START = eINSTANCE.getH4End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H5StartImpl <em>H5 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H5StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH5Start()
		 * @generated
		 */
		EClass H5_START = eINSTANCE.getH5Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H5_START__CONTENT = eINSTANCE.getH5Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H5_START__END = eINSTANCE.getH5Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H5EndImpl <em>H5 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H5EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH5End()
		 * @generated
		 */
		EClass H5_END = eINSTANCE.getH5End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H5_END__START = eINSTANCE.getH5End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H6StartImpl <em>H6 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H6StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH6Start()
		 * @generated
		 */
		EClass H6_START = eINSTANCE.getH6Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H6_START__CONTENT = eINSTANCE.getH6Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H6_START__END = eINSTANCE.getH6Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H6EndImpl <em>H6 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H6EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH6End()
		 * @generated
		 */
		EClass H6_END = eINSTANCE.getH6End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference H6_END__START = eINSTANCE.getH6End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl <em>Example Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleStart()
		 * @generated
		 */
		EClass EXAMPLE_START = eINSTANCE.getExampleStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_START__CONTENT = eINSTANCE.getExampleStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_START__END = eINSTANCE.getExampleStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl <em>Example End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleEnd()
		 * @generated
		 */
		EClass EXAMPLE_END = eINSTANCE.getExampleEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_END__START = eINSTANCE.getExampleEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl <em>URL Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLStart()
		 * @generated
		 */
		EClass URL_START = eINSTANCE.getURLStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL_START__CONTENT = eINSTANCE.getURLStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL_START__END = eINSTANCE.getURLStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl <em>URL End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLEnd()
		 * @generated
		 */
		EClass URL_END = eINSTANCE.getURLEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference URL_END__START = eINSTANCE.getURLEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.RefStartImpl <em>Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.RefStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getRefStart()
		 * @generated
		 */
		EClass REF_START = eINSTANCE.getRefStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_START__CONTENT = eINSTANCE.getRefStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_START__END = eINSTANCE.getRefStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.RefEndImpl <em>Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.RefEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getRefEnd()
		 * @generated
		 */
		EClass REF_END = eINSTANCE.getRefEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_END__START = eINSTANCE.getRefEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl <em>Bold Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getBoldStart()
		 * @generated
		 */
		EClass BOLD_START = eINSTANCE.getBoldStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOLD_START__CONTENT = eINSTANCE.getBoldStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOLD_START__END = eINSTANCE.getBoldStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.BoldEndImpl <em>Bold End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.BoldEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getBoldEnd()
		 * @generated
		 */
		EClass BOLD_END = eINSTANCE.getBoldEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOLD_END__START = eINSTANCE.getBoldEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UnderlineStartImpl <em>Underline Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.UnderlineStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUnderlineStart()
		 * @generated
		 */
		EClass UNDERLINE_START = eINSTANCE.getUnderlineStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDERLINE_START__CONTENT = eINSTANCE.getUnderlineStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDERLINE_START__END = eINSTANCE.getUnderlineStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UnderlineEndImpl <em>Underline End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.UnderlineEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUnderlineEnd()
		 * @generated
		 */
		EClass UNDERLINE_END = eINSTANCE.getUnderlineEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDERLINE_END__START = eINSTANCE.getUnderlineEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ItalicStartImpl <em>Italic Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ItalicStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getItalicStart()
		 * @generated
		 */
		EClass ITALIC_START = eINSTANCE.getItalicStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITALIC_START__CONTENT = eINSTANCE.getItalicStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITALIC_START__END = eINSTANCE.getItalicStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ItalicEndImpl <em>Italic End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ItalicEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getItalicEnd()
		 * @generated
		 */
		EClass ITALIC_END = eINSTANCE.getItalicEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITALIC_END__START = eINSTANCE.getItalicEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SpanStartImpl <em>Span Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SpanStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSpanStart()
		 * @generated
		 */
		EClass SPAN_START = eINSTANCE.getSpanStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN_START__CONTENT = eINSTANCE.getSpanStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN_START__END = eINSTANCE.getSpanStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SpanEndImpl <em>Span End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SpanEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSpanEnd()
		 * @generated
		 */
		EClass SPAN_END = eINSTANCE.getSpanEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN_END__START = eINSTANCE.getSpanEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ImgStartImpl <em>Img Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ImgStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getImgStart()
		 * @generated
		 */
		EClass IMG_START = eINSTANCE.getImgStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMG_START__CONTENT = eINSTANCE.getImgStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMG_START__END = eINSTANCE.getImgStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ImgEndImpl <em>Img End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ImgEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getImgEnd()
		 * @generated
		 */
		EClass IMG_END = eINSTANCE.getImgEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMG_END__START = eINSTANCE.getImgEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MailtoStartImpl <em>Mailto Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.MailtoStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMailtoStart()
		 * @generated
		 */
		EClass MAILTO_START = eINSTANCE.getMailtoStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAILTO_START__CONTENT = eINSTANCE.getMailtoStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAILTO_START__END = eINSTANCE.getMailtoStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MailtoEndImpl <em>Mailto End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.MailtoEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMailtoEnd()
		 * @generated
		 */
		EClass MAILTO_END = eINSTANCE.getMailtoEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAILTO_END__START = eINSTANCE.getMailtoEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SkypeStartImpl <em>Skype Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SkypeStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSkypeStart()
		 * @generated
		 */
		EClass SKYPE_START = eINSTANCE.getSkypeStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKYPE_START__CONTENT = eINSTANCE.getSkypeStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKYPE_START__END = eINSTANCE.getSkypeStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SkypeEndImpl <em>Skype End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SkypeEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSkypeEnd()
		 * @generated
		 */
		EClass SKYPE_END = eINSTANCE.getSkypeEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKYPE_END__START = eINSTANCE.getSkypeEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MovieStartImpl <em>Movie Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.MovieStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMovieStart()
		 * @generated
		 */
		EClass MOVIE_START = eINSTANCE.getMovieStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE_START__CONTENT = eINSTANCE.getMovieStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE_START__END = eINSTANCE.getMovieStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MovieEndImpl <em>Movie End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.MovieEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMovieEnd()
		 * @generated
		 */
		EClass MOVIE_END = eINSTANCE.getMovieEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVIE_END__START = eINSTANCE.getMovieEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.CodeStartImpl <em>Code Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.CodeStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getCodeStart()
		 * @generated
		 */
		EClass CODE_START = eINSTANCE.getCodeStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_START__CONTENT = eINSTANCE.getCodeStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_START__END = eINSTANCE.getCodeStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.CodeEndImpl <em>Code End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.CodeEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getCodeEnd()
		 * @generated
		 */
		EClass CODE_END = eINSTANCE.getCodeEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_END__START = eINSTANCE.getCodeEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableStartImpl <em>Table Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TableStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableStart()
		 * @generated
		 */
		EClass TABLE_START = eINSTANCE.getTableStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_START__CONTENT = eINSTANCE.getTableStart_Content();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_START__ROWS = eINSTANCE.getTableStart_Rows();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_START__END = eINSTANCE.getTableStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableEndImpl <em>Table End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TableEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableEnd()
		 * @generated
		 */
		EClass TABLE_END = eINSTANCE.getTableEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_END__START = eINSTANCE.getTableEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableRowStartImpl <em>Table Row Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TableRowStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableRowStart()
		 * @generated
		 */
		EClass TABLE_ROW_START = eINSTANCE.getTableRowStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW_START__CONTENT = eINSTANCE.getTableRowStart_Content();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW_START__COLUMNS = eINSTANCE.getTableRowStart_Columns();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW_START__END = eINSTANCE.getTableRowStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableRowEndImpl <em>Table Row End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TableRowEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableRowEnd()
		 * @generated
		 */
		EClass TABLE_ROW_END = eINSTANCE.getTableRowEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW_END__START = eINSTANCE.getTableRowEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableDataStartImpl <em>Table Data Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TableDataStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableDataStart()
		 * @generated
		 */
		EClass TABLE_DATA_START = eINSTANCE.getTableDataStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DATA_START__CONTENT = eINSTANCE.getTableDataStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DATA_START__END = eINSTANCE.getTableDataStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TableDataEndImpl <em>Table Data End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TableDataEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTableDataEnd()
		 * @generated
		 */
		EClass TABLE_DATA_END = eINSTANCE.getTableDataEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_DATA_END__START = eINSTANCE.getTableDataEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListStartImpl <em>List Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ListStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListStart()
		 * @generated
		 */
		EClass LIST_START = eINSTANCE.getListStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_START__CONTENT = eINSTANCE.getListStart_Content();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_START__ELEMENTS = eINSTANCE.getListStart_Elements();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_START__END = eINSTANCE.getListStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListEndImpl <em>List End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ListEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListEnd()
		 * @generated
		 */
		EClass LIST_END = eINSTANCE.getListEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_END__START = eINSTANCE.getListEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OrderedListStartImpl <em>Ordered List Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.OrderedListStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOrderedListStart()
		 * @generated
		 */
		EClass ORDERED_LIST_START = eINSTANCE.getOrderedListStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_LIST_START__CONTENT = eINSTANCE.getOrderedListStart_Content();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_LIST_START__ELEMENTS = eINSTANCE.getOrderedListStart_Elements();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_LIST_START__END = eINSTANCE.getOrderedListStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OrderedListEndImpl <em>Ordered List End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.OrderedListEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOrderedListEnd()
		 * @generated
		 */
		EClass ORDERED_LIST_END = eINSTANCE.getOrderedListEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDERED_LIST_END__START = eINSTANCE.getOrderedListEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListElementStartImpl <em>List Element Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ListElementStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListElementStart()
		 * @generated
		 */
		EClass LIST_ELEMENT_START = eINSTANCE.getListElementStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT_START__CONTENT = eINSTANCE.getListElementStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT_START__END = eINSTANCE.getListElementStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ListElementEndImpl <em>List Element End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ListElementEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getListElementEnd()
		 * @generated
		 */
		EClass LIST_ELEMENT_END = eINSTANCE.getListElementEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT_END__START = eINSTANCE.getListElementEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ChapterStartImpl <em>Chapter Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ChapterStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getChapterStart()
		 * @generated
		 */
		EClass CHAPTER_START = eINSTANCE.getChapterStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_START__CONTENT = eINSTANCE.getChapterStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_START__END = eINSTANCE.getChapterStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ChapterEndImpl <em>Chapter End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ChapterEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getChapterEnd()
		 * @generated
		 */
		EClass CHAPTER_END = eINSTANCE.getChapterEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_END__START = eINSTANCE.getChapterEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SectionStartImpl <em>Section Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SectionStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSectionStart()
		 * @generated
		 */
		EClass SECTION_START = eINSTANCE.getSectionStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_START__CONTENT = eINSTANCE.getSectionStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_START__END = eINSTANCE.getSectionStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SectionEndImpl <em>Section End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SectionEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSectionEnd()
		 * @generated
		 */
		EClass SECTION_END = eINSTANCE.getSectionEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_END__START = eINSTANCE.getSectionEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SubsectionStartImpl <em>Subsection Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SubsectionStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSubsectionStart()
		 * @generated
		 */
		EClass SUBSECTION_START = eINSTANCE.getSubsectionStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSECTION_START__CONTENT = eINSTANCE.getSubsectionStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSECTION_START__END = eINSTANCE.getSubsectionStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.SubsectionEndImpl <em>Subsection End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.SubsectionEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getSubsectionEnd()
		 * @generated
		 */
		EClass SUBSECTION_END = eINSTANCE.getSubsectionEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSECTION_END__START = eINSTANCE.getSubsectionEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OpenViewStartImpl <em>Open View Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.OpenViewStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOpenViewStart()
		 * @generated
		 */
		EClass OPEN_VIEW_START = eINSTANCE.getOpenViewStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_VIEW_START__CONTENT = eINSTANCE.getOpenViewStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_VIEW_START__END = eINSTANCE.getOpenViewStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.OpenViewEndImpl <em>Open View End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.OpenViewEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getOpenViewEnd()
		 * @generated
		 */
		EClass OPEN_VIEW_END = eINSTANCE.getOpenViewEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPEN_VIEW_END__START = eINSTANCE.getOpenViewEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.StartProcessStartImpl <em>Start Process Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.StartProcessStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getStartProcessStart()
		 * @generated
		 */
		EClass START_PROCESS_START = eINSTANCE.getStartProcessStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_PROCESS_START__CONTENT = eINSTANCE.getStartProcessStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_PROCESS_START__END = eINSTANCE.getStartProcessStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.StartProcessEndImpl <em>Start Process End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.StartProcessEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getStartProcessEnd()
		 * @generated
		 */
		EClass START_PROCESS_END = eINSTANCE.getStartProcessEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_PROCESS_END__START = eINSTANCE.getStartProcessEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EntityRefStartImpl <em>Entity Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.EntityRefStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEntityRefStart()
		 * @generated
		 */
		EClass ENTITY_REF_START = eINSTANCE.getEntityRefStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_REF_START__CONTENT = eINSTANCE.getEntityRefStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_REF_START__END = eINSTANCE.getEntityRefStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EntityRefEndImpl <em>Entity Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.EntityRefEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEntityRefEnd()
		 * @generated
		 */
		EClass ENTITY_REF_END = eINSTANCE.getEntityRefEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_REF_END__START = eINSTANCE.getEntityRefEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DTORefStartImpl <em>DTO Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DTORefStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDTORefStart()
		 * @generated
		 */
		EClass DTO_REF_START = eINSTANCE.getDTORefStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_REF_START__CONTENT = eINSTANCE.getDTORefStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_REF_START__END = eINSTANCE.getDTORefStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DTORefEndImpl <em>DTO Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DTORefEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDTORefEnd()
		 * @generated
		 */
		EClass DTO_REF_END = eINSTANCE.getDTORefEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_REF_END__START = eINSTANCE.getDTORefEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessRefStartImpl <em>Process Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessRefStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessRefStart()
		 * @generated
		 */
		EClass PROCESS_REF_START = eINSTANCE.getProcessRefStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_REF_START__CONTENT = eINSTANCE.getProcessRefStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_REF_START__END = eINSTANCE.getProcessRefStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessRefEndImpl <em>Process Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessRefEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessRefEnd()
		 * @generated
		 */
		EClass PROCESS_REF_END = eINSTANCE.getProcessRefEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_REF_END__START = eINSTANCE.getProcessRefEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TaskRefStartImpl <em>Task Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TaskRefStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTaskRefStart()
		 * @generated
		 */
		EClass TASK_REF_START = eINSTANCE.getTaskRefStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REF_START__CONTENT = eINSTANCE.getTaskRefStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REF_START__END = eINSTANCE.getTaskRefStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.TaskRefEndImpl <em>Task Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.TaskRefEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getTaskRefEnd()
		 * @generated
		 */
		EClass TASK_REF_END = eINSTANCE.getTaskRefEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REF_END__START = eINSTANCE.getTaskRefEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ViewRefStartImpl <em>View Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ViewRefStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getViewRefStart()
		 * @generated
		 */
		EClass VIEW_REF_START = eINSTANCE.getViewRefStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_REF_START__CONTENT = eINSTANCE.getViewRefStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_REF_START__END = eINSTANCE.getViewRefStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ViewRefEndImpl <em>View Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ViewRefEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getViewRefEnd()
		 * @generated
		 */
		EClass VIEW_REF_END = eINSTANCE.getViewRefEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_REF_END__START = eINSTANCE.getViewRefEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UIRefStartImpl <em>UI Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.UIRefStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUIRefStart()
		 * @generated
		 */
		EClass UI_REF_START = eINSTANCE.getUIRefStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_REF_START__CONTENT = eINSTANCE.getUIRefStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_REF_START__END = eINSTANCE.getUIRefStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UIRefEndImpl <em>UI Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.UIRefEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUIRefEnd()
		 * @generated
		 */
		EClass UI_REF_END = eINSTANCE.getUIRefEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_REF_END__START = eINSTANCE.getUIRefEnd_Start();

	}

} //DocCompilerPackage
