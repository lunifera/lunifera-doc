/**
 */
package org.lunifera.doc.dsl.doccompiler;

import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getContent <em>Content</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getEnd <em>End</em>}</li>
 *   <li>{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getDocumentStart()
 * @model
 * @generated
 */
public interface DocumentStart extends LinePart {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' reference.
	 * @see #setContent(ProcessedRichString)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getDocumentStart_Content()
	 * @model
	 * @generated
	 */
	ProcessedRichString getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getContent <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ProcessedRichString value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.lunifera.doc.dsl.doccompiler.DocumentEnd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(DocumentEnd)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getDocumentStart_End()
	 * @see org.lunifera.doc.dsl.doccompiler.DocumentEnd#getStart
	 * @model opposite="start"
	 * @generated
	 */
	DocumentEnd getEnd();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(DocumentEnd value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(LuniferaDocDocument)
	 * @see org.lunifera.doc.dsl.doccompiler.DocCompilerPackage#getDocumentStart_Document()
	 * @model
	 * @generated
	 */
	LuniferaDocDocument getDocument();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.doccompiler.DocumentStart#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(LuniferaDocDocument value);

} // DocumentStart
