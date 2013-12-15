/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rich String Entity Ref</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringEntityRefImpl#getRefId <em>Ref Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RichStringEntityRefImpl extends RichStringMarkupImpl implements RichStringEntityRef {
	/**
	 * The default value of the '{@link #getRefId() <em>Ref Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefId() <em>Ref Id</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected String refId = REF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RichStringEntityRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RichstringPackage.Literals.RICH_STRING_ENTITY_REF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRefId(String newRefId) {
		String oldRefId = refId;
		refId = newRefId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_ENTITY_REF__REF_ID, oldRefId, refId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RichstringPackage.RICH_STRING_ENTITY_REF__REF_ID:
			return getRefId();
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
		case RichstringPackage.RICH_STRING_ENTITY_REF__REF_ID:
			setRefId((String) newValue);
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
		case RichstringPackage.RICH_STRING_ENTITY_REF__REF_ID:
			setRefId(REF_ID_EDEFAULT);
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
		case RichstringPackage.RICH_STRING_ENTITY_REF__REF_ID:
			return REF_ID_EDEFAULT == null ? refId != null : !REF_ID_EDEFAULT.equals(refId);
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
		result.append(" (refId: ");
		result.append(refId);
		result.append(')');
		return result.toString();
	}

} // RichStringEntityRefImpl
