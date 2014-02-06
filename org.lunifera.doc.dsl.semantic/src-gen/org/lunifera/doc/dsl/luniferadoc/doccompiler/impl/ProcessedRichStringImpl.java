/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.Line;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.ProcessedRichString;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processed Rich String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ProcessedRichStringImpl#getRichString <em>Rich String</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.ProcessedRichStringImpl#getLines <em>Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessedRichStringImpl extends MinimalEObjectImpl.Container implements ProcessedRichString
{
  /**
   * The cached value of the '{@link #getRichString() <em>Rich String</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRichString()
   * @generated
   * @ordered
   */
  protected RichString richString;

  /**
   * The cached value of the '{@link #getLines() <em>Lines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLines()
   * @generated
   * @ordered
   */
  protected EList<Line> lines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessedRichStringImpl()
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
    return LunDocCompilerPackage.Literals.PROCESSED_RICH_STRING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichString getRichString()
  {
    if (richString != null && richString.eIsProxy())
    {
      InternalEObject oldRichString = (InternalEObject)richString;
      richString = (RichString)eResolveProxy(oldRichString);
      if (richString != oldRichString)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.PROCESSED_RICH_STRING__RICH_STRING, oldRichString, richString));
      }
    }
    return richString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichString basicGetRichString()
  {
    return richString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRichString(RichString newRichString)
  {
    RichString oldRichString = richString;
    richString = newRichString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.PROCESSED_RICH_STRING__RICH_STRING, oldRichString, richString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Line> getLines()
  {
    if (lines == null)
    {
      lines = new EObjectContainmentWithInverseEList<Line>(Line.class, this, LunDocCompilerPackage.PROCESSED_RICH_STRING__LINES, LunDocCompilerPackage.LINE__RICH_STRING);
    }
    return lines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__LINES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getLines()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__LINES:
        return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__RICH_STRING:
        if (resolve) return getRichString();
        return basicGetRichString();
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__LINES:
        return getLines();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__RICH_STRING:
        setRichString((RichString)newValue);
        return;
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__LINES:
        getLines().clear();
        getLines().addAll((Collection<? extends Line>)newValue);
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
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__RICH_STRING:
        setRichString((RichString)null);
        return;
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__LINES:
        getLines().clear();
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
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__RICH_STRING:
        return richString != null;
      case LunDocCompilerPackage.PROCESSED_RICH_STRING__LINES:
        return lines != null && !lines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProcessedRichStringImpl
