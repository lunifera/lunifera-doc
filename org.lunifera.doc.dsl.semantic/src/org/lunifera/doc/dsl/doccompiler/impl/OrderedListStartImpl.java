/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.ListElementStart;
import org.lunifera.doc.dsl.doccompiler.OrderedListEnd;
import org.lunifera.doc.dsl.doccompiler.OrderedListStart;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOrderedList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordered List Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.OrderedListStartImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.OrderedListStartImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.impl.OrderedListStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderedListStartImpl extends LinePartImpl implements OrderedListStart {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected RichStringOrderedList content;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ListElementStart> elements;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected OrderedListEnd end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderedListStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.ORDERED_LIST_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringOrderedList getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject)content;
			content = (RichStringOrderedList)eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.ORDERED_LIST_START__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringOrderedList basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(RichStringOrderedList newContent) {
		RichStringOrderedList oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.ORDERED_LIST_START__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListElementStart> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<ListElementStart>(ListElementStart.class, this, DocCompilerPackage.ORDERED_LIST_START__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedListEnd getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (OrderedListEnd)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DocCompilerPackage.ORDERED_LIST_START__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedListEnd basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(OrderedListEnd newEnd) {
		OrderedListEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocCompilerPackage.ORDERED_LIST_START__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocCompilerPackage.ORDERED_LIST_START__CONTENT:
				if (resolve) return getContent();
				return basicGetContent();
			case DocCompilerPackage.ORDERED_LIST_START__ELEMENTS:
				return getElements();
			case DocCompilerPackage.ORDERED_LIST_START__END:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocCompilerPackage.ORDERED_LIST_START__CONTENT:
				setContent((RichStringOrderedList)newValue);
				return;
			case DocCompilerPackage.ORDERED_LIST_START__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ListElementStart>)newValue);
				return;
			case DocCompilerPackage.ORDERED_LIST_START__END:
				setEnd((OrderedListEnd)newValue);
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
			case DocCompilerPackage.ORDERED_LIST_START__CONTENT:
				setContent((RichStringOrderedList)null);
				return;
			case DocCompilerPackage.ORDERED_LIST_START__ELEMENTS:
				getElements().clear();
				return;
			case DocCompilerPackage.ORDERED_LIST_START__END:
				setEnd((OrderedListEnd)null);
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
			case DocCompilerPackage.ORDERED_LIST_START__CONTENT:
				return content != null;
			case DocCompilerPackage.ORDERED_LIST_START__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case DocCompilerPackage.ORDERED_LIST_START__END:
				return end != null;
		}
		return super.eIsSet(featureID);
	}

} //OrderedListStartImpl
