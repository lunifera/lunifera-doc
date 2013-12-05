/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDtoClass <em>Dto Class</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODocument()
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
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODocument_DtoClass()
	 * @model
	 * @generated
	 */
	String getDtoClass();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDtoClass <em>Dto Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto Class</em>' attribute.
	 * @see #getDtoClass()
	 * @generated
	 */
	void setDtoClass(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DTODescription)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODocument_Description()
	 * @model containment="true"
	 * @generated
	 */
	DTODescription getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DTODescription value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(DTOProperties)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODocument_Properties()
	 * @model containment="true"
	 * @generated
	 */
	DTOProperties getProperties();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(DTOProperties value);

} // DTODocument
