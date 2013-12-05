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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument <em>Lunifera Doc Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getLuniferaDocDocument()
	 * @generated
	 */
	int LUNIFERA_DOC_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNIFERA_DOC_DOCUMENT__NAME = LuniferaDocPackage.NAMED_DOCUMENT__NAME;

	/**
	 * The number of structural features of the '<em>Lunifera Doc Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT = LuniferaDocPackage.NAMED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl <em>Entity Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityDocument()
	 * @generated
	 */
	int ENTITY_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DOCUMENT__NAME = LUNIFERA_DOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Entity Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DOCUMENT__ENTITY_CLASS = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DOCUMENT__DESCRIPTION = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DOCUMENT__FIELDS = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DOCUMENT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDescriptionImpl <em>Entity Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDescriptionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityDescription()
	 * @generated
	 */
	int ENTITY_DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Entity Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldsImpl <em>Entity Fields</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldsImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityFields()
	 * @generated
	 */
	int ENTITY_FIELDS = 3;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELDS__FIELDS = 0;

	/**
	 * The number of structural features of the '<em>Entity Fields</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELDS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldImpl <em>Entity Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityField()
	 * @generated
	 */
	int ENTITY_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELD__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELD__LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Pk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELD__PK = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELD__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELD__DESCRIPTION = 5;

	/**
	 * The number of structural features of the '<em>Entity Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FIELD_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl <em>DTO Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTODocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTODocument()
	 * @generated
	 */
	int DTO_DOCUMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__NAME = LUNIFERA_DOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dto Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__DTO_CLASS = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__DESCRIPTION = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT__PROPERTIES = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>DTO Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DOCUMENT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODescriptionImpl <em>DTO Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTODescriptionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTODescription()
	 * @generated
	 */
	int DTO_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DESCRIPTION__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>DTO Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertiesImpl <em>DTO Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertiesImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTOProperties()
	 * @generated
	 */
	int DTO_PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTIES__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>DTO Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertyImpl <em>DTO Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertyImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTOProperty()
	 * @generated
	 */
	int DTO_PROPERTY = 8;

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
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl <em>BPM Process Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMProcessDocument()
	 * @generated
	 */
	int BPM_PROCESS_DOCUMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_DOCUMENT__NAME = LUNIFERA_DOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_DOCUMENT__PROCESS = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_DOCUMENT__DESCRIPTION = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BPM Process Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_DOCUMENT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDescriptionImpl <em>BPM Process Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDescriptionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMProcessDescription()
	 * @generated
	 */
	int BPM_PROCESS_DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_DESCRIPTION__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>BPM Process Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDocumentImpl <em>BPM Human Task Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMHumanTaskDocument()
	 * @generated
	 */
	int BPM_HUMAN_TASK_DOCUMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_HUMAN_TASK_DOCUMENT__NAME = LUNIFERA_DOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_HUMAN_TASK_DOCUMENT__TASK = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BPM Human Task Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_HUMAN_TASK_DOCUMENT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDescriptionImpl <em>BPM Human Task Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDescriptionImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMHumanTaskDescription()
	 * @generated
	 */
	int BPM_HUMAN_TASK_DESCRIPTION = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_HUMAN_TASK_DESCRIPTION__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>BPM Human Task Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPM_HUMAN_TASK_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl <em>Vaaclipse View Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.VaaclipseViewDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getVaaclipseViewDocument()
	 * @generated
	 */
	int VAACLIPSE_VIEW_DOCUMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAACLIPSE_VIEW_DOCUMENT__NAME = LUNIFERA_DOC_DOCUMENT__NAME;

	/**
	 * The number of structural features of the '<em>Vaaclipse View Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAACLIPSE_VIEW_DOCUMENT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.UIDocumentImpl <em>UI Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.UIDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getUIDocument()
	 * @generated
	 */
	int UI_DOCUMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DOCUMENT__NAME = LUNIFERA_DOC_DOCUMENT__NAME;

	/**
	 * The number of structural features of the '<em>UI Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_DOCUMENT_FEATURE_COUNT = LUNIFERA_DOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.GeneralDocumentImpl <em>General Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.GeneralDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getGeneralDocument()
	 * @generated
	 */
	int GENERAL_DOCUMENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DOCUMENT__NAME = LayoutPackage.LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_DOCUMENT__CONTENT = LayoutPackage.LUNIFERA_DOC_LAYOUT__CONTENT;

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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument <em>Lunifera Doc Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lunifera Doc Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument
	 * @generated
	 */
	EClass getLuniferaDocDocument();

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
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getEntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Class</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getEntityClass()
	 * @see #getEntityDocument()
	 * @generated
	 */
	EAttribute getEntityDocument_EntityClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getDescription()
	 * @see #getEntityDocument()
	 * @generated
	 */
	EReference getEntityDocument_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fields</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDocument#getFields()
	 * @see #getEntityDocument()
	 * @generated
	 */
	EReference getEntityDocument_Fields();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDescription <em>Entity Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDescription
	 * @generated
	 */
	EClass getEntityDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDescription#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDescription#getContent()
	 * @see #getEntityDescription()
	 * @generated
	 */
	EReference getEntityDescription_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityFields <em>Entity Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Fields</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityFields
	 * @generated
	 */
	EClass getEntityFields();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityFields#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityFields#getFields()
	 * @see #getEntityFields()
	 * @generated
	 */
	EReference getEntityFields_Fields();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField <em>Entity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Field</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField
	 * @generated
	 */
	EClass getEntityField();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField#getName()
	 * @see #getEntityField()
	 * @generated
	 */
	EAttribute getEntityField_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField#getType()
	 * @see #getEntityField()
	 * @generated
	 */
	EAttribute getEntityField_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField#getLength()
	 * @see #getEntityField()
	 * @generated
	 */
	EAttribute getEntityField_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField#isPk <em>Pk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pk</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField#isPk()
	 * @see #getEntityField()
	 * @generated
	 */
	EAttribute getEntityField_Pk();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField#isNullable()
	 * @see #getEntityField()
	 * @generated
	 */
	EAttribute getEntityField_Nullable();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField#getDescription()
	 * @see #getEntityField()
	 * @generated
	 */
	EReference getEntityField_Description();

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
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getDescription()
	 * @see #getDTODocument()
	 * @generated
	 */
	EReference getDTODocument_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument#getProperties()
	 * @see #getDTODocument()
	 * @generated
	 */
	EReference getDTODocument_Properties();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODescription <em>DTO Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODescription
	 * @generated
	 */
	EClass getDTODescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODescription#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODescription#getContent()
	 * @see #getDTODescription()
	 * @generated
	 */
	EReference getDTODescription_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperties <em>DTO Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTO Properties</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperties
	 * @generated
	 */
	EClass getDTOProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperties#getProperties()
	 * @see #getDTOProperties()
	 * @generated
	 */
	EReference getDTOProperties_Properties();

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
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument <em>BPM Process Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPM Process Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument
	 * @generated
	 */
	EClass getBPMProcessDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getProcess()
	 * @see #getBPMProcessDocument()
	 * @generated
	 */
	EAttribute getBPMProcessDocument_Process();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument#getDescription()
	 * @see #getBPMProcessDocument()
	 * @generated
	 */
	EReference getBPMProcessDocument_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDescription <em>BPM Process Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPM Process Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDescription
	 * @generated
	 */
	EClass getBPMProcessDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDescription#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDescription#getContent()
	 * @see #getBPMProcessDescription()
	 * @generated
	 */
	EReference getBPMProcessDescription_Content();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument <em>BPM Human Task Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPM Human Task Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument
	 * @generated
	 */
	EClass getBPMHumanTaskDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getTask()
	 * @see #getBPMHumanTaskDocument()
	 * @generated
	 */
	EAttribute getBPMHumanTaskDocument_Task();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument#getDescription()
	 * @see #getBPMHumanTaskDocument()
	 * @generated
	 */
	EReference getBPMHumanTaskDocument_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDescription <em>BPM Human Task Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPM Human Task Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDescription
	 * @generated
	 */
	EClass getBPMHumanTaskDescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDescription#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDescription#getContent()
	 * @see #getBPMHumanTaskDescription()
	 * @generated
	 */
	EReference getBPMHumanTaskDescription_Content();

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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument <em>Lunifera Doc Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getLuniferaDocDocument()
		 * @generated
		 */
		EClass LUNIFERA_DOC_DOCUMENT = eINSTANCE.getLuniferaDocDocument();

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
		 * The meta object literal for the '<em><b>Entity Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_DOCUMENT__ENTITY_CLASS = eINSTANCE.getEntityDocument_EntityClass();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DOCUMENT__DESCRIPTION = eINSTANCE.getEntityDocument_Description();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DOCUMENT__FIELDS = eINSTANCE.getEntityDocument_Fields();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDescriptionImpl <em>Entity Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityDescriptionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityDescription()
		 * @generated
		 */
		EClass ENTITY_DESCRIPTION = eINSTANCE.getEntityDescription();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_DESCRIPTION__CONTENT = eINSTANCE.getEntityDescription_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldsImpl <em>Entity Fields</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldsImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityFields()
		 * @generated
		 */
		EClass ENTITY_FIELDS = eINSTANCE.getEntityFields();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_FIELDS__FIELDS = eINSTANCE.getEntityFields_Fields();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldImpl <em>Entity Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.EntityFieldImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getEntityField()
		 * @generated
		 */
		EClass ENTITY_FIELD = eINSTANCE.getEntityField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FIELD__NAME = eINSTANCE.getEntityField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FIELD__TYPE = eINSTANCE.getEntityField_Type();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FIELD__LENGTH = eINSTANCE.getEntityField_Length();

		/**
		 * The meta object literal for the '<em><b>Pk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FIELD__PK = eINSTANCE.getEntityField_Pk();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_FIELD__NULLABLE = eINSTANCE.getEntityField_Nullable();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_FIELD__DESCRIPTION = eINSTANCE.getEntityField_Description();

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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DOCUMENT__DESCRIPTION = eINSTANCE.getDTODocument_Description();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DOCUMENT__PROPERTIES = eINSTANCE.getDTODocument_Properties();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTODescriptionImpl <em>DTO Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTODescriptionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTODescription()
		 * @generated
		 */
		EClass DTO_DESCRIPTION = eINSTANCE.getDTODescription();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_DESCRIPTION__CONTENT = eINSTANCE.getDTODescription_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertiesImpl <em>DTO Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DTOPropertiesImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getDTOProperties()
		 * @generated
		 */
		EClass DTO_PROPERTIES = eINSTANCE.getDTOProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DTO_PROPERTIES__PROPERTIES = eINSTANCE.getDTOProperties_Properties();

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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl <em>BPM Process Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMProcessDocument()
		 * @generated
		 */
		EClass BPM_PROCESS_DOCUMENT = eINSTANCE.getBPMProcessDocument();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPM_PROCESS_DOCUMENT__PROCESS = eINSTANCE.getBPMProcessDocument_Process();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_PROCESS_DOCUMENT__DESCRIPTION = eINSTANCE.getBPMProcessDocument_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDescriptionImpl <em>BPM Process Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMProcessDescriptionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMProcessDescription()
		 * @generated
		 */
		EClass BPM_PROCESS_DESCRIPTION = eINSTANCE.getBPMProcessDescription();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_PROCESS_DESCRIPTION__CONTENT = eINSTANCE.getBPMProcessDescription_Content();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDocumentImpl <em>BPM Human Task Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMHumanTaskDocument()
		 * @generated
		 */
		EClass BPM_HUMAN_TASK_DOCUMENT = eINSTANCE.getBPMHumanTaskDocument();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BPM_HUMAN_TASK_DOCUMENT__TASK = eINSTANCE.getBPMHumanTaskDocument_Task();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_HUMAN_TASK_DOCUMENT__DESCRIPTION = eINSTANCE.getBPMHumanTaskDocument_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDescriptionImpl <em>BPM Human Task Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.BPMHumanTaskDescriptionImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.document.impl.DocumentPackageImpl#getBPMHumanTaskDescription()
		 * @generated
		 */
		EClass BPM_HUMAN_TASK_DESCRIPTION = eINSTANCE.getBPMHumanTaskDescription();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPM_HUMAN_TASK_DESCRIPTION__CONTENT = eINSTANCE.getBPMHumanTaskDescription_Content();

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
