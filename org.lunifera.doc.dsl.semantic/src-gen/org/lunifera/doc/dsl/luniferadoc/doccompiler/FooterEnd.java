/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Footer End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterEnd#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getFooterEnd()
 * @model
 * @generated
 */
public interface FooterEnd extends LinePart
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' reference.
   * @see #setStart(FooterStart)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getFooterEnd_Start()
   * @model
   * @generated
   */
  FooterStart getStart();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.FooterEnd#getStart <em>Start</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' reference.
   * @see #getStart()
   * @generated
   */
  void setStart(FooterStart value);

} // FooterEnd
