/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.NamedDocument <em>Named Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.NamedDocument
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getNamedDocument()
	 * @generated
	 */
	int NAMED_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DOCUMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_DOCUMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DocumentIncludeImpl <em>Document Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.DocumentIncludeImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDocumentInclude()
	 * @generated
	 */
	int DOCUMENT_INCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INCLUDE__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INCLUDE__VAR_NAME = 1;

	/**
	 * The number of structural features of the '<em>Document Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_INCLUDE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.DocType <em>Doc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.DocType
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDocType()
	 * @generated
	 */
	int DOC_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.NamedDocument <em>Named Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.NamedDocument
	 * @generated
	 */
	EClass getNamedDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.NamedDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.NamedDocument#getName()
	 * @see #getNamedDocument()
	 * @generated
	 */
	EAttribute getNamedDocument_Name();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude <em>Document Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Include</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocumentInclude
	 * @generated
	 */
	EClass getDocumentInclude();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Include</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getInclude()
	 * @see #getDocumentInclude()
	 * @generated
	 */
	EReference getDocumentInclude_Include();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getVarName()
	 * @see #getDocumentInclude()
	 * @generated
	 */
	EAttribute getDocumentInclude_VarName();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.doc.dsl.luniferadoc.DocType <em>Doc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Doc Type</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.DocType
	 * @generated
	 */
	EEnum getDocType();

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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.NamedDocument <em>Named Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.NamedDocument
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getNamedDocument()
		 * @generated
		 */
		EClass NAMED_DOCUMENT = eINSTANCE.getNamedDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_DOCUMENT__NAME = eINSTANCE.getNamedDocument_Name();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.DocumentIncludeImpl <em>Document Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.DocumentIncludeImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDocumentInclude()
		 * @generated
		 */
		EClass DOCUMENT_INCLUDE = eINSTANCE.getDocumentInclude();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_INCLUDE__INCLUDE = eINSTANCE.getDocumentInclude_Include();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_INCLUDE__VAR_NAME = eINSTANCE.getDocumentInclude_VarName();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.DocType <em>Doc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.DocType
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocPackageImpl#getDocType()
		 * @generated
		 */
		EEnum DOC_TYPE = eINSTANCE.getDocType();

	}

} //LuniferaDocPackage
