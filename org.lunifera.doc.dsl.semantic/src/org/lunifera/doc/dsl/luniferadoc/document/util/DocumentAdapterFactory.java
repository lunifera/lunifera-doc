/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.lunifera.doc.dsl.luniferadoc.NamedDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTODescription;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperties;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDescription;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.document.EntityField;
import org.lunifera.doc.dsl.luniferadoc.document.EntityFields;
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument;
import org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter <code>createXXX</code>
 * method for each class of the model. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage
 * @generated
 */
public class DocumentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static DocumentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DocumentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DocumentPackage.eINSTANCE;
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
	protected DocumentSwitch<Adapter> modelSwitch =
			new DocumentSwitch<Adapter>() {
				@Override
				public Adapter caseLuniferaDocDocument(LuniferaDocDocument object) {
					return createLuniferaDocDocumentAdapter();
				}

				@Override
				public Adapter caseEntityDocument(EntityDocument object) {
					return createEntityDocumentAdapter();
				}

				@Override
				public Adapter caseEntityDescription(EntityDescription object) {
					return createEntityDescriptionAdapter();
				}

				@Override
				public Adapter caseEntityFields(EntityFields object) {
					return createEntityFieldsAdapter();
				}

				@Override
				public Adapter caseEntityField(EntityField object) {
					return createEntityFieldAdapter();
				}

				@Override
				public Adapter caseDTODocument(DTODocument object) {
					return createDTODocumentAdapter();
				}

				@Override
				public Adapter caseDTODescription(DTODescription object) {
					return createDTODescriptionAdapter();
				}

				@Override
				public Adapter caseDTOProperties(DTOProperties object) {
					return createDTOPropertiesAdapter();
				}

				@Override
				public Adapter caseDTOProperty(DTOProperty object) {
					return createDTOPropertyAdapter();
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
				public Adapter caseNamedDocument(NamedDocument object) {
					return createNamedDocumentAdapter();
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
	 * Creates a new adapter for an object of class '
	 * {@link org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument <em>Lunifera Doc Document</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.LuniferaDocDocument
	 * @generated
	 */
	public Adapter createLuniferaDocDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDocument
	 * <em>Entity Document</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDocument
	 * @generated
	 */
	public Adapter createEntityDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityDescription
	 * <em>Entity Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityDescription
	 * @generated
	 */
	public Adapter createEntityDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityFields
	 * <em>Entity Fields</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityFields
	 * @generated
	 */
	public Adapter createEntityFieldsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.EntityField
	 * <em>Entity Field</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.EntityField
	 * @generated
	 */
	public Adapter createEntityFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODocument
	 * <em>DTO Document</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODocument
	 * @generated
	 */
	public Adapter createDTODocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTODescription
	 * <em>DTO Description</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTODescription
	 * @generated
	 */
	public Adapter createDTODescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperties
	 * <em>DTO Properties</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperties
	 * @generated
	 */
	public Adapter createDTOPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.DTOProperty
	 * <em>DTO Property</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.DTOProperty
	 * @generated
	 */
	public Adapter createDTOPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument <em>BPM Process Document</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument
	 * @generated
	 */
	public Adapter createBPMProcessDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument
	 * <em>BPM Task Document</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument
	 * @generated
	 */
	public Adapter createBPMTaskDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument <em>Vaaclipse View Document</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we can easily ignore cases; it's useful to
	 * ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument
	 * @generated
	 */
	public Adapter createVaaclipseViewDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.UIDocument
	 * <em>UI Document</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can easily
	 * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.UIDocument
	 * @generated
	 */
	public Adapter createUIDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
	 * <em>General Document</em>}'. <!-- begin-user-doc --> This default implementation returns null so that we can
	 * easily ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
	 * end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
	 * @generated
	 */
	public Adapter createGeneralDocumentAdapter() {
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
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This default implementation returns null.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // DocumentAdapterFactory
