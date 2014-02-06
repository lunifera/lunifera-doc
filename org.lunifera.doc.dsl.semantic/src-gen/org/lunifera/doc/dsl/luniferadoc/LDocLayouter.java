/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xtype.XImportDeclaration;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDoc Layouter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocLayouter()
 * @model
 * @generated
 */
public interface LDocLayouter extends LDocNamedDocument
{
  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference.
   * @see #setContent(RichString)
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocLayouter_Content()
   * @model containment="true"
   * @generated
   */
  RichString getContent();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getContent <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' containment reference.
   * @see #getContent()
   * @generated
   */
  void setContent(RichString value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xtype.XImportDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocLayouter_Imports()
   * @model containment="true"
   * @generated
   */
  EList<XImportDeclaration> getImports();

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
   * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.LDocInclude}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference list.
   * @see org.lunifera.doc.dsl.luniferadoc.LunDocPackage#getLDocLayouter_Includes()
   * @model containment="true"
   * @generated
   */
  EList<LDocInclude> getIncludes();

} // LDocLayouter
