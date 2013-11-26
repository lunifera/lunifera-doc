/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTODescription;
import org.lunifera.doc.dsl.luniferadoc.document.DTODetails;
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument;
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDescription;
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument;
import org.lunifera.doc.dsl.luniferadoc.document.EntityField;
import org.lunifera.doc.dsl.luniferadoc.document.EntityFields;
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument;
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument;
import org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage
 * @generated
 */
public class DocumentSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocumentPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentSwitch() {
		if (modelPackage == null) {
			modelPackage = DocumentPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DocumentPackage.ENTITY_DOCUMENT: {
				EntityDocument entityDocument = (EntityDocument)theEObject;
				T result = caseEntityDocument(entityDocument);
				if (result == null) result = caseLuniferaDocDocument(entityDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.ENTITY_DESCRIPTION: {
				EntityDescription entityDescription = (EntityDescription)theEObject;
				T result = caseEntityDescription(entityDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.ENTITY_FIELDS: {
				EntityFields entityFields = (EntityFields)theEObject;
				T result = caseEntityFields(entityFields);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.ENTITY_FIELD: {
				EntityField entityField = (EntityField)theEObject;
				T result = caseEntityField(entityField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.DTO_DOCUMENT: {
				DTODocument dtoDocument = (DTODocument)theEObject;
				T result = caseDTODocument(dtoDocument);
				if (result == null) result = caseLuniferaDocDocument(dtoDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.DTO_DESCRIPTION: {
				DTODescription dtoDescription = (DTODescription)theEObject;
				T result = caseDTODescription(dtoDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.DTO_DETAILS: {
				DTODetails dtoDetails = (DTODetails)theEObject;
				T result = caseDTODetails(dtoDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.DTO_PROPERTY: {
				DTOProperty dtoProperty = (DTOProperty)theEObject;
				T result = caseDTOProperty(dtoProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.BPM_PROCESS_DOCUMENT: {
				BPMProcessDocument bpmProcessDocument = (BPMProcessDocument)theEObject;
				T result = caseBPMProcessDocument(bpmProcessDocument);
				if (result == null) result = caseLuniferaDocDocument(bpmProcessDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.BPM_TASK_DOCUMENT: {
				BPMTaskDocument bpmTaskDocument = (BPMTaskDocument)theEObject;
				T result = caseBPMTaskDocument(bpmTaskDocument);
				if (result == null) result = caseLuniferaDocDocument(bpmTaskDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.VAACLIPSE_VIEW_DOCUMENT: {
				VaaclipseViewDocument vaaclipseViewDocument = (VaaclipseViewDocument)theEObject;
				T result = caseVaaclipseViewDocument(vaaclipseViewDocument);
				if (result == null) result = caseLuniferaDocDocument(vaaclipseViewDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.UI_DOCUMENT: {
				UIDocument uiDocument = (UIDocument)theEObject;
				T result = caseUIDocument(uiDocument);
				if (result == null) result = caseLuniferaDocDocument(uiDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocumentPackage.GENERAL_DOCUMENT: {
				GeneralDocument generalDocument = (GeneralDocument)theEObject;
				T result = caseGeneralDocument(generalDocument);
				if (result == null) result = caseLuniferaDocLayout(generalDocument);
				if (result == null) result = caseLuniferaDocDocument(generalDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDocument(EntityDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityDescription(EntityDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Fields</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Fields</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityFields(EntityFields object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityField(EntityField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTODocument(DTODocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTODescription(DTODescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Details</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Details</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTODetails(DTODetails object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTOProperty(DTOProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPM Process Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPM Process Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMProcessDocument(BPMProcessDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPM Task Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPM Task Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMTaskDocument(BPMTaskDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaaclipse View Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaaclipse View Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaaclipseViewDocument(VaaclipseViewDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIDocument(UIDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralDocument(GeneralDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuniferaDocDocument(LuniferaDocDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lunifera Doc Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lunifera Doc Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuniferaDocLayout(LuniferaDocLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DocumentSwitch
