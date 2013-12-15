/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Task Ref</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef#getTaskDoc <em>Task Doc</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringTaskRef()
 * @model
 * @generated
 */
public interface RichStringTaskRef extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>Task Doc</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Doc</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Task Doc</em>' reference.
	 * @see #setTaskDoc(BPMHumanTaskDocument)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringTaskRef_TaskDoc()
	 * @model
	 * @generated
	 */
	BPMHumanTaskDocument getTaskDoc();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef#getTaskDoc
	 * <em>Task Doc</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Task Doc</em>' reference.
	 * @see #getTaskDoc()
	 * @generated
	 */
	void setTaskDoc(BPMHumanTaskDocument value);

} // RichStringTaskRef
