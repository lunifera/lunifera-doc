/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.XExpressionImpl;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rich String Markup</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#getId <em>Id</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#getClass_ <em>Class</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RichStringMarkupImpl extends XExpressionImpl implements RichStringMarkup {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression expression;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RichStringMarkupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RichstringPackage.Literals.RICH_STRING_MARKUP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_MARKUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_MARKUP__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs) {
		XExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_MARKUP__EXPRESSION, oldExpression, newExpression);
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
	public void setExpression(XExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject) expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- RichstringPackage.RICH_STRING_MARKUP__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject) newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- RichstringPackage.RICH_STRING_MARKUP__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RichstringPackage.RICH_STRING_MARKUP__EXPRESSION, newExpression, newExpression));
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
		case RichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
			return basicSetExpression(null, msgs);
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
		case RichstringPackage.RICH_STRING_MARKUP__ID:
			return getId();
		case RichstringPackage.RICH_STRING_MARKUP__CLASS:
			return getClass_();
		case RichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
			return getExpression();
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
		case RichstringPackage.RICH_STRING_MARKUP__ID:
			setId((String) newValue);
			return;
		case RichstringPackage.RICH_STRING_MARKUP__CLASS:
			setClass((String) newValue);
			return;
		case RichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
			setExpression((XExpression) newValue);
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
		case RichstringPackage.RICH_STRING_MARKUP__ID:
			setId(ID_EDEFAULT);
			return;
		case RichstringPackage.RICH_STRING_MARKUP__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case RichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
			setExpression((XExpression) null);
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
		case RichstringPackage.RICH_STRING_MARKUP__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case RichstringPackage.RICH_STRING_MARKUP__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case RichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
			return expression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", class: ");
		result.append(class_);
		result.append(')');
		return result.toString();
	}

} // RichStringMarkupImpl
