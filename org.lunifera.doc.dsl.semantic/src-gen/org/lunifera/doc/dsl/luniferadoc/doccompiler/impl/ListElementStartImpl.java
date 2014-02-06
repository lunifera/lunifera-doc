/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ListElementStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringListElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Element Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ListElementStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ListElementStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListElementStartImpl extends LinePartImpl implements ListElementStart
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected RichStringListElement content;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected ListElementEnd end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListElementStartImpl()
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
    return LunDocCompilerPackage.Literals.LIST_ELEMENT_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringListElement getContent()
  {
    if (content != null && content.eIsProxy())
    {
      InternalEObject oldContent = (InternalEObject)content;
      content = (RichStringListElement)eResolveProxy(oldContent);
      if (content != oldContent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.LIST_ELEMENT_START__CONTENT, oldContent, content));
      }
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringListElement basicGetContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(RichStringListElement newContent)
  {
    RichStringListElement oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.LIST_ELEMENT_START__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListElementEnd getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (ListElementEnd)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.LIST_ELEMENT_START__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListElementEnd basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(ListElementEnd newEnd)
  {
    ListElementEnd oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.LIST_ELEMENT_START__END, oldEnd, end));
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
      case LunDocCompilerPackage.LIST_ELEMENT_START__CONTENT:
        if (resolve) return getContent();
        return basicGetContent();
      case LunDocCompilerPackage.LIST_ELEMENT_START__END:
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
      case LunDocCompilerPackage.LIST_ELEMENT_START__CONTENT:
        setContent((RichStringListElement)newValue);
        return;
      case LunDocCompilerPackage.LIST_ELEMENT_START__END:
        setEnd((ListElementEnd)newValue);
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
      case LunDocCompilerPackage.LIST_ELEMENT_START__CONTENT:
        setContent((RichStringListElement)null);
        return;
      case LunDocCompilerPackage.LIST_ELEMENT_START__END:
        setEnd((ListElementEnd)null);
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
      case LunDocCompilerPackage.LIST_ELEMENT_START__CONTENT:
        return content != null;
      case LunDocCompilerPackage.LIST_ELEMENT_START__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //ListElementStartImpl
