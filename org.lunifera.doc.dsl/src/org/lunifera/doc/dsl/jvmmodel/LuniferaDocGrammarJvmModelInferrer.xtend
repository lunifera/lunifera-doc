/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.doc.dsl.api.document.IMetaBPMProcess
import org.lunifera.doc.dsl.api.document.IMetaBPMTask
import org.lunifera.doc.dsl.api.document.IMetaDTO
import org.lunifera.doc.dsl.api.document.IMetaEntity
import org.lunifera.doc.dsl.api.document.IMetaPojo
import org.lunifera.doc.dsl.api.document.IMetaUI
import org.lunifera.doc.dsl.api.document.IMetaVaaclipseView
import org.lunifera.doc.dsl.api.impl.layout.IDocLayout
import org.lunifera.doc.dsl.luniferadoc.DocType
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
import org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout

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
	def dispatch void infer(DTOLayout dtoLayout, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(dtoLayout.toClass(dtoLayout.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IDocLayout), dtoLayout, null)
				documentation = dtoLayout.documentation
				members += toField("it", typeReference.getTypeForName(typeof(IMetaPojo), dtoLayout, null))
				members += toSetter("it", typeReference.getTypeForName(typeof(IMetaPojo), dtoLayout, null))
				val richString = dtoLayout.content
				val JvmOperation operation = typesFactory.createJvmOperation()
				associator.associatePrimary(richString, operation)
				operation.setSimpleName("serialize")
				operation.setVisibility(JvmVisibility::PUBLIC)
				operation.setReturnType(inferredType())
				operation.setBody(richString)
				associator.associateLogicalContainer(richString, operation)
				members += operation
			])
	}
	
	def dispatch void infer(GeneralDocument generalDoc, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(generalDoc.toClass(generalDoc.name+"Document")).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IDocLayout), generalDoc, null)
				documentation = generalDoc.documentation
				
				for(inc : generalDoc.includes) {
					switch inc.incType {
					 case DocType.ENTITY: members += toField(inc.varName, typeReference.getTypeForName(typeof(IMetaEntity), generalDoc, null))
					 case DocType.DTO: members += toField(inc.varName, typeReference.getTypeForName(typeof(IMetaDTO), generalDoc, null))
					 case DocType.BPM_PROCESS: members += toField(inc.varName, typeReference.getTypeForName(typeof(IMetaBPMProcess), generalDoc, null))
					 case DocType.BPM_TASK: members += toField(inc.varName, typeReference.getTypeForName(typeof(IMetaBPMTask), generalDoc, null))
					 case DocType.VAACLIPSE_VIEW: members += toField(inc.varName, typeReference.getTypeForName(typeof(IMetaVaaclipseView), generalDoc, null))
					 case DocType.UI: members += toField(inc.varName, typeReference.getTypeForName(typeof(IMetaUI), generalDoc, null))
					}
				}
				
				members += generalDoc.toConstructor[
					body = [it.append('''
						«FOR inc : generalDoc.includes»
							this.«inc.varName» = new «inc.include»();
						«ENDFOR»
						''')]
				]
				
				members += toField("it", typeReference.getTypeForName(typeof(IMetaPojo), generalDoc, null))
				members += toSetter("it", typeReference.getTypeForName(typeof(IMetaPojo), generalDoc, null))
				val richString = generalDoc.content
				val JvmOperation operation = typesFactory.createJvmOperation()
				associator.associatePrimary(richString, operation)
				operation.setSimpleName("serialize")
				operation.setVisibility(JvmVisibility::PUBLIC)
				operation.setReturnType(inferredType())
				operation.setBody(richString)
				associator.associateLogicalContainer(richString, operation)
				members += operation
			])
	}
	
	def dispatch void infer(DTODocument dtoDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(dtoDocument.toClass(dtoDocument.dtoClass+"Document")).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IMetaPojo), dtoDocument, null)
				documentation = dtoDocument.documentation

				val headerRichString = dtoDocument.header.content
				val JvmOperation serializeHeaderOperation = typesFactory.createJvmOperation()
				associator.associatePrimary(headerRichString, serializeHeaderOperation)
				serializeHeaderOperation.setSimpleName("serializeHeader")
				serializeHeaderOperation.setVisibility(JvmVisibility::PUBLIC)
				serializeHeaderOperation.setReturnType(inferredType())
				serializeHeaderOperation.setBody(headerRichString)
				associator.associateLogicalContainer(headerRichString, serializeHeaderOperation)
				
				members += dtoDocument.header.toField("documentation", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				val docGetter = dtoDocument.header.toGetter("documentation", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				docGetter.setBody[it.append('''return «serializeHeaderOperation.simpleName»();''')]
				members += docGetter
				members += dtoDocument.header.toSetter("documentation", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				
				members += serializeHeaderOperation
			])
	}
}
