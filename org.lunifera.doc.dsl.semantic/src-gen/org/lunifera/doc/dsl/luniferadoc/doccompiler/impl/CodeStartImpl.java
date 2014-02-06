/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.CodeStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.CodeStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.CodeStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeStartImpl extends LinePartImpl implements CodeStart
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected RichStringCode content;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected CodeEnd end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CodeStartImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LunDocCompilerPackage.Literals.CODE_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringCode getContent()
  {
    if (content != null && content.eIsProxy())
    {
      InternalEObject oldContent = (InternalEObject)content;
      content = (RichStringCode)eResolveProxy(oldContent);
      if (content != oldContent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.CODE_START__CONTENT, oldContent, content));
      }
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringCode basicGetContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(RichStringCode newContent)
  {
    RichStringCode oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.CODE_START__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeEnd getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (CodeEnd)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.CODE_START__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CodeEnd basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(CodeEnd newEnd)
  {
    CodeEnd oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.CODE_START__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.CODE_START__CONTENT:
        if (resolve) return getContent();
        return basicGetContent();
      case LunDocCompilerPackage.CODE_START__END:
        if (resolve) return getEnd();
        return basicGetEnd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.CODE_START__CONTENT:
        setContent((RichStringCode)newValue);
        return;
      case LunDocCompilerPackage.CODE_START__END:
        setEnd((CodeEnd)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.CODE_START__CONTENT:
        setContent((RichStringCode)null);
        return;
      case LunDocCompilerPackage.CODE_START__END:
        setEnd((CodeEnd)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.CODE_START__CONTENT:
        return content != null;
      case LunDocCompilerPackage.CODE_START__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //CodeStartImpl
