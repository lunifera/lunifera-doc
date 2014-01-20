/**
 */
package org.lunifera.doc.dsl.doccompiler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Ref End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.UIRefEnd#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getUIRefEnd()
 * @model
 * @generated
 */
public interface UIRefEnd extends LinePart {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.UIRefStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(UIRefStart)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getUIRefEnd_Start()
	 * @see org.lunifera.doc.dsl.doccompiler.UIRefStart#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	UIRefStart getStart();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.UIRefEnd#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(UIRefStart value);

} // UIRefEnd
