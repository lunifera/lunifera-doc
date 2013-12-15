/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Entity Ref</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef#getEntityDoc <em>Entity Doc</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringEntityRef()
 * @model
 * @generated
 */
public interface RichStringEntityRef extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>Entity Doc</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Doc</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity Doc</em>' reference.
	 * @see #setEntityDoc(EntityDocument)
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringEntityRef_EntityDoc()
	 * @model
	 * @generated
	 */
	EntityDocument getEntityDoc();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef#getEntityDoc
	 * <em>Entity Doc</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Doc</em>' reference.
	 * @see #getEntityDoc()
	 * @generated
	 */
	void setEntityDoc(EntityDocument value);

} // RichStringEntityRef
