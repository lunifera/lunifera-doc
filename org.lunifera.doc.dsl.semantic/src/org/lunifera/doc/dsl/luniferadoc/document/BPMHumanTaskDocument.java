/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>BPM Human Task Document</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getTask <em>Task</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getBPMHumanTaskDocument()
 * @model
 * @generated
 */
public interface BPMHumanTaskDocument extends LuniferaDocDocument {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Task</em>' attribute.
	 * @see #setTask(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getBPMHumanTaskDocument_Task()
	 * @model
	 * @generated
	 */
	String getTask();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getTask
	 * <em>Task</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Task</em>' attribute.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(BPMHumanTaskDescription)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getBPMHumanTaskDocument_Description()
	 * @model containment="true"
	 * @generated
	 */
	BPMHumanTaskDescription getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getDescription
	 * <em>Description</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(BPMHumanTaskDescription value);

} // BPMHumanTaskDocument
