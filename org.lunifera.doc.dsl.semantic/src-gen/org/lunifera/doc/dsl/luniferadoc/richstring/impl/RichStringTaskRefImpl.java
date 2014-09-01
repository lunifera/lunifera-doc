/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTaskRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Task Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTaskRefImpl#getTaskDoc <em>Task Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringTaskRefImpl extends RichStringMarkupImpl implements RichStringTaskRef {
	/**
	 * The cached value of the '{@link #getTaskDoc() <em>Task Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDoc()
	 * @generated
	 * @ordered
	 */
	protected LDocHumanTaskDocument taskDoc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringTaskRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LunDocRichstringPackage.Literals.RICH_STRING_TASK_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocHumanTaskDocument getTaskDoc() {
		if (taskDoc != null && taskDoc.eIsProxy()) {
			InternalEObject oldTaskDoc = (InternalEObject)taskDoc;
			taskDoc = (LDocHumanTaskDocument)eResolveProxy(oldTaskDoc);
			if (taskDoc != oldTaskDoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocRichstringPackage.RICH_STRING_TASK_REF__TASK_DOC, oldTaskDoc, taskDoc));
			}
		}
		return taskDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocHumanTaskDocument basicGetTaskDoc() {
		return taskDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskDoc(LDocHumanTaskDocument newTaskDoc) {
		LDocHumanTaskDocument oldTaskDoc = taskDoc;
		taskDoc = newTaskDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_TASK_REF__TASK_DOC, oldTaskDoc, taskDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_TASK_REF__TASK_DOC:
				if (resolve) return getTaskDoc();
				return basicGetTaskDoc();
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
			case LunDocRichstringPackage.RICH_STRING_TASK_REF__TASK_DOC:
				setTaskDoc((LDocHumanTaskDocument)newValue);
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
			case LunDocRichstringPackage.RICH_STRING_TASK_REF__TASK_DOC:
				setTaskDoc((LDocHumanTaskDocument)null);
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
			case LunDocRichstringPackage.RICH_STRING_TASK_REF__TASK_DOC:
				return taskDoc != null;
		}
		return super.eIsSet(featureID);
	}

} //RichStringTaskRefImpl
