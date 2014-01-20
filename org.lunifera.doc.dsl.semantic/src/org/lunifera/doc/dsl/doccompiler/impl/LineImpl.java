/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.Line;
import org.lunifera.doc.dsl.doccompiler.LinePart;
import org.lunifera.doc.dsl.doccompiler.ProcessedRichString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.LineImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.LineImpl#getRichString <em>Rich String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LineImpl extends MinimalEObjectImpl.Container implements Line {
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<LinePart> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinePart> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentWithInverseEList<LinePart>(LinePart.class, this, DocCompilerPackage.LINE__PARTS, DocCompilerPackage.LINE_PART__LINE);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessedRichString getRichString() {
		if (eContainerFeatureID() != DocCompilerPackage.LINE__RICH_STRING) return null;
		return (ProcessedRichString)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRichString(ProcessedRichString newRichString, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRichString, DocCompilerPackage.LINE__RICH_STRING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRichString(ProcessedRichString newRichString) {
		if (newRichString != eInternalContainer() || (eContainerFeatureID() != DocCompilerPackage.LINE__RICH_STRING && newRichString != null)) {
			if (EcoreUtil.isAncestor(this, newRichString))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRichString != null)
				msgs = ((InternalEObject)newRichString).eInverseAdd(this, DocCompilerPackage.PROCESSED_RICH_STRING__LINES, ProcessedRichString.class, msgs);
			msgs = basicSetRichString(newRichString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.LINE__RICH_STRING, newRichString, newRichString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocCompilerPackage.LINE__PARTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParts()).basicAdd(otherEnd, msgs);
			case DocCompilerPackage.LINE__RICH_STRING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRichString((ProcessedRichString)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocCompilerPackage.LINE__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case DocCompilerPackage.LINE__RICH_STRING:
				return basicSetRichString(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DocCompilerPackage.LINE__RICH_STRING:
				return eInternalContainer().eInverseRemove(this, DocCompilerPackage.PROCESSED_RICH_STRING__LINES, ProcessedRichString.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocCompilerPackage.LINE__PARTS:
				return getParts();
			case DocCompilerPackage.LINE__RICH_STRING:
				return getRichString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocCompilerPackage.LINE__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends LinePart>)newValue);
				return;
			case DocCompilerPackage.LINE__RICH_STRING:
				setRichString((ProcessedRichString)newValue);
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
			case DocCompilerPackage.LINE__PARTS:
				getParts().clear();
				return;
			case DocCompilerPackage.LINE__RICH_STRING:
				setRichString((ProcessedRichString)null);
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
			case DocCompilerPackage.LINE__PARTS:
				return parts != null && !parts.isEmpty();
			case DocCompilerPackage.LINE__RICH_STRING:
				return getRichString() != null;
		}
		return super.eIsSet(featureID);
	}

} //LineImpl
