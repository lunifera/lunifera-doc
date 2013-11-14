/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage
 * @generated
 */
public interface LuniferaDocFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LuniferaDocFactory eINSTANCE = org.lunifera.doc.dsl.luniferadoc.impl.LuniferaDocFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	LuniferaDocDocument createLuniferaDocDocument();

	/**
	 * Returns a new object of class '<em>Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layout</em>'.
	 * @generated
	 */
	LuniferaDocLayout createLuniferaDocLayout();

	/**
	 * Returns a new object of class '<em>General Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General Document</em>'.
	 * @generated
	 */
	GeneralDocument createGeneralDocument();

	/**
	 * Returns a new object of class '<em>Document Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Include</em>'.
	 * @generated
	 */
	DocumentInclude createDocumentInclude();

	/**
	 * Returns a new object of class '<em>DTO Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Document</em>'.
	 * @generated
	 */
	DTODocument createDTODocument();

	/**
	 * Returns a new object of class '<em>DTO Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Header</em>'.
	 * @generated
	 */
	DTOHeader createDTOHeader();

	/**
	 * Returns a new object of class '<em>DTO Details</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Details</em>'.
	 * @generated
	 */
	DTODetails createDTODetails();

	/**
	 * Returns a new object of class '<em>DTO Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTO Property</em>'.
	 * @generated
	 */
	DTOProperty createDTOProperty();

	/**
	 * Returns a new object of class '<em>Rich String Else If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String Else If</em>'.
	 * @generated
	 */
	RichStringElseIf createRichStringElseIf();

	/**
	 * Returns a new object of class '<em>Rich String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String</em>'.
	 * @generated
	 */
	RichString createRichString();

	/**
	 * Returns a new object of class '<em>Rich String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String Literal</em>'.
	 * @generated
	 */
	RichStringLiteral createRichStringLiteral();

	/**
	 * Returns a new object of class '<em>Rich String For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String For Loop</em>'.
	 * @generated
	 */
	RichStringForLoop createRichStringForLoop();

	/**
	 * Returns a new object of class '<em>Rich String If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String If</em>'.
	 * @generated
	 */
	RichStringIf createRichStringIf();

	/**
	 * Returns a new object of class '<em>Rich String Example</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String Example</em>'.
	 * @generated
	 */
	RichStringExample createRichStringExample();

	/**
	 * Returns a new object of class '<em>Rich String H1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String H1</em>'.
	 * @generated
	 */
	RichStringH1 createRichStringH1();

	/**
	 * Returns a new object of class '<em>Rich String H2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String H2</em>'.
	 * @generated
	 */
	RichStringH2 createRichStringH2();

	/**
	 * Returns a new object of class '<em>Rich String URL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String URL</em>'.
	 * @generated
	 */
	RichStringURL createRichStringURL();

	/**
	 * Returns a new object of class '<em>Rich String Markup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rich String Markup</em>'.
	 * @generated
	 */
	RichStringMarkup createRichStringMarkup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LuniferaDocPackage getLuniferaDocPackage();

} //LuniferaDocFactory
