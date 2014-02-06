/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ViewRefStart;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Ref Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ViewRefStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ViewRefStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewRefStartImpl extends LinePartImpl implements ViewRefStart
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected RichStringViewRef content;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected ViewRefEnd end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ViewRefStartImpl()
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
    return LunDocCompilerPackage.Literals.VIEW_REF_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringViewRef getContent()
  {
    if (content != null && content.eIsProxy())
    {
      InternalEObject oldContent = (InternalEObject)content;
      content = (RichStringViewRef)eResolveProxy(oldContent);
      if (content != oldContent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.VIEW_REF_START__CONTENT, oldContent, content));
      }
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringViewRef basicGetContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(RichStringViewRef newContent)
  {
    RichStringViewRef oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.VIEW_REF_START__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewRefEnd getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (ViewRefEnd)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.VIEW_REF_START__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewRefEnd basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(ViewRefEnd newEnd)
  {
    ViewRefEnd oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.VIEW_REF_START__END, oldEnd, end));
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
      case LunDocCompilerPackage.VIEW_REF_START__CONTENT:
        if (resolve) return getContent();
        return basicGetContent();
      case LunDocCompilerPackage.VIEW_REF_START__END:
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
      case LunDocCompilerPackage.VIEW_REF_START__CONTENT:
        setContent((RichStringViewRef)newValue);
        return;
      case LunDocCompilerPackage.VIEW_REF_START__END:
        setEnd((ViewRefEnd)newValue);
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
      case LunDocCompilerPackage.VIEW_REF_START__CONTENT:
        setContent((RichStringViewRef)null);
        return;
      case LunDocCompilerPackage.VIEW_REF_START__END:
        setEnd((ViewRefEnd)null);
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
      case LunDocCompilerPackage.VIEW_REF_START__CONTENT:
        return content != null;
      case LunDocCompilerPackage.VIEW_REF_START__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //ViewRefStartImpl
