/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>H1 Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.H1Start#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.H1Start#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getH1Start()
 * @model
 * @generated
 */
public interface H1Start extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringH1)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getH1Start_Content()
	 * @model
	 * @generated
	 */
	RichStringH1 getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.H1Start#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringH1 value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.H1End#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(H1End)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getH1Start_End()
	 * @see org.lunifera.doc.dsl.doccompiler.H1End#getStart
	 * @model opposite="start"
	 * @generated
	 */
	H1End getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.H1Start#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(H1End value);

} // H1Start
