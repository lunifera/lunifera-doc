/**
 */
package org.lunifera.doc.dsl.doccompiler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.ExampleEnd#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getExampleEnd()
 * @model
 * @generated
 */
public interface ExampleEnd extends LinePart {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.ExampleStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ExampleStart)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getExampleEnd_Start()
	 * @see org.lunifera.doc.dsl.doccompiler.ExampleStart#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	ExampleStart getStart();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ExampleEnd#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ExampleStart value);

} // ExampleEnd
