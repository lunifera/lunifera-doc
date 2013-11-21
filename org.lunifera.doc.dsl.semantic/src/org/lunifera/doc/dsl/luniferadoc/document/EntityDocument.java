/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getEntityClass <em>Entity Class</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getEntityDocument()
 * @model
 * @generated
 */
public interface EntityDocument extends LuniferaDocDocument {
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
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getEntityDocument_EntityClass()
	 * @model
	 * @generated
	 */
	String getEntityClass();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getEntityClass <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Class</em>' attribute.
	 * @see #getEntityClass()
	 * @generated
	 */
	void setEntityClass(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(EntityDescription)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getEntityDocument_Description()
	 * @model containment="true"
	 * @generated
	 */
	EntityDescription getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(EntityDescription value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference.
	 * @see #setFields(EntityFields)
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getEntityDocument_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EntityFields getFields();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getFields <em>Fields</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fields</em>' containment reference.
	 * @see #getFields()
	 * @generated
	 */
	void setFields(EntityFields value);

} // EntityDocument
