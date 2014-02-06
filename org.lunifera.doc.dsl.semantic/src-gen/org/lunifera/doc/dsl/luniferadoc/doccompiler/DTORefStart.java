/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTO Ref Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getDTORefStart()
 * @model
 * @generated
 */
public interface DTORefStart extends LinePart
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
   * @see #setContent(RichStringDTORef)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getDTORefStart_Content()
   * @model
   * @generated
   */
  RichStringDTORef getContent();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefStart#getContent <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' reference.
   * @see #getContent()
   * @generated
   */
  void setContent(RichStringDTORef value);

  /**
   * Returns the value of the '<em><b>End</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' reference.
   * @see #setEnd(DTORefEnd)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getDTORefStart_End()
   * @model
   * @generated
   */
  DTORefEnd getEnd();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.DTORefStart#getEnd <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(DTORefEnd value);

} // DTORefStart
