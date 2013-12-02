/**
 */
package org.lunifera.doc.dsl.luniferadoc.layout.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.luniferadoc.NamedDocument;
import org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.BPMTaskLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.UILayout;
import org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage
 * @generated
 */
public class LayoutAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static LayoutPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LayoutAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LayoutPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc --> This
	 * implementation returns <code>true</code> if the object is either the model's package or is an instance object of
	 * the model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected LayoutSwitch<Adapter> modelSwitch =
			new LayoutSwitch<Adapter>() {
				@Override
				public Adapter caseLuniferaDocLayout(LuniferaDocLayout object) {
					return createLuniferaDocLayoutAdapter();
				}

				@Override
				public Adapter caseEntityLayout(EntityLayout object) {
					return createEntityLayoutAdapter();
				}

				@Override
				public Adapter caseDTOLayout(DTOLayout object) {
					return createDTOLayoutAdapter();
				}

				@Override
				public Adapter caseBPMProcessLayout(BPMProcessLayout object) {
					return createBPMProcessLayoutAdapter();
				}

				@Override
				public Adapter caseBPMTaskLayout(BPMTaskLayout object) {
					return createBPMTaskLayoutAdapter();
				}

				@Override
				public Adapter caseVaaclipseViewLayout(VaaclipseViewLayout object) {
					return createVaaclipseViewLayoutAdapter();
				}

				@Override
				public Adapter caseUILayout(UILayout object) {
					return createUILayoutAdapter();
				}

				@Override
				public Adapter caseNamedDocument(NamedDocument object) {
					return createNamedDocumentAdapter();
				}

				@Override
				public Adapter defaultCase(EObject object) {
					return createEObjectAdapter();
				}
			};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
	 * <em>Lunifera Doc Layout</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
	 * @generated
	 */
	public Adapter createLuniferaDocLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout
	 * <em>Entity Layout</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout
	 * @generated
	 */
	public Adapter createEntityLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout
	 * <em>DTO Layout</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout
	 * @generated
	 */
	public Adapter createDTOLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout
	 * <em>BPM Process Layout</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout
	 * @generated
	 */
	public Adapter createBPMProcessLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.BPMTaskLayout
	 * <em>BPM Task Layout</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.BPMTaskLayout
	 * @generated
	 */
	public Adapter createBPMTaskLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout
	 * <em>Vaaclipse View Layout</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout
	 * @generated
	 */
	public Adapter createVaaclipseViewLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.UILayout
	 * <em>UI Layout</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.UILayout
	 * @generated
	 */
	public Adapter createUILayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.NamedDocument
	 * <em>Named Document</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.NamedDocument
	 * @generated
	 */
	public Adapter createNamedDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // LayoutAdapterFactory
