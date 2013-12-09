/**
 */
package org.lunifera.doc.dsl.doccompiler;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Italic End</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ItalicEnd#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getItalicEnd()
 * @model
 * @generated
 */
public interface ItalicEnd extends LinePart {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(ItalicStart)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getItalicEnd_Start()
	 * @model
	 * @generated
	 */
	ItalicStart getStart();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ItalicEnd#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(ItalicStart value);

} // ItalicEnd
