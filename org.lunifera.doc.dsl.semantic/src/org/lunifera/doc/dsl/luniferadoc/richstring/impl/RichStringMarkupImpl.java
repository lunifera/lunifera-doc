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

import org.lunifera.doc.dsl.luniferadoc.richstring.LunDocRichstringPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.MarkupOrientation;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rich String Markup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#isSmall <em>Small</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringMarkupImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RichStringMarkupImpl extends XExpressionImpl implements RichStringMarkup {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSmall() <em>Small</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmall()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SMALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSmall() <em>Small</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmall()
	 * @generated
	 * @ordered
	 */
	protected boolean small = SMALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final MarkupOrientation ORIENTATION_EDEFAULT = MarkupOrientation.LEFT;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected MarkupOrientation orientation = ORIENTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RichStringMarkupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LunDocRichstringPackage.Literals.RICH_STRING_MARKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_MARKUP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_MARKUP__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSmall() {
		return small;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmall(boolean newSmall) {
		boolean oldSmall = small;
		small = newSmall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_MARKUP__SMALL, oldSmall, small));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarkupOrientation getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(MarkupOrientation newOrientation) {
		MarkupOrientation oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_MARKUP__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs) {
		XExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(XExpression newExpression) {
		if (newExpression != expression) {
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
				return basicSetExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ID:
				return getId();
			case LunDocRichstringPackage.RICH_STRING_MARKUP__STYLE:
				return getStyle();
			case LunDocRichstringPackage.RICH_STRING_MARKUP__SMALL:
				return isSmall();
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ORIENTATION:
				return getOrientation();
			case LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
				return getExpression();
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
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ID:
				setId((String)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__STYLE:
				setStyle((String)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__SMALL:
				setSmall((Boolean)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ORIENTATION:
				setOrientation((MarkupOrientation)newValue);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
				setExpression((XExpression)newValue);
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
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ID:
				setId(ID_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__SMALL:
				setSmall(SMALL_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
				setExpression((XExpression)null);
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
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case LunDocRichstringPackage.RICH_STRING_MARKUP__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case LunDocRichstringPackage.RICH_STRING_MARKUP__SMALL:
				return small != SMALL_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case LunDocRichstringPackage.RICH_STRING_MARKUP__EXPRESSION:
				return expression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", style: ");
		result.append(style);
		result.append(", small: ");
		result.append(small);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(')');
		return result.toString();
	}

} //RichStringMarkupImpl
