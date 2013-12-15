/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rich String List</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringList#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringList()
 * @model
 * @generated
 */
public interface RichStringList extends RichStringMarkup {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list. The list contents are of type
	 * {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringListElement}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage#getRichStringList_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RichStringListElement> getElements();

} // RichStringList
