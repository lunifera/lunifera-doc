/**
 */
package org.lunifera.doc.dsl.luniferadoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDoc BPM Process Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocBPMProcessDocument()
 * @model
 * @generated
 */
public interface LDocBPMProcessDocument extends LDocDocument {
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
	 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocBPMProcessDocument_Process()
	 * @model unique="false"
	 * @generated
	 */
	String getProcess();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument#getProcess <em>Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' attribute.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(String value);

} // LDocBPMProcessDocument
