/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.common.util.EList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Table Row Start</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getColumns <em>Columns</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getEnd <em>End</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getTableStart <em>Table Start</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart()
 * @model
 * @generated
 */
public interface TableRowStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list. The list contents are of type
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart_Columns()
	 * @model
	 * @generated
	 */
	EList<RichStringTableData> getColumns();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(TableRowEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart_End()
	 * @model
	 * @generated
	 */
	TableRowEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TableRowEnd value);

	/**
	 * Returns the value of the '<em><b>Table Start</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Start</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Table Start</em>' reference.
	 * @see #setTableStart(TableStart)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart_TableStart()
	 * @model
	 * @generated
	 */
	TableStart getTableStart();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getTableStart <em>Table Start</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Table Start</em>' reference.
	 * @see #getTableStart()
	 * @generated
	 */
	void setTableStart(TableStart value);

} // TableRowStart
