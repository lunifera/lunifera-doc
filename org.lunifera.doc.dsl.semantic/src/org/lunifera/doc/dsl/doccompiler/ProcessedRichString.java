/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processed Rich String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getRichString <em>Rich String</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getProcessedRichString()
 * @model
 * @generated
 */
public interface ProcessedRichString extends EObject {
	/**
	 * Returns the value of the '<em><b>Rich String</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rich String</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rich String</em>' reference.
	 * @see #setRichString(RichString)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getProcessedRichString_RichString()
	 * @model
	 * @generated
	 */
	RichString getRichString();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getRichString <em>Rich String</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rich String</em>' reference.
	 * @see #getRichString()
	 * @generated
	 */
	void setRichString(RichString value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.doccompiler.Line}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.Line#getRichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getProcessedRichString_Lines()
	 * @see org.lunifera.doc.dsl.doccompiler.Line#getRichString
	 * @model opposite="richString" containment="true"
	 * @generated
	 */
	EList<Line> getLines();

} // ProcessedRichString
