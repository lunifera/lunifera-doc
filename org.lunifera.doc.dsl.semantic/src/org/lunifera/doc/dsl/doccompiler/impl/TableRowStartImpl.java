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
import org.lunifera.doc.dsl.doccompiler.TableRowEnd;
import org.lunifera.doc.dsl.doccompiler.TableRowStart;
import org.lunifera.doc.dsl.doccompiler.TableStart;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Table Row Start</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.impl.TableRowStartImpl#getColumns <em>Columns</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.impl.TableRowStartImpl#getEnd <em>End</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.impl.TableRowStartImpl#getTableStart <em>Table Start</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class TableRowStartImpl extends LinePartImpl implements TableRowStart {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<RichStringTableData> columns;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected TableRowEnd end;

	/**
	 * The cached value of the '{@link #getTableStart() <em>Table Start</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTableStart()
	 * @generated
	 * @ordered
	 */
	protected TableStart tableStart;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected TableRowStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocCompilerPackage.Literals.TABLE_ROW_START;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RichStringTableData> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<RichStringTableData>(RichStringTableData.class,
					this, DocCompilerPackage.TABLE_ROW_START__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableRowEnd getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject) end;
			end = (TableRowEnd) eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DocCompilerPackage.TABLE_ROW_START__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableRowEnd basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnd(TableRowEnd newEnd) {
		TableRowEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocCompilerPackage.TABLE_ROW_START__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableStart getTableStart() {
		if (tableStart != null && tableStart.eIsProxy()) {
			InternalEObject oldTableStart = (InternalEObject) tableStart;
			tableStart = (TableStart) eResolveProxy(oldTableStart);
			if (tableStart != oldTableStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							DocCompilerPackage.TABLE_ROW_START__TABLE_START, oldTableStart,
							tableStart));
			}
		}
		return tableStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TableStart basicGetTableStart() {
		return tableStart;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTableStart(TableStart newTableStart) {
		TableStart oldTableStart = tableStart;
		tableStart = newTableStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DocCompilerPackage.TABLE_ROW_START__TABLE_START, oldTableStart, tableStart));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DocCompilerPackage.TABLE_ROW_START__COLUMNS:
			return getColumns();
		case DocCompilerPackage.TABLE_ROW_START__END:
			if (resolve)
				return getEnd();
			return basicGetEnd();
		case DocCompilerPackage.TABLE_ROW_START__TABLE_START:
			if (resolve)
				return getTableStart();
			return basicGetTableStart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DocCompilerPackage.TABLE_ROW_START__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends RichStringTableData>) newValue);
			return;
		case DocCompilerPackage.TABLE_ROW_START__END:
			setEnd((TableRowEnd) newValue);
			return;
		case DocCompilerPackage.TABLE_ROW_START__TABLE_START:
			setTableStart((TableStart) newValue);
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
		case DocCompilerPackage.TABLE_ROW_START__COLUMNS:
			getColumns().clear();
			return;
		case DocCompilerPackage.TABLE_ROW_START__END:
			setEnd((TableRowEnd) null);
			return;
		case DocCompilerPackage.TABLE_ROW_START__TABLE_START:
			setTableStart((TableStart) null);
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
		case DocCompilerPackage.TABLE_ROW_START__COLUMNS:
			return columns != null && !columns.isEmpty();
		case DocCompilerPackage.TABLE_ROW_START__END:
			return end != null;
		case DocCompilerPackage.TABLE_ROW_START__TABLE_START:
			return tableStart != null;
		}
		return super.eIsSet(featureID);
	}

} // TableRowStartImpl
