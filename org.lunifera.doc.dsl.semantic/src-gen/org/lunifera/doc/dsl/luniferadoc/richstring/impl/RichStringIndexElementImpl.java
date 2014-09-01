/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.richstring.IndexElement;
import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIndexElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Index Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringIndexElementImpl#getIndexElement <em>Index Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RichStringIndexElementImpl extends RichStringMarkupImpl implements RichStringIndexElement {
	/**
	 * The cached value of the '{@link #getIndexElement() <em>Index Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexElement()
	 * @generated
	 * @ordered
	 */
	protected IndexElement indexElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringIndexElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LunDocRichstringPackage.Literals.RICH_STRING_INDEX_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexElement getIndexElement() {
		if (indexElement != null && indexElement.eIsProxy()) {
			InternalEObject oldIndexElement = (InternalEObject)indexElement;
			indexElement = (IndexElement)eResolveProxy(oldIndexElement);
			if (indexElement != oldIndexElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT__INDEX_ELEMENT, oldIndexElement, indexElement));
			}
		}
		return indexElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexElement basicGetIndexElement() {
		return indexElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexElement(IndexElement newIndexElement) {
		IndexElement oldIndexElement = indexElement;
		indexElement = newIndexElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT__INDEX_ELEMENT, oldIndexElement, indexElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT__INDEX_ELEMENT:
				if (resolve) return getIndexElement();
				return basicGetIndexElement();
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
			case LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT__INDEX_ELEMENT:
				setIndexElement((IndexElement)newValue);
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
			case LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT__INDEX_ELEMENT:
				setIndexElement((IndexElement)null);
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
			case LunDocRichstringPackage.RICH_STRING_INDEX_ELEMENT__INDEX_ELEMENT:
				return indexElement != null;
		}
		return super.eIsSet(featureID);
	}

} //RichStringIndexElementImpl
