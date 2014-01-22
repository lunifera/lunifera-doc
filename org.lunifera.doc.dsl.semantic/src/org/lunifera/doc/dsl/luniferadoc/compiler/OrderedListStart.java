/**
 */
package org.lunifera.doc.dsl.luniferadoc.compiler;

import org.eclipse.emf.common.util.EList;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOrderedList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordered List Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getElements <em>Elements</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LDocCompilerPackage#getOrderedListStart()
 * @model
 * @generated
 */
public interface OrderedListStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringOrderedList)
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LDocCompilerPackage#getOrderedListStart_Content()
	 * @model
	 * @generated
	 */
	RichStringOrderedList getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringOrderedList value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.compiler.ListElementStart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LDocCompilerPackage#getOrderedListStart_Elements()
	 * @model
	 * @generated
	 */
	EList<ListElementStart> getElements();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(OrderedListEnd)
	 * @see org.lunifera.doc.dsl.luniferadoc.compiler.LDocCompilerPackage#getOrderedListStart_End()
	 * @model
	 * @generated
	 */
	OrderedListEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.compiler.OrderedListStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(OrderedListEnd value);

} // OrderedListStart
