/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocType;
import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LDoc Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#isProvided <em>Provided</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#getProvidedType <em>Provided Type</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl#getProvidedJVMType <em>Provided JVM Type</em>}</li>
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
	 * The cached value of the '{@link #getProvidedJVMType() <em>Provided JVM Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedJVMType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference providedJVMType;

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
		return LunDocPackage.Literals.LDOC_INCLUDE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocPackage.LDOC_INCLUDE__DOCUMENT, oldDocument, document));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_INCLUDE__DOCUMENT, oldDocument, document));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_INCLUDE__VAR_NAME, oldVarName, varName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_INCLUDE__PROVIDED, oldProvided, provided));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_INCLUDE__PROVIDED_TYPE, oldProvidedType, providedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getProvidedJVMType() {
		return providedJVMType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvidedJVMType(JvmTypeReference newProvidedJVMType, NotificationChain msgs) {
		JvmTypeReference oldProvidedJVMType = providedJVMType;
		providedJVMType = newProvidedJVMType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE, oldProvidedJVMType, newProvidedJVMType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedJVMType(JvmTypeReference newProvidedJVMType) {
		if (newProvidedJVMType != providedJVMType) {
			NotificationChain msgs = null;
			if (providedJVMType != null)
				msgs = ((InternalEObject)providedJVMType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE, null, msgs);
			if (newProvidedJVMType != null)
				msgs = ((InternalEObject)newProvidedJVMType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE, null, msgs);
			msgs = basicSetProvidedJVMType(newProvidedJVMType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE, newProvidedJVMType, newProvidedJVMType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE:
				return basicSetProvidedJVMType(null, msgs);
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
			case LunDocPackage.LDOC_INCLUDE__DOCUMENT:
				if (resolve) return getDocument();
				return basicGetDocument();
			case LunDocPackage.LDOC_INCLUDE__VAR_NAME:
				return getVarName();
			case LunDocPackage.LDOC_INCLUDE__PROVIDED:
				return isProvided();
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				return getProvidedType();
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE:
				return getProvidedJVMType();
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
			case LunDocPackage.LDOC_INCLUDE__DOCUMENT:
				setDocument((LDocDocument)newValue);
				return;
			case LunDocPackage.LDOC_INCLUDE__VAR_NAME:
				setVarName((String)newValue);
				return;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED:
				setProvided((Boolean)newValue);
				return;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				setProvidedType((LDocType)newValue);
				return;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE:
				setProvidedJVMType((JvmTypeReference)newValue);
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
			case LunDocPackage.LDOC_INCLUDE__DOCUMENT:
				setDocument((LDocDocument)null);
				return;
			case LunDocPackage.LDOC_INCLUDE__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED:
				setProvided(PROVIDED_EDEFAULT);
				return;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				setProvidedType(PROVIDED_TYPE_EDEFAULT);
				return;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE:
				setProvidedJVMType((JvmTypeReference)null);
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
			case LunDocPackage.LDOC_INCLUDE__DOCUMENT:
				return document != null;
			case LunDocPackage.LDOC_INCLUDE__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case LunDocPackage.LDOC_INCLUDE__PROVIDED:
				return provided != PROVIDED_EDEFAULT;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_TYPE:
				return providedType != PROVIDED_TYPE_EDEFAULT;
			case LunDocPackage.LDOC_INCLUDE__PROVIDED_JVM_TYPE:
				return providedJVMType != null;
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
