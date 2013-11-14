/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.Markup;
import org.lunifera.doc.dsl.luniferadoc.RichStringMarkup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.MarkupImpl#getMarkup <em>Markup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkupImpl extends LinePartImpl implements Markup {
	/**
	 * The cached value of the '{@link #getMarkup() <em>Markup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkup()
	 * @generated
	 * @ordered
	 */
	protected RichStringMarkup markup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.MARKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringMarkup getMarkup() {
		if (markup != null && markup.eIsProxy()) {
			InternalEObject oldMarkup = (InternalEObject)markup;
			markup = (RichStringMarkup)eResolveProxy(oldMarkup);
			if (markup != oldMarkup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.MARKUP__MARKUP, oldMarkup, markup));
			}
		}
		return markup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringMarkup basicGetMarkup() {
		return markup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkup(RichStringMarkup newMarkup) {
		RichStringMarkup oldMarkup = markup;
		markup = newMarkup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.MARKUP__MARKUP, oldMarkup, markup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocCompilerPackage.MARKUP__MARKUP:
				if (resolve) return getMarkup();
				return basicGetMarkup();
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
			case DocCompilerPackage.MARKUP__MARKUP:
				setMarkup((RichStringMarkup)newValue);
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
			case DocCompilerPackage.MARKUP__MARKUP:
				setMarkup((RichStringMarkup)null);
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
			case DocCompilerPackage.MARKUP__MARKUP:
				return markup != null;
		}
		return super.eIsSet(featureID);
	}

} //MarkupImpl
