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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP__ID = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP__CLASS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rich String Markup</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MARKUP_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_EXAMPLE__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_EXAMPLE__CLASS = RICH_STRING_MARKUP__CLASS;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H1__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H1__CLASS = RICH_STRING_MARKUP__CLASS;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H2__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_H2__CLASS = RICH_STRING_MARKUP__CLASS;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringChapterImpl
	 * <em>Rich String Chapter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringChapterImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringChapter()
	 * @generated
	 */
	int RICH_STRING_CHAPTER = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_CHAPTER__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_CHAPTER__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_CHAPTER__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Chapter</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_CHAPTER_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSectionImpl
	 * <em>Rich String Section</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSectionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringSection()
	 * @generated
	 */
	int RICH_STRING_SECTION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SECTION__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SECTION__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SECTION__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Section</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SECTION_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSubsectionImpl
	 * <em>Rich String Subsection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSubsectionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringSubsection()
	 * @generated
	 */
	int RICH_STRING_SUBSECTION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SUBSECTION__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SUBSECTION__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SUBSECTION__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Subsection</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SUBSECTION_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringURLImpl
	 * <em>Rich String URL</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringURLImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringURL()
	 * @generated
	 */
	int RICH_STRING_URL = 12;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringRefImpl
	 * <em>Rich String Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringRefImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringRef()
	 * @generated
	 */
	int RICH_STRING_REF = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_REF__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_REF__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_REF__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_REF__REF_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Ref</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_REF_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoldImpl
	 * <em>Rich String Bold</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringBoldImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringBold()
	 * @generated
	 */
	int RICH_STRING_BOLD = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_BOLD__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_BOLD__CLASS = RICH_STRING_MARKUP__CLASS;

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
	int RICH_STRING_UNDERLINE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UNDERLINE__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UNDERLINE__CLASS = RICH_STRING_MARKUP__CLASS;

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
	int RICH_STRING_ITALIC = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ITALIC__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ITALIC__CLASS = RICH_STRING_MARKUP__CLASS;

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
	int RICH_STRING_IMG = 17;

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
	int RICH_STRING_MAILTO = 18;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSkypeImpl
	 * <em>Rich String Skype</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSkypeImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringSkype()
	 * @generated
	 */
	int RICH_STRING_SKYPE = 19;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SKYPE__TARGET = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SKYPE__CONTENT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rich String Skype</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_SKYPE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMovieImpl
	 * <em>Rich String Movie</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMovieImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringMovie()
	 * @generated
	 */
	int RICH_STRING_MOVIE = 20;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MOVIE__SRC = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MOVIE__WIDTH = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MOVIE__HEIGHT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MOVIE__TYPE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MOVIE__CONTENT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rich String Movie</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_MOVIE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringCodeImpl
	 * <em>Rich String Code</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringCodeImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringCode()
	 * @generated
	 */
	int RICH_STRING_CODE = 21;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_CODE__LANG = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_CODE__CONTENT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rich String Code</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_CODE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableImpl
	 * <em>Rich String Table</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTable()
	 * @generated
	 */
	int RICH_STRING_TABLE = 22;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE__ROWS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Table</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableRowImpl
	 * <em>Rich String Table Row</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableRowImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTableRow()
	 * @generated
	 */
	int RICH_STRING_TABLE_ROW = 23;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE_ROW__COLUMNS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Table Row</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE_ROW_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableDataImpl
	 * <em>Rich String Table Data</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableDataImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTableData()
	 * @generated
	 */
	int RICH_STRING_TABLE_DATA = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE_DATA__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE_DATA__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE_DATA__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Rich String Table Data</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TABLE_DATA_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringOpenViewImpl
	 * <em>Rich String Open View</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringOpenViewImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringOpenView()
	 * @generated
	 */
	int RICH_STRING_OPEN_VIEW = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_OPEN_VIEW__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_OPEN_VIEW__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_OPEN_VIEW__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>View Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_OPEN_VIEW__VIEW_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Open View</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_OPEN_VIEW_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringStartProcessImpl
	 * <em>Rich String Start Process</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringStartProcessImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringStartProcess()
	 * @generated
	 */
	int RICH_STRING_START_PROCESS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_START_PROCESS__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_START_PROCESS__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_START_PROCESS__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Process Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_START_PROCESS__PROCESS_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Start Process</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_START_PROCESS_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringEntityRefImpl
	 * <em>Rich String Entity Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringEntityRefImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringEntityRef()
	 * @generated
	 */
	int RICH_STRING_ENTITY_REF = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ENTITY_REF__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ENTITY_REF__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ENTITY_REF__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ENTITY_REF__REF_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Entity Ref</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ENTITY_REF_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringDTORefImpl
	 * <em>Rich String DTO Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringDTORefImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringDTORef()
	 * @generated
	 */
	int RICH_STRING_DTO_REF = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_DTO_REF__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_DTO_REF__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_DTO_REF__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_DTO_REF__REF_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String DTO Ref</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_DTO_REF_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringProcessRefImpl
	 * <em>Rich String Process Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringProcessRefImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringProcessRef()
	 * @generated
	 */
	int RICH_STRING_PROCESS_REF = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_PROCESS_REF__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_PROCESS_REF__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_PROCESS_REF__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_PROCESS_REF__REF_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Process Ref</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_PROCESS_REF_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTaskRefImpl
	 * <em>Rich String Task Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTaskRefImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTaskRef()
	 * @generated
	 */
	int RICH_STRING_TASK_REF = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TASK_REF__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TASK_REF__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TASK_REF__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TASK_REF__REF_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String Task Ref</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_TASK_REF_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringViewRefImpl
	 * <em>Rich String View Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringViewRefImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringViewRef()
	 * @generated
	 */
	int RICH_STRING_VIEW_REF = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_VIEW_REF__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_VIEW_REF__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_VIEW_REF__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_VIEW_REF__REF_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String View Ref</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_VIEW_REF_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUIRefImpl
	 * <em>Rich String UI Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUIRefImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringUIRef()
	 * @generated
	 */
	int RICH_STRING_UI_REF = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UI_REF__ID = RICH_STRING_MARKUP__ID;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UI_REF__CLASS = RICH_STRING_MARKUP__CLASS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UI_REF__EXPRESSION = RICH_STRING_MARKUP__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UI_REF__REF_ID = RICH_STRING_MARKUP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rich String UI Ref</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_UI_REF_FEATURE_COUNT = RICH_STRING_MARKUP_FEATURE_COUNT + 1;

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
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getId <em>Id</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getId()
	 * @see #getRichStringMarkup()
	 * @generated
	 */
	EAttribute getRichStringMarkup_Id();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getClass_ <em>Class</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getClass_()
	 * @see #getRichStringMarkup()
	 * @generated
	 */
	EAttribute getRichStringMarkup_Class();

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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter
	 * <em>Rich String Chapter</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Chapter</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringChapter
	 * @generated
	 */
	EClass getRichStringChapter();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection
	 * <em>Rich String Section</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Section</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection
	 * @generated
	 */
	EClass getRichStringSection();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection
	 * <em>Rich String Subsection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Subsection</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection
	 * @generated
	 */
	EClass getRichStringSubsection();

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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef
	 * <em>Rich String Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Ref</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef
	 * @generated
	 */
	EClass getRichStringRef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef#getRefId <em>Ref Id</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef#getRefId()
	 * @see #getRichStringRef()
	 * @generated
	 */
	EAttribute getRichStringRef_RefId();

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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype
	 * <em>Rich String Skype</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Skype</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype
	 * @generated
	 */
	EClass getRichStringSkype();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype#getTarget <em>Target</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype#getTarget()
	 * @see #getRichStringSkype()
	 * @generated
	 */
	EAttribute getRichStringSkype_Target();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype#getContent <em>Content</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype#getContent()
	 * @see #getRichStringSkype()
	 * @generated
	 */
	EReference getRichStringSkype_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie
	 * <em>Rich String Movie</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Movie</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie
	 * @generated
	 */
	EClass getRichStringMovie();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getSrc <em>Src</em>}'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getSrc()
	 * @see #getRichStringMovie()
	 * @generated
	 */
	EAttribute getRichStringMovie_Src();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getWidth <em>Width</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getWidth()
	 * @see #getRichStringMovie()
	 * @generated
	 */
	EAttribute getRichStringMovie_Width();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getHeight <em>Height</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getHeight()
	 * @see #getRichStringMovie()
	 * @generated
	 */
	EAttribute getRichStringMovie_Height();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getType <em>Type</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getType()
	 * @see #getRichStringMovie()
	 * @generated
	 */
	EAttribute getRichStringMovie_Type();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getContent <em>Content</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getContent()
	 * @see #getRichStringMovie()
	 * @generated
	 */
	EReference getRichStringMovie_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode
	 * <em>Rich String Code</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Code</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode
	 * @generated
	 */
	EClass getRichStringCode();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getLang <em>Lang</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getLang()
	 * @see #getRichStringCode()
	 * @generated
	 */
	EAttribute getRichStringCode_Lang();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getContent <em>Content</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getContent()
	 * @see #getRichStringCode()
	 * @generated
	 */
	EReference getRichStringCode_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable
	 * <em>Rich String Table</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Table</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable
	 * @generated
	 */
	EClass getRichStringTable();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable#getRows <em>Rows</em>}'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable#getRows()
	 * @see #getRichStringTable()
	 * @generated
	 */
	EReference getRichStringTable_Rows();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow
	 * <em>Rich String Table Row</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Table Row</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow
	 * @generated
	 */
	EClass getRichStringTableRow();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow#getColumns <em>Columns</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow#getColumns()
	 * @see #getRichStringTableRow()
	 * @generated
	 */
	EReference getRichStringTableRow_Columns();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData
	 * <em>Rich String Table Data</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Table Data</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData
	 * @generated
	 */
	EClass getRichStringTableData();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView
	 * <em>Rich String Open View</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Open View</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView
	 * @generated
	 */
	EClass getRichStringOpenView();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView#getViewId <em>View Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>View Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView#getViewId()
	 * @see #getRichStringOpenView()
	 * @generated
	 */
	EAttribute getRichStringOpenView_ViewId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess
	 * <em>Rich String Start Process</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Start Process</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess
	 * @generated
	 */
	EClass getRichStringStartProcess();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess#getProcessId <em>Process Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Process Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess#getProcessId()
	 * @see #getRichStringStartProcess()
	 * @generated
	 */
	EAttribute getRichStringStartProcess_ProcessId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef
	 * <em>Rich String Entity Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Entity Ref</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef
	 * @generated
	 */
	EClass getRichStringEntityRef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef#getRefId <em>Ref Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef#getRefId()
	 * @see #getRichStringEntityRef()
	 * @generated
	 */
	EAttribute getRichStringEntityRef_RefId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef
	 * <em>Rich String DTO Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String DTO Ref</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef
	 * @generated
	 */
	EClass getRichStringDTORef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef#getRefId <em>Ref Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef#getRefId()
	 * @see #getRichStringDTORef()
	 * @generated
	 */
	EAttribute getRichStringDTORef_RefId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef
	 * <em>Rich String Process Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Process Ref</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef
	 * @generated
	 */
	EClass getRichStringProcessRef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef#getRefId <em>Ref Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef#getRefId()
	 * @see #getRichStringProcessRef()
	 * @generated
	 */
	EAttribute getRichStringProcessRef_RefId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef
	 * <em>Rich String Task Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String Task Ref</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef
	 * @generated
	 */
	EClass getRichStringTaskRef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef#getRefId <em>Ref Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef#getRefId()
	 * @see #getRichStringTaskRef()
	 * @generated
	 */
	EAttribute getRichStringTaskRef_RefId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef
	 * <em>Rich String View Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String View Ref</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef
	 * @generated
	 */
	EClass getRichStringViewRef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef#getRefId <em>Ref Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef#getRefId()
	 * @see #getRichStringViewRef()
	 * @generated
	 */
	EAttribute getRichStringViewRef_RefId();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef
	 * <em>Rich String UI Ref</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Rich String UI Ref</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef
	 * @generated
	 */
	EClass getRichStringUIRef();

	/**
	 * Returns the meta object for the attribute '
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef#getRefId <em>Ref Id</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef#getRefId()
	 * @see #getRichStringUIRef()
	 * @generated
	 */
	EAttribute getRichStringUIRef_RefId();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_MARKUP__ID = eINSTANCE.getRichStringMarkup_Id();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_MARKUP__CLASS = eINSTANCE.getRichStringMarkup_Class();

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
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringChapterImpl <em>Rich String Chapter</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringChapterImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringChapter()
		 * @generated
		 */
		EClass RICH_STRING_CHAPTER = eINSTANCE.getRichStringChapter();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSectionImpl <em>Rich String Section</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSectionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringSection()
		 * @generated
		 */
		EClass RICH_STRING_SECTION = eINSTANCE.getRichStringSection();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSubsectionImpl
		 * <em>Rich String Subsection</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSubsectionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringSubsection()
		 * @generated
		 */
		EClass RICH_STRING_SUBSECTION = eINSTANCE.getRichStringSubsection();

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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringRefImpl
		 * <em>Rich String Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringRefImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringRef()
		 * @generated
		 */
		EClass RICH_STRING_REF = eINSTANCE.getRichStringRef();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_REF__REF_ID = eINSTANCE.getRichStringRef_RefId();

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

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSkypeImpl
		 * <em>Rich String Skype</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringSkypeImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringSkype()
		 * @generated
		 */
		EClass RICH_STRING_SKYPE = eINSTANCE.getRichStringSkype();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_SKYPE__TARGET = eINSTANCE.getRichStringSkype_Target();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_SKYPE__CONTENT = eINSTANCE.getRichStringSkype_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMovieImpl
		 * <em>Rich String Movie</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMovieImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringMovie()
		 * @generated
		 */
		EClass RICH_STRING_MOVIE = eINSTANCE.getRichStringMovie();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_MOVIE__SRC = eINSTANCE.getRichStringMovie_Src();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_MOVIE__WIDTH = eINSTANCE.getRichStringMovie_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_MOVIE__HEIGHT = eINSTANCE.getRichStringMovie_Height();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_MOVIE__TYPE = eINSTANCE.getRichStringMovie_Type();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_MOVIE__CONTENT = eINSTANCE.getRichStringMovie_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringCodeImpl
		 * <em>Rich String Code</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringCodeImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringCode()
		 * @generated
		 */
		EClass RICH_STRING_CODE = eINSTANCE.getRichStringCode();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_CODE__LANG = eINSTANCE.getRichStringCode_Lang();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_CODE__CONTENT = eINSTANCE.getRichStringCode_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableImpl
		 * <em>Rich String Table</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTable()
		 * @generated
		 */
		EClass RICH_STRING_TABLE = eINSTANCE.getRichStringTable();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_TABLE__ROWS = eINSTANCE.getRichStringTable_Rows();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableRowImpl
		 * <em>Rich String Table Row</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableRowImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTableRow()
		 * @generated
		 */
		EClass RICH_STRING_TABLE_ROW = eINSTANCE.getRichStringTableRow();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference RICH_STRING_TABLE_ROW__COLUMNS = eINSTANCE.getRichStringTableRow_Columns();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableDataImpl
		 * <em>Rich String Table Data</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableDataImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTableData()
		 * @generated
		 */
		EClass RICH_STRING_TABLE_DATA = eINSTANCE.getRichStringTableData();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringOpenViewImpl
		 * <em>Rich String Open View</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringOpenViewImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringOpenView()
		 * @generated
		 */
		EClass RICH_STRING_OPEN_VIEW = eINSTANCE.getRichStringOpenView();

		/**
		 * The meta object literal for the '<em><b>View Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_OPEN_VIEW__VIEW_ID = eINSTANCE.getRichStringOpenView_ViewId();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringStartProcessImpl
		 * <em>Rich String Start Process</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringStartProcessImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringStartProcess()
		 * @generated
		 */
		EClass RICH_STRING_START_PROCESS = eINSTANCE.getRichStringStartProcess();

		/**
		 * The meta object literal for the '<em><b>Process Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_START_PROCESS__PROCESS_ID = eINSTANCE
				.getRichStringStartProcess_ProcessId();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringEntityRefImpl
		 * <em>Rich String Entity Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringEntityRefImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringEntityRef()
		 * @generated
		 */
		EClass RICH_STRING_ENTITY_REF = eINSTANCE.getRichStringEntityRef();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_ENTITY_REF__REF_ID = eINSTANCE.getRichStringEntityRef_RefId();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringDTORefImpl <em>Rich String DTO Ref</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringDTORefImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringDTORef()
		 * @generated
		 */
		EClass RICH_STRING_DTO_REF = eINSTANCE.getRichStringDTORef();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_DTO_REF__REF_ID = eINSTANCE.getRichStringDTORef_RefId();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringProcessRefImpl
		 * <em>Rich String Process Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringProcessRefImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringProcessRef()
		 * @generated
		 */
		EClass RICH_STRING_PROCESS_REF = eINSTANCE.getRichStringProcessRef();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_PROCESS_REF__REF_ID = eINSTANCE.getRichStringProcessRef_RefId();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTaskRefImpl <em>Rich String Task Ref</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTaskRefImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringTaskRef()
		 * @generated
		 */
		EClass RICH_STRING_TASK_REF = eINSTANCE.getRichStringTaskRef();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_TASK_REF__REF_ID = eINSTANCE.getRichStringTaskRef_RefId();

		/**
		 * The meta object literal for the '
		 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringViewRefImpl <em>Rich String View Ref</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringViewRefImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringViewRef()
		 * @generated
		 */
		EClass RICH_STRING_VIEW_REF = eINSTANCE.getRichStringViewRef();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_VIEW_REF__REF_ID = eINSTANCE.getRichStringViewRef_RefId();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUIRefImpl
		 * <em>Rich String UI Ref</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUIRefImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichstringPackageImpl#getRichStringUIRef()
		 * @generated
		 */
		EClass RICH_STRING_UI_REF = eINSTANCE.getRichStringUIRef();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute RICH_STRING_UI_REF__REF_ID = eINSTANCE.getRichStringUIRef_RefId();

	}

} // RichstringPackage
