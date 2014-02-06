/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Italic Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getItalicStart()
 * @model
 * @generated
 */
public interface ItalicStart extends LinePart
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
   * @see #setContent(RichStringItalic)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getItalicStart_Content()
   * @model
   * @generated
   */
  RichStringItalic getContent();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicStart#getContent <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' reference.
   * @see #getContent()
   * @generated
   */
  void setContent(RichStringItalic value);

  /**
   * Returns the value of the '<em><b>End</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' reference.
   * @see #setEnd(ItalicEnd)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getItalicStart_End()
   * @model
   * @generated
   */
  ItalicEnd getEnd();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.ItalicStart#getEnd <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(ItalicEnd value);

} // ItalicStart
