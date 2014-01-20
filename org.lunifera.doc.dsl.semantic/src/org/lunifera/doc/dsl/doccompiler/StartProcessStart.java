/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Process Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.StartProcessStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.StartProcessStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getStartProcessStart()
 * @model
 * @generated
 */
public interface StartProcessStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringStartProcess)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getStartProcessStart_Content()
	 * @model
	 * @generated
	 */
	RichStringStartProcess getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.StartProcessStart#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringStartProcess value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.StartProcessEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(StartProcessEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getStartProcessStart_End()
	 * @see org.lunifera.doc.dsl.doccompiler.StartProcessEnd#getStart
	 * @model opposite="start"
	 * @generated
	 */
	StartProcessEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.StartProcessStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(StartProcessEnd value);

} // StartProcessStart
