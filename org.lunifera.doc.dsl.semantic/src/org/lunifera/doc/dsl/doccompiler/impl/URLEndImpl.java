/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.URLEnd;
import org.lunifera.doc.dsl.doccompiler.URLStart;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>URL End</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.URLEndImpl#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLEndImpl extends LinePartImpl implements URLEnd {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected URLStart start;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected URLEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.URL_END;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URLStart getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (URLStart)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.URL_END__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URLStart basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(URLStart newStart, NotificationChain msgs) {
		URLStart oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocCompilerPackage.URL_END__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(URLStart newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, DocCompilerPackage.URL_START__END, URLStart.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, DocCompilerPackage.URL_START__END, URLStart.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.URL_END__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocCompilerPackage.URL_END__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, DocCompilerPackage.URL_START__END, URLStart.class, msgs);
				return basicSetStart((URLStart)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocCompilerPackage.URL_END__START:
				return basicSetStart(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocCompilerPackage.URL_END__START:
				if (resolve) return getStart();
				return basicGetStart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocCompilerPackage.URL_END__START:
				setStart((URLStart)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocCompilerPackage.URL_END__START:
				setStart((URLStart)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocCompilerPackage.URL_END__START:
				return start != null;
		}
		return super.eIsSet(featureID);
	}

} // URLEndImpl
