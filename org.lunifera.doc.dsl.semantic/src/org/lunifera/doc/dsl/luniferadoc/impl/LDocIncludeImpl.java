/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocPackage;
import org.lunifera.doc.dsl.luniferadoc.LDocType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#isProvided <em>Provided</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#getProvidedType <em>Provided Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LDocIncludeImpl extends MinimalEObjectImpl.Container implements LDocInclude {
	/**
	 * The cached value of the '{@link #getDocument() <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocument()
	 * @generated
	 * @ordered
	 */
	protected LDocDocument document;

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
	 * The default value of the '{@link #isProvided() <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvided()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvided() <em>Provided</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvided()
	 * @generated
	 * @ordered
	 */
	protected boolean provided = PROVIDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvidedType() <em>Provided Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedType()
	 * @generated
	 * @ordered
	 */
	protected static final LDocType PROVIDED_TYPE_EDEFAULT = LDocType.DTO;

	/**
	 * The cached value of the '{@link #getProvidedType() <em>Provided Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedType()
	 * @generated
	 * @ordered
	 */
	protected LDocType providedType = PROVIDED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDocIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDocPackage.Literals.LDOC_INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocDocument getDocument() {
		if (document != null && document.eIsProxy()) {
			InternalEObject oldDocument = (InternalEObject)document;
			document = (LDocDocument)eResolveProxy(oldDocument);
			if (document != oldDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDocPackage.LDOC_INCLUDE__DOCUMENT, oldDocument, document));
			}
		}
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocDocument basicGetDocument() {
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(LDocDocument newDocument) {
		LDocDocument oldDocument = document;
		document = newDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_INCLUDE__DOCUMENT, oldDocument, document));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_INCLUDE__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvided() {
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvided(boolean newProvided) {
		boolean oldProvided = provided;
		provided = newProvided;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_INCLUDE__PROVIDED, oldProvided, provided));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocType getProvidedType() {
		return providedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedType(LDocType newProvidedType) {
		LDocType oldProvidedType = providedType;
		providedType = newProvidedType == null ? PROVIDED_TYPE_EDEFAULT : newProvidedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_INCLUDE__PROVIDED_TYPE, oldProvidedType, providedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDocPackage.LDOC_INCLUDE__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case LDocPackage.LDOC_INCLUDE__VAR_NAME:
				return getVarName();
			case LDocPackage.LDOC_INCLUDE__PROVIDED:
				return isProvided();
			case LDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				return getProvidedType();
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
			case LDocPackage.LDOC_INCLUDE__DOCUMENT:
				setDocument((LDocDocument)newValue);
				return;
			case LDocPackage.LDOC_INCLUDE__VAR_NAME:
				setVarName((String)newValue);
				return;
			case LDocPackage.LDOC_INCLUDE__PROVIDED:
				setProvided((Boolean)newValue);
				return;
			case LDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				setProvidedType((LDocType)newValue);
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
			case LDocPackage.LDOC_INCLUDE__DOCUMENT:
				setDocument((LDocDocument)null);
				return;
			case LDocPackage.LDOC_INCLUDE__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case LDocPackage.LDOC_INCLUDE__PROVIDED:
				setProvided(PROVIDED_EDEFAULT);
				return;
			case LDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				setProvidedType(PROVIDED_TYPE_EDEFAULT);
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
			case LDocPackage.LDOC_INCLUDE__DOCUMENT:
				return document != null;
			case LDocPackage.LDOC_INCLUDE__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case LDocPackage.LDOC_INCLUDE__PROVIDED:
				return provided != PROVIDED_EDEFAULT;
			case LDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				return providedType != PROVIDED_TYPE_EDEFAULT;
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
		result.append(" (varName: ");
		result.append(varName);
		result.append(", provided: ");
		result.append(provided);
		result.append(", providedType: ");
		result.append(providedType);
		result.append(')');
		return result.toString();
	}

} //LDocIncludeImpl
