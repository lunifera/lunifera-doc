/**
 */
package org.lunifera.doc.dsl.luniferadoc.layout;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.lunifera.doc.dsl.luniferadoc.NamedDocument;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Lunifera Doc Layout</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout#getContent <em>Content</em>}</li>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage#getLuniferaDocLayout()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LuniferaDocLayout extends NamedDocument {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(RichString)
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage#getLuniferaDocLayout_Content()
	 * @model containment="true"
	 * @generated
	 */
	RichString getContent();

	/**
	 * Sets the value of the '{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout#getContent
	 * <em>Content</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(RichString value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.xtext.xtype.XImportDeclaration}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage#getLuniferaDocLayout_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<XImportDeclaration> getImports();

} // LuniferaDocLayout
