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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.ElseIfCondition;
import org.lunifera.doc.dsl.doccompiler.ElseStart;
import org.lunifera.doc.dsl.doccompiler.EndIf;
import org.lunifera.doc.dsl.doccompiler.IfConditionStart;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Condition Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl#getRichStringIf <em>Rich String If</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl#getElseStart <em>Else Start</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl#getElseIfConditions <em>Else If Conditions</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.IfConditionStartImpl#getEndIf <em>End If</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfConditionStartImpl extends LinePartImpl implements IfConditionStart {
	/**
	 * The cached value of the '{@link #getRichStringIf() <em>Rich String If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRichStringIf()
	 * @generated
	 * @ordered
	 */
	protected RichStringIf richStringIf;

	/**
	 * The cached value of the '{@link #getElseStart() <em>Else Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseStart()
	 * @generated
	 * @ordered
	 */
	protected ElseStart elseStart;

	/**
	 * The cached value of the '{@link #getElseIfConditions() <em>Else If Conditions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseIfConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ElseIfCondition> elseIfConditions;

	/**
	 * The cached value of the '{@link #getEndIf() <em>End If</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndIf()
	 * @generated
	 * @ordered
	 */
	protected EndIf endIf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfConditionStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.IF_CONDITION_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringIf getRichStringIf() {
		if (richStringIf != null && richStringIf.eIsProxy()) {
			InternalEObject oldRichStringIf = (InternalEObject)richStringIf;
			richStringIf = (RichStringIf)eResolveProxy(oldRichStringIf);
			if (richStringIf != oldRichStringIf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.IF_CONDITION_START__RICH_STRING_IF, oldRichStringIf, richStringIf));
			}
		}
		return richStringIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringIf basicGetRichStringIf() {
		return richStringIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRichStringIf(RichStringIf newRichStringIf) {
		RichStringIf oldRichStringIf = richStringIf;
		richStringIf = newRichStringIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.IF_CONDITION_START__RICH_STRING_IF, oldRichStringIf, richStringIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseStart getElseStart() {
		if (elseStart != null && elseStart.eIsProxy()) {
			InternalEObject oldElseStart = (InternalEObject)elseStart;
			elseStart = (ElseStart)eResolveProxy(oldElseStart);
			if (elseStart != oldElseStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.IF_CONDITION_START__ELSE_START, oldElseStart, elseStart));
			}
		}
		return elseStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElseStart basicGetElseStart() {
		return elseStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseStart(ElseStart newElseStart, NotificationChain msgs) {
		ElseStart oldElseStart = elseStart;
		elseStart = newElseStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocCompilerPackage.IF_CONDITION_START__ELSE_START, oldElseStart, newElseStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseStart(ElseStart newElseStart) {
		if (newElseStart != elseStart) {
			NotificationChain msgs = null;
			if (elseStart != null)
				msgs = ((InternalEObject)elseStart).eInverseRemove(this, DocCompilerPackage.ELSE_START__IF_CONDITION_START, ElseStart.class, msgs);
			if (newElseStart != null)
				msgs = ((InternalEObject)newElseStart).eInverseAdd(this, DocCompilerPackage.ELSE_START__IF_CONDITION_START, ElseStart.class, msgs);
			msgs = basicSetElseStart(newElseStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.IF_CONDITION_START__ELSE_START, newElseStart, newElseStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElseIfCondition> getElseIfConditions() {
		if (elseIfConditions == null) {
			elseIfConditions = new EObjectWithInverseResolvingEList<ElseIfCondition>(ElseIfCondition.class, this, DocCompilerPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS, DocCompilerPackage.ELSE_IF_CONDITION__IF_CONDITION_START);
		}
		return elseIfConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndIf getEndIf() {
		if (endIf != null && endIf.eIsProxy()) {
			InternalEObject oldEndIf = (InternalEObject)endIf;
			endIf = (EndIf)eResolveProxy(oldEndIf);
			if (endIf != oldEndIf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.IF_CONDITION_START__END_IF, oldEndIf, endIf));
			}
		}
		return endIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndIf basicGetEndIf() {
		return endIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndIf(EndIf newEndIf) {
		EndIf oldEndIf = endIf;
		endIf = newEndIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.IF_CONDITION_START__END_IF, oldEndIf, endIf));
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
			case DocCompilerPackage.IF_CONDITION_START__ELSE_START:
				if (elseStart != null)
					msgs = ((InternalEObject)elseStart).eInverseRemove(this, DocCompilerPackage.ELSE_START__IF_CONDITION_START, ElseStart.class, msgs);
				return basicSetElseStart((ElseStart)otherEnd, msgs);
			case DocCompilerPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElseIfConditions()).basicAdd(otherEnd, msgs);
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
			case DocCompilerPackage.IF_CONDITION_START__ELSE_START:
				return basicSetElseStart(null, msgs);
			case DocCompilerPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS:
				return ((InternalEList<?>)getElseIfConditions()).basicRemove(otherEnd, msgs);
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
			case DocCompilerPackage.IF_CONDITION_START__RICH_STRING_IF:
				if (resolve) return getRichStringIf();
				return basicGetRichStringIf();
			case DocCompilerPackage.IF_CONDITION_START__ELSE_START:
				if (resolve) return getElseStart();
				return basicGetElseStart();
			case DocCompilerPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS:
				return getElseIfConditions();
			case DocCompilerPackage.IF_CONDITION_START__END_IF:
				if (resolve) return getEndIf();
				return basicGetEndIf();
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
			case DocCompilerPackage.IF_CONDITION_START__RICH_STRING_IF:
				setRichStringIf((RichStringIf)newValue);
				return;
			case DocCompilerPackage.IF_CONDITION_START__ELSE_START:
				setElseStart((ElseStart)newValue);
				return;
			case DocCompilerPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS:
				getElseIfConditions().clear();
				getElseIfConditions().addAll((Collection<? extends ElseIfCondition>)newValue);
				return;
			case DocCompilerPackage.IF_CONDITION_START__END_IF:
				setEndIf((EndIf)newValue);
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
			case DocCompilerPackage.IF_CONDITION_START__RICH_STRING_IF:
				setRichStringIf((RichStringIf)null);
				return;
			case DocCompilerPackage.IF_CONDITION_START__ELSE_START:
				setElseStart((ElseStart)null);
				return;
			case DocCompilerPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS:
				getElseIfConditions().clear();
				return;
			case DocCompilerPackage.IF_CONDITION_START__END_IF:
				setEndIf((EndIf)null);
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
			case DocCompilerPackage.IF_CONDITION_START__RICH_STRING_IF:
				return richStringIf != null;
			case DocCompilerPackage.IF_CONDITION_START__ELSE_START:
				return elseStart != null;
			case DocCompilerPackage.IF_CONDITION_START__ELSE_IF_CONDITIONS:
				return elseIfConditions != null && !elseIfConditions.isEmpty();
			case DocCompilerPackage.IF_CONDITION_START__END_IF:
				return endIf != null;
		}
		return super.eIsSet(featureID);
	}

} //IfConditionStartImpl
