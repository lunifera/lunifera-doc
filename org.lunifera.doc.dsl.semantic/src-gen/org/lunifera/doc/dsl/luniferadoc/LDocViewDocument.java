/**
 */
package org.lunifera.doc.dsl.luniferadoc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDoc View Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocViewDocument#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocViewDocument()
 * @model
 * @generated
 */
public interface LDocViewDocument extends LDocDocument
{
  /**
   * Returns the value of the '<em><b>View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' attribute.
   * @see #setView(String)
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocViewDocument_View()
   * @model unique="false"
   * @generated
   */
  String getView();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocViewDocument#getView <em>View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' attribute.
   * @see #getView()
   * @generated
   */
  void setView(String value);

} // LDocViewDocument
