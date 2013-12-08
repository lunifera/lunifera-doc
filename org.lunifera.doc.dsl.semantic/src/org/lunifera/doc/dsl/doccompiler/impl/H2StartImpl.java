/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.H2End;
import org.lunifera.doc.dsl.doccompiler.H2Start;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>H2 Start</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.H2StartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class H2StartImpl extends LinePartImpl implements H2Start {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected RichStringH2 content;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected H2End end;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected H2StartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.H2_START;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH2 getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (RichStringH2)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.H2_START__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH2 basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(RichStringH2 newContent) {
		RichStringH2 oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.H2_START__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public H2End getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (H2End)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.H2_START__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public H2End basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(H2End newEnd, NotificationChain msgs) {
		H2End oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocCompilerPackage.H2_START__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(H2End newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, DocCompilerPackage.H2_END__START, H2End.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, DocCompilerPackage.H2_END__START, H2End.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.H2_START__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocCompilerPackage.H2_START__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, DocCompilerPackage.H2_END__START, H2End.class, msgs);
				return basicSetEnd((H2End)otherEnd, msgs);
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
			case DocCompilerPackage.H2_START__END:
				return basicSetEnd(null, msgs);
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
			case DocCompilerPackage.H2_START__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case DocCompilerPackage.H2_START__END:
				if (resolve) return getEnd();
				return basicGetEnd();
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
			case DocCompilerPackage.H2_START__CONTENT:
				setContent((RichStringH2)newValue);
				return;
			case DocCompilerPackage.H2_START__END:
				setEnd((H2End)newValue);
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
			case DocCompilerPackage.H2_START__CONTENT:
				setContent((RichStringH2)null);
				return;
			case DocCompilerPackage.H2_START__END:
				setEnd((H2End)null);
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
			case DocCompilerPackage.H2_START__CONTENT:
				return content != null;
			case DocCompilerPackage.H2_START__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} // H2StartImpl
