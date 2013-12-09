/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>UI Document</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.UIDocument#getUi <em>Ui</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.UIDocument#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getUIDocument()
 * @model
 * @generated
 */
public interface UIDocument extends LuniferaDocDocument {
	/**
	 * Returns the value of the '<em><b>Ui</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ui</em>' attribute.
	 * @see #setUi(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getUIDocument_Ui()
	 * @model
	 * @generated
	 */
	String getUi();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.UIDocument#getUi <em>Ui</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Ui</em>' attribute.
	 * @see #getUi()
	 * @generated
	 */
	void setUi(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(UIDescription)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getUIDocument_Description()
	 * @model containment="true"
	 * @generated
	 */
	UIDescription getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.UIDocument#getDescription
	 * <em>Description</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(UIDescription value);

} // UIDocument
