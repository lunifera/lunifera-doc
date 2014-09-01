/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringProcessRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Process Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringProcessRefImpl#getBpmDoc <em>Bpm Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringProcessRefImpl extends RichStringMarkupImpl implements RichStringProcessRef {
	/**
	 * The cached value of the '{@link #getBpmDoc() <em>Bpm Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmDoc()
	 * @generated
	 * @ordered
	 */
	protected LDocBPMProcessDocument bpmDoc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringProcessRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LunDocRichstringPackage.Literals.RICH_STRING_PROCESS_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocBPMProcessDocument getBpmDoc() {
		if (bpmDoc != null && bpmDoc.eIsProxy()) {
			InternalEObject oldBpmDoc = (InternalEObject)bpmDoc;
			bpmDoc = (LDocBPMProcessDocument)eResolveProxy(oldBpmDoc);
			if (bpmDoc != oldBpmDoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocRichstringPackage.RICH_STRING_PROCESS_REF__BPM_DOC, oldBpmDoc, bpmDoc));
			}
		}
		return bpmDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocBPMProcessDocument basicGetBpmDoc() {
		return bpmDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBpmDoc(LDocBPMProcessDocument newBpmDoc) {
		LDocBPMProcessDocument oldBpmDoc = bpmDoc;
		bpmDoc = newBpmDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_PROCESS_REF__BPM_DOC, oldBpmDoc, bpmDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_PROCESS_REF__BPM_DOC:
				if (resolve) return getBpmDoc();
				return basicGetBpmDoc();
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
			case LunDocRichstringPackage.RICH_STRING_PROCESS_REF__BPM_DOC:
				setBpmDoc((LDocBPMProcessDocument)newValue);
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
			case LunDocRichstringPackage.RICH_STRING_PROCESS_REF__BPM_DOC:
				setBpmDoc((LDocBPMProcessDocument)null);
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
			case LunDocRichstringPackage.RICH_STRING_PROCESS_REF__BPM_DOC:
				return bpmDoc != null;
		}
		return super.eIsSet(featureID);
	}

} //RichStringProcessRefImpl
