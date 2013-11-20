/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.Markup#getMarkup <em>Markup</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getMarkup()
 * @model
 * @generated
 */
public interface Markup extends LinePart {
	/**
	 * Returns the value of the '<em><b>Markup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Markup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Markup</em>' reference.
	 * @see #setMarkup(RichStringMarkup)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getMarkup_Markup()
	 * @model
	 * @generated
	 */
	RichStringMarkup getMarkup();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.Markup#getMarkup <em>Markup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markup</em>' reference.
	 * @see #getMarkup()
	 * @generated
	 */
	void setMarkup(RichStringMarkup value);

} // Markup
