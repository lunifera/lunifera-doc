/**
 */
package org.lunifera.doc.dsl.luniferadoc.markup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage
 * @generated
 */
public interface MarkupFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MarkupFactory eINSTANCE = org.lunifera.doc.dsl.luniferadoc.markup.impl.MarkupFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tag URL</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Tag URL</em>'.
	 * @generated
	 */
	TagURL createTagURL();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	MarkupPackage getMarkupPackage();

} // MarkupFactory
