/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocFactory
 * @model kind="package"
 * @generated
 */
public interface LuniferaDocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "luniferadoc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/luniferadoc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "luniferadoc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LuniferaDocPackage eINSTANCE = org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocDocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getLuniferaDocDocument()
	 * @generated
	 */
	int LUNIFERA_DOC_DOCUMENT = 0;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DocLayoutImpl <em>Doc Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.DocLayoutImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDocLayout()
	 * @generated
	 */
	int DOC_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_LAYOUT__CONTENT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_LAYOUT__NAME = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_LAYOUT__IMPORTS = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Doc Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOC_LAYOUT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringElseIfImpl <em>Rich String Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringElseIfImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringElseIf()
	 * @generated
	 */
	int RICH_STRING_ELSE_IF = 2;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__IF = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__THEN = 1;

	/**
	 * The number of structural features of the '<em>Rich String Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringImpl <em>Rich String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichString()
	 * @generated
	 */
	int RICH_STRING = 3;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Rich String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringLiteralImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringLiteral()
	 * @generated
	 */
	int RICH_STRING_LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL__VALUE = XbasePackage.XSTRING_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Rich String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL_FEATURE_COUNT = XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringForLoopImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringForLoop()
	 * @generated
	 */
	int RICH_STRING_FOR_LOOP = 5;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__FOR_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__EACH_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Declared Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__DECLARED_PARAM = XbasePackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM;

	/**
	 * The feature id for the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__BEFORE = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__SEPARATOR = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__AFTER = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rich String For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP_FEATURE_COUNT = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringIfImpl <em>Rich String If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringIfImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringIf()
	 * @generated
	 */
	int RICH_STRING_IF = 6;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__IF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__THEN = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE_IFS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rich String If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringMarkupImpl <em>Rich String Markup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringMarkupImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringMarkup()
	 * @generated
	 */
	int RICH_STRING_MARKUP = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Markup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringExampleImpl <em>Rich String Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringExampleImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringExample()
	 * @generated
	 */
	int RICH_STRING_EXAMPLE = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_EXAMPLE__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_EXAMPLE_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringH1Impl <em>Rich String H1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringH1Impl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringH1()
	 * @generated
	 */
	int RICH_STRING_H1 = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H1__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String H1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H1_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringH2Impl <em>Rich String H2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringH2Impl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringH2()
	 * @generated
	 */
	int RICH_STRING_H2 = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H2__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String H2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H2_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTODocumentImpl <em>DTO Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTODocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTODocument()
	 * @generated
	 */
	int DTO_DOCUMENT = 11;

	/**
	 * The feature id for the '<em><b>Dto Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__DTO_CLASS = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__HEADER = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__DETAILS = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DTO Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTOHeaderImpl <em>DTO Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTOHeaderImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTOHeader()
	 * @generated
	 */
	int DTO_HEADER = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_HEADER__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>DTO Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_HEADER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTODetailsImpl <em>DTO Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTODetailsImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTODetails()
	 * @generated
	 */
	int DTO_DETAILS = 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DETAILS__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>DTO Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DETAILS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTOPropertyImpl <em>DTO Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTOPropertyImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTOProperty()
	 * @generated
	 */
	int DTO_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>DTO Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument
	 * @generated
	 */
	EClass getLuniferaDocDocument();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.DocLayout <em>Doc Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doc Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocLayout
	 * @generated
	 */
	EClass getDocLayout();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.DocLayout#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocLayout#getContent()
	 * @see #getDocLayout()
	 * @generated
	 */
	EReference getDocLayout_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.DocLayout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocLayout#getName()
	 * @see #getDocLayout()
	 * @generated
	 */
	EAttribute getDocLayout_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.DocLayout#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocLayout#getImports()
	 * @see #getDocLayout()
	 * @generated
	 */
	EReference getDocLayout_Imports();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Else If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringElseIf
	 * @generated
	 */
	EClass getRichStringElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringElseIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringElseIf#getIf()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringElseIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringElseIf#getThen()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_Then();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichString
	 * @generated
	 */
	EClass getRichString();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringLiteral <em>Rich String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Literal</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringLiteral
	 * @generated
	 */
	EClass getRichStringLiteral();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringForLoop <em>Rich String For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String For Loop</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringForLoop
	 * @generated
	 */
	EClass getRichStringForLoop();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringForLoop#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringForLoop#getBefore()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Before();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringForLoop#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringForLoop#getSeparator()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Separator();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringForLoop#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringForLoop#getAfter()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_After();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringIf
	 * @generated
	 */
	EClass getRichStringIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringIf#getIf()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringIf#getThen()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.RichStringIf#getElseIfs <em>Else Ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Ifs</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringIf#getElseIfs()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_ElseIfs();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringIf#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringIf#getElse()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Else();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringExample <em>Rich String Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Example</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringExample
	 * @generated
	 */
	EClass getRichStringExample();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringH1 <em>Rich String H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String H1</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringH1
	 * @generated
	 */
	EClass getRichStringH1();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringH2 <em>Rich String H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String H2</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringH2
	 * @generated
	 */
	EClass getRichStringH2();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.RichStringMarkup <em>Rich String Markup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Markup</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringMarkup
	 * @generated
	 */
	EClass getRichStringMarkup();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.RichStringMarkup#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.RichStringMarkup#getExpression()
	 * @see #getRichStringMarkup()
	 * @generated
	 */
	EReference getRichStringMarkup_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.DTODocument <em>DTO Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTODocument
	 * @generated
	 */
	EClass getDTODocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getDtoClass <em>Dto Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dto Class</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTODocument#getDtoClass()
	 * @see #getDTODocument()
	 * @generated
	 */
	EAttribute getDTODocument_DtoClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTODocument#getHeader()
	 * @see #getDTODocument()
	 * @generated
	 */
	EReference getDTODocument_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Details</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTODocument#getDetails()
	 * @see #getDTODocument()
	 * @generated
	 */
	EReference getDTODocument_Details();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.DTOHeader <em>DTO Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Header</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTOHeader
	 * @generated
	 */
	EClass getDTOHeader();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.DTOHeader#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTOHeader#getContent()
	 * @see #getDTOHeader()
	 * @generated
	 */
	EReference getDTOHeader_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.DTODetails <em>DTO Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Details</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTODetails
	 * @generated
	 */
	EClass getDTODetails();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.DTODetails#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTODetails#getProperties()
	 * @see #getDTODetails()
	 * @generated
	 */
	EReference getDTODetails_Properties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.DTOProperty <em>DTO Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Property</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTOProperty
	 * @generated
	 */
	EClass getDTOProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.DTOProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTOProperty#getName()
	 * @see #getDTOProperty()
	 * @generated
	 */
	EAttribute getDTOProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.DTOProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DTOProperty#getDescription()
	 * @see #getDTOProperty()
	 * @generated
	 */
	EReference getDTOProperty_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LuniferaDocFactory getLuniferaDocFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocDocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getLuniferaDocDocument()
		 * @generated
		 */
		EClass LUNIFERA_DOC_DOCUMENT = eINSTANCE.getLuniferaDocDocument();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DocLayoutImpl <em>Doc Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.DocLayoutImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDocLayout()
		 * @generated
		 */
		EClass DOC_LAYOUT = eINSTANCE.getDocLayout();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_LAYOUT__CONTENT = eINSTANCE.getDocLayout_Content();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOC_LAYOUT__NAME = eINSTANCE.getDocLayout_Name();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOC_LAYOUT__IMPORTS = eINSTANCE.getDocLayout_Imports();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringElseIfImpl <em>Rich String Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringElseIfImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringElseIf()
		 * @generated
		 */
		EClass RICH_STRING_ELSE_IF = eINSTANCE.getRichStringElseIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__IF = eINSTANCE.getRichStringElseIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__THEN = eINSTANCE.getRichStringElseIf_Then();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringImpl <em>Rich String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichString()
		 * @generated
		 */
		EClass RICH_STRING = eINSTANCE.getRichString();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringLiteralImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringLiteral()
		 * @generated
		 */
		EClass RICH_STRING_LITERAL = eINSTANCE.getRichStringLiteral();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringForLoopImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringForLoop()
		 * @generated
		 */
		EClass RICH_STRING_FOR_LOOP = eINSTANCE.getRichStringForLoop();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__BEFORE = eINSTANCE.getRichStringForLoop_Before();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__SEPARATOR = eINSTANCE.getRichStringForLoop_Separator();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__AFTER = eINSTANCE.getRichStringForLoop_After();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringIfImpl <em>Rich String If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringIfImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringIf()
		 * @generated
		 */
		EClass RICH_STRING_IF = eINSTANCE.getRichStringIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__IF = eINSTANCE.getRichStringIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__THEN = eINSTANCE.getRichStringIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else Ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE_IFS = eINSTANCE.getRichStringIf_ElseIfs();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE = eINSTANCE.getRichStringIf_Else();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringExampleImpl <em>Rich String Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringExampleImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringExample()
		 * @generated
		 */
		EClass RICH_STRING_EXAMPLE = eINSTANCE.getRichStringExample();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringH1Impl <em>Rich String H1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringH1Impl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringH1()
		 * @generated
		 */
		EClass RICH_STRING_H1 = eINSTANCE.getRichStringH1();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringH2Impl <em>Rich String H2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringH2Impl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringH2()
		 * @generated
		 */
		EClass RICH_STRING_H2 = eINSTANCE.getRichStringH2();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.RichStringMarkupImpl <em>Rich String Markup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.RichStringMarkupImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getRichStringMarkup()
		 * @generated
		 */
		EClass RICH_STRING_MARKUP = eINSTANCE.getRichStringMarkup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_MARKUP__EXPRESSION = eINSTANCE.getRichStringMarkup_Expression();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTODocumentImpl <em>DTO Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTODocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTODocument()
		 * @generated
		 */
		EClass DTO_DOCUMENT = eINSTANCE.getDTODocument();

		/**
		 * The meta object literal for the '<em><b>Dto Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_DOCUMENT__DTO_CLASS = eINSTANCE.getDTODocument_DtoClass();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DOCUMENT__HEADER = eINSTANCE.getDTODocument_Header();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DOCUMENT__DETAILS = eINSTANCE.getDTODocument_Details();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTOHeaderImpl <em>DTO Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTOHeaderImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTOHeader()
		 * @generated
		 */
		EClass DTO_HEADER = eINSTANCE.getDTOHeader();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_HEADER__CONTENT = eINSTANCE.getDTOHeader_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTODetailsImpl <em>DTO Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTODetailsImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTODetails()
		 * @generated
		 */
		EClass DTO_DETAILS = eINSTANCE.getDTODetails();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DETAILS__PROPERTIES = eINSTANCE.getDTODetails_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DTOPropertyImpl <em>DTO Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.DTOPropertyImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDTOProperty()
		 * @generated
		 */
		EClass DTO_PROPERTY = eINSTANCE.getDTOProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_PROPERTY__NAME = eINSTANCE.getDTOProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_PROPERTY__DESCRIPTION = eINSTANCE.getDTOProperty_Description();

	}

} //LuniferaDocPackage
