/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String Markup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * The super class for all markup elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getStyle <em>Style</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#isSmall <em>Small</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringMarkup()
 * @model abstract="true"
 * @generated
 */
public interface RichStringMarkup extends XExpression
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringMarkup_Id()
   * @model unique="false"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see #setStyle(String)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringMarkup_Style()
   * @model unique="false"
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>Small</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Small</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Small</em>' attribute.
   * @see #setSmall(boolean)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringMarkup_Small()
   * @model unique="false"
   * @generated
   */
  boolean isSmall();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#isSmall <em>Small</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Small</em>' attribute.
   * @see #isSmall()
   * @generated
   */
  void setSmall(boolean value);

  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * The literals are from the enumeration {@link org.lunifera.doc.dsl.luniferadoc.richstring.MarkupOrientation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.MarkupOrientation
   * @see #setOrientation(MarkupOrientation)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringMarkup_Orientation()
   * @model unique="false"
   * @generated
   */
  MarkupOrientation getOrientation();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.MarkupOrientation
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(MarkupOrientation value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(XExpression)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringMarkup_Expression()
   * @model containment="true"
   * @generated
   */
  XExpression getExpression();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(XExpression value);

} // RichStringMarkup
