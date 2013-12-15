/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.common.util.EList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>List Start</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ListStart#getContent <em>Content</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ListStart#getElements <em>Elements</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.ListStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getListStart()
 * @model
 * @generated
 */
public interface ListStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringList)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getListStart_Content()
	 * @model
	 * @generated
	 */
	RichStringList getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ListStart#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringList value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list. The list contents are of type
	 * {@link org.lunifera.doc.dsl.doccompiler.ListElementStart}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getListStart_Elements()
	 * @model
	 * @generated
	 */
	EList<ListElementStart> getElements();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ListEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getListStart_End()
	 * @model
	 * @generated
	 */
	ListEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ListStart#getEnd <em>End</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ListEnd value);

} // ListStart
