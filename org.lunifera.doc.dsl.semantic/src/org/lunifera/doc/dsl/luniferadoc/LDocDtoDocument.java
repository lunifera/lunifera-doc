/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument#getDtoClass <em>Dto Class</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocDtoDocument()
 * @model
 * @generated
 */
public interface LDocDtoDocument extends LDocDocument {
	/**
	 * Returns the value of the '<em><b>Dto Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto Class</em>' attribute.
	 * @see #setDtoClass(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocDtoDocument_DtoClass()
	 * @model
	 * @generated
	 */
	String getDtoClass();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument#getDtoClass <em>Dto Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto Class</em>' attribute.
	 * @see #getDtoClass()
	 * @generated
	 */
	void setDtoClass(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocDtoDocument_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<LDocDtoProperty> getFields();

} // LDocDtoDocument
