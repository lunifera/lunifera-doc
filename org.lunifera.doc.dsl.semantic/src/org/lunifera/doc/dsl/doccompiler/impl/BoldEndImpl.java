/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.doccompiler.BoldEnd;
import org.lunifera.doc.dsl.doccompiler.BoldStart;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bold End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.BoldEndImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoldEndImpl extends LinePartImpl implements BoldEnd {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected BoldStart start;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoldEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.BOLD_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoldStart getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (BoldStart)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.BOLD_END__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoldStart basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(BoldStart newStart) {
		BoldStart oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.BOLD_END__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocCompilerPackage.BOLD_END__START:
				if (resolve) return getStart();
				return basicGetStart();
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
			case DocCompilerPackage.BOLD_END__START:
				setStart((BoldStart)newValue);
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
			case DocCompilerPackage.BOLD_END__START:
				setStart((BoldStart)null);
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
			case DocCompilerPackage.BOLD_END__START:
				return start != null;
		}
		return super.eIsSet(featureID);
	}

} //BoldEndImpl
