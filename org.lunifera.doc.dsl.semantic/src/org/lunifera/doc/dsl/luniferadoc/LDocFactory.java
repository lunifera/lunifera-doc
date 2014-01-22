/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage
 * @generated
 */
public interface LDocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDocFactory eINSTANCE = org.lunifera.doc.dsl.luniferadoc.impl.LDocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include</em>'.
	 * @generated
	 */
	LDocInclude createLDocInclude();

	/**
	 * Returns a new object of class '<em>Entity Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Document</em>'.
	 * @generated
	 */
	LDocEntityDocument createLDocEntityDocument();

	/**
	 * Returns a new object of class '<em>Entity Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Field</em>'.
	 * @generated
	 */
	LDocEntityField createLDocEntityField();

	/**
	 * Returns a new object of class '<em>Dto Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Document</em>'.
	 * @generated
	 */
	LDocDtoDocument createLDocDtoDocument();

	/**
	 * Returns a new object of class '<em>Dto Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Property</em>'.
	 * @generated
	 */
	LDocDtoProperty createLDocDtoProperty();

	/**
	 * Returns a new object of class '<em>BPM Process Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPM Process Document</em>'.
	 * @generated
	 */
	LDocBPMProcessDocument createLDocBPMProcessDocument();

	/**
	 * Returns a new object of class '<em>Human Task Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Human Task Document</em>'.
	 * @generated
	 */
	LDocHumanTaskDocument createLDocHumanTaskDocument();

	/**
	 * Returns a new object of class '<em>View Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Document</em>'.
	 * @generated
	 */
	LDocViewDocument createLDocViewDocument();

	/**
	 * Returns a new object of class '<em>Ui Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Document</em>'.
	 * @generated
	 */
	LDocUiDocument createLDocUiDocument();

	/**
	 * Returns a new object of class '<em>Layouter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layouter</em>'.
	 * @generated
	 */
	LDocLayouter createLDocLayouter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LDocPackage getLDocPackage();

} //LDocFactory
