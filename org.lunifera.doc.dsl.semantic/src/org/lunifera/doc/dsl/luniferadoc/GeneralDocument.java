/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.GeneralDocument#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getGeneralDocument()
 * @model
 * @generated
 */
public interface GeneralDocument extends DocLayout {

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getGeneralDocument_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentInclude> getIncludes();
} // GeneralDocument
