/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.common.util.EList;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart()
 * @model
 * @generated
 */
public interface TableRowStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringTableRow)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart_Content()
	 * @model
	 * @generated
	 */
	RichStringTableRow getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringTableRow value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart_Columns()
	 * @model
	 * @generated
	 */
	EList<RichStringTableData> getColumns();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(TableRowEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableRowStart_End()
	 * @model
	 * @generated
	 */
	TableRowEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.TableRowStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TableRowEnd value);

} // TableRowStart
