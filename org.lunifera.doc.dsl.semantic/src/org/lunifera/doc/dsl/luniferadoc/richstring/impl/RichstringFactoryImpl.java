/**
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringForLoop;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringIf;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringMarkup;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringFactory;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichstringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RichstringFactoryImpl extends EFactoryImpl implements RichstringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RichstringFactory init() {
		try {
			RichstringFactory theRichstringFactory = (RichstringFactory)EPackage.Registry.INSTANCE.getEFactory(RichstringPackage.eNS_URI);
			if (theRichstringFactory != null) {
				return theRichstringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RichstringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichstringFactoryImpl() {
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
			case RichstringPackage.RICH_STRING_ELSE_IF: return createRichStringElseIf();
			case RichstringPackage.RICH_STRING: return createRichString();
			case RichstringPackage.RICH_STRING_LITERAL: return createRichStringLiteral();
			case RichstringPackage.RICH_STRING_FOR_LOOP: return createRichStringForLoop();
			case RichstringPackage.RICH_STRING_IF: return createRichStringIf();
			case RichstringPackage.RICH_STRING_EXAMPLE: return createRichStringExample();
			case RichstringPackage.RICH_STRING_H1: return createRichStringH1();
			case RichstringPackage.RICH_STRING_H2: return createRichStringH2();
			case RichstringPackage.RICH_STRING_URL: return createRichStringURL();
			case RichstringPackage.RICH_STRING_MARKUP: return createRichStringMarkup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringElseIf createRichStringElseIf() {
		RichStringElseIfImpl richStringElseIf = new RichStringElseIfImpl();
		return richStringElseIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichString createRichString() {
		RichStringImpl richString = new RichStringImpl();
		return richString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringLiteral createRichStringLiteral() {
		RichStringLiteralImpl richStringLiteral = new RichStringLiteralImpl();
		return richStringLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringForLoop createRichStringForLoop() {
		RichStringForLoopImpl richStringForLoop = new RichStringForLoopImpl();
		return richStringForLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringIf createRichStringIf() {
		RichStringIfImpl richStringIf = new RichStringIfImpl();
		return richStringIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringExample createRichStringExample() {
		RichStringExampleImpl richStringExample = new RichStringExampleImpl();
		return richStringExample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH1 createRichStringH1() {
		RichStringH1Impl richStringH1 = new RichStringH1Impl();
		return richStringH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringH2 createRichStringH2() {
		RichStringH2Impl richStringH2 = new RichStringH2Impl();
		return richStringH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringURL createRichStringURL() {
		RichStringURLImpl richStringURL = new RichStringURLImpl();
		return richStringURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichStringMarkup createRichStringMarkup() {
		RichStringMarkupImpl richStringMarkup = new RichStringMarkupImpl();
		return richStringMarkup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichstringPackage getRichstringPackage() {
		return (RichstringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RichstringPackage getPackage() {
		return RichstringPackage.eINSTANCE;
	}

} //RichstringFactoryImpl