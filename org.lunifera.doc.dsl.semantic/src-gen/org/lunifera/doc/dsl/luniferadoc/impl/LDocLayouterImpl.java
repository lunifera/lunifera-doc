/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xtype.XImportDeclaration;

import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LDoc Layouter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LDocLayouterImpl extends MinimalEObjectImpl.Container implements LDocLayouter
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected static final String LANGUAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected String language = LANGUAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected RichString content;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<XImportDeclaration> imports;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<LDocInclude> includes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LDocLayouterImpl()
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
    return LunDocPackage.Literals.LDOC_LAYOUTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_LAYOUTER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLanguage()
  {
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(String newLanguage)
  {
    String oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_LAYOUTER__LANGUAGE, oldLanguage, language));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RichString getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContent(RichString newContent, NotificationChain msgs)
  {
    RichString oldContent = content;
    content = newContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_LAYOUTER__CONTENT, oldContent, newContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContent(RichString newContent)
  {
    if (newContent != content)
    {
      NotificationChain msgs = null;
      if (content != null)
        msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LunDocPackage.LDOC_LAYOUTER__CONTENT, null, msgs);
      if (newContent != null)
        msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LunDocPackage.LDOC_LAYOUTER__CONTENT, null, msgs);
      msgs = basicSetContent(newContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_LAYOUTER__CONTENT, newContent, newContent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XImportDeclaration> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<XImportDeclaration>(XImportDeclaration.class, this, LunDocPackage.LDOC_LAYOUTER__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LDocInclude> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<LDocInclude>(LDocInclude.class, this, LunDocPackage.LDOC_LAYOUTER__INCLUDES);
    }
    return includes;
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
      case LunDocPackage.LDOC_LAYOUTER__CONTENT:
        return basicSetContent(null, msgs);
      case LunDocPackage.LDOC_LAYOUTER__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case LunDocPackage.LDOC_LAYOUTER__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
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
      case LunDocPackage.LDOC_LAYOUTER__NAME:
        return getName();
      case LunDocPackage.LDOC_LAYOUTER__LANGUAGE:
        return getLanguage();
      case LunDocPackage.LDOC_LAYOUTER__CONTENT:
        return getContent();
      case LunDocPackage.LDOC_LAYOUTER__IMPORTS:
        return getImports();
      case LunDocPackage.LDOC_LAYOUTER__INCLUDES:
        return getIncludes();
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
      case LunDocPackage.LDOC_LAYOUTER__NAME:
        setName((String)newValue);
        return;
      case LunDocPackage.LDOC_LAYOUTER__LANGUAGE:
        setLanguage((String)newValue);
        return;
      case LunDocPackage.LDOC_LAYOUTER__CONTENT:
        setContent((RichString)newValue);
        return;
      case LunDocPackage.LDOC_LAYOUTER__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends XImportDeclaration>)newValue);
        return;
      case LunDocPackage.LDOC_LAYOUTER__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends LDocInclude>)newValue);
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
      case LunDocPackage.LDOC_LAYOUTER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LunDocPackage.LDOC_LAYOUTER__LANGUAGE:
        setLanguage(LANGUAGE_EDEFAULT);
        return;
      case LunDocPackage.LDOC_LAYOUTER__CONTENT:
        setContent((RichString)null);
        return;
      case LunDocPackage.LDOC_LAYOUTER__IMPORTS:
        getImports().clear();
        return;
      case LunDocPackage.LDOC_LAYOUTER__INCLUDES:
        getIncludes().clear();
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
      case LunDocPackage.LDOC_LAYOUTER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LunDocPackage.LDOC_LAYOUTER__LANGUAGE:
        return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
      case LunDocPackage.LDOC_LAYOUTER__CONTENT:
        return content != null;
      case LunDocPackage.LDOC_LAYOUTER__IMPORTS:
        return imports != null && !imports.isEmpty();
      case LunDocPackage.LDOC_LAYOUTER__INCLUDES:
        return includes != null && !includes.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", language: ");
    result.append(language);
    result.append(')');
    return result.toString();
  }

} //LDocLayouterImpl
