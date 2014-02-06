/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringViewRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String View Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringViewRefImpl#getViewDoc <em>View Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringViewRefImpl extends RichStringMarkupImpl implements RichStringViewRef
{
  /**
   * The cached value of the '{@link #getViewDoc() <em>View Doc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewDoc()
   * @generated
   * @ordered
   */
  protected LDocViewDocument viewDoc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RichStringViewRefImpl()
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
    return LunDocRichstringPackage.Literals.RICH_STRING_VIEW_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocViewDocument getViewDoc()
  {
    if (viewDoc != null && viewDoc.eIsProxy())
    {
      InternalEObject oldViewDoc = (InternalEObject)viewDoc;
      viewDoc = (LDocViewDocument)eResolveProxy(oldViewDoc);
      if (viewDoc != oldViewDoc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocRichstringPackage.RICH_STRING_VIEW_REF__VIEW_DOC, oldViewDoc, viewDoc));
      }
    }
    return viewDoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LDocViewDocument basicGetViewDoc()
  {
    return viewDoc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewDoc(LDocViewDocument newViewDoc)
  {
    LDocViewDocument oldViewDoc = viewDoc;
    viewDoc = newViewDoc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_VIEW_REF__VIEW_DOC, oldViewDoc, viewDoc));
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
      case LunDocRichstringPackage.RICH_STRING_VIEW_REF__VIEW_DOC:
        if (resolve) return getViewDoc();
        return basicGetViewDoc();
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
      case LunDocRichstringPackage.RICH_STRING_VIEW_REF__VIEW_DOC:
        setViewDoc((LDocViewDocument)newValue);
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
      case LunDocRichstringPackage.RICH_STRING_VIEW_REF__VIEW_DOC:
        setViewDoc((LDocViewDocument)null);
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
      case LunDocRichstringPackage.RICH_STRING_VIEW_REF__VIEW_DOC:
        return viewDoc != null;
    }
    return super.eIsSet(featureID);
  }

} //RichStringViewRefImpl
