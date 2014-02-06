/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a reference
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef#getRefId <em>Ref Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringRef()
 * @model
 * @generated
 */
public interface RichStringRef extends RichStringMarkup
{
  /**
   * Returns the value of the '<em><b>Ref Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Id</em>' attribute.
   * @see #setRefId(String)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringRef_RefId()
   * @model unique="false"
   * @generated
   */
  String getRefId();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringRef#getRefId <em>Ref Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Id</em>' attribute.
   * @see #getRefId()
   * @generated
   */
  void setRefId(String value);

} // RichStringRef
