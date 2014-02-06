/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A code markup
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getLang <em>Lang</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringCode()
 * @model
 * @generated
 */
public interface RichStringCode extends RichStringMarkup
{
  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see #setLang(String)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringCode_Lang()
   * @model unique="false"
   * @generated
   */
  String getLang();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see #getLang()
   * @generated
   */
  void setLang(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(XExpression)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringCode_Content()
   * @model containment="true"
   * @generated
   */
  XExpression getContent();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(XExpression value);

} // RichStringCode
