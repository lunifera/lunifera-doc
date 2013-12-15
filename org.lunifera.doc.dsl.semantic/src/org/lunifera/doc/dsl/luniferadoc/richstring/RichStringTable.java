/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String Table</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringTable()
 * @model
 * @generated
 */
public interface RichStringTable extends XExpression {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list. The list contents are of type
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<RichStringTableRow> getRows();

} // RichStringTable