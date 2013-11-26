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
import org.lunifera.doc.dsl.luniferadoc.DocType
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
import org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocPackage
import org.lunifera.doc.dsl.luniferadoc.document.DocumentPackage
import org.eclipse.xtext.common.types.JvmField
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument
import org.lunifera.doc.dsl.luniferadoc.document.BPMTaskDocument
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString
import org.lunifera.doc.dsl.api.layout.IGenericLayout
import org.lunifera.doc.dsl.api.layout.IDTOLayout

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
				superTypes += typeReference.getTypeForName(typeof(IDTOLayout), dtoLayout, null)
				documentation = dtoLayout.documentation
				members += toField("it", typeReference.getTypeForName(typeof(IMetaDTO), dtoLayout, null))
				members += toSetter("it", typeReference.getTypeForName(typeof(IMetaDTO), dtoLayout, null))
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
		acceptor.accept(generalDoc.toClass(generalDoc.name.toString)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IGenericLayout), generalDoc, null)
				documentation = generalDoc.documentation
				for (inc : generalDoc.includes) {
					members += inc.include.toIncField(inc.varName, generalDoc)
				}
				members += generalDoc.toConstructor [
					body = [it.append(
							'''
								«FOR inc : generalDoc.includes»
									this.«inc.varName» = new «inc.include.name»();
								«ENDFOR»
							''')]
				]
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

	/**
	 * Inferrer for DTODocument.
	 */
	def dispatch void infer(DTODocument dtoDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(dtoDocument.toClass(dtoDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IMetaDTO), dtoDocument, null)
				documentation = dtoDocument.documentation
				val dtoClassField = toField("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += dtoClassField
				members += dtoDocument.description.toField("description",
						typeReference.getTypeForName(typeof(String), dtoDocument, null))
				
				// serialize operation		
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if(dtoDocument.description != null) {
					val RichString descriptionRichString = dtoDocument.description.content
					associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
					serializeDescriptionOperation.setSimpleName("serializeDescription")
					serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
					serializeDescriptionOperation.setReturnType(inferredType())
					serializeDescriptionOperation.setBody(descriptionRichString)
					associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
					members += serializeDescriptionOperation
				}
				members += serializeDescriptionOperation
				
				// getter/setter
				members += toGetter("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toSetter("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				val descriptionGetter = dtoDocument.description.toGetter("description",
					typeReference.getTypeForName(typeof(String), dtoDocument, null))
				descriptionGetter.setBody[it.append('''return «serializeDescriptionOperation.simpleName»().toString();''')]
				members += descriptionGetter
				members += dtoDocument.description.toSetter("description",
						typeReference.getTypeForName(typeof(String), dtoDocument, null))
			])
	}

	/**
	 * Inferrer for EntityDocument.
	 */
	def dispatch void infer(EntityDocument entityDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(entityDocument.toClass(entityDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IMetaEntity), entityDocument, null)
				documentation = entityDocument.documentation

				val entityClassField = toField("entityClass", typeReference.getTypeForName(typeof(String), 
					entityDocument, null))
				members += entityClassField
				members += entityDocument.description.toField("description",
						typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toGetter("entityClass", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toSetter("entityClass", typeReference.getTypeForName(typeof(String), entityDocument, null))
				
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if(entityDocument.description.content != null) {
					val descriptionRichString = entityDocument.description.content
					associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
					serializeDescriptionOperation.setSimpleName("serializeDescription")
					serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
					serializeDescriptionOperation.setReturnType(inferredType())
					serializeDescriptionOperation.setBody(descriptionRichString)
					associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
				}				
				
				val docGetter = entityDocument.description.toGetter("description",
					typeReference.getTypeForName(typeof(String), entityDocument, null))
				docGetter.setBody[it.append('''return «serializeDescriptionOperation.simpleName»();''')]
				members += docGetter
				members +=
					entityDocument.description.toSetter("description",
						typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += serializeDescriptionOperation
			])
	}
	
	def dispatch JvmField toIncField(EntityDocument entityDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaEntity), generalDoc, null))
	}
	
	def dispatch JvmField toIncField(DTODocument dtoDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaDTO), generalDoc, null))
	}
	
	def dispatch JvmField toIncField(BPMProcessDocument bpmProcessDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaBPMProcess), generalDoc, null))
	}
	
	def dispatch JvmField toIncField(BPMTaskDocument bpmTaskDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaBPMTask), generalDoc, null))
	}
	
	def dispatch JvmField toIncField(VaaclipseViewDocument vaaclipseViewDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaVaaclipseView), generalDoc, null))
	}
	
	def dispatch JvmField toIncField(UIDocument uiDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaUI), generalDoc, null))
	}
}
