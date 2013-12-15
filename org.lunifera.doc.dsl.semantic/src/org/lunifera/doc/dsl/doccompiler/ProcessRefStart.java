/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Process Ref Start</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getContent <em>Content</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getProcessRefStart()
 * @model
 * @generated
 */
public interface ProcessRefStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringProcessRef)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getProcessRefStart_Content()
	 * @model
	 * @generated
	 */
	RichStringProcessRef getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getContent <em>Content</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringProcessRef value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. It is bidirectional and its opposite is '
	 * {@link org.lunifera.doc.dsl.doccompiler.ProcessRefEnd#getStart <em>Start</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ProcessRefEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getProcessRefStart_End()
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessRefEnd#getStart
	 * @model opposite="start"
	 * @generated
	 */
	ProcessRefEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ProcessRefStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ProcessRefEnd value);

} // ProcessRefStart
