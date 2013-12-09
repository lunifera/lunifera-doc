/**
 */
package org.lunifera.doc.dsl.luniferadoc.layout.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.lunifera.doc.dsl.luniferadoc.NamedDocument;
import org.lunifera.doc.dsl.luniferadoc.layout.BPMHumanTaskLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.BPMProcessLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage;
import org.lunifera.doc.dsl.luniferadoc.layout.LuniferaDocLayout;
import org.lunifera.doc.dsl.luniferadoc.layout.UILayout;
import org.lunifera.doc.dsl.luniferadoc.layout.VaaclipseViewLayout;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.layout.LayoutPackage
 * @generated
 */
public class LayoutSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static LayoutPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public LayoutSwitch() {
		if (modelPackage == null) {
			modelPackage = LayoutPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that
	 * result. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LayoutPackage.LUNIFERA_DOC_LAYOUT: {
			LuniferaDocLayout luniferaDocLayout = (LuniferaDocLayout) theEObject;
			T result = caseLuniferaDocLayout(luniferaDocLayout);
			if (result == null)
				result = caseNamedDocument(luniferaDocLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LayoutPackage.ENTITY_LAYOUT: {
			EntityLayout entityLayout = (EntityLayout) theEObject;
			T result = caseEntityLayout(entityLayout);
			if (result == null)
				result = caseLuniferaDocLayout(entityLayout);
			if (result == null)
				result = caseNamedDocument(entityLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LayoutPackage.DTO_LAYOUT: {
			DTOLayout dtoLayout = (DTOLayout) theEObject;
			T result = caseDTOLayout(dtoLayout);
			if (result == null)
				result = caseLuniferaDocLayout(dtoLayout);
			if (result == null)
				result = caseNamedDocument(dtoLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LayoutPackage.BPM_PROCESS_LAYOUT: {
			BPMProcessLayout bpmProcessLayout = (BPMProcessLayout) theEObject;
			T result = caseBPMProcessLayout(bpmProcessLayout);
			if (result == null)
				result = caseLuniferaDocLayout(bpmProcessLayout);
			if (result == null)
				result = caseNamedDocument(bpmProcessLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LayoutPackage.BPM_HUMAN_TASK_LAYOUT: {
			BPMHumanTaskLayout bpmHumanTaskLayout = (BPMHumanTaskLayout) theEObject;
			T result = caseBPMHumanTaskLayout(bpmHumanTaskLayout);
			if (result == null)
				result = caseLuniferaDocLayout(bpmHumanTaskLayout);
			if (result == null)
				result = caseNamedDocument(bpmHumanTaskLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LayoutPackage.VAACLIPSE_VIEW_LAYOUT: {
			VaaclipseViewLayout vaaclipseViewLayout = (VaaclipseViewLayout) theEObject;
			T result = caseVaaclipseViewLayout(vaaclipseViewLayout);
			if (result == null)
				result = caseLuniferaDocLayout(vaaclipseViewLayout);
			if (result == null)
				result = caseNamedDocument(vaaclipseViewLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LayoutPackage.UI_LAYOUT: {
			UILayout uiLayout = (UILayout) theEObject;
			T result = caseUILayout(uiLayout);
			if (result == null)
				result = caseLuniferaDocLayout(uiLayout);
			if (result == null)
				result = caseNamedDocument(uiLayout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lunifera Doc Layout</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lunifera Doc Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuniferaDocLayout(LuniferaDocLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Layout</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityLayout(EntityLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DTO Layout</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTOLayout(DTOLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPM Process Layout</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPM Process Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMProcessLayout(BPMProcessLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BPM Human Task Layout</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BPM Human Task Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBPMHumanTaskLayout(BPMHumanTaskLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vaaclipse View Layout</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vaaclipse View Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaaclipseViewLayout(VaaclipseViewLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Layout</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUILayout(UILayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Document</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedDocument(NamedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate the switch, but this is the last case
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // LayoutSwitch
