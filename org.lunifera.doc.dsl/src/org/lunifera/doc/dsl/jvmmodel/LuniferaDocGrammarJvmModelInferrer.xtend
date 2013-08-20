/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Work based org.eclipse.xtend.core.richstring.TextLine
 *******************************************************************************/

package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.doc.dsl.api.IMetaPojo
import org.lunifera.doc.dsl.luniferadoc.DocLayout
import org.lunifera.doc.dsl.luniferadoc.DTODocument
import org.lunifera.doc.dsl.api.IDocLayout

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class LuniferaDocGrammarJvmModelInferrer extends AbstractModelInferrer {
	/**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder
	@Inject TypeReferences typeReference

	@Inject
	private TypesFactory typesFactory;

	@Inject
	private IJvmModelAssociator associator;

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link org.eclipse.xtext.common.types.JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully updated. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(DocLayout element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {

		acceptor.accept(element.toClass(element.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IDocLayout), element, null)
				documentation = element.documentation
				members += toField("it", typeReference.getTypeForName(typeof(IMetaPojo), element, null))
				members += toSetter("it", typeReference.getTypeForName(typeof(IMetaPojo), element, null));
				for (richString : element.content) {
					val JvmOperation operation = typesFactory.createJvmOperation()
					members += operation
					associator.associatePrimary(richString, operation)
					operation.setSimpleName("serialize")
					operation.setVisibility(JvmVisibility::PUBLIC)
					operation.setReturnType(typeReference.getTypeForName(typeof(String), element, null))
					val JvmTypeReference returnType = inferredType()
					operation.setReturnType(returnType)
					operation.setBody(richString)
					associator.associateLogicalContainer(richString, operation)
				}
			])
	}
	
	def dispatch void infer(DTODocument dtoDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {

		acceptor.accept(dtoDocument.toClass(dtoDocument.dtoClass+"Document")).initializeLater(
			[
//				superTypes += typeReference.getTypeForName(typeof(IDTODocumentation), dtoDocument, null)
//				documentation = element.documentation
//				members += toField("it", typeReference.getTypeForName(typeof(IMetaPojo), element, null))
//				members += toSetter("it", typeReference.getTypeForName(typeof(IMetaPojo), element, null));
//				for (richString : element.content) {
//					val JvmOperation operation = typesFactory.createJvmOperation()
//					members += operation
//					associator.associatePrimary(richString, operation)
//					operation.setSimpleName("serialize")
//					operation.setVisibility(JvmVisibility::PUBLIC)
//					operation.setReturnType(typeReference.getTypeForName(typeof(String), element, null))
//					val JvmTypeReference returnType = inferredType()
//					operation.setReturnType(returnType)
//					operation.setBody(richString)
//					associator.associateLogicalContainer(richString, operation)
//				}
			])
	}
}
