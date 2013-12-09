/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDescription;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Vaaclipse View Document</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl#getName <em>Name</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl#getView <em>View</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl#getDescription <em>Description
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VaaclipseViewDocumentImpl extends MinimalEObjectImpl.Container implements
		VaaclipseViewDocument {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getView() <em>View</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getView() <em>View</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getView()
	 * @generated
	 * @ordered
	 */
	protected String view = VIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected VaaclipseViewDescription description;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VaaclipseViewDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.VAACLIPSE_VIEW_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getView() {
		return view;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setView(String newView) {
		String oldView = view;
		view = newView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__VIEW, oldView, view));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VaaclipseViewDescription getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDescription(VaaclipseViewDescription newDescription,
			NotificationChain msgs) {
		VaaclipseViewDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION, oldDescription,
					newDescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDescription(VaaclipseViewDescription newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION, newDescription,
					newDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION:
			return basicSetDescription(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__NAME:
			return getName();
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__VIEW:
			return getView();
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION:
			return getDescription();
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
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__NAME:
			setName((String) newValue);
			return;
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__VIEW:
			setView((String) newValue);
			return;
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION:
			setDescription((VaaclipseViewDescription) newValue);
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
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__VIEW:
			setView(VIEW_EDEFAULT);
			return;
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION:
			setDescription((VaaclipseViewDescription) null);
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
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__VIEW:
			return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
		case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT__DESCRIPTION:
			return description != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", view: ");
		result.append(view);
		result.append(')');
		return result.toString();
	}

} // VaaclipseViewDocumentImpl
