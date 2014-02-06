/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

import org.lunifera.dsl.semantic.common.types.LFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LDoc Entity Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityFieldImpl#getTypeField <em>Type Field</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityFieldImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LDocEntityFieldImpl extends MinimalEObjectImpl.Container implements LDocEntityField
{
  /**
   * The cached value of the '{@link #getTypeField() <em>Type Field</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeField()
   * @generated
   * @ordered
   */
  protected LFeature typeField;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected RichString description;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LDocEntityFieldImpl()
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
    return LunDocPackage.Literals.LDOC_ENTITY_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFeature getTypeField()
  {
    if (typeField != null && typeField.eIsProxy())
    {
      InternalEObject oldTypeField = (InternalEObject)typeField;
      typeField = (LFeature)eResolveProxy(oldTypeField);
      if (typeField != oldTypeField)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocPackage.LDOC_ENTITY_FIELD__TYPE_FIELD, oldTypeField, typeField));
      }
    }
    return typeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LFeature basicGetTypeField()
  {
    return typeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeField(LFeature newTypeField)
  {
    LFeature oldTypeField = typeField;
    typeField = newTypeField;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_ENTITY_FIELD__TYPE_FIELD, oldTypeField, typeField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichString getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDescription(RichString newDescription, NotificationChain msgs)
  {
    RichString oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION, oldDescription, newDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(RichString newDescription)
  {
    if (newDescription != description)
    {
      NotificationChain msgs = null;
      if (description != null)
        msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION, null, msgs);
      if (newDescription != null)
        msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION, null, msgs);
      msgs = basicSetDescription(newDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION, newDescription, newDescription));
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
      case LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION:
        return basicSetDescription(null, msgs);
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
      case LunDocPackage.LDOC_ENTITY_FIELD__TYPE_FIELD:
        if (resolve) return getTypeField();
        return basicGetTypeField();
      case LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION:
        return getDescription();
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
      case LunDocPackage.LDOC_ENTITY_FIELD__TYPE_FIELD:
        setTypeField((LFeature)newValue);
        return;
      case LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION:
        setDescription((RichString)newValue);
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
      case LunDocPackage.LDOC_ENTITY_FIELD__TYPE_FIELD:
        setTypeField((LFeature)null);
        return;
      case LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION:
        setDescription((RichString)null);
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
      case LunDocPackage.LDOC_ENTITY_FIELD__TYPE_FIELD:
        return typeField != null;
      case LunDocPackage.LDOC_ENTITY_FIELD__DESCRIPTION:
        return description != null;
    }
    return super.eIsSet(featureID);
  }

} //LDocEntityFieldImpl
