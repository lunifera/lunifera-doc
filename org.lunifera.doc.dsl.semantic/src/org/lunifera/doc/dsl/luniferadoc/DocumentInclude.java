/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getInclude <em>Include</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDocumentInclude()
 * @model
 * @generated
 */
public interface DocumentInclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDocumentInclude_Include()
	 * @model required="true"
	 * @generated
	 */
	String getInclude();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' attribute.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(String value);

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage#getDocumentInclude_VarName()
	 * @model required="true"
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.DocumentInclude#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

} // DocumentInclude
