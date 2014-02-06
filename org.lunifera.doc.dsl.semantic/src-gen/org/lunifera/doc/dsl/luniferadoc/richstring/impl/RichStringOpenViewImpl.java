/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOpenView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Open View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringOpenViewImpl#getViewId <em>View Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringOpenViewImpl extends RichStringMarkupImpl implements RichStringOpenView
{
  /**
   * The default value of the '{@link #getViewId() <em>View Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewId()
   * @generated
   * @ordered
   */
  protected static final String VIEW_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewId() <em>View Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewId()
   * @generated
   * @ordered
   */
  protected String viewId = VIEW_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RichStringOpenViewImpl()
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
    return LunDocRichstringPackage.Literals.RICH_STRING_OPEN_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewId()
  {
    return viewId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewId(String newViewId)
  {
    String oldViewId = viewId;
    viewId = newViewId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_OPEN_VIEW__VIEW_ID, oldViewId, viewId));
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
      case LunDocRichstringPackage.RICH_STRING_OPEN_VIEW__VIEW_ID:
        return getViewId();
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
      case LunDocRichstringPackage.RICH_STRING_OPEN_VIEW__VIEW_ID:
        setViewId((String)newValue);
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
      case LunDocRichstringPackage.RICH_STRING_OPEN_VIEW__VIEW_ID:
        setViewId(VIEW_ID_EDEFAULT);
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
      case LunDocRichstringPackage.RICH_STRING_OPEN_VIEW__VIEW_ID:
        return VIEW_ID_EDEFAULT == null ? viewId != null : !VIEW_ID_EDEFAULT.equals(viewId);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (viewId: ");
    result.append(viewId);
    result.append(')');
    return result.toString();
  }

} //RichStringOpenViewImpl
