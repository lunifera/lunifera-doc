/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.doc.dsl.luniferadoc.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.DTOHeader;
import org.lunifera.doc.dsl.luniferadoc.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.DocType;
import org.lunifera.doc.dsl.luniferadoc.DocumentInclude;
import org.lunifera.doc.dsl.luniferadoc.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocFactory;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocLayout;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.RichString;
import org.lunifera.doc.dsl.luniferadoc.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.RichStringMarkup;
import org.lunifera.doc.dsl.luniferadoc.RichStringURL;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LuniferaDocFactoryImpl extends EFactoryImpl implements LuniferaDocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LuniferaDocFactory init() {
		try {
			LuniferaDocFactory theLuniferaDocFactory = (LuniferaDocFactory)EPackage.Registry.INSTANCE.getEFactory(LuniferaDocPackage.eNS_URI);
			if (theLuniferaDocFactory != null) {
				return theLuniferaDocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LuniferaDocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuniferaDocFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT: return createLuniferaDocDocument();
			case LuniferaDocPackage.LUNIFERA_DOC_LAYOUT: return createLuniferaDocLayout();
			case LuniferaDocPackage.GENERAL_DOCUMENT: return createGeneralDocument();
			case LuniferaDocPackage.DOCUMENT_INCLUDE: return createDocumentInclude();
			case LuniferaDocPackage.DTO_DOCUMENT: return createDTODocument();
			case LuniferaDocPackage.DTO_HEADER: return createDTOHeader();
			case LuniferaDocPackage.DTO_DETAILS: return createDTODetails();
			case LuniferaDocPackage.DTO_PROPERTY: return createDTOProperty();
			case LuniferaDocPackage.RICH_STRING_ELSE_IF: return createRichStringElseIf();
			case LuniferaDocPackage.RICH_STRING: return createRichString();
			case LuniferaDocPackage.RICH_STRING_LITERAL: return createRichStringLiteral();
			case LuniferaDocPackage.RICH_STRING_FOR_LOOP: return createRichStringForLoop();
			case LuniferaDocPackage.RICH_STRING_IF: return createRichStringIf();
			case LuniferaDocPackage.RICH_STRING_EXAMPLE: return createRichStringExample();
			case LuniferaDocPackage.RICH_STRING_H1: return createRichStringH1();
			case LuniferaDocPackage.RICH_STRING_H2: return createRichStringH2();
			case LuniferaDocPackage.RICH_STRING_URL: return createRichStringURL();
			case LuniferaDocPackage.RICH_STRING_MARKUP: return createRichStringMarkup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LuniferaDocPackage.DOC_TYPE:
				return createDocTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LuniferaDocPackage.DOC_TYPE:
				return convertDocTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuniferaDocDocument createLuniferaDocDocument() {
		LuniferaDocDocumentImpl luniferaDocDocument = new LuniferaDocDocumentImpl();
		return luniferaDocDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuniferaDocLayout createLuniferaDocLayout() {
		LuniferaDocLayoutImpl luniferaDocLayout = new LuniferaDocLayoutImpl();
		return luniferaDocLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralDocument createGeneralDocument() {
		GeneralDocumentImpl generalDocument = new GeneralDocumentImpl();
		return generalDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentInclude createDocumentInclude() {
		DocumentIncludeImpl documentInclude = new DocumentIncludeImpl();
		return documentInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTODocument createDTODocument() {
		DTODocumentImpl dtoDocument = new DTODocumentImpl();
		return dtoDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOHeader createDTOHeader() {
		DTOHeaderImpl dtoHeader = new DTOHeaderImpl();
		return dtoHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTODetails createDTODetails() {
		DTODetailsImpl dtoDetails = new DTODetailsImpl();
		return dtoDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOProperty createDTOProperty() {
		DTOPropertyImpl dtoProperty = new DTOPropertyImpl();
		return dtoProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringElseIf createRichStringElseIf() {
		RichStringElseIfImpl richStringElseIf = new RichStringElseIfImpl();
		return richStringElseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichString createRichString() {
		RichStringImpl richString = new RichStringImpl();
		return richString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringLiteral createRichStringLiteral() {
		RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
		return richStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringForLoop createRichStringForLoop() {
		RichStringForLoopImpl richStringForLoop = new RichStringForLoopImpl();
		return richStringForLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringIf createRichStringIf() {
		RichStringIfImpl richStringIf = new RichStringIfImpl();
		return richStringIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringExample createRichStringExample() {
		RichStringExampleImpl richStringExample = new RichStringExampleImpl();
		return richStringExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH1 createRichStringH1() {
		RichStringH1Impl richStringH1 = new RichStringH1Impl();
		return richStringH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH2 createRichStringH2() {
		RichStringH2Impl richStringH2 = new RichStringH2Impl();
		return richStringH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringURL createRichStringURL() {
		RichStringURLImpl richStringURL = new RichStringURLImpl();
		return richStringURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringMarkup createRichStringMarkup() {
		RichStringMarkupImpl richStringMarkup = new RichStringMarkupImpl();
		return richStringMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocType createDocTypeFromString(EDataType eDataType, String initialValue) {
		DocType result = DocType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuniferaDocPackage getLuniferaDocPackage() {
		return (LuniferaDocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LuniferaDocPackage getPackage() {
		return LuniferaDocPackage.eINSTANCE;
	}

} //LuniferaDocFactoryImpl
