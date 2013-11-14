/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.Line#getParts <em>Parts</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.Line#getRichString <em>Rich String</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.doccompiler.LinePart}.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.LinePart#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getLine_Parts()
	 * @see org.lunifera.doc.dsl.doccompiler.LinePart#getLine
	 * @model opposite="line" containment="true"
	 * @generated
	 */
	EList<LinePart> getParts();

	/**
	 * Returns the value of the '<em><b>Rich String</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rich String</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rich String</em>' container reference.
	 * @see #setRichString(ProcessedRichString)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getLine_RichString()
	 * @see org.lunifera.doc.dsl.doccompiler.ProcessedRichString#getLines
	 * @model opposite="lines" transient="false"
	 * @generated
	 */
	ProcessedRichString getRichString();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.Line#getRichString <em>Rich String</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rich String</em>' container reference.
	 * @see #getRichString()
	 * @generated
	 */
	void setRichString(ProcessedRichString value);

} // Line
