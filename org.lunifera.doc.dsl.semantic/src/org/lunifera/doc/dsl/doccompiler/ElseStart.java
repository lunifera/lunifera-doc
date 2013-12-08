/**
 */
package org.lunifera.doc.dsl.doccompiler;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Else Start</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.ElseStart#getIfConditionStart <em>If Condition Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getElseStart()
 * @model
 * @generated
 */
public interface ElseStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>If Condition Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseStart <em>Else Start</em>}'.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>If Condition Start</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Condition Start</em>' reference.
	 * @see #setIfConditionStart(IfConditionStart)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getElseStart_IfConditionStart()
	 * @see org.lunifera.doc.dsl.doccompiler.IfConditionStart#getElseStart
	 * @model opposite="elseStart"
	 * @generated
	 */
	IfConditionStart getIfConditionStart();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ElseStart#getIfConditionStart <em>If Condition Start</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Condition Start</em>' reference.
	 * @see #getIfConditionStart()
	 * @generated
	 */
	void setIfConditionStart(IfConditionStart value);

} // ElseStart
