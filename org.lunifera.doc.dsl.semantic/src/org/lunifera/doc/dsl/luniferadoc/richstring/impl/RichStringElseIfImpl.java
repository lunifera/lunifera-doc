/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rich String Else If</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringElseIfImpl#getIf <em>If</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringElseIfImpl#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RichStringElseIfImpl extends MinimalEObjectImpl.Container implements RichStringElseIf {
	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected XExpression if_;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected XExpression then;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RichStringElseIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RichstringPackage.Literals.RICH_STRING_ELSE_IF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XExpression getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetIf(XExpression newIf, NotificationChain msgs) {
		XExpression oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_ELSE_IF__IF, oldIf, newIf);
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
	public void setIf(XExpression newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject) if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- RichstringPackage.RICH_STRING_ELSE_IF__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject) newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- RichstringPackage.RICH_STRING_ELSE_IF__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RichstringPackage.RICH_STRING_ELSE_IF__IF, newIf,
					newIf));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XExpression getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetThen(XExpression newThen, NotificationChain msgs) {
		XExpression oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_ELSE_IF__THEN, oldThen, newThen);
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
	public void setThen(XExpression newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject) then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- RichstringPackage.RICH_STRING_ELSE_IF__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject) newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- RichstringPackage.RICH_STRING_ELSE_IF__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RichstringPackage.RICH_STRING_ELSE_IF__THEN, newThen,
					newThen));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RichstringPackage.RICH_STRING_ELSE_IF__IF:
			return basicSetIf(null, msgs);
		case RichstringPackage.RICH_STRING_ELSE_IF__THEN:
			return basicSetThen(null, msgs);
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
		case RichstringPackage.RICH_STRING_ELSE_IF__IF:
			return getIf();
		case RichstringPackage.RICH_STRING_ELSE_IF__THEN:
			return getThen();
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
		case RichstringPackage.RICH_STRING_ELSE_IF__IF:
			setIf((XExpression) newValue);
			return;
		case RichstringPackage.RICH_STRING_ELSE_IF__THEN:
			setThen((XExpression) newValue);
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
		case RichstringPackage.RICH_STRING_ELSE_IF__IF:
			setIf((XExpression) null);
			return;
		case RichstringPackage.RICH_STRING_ELSE_IF__THEN:
			setThen((XExpression) null);
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
		case RichstringPackage.RICH_STRING_ELSE_IF__IF:
			return if_ != null;
		case RichstringPackage.RICH_STRING_ELSE_IF__THEN:
			return then != null;
		}
		return super.eIsSet(featureID);
	}

} // RichStringElseIfImpl
