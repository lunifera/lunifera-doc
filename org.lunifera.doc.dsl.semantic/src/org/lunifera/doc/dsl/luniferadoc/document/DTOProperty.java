/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTOProperty()
 * @model
 * @generated
 */
public interface DTOProperty extends EObject {
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
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTOProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTOProperty_Description()
	 * @model containment="true"
	 * @generated
	 */
	RichString getDescription();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(RichString value);

} // DTOProperty
