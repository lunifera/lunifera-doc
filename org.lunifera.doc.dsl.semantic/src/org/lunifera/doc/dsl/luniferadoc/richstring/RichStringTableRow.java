/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Table Row</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringTableRow()
 * @model
 * @generated
 */
public interface RichStringTableRow extends XExpression {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list. The list contents are of type
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringTableRow_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<RichStringTableData> getColumns();

} // RichStringTableRow