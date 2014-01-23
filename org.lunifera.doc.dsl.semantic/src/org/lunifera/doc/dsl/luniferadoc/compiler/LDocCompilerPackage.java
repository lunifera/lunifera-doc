/**
 */
package org.lunifera.doc.dsl.luniferadoc.compiler;

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
 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LDocCompilerFactory
 * @model kind="package"
 * @generated
 */
public interface LDocCompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/luniferadoc/compiler/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "compiler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDocCompilerPackage eINSTANCE = org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LinePartImpl <em>Line Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LinePartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLinePart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentStartImpl <em>Document Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDocumentStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentEndImpl <em>Document End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDocumentEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessedRichStringImpl <em>Processed Rich String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessedRichStringImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getProcessedRichString()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLine()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LiteralImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLiteral()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineBreakImpl <em>Line Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineBreakImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLineBreak()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopStartImpl <em>For Loop Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getForLoopStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopEndImpl <em>For Loop End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getForLoopEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.PrintedExpressionImpl <em>Printed Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.PrintedExpressionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getPrintedExpression()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.IfConditionStartImpl <em>If Condition Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.IfConditionStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getIfConditionStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseIfConditionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getElseIfCondition()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseStartImpl <em>Else Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getElseStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.EndIfImpl <em>End If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.EndIfImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getEndIf()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MarkupImpl <em>Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MarkupImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMarkup()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1StartImpl <em>H1 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1StartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH1Start()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1EndImpl <em>H1 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1EndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH1End()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2StartImpl <em>H2 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2StartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH2Start()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2EndImpl <em>H2 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2EndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH2End()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3StartImpl <em>H3 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3StartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH3Start()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3EndImpl <em>H3 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3EndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH3End()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4StartImpl <em>H4 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4StartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH4Start()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4EndImpl <em>H4 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4EndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH4End()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5StartImpl <em>H5 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5StartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH5Start()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5EndImpl <em>H5 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5EndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH5End()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6StartImpl <em>H6 Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6StartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH6Start()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6EndImpl <em>H6 End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6EndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH6End()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleStartImpl <em>Example Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getExampleStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleEndImpl <em>Example End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getExampleEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLStartImpl <em>URL Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getURLStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLEndImpl <em>URL End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getURLEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefStartImpl <em>Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getRefStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefEndImpl <em>Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getRefEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldStartImpl <em>Bold Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getBoldStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldEndImpl <em>Bold End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getBoldEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineStartImpl <em>Underline Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUnderlineStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineEndImpl <em>Underline End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUnderlineEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicStartImpl <em>Italic Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getItalicStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicEndImpl <em>Italic End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getItalicEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanStartImpl <em>Span Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSpanStart()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanEndImpl <em>Span End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSpanEnd()
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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ImgStartImpl <em>Img Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ImgStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getImgStart()
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
	 * The number of structural features of the '<em>Img Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Img Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoStartImpl <em>Mailto Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMailtoStart()
	 * @generated
	 */
	int MAILTO_START = 42;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoEndImpl <em>Mailto End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMailtoEnd()
	 * @generated
	 */
	int MAILTO_END = 43;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeStartImpl <em>Skype Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSkypeStart()
	 * @generated
	 */
	int SKYPE_START = 44;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeEndImpl <em>Skype End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSkypeEnd()
	 * @generated
	 */
	int SKYPE_END = 45;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieStartImpl <em>Movie Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMovieStart()
	 * @generated
	 */
	int MOVIE_START = 46;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieEndImpl <em>Movie End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMovieEnd()
	 * @generated
	 */
	int MOVIE_END = 47;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeStartImpl <em>Code Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getCodeStart()
	 * @generated
	 */
	int CODE_START = 48;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeEndImpl <em>Code End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getCodeEnd()
	 * @generated
	 */
	int CODE_END = 49;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableStartImpl <em>Table Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableStart()
	 * @generated
	 */
	int TABLE_START = 50;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableEndImpl <em>Table End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableEnd()
	 * @generated
	 */
	int TABLE_END = 51;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowStartImpl <em>Table Row Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableRowStart()
	 * @generated
	 */
	int TABLE_ROW_START = 52;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowEndImpl <em>Table Row End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableRowEnd()
	 * @generated
	 */
	int TABLE_ROW_END = 53;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellStartImpl <em>Table Cell Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableCellStart()
	 * @generated
	 */
	int TABLE_CELL_START = 54;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Cell Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table Cell Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellEndImpl <em>Table Cell End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableCellEnd()
	 * @generated
	 */
	int TABLE_CELL_END = 55;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Cell End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Cell End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListStartImpl <em>List Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListStart()
	 * @generated
	 */
	int LIST_START = 56;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListEndImpl <em>List End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListEnd()
	 * @generated
	 */
	int LIST_END = 57;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListStartImpl <em>Ordered List Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOrderedListStart()
	 * @generated
	 */
	int ORDERED_LIST_START = 58;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListEndImpl <em>Ordered List End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOrderedListEnd()
	 * @generated
	 */
	int ORDERED_LIST_END = 59;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementStartImpl <em>List Element Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListElementStart()
	 * @generated
	 */
	int LIST_ELEMENT_START = 60;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementEndImpl <em>List Element End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListElementEnd()
	 * @generated
	 */
	int LIST_ELEMENT_END = 61;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterStartImpl <em>Chapter Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getChapterStart()
	 * @generated
	 */
	int CHAPTER_START = 62;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterEndImpl <em>Chapter End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getChapterEnd()
	 * @generated
	 */
	int CHAPTER_END = 63;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionStartImpl <em>Section Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSectionStart()
	 * @generated
	 */
	int SECTION_START = 64;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionEndImpl <em>Section End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSectionEnd()
	 * @generated
	 */
	int SECTION_END = 65;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionStartImpl <em>Subsection Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSubsectionStart()
	 * @generated
	 */
	int SUBSECTION_START = 66;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionEndImpl <em>Subsection End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSubsectionEnd()
	 * @generated
	 */
	int SUBSECTION_END = 67;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewStartImpl <em>Open View Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOpenViewStart()
	 * @generated
	 */
	int OPEN_VIEW_START = 68;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewEndImpl <em>Open View End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOpenViewEnd()
	 * @generated
	 */
	int OPEN_VIEW_END = 69;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessStartImpl <em>Start Process Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getStartProcessStart()
	 * @generated
	 */
	int START_PROCESS_START = 70;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessEndImpl <em>Start Process End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getStartProcessEnd()
	 * @generated
	 */
	int START_PROCESS_END = 71;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefStartImpl <em>Entity Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getEntityRefStart()
	 * @generated
	 */
	int ENTITY_REF_START = 72;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefEndImpl <em>Entity Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getEntityRefEnd()
	 * @generated
	 */
	int ENTITY_REF_END = 73;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefStartImpl <em>DTO Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDTORefStart()
	 * @generated
	 */
	int DTO_REF_START = 74;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefEndImpl <em>DTO Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDTORefEnd()
	 * @generated
	 */
	int DTO_REF_END = 75;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefStartImpl <em>Process Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getProcessRefStart()
	 * @generated
	 */
	int PROCESS_REF_START = 76;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefEndImpl <em>Process Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getProcessRefEnd()
	 * @generated
	 */
	int PROCESS_REF_END = 77;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefStartImpl <em>Task Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTaskRefStart()
	 * @generated
	 */
	int TASK_REF_START = 78;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefEndImpl <em>Task Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTaskRefEnd()
	 * @generated
	 */
	int TASK_REF_END = 79;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefStartImpl <em>View Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getViewRefStart()
	 * @generated
	 */
	int VIEW_REF_START = 80;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefEndImpl <em>View Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getViewRefEnd()
	 * @generated
	 */
	int VIEW_REF_END = 81;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefStartImpl <em>UI Ref Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefStartImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUIRefStart()
	 * @generated
	 */
	int UI_REF_START = 82;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefEndImpl <em>UI Ref End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefEndImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUIRefEnd()
	 * @generated
	 */
	int UI_REF_END = 83;

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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart <em>Document Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart
	 * @generated
	 */
	EClass getDocumentStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getContent()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getEnd()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getDocument()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_Document();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentEnd <em>Document End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DocumentEnd
	 * @generated
	 */
	EClass getDocumentEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DocumentEnd#getStart()
	 * @see #getDocumentEnd()
	 * @generated
	 */
	EReference getDocumentEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessedRichString <em>Processed Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processed Rich String</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessedRichString
	 * @generated
	 */
	EClass getProcessedRichString();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessedRichString#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessedRichString#getRichString()
	 * @see #getProcessedRichString()
	 * @generated
	 */
	EReference getProcessedRichString_RichString();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessedRichString#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessedRichString#getLines()
	 * @see #getProcessedRichString()
	 * @generated
	 */
	EReference getProcessedRichString_Lines();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Line#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Line#getParts()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Parts();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rich String</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Line#getRichString()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_RichString();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.LinePart <em>Line Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Part</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LinePart
	 * @generated
	 */
	EClass getLinePart();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.LinePart#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Line</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LinePart#getLine()
	 * @see #getLinePart()
	 * @generated
	 */
	EReference getLinePart_Line();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Literal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Literal#getLiteral()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Literal#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Literal#getOffset()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Literal#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Literal#getLength()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Length();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.LineBreak <em>Line Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LineBreak
	 * @generated
	 */
	EClass getLineBreak();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopStart <em>For Loop Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopStart
	 * @generated
	 */
	EClass getForLoopStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopStart#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopStart#getLoop()
	 * @see #getForLoopStart()
	 * @generated
	 */
	EReference getForLoopStart_Loop();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopStart#getEnd()
	 * @see #getForLoopStart()
	 * @generated
	 */
	EReference getForLoopStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopEnd <em>For Loop End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopEnd
	 * @generated
	 */
	EClass getForLoopEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ForLoopEnd#getStart()
	 * @see #getForLoopEnd()
	 * @generated
	 */
	EReference getForLoopEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.PrintedExpression <em>Printed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printed Expression</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.PrintedExpression
	 * @generated
	 */
	EClass getPrintedExpression();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.PrintedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.PrintedExpression#getExpression()
	 * @see #getPrintedExpression()
	 * @generated
	 */
	EReference getPrintedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart
	 * @generated
	 */
	EClass getIfConditionStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getRichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getRichStringIf()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_RichStringIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getElseStart()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_ElseStart();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Else If Conditions</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getElseIfConditions()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_ElseIfConditions();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getEndIf <em>End If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.IfConditionStart#getEndIf()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_EndIf();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ElseIfCondition <em>Else If Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If Condition</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ElseIfCondition
	 * @generated
	 */
	EClass getElseIfCondition();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ElseIfCondition#getRichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rich String Else If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ElseIfCondition#getRichStringElseIf()
	 * @see #getElseIfCondition()
	 * @generated
	 */
	EReference getElseIfCondition_RichStringElseIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ElseIfCondition#getIfConditionStart()
	 * @see #getElseIfCondition()
	 * @generated
	 */
	EReference getElseIfCondition_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ElseStart
	 * @generated
	 */
	EClass getElseStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ElseStart#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ElseStart#getIfConditionStart()
	 * @see #getElseStart()
	 * @generated
	 */
	EReference getElseStart_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.EndIf <em>End If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.EndIf
	 * @generated
	 */
	EClass getEndIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.EndIf#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.EndIf#getIfConditionStart()
	 * @see #getEndIf()
	 * @generated
	 */
	EReference getEndIf_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Markup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markup</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Markup
	 * @generated
	 */
	EClass getMarkup();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.Markup#getMarkup <em>Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Markup</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.Markup#getMarkup()
	 * @see #getMarkup()
	 * @generated
	 */
	EReference getMarkup_Markup();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H1Start <em>H1 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H1Start
	 * @generated
	 */
	EClass getH1Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H1Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H1Start#getContent()
	 * @see #getH1Start()
	 * @generated
	 */
	EReference getH1Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H1Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H1Start#getEnd()
	 * @see #getH1Start()
	 * @generated
	 */
	EReference getH1Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H1End <em>H1 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H1End
	 * @generated
	 */
	EClass getH1End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H1End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H1End#getStart()
	 * @see #getH1End()
	 * @generated
	 */
	EReference getH1End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H2Start <em>H2 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2 Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H2Start
	 * @generated
	 */
	EClass getH2Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H2Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H2Start#getContent()
	 * @see #getH2Start()
	 * @generated
	 */
	EReference getH2Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H2Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H2Start#getEnd()
	 * @see #getH2Start()
	 * @generated
	 */
	EReference getH2Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H2End <em>H2 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2 End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H2End
	 * @generated
	 */
	EClass getH2End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H2End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H2End#getStart()
	 * @see #getH2End()
	 * @generated
	 */
	EReference getH2End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H3Start <em>H3 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3 Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H3Start
	 * @generated
	 */
	EClass getH3Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H3Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H3Start#getContent()
	 * @see #getH3Start()
	 * @generated
	 */
	EReference getH3Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H3Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H3Start#getEnd()
	 * @see #getH3Start()
	 * @generated
	 */
	EReference getH3Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H3End <em>H3 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3 End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H3End
	 * @generated
	 */
	EClass getH3End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H3End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H3End#getStart()
	 * @see #getH3End()
	 * @generated
	 */
	EReference getH3End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H4Start <em>H4 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4 Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H4Start
	 * @generated
	 */
	EClass getH4Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H4Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H4Start#getContent()
	 * @see #getH4Start()
	 * @generated
	 */
	EReference getH4Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H4Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H4Start#getEnd()
	 * @see #getH4Start()
	 * @generated
	 */
	EReference getH4Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H4End <em>H4 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4 End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H4End
	 * @generated
	 */
	EClass getH4End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H4End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H4End#getStart()
	 * @see #getH4End()
	 * @generated
	 */
	EReference getH4End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H5Start <em>H5 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H5 Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H5Start
	 * @generated
	 */
	EClass getH5Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H5Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H5Start#getContent()
	 * @see #getH5Start()
	 * @generated
	 */
	EReference getH5Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H5Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H5Start#getEnd()
	 * @see #getH5Start()
	 * @generated
	 */
	EReference getH5Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H5End <em>H5 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H5 End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H5End
	 * @generated
	 */
	EClass getH5End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H5End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H5End#getStart()
	 * @see #getH5End()
	 * @generated
	 */
	EReference getH5End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H6Start <em>H6 Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H6 Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H6Start
	 * @generated
	 */
	EClass getH6Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H6Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H6Start#getContent()
	 * @see #getH6Start()
	 * @generated
	 */
	EReference getH6Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H6Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H6Start#getEnd()
	 * @see #getH6Start()
	 * @generated
	 */
	EReference getH6Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H6End <em>H6 End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H6 End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H6End
	 * @generated
	 */
	EClass getH6End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.H6End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.H6End#getStart()
	 * @see #getH6End()
	 * @generated
	 */
	EReference getH6End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ExampleStart <em>Example Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ExampleStart
	 * @generated
	 */
	EClass getExampleStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ExampleStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ExampleStart#getContent()
	 * @see #getExampleStart()
	 * @generated
	 */
	EReference getExampleStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ExampleStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ExampleStart#getEnd()
	 * @see #getExampleStart()
	 * @generated
	 */
	EReference getExampleStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ExampleEnd <em>Example End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ExampleEnd
	 * @generated
	 */
	EClass getExampleEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ExampleEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ExampleEnd#getStart()
	 * @see #getExampleEnd()
	 * @generated
	 */
	EReference getExampleEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.URLStart <em>URL Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.URLStart
	 * @generated
	 */
	EClass getURLStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.URLStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.URLStart#getContent()
	 * @see #getURLStart()
	 * @generated
	 */
	EReference getURLStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.URLStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.URLStart#getEnd()
	 * @see #getURLStart()
	 * @generated
	 */
	EReference getURLStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.URLEnd <em>URL End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URL End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.URLEnd
	 * @generated
	 */
	EClass getURLEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.URLEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.URLEnd#getStart()
	 * @see #getURLEnd()
	 * @generated
	 */
	EReference getURLEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.RefStart <em>Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.RefStart
	 * @generated
	 */
	EClass getRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.RefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.RefStart#getContent()
	 * @see #getRefStart()
	 * @generated
	 */
	EReference getRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.RefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.RefStart#getEnd()
	 * @see #getRefStart()
	 * @generated
	 */
	EReference getRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.RefEnd <em>Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.RefEnd
	 * @generated
	 */
	EClass getRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.RefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.RefEnd#getStart()
	 * @see #getRefEnd()
	 * @generated
	 */
	EReference getRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.BoldStart <em>Bold Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.BoldStart
	 * @generated
	 */
	EClass getBoldStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.BoldStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.BoldStart#getContent()
	 * @see #getBoldStart()
	 * @generated
	 */
	EReference getBoldStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.BoldStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.BoldStart#getEnd()
	 * @see #getBoldStart()
	 * @generated
	 */
	EReference getBoldStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.BoldEnd <em>Bold End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.BoldEnd
	 * @generated
	 */
	EClass getBoldEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.BoldEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.BoldEnd#getStart()
	 * @see #getBoldEnd()
	 * @generated
	 */
	EReference getBoldEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineStart <em>Underline Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underline Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineStart
	 * @generated
	 */
	EClass getUnderlineStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineStart#getContent()
	 * @see #getUnderlineStart()
	 * @generated
	 */
	EReference getUnderlineStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineStart#getEnd()
	 * @see #getUnderlineStart()
	 * @generated
	 */
	EReference getUnderlineStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineEnd <em>Underline End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Underline End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineEnd
	 * @generated
	 */
	EClass getUnderlineEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UnderlineEnd#getStart()
	 * @see #getUnderlineEnd()
	 * @generated
	 */
	EReference getUnderlineEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ItalicStart <em>Italic Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ItalicStart
	 * @generated
	 */
	EClass getItalicStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ItalicStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ItalicStart#getContent()
	 * @see #getItalicStart()
	 * @generated
	 */
	EReference getItalicStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ItalicStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ItalicStart#getEnd()
	 * @see #getItalicStart()
	 * @generated
	 */
	EReference getItalicStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ItalicEnd <em>Italic End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ItalicEnd
	 * @generated
	 */
	EClass getItalicEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ItalicEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ItalicEnd#getStart()
	 * @see #getItalicEnd()
	 * @generated
	 */
	EReference getItalicEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SpanStart <em>Span Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SpanStart
	 * @generated
	 */
	EClass getSpanStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SpanStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SpanStart#getContent()
	 * @see #getSpanStart()
	 * @generated
	 */
	EReference getSpanStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SpanStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SpanStart#getEnd()
	 * @see #getSpanStart()
	 * @generated
	 */
	EReference getSpanStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SpanEnd <em>Span End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SpanEnd
	 * @generated
	 */
	EClass getSpanEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SpanEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SpanEnd#getStart()
	 * @see #getSpanEnd()
	 * @generated
	 */
	EReference getSpanEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ImgStart <em>Img Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Img Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ImgStart
	 * @generated
	 */
	EClass getImgStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ImgStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ImgStart#getContent()
	 * @see #getImgStart()
	 * @generated
	 */
	EReference getImgStart_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MailtoStart <em>Mailto Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailto Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MailtoStart
	 * @generated
	 */
	EClass getMailtoStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MailtoStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MailtoStart#getContent()
	 * @see #getMailtoStart()
	 * @generated
	 */
	EReference getMailtoStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MailtoStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MailtoStart#getEnd()
	 * @see #getMailtoStart()
	 * @generated
	 */
	EReference getMailtoStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MailtoEnd <em>Mailto End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailto End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MailtoEnd
	 * @generated
	 */
	EClass getMailtoEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MailtoEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MailtoEnd#getStart()
	 * @see #getMailtoEnd()
	 * @generated
	 */
	EReference getMailtoEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SkypeStart <em>Skype Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skype Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SkypeStart
	 * @generated
	 */
	EClass getSkypeStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SkypeStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SkypeStart#getContent()
	 * @see #getSkypeStart()
	 * @generated
	 */
	EReference getSkypeStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SkypeStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SkypeStart#getEnd()
	 * @see #getSkypeStart()
	 * @generated
	 */
	EReference getSkypeStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SkypeEnd <em>Skype End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skype End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SkypeEnd
	 * @generated
	 */
	EClass getSkypeEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SkypeEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SkypeEnd#getStart()
	 * @see #getSkypeEnd()
	 * @generated
	 */
	EReference getSkypeEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MovieStart <em>Movie Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MovieStart
	 * @generated
	 */
	EClass getMovieStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MovieStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MovieStart#getContent()
	 * @see #getMovieStart()
	 * @generated
	 */
	EReference getMovieStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MovieStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MovieStart#getEnd()
	 * @see #getMovieStart()
	 * @generated
	 */
	EReference getMovieStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MovieEnd <em>Movie End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movie End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MovieEnd
	 * @generated
	 */
	EClass getMovieEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.MovieEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.MovieEnd#getStart()
	 * @see #getMovieEnd()
	 * @generated
	 */
	EReference getMovieEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.CodeStart <em>Code Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.CodeStart
	 * @generated
	 */
	EClass getCodeStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.CodeStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.CodeStart#getContent()
	 * @see #getCodeStart()
	 * @generated
	 */
	EReference getCodeStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.CodeStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.CodeStart#getEnd()
	 * @see #getCodeStart()
	 * @generated
	 */
	EReference getCodeStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.CodeEnd <em>Code End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.CodeEnd
	 * @generated
	 */
	EClass getCodeEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.CodeEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.CodeEnd#getStart()
	 * @see #getCodeEnd()
	 * @generated
	 */
	EReference getCodeEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableStart <em>Table Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableStart
	 * @generated
	 */
	EClass getTableStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableStart#getContent()
	 * @see #getTableStart()
	 * @generated
	 */
	EReference getTableStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableStart#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rows</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableStart#getRows()
	 * @see #getTableStart()
	 * @generated
	 */
	EReference getTableStart_Rows();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableStart#getEnd()
	 * @see #getTableStart()
	 * @generated
	 */
	EReference getTableStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableEnd <em>Table End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableEnd
	 * @generated
	 */
	EClass getTableEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableEnd#getStart()
	 * @see #getTableEnd()
	 * @generated
	 */
	EReference getTableEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart <em>Table Row Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart
	 * @generated
	 */
	EClass getTableRowStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart#getContent()
	 * @see #getTableRowStart()
	 * @generated
	 */
	EReference getTableRowStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart#getColumns()
	 * @see #getTableRowStart()
	 * @generated
	 */
	EReference getTableRowStart_Columns();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableRowStart#getEnd()
	 * @see #getTableRowStart()
	 * @generated
	 */
	EReference getTableRowStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableRowEnd <em>Table Row End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableRowEnd
	 * @generated
	 */
	EClass getTableRowEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableRowEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableRowEnd#getStart()
	 * @see #getTableRowEnd()
	 * @generated
	 */
	EReference getTableRowEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableCellStart <em>Table Cell Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableCellStart
	 * @generated
	 */
	EClass getTableCellStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableCellStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableCellStart#getContent()
	 * @see #getTableCellStart()
	 * @generated
	 */
	EReference getTableCellStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableCellStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableCellStart#getEnd()
	 * @see #getTableCellStart()
	 * @generated
	 */
	EReference getTableCellStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableCellEnd <em>Table Cell End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableCellEnd
	 * @generated
	 */
	EClass getTableCellEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TableCellEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TableCellEnd#getStart()
	 * @see #getTableCellEnd()
	 * @generated
	 */
	EReference getTableCellEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListStart <em>List Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListStart
	 * @generated
	 */
	EClass getListStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListStart#getContent()
	 * @see #getListStart()
	 * @generated
	 */
	EReference getListStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListStart#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListStart#getElements()
	 * @see #getListStart()
	 * @generated
	 */
	EReference getListStart_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListStart#getEnd()
	 * @see #getListStart()
	 * @generated
	 */
	EReference getListStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListEnd <em>List End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListEnd
	 * @generated
	 */
	EClass getListEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListEnd#getStart()
	 * @see #getListEnd()
	 * @generated
	 */
	EReference getListEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart <em>Ordered List Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart
	 * @generated
	 */
	EClass getOrderedListStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getContent()
	 * @see #getOrderedListStart()
	 * @generated
	 */
	EReference getOrderedListStart_Content();

	/**
	 * Returns the meta object for the reference list '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getElements()
	 * @see #getOrderedListStart()
	 * @generated
	 */
	EReference getOrderedListStart_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getEnd()
	 * @see #getOrderedListStart()
	 * @generated
	 */
	EReference getOrderedListStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListEnd <em>Ordered List End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListEnd
	 * @generated
	 */
	EClass getOrderedListEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListEnd#getStart()
	 * @see #getOrderedListEnd()
	 * @generated
	 */
	EReference getOrderedListEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListElementStart <em>List Element Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListElementStart
	 * @generated
	 */
	EClass getListElementStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListElementStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListElementStart#getContent()
	 * @see #getListElementStart()
	 * @generated
	 */
	EReference getListElementStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListElementStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListElementStart#getEnd()
	 * @see #getListElementStart()
	 * @generated
	 */
	EReference getListElementStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListElementEnd <em>List Element End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListElementEnd
	 * @generated
	 */
	EClass getListElementEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ListElementEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ListElementEnd#getStart()
	 * @see #getListElementEnd()
	 * @generated
	 */
	EReference getListElementEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ChapterStart <em>Chapter Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ChapterStart
	 * @generated
	 */
	EClass getChapterStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ChapterStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ChapterStart#getContent()
	 * @see #getChapterStart()
	 * @generated
	 */
	EReference getChapterStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ChapterStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ChapterStart#getEnd()
	 * @see #getChapterStart()
	 * @generated
	 */
	EReference getChapterStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ChapterEnd <em>Chapter End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ChapterEnd
	 * @generated
	 */
	EClass getChapterEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ChapterEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ChapterEnd#getStart()
	 * @see #getChapterEnd()
	 * @generated
	 */
	EReference getChapterEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SectionStart <em>Section Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SectionStart
	 * @generated
	 */
	EClass getSectionStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SectionStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SectionStart#getContent()
	 * @see #getSectionStart()
	 * @generated
	 */
	EReference getSectionStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SectionStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SectionStart#getEnd()
	 * @see #getSectionStart()
	 * @generated
	 */
	EReference getSectionStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SectionEnd <em>Section End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SectionEnd
	 * @generated
	 */
	EClass getSectionEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SectionEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SectionEnd#getStart()
	 * @see #getSectionEnd()
	 * @generated
	 */
	EReference getSectionEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionStart <em>Subsection Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsection Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionStart
	 * @generated
	 */
	EClass getSubsectionStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionStart#getContent()
	 * @see #getSubsectionStart()
	 * @generated
	 */
	EReference getSubsectionStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionStart#getEnd()
	 * @see #getSubsectionStart()
	 * @generated
	 */
	EReference getSubsectionStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionEnd <em>Subsection End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subsection End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionEnd
	 * @generated
	 */
	EClass getSubsectionEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.SubsectionEnd#getStart()
	 * @see #getSubsectionEnd()
	 * @generated
	 */
	EReference getSubsectionEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewStart <em>Open View Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open View Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewStart
	 * @generated
	 */
	EClass getOpenViewStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewStart#getContent()
	 * @see #getOpenViewStart()
	 * @generated
	 */
	EReference getOpenViewStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewStart#getEnd()
	 * @see #getOpenViewStart()
	 * @generated
	 */
	EReference getOpenViewStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewEnd <em>Open View End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open View End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewEnd
	 * @generated
	 */
	EClass getOpenViewEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.OpenViewEnd#getStart()
	 * @see #getOpenViewEnd()
	 * @generated
	 */
	EReference getOpenViewEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessStart <em>Start Process Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Process Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessStart
	 * @generated
	 */
	EClass getStartProcessStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessStart#getContent()
	 * @see #getStartProcessStart()
	 * @generated
	 */
	EReference getStartProcessStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessStart#getEnd()
	 * @see #getStartProcessStart()
	 * @generated
	 */
	EReference getStartProcessStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessEnd <em>Start Process End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Process End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessEnd
	 * @generated
	 */
	EClass getStartProcessEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.StartProcessEnd#getStart()
	 * @see #getStartProcessEnd()
	 * @generated
	 */
	EReference getStartProcessEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefStart <em>Entity Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefStart
	 * @generated
	 */
	EClass getEntityRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefStart#getContent()
	 * @see #getEntityRefStart()
	 * @generated
	 */
	EReference getEntityRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefStart#getEnd()
	 * @see #getEntityRefStart()
	 * @generated
	 */
	EReference getEntityRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefEnd <em>Entity Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Ref End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefEnd
	 * @generated
	 */
	EClass getEntityRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.EntityRefEnd#getStart()
	 * @see #getEntityRefEnd()
	 * @generated
	 */
	EReference getEntityRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DTORefStart <em>DTO Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DTORefStart
	 * @generated
	 */
	EClass getDTORefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DTORefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DTORefStart#getContent()
	 * @see #getDTORefStart()
	 * @generated
	 */
	EReference getDTORefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DTORefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DTORefStart#getEnd()
	 * @see #getDTORefStart()
	 * @generated
	 */
	EReference getDTORefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DTORefEnd <em>DTO Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Ref End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DTORefEnd
	 * @generated
	 */
	EClass getDTORefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DTORefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DTORefEnd#getStart()
	 * @see #getDTORefEnd()
	 * @generated
	 */
	EReference getDTORefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefStart <em>Process Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefStart
	 * @generated
	 */
	EClass getProcessRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefStart#getContent()
	 * @see #getProcessRefStart()
	 * @generated
	 */
	EReference getProcessRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefStart#getEnd()
	 * @see #getProcessRefStart()
	 * @generated
	 */
	EReference getProcessRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefEnd <em>Process Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Ref End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefEnd
	 * @generated
	 */
	EClass getProcessRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ProcessRefEnd#getStart()
	 * @see #getProcessRefEnd()
	 * @generated
	 */
	EReference getProcessRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefStart <em>Task Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefStart
	 * @generated
	 */
	EClass getTaskRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefStart#getContent()
	 * @see #getTaskRefStart()
	 * @generated
	 */
	EReference getTaskRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefStart#getEnd()
	 * @see #getTaskRefStart()
	 * @generated
	 */
	EReference getTaskRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefEnd <em>Task Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Ref End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefEnd
	 * @generated
	 */
	EClass getTaskRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.TaskRefEnd#getStart()
	 * @see #getTaskRefEnd()
	 * @generated
	 */
	EReference getTaskRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefStart <em>View Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefStart
	 * @generated
	 */
	EClass getViewRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefStart#getContent()
	 * @see #getViewRefStart()
	 * @generated
	 */
	EReference getViewRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefStart#getEnd()
	 * @see #getViewRefStart()
	 * @generated
	 */
	EReference getViewRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefEnd <em>View Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Ref End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefEnd
	 * @generated
	 */
	EClass getViewRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.ViewRefEnd#getStart()
	 * @see #getViewRefEnd()
	 * @generated
	 */
	EReference getViewRefEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UIRefStart <em>UI Ref Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ref Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UIRefStart
	 * @generated
	 */
	EClass getUIRefStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UIRefStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UIRefStart#getContent()
	 * @see #getUIRefStart()
	 * @generated
	 */
	EReference getUIRefStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UIRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UIRefStart#getEnd()
	 * @see #getUIRefStart()
	 * @generated
	 */
	EReference getUIRefStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UIRefEnd <em>UI Ref End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ref End</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UIRefEnd
	 * @generated
	 */
	EClass getUIRefEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.compiler.UIRefEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.UIRefEnd#getStart()
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
	LDocCompilerFactory getLDocCompilerFactory();

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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentStartImpl <em>Document Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDocumentStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentEndImpl <em>Document End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DocumentEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDocumentEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessedRichStringImpl <em>Processed Rich String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessedRichStringImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getProcessedRichString()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLine()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LinePartImpl <em>Line Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LinePartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLinePart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LiteralImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLiteral()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineBreakImpl <em>Line Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LineBreakImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getLineBreak()
		 * @generated
		 */
		EClass LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopStartImpl <em>For Loop Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getForLoopStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopEndImpl <em>For Loop End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ForLoopEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getForLoopEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.PrintedExpressionImpl <em>Printed Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.PrintedExpressionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getPrintedExpression()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.IfConditionStartImpl <em>If Condition Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.IfConditionStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getIfConditionStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseIfConditionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getElseIfCondition()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseStartImpl <em>Else Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ElseStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getElseStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.EndIfImpl <em>End If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.EndIfImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getEndIf()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MarkupImpl <em>Markup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MarkupImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMarkup()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1StartImpl <em>H1 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1StartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH1Start()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1EndImpl <em>H1 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H1EndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH1End()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2StartImpl <em>H2 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2StartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH2Start()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2EndImpl <em>H2 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H2EndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH2End()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3StartImpl <em>H3 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3StartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH3Start()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3EndImpl <em>H3 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H3EndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH3End()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4StartImpl <em>H4 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4StartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH4Start()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4EndImpl <em>H4 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H4EndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH4End()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5StartImpl <em>H5 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5StartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH5Start()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5EndImpl <em>H5 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H5EndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH5End()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6StartImpl <em>H6 Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6StartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH6Start()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6EndImpl <em>H6 End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.H6EndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getH6End()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleStartImpl <em>Example Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getExampleStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleEndImpl <em>Example End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ExampleEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getExampleEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLStartImpl <em>URL Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getURLStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLEndImpl <em>URL End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.URLEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getURLEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefStartImpl <em>Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getRefStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefEndImpl <em>Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.RefEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getRefEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldStartImpl <em>Bold Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getBoldStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldEndImpl <em>Bold End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.BoldEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getBoldEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineStartImpl <em>Underline Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUnderlineStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineEndImpl <em>Underline End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UnderlineEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUnderlineEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicStartImpl <em>Italic Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getItalicStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicEndImpl <em>Italic End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ItalicEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getItalicEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanStartImpl <em>Span Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSpanStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanEndImpl <em>Span End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SpanEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSpanEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ImgStartImpl <em>Img Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ImgStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getImgStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoStartImpl <em>Mailto Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMailtoStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoEndImpl <em>Mailto End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MailtoEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMailtoEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeStartImpl <em>Skype Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSkypeStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeEndImpl <em>Skype End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SkypeEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSkypeEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieStartImpl <em>Movie Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMovieStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieEndImpl <em>Movie End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.MovieEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getMovieEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeStartImpl <em>Code Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getCodeStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeEndImpl <em>Code End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.CodeEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getCodeEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableStartImpl <em>Table Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableEndImpl <em>Table End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowStartImpl <em>Table Row Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableRowStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowEndImpl <em>Table Row End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableRowEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableRowEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellStartImpl <em>Table Cell Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableCellStart()
		 * @generated
		 */
		EClass TABLE_CELL_START = eINSTANCE.getTableCellStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CELL_START__CONTENT = eINSTANCE.getTableCellStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CELL_START__END = eINSTANCE.getTableCellStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellEndImpl <em>Table Cell End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TableCellEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTableCellEnd()
		 * @generated
		 */
		EClass TABLE_CELL_END = eINSTANCE.getTableCellEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CELL_END__START = eINSTANCE.getTableCellEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListStartImpl <em>List Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListEndImpl <em>List End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListStartImpl <em>Ordered List Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOrderedListStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListEndImpl <em>Ordered List End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OrderedListEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOrderedListEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementStartImpl <em>List Element Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListElementStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementEndImpl <em>List Element End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ListElementEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getListElementEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterStartImpl <em>Chapter Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getChapterStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterEndImpl <em>Chapter End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ChapterEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getChapterEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionStartImpl <em>Section Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSectionStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionEndImpl <em>Section End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SectionEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSectionEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionStartImpl <em>Subsection Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSubsectionStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionEndImpl <em>Subsection End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.SubsectionEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getSubsectionEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewStartImpl <em>Open View Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOpenViewStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewEndImpl <em>Open View End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.OpenViewEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getOpenViewEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessStartImpl <em>Start Process Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getStartProcessStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessEndImpl <em>Start Process End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.StartProcessEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getStartProcessEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefStartImpl <em>Entity Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getEntityRefStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefEndImpl <em>Entity Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.EntityRefEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getEntityRefEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefStartImpl <em>DTO Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDTORefStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefEndImpl <em>DTO Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.DTORefEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getDTORefEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefStartImpl <em>Process Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getProcessRefStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefEndImpl <em>Process Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ProcessRefEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getProcessRefEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefStartImpl <em>Task Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTaskRefStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefEndImpl <em>Task Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.TaskRefEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getTaskRefEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefStartImpl <em>View Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getViewRefStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefEndImpl <em>View Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.ViewRefEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getViewRefEnd()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefStartImpl <em>UI Ref Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefStartImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUIRefStart()
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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefEndImpl <em>UI Ref End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.UIRefEndImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.compiler.impl.LDocCompilerPackageImpl#getUIRefEnd()
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

} //LDocCompilerPackage
