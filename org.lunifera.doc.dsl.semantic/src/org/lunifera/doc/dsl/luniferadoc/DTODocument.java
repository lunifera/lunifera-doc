/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getDtoClass <em>Dto Class</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getHeader <em>Header</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDTODocument()
 * @model
 * @generated
 */
public interface DTODocument extends LuniferaDocDocument {
	/**
	 * Returns the value of the '<em><b>Dto Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto Class</em>' attribute.
	 * @see #setDtoClass(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDTODocument_DtoClass()
	 * @model
	 * @generated
	 */
	String getDtoClass();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getDtoClass <em>Dto Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto Class</em>' attribute.
	 * @see #getDtoClass()
	 * @generated
	 */
	void setDtoClass(String value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(DTOHeader)
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDTODocument_Header()
	 * @model containment="true"
	 * @generated
	 */
	DTOHeader getHeader();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(DTOHeader value);

	/**
	 * Returns the value of the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' containment reference.
	 * @see #setDetails(DTODetails)
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDTODocument_Details()
	 * @model containment="true"
	 * @generated
	 */
	DTODetails getDetails();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.DTODocument#getDetails <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Details</em>' containment reference.
	 * @see #getDetails()
	 * @generated
	 */
	void setDetails(DTODetails value);

} // DTODocument
