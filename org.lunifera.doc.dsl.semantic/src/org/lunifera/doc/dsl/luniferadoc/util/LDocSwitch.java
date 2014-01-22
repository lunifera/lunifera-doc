/**
 */
package org.lunifera.doc.dsl.luniferadoc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.lunifera.doc.dsl.luniferadoc.*;

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
 * @see org.lunifera.doc.dsl.luniferadoc.LDocPackage
 * @generated
 */
public class LDocSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LDocPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDocSwitch() {
		if (modelPackage == null) {
			modelPackage = LDocPackage.eINSTANCE;
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
			case LDocPackage.LDOC_NAMED_DOCUMENT: {
				LDocNamedDocument lDocNamedDocument = (LDocNamedDocument)theEObject;
				T result = caseLDocNamedDocument(lDocNamedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_INCLUDE: {
				LDocInclude lDocInclude = (LDocInclude)theEObject;
				T result = caseLDocInclude(lDocInclude);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_DOCUMENT: {
				LDocDocument lDocDocument = (LDocDocument)theEObject;
				T result = caseLDocDocument(lDocDocument);
				if (result == null) result = caseLDocNamedDocument(lDocDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_ENTITY_DOCUMENT: {
				LDocEntityDocument lDocEntityDocument = (LDocEntityDocument)theEObject;
				T result = caseLDocEntityDocument(lDocEntityDocument);
				if (result == null) result = caseLDocDocument(lDocEntityDocument);
				if (result == null) result = caseLDocNamedDocument(lDocEntityDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_ENTITY_FIELD: {
				LDocEntityField lDocEntityField = (LDocEntityField)theEObject;
				T result = caseLDocEntityField(lDocEntityField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_DTO_DOCUMENT: {
				LDocDtoDocument lDocDtoDocument = (LDocDtoDocument)theEObject;
				T result = caseLDocDtoDocument(lDocDtoDocument);
				if (result == null) result = caseLDocDocument(lDocDtoDocument);
				if (result == null) result = caseLDocNamedDocument(lDocDtoDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_DTO_PROPERTY: {
				LDocDtoProperty lDocDtoProperty = (LDocDtoProperty)theEObject;
				T result = caseLDocDtoProperty(lDocDtoProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_BPM_PROCESS_DOCUMENT: {
				LDocBPMProcessDocument lDocBPMProcessDocument = (LDocBPMProcessDocument)theEObject;
				T result = caseLDocBPMProcessDocument(lDocBPMProcessDocument);
				if (result == null) result = caseLDocDocument(lDocBPMProcessDocument);
				if (result == null) result = caseLDocNamedDocument(lDocBPMProcessDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_HUMAN_TASK_DOCUMENT: {
				LDocHumanTaskDocument lDocHumanTaskDocument = (LDocHumanTaskDocument)theEObject;
				T result = caseLDocHumanTaskDocument(lDocHumanTaskDocument);
				if (result == null) result = caseLDocDocument(lDocHumanTaskDocument);
				if (result == null) result = caseLDocNamedDocument(lDocHumanTaskDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_VIEW_DOCUMENT: {
				LDocViewDocument lDocViewDocument = (LDocViewDocument)theEObject;
				T result = caseLDocViewDocument(lDocViewDocument);
				if (result == null) result = caseLDocDocument(lDocViewDocument);
				if (result == null) result = caseLDocNamedDocument(lDocViewDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_UI_DOCUMENT: {
				LDocUiDocument lDocUiDocument = (LDocUiDocument)theEObject;
				T result = caseLDocUiDocument(lDocUiDocument);
				if (result == null) result = caseLDocDocument(lDocUiDocument);
				if (result == null) result = caseLDocNamedDocument(lDocUiDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LDocPackage.LDOC_LAYOUTER: {
				LDocLayouter lDocLayouter = (LDocLayouter)theEObject;
				T result = caseLDocLayouter(lDocLayouter);
				if (result == null) result = caseLDocNamedDocument(lDocLayouter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocNamedDocument(LDocNamedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocInclude(LDocInclude object) {
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
	public T caseLDocDocument(LDocDocument object) {
		return null;
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
	public T caseLDocEntityDocument(LDocEntityDocument object) {
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
	public T caseLDocEntityField(LDocEntityField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocDtoDocument(LDocDtoDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocDtoProperty(LDocDtoProperty object) {
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
	public T caseLDocBPMProcessDocument(LDocBPMProcessDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Human Task Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Task Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocHumanTaskDocument(LDocHumanTaskDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocViewDocument(LDocViewDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ui Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ui Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocUiDocument(LDocUiDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layouter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layouter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDocLayouter(LDocLayouter object) {
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

} //LDocSwitch
