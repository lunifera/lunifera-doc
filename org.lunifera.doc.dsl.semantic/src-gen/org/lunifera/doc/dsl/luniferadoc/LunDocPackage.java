/**
 */
package org.lunifera.doc.dsl.luniferadoc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.lunifera.doc.dsl.luniferadoc.LunDocFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel fileExtensions='docu' modelName='LuniferaDoc' prefix='LunDoc' operationReflection='false' basePackage='org.lunifera.doc.dsl'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore rootPackage='luniferadoc'"
 * @generated
 */
public interface LunDocPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "luniferadoc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/documentation/v1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "luniferadoc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LunDocPackage eINSTANCE = org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument <em>LDoc Named Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocNamedDocument()
	 * @generated
	 */
	int LDOC_NAMED_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_NAMED_DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_NAMED_DOCUMENT__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>LDoc Named Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_NAMED_DOCUMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl <em>LDoc Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocInclude()
	 * @generated
	 */
	int LDOC_INCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_INCLUDE__DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_INCLUDE__VAR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Provided</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_INCLUDE__PROVIDED = 2;

	/**
	 * The feature id for the '<em><b>Provided Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_INCLUDE__PROVIDED_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Provided JVM Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_INCLUDE__PROVIDED_JVM_TYPE = 4;

	/**
	 * The number of structural features of the '<em>LDoc Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_INCLUDE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.LDocDocument <em>LDoc Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDocument
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocDocument()
	 * @generated
	 */
	int LDOC_DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DOCUMENT__NAME = LDOC_NAMED_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DOCUMENT__LANGUAGE = LDOC_NAMED_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DOCUMENT__DESCRIPTION = LDOC_NAMED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDoc Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DOCUMENT_FEATURE_COUNT = LDOC_NAMED_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl <em>LDoc Entity Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocEntityDocument()
	 * @generated
	 */
	int LDOC_ENTITY_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_DOCUMENT__NAME = LDOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_DOCUMENT__LANGUAGE = LDOC_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_DOCUMENT__DESCRIPTION = LDOC_DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_DOCUMENT__FIELDS = LDOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_DOCUMENT__MODEL = LDOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LDoc Entity Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_DOCUMENT_FEATURE_COUNT = LDOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityFieldImpl <em>LDoc Entity Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityFieldImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocEntityField()
	 * @generated
	 */
	int LDOC_ENTITY_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Type Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_FIELD__TYPE_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_FIELD__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>LDoc Entity Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_ENTITY_FIELD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoDocumentImpl <em>LDoc Dto Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocDtoDocument()
	 * @generated
	 */
	int LDOC_DTO_DOCUMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_DOCUMENT__NAME = LDOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_DOCUMENT__LANGUAGE = LDOC_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_DOCUMENT__DESCRIPTION = LDOC_DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_DOCUMENT__FIELDS = LDOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_DOCUMENT__MODEL = LDOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>LDoc Dto Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_DOCUMENT_FEATURE_COUNT = LDOC_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoPropertyImpl <em>LDoc Dto Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoPropertyImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocDtoProperty()
	 * @generated
	 */
	int LDOC_DTO_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_PROPERTY__TYPE_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_PROPERTY__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>LDoc Dto Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_DTO_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocBPMProcessDocumentImpl <em>LDoc BPM Process Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocBPMProcessDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocBPMProcessDocument()
	 * @generated
	 */
	int LDOC_BPM_PROCESS_DOCUMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_BPM_PROCESS_DOCUMENT__NAME = LDOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_BPM_PROCESS_DOCUMENT__LANGUAGE = LDOC_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_BPM_PROCESS_DOCUMENT__DESCRIPTION = LDOC_DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_BPM_PROCESS_DOCUMENT__PROCESS = LDOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDoc BPM Process Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_BPM_PROCESS_DOCUMENT_FEATURE_COUNT = LDOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocHumanTaskDocumentImpl <em>LDoc Human Task Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocHumanTaskDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocHumanTaskDocument()
	 * @generated
	 */
	int LDOC_HUMAN_TASK_DOCUMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_HUMAN_TASK_DOCUMENT__NAME = LDOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_HUMAN_TASK_DOCUMENT__LANGUAGE = LDOC_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_HUMAN_TASK_DOCUMENT__DESCRIPTION = LDOC_DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_HUMAN_TASK_DOCUMENT__TASK = LDOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDoc Human Task Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_HUMAN_TASK_DOCUMENT_FEATURE_COUNT = LDOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl <em>LDoc View Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocViewDocument()
	 * @generated
	 */
	int LDOC_VIEW_DOCUMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_VIEW_DOCUMENT__NAME = LDOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_VIEW_DOCUMENT__LANGUAGE = LDOC_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_VIEW_DOCUMENT__DESCRIPTION = LDOC_DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_VIEW_DOCUMENT__VIEW = LDOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDoc View Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_VIEW_DOCUMENT_FEATURE_COUNT = LDOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocUIDocumentImpl <em>LDoc UI Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocUIDocumentImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocUIDocument()
	 * @generated
	 */
	int LDOC_UI_DOCUMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_UI_DOCUMENT__NAME = LDOC_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_UI_DOCUMENT__LANGUAGE = LDOC_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_UI_DOCUMENT__DESCRIPTION = LDOC_DOCUMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_UI_DOCUMENT__UI = LDOC_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LDoc UI Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_UI_DOCUMENT_FEATURE_COUNT = LDOC_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl <em>LDoc Layouter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocLayouter()
	 * @generated
	 */
	int LDOC_LAYOUTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_LAYOUTER__NAME = LDOC_NAMED_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_LAYOUTER__LANGUAGE = LDOC_NAMED_DOCUMENT__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_LAYOUTER__CONTENT = LDOC_NAMED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_LAYOUTER__IMPORTS = LDOC_NAMED_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_LAYOUTER__INCLUDES = LDOC_NAMED_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LDoc Layouter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDOC_LAYOUTER_FEATURE_COUNT = LDOC_NAMED_DOCUMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.LDocType <em>LDoc Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocType
	 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocType()
	 * @generated
	 */
	int LDOC_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument <em>LDoc Named Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Named Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument
	 * @generated
	 */
	EClass getLDocNamedDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getName()
	 * @see #getLDocNamedDocument()
	 * @generated
	 */
	EAttribute getLDocNamedDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument#getLanguage()
	 * @see #getLDocNamedDocument()
	 * @generated
	 */
	EAttribute getLDocNamedDocument_Language();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude <em>LDoc Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Include</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocInclude
	 * @generated
	 */
	EClass getLDocInclude();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocInclude#getDocument()
	 * @see #getLDocInclude()
	 * @generated
	 */
	EReference getLDocInclude_Document();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocInclude#getVarName()
	 * @see #getLDocInclude()
	 * @generated
	 */
	EAttribute getLDocInclude_VarName();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#isProvided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocInclude#isProvided()
	 * @see #getLDocInclude()
	 * @generated
	 */
	EAttribute getLDocInclude_Provided();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedType <em>Provided Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provided Type</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedType()
	 * @see #getLDocInclude()
	 * @generated
	 */
	EAttribute getLDocInclude_ProvidedType();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedJVMType <em>Provided JVM Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provided JVM Type</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocInclude#getProvidedJVMType()
	 * @see #getLDocInclude()
	 * @generated
	 */
	EReference getLDocInclude_ProvidedJVMType();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocDocument <em>LDoc Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDocument
	 * @generated
	 */
	EClass getLDocDocument();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocDocument#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDocument#getDescription()
	 * @see #getLDocDocument()
	 * @generated
	 */
	EReference getLDocDocument_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument <em>LDoc Entity Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Entity Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument
	 * @generated
	 */
	EClass getLDocEntityDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getFields()
	 * @see #getLDocEntityDocument()
	 * @generated
	 */
	EReference getLDocEntityDocument_Fields();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument#getModel()
	 * @see #getLDocEntityDocument()
	 * @generated
	 */
	EReference getLDocEntityDocument_Model();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField <em>LDoc Entity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Entity Field</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityField
	 * @generated
	 */
	EClass getLDocEntityField();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getTypeField <em>Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Field</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getTypeField()
	 * @see #getLDocEntityField()
	 * @generated
	 */
	EReference getLDocEntityField_TypeField();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocEntityField#getDescription()
	 * @see #getLDocEntityField()
	 * @generated
	 */
	EReference getLDocEntityField_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument <em>LDoc Dto Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Dto Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
	 * @generated
	 */
	EClass getLDocDtoDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument#getFields()
	 * @see #getLDocDtoDocument()
	 * @generated
	 */
	EReference getLDocDtoDocument_Fields();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument#getModel()
	 * @see #getLDocDtoDocument()
	 * @generated
	 */
	EReference getLDocDtoDocument_Model();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty <em>LDoc Dto Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Dto Property</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty
	 * @generated
	 */
	EClass getLDocDtoProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty#getName()
	 * @see #getLDocDtoProperty()
	 * @generated
	 */
	EAttribute getLDocDtoProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty#getTypeField <em>Type Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Field</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty#getTypeField()
	 * @see #getLDocDtoProperty()
	 * @generated
	 */
	EReference getLDocDtoProperty_TypeField();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty#getDescription()
	 * @see #getLDocDtoProperty()
	 * @generated
	 */
	EReference getLDocDtoProperty_Description();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument <em>LDoc BPM Process Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc BPM Process Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument
	 * @generated
	 */
	EClass getLDocBPMProcessDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument#getProcess()
	 * @see #getLDocBPMProcessDocument()
	 * @generated
	 */
	EAttribute getLDocBPMProcessDocument_Process();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument <em>LDoc Human Task Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Human Task Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument
	 * @generated
	 */
	EClass getLDocHumanTaskDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument#getTask()
	 * @see #getLDocHumanTaskDocument()
	 * @generated
	 */
	EAttribute getLDocHumanTaskDocument_Task();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocViewDocument <em>LDoc View Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc View Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocViewDocument
	 * @generated
	 */
	EClass getLDocViewDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocViewDocument#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocViewDocument#getView()
	 * @see #getLDocViewDocument()
	 * @generated
	 */
	EAttribute getLDocViewDocument_View();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocUIDocument <em>LDoc UI Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc UI Document</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocUIDocument
	 * @generated
	 */
	EClass getLDocUIDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.lunifera.doc.dsl.luniferadoc.LDocUIDocument#getUi <em>Ui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocUIDocument#getUi()
	 * @see #getLDocUIDocument()
	 * @generated
	 */
	EAttribute getLDocUIDocument_Ui();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter <em>LDoc Layouter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDoc Layouter</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocLayouter
	 * @generated
	 */
	EClass getLDocLayouter();

	/**
	 * Returns the meta object for the containment reference '{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getContent()
	 * @see #getLDocLayouter()
	 * @generated
	 */
	EReference getLDocLayouter_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getImports()
	 * @see #getLDocLayouter()
	 * @generated
	 */
	EReference getLDocLayouter_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocLayouter#getIncludes()
	 * @see #getLDocLayouter()
	 * @generated
	 */
	EReference getLDocLayouter_Includes();

	/**
	 * Returns the meta object for enum '{@link org.lunifera.doc.dsl.luniferadoc.LDocType <em>LDoc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LDoc Type</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.LDocType
	 * @generated
	 */
	EEnum getLDocType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LunDocFactory getLunDocFactory();

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
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument <em>LDoc Named Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocNamedDocument()
		 * @generated
		 */
		EClass LDOC_NAMED_DOCUMENT = eINSTANCE.getLDocNamedDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_NAMED_DOCUMENT__NAME = eINSTANCE.getLDocNamedDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_NAMED_DOCUMENT__LANGUAGE = eINSTANCE.getLDocNamedDocument_Language();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl <em>LDoc Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocIncludeImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocInclude()
		 * @generated
		 */
		EClass LDOC_INCLUDE = eINSTANCE.getLDocInclude();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_INCLUDE__DOCUMENT = eINSTANCE.getLDocInclude_Document();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_INCLUDE__VAR_NAME = eINSTANCE.getLDocInclude_VarName();

		/**
		 * The meta object literal for the '<em><b>Provided</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_INCLUDE__PROVIDED = eINSTANCE.getLDocInclude_Provided();

		/**
		 * The meta object literal for the '<em><b>Provided Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_INCLUDE__PROVIDED_TYPE = eINSTANCE.getLDocInclude_ProvidedType();

		/**
		 * The meta object literal for the '<em><b>Provided JVM Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_INCLUDE__PROVIDED_JVM_TYPE = eINSTANCE.getLDocInclude_ProvidedJVMType();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.LDocDocument <em>LDoc Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.LDocDocument
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocDocument()
		 * @generated
		 */
		EClass LDOC_DOCUMENT = eINSTANCE.getLDocDocument();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_DOCUMENT__DESCRIPTION = eINSTANCE.getLDocDocument_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl <em>LDoc Entity Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocEntityDocument()
		 * @generated
		 */
		EClass LDOC_ENTITY_DOCUMENT = eINSTANCE.getLDocEntityDocument();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_ENTITY_DOCUMENT__FIELDS = eINSTANCE.getLDocEntityDocument_Fields();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_ENTITY_DOCUMENT__MODEL = eINSTANCE.getLDocEntityDocument_Model();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityFieldImpl <em>LDoc Entity Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocEntityFieldImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocEntityField()
		 * @generated
		 */
		EClass LDOC_ENTITY_FIELD = eINSTANCE.getLDocEntityField();

		/**
		 * The meta object literal for the '<em><b>Type Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_ENTITY_FIELD__TYPE_FIELD = eINSTANCE.getLDocEntityField_TypeField();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_ENTITY_FIELD__DESCRIPTION = eINSTANCE.getLDocEntityField_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoDocumentImpl <em>LDoc Dto Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocDtoDocument()
		 * @generated
		 */
		EClass LDOC_DTO_DOCUMENT = eINSTANCE.getLDocDtoDocument();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_DTO_DOCUMENT__FIELDS = eINSTANCE.getLDocDtoDocument_Fields();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_DTO_DOCUMENT__MODEL = eINSTANCE.getLDocDtoDocument_Model();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoPropertyImpl <em>LDoc Dto Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocDtoPropertyImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocDtoProperty()
		 * @generated
		 */
		EClass LDOC_DTO_PROPERTY = eINSTANCE.getLDocDtoProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_DTO_PROPERTY__NAME = eINSTANCE.getLDocDtoProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_DTO_PROPERTY__TYPE_FIELD = eINSTANCE.getLDocDtoProperty_TypeField();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_DTO_PROPERTY__DESCRIPTION = eINSTANCE.getLDocDtoProperty_Description();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocBPMProcessDocumentImpl <em>LDoc BPM Process Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocBPMProcessDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocBPMProcessDocument()
		 * @generated
		 */
		EClass LDOC_BPM_PROCESS_DOCUMENT = eINSTANCE.getLDocBPMProcessDocument();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_BPM_PROCESS_DOCUMENT__PROCESS = eINSTANCE.getLDocBPMProcessDocument_Process();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocHumanTaskDocumentImpl <em>LDoc Human Task Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocHumanTaskDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocHumanTaskDocument()
		 * @generated
		 */
		EClass LDOC_HUMAN_TASK_DOCUMENT = eINSTANCE.getLDocHumanTaskDocument();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_HUMAN_TASK_DOCUMENT__TASK = eINSTANCE.getLDocHumanTaskDocument_Task();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl <em>LDoc View Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocViewDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocViewDocument()
		 * @generated
		 */
		EClass LDOC_VIEW_DOCUMENT = eINSTANCE.getLDocViewDocument();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_VIEW_DOCUMENT__VIEW = eINSTANCE.getLDocViewDocument_View();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocUIDocumentImpl <em>LDoc UI Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocUIDocumentImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocUIDocument()
		 * @generated
		 */
		EClass LDOC_UI_DOCUMENT = eINSTANCE.getLDocUIDocument();

		/**
		 * The meta object literal for the '<em><b>Ui</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LDOC_UI_DOCUMENT__UI = eINSTANCE.getLDocUIDocument_Ui();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl <em>LDoc Layouter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LDocLayouterImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocLayouter()
		 * @generated
		 */
		EClass LDOC_LAYOUTER = eINSTANCE.getLDocLayouter();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_LAYOUTER__CONTENT = eINSTANCE.getLDocLayouter_Content();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_LAYOUTER__IMPORTS = eINSTANCE.getLDocLayouter_Imports();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LDOC_LAYOUTER__INCLUDES = eINSTANCE.getLDocLayouter_Includes();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.LDocType <em>LDoc Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.lunifera.doc.dsl.luniferadoc.LDocType
		 * @see org.lunifera.doc.dsl.luniferadoc.impl.LunDocPackageImpl#getLDocType()
		 * @generated
		 */
		EEnum LDOC_TYPE = eINSTANCE.getLDocType();

	}

} //LunDocPackage
