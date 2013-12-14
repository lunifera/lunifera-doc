/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Movie</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getSrc <em>Src</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getWidth <em>Width</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getHeight <em>Height</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getType <em>Type</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMovie()
 * @model
 * @generated
 */
public interface RichStringMovie extends XExpression {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMovie_Src()
	 * @model required="true"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getSrc <em>Src</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMovie_Width()
	 * @model required="true"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getWidth
	 * <em>Width</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMovie_Height()
	 * @model required="true"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getHeight
	 * <em>Height</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMovie_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getType <em>Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringMovie_Content()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMovie#getContent
	 * <em>Content</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(XExpression value);

} // RichStringMovie
