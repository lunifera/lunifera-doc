/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringEntityRef;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rich String Entity Ref</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringEntityRefImpl#getEntityDoc <em>Entity Doc</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RichStringEntityRefImpl extends RichStringMarkupImpl implements RichStringEntityRef {
	/**
	 * The cached value of the '{@link #getEntityDoc() <em>Entity Doc</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getEntityDoc()
	 * @generated
	 * @ordered
	 */
	protected EntityDocument entityDoc;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RichStringEntityRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RichstringPackage.Literals.RICH_STRING_ENTITY_REF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDocument getEntityDoc() {
		if (entityDoc != null && entityDoc.eIsProxy()) {
			InternalEObject oldEntityDoc = (InternalEObject) entityDoc;
			entityDoc = (EntityDocument) eResolveProxy(oldEntityDoc);
			if (entityDoc != oldEntityDoc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RichstringPackage.RICH_STRING_ENTITY_REF__ENTITY_DOC, oldEntityDoc,
							entityDoc));
			}
		}
		return entityDoc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EntityDocument basicGetEntityDoc() {
		return entityDoc;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEntityDoc(EntityDocument newEntityDoc) {
		EntityDocument oldEntityDoc = entityDoc;
		entityDoc = newEntityDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_ENTITY_REF__ENTITY_DOC, oldEntityDoc, entityDoc));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RichstringPackage.RICH_STRING_ENTITY_REF__ENTITY_DOC:
			if (resolve)
				return getEntityDoc();
			return basicGetEntityDoc();
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
		case RichstringPackage.RICH_STRING_ENTITY_REF__ENTITY_DOC:
			setEntityDoc((EntityDocument) newValue);
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
		case RichstringPackage.RICH_STRING_ENTITY_REF__ENTITY_DOC:
			setEntityDoc((EntityDocument) null);
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
		case RichstringPackage.RICH_STRING_ENTITY_REF__ENTITY_DOC:
			return entityDoc != null;
		}
		return super.eIsSet(featureID);
	}

} // RichStringEntityRefImpl
