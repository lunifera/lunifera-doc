/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getContainerStart()
 * @model
 * @generated
 */
public interface ContainerStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringContainer)
	 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getContainerStart_Content()
	 * @model
	 * @generated
	 */
	RichStringContainer getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerStart#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringContainer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(ContainerEnd)
	 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getContainerStart_End()
	 * @model
	 * @generated
	 */
	ContainerEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ContainerStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(ContainerEnd value);

} // ContainerStart
