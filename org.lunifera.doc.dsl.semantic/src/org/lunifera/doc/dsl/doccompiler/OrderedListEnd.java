/**
 */
package org.lunifera.doc.dsl.doccompiler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered List End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.OrderedListEnd#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getOrderedListEnd()
 * @model
 * @generated
 */
public interface OrderedListEnd extends LinePart {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(OrderedListStart)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getOrderedListEnd_Start()
	 * @model
	 * @generated
	 */
	OrderedListStart getStart();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.OrderedListEnd#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(OrderedListStart value);

} // OrderedListEnd
