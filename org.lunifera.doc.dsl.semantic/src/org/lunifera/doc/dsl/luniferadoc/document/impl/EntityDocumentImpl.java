/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDescription;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.document.EntityFields;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entity Document</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl#getName <em>Name</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl#getEntityClass <em>Entity Class</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl#getDescription <em>Description</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityDocumentImpl extends MinimalEObjectImpl.Container implements EntityDocument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEntityClass() <em>Entity Class</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getEntityClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntityClass() <em>Entity Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEntityClass()
	 * @generated
	 * @ordered
	 */
	protected String entityClass = ENTITY_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EntityDescription description;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EntityFields fields;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.ENTITY_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.ENTITY_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getEntityClass() {
		return entityClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityClass(String newEntityClass) {
		String oldEntityClass = entityClass;
		entityClass = newEntityClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.ENTITY_DOCUMENT__ENTITY_CLASS,
					oldEntityClass, entityClass));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDescription getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDescription(EntityDescription newDescription, NotificationChain msgs) {
		EntityDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(EntityDescription newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION,
					newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityFields getFields() {
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFields(EntityFields newFields, NotificationChain msgs) {
		EntityFields oldFields = fields;
		fields = newFields;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DocumentPackage.ENTITY_DOCUMENT__FIELDS, oldFields, newFields);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFields(EntityFields newFields) {
		if (newFields != fields) {
			NotificationChain msgs = null;
			if (fields != null)
				msgs = ((InternalEObject) fields).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.ENTITY_DOCUMENT__FIELDS, null, msgs);
			if (newFields != null)
				msgs = ((InternalEObject) newFields).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.ENTITY_DOCUMENT__FIELDS, null, msgs);
			msgs = basicSetFields(newFields, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.ENTITY_DOCUMENT__FIELDS, newFields,
					newFields));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION:
			return basicSetDescription(null, msgs);
		case DocumentPackage.ENTITY_DOCUMENT__FIELDS:
			return basicSetFields(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DocumentPackage.ENTITY_DOCUMENT__NAME:
			return getName();
		case DocumentPackage.ENTITY_DOCUMENT__ENTITY_CLASS:
			return getEntityClass();
		case DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION:
			return getDescription();
		case DocumentPackage.ENTITY_DOCUMENT__FIELDS:
			return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DocumentPackage.ENTITY_DOCUMENT__NAME:
			setName((String) newValue);
			return;
		case DocumentPackage.ENTITY_DOCUMENT__ENTITY_CLASS:
			setEntityClass((String) newValue);
			return;
		case DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION:
			setDescription((EntityDescription) newValue);
			return;
		case DocumentPackage.ENTITY_DOCUMENT__FIELDS:
			setFields((EntityFields) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DocumentPackage.ENTITY_DOCUMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DocumentPackage.ENTITY_DOCUMENT__ENTITY_CLASS:
			setEntityClass(ENTITY_CLASS_EDEFAULT);
			return;
		case DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION:
			setDescription((EntityDescription) null);
			return;
		case DocumentPackage.ENTITY_DOCUMENT__FIELDS:
			setFields((EntityFields) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DocumentPackage.ENTITY_DOCUMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DocumentPackage.ENTITY_DOCUMENT__ENTITY_CLASS:
			return ENTITY_CLASS_EDEFAULT == null ? entityClass != null : !ENTITY_CLASS_EDEFAULT.equals(entityClass);
		case DocumentPackage.ENTITY_DOCUMENT__DESCRIPTION:
			return description != null;
		case DocumentPackage.ENTITY_DOCUMENT__FIELDS:
			return fields != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", entityClass: ");
		result.append(entityClass);
		result.append(')');
		return result.toString();
	}

} // EntityDocumentImpl
