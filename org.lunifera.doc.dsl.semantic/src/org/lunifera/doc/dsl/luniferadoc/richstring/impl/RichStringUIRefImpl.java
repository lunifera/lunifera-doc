/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.LDocUiDocument;

import org.lunifera.doc.dsl.luniferadoc.richstring.LDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUIRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String UI Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringUIRefImpl#getUiDoc <em>Ui Doc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringUIRefImpl extends RichStringMarkupImpl implements RichStringUIRef {
	/**
	 * The cached value of the '{@link #getUiDoc() <em>Ui Doc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiDoc()
	 * @generated
	 * @ordered
	 */
	protected LDocUiDocument uiDoc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringUIRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDocRichstringPackage.Literals.RICH_STRING_UI_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocUiDocument getUiDoc() {
		if (uiDoc != null && uiDoc.eIsProxy()) {
			InternalEObject oldUiDoc = (InternalEObject)uiDoc;
			uiDoc = (LDocUiDocument)eResolveProxy(oldUiDoc);
			if (uiDoc != oldUiDoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDocRichstringPackage.RICH_STRING_UI_REF__UI_DOC, oldUiDoc, uiDoc));
			}
		}
		return uiDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocUiDocument basicGetUiDoc() {
		return uiDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiDoc(LDocUiDocument newUiDoc) {
		LDocUiDocument oldUiDoc = uiDoc;
		uiDoc = newUiDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDocRichstringPackage.RICH_STRING_UI_REF__UI_DOC, oldUiDoc, uiDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDocRichstringPackage.RICH_STRING_UI_REF__UI_DOC:
				if (resolve) return getUiDoc();
				return basicGetUiDoc();
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
			case LDocRichstringPackage.RICH_STRING_UI_REF__UI_DOC:
				setUiDoc((LDocUiDocument)newValue);
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
			case LDocRichstringPackage.RICH_STRING_UI_REF__UI_DOC:
				setUiDoc((LDocUiDocument)null);
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
			case LDocRichstringPackage.RICH_STRING_UI_REF__UI_DOC:
				return uiDoc != null;
		}
		return super.eIsSet(featureID);
	}

} //RichStringUIRefImpl
