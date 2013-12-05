/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.eclipse.emf.common.util.EList;
import org.lunifera.doc.dsl.luniferadoc.DocumentInclude;
import org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getGeneralDocument()
 * @model
 * @generated
 */
public interface GeneralDocument extends LuniferaDocLayout {
	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage#getGeneralDocument_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentInclude> getIncludes();

} // GeneralDocument
