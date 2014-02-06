/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ColumnStart;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringColumn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ColumnStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ColumnStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnStartImpl extends LinePartImpl implements ColumnStart
{
  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected RichStringColumn content;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected ColumnEnd end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ColumnStartImpl()
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
    return LunDocCompilerPackage.Literals.COLUMN_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringColumn getContent()
  {
    if (content != null && content.eIsProxy())
    {
      InternalEObject oldContent = (InternalEObject)content;
      content = (RichStringColumn)eResolveProxy(oldContent);
      if (content != oldContent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.COLUMN_START__CONTENT, oldContent, content));
      }
    }
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichStringColumn basicGetContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(RichStringColumn newContent)
  {
    RichStringColumn oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.COLUMN_START__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnEnd getEnd()
  {
    if (end != null && end.eIsProxy())
    {
      InternalEObject oldEnd = (InternalEObject)end;
      end = (ColumnEnd)eResolveProxy(oldEnd);
      if (end != oldEnd)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.COLUMN_START__END, oldEnd, end));
      }
    }
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnEnd basicGetEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(ColumnEnd newEnd)
  {
    ColumnEnd oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.COLUMN_START__END, oldEnd, end));
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
      case LunDocCompilerPackage.COLUMN_START__CONTENT:
        if (resolve) return getContent();
        return basicGetContent();
      case LunDocCompilerPackage.COLUMN_START__END:
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
      case LunDocCompilerPackage.COLUMN_START__CONTENT:
        setContent((RichStringColumn)newValue);
        return;
      case LunDocCompilerPackage.COLUMN_START__END:
        setEnd((ColumnEnd)newValue);
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
      case LunDocCompilerPackage.COLUMN_START__CONTENT:
        setContent((RichStringColumn)null);
        return;
      case LunDocCompilerPackage.COLUMN_START__END:
        setEnd((ColumnEnd)null);
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
      case LunDocCompilerPackage.COLUMN_START__CONTENT:
        return content != null;
      case LunDocCompilerPackage.COLUMN_START__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //ColumnStartImpl
