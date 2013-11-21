/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage
 * @generated
 */
public interface DocumentFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentFactory eINSTANCE = org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DTO Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Document</em>'.
	 * @generated
	 */
	DTODocument createDTODocument();

	/**
	 * Returns a new object of class '<em>DTO Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Header</em>'.
	 * @generated
	 */
	DTOHeader createDTOHeader();

	/**
	 * Returns a new object of class '<em>DTO Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Details</em>'.
	 * @generated
	 */
	DTODetails createDTODetails();

	/**
	 * Returns a new object of class '<em>DTO Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Property</em>'.
	 * @generated
	 */
	DTOProperty createDTOProperty();

	/**
	 * Returns a new object of class '<em>Entity Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Document</em>'.
	 * @generated
	 */
	EntityDocument createEntityDocument();

	/**
	 * Returns a new object of class '<em>BPM Process Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPM Process Document</em>'.
	 * @generated
	 */
	BPMProcessDocument createBPMProcessDocument();

	/**
	 * Returns a new object of class '<em>BPM Task Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BPM Task Document</em>'.
	 * @generated
	 */
	BPMTaskDocument createBPMTaskDocument();

	/**
	 * Returns a new object of class '<em>Vaaclipse View Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vaaclipse View Document</em>'.
	 * @generated
	 */
	VaaclipseViewDocument createVaaclipseViewDocument();

	/**
	 * Returns a new object of class '<em>UI Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Document</em>'.
	 * @generated
	 */
	UIDocument createUIDocument();

	/**
	 * Returns a new object of class '<em>General Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Document</em>'.
	 * @generated
	 */
	GeneralDocument createGeneralDocument();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DocumentPackage getDocumentPackage();

} //DocumentFactory