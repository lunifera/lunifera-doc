/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPM Process Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getProcess <em>Process</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getBPMProcessDocument()
 * @model
 * @generated
 */
public interface BPMProcessDocument extends LuniferaDocDocument {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' attribute.
	 * @see #setProcess(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getBPMProcessDocument_Process()
	 * @model
	 * @generated
	 */
	String getProcess();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' attribute.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(BPMProcessDescription)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getBPMProcessDocument_Description()
	 * @model containment="true"
	 * @generated
	 */
	BPMProcessDescription getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(BPMProcessDescription value);

} // BPMProcessDocument
