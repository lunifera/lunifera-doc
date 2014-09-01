/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringDTORef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String DTO Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringDTORefImpl#getDtoDoc <em>Dto Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringDTORefImpl extends RichStringMarkupImpl implements RichStringDTORef {
	/**
	 * The cached value of the '{@link #getDtoDoc() <em>Dto Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDtoDoc()
	 * @generated
	 * @ordered
	 */
	protected LDocDtoDocument dtoDoc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringDTORefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LunDocRichstringPackage.Literals.RICH_STRING_DTO_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocDtoDocument getDtoDoc() {
		if (dtoDoc != null && dtoDoc.eIsProxy()) {
			InternalEObject oldDtoDoc = (InternalEObject)dtoDoc;
			dtoDoc = (LDocDtoDocument)eResolveProxy(oldDtoDoc);
			if (dtoDoc != oldDtoDoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocRichstringPackage.RICH_STRING_DTO_REF__DTO_DOC, oldDtoDoc, dtoDoc));
			}
		}
		return dtoDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocDtoDocument basicGetDtoDoc() {
		return dtoDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDtoDoc(LDocDtoDocument newDtoDoc) {
		LDocDtoDocument oldDtoDoc = dtoDoc;
		dtoDoc = newDtoDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_DTO_REF__DTO_DOC, oldDtoDoc, dtoDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_DTO_REF__DTO_DOC:
				if (resolve) return getDtoDoc();
				return basicGetDtoDoc();
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
			case LunDocRichstringPackage.RICH_STRING_DTO_REF__DTO_DOC:
				setDtoDoc((LDocDtoDocument)newValue);
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
			case LunDocRichstringPackage.RICH_STRING_DTO_REF__DTO_DOC:
				setDtoDoc((LDocDtoDocument)null);
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
			case LunDocRichstringPackage.RICH_STRING_DTO_REF__DTO_DOC:
				return dtoDoc != null;
		}
		return super.eIsSet(featureID);
	}

} //RichStringDTORefImpl
