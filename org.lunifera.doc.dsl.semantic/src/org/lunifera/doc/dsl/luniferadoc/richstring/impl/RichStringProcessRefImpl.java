/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rich String Process Ref</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringProcessRefImpl#getProcessDoc <em>Process Doc
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RichStringProcessRefImpl extends RichStringMarkupImpl implements RichStringProcessRef {
	/**
	 * The cached value of the '{@link #getProcessDoc() <em>Process Doc</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProcessDoc()
	 * @generated
	 * @ordered
	 */
	protected BPMProcessDocument processDoc;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RichStringProcessRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RichstringPackage.Literals.RICH_STRING_PROCESS_REF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BPMProcessDocument getProcessDoc() {
		if (processDoc != null && processDoc.eIsProxy()) {
			InternalEObject oldProcessDoc = (InternalEObject) processDoc;
			processDoc = (BPMProcessDocument) eResolveProxy(oldProcessDoc);
			if (processDoc != oldProcessDoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RichstringPackage.RICH_STRING_PROCESS_REF__PROCESS_DOC, oldProcessDoc,
							processDoc));
			}
		}
		return processDoc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BPMProcessDocument basicGetProcessDoc() {
		return processDoc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProcessDoc(BPMProcessDocument newProcessDoc) {
		BPMProcessDocument oldProcessDoc = processDoc;
		processDoc = newProcessDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_PROCESS_REF__PROCESS_DOC, oldProcessDoc,
					processDoc));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RichstringPackage.RICH_STRING_PROCESS_REF__PROCESS_DOC:
			if (resolve)
				return getProcessDoc();
			return basicGetProcessDoc();
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
		case RichstringPackage.RICH_STRING_PROCESS_REF__PROCESS_DOC:
			setProcessDoc((BPMProcessDocument) newValue);
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
		case RichstringPackage.RICH_STRING_PROCESS_REF__PROCESS_DOC:
			setProcessDoc((BPMProcessDocument) null);
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
		case RichstringPackage.RICH_STRING_PROCESS_REF__PROCESS_DOC:
			return processDoc != null;
		}
		return super.eIsSet(featureID);
	}

} // RichStringProcessRefImpl
