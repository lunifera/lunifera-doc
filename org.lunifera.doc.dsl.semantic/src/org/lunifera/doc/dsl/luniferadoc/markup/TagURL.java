/**
 */
package org.lunifera.doc.dsl.luniferadoc.markup;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Tag URL</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.markup.TagURL#getUrl <em>Url</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.markup.TagURL#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage#getTagURL()
 * @model
 * @generated
 */
public interface TagURL extends EObject {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage#getTagURL_Url()
	 * @model required="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.markup.TagURL#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(RichString)
	 * @see org.lunifera.doc.dsl.luniferadoc.markup.MarkupPackage#getTagURL_Text()
	 * @model containment="true"
	 * @generated
	 */
	RichString getText();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.markup.TagURL#getText <em>Text</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(RichString value);

} // TagURL
