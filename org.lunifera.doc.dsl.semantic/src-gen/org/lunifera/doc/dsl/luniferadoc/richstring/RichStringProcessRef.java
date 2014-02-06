/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich String Process Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A markup to reference a process document (bpm)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef#getBpmDoc <em>Bpm Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringProcessRef()
 * @model
 * @generated
 */
public interface RichStringProcessRef extends RichStringMarkup
{
  /**
   * Returns the value of the '<em><b>Bpm Doc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bpm Doc</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bpm Doc</em>' reference.
   * @see #setBpmDoc(LDocBPMProcessDocument)
   * @see org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage#getRichStringProcessRef_BpmDoc()
   * @model
   * @generated
   */
  LDocBPMProcessDocument getBpmDoc();

  /**
   * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef#getBpmDoc <em>Bpm Doc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bpm Doc</em>' reference.
   * @see #getBpmDoc()
   * @generated
   */
  void setBpmDoc(LDocBPMProcessDocument value);

} // RichStringProcessRef
