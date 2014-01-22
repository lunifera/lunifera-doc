/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocPackage;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LDocViewDocumentImpl extends MinimalEObjectImpl.Container implements LDocViewDocument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected RichString description;

	/**
	 * The default value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected String view = VIEW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDocViewDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDocPackage.Literals.LDOC_VIEW_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_VIEW_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_VIEW_DOCUMENT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichString getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(RichString newDescription, NotificationChain msgs) {
		RichString oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(RichString newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(String newView) {
		String oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocPackage.LDOC_VIEW_DOCUMENT__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
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
			case LDocPackage.LDOC_VIEW_DOCUMENT__NAME:
				return getName();
			case LDocPackage.LDOC_VIEW_DOCUMENT__LANGUAGE:
				return getLanguage();
			case LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION:
				return getDescription();
			case LDocPackage.LDOC_VIEW_DOCUMENT__VIEW:
				return getView();
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
			case LDocPackage.LDOC_VIEW_DOCUMENT__NAME:
				setName((String)newValue);
				return;
			case LDocPackage.LDOC_VIEW_DOCUMENT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION:
				setDescription((RichString)newValue);
				return;
			case LDocPackage.LDOC_VIEW_DOCUMENT__VIEW:
				setView((String)newValue);
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
			case LDocPackage.LDOC_VIEW_DOCUMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LDocPackage.LDOC_VIEW_DOCUMENT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION:
				setDescription((RichString)null);
				return;
			case LDocPackage.LDOC_VIEW_DOCUMENT__VIEW:
				setView(VIEW_EDEFAULT);
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
			case LDocPackage.LDOC_VIEW_DOCUMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LDocPackage.LDOC_VIEW_DOCUMENT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case LDocPackage.LDOC_VIEW_DOCUMENT__DESCRIPTION:
				return description != null;
			case LDocPackage.LDOC_VIEW_DOCUMENT__VIEW:
				return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", language: ");
		result.append(language);
		result.append(", view: ");
		result.append(view);
		result.append(')');
		return result.toString();
	}

} //LDocViewDocumentImpl
