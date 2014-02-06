/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Underline Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getUnderlineStart()
 * @model
 * @generated
 */
public interface UnderlineStart extends LinePart
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' reference.
   * @see #setContent(RichStringUnderline)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getUnderlineStart_Content()
   * @model
   * @generated
   */
  RichStringUnderline getContent();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineStart#getContent <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' reference.
   * @see #getContent()
   * @generated
   */
  void setContent(RichStringUnderline value);

  /**
   * Returns the value of the '<em><b>End</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' reference.
   * @see #setEnd(UnderlineEnd)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getUnderlineStart_End()
   * @model
   * @generated
   */
  UnderlineEnd getEnd();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.UnderlineStart#getEnd <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(UnderlineEnd value);

} // UnderlineStart
