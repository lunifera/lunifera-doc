/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getEntityClass <em>Entity Class</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocEntityDocument()
 * @model
 * @generated
 */
public interface LDocEntityDocument extends LDocDocument {
	/**
	 * Returns the value of the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Class</em>' attribute.
	 * @see #setEntityClass(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocEntityDocument_EntityClass()
	 * @model
	 * @generated
	 */
	String getEntityClass();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getEntityClass <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Class</em>' attribute.
	 * @see #getEntityClass()
	 * @generated
	 */
	void setEntityClass(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocEntityDocument_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<LDocEntityField> getFields();

} // LDocEntityDocument
