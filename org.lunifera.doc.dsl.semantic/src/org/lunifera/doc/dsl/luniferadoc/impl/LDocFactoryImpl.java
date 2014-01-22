/**
 */
package org.lunifera.doc.dsl.luniferadoc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.lunifera.doc.dsl.luniferadoc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDocFactoryImpl extends EFactoryImpl implements LDocFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LDocFactory init() {
		try {
			LDocFactory theLDocFactory = (LDocFactory)EPackage.Registry.INSTANCE.getEFactory(LDocPackage.eNS_URI);
			if (theLDocFactory != null) {
				return theLDocFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LDocFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocFactoryImpl() {
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
			case LDocPackage.LDOC_INCLUDE: return createLDocInclude();
			case LDocPackage.LDOC_ENTITY_DOCUMENT: return createLDocEntityDocument();
			case LDocPackage.LDOC_ENTITY_FIELD: return createLDocEntityField();
			case LDocPackage.LDOC_DTO_DOCUMENT: return createLDocDtoDocument();
			case LDocPackage.LDOC_DTO_PROPERTY: return createLDocDtoProperty();
			case LDocPackage.LDOC_BPM_PROCESS_DOCUMENT: return createLDocBPMProcessDocument();
			case LDocPackage.LDOC_HUMAN_TASK_DOCUMENT: return createLDocHumanTaskDocument();
			case LDocPackage.LDOC_VIEW_DOCUMENT: return createLDocViewDocument();
			case LDocPackage.LDOC_UI_DOCUMENT: return createLDocUiDocument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocInclude createLDocInclude() {
		LDocIncludeImpl lDocInclude = new LDocIncludeImpl();
		return lDocInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocEntityDocument createLDocEntityDocument() {
		LDocEntityDocumentImpl lDocEntityDocument = new LDocEntityDocumentImpl();
		return lDocEntityDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocEntityField createLDocEntityField() {
		LDocEntityFieldImpl lDocEntityField = new LDocEntityFieldImpl();
		return lDocEntityField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocDtoDocument createLDocDtoDocument() {
		LDocDtoDocumentImpl lDocDtoDocument = new LDocDtoDocumentImpl();
		return lDocDtoDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocDtoProperty createLDocDtoProperty() {
		LDocDtoPropertyImpl lDocDtoProperty = new LDocDtoPropertyImpl();
		return lDocDtoProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocBPMProcessDocument createLDocBPMProcessDocument() {
		LDocBPMProcessDocumentImpl lDocBPMProcessDocument = new LDocBPMProcessDocumentImpl();
		return lDocBPMProcessDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocHumanTaskDocument createLDocHumanTaskDocument() {
		LDocHumanTaskDocumentImpl lDocHumanTaskDocument = new LDocHumanTaskDocumentImpl();
		return lDocHumanTaskDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocViewDocument createLDocViewDocument() {
		LDocViewDocumentImpl lDocViewDocument = new LDocViewDocumentImpl();
		return lDocViewDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocUiDocument createLDocUiDocument() {
		LDocUiDocumentImpl lDocUiDocument = new LDocUiDocumentImpl();
		return lDocUiDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocPackage getLDocPackage() {
		return (LDocPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LDocPackage getPackage() {
		return LDocPackage.eINSTANCE;
	}

} //LDocFactoryImpl
