/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Img Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.ImgStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.ImgStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getImgStart()
 * @model
 * @generated
 */
public interface ImgStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringImg)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getImgStart_Content()
	 * @model
	 * @generated
	 */
	RichStringImg getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ImgStart#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringImg value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.ImgEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ImgEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getImgStart_End()
	 * @see org.lunifera.doc.dsl.doccompiler.ImgEnd#getStart
	 * @model opposite="start"
	 * @generated
	 */
	ImgEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ImgStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ImgEnd value);

} // ImgStart
