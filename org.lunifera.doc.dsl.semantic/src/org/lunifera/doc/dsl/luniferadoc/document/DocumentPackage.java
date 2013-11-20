/**
 */
package org.lunifera.doc.dsl.luniferadoc.document;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentFactory
 * @model kind="package"
 * @generated
 */
public interface DocumentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "document";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/luniferadoc/document";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "document";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocumentPackage eINSTANCE = org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl <em>DTO Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTODocument()
	 * @generated
	 */
	int DTO_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Dto Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__DTO_CLASS = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__HEADER = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__DETAILS = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DTO Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT_FEATURE_COUNT = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTOHeaderImpl <em>DTO Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTOHeaderImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTOHeader()
	 * @generated
	 */
	int DTO_HEADER = 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_HEADER__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>DTO Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_HEADER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODetailsImpl <em>DTO Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTODetailsImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTODetails()
	 * @generated
	 */
	int DTO_DETAILS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DETAILS__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>DTO Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DETAILS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertyImpl <em>DTO Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertyImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTOProperty()
	 * @generated
	 */
	int DTO_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>DTO Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl <em>Entity Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityDocument()
	 * @generated
	 */
	int ENTITY_DOCUMENT = 4;

	/**
	 * The number of structural features of the '<em>Entity Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DOCUMENT_FEATURE_COUNT = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl <em>BPM Process Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMProcessDocument()
	 * @generated
	 */
	int BPM_PROCESS_DOCUMENT = 5;

	/**
	 * The number of structural features of the '<em>BPM Process Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_DOCUMENT_FEATURE_COUNT = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMTaskDocumentImpl <em>BPM Task Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMTaskDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMTaskDocument()
	 * @generated
	 */
	int BPM_TASK_DOCUMENT = 6;

	/**
	 * The number of structural features of the '<em>BPM Task Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_TASK_DOCUMENT_FEATURE_COUNT = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl <em>Vaaclipse View Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getVaaclipseViewDocument()
	 * @generated
	 */
	int VAACLIPSE_VIEW_DOCUMENT = 7;

	/**
	 * The number of structural features of the '<em>Vaaclipse View Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAACLIPSE_VIEW_DOCUMENT_FEATURE_COUNT = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.UIDocumentImpl <em>UI Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.UIDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getUIDocument()
	 * @generated
	 */
	int UI_DOCUMENT = 8;

	/**
	 * The number of structural features of the '<em>UI Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DOCUMENT_FEATURE_COUNT = LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.GeneralDocumentImpl <em>General Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.GeneralDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getGeneralDocument()
	 * @generated
	 */
	int GENERAL_DOCUMENT = 9;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DOCUMENT__CONTENT = LayoutPackage.LUNIFERA_DOC_LAYOUT__CONTENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DOCUMENT__NAME = LayoutPackage.LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DOCUMENT__IMPORTS = LayoutPackage.LUNIFERA_DOC_LAYOUT__IMPORTS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DOCUMENT__INCLUDES = LayoutPackage.LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>General Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DOCUMENT_FEATURE_COUNT = LayoutPackage.LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument <em>DTO Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument
	 * @generated
	 */
	EClass getDTODocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDtoClass <em>Dto Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dto Class</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDtoClass()
	 * @see #getDTODocument()
	 * @generated
	 */
	EAttribute getDTODocument_DtoClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getHeader()
	 * @see #getDTODocument()
	 * @generated
	 */
	EReference getDTODocument_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Details</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDetails()
	 * @see #getDTODocument()
	 * @generated
	 */
	EReference getDTODocument_Details();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOHeader <em>DTO Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Header</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOHeader
	 * @generated
	 */
	EClass getDTOHeader();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOHeader#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOHeader#getContent()
	 * @see #getDTOHeader()
	 * @generated
	 */
	EReference getDTOHeader_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODetails <em>DTO Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Details</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODetails
	 * @generated
	 */
	EClass getDTODetails();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODetails#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODetails#getProperties()
	 * @see #getDTODetails()
	 * @generated
	 */
	EReference getDTODetails_Properties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty <em>DTO Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Property</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperty
	 * @generated
	 */
	EClass getDTOProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getName()
	 * @see #getDTOProperty()
	 * @generated
	 */
	EAttribute getDTOProperty_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperty#getDescription()
	 * @see #getDTOProperty()
	 * @generated
	 */
	EReference getDTOProperty_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument <em>Entity Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDocument
	 * @generated
	 */
	EClass getEntityDocument();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument <em>BPM Process Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPM Process Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument
	 * @generated
	 */
	EClass getBPMProcessDocument();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument <em>BPM Task Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPM Task Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument
	 * @generated
	 */
	EClass getBPMTaskDocument();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument <em>Vaaclipse View Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vaaclipse View Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument
	 * @generated
	 */
	EClass getVaaclipseViewDocument();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.UIDocument <em>UI Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.UIDocument
	 * @generated
	 */
	EClass getUIDocument();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument <em>General Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
	 * @generated
	 */
	EClass getGeneralDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument#getIncludes()
	 * @see #getGeneralDocument()
	 * @generated
	 */
	EReference getGeneralDocument_Includes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocumentFactory getDocumentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl <em>DTO Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTODocument()
		 * @generated
		 */
		EClass DTO_DOCUMENT = eINSTANCE.getDTODocument();

		/**
		 * The meta object literal for the '<em><b>Dto Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_DOCUMENT__DTO_CLASS = eINSTANCE.getDTODocument_DtoClass();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DOCUMENT__HEADER = eINSTANCE.getDTODocument_Header();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DOCUMENT__DETAILS = eINSTANCE.getDTODocument_Details();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTOHeaderImpl <em>DTO Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTOHeaderImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTOHeader()
		 * @generated
		 */
		EClass DTO_HEADER = eINSTANCE.getDTOHeader();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_HEADER__CONTENT = eINSTANCE.getDTOHeader_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODetailsImpl <em>DTO Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTODetailsImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTODetails()
		 * @generated
		 */
		EClass DTO_DETAILS = eINSTANCE.getDTODetails();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DETAILS__PROPERTIES = eINSTANCE.getDTODetails_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertyImpl <em>DTO Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertyImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTOProperty()
		 * @generated
		 */
		EClass DTO_PROPERTY = eINSTANCE.getDTOProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DTO_PROPERTY__NAME = eINSTANCE.getDTOProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_PROPERTY__DESCRIPTION = eINSTANCE.getDTOProperty_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl <em>Entity Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityDocument()
		 * @generated
		 */
		EClass ENTITY_DOCUMENT = eINSTANCE.getEntityDocument();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl <em>BPM Process Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMProcessDocument()
		 * @generated
		 */
		EClass BPM_PROCESS_DOCUMENT = eINSTANCE.getBPMProcessDocument();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMTaskDocumentImpl <em>BPM Task Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMTaskDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMTaskDocument()
		 * @generated
		 */
		EClass BPM_TASK_DOCUMENT = eINSTANCE.getBPMTaskDocument();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl <em>Vaaclipse View Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getVaaclipseViewDocument()
		 * @generated
		 */
		EClass VAACLIPSE_VIEW_DOCUMENT = eINSTANCE.getVaaclipseViewDocument();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.UIDocumentImpl <em>UI Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.UIDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getUIDocument()
		 * @generated
		 */
		EClass UI_DOCUMENT = eINSTANCE.getUIDocument();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.GeneralDocumentImpl <em>General Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.GeneralDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getGeneralDocument()
		 * @generated
		 */
		EClass GENERAL_DOCUMENT = eINSTANCE.getGeneralDocument();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_DOCUMENT__INCLUDES = eINSTANCE.getGeneralDocument_Includes();

	}

} //DocumentPackage
