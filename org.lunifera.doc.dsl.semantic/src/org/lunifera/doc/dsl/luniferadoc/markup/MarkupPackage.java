/**
 */
package org.lunifera.doc.dsl.luniferadoc.markup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.lunifera.doc.dsl.luniferadoc.markup.MarkupFactory
 * @model kind="package"
 * @generated
 */
public interface MarkupPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "markup";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/luniferadoc/markup";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "markup";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	MarkupPackage eINSTANCE = org.lunifera.doc.dsl.luniferadoc.markup.impl.MarkupPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.markup.impl.TagImgImpl <em>Tag Img</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.markup.impl.TagImgImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.markup.impl.MarkupPackageImpl#getTagImg()
	 * @generated
	 */
	int TAG_IMG = 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TAG_IMG__SRC = 0;

	/**
	 * The number of structural features of the '<em>Tag Img</em>' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TAG_IMG_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.markup.TagImg <em>Tag Img</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Tag Img</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.markup.TagImg
	 * @generated
	 */
	EClass getTagImg();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.markup.TagImg#getSrc
	 * <em>Src</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.markup.TagImg#getSrc()
	 * @see #getTagImg()
	 * @generated
	 */
	EAttribute getTagImg_Src();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MarkupFactory getMarkupFactory();

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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.markup.impl.TagImgImpl
		 * <em>Tag Img</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.markup.impl.TagImgImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.markup.impl.MarkupPackageImpl#getTagImg()
		 * @generated
		 */
		EClass TAG_IMG = eINSTANCE.getTagImg();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TAG_IMG__SRC = eINSTANCE.getTagImg_Src();

	}

} // MarkupPackage
