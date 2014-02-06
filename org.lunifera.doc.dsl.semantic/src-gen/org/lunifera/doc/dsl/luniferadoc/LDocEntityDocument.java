/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.common.util.EList;

import org.lunifera.dsl.semantic.common.types.LType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDoc Entity Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getFields <em>Fields</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocEntityDocument()
 * @model
 * @generated
 */
public interface LDocEntityDocument extends LDocDocument
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocEntityDocument_Fields()
   * @model containment="true"
   * @generated
   */
  EList<LDocEntityField> getFields();

  /**
   * Returns the value of the '<em><b>Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' reference.
   * @see #setModel(LType)
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocEntityDocument_Model()
   * @model
   * @generated
   */
  LType getModel();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getModel <em>Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' reference.
   * @see #getModel()
   * @generated
   */
  void setModel(LType value);

} // LDocEntityDocument
