/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getDocument <em>Document</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#isProvided <em>Provided</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedType <em>Provided Type</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedJVMType <em>Provided JVM Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocInclude()
 * @model
 * @generated
 */
public interface LDocInclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(LDocDocument)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocInclude_Document()
	 * @model
	 * @generated
	 */
	LDocDocument getDocument();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(LDocDocument value);

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
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocInclude_VarName()
	 * @model required="true"
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided</em>' attribute.
	 * @see #setProvided(boolean)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocInclude_Provided()
	 * @model
	 * @generated
	 */
	boolean isProvided();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#isProvided <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided</em>' attribute.
	 * @see #isProvided()
	 * @generated
	 */
	void setProvided(boolean value);

	/**
	 * Returns the value of the '<em><b>Provided Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.lunifera.doc.dsl.luniferadoc.LDocType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Type</em>' attribute.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocType
	 * @see #setProvidedType(LDocType)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocInclude_ProvidedType()
	 * @model
	 * @generated
	 */
	LDocType getProvidedType();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedType <em>Provided Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Type</em>' attribute.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocType
	 * @see #getProvidedType()
	 * @generated
	 */
	void setProvidedType(LDocType value);

	/**
	 * Returns the value of the '<em><b>Provided JVM Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided JVM Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided JVM Type</em>' containment reference.
	 * @see #setProvidedJVMType(JvmTypeReference)
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage#getLDocInclude_ProvidedJVMType()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getProvidedJVMType();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedJVMType <em>Provided JVM Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided JVM Type</em>' containment reference.
	 * @see #getProvidedJVMType()
	 * @generated
	 */
	void setProvidedJVMType(JvmTypeReference value);

} // LDocInclude
