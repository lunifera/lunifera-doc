/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String Process Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef#getProcessDoc <em>Process Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LDocRichstringPackage#getRichStringProcessRef()
 * @model
 * @generated
 */
public interface RichStringProcessRef extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>Process Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Doc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Doc</em>' reference.
	 * @see #setProcessDoc(LDocBPMProcessDocument)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LDocRichstringPackage#getRichStringProcessRef_ProcessDoc()
	 * @model
	 * @generated
	 */
	LDocBPMProcessDocument getProcessDoc();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef#getProcessDoc <em>Process Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Doc</em>' reference.
	 * @see #getProcessDoc()
	 * @generated
	 */
	void setProcessDoc(LDocBPMProcessDocument value);

} // RichStringProcessRef
