/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTOHeader;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument;
import org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage
 * @generated
 */
public class DocumentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocumentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DocumentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentSwitch<Adapter> modelSwitch =
		new DocumentSwitch<Adapter>() {
			@Override
			public Adapter caseDTODocument(DTODocument object) {
				return createDTODocumentAdapter();
			}
			@Override
			public Adapter caseDTOHeader(DTOHeader object) {
				return createDTOHeaderAdapter();
			}
			@Override
			public Adapter caseDTODetails(DTODetails object) {
				return createDTODetailsAdapter();
			}
			@Override
			public Adapter caseDTOProperty(DTOProperty object) {
				return createDTOPropertyAdapter();
			}
			@Override
			public Adapter caseEntityDocument(EntityDocument object) {
				return createEntityDocumentAdapter();
			}
			@Override
			public Adapter caseBPMProcessDocument(BPMProcessDocument object) {
				return createBPMProcessDocumentAdapter();
			}
			@Override
			public Adapter caseBPMTaskDocument(BPMTaskDocument object) {
				return createBPMTaskDocumentAdapter();
			}
			@Override
			public Adapter caseVaaclipseViewDocument(VaaclipseViewDocument object) {
				return createVaaclipseViewDocumentAdapter();
			}
			@Override
			public Adapter caseUIDocument(UIDocument object) {
				return createUIDocumentAdapter();
			}
			@Override
			public Adapter caseGeneralDocument(GeneralDocument object) {
				return createGeneralDocumentAdapter();
			}
			@Override
			public Adapter caseLuniferaDocDocument(LuniferaDocDocument object) {
				return createLuniferaDocDocumentAdapter();
			}
			@Override
			public Adapter caseLuniferaDocLayout(LuniferaDocLayout object) {
				return createLuniferaDocLayoutAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument <em>DTO Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument
	 * @generated
	 */
	public Adapter createDTODocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOHeader <em>DTO Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOHeader
	 * @generated
	 */
	public Adapter createDTOHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODetails <em>DTO Details</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODetails
	 * @generated
	 */
	public Adapter createDTODetailsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty <em>DTO Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperty
	 * @generated
	 */
	public Adapter createDTOPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument <em>Entity Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDocument
	 * @generated
	 */
	public Adapter createEntityDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument <em>BPM Process Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument
	 * @generated
	 */
	public Adapter createBPMProcessDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument <em>BPM Task Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument
	 * @generated
	 */
	public Adapter createBPMTaskDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument <em>Vaaclipse View Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument
	 * @generated
	 */
	public Adapter createVaaclipseViewDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.UIDocument <em>UI Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.UIDocument
	 * @generated
	 */
	public Adapter createUIDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument <em>General Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
	 * @generated
	 */
	public Adapter createGeneralDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument
	 * @generated
	 */
	public Adapter createLuniferaDocDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout <em>Lunifera Doc Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout
	 * @generated
	 */
	public Adapter createLuniferaDocLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DocumentAdapterFactory
