/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage
 * @generated
 */
public interface LunDocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LunDocFactory eINSTANCE = org.lunifera.doc.dsl.luniferadoc.impl.LunDocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LDoc Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc Include</em>'.
	 * @generated
	 */
	LDocInclude createLDocInclude();

	/**
	 * Returns a new object of class '<em>LDoc Entity Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc Entity Document</em>'.
	 * @generated
	 */
	LDocEntityDocument createLDocEntityDocument();

	/**
	 * Returns a new object of class '<em>LDoc Entity Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc Entity Field</em>'.
	 * @generated
	 */
	LDocEntityField createLDocEntityField();

	/**
	 * Returns a new object of class '<em>LDoc Dto Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc Dto Document</em>'.
	 * @generated
	 */
	LDocDtoDocument createLDocDtoDocument();

	/**
	 * Returns a new object of class '<em>LDoc Dto Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc Dto Property</em>'.
	 * @generated
	 */
	LDocDtoProperty createLDocDtoProperty();

	/**
	 * Returns a new object of class '<em>LDoc BPM Process Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc BPM Process Document</em>'.
	 * @generated
	 */
	LDocBPMProcessDocument createLDocBPMProcessDocument();

	/**
	 * Returns a new object of class '<em>LDoc Human Task Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc Human Task Document</em>'.
	 * @generated
	 */
	LDocHumanTaskDocument createLDocHumanTaskDocument();

	/**
	 * Returns a new object of class '<em>LDoc View Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc View Document</em>'.
	 * @generated
	 */
	LDocViewDocument createLDocViewDocument();

	/**
	 * Returns a new object of class '<em>LDoc UI Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc UI Document</em>'.
	 * @generated
	 */
	LDocUIDocument createLDocUIDocument();

	/**
	 * Returns a new object of class '<em>LDoc Layouter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDoc Layouter</em>'.
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
	LunDocPackage getLunDocPackage();

} //LunDocFactory
