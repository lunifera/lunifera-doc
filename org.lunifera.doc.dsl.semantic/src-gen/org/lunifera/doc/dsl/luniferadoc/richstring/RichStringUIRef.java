/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String UI Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A markup to reference a UI element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef#getUiDoc <em>Ui Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringUIRef()
 * @model
 * @generated
 */
public interface RichStringUIRef extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>Ui Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Doc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Doc</em>' reference.
	 * @see #setUiDoc(LDocUIDocument)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringUIRef_UiDoc()
	 * @model
	 * @generated
	 */
	LDocUIDocument getUiDoc();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef#getUiDoc <em>Ui Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Doc</em>' reference.
	 * @see #getUiDoc()
	 * @generated
	 */
	void setUiDoc(LDocUIDocument value);

} // RichStringUIRef
