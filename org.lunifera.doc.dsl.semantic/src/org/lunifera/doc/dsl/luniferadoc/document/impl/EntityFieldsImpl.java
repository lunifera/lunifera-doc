/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityField;
import org.lunifera.doc.dsl.luniferadoc.document.EntityFields;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entity Fields</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldsImpl#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityFieldsImpl extends MinimalEObjectImpl.Container implements EntityFields {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityField> fields;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EntityFieldsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.ENTITY_FIELDS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<EntityField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<EntityField>(EntityField.class, this,
					DocumentPackage.ENTITY_FIELDS__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DocumentPackage.ENTITY_FIELDS__FIELDS:
			return ((InternalEList<?>) getFields()).basicRemove(otherEnd, msgs);
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
		case DocumentPackage.ENTITY_FIELDS__FIELDS:
			return getFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DocumentPackage.ENTITY_FIELDS__FIELDS:
			getFields().clear();
			getFields().addAll((Collection<? extends EntityField>) newValue);
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
		case DocumentPackage.ENTITY_FIELDS__FIELDS:
			getFields().clear();
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
		case DocumentPackage.ENTITY_FIELDS__FIELDS:
			return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EntityFieldsImpl
