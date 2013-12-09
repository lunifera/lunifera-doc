/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDescription;
import org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>BPM Human Task Document</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDocumentImpl#getName <em>Name</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDocumentImpl#getTask <em>Task</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDocumentImpl#getDescription <em>Description
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BPMHumanTaskDocumentImpl extends MinimalEObjectImpl.Container implements
		BPMHumanTaskDocument {
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
	 * The default value of the '{@link #getTask() <em>Task</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected String task = TASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected BPMHumanTaskDescription description;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BPMHumanTaskDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.BPM_HUMAN_TASK_DOCUMENT;
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
					DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTask(String newTask) {
		String oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BPMHumanTaskDescription getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDescription(BPMHumanTaskDescription newDescription,
			NotificationChain msgs) {
		BPMHumanTaskDescription oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION, oldDescription,
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
	public void setDescription(BPMHumanTaskDescription newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject) description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject) newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION, newDescription,
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
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION:
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
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__NAME:
			return getName();
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__TASK:
			return getTask();
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION:
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
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__NAME:
			setName((String) newValue);
			return;
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__TASK:
			setTask((String) newValue);
			return;
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION:
			setDescription((BPMHumanTaskDescription) newValue);
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
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__TASK:
			setTask(TASK_EDEFAULT);
			return;
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION:
			setDescription((BPMHumanTaskDescription) null);
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
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__TASK:
			return TASK_EDEFAULT == null ? task != null : !TASK_EDEFAULT.equals(task);
		case DocumentPackage.BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION:
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
		result.append(", task: ");
		result.append(task);
		result.append(')');
		return result.toString();
	}

} // BPMHumanTaskDocumentImpl
