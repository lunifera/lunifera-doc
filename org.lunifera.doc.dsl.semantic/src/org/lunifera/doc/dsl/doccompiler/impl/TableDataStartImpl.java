/**
 */
package org.lunifera.doc.dsl.doccompiler.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.lunifera.doc.dsl.doccompiler.DocCompilerPackage;
import org.lunifera.doc.dsl.doccompiler.TableDataEnd;
import org.lunifera.doc.dsl.doccompiler.TableDataStart;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Table Data Start</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.impl.TableDataStartImpl#getContent <em>Content</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.impl.TableDataStartImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TableDataStartImpl extends LinePartImpl implements TableDataStart {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected RichStringTableData content;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected TableDataEnd end;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TableDataStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.TABLE_DATA_START;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RichStringTableData getContent() {
		if (content != null && content.eIsProxy()) {
			InternalEObject oldContent = (InternalEObject) content;
			content = (RichStringTableData) eResolveProxy(oldContent);
			if (content != oldContent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DocCompilerPackage.TABLE_DATA_START__CONTENT, oldContent, content));
			}
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RichStringTableData basicGetContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setContent(RichStringTableData newContent) {
		RichStringTableData oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocCompilerPackage.TABLE_DATA_START__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableDataEnd getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject) end;
			end = (TableDataEnd) eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DocCompilerPackage.TABLE_DATA_START__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableDataEnd basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnd(TableDataEnd newEnd) {
		TableDataEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocCompilerPackage.TABLE_DATA_START__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DocCompilerPackage.TABLE_DATA_START__CONTENT:
			if (resolve)
				return getContent();
			return basicGetContent();
		case DocCompilerPackage.TABLE_DATA_START__END:
			if (resolve)
				return getEnd();
			return basicGetEnd();
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
		case DocCompilerPackage.TABLE_DATA_START__CONTENT:
			setContent((RichStringTableData) newValue);
			return;
		case DocCompilerPackage.TABLE_DATA_START__END:
			setEnd((TableDataEnd) newValue);
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
		case DocCompilerPackage.TABLE_DATA_START__CONTENT:
			setContent((RichStringTableData) null);
			return;
		case DocCompilerPackage.TABLE_DATA_START__END:
			setEnd((TableDataEnd) null);
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
		case DocCompilerPackage.TABLE_DATA_START__CONTENT:
			return content != null;
		case DocCompilerPackage.TABLE_DATA_START__END:
			return end != null;
		}
		return super.eIsSet(featureID);
	}

} // TableDataStartImpl
