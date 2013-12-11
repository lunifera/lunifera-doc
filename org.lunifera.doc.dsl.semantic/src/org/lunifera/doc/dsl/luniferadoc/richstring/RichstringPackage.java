/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringFactory
 * @model kind="package"
 * @generated
 */
public interface RichstringPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "richstring";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/luniferadoc/richstring";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "richstring";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	RichstringPackage eINSTANCE = org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringElseIfImpl
	 * <em>Rich String Else If</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringElseIfImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringElseIf()
	 * @generated
	 */
	int RICH_STRING_ELSE_IF = 0;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__IF = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__THEN = 1;

	/**
	 * The number of structural features of the '<em>Rich String Else If</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImpl
	 * <em>Rich String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichString()
	 * @generated
	 */
	int RICH_STRING = 1;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Rich String</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringLiteralImpl
	 * <em>Rich String Literal</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringLiteralImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringLiteral()
	 * @generated
	 */
	int RICH_STRING_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL__VALUE = XbasePackage.XSTRING_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Rich String Literal</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL_FEATURE_COUNT = XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringForLoopImpl
	 * <em>Rich String For Loop</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringForLoopImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringForLoop()
	 * @generated
	 */
	int RICH_STRING_FOR_LOOP = 3;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__FOR_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Each Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__EACH_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Declared Param</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__DECLARED_PARAM = XbasePackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM;

	/**
	 * The feature id for the '<em><b>Before</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__BEFORE = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__SEPARATOR = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__AFTER = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rich String For Loop</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP_FEATURE_COUNT = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringIfImpl
	 * <em>Rich String If</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringIfImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringIf()
	 * @generated
	 */
	int RICH_STRING_IF = 4;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__IF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__THEN = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Ifs</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE_IFS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rich String If</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl
	 * <em>Rich String Markup</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringMarkup()
	 * @generated
	 */
	int RICH_STRING_MARKUP = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Markup</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringExampleImpl
	 * <em>Rich String Example</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringExampleImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringExample()
	 * @generated
	 */
	int RICH_STRING_EXAMPLE = 6;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_EXAMPLE__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Example</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_EXAMPLE_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH1Impl
	 * <em>Rich String H1</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH1Impl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringH1()
	 * @generated
	 */
	int RICH_STRING_H1 = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H1__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String H1</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H1_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH2Impl
	 * <em>Rich String H2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH2Impl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringH2()
	 * @generated
	 */
	int RICH_STRING_H2 = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H2__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String H2</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H2_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringURLImpl
	 * <em>Rich String URL</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringURLImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringURL()
	 * @generated
	 */
	int RICH_STRING_URL = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_URL__LOCATION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_URL__TEXT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rich String URL</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_URL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoldImpl
	 * <em>Rich String Bold</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoldImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringBold()
	 * @generated
	 */
	int RICH_STRING_BOLD = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_BOLD__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Bold</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_BOLD_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUnderlineImpl
	 * <em>Rich String Underline</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUnderlineImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringUnderline()
	 * @generated
	 */
	int RICH_STRING_UNDERLINE = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UNDERLINE__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Underline</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UNDERLINE_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringItalicImpl
	 * <em>Rich String Italic</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringItalicImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringItalic()
	 * @generated
	 */
	int RICH_STRING_ITALIC = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ITALIC__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Italic</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ITALIC_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImgImpl
	 * <em>Rich String Img</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImgImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringImg()
	 * @generated
	 */
	int RICH_STRING_IMG = 13;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IMG__SRC = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IMG__ALT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IMG__WIDTH = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IMG__HEIGHT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rich String Img</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IMG_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMailtoImpl
	 * <em>Rich String Mailto</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMailtoImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringMailto()
	 * @generated
	 */
	int RICH_STRING_MAILTO = 14;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MAILTO__EMAIL = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MAILTO__CONTENT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rich String Mailto</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MAILTO_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf
	 * <em>Rich String Else If</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Else If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf
	 * @generated
	 */
	EClass getRichStringElseIf();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf#getIf <em>If</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf#getIf()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_If();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf#getThen <em>Then</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf#getThen()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_Then();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichString
	 * <em>Rich String</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichString
	 * @generated
	 */
	EClass getRichString();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral
	 * <em>Rich String Literal</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Literal</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral
	 * @generated
	 */
	EClass getRichStringLiteral();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop
	 * <em>Rich String For Loop</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String For Loop</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop
	 * @generated
	 */
	EClass getRichStringForLoop();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop#getBefore <em>Before</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Before</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop#getBefore()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Before();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop#getSeparator <em>Separator</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop#getSeparator()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Separator();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop#getAfter <em>After</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop#getAfter()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_After();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf
	 * <em>Rich String If</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf
	 * @generated
	 */
	EClass getRichStringIf();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getIf <em>If</em>}'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getIf()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_If();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getThen <em>Then</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getThen()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Then();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getElseIfs <em>Else Ifs</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Else Ifs</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getElseIfs()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_ElseIfs();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getElse <em>Else</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf#getElse()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Else();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup
	 * <em>Rich String Markup</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Markup</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup
	 * @generated
	 */
	EClass getRichStringMarkup();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getExpression <em>Expression</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getExpression()
	 * @see #getRichStringMarkup()
	 * @generated
	 */
	EReference getRichStringMarkup_Expression();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample
	 * <em>Rich String Example</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Example</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample
	 * @generated
	 */
	EClass getRichStringExample();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1
	 * <em>Rich String H1</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String H1</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1
	 * @generated
	 */
	EClass getRichStringH1();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2
	 * <em>Rich String H2</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String H2</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2
	 * @generated
	 */
	EClass getRichStringH2();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL
	 * <em>Rich String URL</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String URL</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL
	 * @generated
	 */
	EClass getRichStringURL();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL#getLocation <em>Location</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL#getLocation()
	 * @see #getRichStringURL()
	 * @generated
	 */
	EAttribute getRichStringURL_Location();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL#getText <em>Text</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL#getText()
	 * @see #getRichStringURL()
	 * @generated
	 */
	EReference getRichStringURL_Text();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold
	 * <em>Rich String Bold</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Bold</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold
	 * @generated
	 */
	EClass getRichStringBold();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline
	 * <em>Rich String Underline</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Underline</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline
	 * @generated
	 */
	EClass getRichStringUnderline();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic
	 * <em>Rich String Italic</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Italic</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic
	 * @generated
	 */
	EClass getRichStringItalic();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg
	 * <em>Rich String Img</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Img</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg
	 * @generated
	 */
	EClass getRichStringImg();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getSrc <em>Src</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getSrc()
	 * @see #getRichStringImg()
	 * @generated
	 */
	EAttribute getRichStringImg_Src();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getAlt <em>Alt</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getAlt()
	 * @see #getRichStringImg()
	 * @generated
	 */
	EAttribute getRichStringImg_Alt();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getWidth <em>Width</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getWidth()
	 * @see #getRichStringImg()
	 * @generated
	 */
	EAttribute getRichStringImg_Width();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getHeight <em>Height</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg#getHeight()
	 * @see #getRichStringImg()
	 * @generated
	 */
	EAttribute getRichStringImg_Height();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto
	 * <em>Rich String Mailto</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Mailto</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto
	 * @generated
	 */
	EClass getRichStringMailto();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getEmail <em>Email</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getEmail()
	 * @see #getRichStringMailto()
	 * @generated
	 */
	EAttribute getRichStringMailto_Email();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getContent <em>Content</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getContent()
	 * @see #getRichStringMailto()
	 * @generated
	 */
	EReference getRichStringMailto_Content();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RichstringFactory getRichstringFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringElseIfImpl <em>Rich String Else If</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringElseIfImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringElseIf()
		 * @generated
		 */
		EClass RICH_STRING_ELSE_IF = eINSTANCE.getRichStringElseIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__IF = eINSTANCE.getRichStringElseIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__THEN = eINSTANCE.getRichStringElseIf_Then();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImpl
		 * <em>Rich String</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichString()
		 * @generated
		 */
		EClass RICH_STRING = eINSTANCE.getRichString();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringLiteralImpl <em>Rich String Literal</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringLiteralImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringLiteral()
		 * @generated
		 */
		EClass RICH_STRING_LITERAL = eINSTANCE.getRichStringLiteral();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringForLoopImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringForLoop()
		 * @generated
		 */
		EClass RICH_STRING_FOR_LOOP = eINSTANCE.getRichStringForLoop();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__BEFORE = eINSTANCE.getRichStringForLoop_Before();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__SEPARATOR = eINSTANCE.getRichStringForLoop_Separator();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__AFTER = eINSTANCE.getRichStringForLoop_After();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringIfImpl
		 * <em>Rich String If</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringIfImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringIf()
		 * @generated
		 */
		EClass RICH_STRING_IF = eINSTANCE.getRichStringIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_IF__IF = eINSTANCE.getRichStringIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_IF__THEN = eINSTANCE.getRichStringIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else Ifs</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE_IFS = eINSTANCE.getRichStringIf_ElseIfs();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE = eINSTANCE.getRichStringIf_Else();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl <em>Rich String Markup</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringMarkup()
		 * @generated
		 */
		EClass RICH_STRING_MARKUP = eINSTANCE.getRichStringMarkup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_MARKUP__EXPRESSION = eINSTANCE.getRichStringMarkup_Expression();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringExampleImpl <em>Rich String Example</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringExampleImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringExample()
		 * @generated
		 */
		EClass RICH_STRING_EXAMPLE = eINSTANCE.getRichStringExample();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH1Impl
		 * <em>Rich String H1</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH1Impl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringH1()
		 * @generated
		 */
		EClass RICH_STRING_H1 = eINSTANCE.getRichStringH1();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH2Impl
		 * <em>Rich String H2</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringH2Impl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringH2()
		 * @generated
		 */
		EClass RICH_STRING_H2 = eINSTANCE.getRichStringH2();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringURLImpl
		 * <em>Rich String URL</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringURLImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringURL()
		 * @generated
		 */
		EClass RICH_STRING_URL = eINSTANCE.getRichStringURL();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_URL__LOCATION = eINSTANCE.getRichStringURL_Location();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference feature. <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_URL__TEXT = eINSTANCE.getRichStringURL_Text();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoldImpl
		 * <em>Rich String Bold</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoldImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringBold()
		 * @generated
		 */
		EClass RICH_STRING_BOLD = eINSTANCE.getRichStringBold();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUnderlineImpl
		 * <em>Rich String Underline</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUnderlineImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringUnderline()
		 * @generated
		 */
		EClass RICH_STRING_UNDERLINE = eINSTANCE.getRichStringUnderline();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringItalicImpl <em>Rich String Italic</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringItalicImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringItalic()
		 * @generated
		 */
		EClass RICH_STRING_ITALIC = eINSTANCE.getRichStringItalic();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImgImpl
		 * <em>Rich String Img</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImgImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringImg()
		 * @generated
		 */
		EClass RICH_STRING_IMG = eINSTANCE.getRichStringImg();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_IMG__SRC = eINSTANCE.getRichStringImg_Src();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_IMG__ALT = eINSTANCE.getRichStringImg_Alt();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_IMG__WIDTH = eINSTANCE.getRichStringImg_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_IMG__HEIGHT = eINSTANCE.getRichStringImg_Height();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMailtoImpl <em>Rich String Mailto</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMailtoImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringMailto()
		 * @generated
		 */
		EClass RICH_STRING_MAILTO = eINSTANCE.getRichStringMailto();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_MAILTO__EMAIL = eINSTANCE.getRichStringMailto_Email();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_MAILTO__CONTENT = eINSTANCE.getRichStringMailto_Content();

	}

} // RichstringPackage
