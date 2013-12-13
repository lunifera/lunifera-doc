/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringBold;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringCode;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringImg;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringItalic;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMailto;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringSkype;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringUnderline;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the call
 * {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the inheritance hierarchy until a non-null result is
 * returned, which is the result of the switch. <!-- end-user-doc -->
 * 
 * @see org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage
 * @generated
 */
public class RichstringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static RichstringPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public RichstringSwitch() {
		if (modelPackage == null) {
			modelPackage = RichstringPackage.eINSTANCE;
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
		case RichstringPackage.RICH_STRING_ELSE_IF: {
			RichStringElseIf richStringElseIf = (RichStringElseIf) theEObject;
			T result = caseRichStringElseIf(richStringElseIf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING: {
			RichString richString = (RichString) theEObject;
			T result = caseRichString(richString);
			if (result == null)
				result = caseXBlockExpression(richString);
			if (result == null)
				result = caseXExpression(richString);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_LITERAL: {
			RichStringLiteral richStringLiteral = (RichStringLiteral) theEObject;
			T result = caseRichStringLiteral(richStringLiteral);
			if (result == null)
				result = caseXStringLiteral(richStringLiteral);
			if (result == null)
				result = caseXExpression(richStringLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_FOR_LOOP: {
			RichStringForLoop richStringForLoop = (RichStringForLoop) theEObject;
			T result = caseRichStringForLoop(richStringForLoop);
			if (result == null)
				result = caseXForLoopExpression(richStringForLoop);
			if (result == null)
				result = caseXExpression(richStringForLoop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_IF: {
			RichStringIf richStringIf = (RichStringIf) theEObject;
			T result = caseRichStringIf(richStringIf);
			if (result == null)
				result = caseXExpression(richStringIf);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_MARKUP: {
			RichStringMarkup richStringMarkup = (RichStringMarkup) theEObject;
			T result = caseRichStringMarkup(richStringMarkup);
			if (result == null)
				result = caseXExpression(richStringMarkup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_EXAMPLE: {
			RichStringExample richStringExample = (RichStringExample) theEObject;
			T result = caseRichStringExample(richStringExample);
			if (result == null)
				result = caseRichStringMarkup(richStringExample);
			if (result == null)
				result = caseXExpression(richStringExample);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_H1: {
			RichStringH1 richStringH1 = (RichStringH1) theEObject;
			T result = caseRichStringH1(richStringH1);
			if (result == null)
				result = caseRichStringMarkup(richStringH1);
			if (result == null)
				result = caseXExpression(richStringH1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_H2: {
			RichStringH2 richStringH2 = (RichStringH2) theEObject;
			T result = caseRichStringH2(richStringH2);
			if (result == null)
				result = caseRichStringMarkup(richStringH2);
			if (result == null)
				result = caseXExpression(richStringH2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_URL: {
			RichStringURL richStringURL = (RichStringURL) theEObject;
			T result = caseRichStringURL(richStringURL);
			if (result == null)
				result = caseXExpression(richStringURL);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_BOLD: {
			RichStringBold richStringBold = (RichStringBold) theEObject;
			T result = caseRichStringBold(richStringBold);
			if (result == null)
				result = caseRichStringMarkup(richStringBold);
			if (result == null)
				result = caseXExpression(richStringBold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_UNDERLINE: {
			RichStringUnderline richStringUnderline = (RichStringUnderline) theEObject;
			T result = caseRichStringUnderline(richStringUnderline);
			if (result == null)
				result = caseRichStringMarkup(richStringUnderline);
			if (result == null)
				result = caseXExpression(richStringUnderline);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_ITALIC: {
			RichStringItalic richStringItalic = (RichStringItalic) theEObject;
			T result = caseRichStringItalic(richStringItalic);
			if (result == null)
				result = caseRichStringMarkup(richStringItalic);
			if (result == null)
				result = caseXExpression(richStringItalic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_IMG: {
			RichStringImg richStringImg = (RichStringImg) theEObject;
			T result = caseRichStringImg(richStringImg);
			if (result == null)
				result = caseXExpression(richStringImg);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_MAILTO: {
			RichStringMailto richStringMailto = (RichStringMailto) theEObject;
			T result = caseRichStringMailto(richStringMailto);
			if (result == null)
				result = caseXExpression(richStringMailto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_SKYPE: {
			RichStringSkype richStringSkype = (RichStringSkype) theEObject;
			T result = caseRichStringSkype(richStringSkype);
			if (result == null)
				result = caseXExpression(richStringSkype);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RichstringPackage.RICH_STRING_CODE: {
			RichStringCode richStringCode = (RichStringCode) theEObject;
			T result = caseRichStringCode(richStringCode);
			if (result == null)
				result = caseXExpression(richStringCode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Else If</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Else If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringElseIf(RichStringElseIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichString(RichString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Literal</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringLiteral(RichStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String For Loop</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringForLoop(RichStringForLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String If</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringIf(RichStringIf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Markup</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Markup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringMarkup(RichStringMarkup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Example</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringExample(RichStringExample object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String H1</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String H1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringH1(RichStringH1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String H2</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String H2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringH2(RichStringH2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String URL</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String URL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringURL(RichStringURL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Bold</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Bold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringBold(RichStringBold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Underline</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Underline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringUnderline(RichStringUnderline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Italic</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Italic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringItalic(RichStringItalic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Img</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Img</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringImg(RichStringImg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Mailto</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Mailto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringMailto(RichStringMailto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Skype</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Skype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringSkype(RichStringSkype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich String Code</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich String Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRichStringCode(RichStringCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'. <!-- begin-user-doc -->
	 * This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXExpression(XExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBlock Expression</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBlock Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBlockExpression(XBlockExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XString Literal</em>'. <!-- begin-user-doc
	 * --> This implementation returns null; returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XString Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXStringLiteral(XStringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFor Loop Expression</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFor Loop Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXForLoopExpression(XForLoopExpression object) {
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

} // RichstringSwitch
