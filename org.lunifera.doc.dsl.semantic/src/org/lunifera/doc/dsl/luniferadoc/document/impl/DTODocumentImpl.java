/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.luniferadoc.document.DTODescription;
import org.lunifera.doc.dsl.luniferadoc.document.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocDocumentImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTO Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl#getDtoClass <em>Dto Class</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DTODocumentImpl extends LuniferaDocDocumentImpl implements DTODocument {
	/**
	 * The default value of the '{@link #getDtoClass() <em>Dto Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoClass()
	 * @generated
	 * @ordered
	 */
	protected static final String DTO_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDtoClass() <em>Dto Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoClass()
	 * @generated
	 * @ordered
	 */
	protected String dtoClass = DTO_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected DTODescription description;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected DTODetails details;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTODocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.DTO_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDtoClass() {
		return dtoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtoClass(String newDtoClass) {
		String oldDtoClass = dtoClass;
		dtoClass = newDtoClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DTO_DOCUMENT__DTO_CLASS, oldDtoClass, dtoClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTODescription getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DTODescription newDescription, NotificationChain msgs) {
		DTODescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentPackage.DTO_DOCUMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DTODescription newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentPackage.DTO_DOCUMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentPackage.DTO_DOCUMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DTO_DOCUMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTODetails getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetails(DTODetails newDetails, NotificationChain msgs) {
		DTODetails oldDetails = details;
		details = newDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentPackage.DTO_DOCUMENT__DETAILS, oldDetails, newDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(DTODetails newDetails) {
		if (newDetails != details) {
			NotificationChain msgs = null;
			if (details != null)
				msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentPackage.DTO_DOCUMENT__DETAILS, null, msgs);
			if (newDetails != null)
				msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentPackage.DTO_DOCUMENT__DETAILS, null, msgs);
			msgs = basicSetDetails(newDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DTO_DOCUMENT__DETAILS, newDetails, newDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocumentPackage.DTO_DOCUMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case DocumentPackage.DTO_DOCUMENT__DETAILS:
				return basicSetDetails(null, msgs);
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
			case DocumentPackage.DTO_DOCUMENT__DTO_CLASS:
				return getDtoClass();
			case DocumentPackage.DTO_DOCUMENT__DESCRIPTION:
				return getDescription();
			case DocumentPackage.DTO_DOCUMENT__DETAILS:
				return getDetails();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocumentPackage.DTO_DOCUMENT__DTO_CLASS:
				setDtoClass((String)newValue);
				return;
			case DocumentPackage.DTO_DOCUMENT__DESCRIPTION:
				setDescription((DTODescription)newValue);
				return;
			case DocumentPackage.DTO_DOCUMENT__DETAILS:
				setDetails((DTODetails)newValue);
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
			case DocumentPackage.DTO_DOCUMENT__DTO_CLASS:
				setDtoClass(DTO_CLASS_EDEFAULT);
				return;
			case DocumentPackage.DTO_DOCUMENT__DESCRIPTION:
				setDescription((DTODescription)null);
				return;
			case DocumentPackage.DTO_DOCUMENT__DETAILS:
				setDetails((DTODetails)null);
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
			case DocumentPackage.DTO_DOCUMENT__DTO_CLASS:
				return DTO_CLASS_EDEFAULT == null ? dtoClass != null : !DTO_CLASS_EDEFAULT.equals(dtoClass);
			case DocumentPackage.DTO_DOCUMENT__DESCRIPTION:
				return description != null;
			case DocumentPackage.DTO_DOCUMENT__DETAILS:
				return details != null;
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
		result.append(" (dtoClass: ");
		result.append(dtoClass);
		result.append(')');
		return result.toString();
	}

} //DTODocumentImpl
