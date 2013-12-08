/**
 */
package org.lunifera.doc.dsl.luniferadoc.layout.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.doc.dsl.luniferadoc.layout.BPMHumanTaskLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutFactory;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.UILayout;
import org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LayoutFactoryImpl extends EFactoryImpl implements LayoutFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LayoutFactory init() {
		try {
			LayoutFactory theLayoutFactory = (LayoutFactory)EPackage.Registry.INSTANCE.getEFactory(LayoutPackage.eNS_URI);
			if (theLayoutFactory != null) {
				return theLayoutFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LayoutFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutFactoryImpl() {
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
			case LayoutPackage.ENTITY_LAYOUT: return createEntityLayout();
			case LayoutPackage.DTO_LAYOUT: return createDTOLayout();
			case LayoutPackage.BPM_PROCESS_LAYOUT: return createBPMProcessLayout();
			case LayoutPackage.BPM_HUMAN_TASK_LAYOUT: return createBPMHumanTaskLayout();
			case LayoutPackage.VAACLIPSE_VIEW_LAYOUT: return createVaaclipseViewLayout();
			case LayoutPackage.UI_LAYOUT: return createUILayout();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityLayout createEntityLayout() {
		EntityLayoutImpl entityLayout = new EntityLayoutImpl();
		return entityLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTOLayout createDTOLayout() {
		DTOLayoutImpl dtoLayout = new DTOLayoutImpl();
		return dtoLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMProcessLayout createBPMProcessLayout() {
		BPMProcessLayoutImpl bpmProcessLayout = new BPMProcessLayoutImpl();
		return bpmProcessLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMHumanTaskLayout createBPMHumanTaskLayout() {
		BPMHumanTaskLayoutImpl bpmHumanTaskLayout = new BPMHumanTaskLayoutImpl();
		return bpmHumanTaskLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VaaclipseViewLayout createVaaclipseViewLayout() {
		VaaclipseViewLayoutImpl vaaclipseViewLayout = new VaaclipseViewLayoutImpl();
		return vaaclipseViewLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UILayout createUILayout() {
		UILayoutImpl uiLayout = new UILayoutImpl();
		return uiLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayoutPackage getLayoutPackage() {
		return (LayoutPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LayoutPackage getPackage() {
		return LayoutPackage.eINSTANCE;
	}

} //LayoutFactoryImpl
