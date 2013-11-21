/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.DTODescription#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODescription()
 * @model
 * @generated
 */
public interface DTODescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(RichString)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODescription_Content()
	 * @model containment="true"
	 * @generated
	 */
	RichString getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODescription#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichString value);

} // DTODescription
