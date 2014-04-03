/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String DTO Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A markup to reference a dto document
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef#getDtoDoc <em>Dto Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringDTORef()
 * @model
 * @generated
 */
public interface RichStringDTORef extends RichStringMarkup
{
  /**
   * Returns the value of the '<em><b>Dto Doc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dto Doc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dto Doc</em>' reference.
   * @see #setDtoDoc(LDocDtoDocument)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringDTORef_DtoDoc()
   * @model
   * @generated
   */
  LDocDtoDocument getDtoDoc();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef#getDtoDoc <em>Dto Doc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dto Doc</em>' reference.
   * @see #getDtoDoc()
   * @generated
   */
  void setDtoDoc(LDocDtoDocument value);

} // RichStringDTORef