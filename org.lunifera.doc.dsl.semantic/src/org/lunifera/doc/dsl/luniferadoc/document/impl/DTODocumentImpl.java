/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.luniferadoc.document.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTOHeader;
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
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl#getHeader <em>Header</em>}</li>
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
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected DTOHeader header;

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
	public DTOHeader getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(DTOHeader newHeader, NotificationChain msgs) {
		DTOHeader oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocumentPackage.DTO_DOCUMENT__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(DTOHeader newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocumentPackage.DTO_DOCUMENT__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocumentPackage.DTO_DOCUMENT__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocumentPackage.DTO_DOCUMENT__HEADER, newHeader, newHeader));
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
			case DocumentPackage.DTO_DOCUMENT__HEADER:
				return basicSetHeader(null, msgs);
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
			case DocumentPackage.DTO_DOCUMENT__HEADER:
				return getHeader();
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
			case DocumentPackage.DTO_DOCUMENT__HEADER:
				setHeader((DTOHeader)newValue);
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
			case DocumentPackage.DTO_DOCUMENT__HEADER:
				setHeader((DTOHeader)null);
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
			case DocumentPackage.DTO_DOCUMENT__HEADER:
				return header != null;
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
