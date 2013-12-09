/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Document Include</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getInclude <em>Include</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDocumentInclude()
 * @model
 * @generated
 */
public interface DocumentInclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Include</em>' reference.
	 * @see #setInclude(LuniferaDocDocument)
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDocumentInclude_Include()
	 * @model
	 * @generated
	 */
	LuniferaDocDocument getInclude();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getInclude <em>Include</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Include</em>' reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(LuniferaDocDocument value);

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDocumentInclude_VarName()
	 * @model required="true"
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getVarName <em>Var Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

} // DocumentInclude
