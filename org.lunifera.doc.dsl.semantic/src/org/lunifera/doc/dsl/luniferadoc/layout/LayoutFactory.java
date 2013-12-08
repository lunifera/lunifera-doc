/**
 */
package org.lunifera.doc.dsl.luniferadoc.layout;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage
 * @generated
 */
public interface LayoutFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LayoutFactory eINSTANCE = org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Entity Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Layout</em>'.
	 * @generated
	 */
	EntityLayout createEntityLayout();

	/**
	 * Returns a new object of class '<em>DTO Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Layout</em>'.
	 * @generated
	 */
	DTOLayout createDTOLayout();

	/**
	 * Returns a new object of class '<em>BPM Process Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPM Process Layout</em>'.
	 * @generated
	 */
	BPMProcessLayout createBPMProcessLayout();

	/**
	 * Returns a new object of class '<em>BPM Human Task Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPM Human Task Layout</em>'.
	 * @generated
	 */
	BPMHumanTaskLayout createBPMHumanTaskLayout();

	/**
	 * Returns a new object of class '<em>Vaaclipse View Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vaaclipse View Layout</em>'.
	 * @generated
	 */
	VaaclipseViewLayout createVaaclipseViewLayout();

	/**
	 * Returns a new object of class '<em>UI Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Layout</em>'.
	 * @generated
	 */
	UILayout createUILayout();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LayoutPackage getLayoutPackage();

} //LayoutFactory
