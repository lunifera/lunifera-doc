/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rich String Table Row</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableRowImpl#getColumns <em>Columns</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringTableRowImpl#getExpressions <em>Expressions
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RichStringTableRowImpl extends RichStringMarkupImpl implements RichStringTableRow {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<RichStringTableData> columns;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<XExpression> expressions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RichStringTableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RichstringPackage.Literals.RICH_STRING_TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<RichStringTableData> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<RichStringTableData>(RichStringTableData.class,
					this, RichstringPackage.RICH_STRING_TABLE_ROW__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<XExpression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<XExpression>(XExpression.class, this,
					RichstringPackage.RICH_STRING_TABLE_ROW__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID,
			NotificationChain msgs) {
		switch (featureID) {
		case RichstringPackage.RICH_STRING_TABLE_ROW__COLUMNS:
			return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
		case RichstringPackage.RICH_STRING_TABLE_ROW__EXPRESSIONS:
			return ((InternalEList<?>) getExpressions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RichstringPackage.RICH_STRING_TABLE_ROW__COLUMNS:
			return getColumns();
		case RichstringPackage.RICH_STRING_TABLE_ROW__EXPRESSIONS:
			return getExpressions();
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
		case RichstringPackage.RICH_STRING_TABLE_ROW__COLUMNS:
			getColumns().clear();
			getColumns().addAll((Collection<? extends RichStringTableData>) newValue);
			return;
		case RichstringPackage.RICH_STRING_TABLE_ROW__EXPRESSIONS:
			getExpressions().clear();
			getExpressions().addAll((Collection<? extends XExpression>) newValue);
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
		case RichstringPackage.RICH_STRING_TABLE_ROW__COLUMNS:
			getColumns().clear();
			return;
		case RichstringPackage.RICH_STRING_TABLE_ROW__EXPRESSIONS:
			getExpressions().clear();
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
		case RichstringPackage.RICH_STRING_TABLE_ROW__COLUMNS:
			return columns != null && !columns.isEmpty();
		case RichstringPackage.RICH_STRING_TABLE_ROW__EXPRESSIONS:
			return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // RichStringTableRowImpl
