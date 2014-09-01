/**
 */
package org.lunifera.doc.dsl.luniferadoc.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.lunifera.doc.dsl.luniferadoc.doccompiler.LunDocCompilerPackage;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanEnd;
import org.lunifera.doc.dsl.luniferadoc.doccompiler.SpanStart;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSpan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.SpanStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.doccompiler.impl.SpanStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpanStartImpl extends LinePartImpl implements SpanStart {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected RichStringSpan content;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected SpanEnd end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LunDocCompilerPackage.Literals.SPAN_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringSpan getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (RichStringSpan)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.SPAN_START__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringSpan basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(RichStringSpan newContent) {
		RichStringSpan oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.SPAN_START__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanEnd getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (SpanEnd)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LunDocCompilerPackage.SPAN_START__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanEnd basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(SpanEnd newEnd) {
		SpanEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LunDocCompilerPackage.SPAN_START__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LunDocCompilerPackage.SPAN_START__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case LunDocCompilerPackage.SPAN_START__END:
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
			case LunDocCompilerPackage.SPAN_START__CONTENT:
				setContent((RichStringSpan)newValue);
				return;
			case LunDocCompilerPackage.SPAN_START__END:
				setEnd((SpanEnd)newValue);
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
			case LunDocCompilerPackage.SPAN_START__CONTENT:
				setContent((RichStringSpan)null);
				return;
			case LunDocCompilerPackage.SPAN_START__END:
				setEnd((SpanEnd)null);
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
			case LunDocCompilerPackage.SPAN_START__CONTENT:
				return content != null;
			case LunDocCompilerPackage.SPAN_START__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //SpanStartImpl
