/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Mailto</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getEmail <em>Email</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMailto()
 * @model
 * @generated
 */
public interface RichStringMailto extends XExpression {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMailto_Email()
	 * @model required="true"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getEmail
	 * <em>Email</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(XExpression)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMailto_Content()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto#getContent
	 * <em>Content</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(XExpression value);

} // RichStringMailto