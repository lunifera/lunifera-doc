/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.doc.dsl.luniferadoc.DocumentInclude;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.DocumentIncludeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.DocumentIncludeImpl#getVarName <em>Var Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentIncludeImpl extends MinimalEObjectImpl.Container implements DocumentInclude {
	/**
	 * The default value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected String include = INCLUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LuniferaDocPackage.Literals.DOCUMENT_INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(String newInclude) {
		String oldInclude = include;
		include = newInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LuniferaDocPackage.DOCUMENT_INCLUDE__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LuniferaDocPackage.DOCUMENT_INCLUDE__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LuniferaDocPackage.DOCUMENT_INCLUDE__INCLUDE:
				return getInclude();
			case LuniferaDocPackage.DOCUMENT_INCLUDE__VAR_NAME:
				return getVarName();
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
			case LuniferaDocPackage.DOCUMENT_INCLUDE__INCLUDE:
				setInclude((String)newValue);
				return;
			case LuniferaDocPackage.DOCUMENT_INCLUDE__VAR_NAME:
				setVarName((String)newValue);
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
			case LuniferaDocPackage.DOCUMENT_INCLUDE__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
				return;
			case LuniferaDocPackage.DOCUMENT_INCLUDE__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
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
			case LuniferaDocPackage.DOCUMENT_INCLUDE__INCLUDE:
				return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
			case LuniferaDocPackage.DOCUMENT_INCLUDE__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
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
		result.append(" (include: ");
		result.append(include);
		result.append(", varName: ");
		result.append(varName);
		result.append(')');
		return result.toString();
	}

} //DocumentIncludeImpl
