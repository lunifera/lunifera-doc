/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String View Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A markup to reference a view
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef#getViewDoc <em>View Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringViewRef()
 * @model
 * @generated
 */
public interface RichStringViewRef extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>View Doc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Doc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Doc</em>' reference.
	 * @see #setViewDoc(LDocViewDocument)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringViewRef_ViewDoc()
	 * @model
	 * @generated
	 */
	LDocViewDocument getViewDoc();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef#getViewDoc <em>View Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Doc</em>' reference.
	 * @see #getViewDoc()
	 * @generated
	 */
	void setViewDoc(LDocViewDocument value);

} // RichStringViewRef
