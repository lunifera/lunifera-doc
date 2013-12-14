/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.eclipse.emf.common.util.EList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Table Start</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.TableStart#getRows <em>Rows</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.TableStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableStart()
 * @model
 * @generated
 */
public interface TableStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' reference list. The list contents are of type
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Rows</em>' reference list.
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableStart_Rows()
	 * @model
	 * @generated
	 */
	EList<RichStringTableRow> getRows();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(TableEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableStart_End()
	 * @model
	 * @generated
	 */
	TableEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.TableStart#getEnd <em>End</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TableEnd value);

} // TableStart
