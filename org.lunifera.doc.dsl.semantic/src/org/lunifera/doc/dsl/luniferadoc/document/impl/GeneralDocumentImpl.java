/**
 */
package org.lunifera.doc.dsl.luniferadoc.document.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.lunifera.doc.dsl.luniferadoc.DocumentInclude;
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage;
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument;
import org.lunifera.doc.dsl.luniferadoc.layout.impl.LuniferaDocLayoutImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.lunifera.doc.dsl.luniferadoc.document.impl.GeneralDocumentImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralDocumentImpl extends LuniferaDocLayoutImpl implements GeneralDocument {
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentInclude> includes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocumentPackage.Literals.GENERAL_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentInclude> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<DocumentInclude>(DocumentInclude.class, this, DocumentPackage.GENERAL_DOCUMENT__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocumentPackage.GENERAL_DOCUMENT__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocumentPackage.GENERAL_DOCUMENT__INCLUDES:
				return getIncludes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocumentPackage.GENERAL_DOCUMENT__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends DocumentInclude>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocumentPackage.GENERAL_DOCUMENT__INCLUDES:
				getIncludes().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocumentPackage.GENERAL_DOCUMENT__INCLUDES:
				return includes != null && !includes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneralDocumentImpl
