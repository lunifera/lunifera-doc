/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTOHeader;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentFactory;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentFactoryImpl extends EFactoryImpl implements DocumentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentFactory init() {
		try {
			DocumentFactory theDocumentFactory = (DocumentFactory)EPackage.Registry.INSTANCE.getEFactory(DocumentPackage.eNS_URI);
			if (theDocumentFactory != null) {
				return theDocumentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocumentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentFactoryImpl() {
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
			case DocumentPackage.DTO_DOCUMENT: return createDTODocument();
			case DocumentPackage.DTO_HEADER: return createDTOHeader();
			case DocumentPackage.DTO_DETAILS: return createDTODetails();
			case DocumentPackage.DTO_PROPERTY: return createDTOProperty();
			case DocumentPackage.ENTITY_DOCUMENT: return createEntityDocument();
			case DocumentPackage.BPM_PROCESS_DOCUMENT: return createBPMProcessDocument();
			case DocumentPackage.BPM_TASK_DOCUMENT: return createBPMTaskDocument();
			case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT: return createVaaclipseViewDocument();
			case DocumentPackage.UI_DOCUMENT: return createUIDocument();
			case DocumentPackage.GENERAL_DOCUMENT: return createGeneralDocument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public EntityDocument createEntityDocument() {
		EntityDocumentImpl entityDocument = new EntityDocumentImpl();
		return entityDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMProcessDocument createBPMProcessDocument() {
		BPMProcessDocumentImpl bpmProcessDocument = new BPMProcessDocumentImpl();
		return bpmProcessDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMTaskDocument createBPMTaskDocument() {
		BPMTaskDocumentImpl bpmTaskDocument = new BPMTaskDocumentImpl();
		return bpmTaskDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaaclipseViewDocument createVaaclipseViewDocument() {
		VaaclipseViewDocumentImpl vaaclipseViewDocument = new VaaclipseViewDocumentImpl();
		return vaaclipseViewDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIDocument createUIDocument() {
		UIDocumentImpl uiDocument = new UIDocumentImpl();
		return uiDocument;
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
	public DocumentPackage getDocumentPackage() {
		return (DocumentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocumentPackage getPackage() {
		return DocumentPackage.eINSTANCE;
	}

} //DocumentFactoryImpl