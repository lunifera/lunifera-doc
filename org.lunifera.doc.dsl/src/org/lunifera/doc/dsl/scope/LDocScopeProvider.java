/**
 * Copyright (c) 2011 - 2014, Lunifera GmbH (Gross Enzersdorf), Loetz KG (Heidelberg)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 * 		Florian Pirchner - Initial implementation
 */
package org.lunifera.doc.dsl.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.annotations.scoping.XbaseWithAnnotationsScopeProvider;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;

import com.google.inject.Inject;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping on
 * how and when to use it
 * 
 */
@SuppressWarnings("restriction")
public class LDocScopeProvider extends XbaseWithAnnotationsScopeProvider {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public IScope getScope(final EObject context, EReference reference) {
		if (reference == LunDocPackage.Literals.LDOC_ENTITY_DOCUMENT__MODEL) {
			return new TypeFilterScope(super.getScope(context, reference));
		} else if (reference == LunDocPackage.Literals.LDOC_ENTITY_FIELD__TYPE_FIELD) {
			return new TypeFeatureFilterScope((LDocEntityField) context,
					super.getScope(context, reference));
		} 
		return super.getScope(context, reference);
	}
}
