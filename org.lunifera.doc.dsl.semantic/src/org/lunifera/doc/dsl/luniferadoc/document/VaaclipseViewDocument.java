/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vaaclipse View Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument#getView <em>View</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getVaaclipseViewDocument()
 * @model
 * @generated
 */
public interface VaaclipseViewDocument extends LuniferaDocDocument {
	/**
	 * Returns the value of the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View</em>' attribute.
	 * @see #setView(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getVaaclipseViewDocument_View()
	 * @model
	 * @generated
	 */
	String getView();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument#getView <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View</em>' attribute.
	 * @see #getView()
	 * @generated
	 */
	void setView(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(VaaclipseViewDescription)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getVaaclipseViewDocument_Description()
	 * @model containment="true"
	 * @generated
	 */
	VaaclipseViewDescription getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(VaaclipseViewDescription value);

} // VaaclipseViewDocument
