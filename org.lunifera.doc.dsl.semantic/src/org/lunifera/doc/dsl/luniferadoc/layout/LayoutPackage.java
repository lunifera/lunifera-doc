/**
 */
package org.lunifera.doc.dsl.luniferadoc.layout;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutFactory
 * @model kind="package"
 * @generated
 */
public interface LayoutPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "layout";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://www.lunifera.org/luniferadoc/layout";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "layout";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	LayoutPackage eINSTANCE = org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
	 * <em>Lunifera Doc Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getLuniferaDocLayout()
	 * @generated
	 */
	int LUNIFERA_DOC_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LUNIFERA_DOC_LAYOUT__NAME = LuniferaDocPackage.NAMED_DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LUNIFERA_DOC_LAYOUT__CONTENT = LuniferaDocPackage.NAMED_DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LUNIFERA_DOC_LAYOUT__IMPORTS = LuniferaDocPackage.NAMED_DOCUMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lunifera Doc Layout</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LUNIFERA_DOC_LAYOUT_FEATURE_COUNT = LuniferaDocPackage.NAMED_DOCUMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.EntityLayoutImpl
	 * <em>Entity Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.EntityLayoutImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getEntityLayout()
	 * @generated
	 */
	int ENTITY_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LAYOUT__NAME = LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LAYOUT__CONTENT = LUNIFERA_DOC_LAYOUT__CONTENT;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LAYOUT__IMPORTS = LUNIFERA_DOC_LAYOUT__IMPORTS;

	/**
	 * The number of structural features of the '<em>Entity Layout</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_LAYOUT_FEATURE_COUNT = LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.DTOLayoutImpl
	 * <em>DTO Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.DTOLayoutImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getDTOLayout()
	 * @generated
	 */
	int DTO_LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DTO_LAYOUT__NAME = LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DTO_LAYOUT__CONTENT = LUNIFERA_DOC_LAYOUT__CONTENT;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DTO_LAYOUT__IMPORTS = LUNIFERA_DOC_LAYOUT__IMPORTS;

	/**
	 * The number of structural features of the '<em>DTO Layout</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DTO_LAYOUT_FEATURE_COUNT = LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMProcessLayoutImpl
	 * <em>BPM Process Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMProcessLayoutImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getBPMProcessLayout()
	 * @generated
	 */
	int BPM_PROCESS_LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_LAYOUT__NAME = LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_LAYOUT__CONTENT = LUNIFERA_DOC_LAYOUT__CONTENT;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_LAYOUT__IMPORTS = LUNIFERA_DOC_LAYOUT__IMPORTS;

	/**
	 * The number of structural features of the '<em>BPM Process Layout</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_PROCESS_LAYOUT_FEATURE_COUNT = LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMTaskLayoutImpl
	 * <em>BPM Task Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMTaskLayoutImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getBPMTaskLayout()
	 * @generated
	 */
	int BPM_TASK_LAYOUT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_TASK_LAYOUT__NAME = LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_TASK_LAYOUT__CONTENT = LUNIFERA_DOC_LAYOUT__CONTENT;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_TASK_LAYOUT__IMPORTS = LUNIFERA_DOC_LAYOUT__IMPORTS;

	/**
	 * The number of structural features of the '<em>BPM Task Layout</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int BPM_TASK_LAYOUT_FEATURE_COUNT = LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.VaaclipseViewLayoutImpl
	 * <em>Vaaclipse View Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.VaaclipseViewLayoutImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getVaaclipseViewLayout()
	 * @generated
	 */
	int VAACLIPSE_VIEW_LAYOUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VAACLIPSE_VIEW_LAYOUT__NAME = LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VAACLIPSE_VIEW_LAYOUT__CONTENT = LUNIFERA_DOC_LAYOUT__CONTENT;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VAACLIPSE_VIEW_LAYOUT__IMPORTS = LUNIFERA_DOC_LAYOUT__IMPORTS;

	/**
	 * The number of structural features of the '<em>Vaaclipse View Layout</em>' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VAACLIPSE_VIEW_LAYOUT_FEATURE_COUNT = LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.UILayoutImpl <em>UI Layout</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.UILayoutImpl
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getUILayout()
	 * @generated
	 */
	int UI_LAYOUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__NAME = LUNIFERA_DOC_LAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__CONTENT = LUNIFERA_DOC_LAYOUT__CONTENT;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT__IMPORTS = LUNIFERA_DOC_LAYOUT__IMPORTS;

	/**
	 * The number of structural features of the '<em>UI Layout</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UI_LAYOUT_FEATURE_COUNT = LUNIFERA_DOC_LAYOUT_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
	 * <em>Lunifera Doc Layout</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lunifera Doc Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
	 * @generated
	 */
	EClass getLuniferaDocLayout();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout#getContent <em>Content</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout#getContent()
	 * @see #getLuniferaDocLayout()
	 * @generated
	 */
	EReference getLuniferaDocLayout_Content();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout#getImports <em>Imports</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout#getImports()
	 * @see #getLuniferaDocLayout()
	 * @generated
	 */
	EReference getLuniferaDocLayout_Imports();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout
	 * <em>Entity Layout</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout
	 * @generated
	 */
	EClass getEntityLayout();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout <em>DTO Layout</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>DTO Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout
	 * @generated
	 */
	EClass getDTOLayout();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout
	 * <em>BPM Process Layout</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>BPM Process Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout
	 * @generated
	 */
	EClass getBPMProcessLayout();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.layout.BPMTaskLayout
	 * <em>BPM Task Layout</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>BPM Task Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.BPMTaskLayout
	 * @generated
	 */
	EClass getBPMTaskLayout();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout
	 * <em>Vaaclipse View Layout</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Vaaclipse View Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout
	 * @generated
	 */
	EClass getVaaclipseViewLayout();

	/**
	 * Returns the meta object for class '{@link org.lunifera.doc.dsl.luniferadoc.layout.UILayout <em>UI Layout</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>UI Layout</em>'.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.UILayout
	 * @generated
	 */
	EClass getUILayout();

	/**
	 * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LayoutFactory getLayoutFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
		 * <em>Lunifera Doc Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getLuniferaDocLayout()
		 * @generated
		 */
		EClass LUNIFERA_DOC_LAYOUT = eINSTANCE.getLuniferaDocLayout();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LUNIFERA_DOC_LAYOUT__CONTENT = eINSTANCE.getLuniferaDocLayout_Content();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference LUNIFERA_DOC_LAYOUT__IMPORTS = eINSTANCE.getLuniferaDocLayout_Imports();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.EntityLayoutImpl
		 * <em>Entity Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.EntityLayoutImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getEntityLayout()
		 * @generated
		 */
		EClass ENTITY_LAYOUT = eINSTANCE.getEntityLayout();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.DTOLayoutImpl
		 * <em>DTO Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.DTOLayoutImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getDTOLayout()
		 * @generated
		 */
		EClass DTO_LAYOUT = eINSTANCE.getDTOLayout();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMProcessLayoutImpl
		 * <em>BPM Process Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMProcessLayoutImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getBPMProcessLayout()
		 * @generated
		 */
		EClass BPM_PROCESS_LAYOUT = eINSTANCE.getBPMProcessLayout();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMTaskLayoutImpl
		 * <em>BPM Task Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.BPMTaskLayoutImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getBPMTaskLayout()
		 * @generated
		 */
		EClass BPM_TASK_LAYOUT = eINSTANCE.getBPMTaskLayout();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.VaaclipseViewLayoutImpl
		 * <em>Vaaclipse View Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.VaaclipseViewLayoutImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getVaaclipseViewLayout()
		 * @generated
		 */
		EClass VAACLIPSE_VIEW_LAYOUT = eINSTANCE.getVaaclipseViewLayout();

		/**
		 * The meta object literal for the '{@link org.lunifera.doc.dsl.luniferadoc.layout.impl.UILayoutImpl
		 * <em>UI Layout</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.UILayoutImpl
		 * @see org.lunifera.doc.dsl.luniferadoc.layout.impl.LayoutPackageImpl#getUILayout()
		 * @generated
		 */
		EClass UI_LAYOUT = eINSTANCE.getUILayout();

	}

} // LayoutPackage
