/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.doc.dsl.api.document.IDTOProperty
import org.lunifera.doc.dsl.api.document.IEntityField
import org.lunifera.doc.dsl.api.layout.IDTOLayout
import org.lunifera.doc.dsl.api.layout.IEntityLayout
import org.lunifera.doc.dsl.api.layout.IGenericLayout
import org.lunifera.doc.dsl.luniferadoc.document.BPMHumanTaskDocument
import org.lunifera.doc.dsl.luniferadoc.document.BPMProcessDocument
import org.lunifera.doc.dsl.luniferadoc.document.DTODocument
import org.lunifera.doc.dsl.luniferadoc.document.DTOProperty
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument
import org.lunifera.doc.dsl.luniferadoc.document.EntityField
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
import org.lunifera.doc.dsl.luniferadoc.document.UIDocument
import org.lunifera.doc.dsl.luniferadoc.document.VaaclipseViewDocument
import org.lunifera.doc.dsl.luniferadoc.layout.DTOLayout
import org.lunifera.doc.dsl.luniferadoc.layout.EntityLayout
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString
import org.lunifera.doc.dsl.api.document.IBPMProcessDocument
import org.lunifera.doc.dsl.api.document.IBPMHumanTaskDocument
import org.lunifera.doc.dsl.api.document.IDTODocument
import org.lunifera.doc.dsl.api.document.IEntityDocument
import org.lunifera.doc.dsl.api.document.IUIDocument
import org.lunifera.doc.dsl.api.document.IVaaclipseViewDocument

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
				members += toField("doc", typeReference.getTypeForName(typeof(IDTODocument), dtoLayout, null))
				members += toSetter("doc", typeReference.getTypeForName(typeof(IDTODocument), dtoLayout, null))
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
					body = [
						it.append(
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
				superTypes += typeReference.getTypeForName(typeof(IDTODocument), dtoDocument, null)
				documentation = dtoDocument.documentation
				// gen inner classes for properties
				for (prop : dtoDocument.properties.properties) {
					members += toInnerClass(prop, dtoDocument)
				}
				// fields
				members += toField("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toField("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += dtoDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toField("properties",
					dtoDocument.newTypeRef(typeof(List),
						typeReference.getTypeForName(typeof(IDTOProperty), dtoDocument, null)))
				// constructor
				members += dtoDocument.toConstructor [
					body = [
						it.append(
							'''
								this.name = "«dtoDocument.name»";
								this.dtoClass = "«dtoDocument.dtoClass»";
								this.description = serializeDescription().toString();
								this.properties = new java.util.ArrayList<IDTOProperty>();
								«FOR prop : dtoDocument.properties.properties»
									this.properties.add(new «prop.name.toFirstUpper»());
								«ENDFOR»
							''')]
				]
				// serialization		
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (dtoDocument.description != null) {
					val RichString descriptionRichString = dtoDocument.description.content
					associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
					serializeDescriptionOperation.setSimpleName("serializeDescription")
					serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
					serializeDescriptionOperation.setReturnType(inferredType())
					serializeDescriptionOperation.setBody(descriptionRichString)
					associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
				} else {
					// TODO return empty CharSequence
				}
				members += serializeDescriptionOperation
				// getter/setter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toSetter("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toGetter("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toSetter("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				val descriptionGetter = dtoDocument.description.toGetter("description",
					typeReference.getTypeForName(typeof(String), dtoDocument, null))
				descriptionGetter.setBody[
					it.append('''return «serializeDescriptionOperation.simpleName»().toString();''')]
				members += descriptionGetter
				members += dtoDocument.description.toSetter("description",
					typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toGetter("properties",
					dtoDocument.newTypeRef(
						typeof(List),
						typeReference.getTypeForName(typeof(IDTOProperty), dtoDocument, null)
					))
				members += toSetter("properties",
					dtoDocument.newTypeRef(
						typeof(List),
						typeReference.getTypeForName(typeof(IDTOProperty), dtoDocument, null)
					))
			])
	}

	/**
	 * Infer method for EntityDocument elements
	 */
	def dispatch void infer(EntityDocument entityDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(entityDocument.toClass(entityDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IEntityDocument), entityDocument, null)
				documentation = entityDocument.documentation
				// gen inner classes for fields
				for (field : entityDocument.fields.fields) {
					members += toInnerClass(field, entityDocument)
				}
				// class fields
				members += toField("name", typeReference.getTypeForName(typeof(String), entityDocument, null))
				val entityClassField = toField("entityClass",
					typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += entityClassField
				members += entityDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toField("fields",
					entityDocument.newTypeRef(typeof(List),
						typeReference.getTypeForName(typeof(IEntityField), entityDocument, null)))
				// constructor
				members += entityDocument.toConstructor [
					body = [
						it.append(
							'''
								this.name = "«entityDocument.name»";
								this.entityClass = "«entityDocument.entityClass»";
								this.description = serializeDescription().toString();
								this.fields = new java.util.ArrayList<IEntityField>();
								«FOR field : entityDocument.fields.fields»
									this.fields.add(new «field.name.toFirstUpper»());
								«ENDFOR»
							''')]
				]
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (entityDocument.description != null) {
					val descriptionRichString = entityDocument.description.content
					associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
					serializeDescriptionOperation.setSimpleName("serializeDescription")
					serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
					serializeDescriptionOperation.setReturnType(inferredType())
					serializeDescriptionOperation.setBody(descriptionRichString)
					associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
				} else {
					// TODO return emtpy CharSequence
				}
				members += serializeDescriptionOperation
				// getter/setter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toSetter("name", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toGetter("entityClass", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toSetter("entityClass", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += entityDocument.description.toGetter(
					"description",
					typeReference.getTypeForName(typeof(String), entityDocument, null)
				)
				members += toGetter("fields",
					entityDocument.newTypeRef(
						typeof(List),
						typeReference.getTypeForName(typeof(IEntityField), entityDocument, null)
					))
			])
	}
	
	/**
	 * Infer method for BPMProcessDocument elements
	 */
	def dispatch void infer(BPMProcessDocument processDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(processDocument.toClass(processDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IEntityDocument), processDocument, null)
				documentation = processDocument.documentation
				// class fields
				members += toField("name", typeReference.getTypeForName(typeof(String), processDocument, null))
				members += toField("process", typeReference.getTypeForName(typeof(String), processDocument, null))
				members += processDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), processDocument, null))
				// constructor
				members += processDocument.toConstructor [
					body = [
						it.append(
							'''
								this.name = "«processDocument.name»";
								this.process = "«processDocument.process»";
								this.description = serializeDescription().toString();
							''')]
				]
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (processDocument.description != null) {
					val descriptionRichString = processDocument.description.content
					associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
					serializeDescriptionOperation.setSimpleName("serializeDescription")
					serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
					serializeDescriptionOperation.setReturnType(inferredType())
					serializeDescriptionOperation.setBody(descriptionRichString)
					associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
				} else {
					// TODO return emtpy CharSequence
				}
				members += serializeDescriptionOperation
				// getter/setter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), processDocument, null))
				members += toGetter("process", typeReference.getTypeForName(typeof(String), processDocument, null))
				members += processDocument.description.toGetter(
					"description",
					typeReference.getTypeForName(typeof(String), processDocument, null)
				)
			])
	}
	
		/**
	 * Infer method for BPMHumanTaskDocument elements
	 */
	def dispatch void infer(BPMHumanTaskDocument taskDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(taskDocument.toClass(taskDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IEntityDocument), taskDocument, null)
				documentation = taskDocument.documentation
				// class fields
				members += toField("name", typeReference.getTypeForName(typeof(String), taskDocument, null))
				members += toField("task", typeReference.getTypeForName(typeof(String), taskDocument, null))
				members += taskDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), taskDocument, null))
				// constructor
				members += taskDocument.toConstructor [
					body = [
						it.append(
							'''
								this.name = "«taskDocument.name»";
								this.task = "«taskDocument.task»";
								this.description = serializeDescription().toString();
							''')]
				]
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (taskDocument.description != null) {
					val descriptionRichString = taskDocument.description.content
					associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
					serializeDescriptionOperation.setSimpleName("serializeDescription")
					serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
					serializeDescriptionOperation.setReturnType(inferredType())
					serializeDescriptionOperation.setBody(descriptionRichString)
					associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
				} else {
					// TODO return emtpy CharSequence
				}
				members += serializeDescriptionOperation
				// getter/setter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), taskDocument, null))
				members += toGetter("task", typeReference.getTypeForName(typeof(String), taskDocument, null))
				members += taskDocument.description.toGetter(
					"description",
					typeReference.getTypeForName(typeof(String), taskDocument, null)
				)
			])
	}

	/*****************
	 * Helper methods
	 ****************/
	/**
	* Generate inner class for DTOProperty 
	*/
	def dispatch JvmGenericType toInnerClass(DTOProperty dtoProperty, DTODocument parentDoc) {
		val propClass = dtoProperty.toClass(dtoProperty.name.toFirstUpper)
		propClass.superTypes += typeReference.getTypeForName(typeof(IDTOProperty), parentDoc, null)

		// fields
		propClass.members += toField(dtoProperty, "name", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toField(dtoProperty, "description", typeReference.getTypeForName(typeof(String), parentDoc, null))

		//constructor					
		propClass.members += toConstructor(parentDoc,
			[
				body = [
					it.append(
						'''
							this.name = "«dtoProperty.name»";
							this.description = serializeDescription().toString();
						''')]
			])

		// serialization
		val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
		if (dtoProperty.description != null) {
			val RichString descriptionRichString = dtoProperty.description
			associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
			serializeDescriptionOperation.setSimpleName("serializeDescription")
			serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
			serializeDescriptionOperation.setReturnType(inferredType())
			serializeDescriptionOperation.setBody(descriptionRichString)
			associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
			propClass.members += serializeDescriptionOperation
		} else {
			// TODO return empty CharSequence
		}

		//getter/setter
		propClass.members +=
			toGetter(dtoProperty, "name", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toSetter(dtoProperty, "name", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toGetter(dtoProperty, "description", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toSetter(dtoProperty, "description", typeReference.getTypeForName(typeof(String), parentDoc, null))

		return propClass
	}

	/**
	* Generate inner class for EntityField 
	*/
	def dispatch JvmGenericType toInnerClass(EntityField entityField, EntityDocument parentDoc) {
		val propClass = entityField.toClass(entityField.name.toFirstUpper)
		propClass.superTypes += typeReference.getTypeForName(typeof(IEntityField), parentDoc, null)

		// fields
		propClass.members += toField(entityField, "name", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members += toField(entityField, "type", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toField(entityField, "length", typeReference.getTypeForName(typeof(Integer), parentDoc, null))
		propClass.members += toField(entityField, "pk", typeReference.getTypeForName(typeof(Boolean), parentDoc, null))
		propClass.members +=
			toField(entityField, "nullable", typeReference.getTypeForName(typeof(Boolean), parentDoc, null))
		propClass.members +=
			toField(entityField, "description", typeReference.getTypeForName(typeof(String), parentDoc, null))

		//constructor					
		propClass.members += toConstructor(parentDoc,
			[
				body = [
					it.append(
						'''
							this.name = "«entityField.name»";
							this.type = "«entityField.type»";
							this.length = «entityField.length»;
							this.pk = «entityField.pk»;
							this.nullable = «entityField.nullable»;
							this.description = serializeDescription().toString();
						''')]
			])

		// serialization
		val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
		if (entityField.description != null) {
			val RichString descriptionRichString = entityField.description
			associator.associatePrimary(descriptionRichString, serializeDescriptionOperation)
			serializeDescriptionOperation.setSimpleName("serializeDescription")
			serializeDescriptionOperation.setVisibility(JvmVisibility::PUBLIC)
			serializeDescriptionOperation.setReturnType(inferredType())
			serializeDescriptionOperation.setBody(descriptionRichString)
			associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation)
			propClass.members += serializeDescriptionOperation
		} else {
			// TODO return empty CharSequence
		}

		//getter/setter
		propClass.members +=
			toGetter(entityField, "name", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toGetter(entityField, "type", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toGetter(entityField, "length", typeReference.getTypeForName(typeof(Integer), parentDoc, null))
		propClass.members +=
			toGetter(entityField, "pk", typeReference.getTypeForName(typeof(Boolean), parentDoc, null))
		propClass.members +=
			toGetter(entityField, "nullable", typeReference.getTypeForName(typeof(Boolean), parentDoc, null))
		propClass.members +=
			toGetter(entityField, "description", typeReference.getTypeForName(typeof(String), parentDoc, null))

		return propClass
	}

	/**
	 * Create field for an included EntityDocument
	 */
	def dispatch JvmField toIncField(EntityDocument entityDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IEntityDocument), generalDoc, null))
	}

	/**
	 * Create field for an included DTODocument
	 */
	def dispatch JvmField toIncField(DTODocument dtoDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IDTODocument), generalDoc, null))
	}

	/**
	 * Create field for an included BPMDocument
	 */
	def dispatch JvmField toIncField(BPMProcessDocument bpmProcessDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IBPMProcessDocument), generalDoc, null))
	}

	/**
	 * Create field for an included BPMTaskDocument
	 */
	def dispatch JvmField toIncField(BPMHumanTaskDocument bpmTaskDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IBPMHumanTaskDocument), generalDoc, null))
	}

	/**
	 * Create field for an included VaaclipseViewDocument
	 */
	def dispatch JvmField toIncField(VaaclipseViewDocument vaaclipseViewDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IVaaclipseViewDocument), generalDoc, null))
	}

	/**
	 * Create field for an included UIDocument
	 */
	def dispatch JvmField toIncField(UIDocument uiDoc, String name, GeneralDocument generalDoc) {
		toField(generalDoc, name, typeReference.getTypeForName(typeof(IUIDocument), generalDoc, null))
	}
}
