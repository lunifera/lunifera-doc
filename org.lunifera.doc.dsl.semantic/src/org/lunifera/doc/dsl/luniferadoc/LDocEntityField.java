/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

import org.lunifera.dsl.semantic.common.types.LFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDoc Entity Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getTypeField <em>Type Field</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocEntityField()
 * @model
 * @generated
 */
public interface LDocEntityField extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Field</em>' reference.
	 * @see #setTypeField(LFeature)
	 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocEntityField_TypeField()
	 * @model
	 * @generated
	 */
	LFeature getTypeField();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getTypeField <em>Type Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Field</em>' reference.
	 * @see #getTypeField()
	 * @generated
	 */
	void setTypeField(LFeature value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(RichString)
	 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocEntityField_Description()
	 * @model containment="true"
	 * @generated
	 */
	RichString getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(RichString value);

} // LDocEntityField
