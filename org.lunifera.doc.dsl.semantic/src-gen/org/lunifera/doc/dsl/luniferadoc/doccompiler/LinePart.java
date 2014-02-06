/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.LinePart#getLine <em>Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getLinePart()
 * @model
 * @generated
 */
public interface LinePart extends EObject
{
  /**
   * Returns the value of the '<em><b>Line</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.Line#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line</em>' container reference.
   * @see #setLine(Line)
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage#getLinePart_Line()
   * @see org.lunifera.doc.dsl.luniferadoc.doccompiler.Line#getParts
   * @model opposite="parts" transient="false"
   * @generated
   */
  Line getLine();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.LinePart#getLine <em>Line</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line</em>' container reference.
   * @see #getLine()
   * @generated
   */
  void setLine(Line value);

} // LinePart
