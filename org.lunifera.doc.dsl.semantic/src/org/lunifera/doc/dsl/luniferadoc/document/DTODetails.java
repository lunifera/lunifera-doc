/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.DTODetails#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODetails()
 * @model
 * @generated
 */
public interface DTODetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getDTODetails_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DTOProperty> getProperties();

} // DTODetails
