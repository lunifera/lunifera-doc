/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Subsection</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringSubsection()
 * @model
 * @generated
 */
public interface RichStringSubsection extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringSubsection_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSubsection#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RichStringSubsection
