/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Table Data Start</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.TableDataStart#getContent <em>Content</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.doccompiler.TableDataStart#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableDataStart()
 * @model
 * @generated
 */
public interface TableDataStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(RichStringTableData)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableDataStart_Content()
	 * @model
	 * @generated
	 */
	RichStringTableData getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.TableDataStart#getContent <em>Content</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichStringTableData value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(TableDataEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getTableDataStart_End()
	 * @model
	 * @generated
	 */
	TableDataEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.TableDataStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(TableDataEnd value);

} // TableDataStart
