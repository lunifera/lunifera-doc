/**
 */
package org.lunifera.doc.dsl.luniferadoc.markup.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.doc.dsl.luniferadoc.markup.MarkupFactory;
import org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage;
import org.lunifera.doc.dsl.luniferadoc.markup.TagURL;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MarkupFactoryImpl extends EFactoryImpl implements MarkupFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static MarkupFactory init() {
		try {
			MarkupFactory theMarkupFactory = (MarkupFactory) EPackage.Registry.INSTANCE
					.getEFactory(MarkupPackage.eNS_URI);
			if (theMarkupFactory != null) {
				return theMarkupFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MarkupFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MarkupFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MarkupPackage.TAG_URL:
			return createTagURL();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TagURL createTagURL() {
		TagURLImpl tagURL = new TagURLImpl();
		return tagURL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MarkupPackage getMarkupPackage() {
		return (MarkupPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MarkupPackage getPackage() {
		return MarkupPackage.eINSTANCE;
	}

} // MarkupFactoryImpl
