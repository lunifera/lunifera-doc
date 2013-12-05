/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage
 * @generated
 */
public interface LuniferaDocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LuniferaDocFactory eINSTANCE = org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Include</em>'.
	 * @generated
	 */
	DocumentInclude createDocumentInclude();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LuniferaDocPackage getLuniferaDocPackage();

} //LuniferaDocFactory
