/**
 */
package org.lunifera.doc.dsl.luniferadoc.compiler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentEnd#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LDocCompilerPackage#getDocumentEnd()
 * @model
 * @generated
 */
public interface DocumentEnd extends LinePart {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(DocumentStart)
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LDocCompilerPackage#getDocumentEnd_Start()
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.DocumentStart#getEnd
	 * @model opposite="end"
	 * @generated
	 */
	DocumentStart getStart();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.DocumentEnd#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(DocumentStart value);

} // DocumentEnd