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
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>URL Start</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.URLStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class URLStartImpl extends LinePartImpl implements URLStart {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected RichStringURL content;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected URLEnd end;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected URLStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.URL_START;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringURL getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (RichStringURL)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.URL_START__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringURL basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(RichStringURL newContent) {
		RichStringURL oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.URL_START__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URLEnd getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (URLEnd)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.URL_START__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public URLEnd basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(URLEnd newEnd, NotificationChain msgs) {
		URLEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocCompilerPackage.URL_START__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(URLEnd newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, DocCompilerPackage.URL_END__START, URLEnd.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, DocCompilerPackage.URL_END__START, URLEnd.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.URL_START__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocCompilerPackage.URL_START__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, DocCompilerPackage.URL_END__START, URLEnd.class, msgs);
				return basicSetEnd((URLEnd)otherEnd, msgs);
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
			case DocCompilerPackage.URL_START__END:
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
			case DocCompilerPackage.URL_START__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case DocCompilerPackage.URL_START__END:
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
			case DocCompilerPackage.URL_START__CONTENT:
				setContent((RichStringURL)newValue);
				return;
			case DocCompilerPackage.URL_START__END:
				setEnd((URLEnd)newValue);
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
			case DocCompilerPackage.URL_START__CONTENT:
				setContent((RichStringURL)null);
				return;
			case DocCompilerPackage.URL_START__END:
				setEnd((URLEnd)null);
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
			case DocCompilerPackage.URL_START__CONTENT:
				return content != null;
			case DocCompilerPackage.URL_START__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} // URLStartImpl
