/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>View Ref Start</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ViewRefStart#getContent <em>Content</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ViewRefStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getViewRefStart()
 * @model
 * @generated
 */
public interface ViewRefStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringViewRef)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getViewRefStart_Content()
	 * @model
	 * @generated
	 */
	RichStringViewRef getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ViewRefStart#getContent <em>Content</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringViewRef value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.lunifera.doc.dsl.doccompiler.ViewRefEnd#getStart <em>Start</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ViewRefEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getViewRefStart_End()
	 * @see org.lunifera.doc.dsl.doccompiler.ViewRefEnd#getStart
	 * @model opposite="start"
	 * @generated
	 */
	ViewRefEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ViewRefStart#getEnd <em>End</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ViewRefEnd value);

} // ViewRefStart
