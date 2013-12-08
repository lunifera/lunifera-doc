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
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bold Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.BoldStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BoldStartImpl extends LinePartImpl implements BoldStart {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected RichStringBold content;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected BoldEnd end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoldStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.BOLD_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringBold getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (RichStringBold)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.BOLD_START__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringBold basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(RichStringBold newContent) {
		RichStringBold oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.BOLD_START__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoldEnd getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (BoldEnd)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.BOLD_START__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoldEnd basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(BoldEnd newEnd) {
		BoldEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.BOLD_START__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocCompilerPackage.BOLD_START__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case DocCompilerPackage.BOLD_START__END:
				if (resolve) return getEnd();
				return basicGetEnd();
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
			case DocCompilerPackage.BOLD_START__CONTENT:
				setContent((RichStringBold)newValue);
				return;
			case DocCompilerPackage.BOLD_START__END:
				setEnd((BoldEnd)newValue);
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
			case DocCompilerPackage.BOLD_START__CONTENT:
				setContent((RichStringBold)null);
				return;
			case DocCompilerPackage.BOLD_START__END:
				setEnd((BoldEnd)null);
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
			case DocCompilerPackage.BOLD_START__CONTENT:
				return content != null;
			case DocCompilerPackage.BOLD_START__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //BoldStartImpl
