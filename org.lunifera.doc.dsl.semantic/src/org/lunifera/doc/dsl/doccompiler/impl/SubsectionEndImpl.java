/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.SubsectionEnd;
import org.lunifera.doc.dsl.doccompiler.SubsectionStart;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Subsection End</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.impl.SubsectionEndImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class SubsectionEndImpl extends LinePartImpl implements SubsectionEnd {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected SubsectionStart start;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SubsectionEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.SUBSECTION_END;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubsectionStart getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject) start;
			start = (SubsectionStart) eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DocCompilerPackage.SUBSECTION_END__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SubsectionStart basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStart(SubsectionStart newStart, NotificationChain msgs) {
		SubsectionStart oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DocCompilerPackage.SUBSECTION_END__START, oldStart, newStart);
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
	public void setStart(SubsectionStart newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject) start).eInverseRemove(this,
						DocCompilerPackage.SUBSECTION_START__END, SubsectionStart.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject) newStart).eInverseAdd(this,
						DocCompilerPackage.SUBSECTION_START__END, SubsectionStart.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocCompilerPackage.SUBSECTION_END__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case DocCompilerPackage.SUBSECTION_END__START:
			if (start != null)
				msgs = ((InternalEObject) start).eInverseRemove(this,
						DocCompilerPackage.SUBSECTION_START__END, SubsectionStart.class, msgs);
			return basicSetStart((SubsectionStart) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case DocCompilerPackage.SUBSECTION_END__START:
			return basicSetStart(null, msgs);
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
		case DocCompilerPackage.SUBSECTION_END__START:
			if (resolve)
				return getStart();
			return basicGetStart();
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
		case DocCompilerPackage.SUBSECTION_END__START:
			setStart((SubsectionStart) newValue);
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
		case DocCompilerPackage.SUBSECTION_END__START:
			setStart((SubsectionStart) null);
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
		case DocCompilerPackage.SUBSECTION_END__START:
			return start != null;
		}
		return super.eIsSet(featureID);
	}

} // SubsectionEndImpl
