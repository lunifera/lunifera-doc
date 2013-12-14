/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Markup</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getId <em>Id</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getClass_ <em>Class</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMarkup()
 * @model
 * @generated
 */
public interface RichStringMarkup extends XExpression {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMarkup_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMarkup_Class()
	 * @model
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getClass_
	 * <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(XExpression)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMarkup_Expression()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getExpression();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getExpression
	 * <em>Expression</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(XExpression value);

} // RichStringMarkup
