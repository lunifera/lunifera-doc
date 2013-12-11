/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Mailto Start</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.MailtoStart#getContent <em>Content</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.MailtoStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getMailtoStart()
 * @model
 * @generated
 */
public interface MailtoStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringMailto)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getMailtoStart_Content()
	 * @model
	 * @generated
	 */
	RichStringMailto getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.MailtoStart#getContent <em>Content</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringMailto value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.lunifera.doc.dsl.doccompiler.MailtoEnd#getStart <em>Start</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(MailtoEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getMailtoStart_End()
	 * @see org.lunifera.doc.dsl.doccompiler.MailtoEnd#getStart
	 * @model opposite="start"
	 * @generated
	 */
	MailtoEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.MailtoStart#getEnd <em>End</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(MailtoEnd value);

} // MailtoStart
