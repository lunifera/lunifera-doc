/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends LinePart {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' reference.
	 * @see #setLiteral(RichStringLiteral)
	 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getLiteral_Literal()
	 * @model
	 * @generated
	 */
	RichStringLiteral getLiteral();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal#getLiteral <em>Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(RichStringLiteral value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getLiteral_Offset()
	 * @model unique="false"
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getLiteral_Length()
	 * @model unique="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Literal#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // Literal
