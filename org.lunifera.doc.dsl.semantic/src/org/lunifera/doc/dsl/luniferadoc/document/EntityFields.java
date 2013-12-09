/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Entity Fields</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.EntityFields#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getEntityFields()
 * @model
 * @generated
 */
public interface EntityFields extends EObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list. The list contents are of type
	 * {@link org.lunifera.doc.dsl.luniferadoc.document.EntityField}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getEntityFields_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityField> getFields();

} // EntityFields
