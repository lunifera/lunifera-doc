/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.richstring.LDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringStartProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Start Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringStartProcessImpl#getProcessId <em>Process Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringStartProcessImpl extends RichStringMarkupImpl implements RichStringStartProcess {
	/**
	 * The default value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcessId() <em>Process Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessId()
	 * @generated
	 * @ordered
	 */
	protected String processId = PROCESS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringStartProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDocRichstringPackage.Literals.RICH_STRING_START_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProcessId() {
		return processId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessId(String newProcessId) {
		String oldProcessId = processId;
		processId = newProcessId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocRichstringPackage.RICH_STRING_START_PROCESS__PROCESS_ID, oldProcessId, processId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDocRichstringPackage.RICH_STRING_START_PROCESS__PROCESS_ID:
				return getProcessId();
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
			case LDocRichstringPackage.RICH_STRING_START_PROCESS__PROCESS_ID:
				setProcessId((String)newValue);
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
			case LDocRichstringPackage.RICH_STRING_START_PROCESS__PROCESS_ID:
				setProcessId(PROCESS_ID_EDEFAULT);
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
			case LDocRichstringPackage.RICH_STRING_START_PROCESS__PROCESS_ID:
				return PROCESS_ID_EDEFAULT == null ? processId != null : !PROCESS_ID_EDEFAULT.equals(processId);
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
		result.append(" (processId: ");
		result.append(processId);
		result.append(')');
		return result.toString();
	}

} //RichStringStartProcessImpl
