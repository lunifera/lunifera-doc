/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a section in the document
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringSection()
 * @model
 * @generated
 */
public interface RichStringSection extends RichStringMarkup, IndexElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringSection_Name()
   * @model unique="false" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // RichStringSection
