/**
 */
package org.lunifera.doc.dsl.luniferadoc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XStringLiteral;

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
 * @see org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage
 * @generated
 */
public class LuniferaDocSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LuniferaDocPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuniferaDocSwitch() {
		if (modelPackage == null) {
			modelPackage = LuniferaDocPackage.eINSTANCE;
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
			case LuniferaDocPackage.LUNIFERA_DOC_DOCUMENT: {
				LuniferaDocDocument luniferaDocDocument = (LuniferaDocDocument)theEObject;
				T result = caseLuniferaDocDocument(luniferaDocDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.DOC_LAYOUT: {
				DocLayout docLayout = (DocLayout)theEObject;
				T result = caseDocLayout(docLayout);
				if (result == null) result = caseLuniferaDocDocument(docLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_ELSE_IF: {
				RichStringElseIf richStringElseIf = (RichStringElseIf)theEObject;
				T result = caseRichStringElseIf(richStringElseIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING: {
				RichString richString = (RichString)theEObject;
				T result = caseRichString(richString);
				if (result == null) result = caseXBlockExpression(richString);
				if (result == null) result = caseXExpression(richString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_LITERAL: {
				RichStringLiteral richStringLiteral = (RichStringLiteral)theEObject;
				T result = caseRichStringLiteral(richStringLiteral);
				if (result == null) result = caseXStringLiteral(richStringLiteral);
				if (result == null) result = caseXExpression(richStringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_FOR_LOOP: {
				RichStringForLoop richStringForLoop = (RichStringForLoop)theEObject;
				T result = caseRichStringForLoop(richStringForLoop);
				if (result == null) result = caseXForLoopExpression(richStringForLoop);
				if (result == null) result = caseXExpression(richStringForLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_IF: {
				RichStringIf richStringIf = (RichStringIf)theEObject;
				T result = caseRichStringIf(richStringIf);
				if (result == null) result = caseXExpression(richStringIf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_EXAMPLE: {
				RichStringExample richStringExample = (RichStringExample)theEObject;
				T result = caseRichStringExample(richStringExample);
				if (result == null) result = caseRichStringMarkup(richStringExample);
				if (result == null) result = caseXExpression(richStringExample);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_H1: {
				RichStringH1 richStringH1 = (RichStringH1)theEObject;
				T result = caseRichStringH1(richStringH1);
				if (result == null) result = caseRichStringMarkup(richStringH1);
				if (result == null) result = caseXExpression(richStringH1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_H2: {
				RichStringH2 richStringH2 = (RichStringH2)theEObject;
				T result = caseRichStringH2(richStringH2);
				if (result == null) result = caseRichStringMarkup(richStringH2);
				if (result == null) result = caseXExpression(richStringH2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.RICH_STRING_MARKUP: {
				RichStringMarkup richStringMarkup = (RichStringMarkup)theEObject;
				T result = caseRichStringMarkup(richStringMarkup);
				if (result == null) result = caseXExpression(richStringMarkup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.DTO_DOCUMENT: {
				DTODocument dtoDocument = (DTODocument)theEObject;
				T result = caseDTODocument(dtoDocument);
				if (result == null) result = caseLuniferaDocDocument(dtoDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.DTO_HEADER: {
				DTOHeader dtoHeader = (DTOHeader)theEObject;
				T result = caseDTOHeader(dtoHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.DTO_DETAILS: {
				DTODetails dtoDetails = (DTODetails)theEObject;
				T result = caseDTODetails(dtoDetails);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LuniferaDocPackage.DTO_PROPERTY: {
				DTOProperty dtoProperty = (DTOProperty)theEObject;
				T result = caseDTOProperty(dtoProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Doc Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Doc Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocLayout(DocLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Else If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringElseIf(RichStringElseIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichString(RichString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringLiteral(RichStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringForLoop(RichStringForLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringIf(RichStringIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringExample(RichStringExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String H1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String H1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringH1(RichStringH1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String H2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String H2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringH2(RichStringH2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Markup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringMarkup(RichStringMarkup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DTO Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DTO Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDTOHeader(DTOHeader object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXExpression(XExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBlockExpression(XBlockExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XString Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XString Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXStringLiteral(XStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFor Loop Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFor Loop Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXForLoopExpression(XForLoopExpression object) {
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

} //LuniferaDocSwitch
