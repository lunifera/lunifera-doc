/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Section</b></em>'. <!-- end-user-doc
 * -->
 * 
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringSection()
 * @model
 * @generated
 */
public interface RichStringSection extends RichStringMarkup {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringSection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
} // RichStringSection
