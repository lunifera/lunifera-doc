/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocNamedDocument()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LDocNamedDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocNamedDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocNamedDocument_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

} // LDocNamedDocument
