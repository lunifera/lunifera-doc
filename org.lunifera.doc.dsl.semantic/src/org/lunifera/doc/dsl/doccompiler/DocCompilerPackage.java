/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerFactory
 * @model kind="package"
 * @generated
 */
public interface DocCompilerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "doccompiler";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/doccompiler";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "doccompiler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	DocCompilerPackage eINSTANCE = org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LinePartImpl <em>Line Part</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LinePartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLinePart()
	 * @generated
	 */
	int LINE_PART = 4;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PART__LINE = 0;

	/**
	 * The number of structural features of the '<em>Line Part</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_PART_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Line Part</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl <em>Document Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentStart()
	 * @generated
	 */
	int DOCUMENT_START = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START__DOCUMENT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Document Start</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Document Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl <em>Document End</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentEnd()
	 * @generated
	 */
	int DOCUMENT_END = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Document End</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Document End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl <em>Processed Rich String</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessedRichString()
	 * @generated
	 */
	int PROCESSED_RICH_STRING = 2;

	/**
	 * The feature id for the '<em><b>Rich String</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING__RICH_STRING = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING__LINES = 1;

	/**
	 * The number of structural features of the '<em>Processed Rich String</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Processed Rich String</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PROCESSED_RICH_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineImpl <em>Line</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LineImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PARTS = 0;

	/**
	 * The feature id for the '<em><b>Rich String</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__RICH_STRING = 1;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LiteralImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LITERAL = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__OFFSET = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__LENGTH = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl <em>Line Break</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLineBreak()
	 * @generated
	 */
	int LINE_BREAK = 6;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__LINE = LITERAL__LINE;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__LITERAL = LITERAL__LITERAL;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__OFFSET = LITERAL__OFFSET;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK__LENGTH = LITERAL__LENGTH;

	/**
	 * The number of structural features of the '<em>Line Break</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Break</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_BREAK_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl <em>For Loop Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopStart()
	 * @generated
	 */
	int FOR_LOOP_START = 7;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START__LOOP = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>For Loop Start</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>For Loop Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl <em>For Loop End</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopEnd()
	 * @generated
	 */
	int FOR_LOOP_END = 8;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>For Loop End</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>For Loop End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl <em>Printed Expression</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getPrintedExpression()
	 * @generated
	 */
	int PRINTED_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION__EXPRESSION = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Printed Expression</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Printed Expression</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PRINTED_EXPRESSION_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl <em>If Condition Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getIfConditionStart()
	 * @generated
	 */
	int IF_CONDITION_START = 10;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Rich String If</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__RICH_STRING_IF = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Else Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__ELSE_START = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else If Conditions</b></em>' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__ELSE_IF_CONDITIONS = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End If</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START__END_IF = LINE_PART_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>If Condition Start</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>If Condition Start</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_CONDITION_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseIfCondition()
	 * @generated
	 */
	int ELSE_IF_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Rich String Else If</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION__RICH_STRING_ELSE_IF = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If Condition Start</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Else If Condition</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Else If Condition</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_CONDITION_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl <em>Else Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseStart()
	 * @generated
	 */
	int ELSE_START = 12;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>If Condition Start</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELSE_START__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Else Start</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ELSE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Else Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl <em>End If</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEndIf()
	 * @generated
	 */
	int END_IF = 13;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_IF__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>If Condition Start</b></em>' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int END_IF__IF_CONDITION_START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End If</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_IF_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End If</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_IF_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl <em>Markup</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMarkup()
	 * @generated
	 */
	int MARKUP = 14;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Markup</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP__MARKUP = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markup</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Markup</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKUP_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl <em>H1 Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1Start()
	 * @generated
	 */
	int H1_START = 15;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H1 Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H1 Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl <em>H1 End</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1End()
	 * @generated
	 */
	int H1_END = 16;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H1 End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H1 End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl <em>H2 Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2Start()
	 * @generated
	 */
	int H2_START = 17;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>H2 Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>H2 Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl <em>H2 End</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2End()
	 * @generated
	 */
	int H2_END = 18;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>H2 End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>H2 End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl <em>Example Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleStart()
	 * @generated
	 */
	int EXAMPLE_START = 19;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Example Start</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Example Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl <em>Example End</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleEnd()
	 * @generated
	 */
	int EXAMPLE_END = 20;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Example End</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Example End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl <em>URL Start</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLStart()
	 * @generated
	 */
	int URL_START = 21;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START__CONTENT = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START__END = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>URL Start</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int URL_START_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>URL Start</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_START_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl <em>URL End</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLEnd()
	 * @generated
	 */
	int URL_END = 22;

	/**
	 * The feature id for the '<em><b>Line</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END__LINE = LINE_PART__LINE;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END__START = LINE_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URL End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END_FEATURE_COUNT = LINE_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>URL End</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_END_OPERATION_COUNT = LINE_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl <em>Bold Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getBoldStart()
	 * @generated
	 */
	int BOLD_START = 23;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UnderlineStartImpl <em>Underline Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.UnderlineStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUnderlineStart()
	 * @generated
	 */
	int UNDERLINE_START = 24;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ItalicStartImpl <em>Italic Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ItalicStartImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getItalicStart()
	 * @generated
	 */
	int ITALIC_START = 25;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.BoldEndImpl <em>Bold End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.BoldEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getBoldEnd()
	 * @generated
	 */
	int BOLD_END = 26;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.UnderlineEndImpl <em>Underline End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.UnderlineEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getUnderlineEnd()
	 * @generated
	 */
	int UNDERLINE_END = 27;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ItalicEndImpl <em>Italic End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.doccompiler.impl.ItalicEndImpl
	 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getItalicEnd()
	 * @generated
	 */
	int ITALIC_END = 28;

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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart <em>Document Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart
	 * @generated
	 */
	EClass getDocumentStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart#getContent()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart#getEnd()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentStart#getDocument()
	 * @see #getDocumentStart()
	 * @generated
	 */
	EReference getDocumentStart_Document();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.DocumentEnd <em>Document End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentEnd
	 * @generated
	 */
	EClass getDocumentEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.DocumentEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentEnd#getStart()
	 * @see #getDocumentEnd()
	 * @generated
	 */
	EReference getDocumentEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString <em>Processed Rich String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processed Rich String</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessedRichString
	 * @generated
	 */
	EClass getProcessedRichString();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getRichString <em>Rich String</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.Line <em>Line</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Line</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.lunifera.doc.dsl.doccompiler.Line#getParts <em>Parts</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Line#getParts()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Parts();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.doc.dsl.doccompiler.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rich String</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Line#getRichString()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_RichString();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.LinePart <em>Line Part</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Line Part</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.LinePart
	 * @generated
	 */
	EClass getLinePart();

	/**
	 * Returns the meta object for the container reference '{@link org.lunifera.doc.dsl.doccompiler.LinePart#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Line</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.LinePart#getLine()
	 * @see #getLinePart()
	 * @generated
	 */
	EReference getLinePart_Line();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.Literal <em>Literal</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.Literal#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Literal</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal#getLiteral()
	 * @see #getLiteral()
	 * @generated
	 */
	EReference getLiteral_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.doccompiler.Literal#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal#getOffset()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.doccompiler.Literal#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Literal#getLength()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Length();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.LineBreak <em>Line Break</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Line Break</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.LineBreak
	 * @generated
	 */
	EClass getLineBreak();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ForLoopStart <em>For Loop Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopStart
	 * @generated
	 */
	EClass getForLoopStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ForLoopStart#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopStart#getLoop()
	 * @see #getForLoopStart()
	 * @generated
	 */
	EReference getForLoopStart_Loop();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ForLoopStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopStart#getEnd()
	 * @see #getForLoopStart()
	 * @generated
	 */
	EReference getForLoopStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ForLoopEnd <em>For Loop End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopEnd
	 * @generated
	 */
	EClass getForLoopEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ForLoopEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ForLoopEnd#getStart()
	 * @see #getForLoopEnd()
	 * @generated
	 */
	EReference getForLoopEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.PrintedExpression <em>Printed Expression</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Printed Expression</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.PrintedExpression
	 * @generated
	 */
	EClass getPrintedExpression();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.lunifera.doc.dsl.doccompiler.PrintedExpression#getExpression <em>Expression</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.PrintedExpression#getExpression()
	 * @see #getPrintedExpression()
	 * @generated
	 */
	EReference getPrintedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart
	 * @generated
	 */
	EClass getIfConditionStart();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getRichStringIf <em>Rich String If</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Rich String If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getRichStringIf()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_RichStringIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseStart()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_ElseStart();

	/**
	 * Returns the meta object for the reference list '
	 * {@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseIfConditions <em>Else If Conditions</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Else If Conditions</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseIfConditions()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_ElseIfConditions();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getEndIf <em>End If</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getEndIf()
	 * @see #getIfConditionStart()
	 * @generated
	 */
	EReference getIfConditionStart_EndIf();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ElseIfCondition <em>Else If Condition</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Else If Condition</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseIfCondition
	 * @generated
	 */
	EClass getElseIfCondition();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getRichStringElseIf <em>Rich String Else If</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Rich String Else If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getRichStringElseIf()
	 * @see #getElseIfCondition()
	 * @generated
	 */
	EReference getElseIfCondition_RichStringElseIf();

	/**
	 * Returns the meta object for the reference '
	 * {@link org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getIfConditionStart <em>If Condition Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseIfCondition#getIfConditionStart()
	 * @see #getElseIfCondition()
	 * @generated
	 */
	EReference getElseIfCondition_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ElseStart <em>Else Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Else Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseStart
	 * @generated
	 */
	EClass getElseStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ElseStart#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ElseStart#getIfConditionStart()
	 * @see #getElseStart()
	 * @generated
	 */
	EReference getElseStart_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.EndIf <em>End If</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>End If</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EndIf
	 * @generated
	 */
	EClass getEndIf();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.EndIf#getIfConditionStart <em>If Condition Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>If Condition Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.EndIf#getIfConditionStart()
	 * @see #getEndIf()
	 * @generated
	 */
	EReference getEndIf_IfConditionStart();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.Markup <em>Markup</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Markup</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Markup
	 * @generated
	 */
	EClass getMarkup();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.Markup#getMarkup <em>Markup</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Markup</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.Markup#getMarkup()
	 * @see #getMarkup()
	 * @generated
	 */
	EReference getMarkup_Markup();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H1Start <em>H1 Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>H1 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1Start
	 * @generated
	 */
	EClass getH1Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H1Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1Start#getContent()
	 * @see #getH1Start()
	 * @generated
	 */
	EReference getH1Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H1Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1Start#getEnd()
	 * @see #getH1Start()
	 * @generated
	 */
	EReference getH1Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H1End <em>H1 End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>H1 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1End
	 * @generated
	 */
	EClass getH1End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H1End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H1End#getStart()
	 * @see #getH1End()
	 * @generated
	 */
	EReference getH1End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H2Start <em>H2 Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>H2 Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2Start
	 * @generated
	 */
	EClass getH2Start();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H2Start#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2Start#getContent()
	 * @see #getH2Start()
	 * @generated
	 */
	EReference getH2Start_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H2Start#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2Start#getEnd()
	 * @see #getH2Start()
	 * @generated
	 */
	EReference getH2Start_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.H2End <em>H2 End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>H2 End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2End
	 * @generated
	 */
	EClass getH2End();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.H2End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.H2End#getStart()
	 * @see #getH2End()
	 * @generated
	 */
	EReference getH2End_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart <em>Example Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart
	 * @generated
	 */
	EClass getExampleStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart#getContent()
	 * @see #getExampleStart()
	 * @generated
	 */
	EReference getExampleStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart#getEnd()
	 * @see #getExampleStart()
	 * @generated
	 */
	EReference getExampleStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.ExampleEnd <em>Example End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleEnd
	 * @generated
	 */
	EClass getExampleEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.ExampleEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleEnd#getStart()
	 * @see #getExampleEnd()
	 * @generated
	 */
	EReference getExampleEnd_Start();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.URLStart <em>URL Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>URL Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLStart
	 * @generated
	 */
	EClass getURLStart();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.URLStart#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLStart#getContent()
	 * @see #getURLStart()
	 * @generated
	 */
	EReference getURLStart_Content();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.URLStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLStart#getEnd()
	 * @see #getURLStart()
	 * @generated
	 */
	EReference getURLStart_End();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.doccompiler.URLEnd <em>URL End</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>URL End</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLEnd
	 * @generated
	 */
	EClass getURLEnd();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.doccompiler.URLEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see org.lunifera.doc.dsl.doccompiler.URLEnd#getStart()
	 * @see #getURLEnd()
	 * @generated
	 */
	EReference getURLEnd_Start();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocCompilerFactory getDocCompilerFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl <em>Document Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentStart()
		 * @generated
		 */
		EClass DOCUMENT_START = eINSTANCE.getDocumentStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_START__CONTENT = eINSTANCE.getDocumentStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_START__END = eINSTANCE.getDocumentStart_End();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_START__DOCUMENT = eINSTANCE.getDocumentStart_Document();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl <em>Document End</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocumentEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getDocumentEnd()
		 * @generated
		 */
		EClass DOCUMENT_END = eINSTANCE.getDocumentEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_END__START = eINSTANCE.getDocumentEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl <em>Processed Rich String</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ProcessedRichStringImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getProcessedRichString()
		 * @generated
		 */
		EClass PROCESSED_RICH_STRING = eINSTANCE.getProcessedRichString();

		/**
		 * The meta object literal for the '<em><b>Rich String</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PROCESSED_RICH_STRING__RICH_STRING = eINSTANCE.getProcessedRichString_RichString();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PROCESSED_RICH_STRING__LINES = eINSTANCE.getProcessedRichString_Lines();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.LineImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LINE__PARTS = eINSTANCE.getLine_Parts();

		/**
		 * The meta object literal for the '<em><b>Rich String</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LINE__RICH_STRING = eINSTANCE.getLine_RichString();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LinePartImpl <em>Line Part</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.LiteralImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference LITERAL__LITERAL = eINSTANCE.getLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__OFFSET = eINSTANCE.getLiteral_Offset();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__LENGTH = eINSTANCE.getLiteral_Length();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl <em>Line Break</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.LineBreakImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getLineBreak()
		 * @generated
		 */
		EClass LINE_BREAK = eINSTANCE.getLineBreak();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl <em>For Loop Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopStart()
		 * @generated
		 */
		EClass FOR_LOOP_START = eINSTANCE.getForLoopStart();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP_START__LOOP = eINSTANCE.getForLoopStart_Loop();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP_START__END = eINSTANCE.getForLoopStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl <em>For Loop End</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ForLoopEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getForLoopEnd()
		 * @generated
		 */
		EClass FOR_LOOP_END = eINSTANCE.getForLoopEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference FOR_LOOP_END__START = eINSTANCE.getForLoopEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl <em>Printed Expression</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.PrintedExpressionImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getPrintedExpression()
		 * @generated
		 */
		EClass PRINTED_EXPRESSION = eINSTANCE.getPrintedExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference PRINTED_EXPRESSION__EXPRESSION = eINSTANCE.getPrintedExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl <em>If Condition Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION_START__ELSE_START = eINSTANCE.getIfConditionStart_ElseStart();

		/**
		 * The meta object literal for the '<em><b>Else If Conditions</b></em>' reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IF_CONDITION_START__ELSE_IF_CONDITIONS = eINSTANCE.getIfConditionStart_ElseIfConditions();

		/**
		 * The meta object literal for the '<em><b>End If</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference IF_CONDITION_START__END_IF = eINSTANCE.getIfConditionStart_EndIf();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl <em>Else If Condition</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseIfConditionImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseIfCondition()
		 * @generated
		 */
		EClass ELSE_IF_CONDITION = eINSTANCE.getElseIfCondition();

		/**
		 * The meta object literal for the '<em><b>Rich String Else If</b></em>' reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_CONDITION__RICH_STRING_ELSE_IF = eINSTANCE.getElseIfCondition_RichStringElseIf();

		/**
		 * The meta object literal for the '<em><b>If Condition Start</b></em>' reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_CONDITION__IF_CONDITION_START = eINSTANCE.getElseIfCondition_IfConditionStart();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl <em>Else Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ElseStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getElseStart()
		 * @generated
		 */
		EClass ELSE_START = eINSTANCE.getElseStart();

		/**
		 * The meta object literal for the '<em><b>If Condition Start</b></em>' reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_START__IF_CONDITION_START = eINSTANCE.getElseStart_IfConditionStart();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl <em>End If</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.EndIfImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getEndIf()
		 * @generated
		 */
		EClass END_IF = eINSTANCE.getEndIf();

		/**
		 * The meta object literal for the '<em><b>If Condition Start</b></em>' reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_IF__IF_CONDITION_START = eINSTANCE.getEndIf_IfConditionStart();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl <em>Markup</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getMarkup()
		 * @generated
		 */
		EClass MARKUP = eINSTANCE.getMarkup();

		/**
		 * The meta object literal for the '<em><b>Markup</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference MARKUP__MARKUP = eINSTANCE.getMarkup_Markup();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl <em>H1 Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H1StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1Start()
		 * @generated
		 */
		EClass H1_START = eINSTANCE.getH1Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference H1_START__CONTENT = eINSTANCE.getH1Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference H1_START__END = eINSTANCE.getH1Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl <em>H1 End</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H1EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH1End()
		 * @generated
		 */
		EClass H1_END = eINSTANCE.getH1End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference H1_END__START = eINSTANCE.getH1End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl <em>H2 Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2Start()
		 * @generated
		 */
		EClass H2_START = eINSTANCE.getH2Start();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference H2_START__CONTENT = eINSTANCE.getH2Start_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference H2_START__END = eINSTANCE.getH2Start_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl <em>H2 End</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.H2EndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getH2End()
		 * @generated
		 */
		EClass H2_END = eINSTANCE.getH2End();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference H2_END__START = eINSTANCE.getH2End_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl <em>Example Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleStart()
		 * @generated
		 */
		EClass EXAMPLE_START = eINSTANCE.getExampleStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_START__CONTENT = eINSTANCE.getExampleStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_START__END = eINSTANCE.getExampleStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl <em>Example End</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.ExampleEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getExampleEnd()
		 * @generated
		 */
		EClass EXAMPLE_END = eINSTANCE.getExampleEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_END__START = eINSTANCE.getExampleEnd_Start();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl <em>URL Start</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLStart()
		 * @generated
		 */
		EClass URL_START = eINSTANCE.getURLStart();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference URL_START__CONTENT = eINSTANCE.getURLStart_Content();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference URL_START__END = eINSTANCE.getURLStart_End();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl <em>URL End</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl
		 * @see org.lunifera.doc.dsl.doccompiler.impl.DocCompilerPackageImpl#getURLEnd()
		 * @generated
		 */
		EClass URL_END = eINSTANCE.getURLEnd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference URL_END__START = eINSTANCE.getURLEnd_Start();

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

	}

} // DocCompilerPackage
