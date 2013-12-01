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
import org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout
import java.util.List
import java.util.ArrayList
import org.lunifera.doc.dsl.api.layout.IEntityLayout
import org.lunifera.doc.dsl.api.document.IDTOProperty
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty

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
	 * Infer method for EntityLayout elements
	 */
	def dispatch void infer(EntityLayout entityLayout, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(entityLayout.toClass(entityLayout.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IEntityLayout), entityLayout, null)
				documentation = entityLayout.documentation
				members += toField("doc", typeReference.getTypeForName(typeof(EntityDocument), entityLayout, null))
				members += toSetter("doc", typeReference.getTypeForName(typeof(EntityDocument), entityLayout, null))
				val contentRichString = entityLayout.content
				val JvmOperation operation = typesFactory.createJvmOperation()
				associator.associatePrimary(contentRichString, operation)
				operation.setSimpleName("serialize")
				operation.setVisibility(JvmVisibility::PUBLIC)
				operation.setReturnType(inferredType())
				operation.setBody(contentRichString)
				associator.associateLogicalContainer(contentRichString, operation)
				members += operation
			])
	}
	
	/**
	 * Infer method for DTOLayout elements
	 */
	def dispatch void infer(DTOLayout dtoLayout, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(dtoLayout.toClass(dtoLayout.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IDTOLayout), dtoLayout, null)
				documentation = dtoLayout.documentation
				members += toField("doc", typeReference.getTypeForName(typeof(IMetaDTO), dtoLayout, null))
				members += toSetter("doc", typeReference.getTypeForName(typeof(IMetaDTO), dtoLayout, null))
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

	/**
	 * Infer method for GeneralDocument elements
	 */
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
	 * Infer method for DTODocument elements
	 */
	def dispatch void infer(DTODocument dtoDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(dtoDocument.toClass(dtoDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IMetaDTO), dtoDocument, null)
				documentation = dtoDocument.documentation
				
				// gen classes for properties
				for(prop : dtoDocument.properties.properties) {
					val propClass = prop.toClass(prop.name.toFirstUpper)
					propClass.superTypes += typeReference.getTypeForName(typeof(IDTOProperty), dtoDocument, null)
					members += propClass
				}
				
				// fields
				members += toField("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toField("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += dtoDocument.description.toField("description",
						typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toField("properties", dtoDocument.newTypeRef(typeof(List), 
					typeReference.getTypeForName(typeof(IDTOProperty), dtoDocument, null)
				))
				
				// constructor
				members += dtoDocument.toConstructor [
					body = [it.append(
							'''
								this.name = "«dtoDocument.name»";
								this.dtoClass = "«dtoDocument.dtoClass»";
								this.properties = new java.util.ArrayList<IDTOProperty>();
								«FOR prop : dtoDocument.properties.properties»
									this.properties.add(new «prop.name.toFirstUpper»());
								«ENDFOR»
							''')]
				]
				
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
				members += toGetter("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toSetter("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toGetter("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toSetter("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				val descriptionGetter = dtoDocument.description.toGetter("description",
					typeReference.getTypeForName(typeof(String), dtoDocument, null))
				descriptionGetter.setBody[it.append('''return «serializeDescriptionOperation.simpleName»().toString();''')]
				members += descriptionGetter
				members += dtoDocument.description.toSetter("description",
						typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toGetter("properties", dtoDocument.newTypeRef(typeof(List), 
					typeReference.getTypeForName(typeof(IDTOProperty), dtoDocument, null)
				))
				members += toSetter("properties", dtoDocument.newTypeRef(typeof(List), 
					typeReference.getTypeForName(typeof(IDTOProperty), dtoDocument, null)
				))
			])
	}

	/**
	 * Infer method for DTOProperty elements
	 */
//	def dispatch void infer(DTOProperty dtoProperty, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
//		acceptor.accept(dtoProperty.toClass(dtoProperty.name)).initializeLater(
//			[
//				superTypes += typeReference.getTypeForName(typeof(DTOProperty), dtoProperty, null)
//			]	
//		)	
//	}

	/**
	 * Infer method for EntityDocument elements
	 */
	def dispatch void infer(EntityDocument entityDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(entityDocument.toClass(entityDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IMetaEntity), entityDocument, null)
				documentation = entityDocument.documentation

				members += toField("name", typeReference.getTypeForName(typeof(String), entityDocument, null))
				val entityClassField = toField("entityClass", typeReference.getTypeForName(typeof(String), 
					entityDocument, null))
				members += entityClassField
				members += entityDocument.description.toField("description",
						typeReference.getTypeForName(typeof(String), entityDocument, null))
						
				// constructor
				members += entityDocument.toConstructor [
					body = [it.append(
							'''
								this.name = "«entityDocument.name»";
								this.entityClass = "«entityDocument.entityClass»";
							''')]
				]
				
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
				
				// getter/setter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toSetter("name", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toGetter("entityClass", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toSetter("entityClass", typeReference.getTypeForName(typeof(String), entityDocument, null))
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
	
	
	/*****************
	 * Helper methods
	 ****************/
	
	/**
	 * Create field for an included EntityDocument
	 */
	def dispatch JvmField toIncField(EntityDocument entityDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaEntity), generalDoc, null))
	}
	
	/**
	 * Create field for an included DTODocument
	 */
	def dispatch JvmField toIncField(DTODocument dtoDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaDTO), generalDoc, null))
	}
	
	/**
	 * Create field for an included BPMDocument
	 */
	def dispatch JvmField toIncField(BPMProcessDocument bpmProcessDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaBPMProcess), generalDoc, null))
	}
	
	/**
	 * Create field for an included BPMTaskDocument
	 */
	def dispatch JvmField toIncField(BPMTaskDocument bpmTaskDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaBPMTask), generalDoc, null))
	}
	
	/**
	 * Create field for an included VaaclipseViewDocument
	 */
	def dispatch JvmField toIncField(VaaclipseViewDocument vaaclipseViewDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaVaaclipseView), generalDoc, null))
	}
	
	/**
	 * Create field for an included UIDocument
	 */
	def dispatch JvmField toIncField(UIDocument uiDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IMetaUI), generalDoc, null))
	}
}
