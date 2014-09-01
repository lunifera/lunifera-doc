/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String Start Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A markup to start a process
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess#getProcessId <em>Process Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringStartProcess()
 * @model
 * @generated
 */
public interface RichStringStartProcess extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>Process Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Id</em>' attribute.
	 * @see #setProcessId(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringStartProcess_ProcessId()
	 * @model unique="false"
	 * @generated
	 */
	String getProcessId();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess#getProcessId <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Id</em>' attribute.
	 * @see #getProcessId()
	 * @generated
	 */
	void setProcessId(String value);

} // RichStringStartProcess
