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

import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocPackage;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl#getEntityClass <em>Entity Class</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LDocEntityDocumentImpl extends MinimalEObjectImpl.Container implements LDocEntityDocument {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected RichString description;

	/**
	 * The default value of the '{@link #getEntityClass() <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityClass() <em>Entity Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityClass()
	 * @generated
	 * @ordered
	 */
	protected String entityClass = ENTITY_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<LDocEntityField> fields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDocEntityDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDocPackage.Literals.LDOC_ENTITY_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_ENTITY_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_ENTITY_DOCUMENT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichString getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(RichString newDescription, NotificationChain msgs) {
		RichString oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(RichString newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEntityClass() {
		return entityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityClass(String newEntityClass) {
		String oldEntityClass = entityClass;
		entityClass = newEntityClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_ENTITY_DOCUMENT__ENTITY_CLASS, oldEntityClass, entityClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDocEntityField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<LDocEntityField>(LDocEntityField.class, this, LDocPackage.LDOC_ENTITY_DOCUMENT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case LDocPackage.LDOC_ENTITY_DOCUMENT__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDocPackage.LDOC_ENTITY_DOCUMENT__NAME:
				return getName();
			case LDocPackage.LDOC_ENTITY_DOCUMENT__LANGUAGE:
				return getLanguage();
			case LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION:
				return getDescription();
			case LDocPackage.LDOC_ENTITY_DOCUMENT__ENTITY_CLASS:
				return getEntityClass();
			case LDocPackage.LDOC_ENTITY_DOCUMENT__FIELDS:
				return getFields();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDocPackage.LDOC_ENTITY_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION:
				setDescription((RichString)newValue);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__ENTITY_CLASS:
				setEntityClass((String)newValue);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends LDocEntityField>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LDocPackage.LDOC_ENTITY_DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION:
				setDescription((RichString)null);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__ENTITY_CLASS:
				setEntityClass(ENTITY_CLASS_EDEFAULT);
				return;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__FIELDS:
				getFields().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LDocPackage.LDOC_ENTITY_DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LDocPackage.LDOC_ENTITY_DOCUMENT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case LDocPackage.LDOC_ENTITY_DOCUMENT__DESCRIPTION:
				return description != null;
			case LDocPackage.LDOC_ENTITY_DOCUMENT__ENTITY_CLASS:
				return ENTITY_CLASS_EDEFAULT == null ? entityClass != null : !ENTITY_CLASS_EDEFAULT.equals(entityClass);
			case LDocPackage.LDOC_ENTITY_DOCUMENT__FIELDS:
				return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", language: ");
		result.append(language);
		result.append(", entityClass: ");
		result.append(entityClass);
		result.append(')');
		return result.toString();
	}

} //LDocEntityDocumentImpl
