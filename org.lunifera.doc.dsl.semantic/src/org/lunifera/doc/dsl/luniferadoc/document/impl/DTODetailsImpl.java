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
import org.lunifera.doc.dsl.luniferadoc.document.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTO Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODetailsImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DTODetailsImpl extends MinimalEObjectImpl.Container implements DTODetails {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DTOProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTODetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.DTO_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTOProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<DTOProperty>(DTOProperty.class, this, DocumentPackage.DTO_DETAILS__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocumentPackage.DTO_DETAILS__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case DocumentPackage.DTO_DETAILS__PROPERTIES:
				return getProperties();
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
			case DocumentPackage.DTO_DETAILS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends DTOProperty>)newValue);
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
			case DocumentPackage.DTO_DETAILS__PROPERTIES:
				getProperties().clear();
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
			case DocumentPackage.DTO_DETAILS__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DTODetailsImpl
