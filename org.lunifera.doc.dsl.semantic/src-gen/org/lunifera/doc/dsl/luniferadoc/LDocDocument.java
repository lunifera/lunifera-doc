/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDoc Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocDocument#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocDocument()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LDocDocument extends LDocNamedDocument
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(RichString)
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocDocument_Description()
   * @model containment="true"
   * @generated
   */
  RichString getDescription();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocDocument#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(RichString value);

} // LDocDocument
