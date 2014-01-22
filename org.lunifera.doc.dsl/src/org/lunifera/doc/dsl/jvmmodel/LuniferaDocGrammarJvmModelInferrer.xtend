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
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.lunifera.doc.dsl.api.document.IBPMProcessDocument
import org.lunifera.doc.dsl.api.document.IDtoDocument
import org.lunifera.doc.dsl.api.document.IDtoField
import org.lunifera.doc.dsl.api.document.IEntityDocument
import org.lunifera.doc.dsl.api.document.IEntityField
import org.lunifera.doc.dsl.api.document.IHumanTaskDocument
import org.lunifera.doc.dsl.api.document.IUiDocument
import org.lunifera.doc.dsl.api.document.IViewDocument
import org.lunifera.doc.dsl.api.layout.ILayouter
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter
import org.lunifera.doc.dsl.luniferadoc.LDocUiDocument
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString

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
	@Inject extension LDocTypesBuilder
	@Inject TypeReferences typeReference

	@Inject
	private TypesFactory typesFactory;

	@Inject
	private IJvmModelAssociator associator;

	/**
	 * Infer method for GeneralDocument elements
	 */
	def dispatch void infer(LDocLayouter layouter, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(layouter.toClass(layouter.name.toString)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(ILayouter), layouter, null)
				documentation = layouter.documentation
				
				members += layouter.toAccessField()
				
				for (inc : layouter.includes) {
					members += inc.document.toIncField(inc.varName, layouter)
				}
				members += layouter.toConstructor [
					body = '''
						«FOR inc : layouter.includes»
							this.«inc.varName» = docAccess.wrapDocument(«inc.document»);
						«ENDFOR»
					'''
				]
				val richString = layouter.content
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
	def dispatch void infer(LDocDtoDocument dtoDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(dtoDocument.toClass(dtoDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IDtoDocument), dtoDocument, null)
				documentation = dtoDocument.documentation
				// gen inner classes for properties
				for (prop : dtoDocument.fields) {
					members += toInnerClass(prop, dtoDocument)
				}
				// fields
				members += toField("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toField("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += dtoDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += dtoDocument.toField("properties",
					newTypeRef('java.util.List', newTypeRef('org.lunifera.doc.dsl.api.document.IDTOProperty')))
				// constructor
				members += dtoDocument.toConstructor [
					body = '''
						this.name = "«dtoDocument.name»";
						this.dtoClass = "«dtoDocument.dtoClass»";
						this.description = serializeDescription().toString();
						this.properties = new java.util.ArrayList<IDTOProperty>();
						«IF dtoDocument.fields != null»
							«FOR prop : dtoDocument.fields»
								this.properties.add(new «prop.name.toFirstUpper»());
							«ENDFOR»
						«ENDIF»
					'''
				]
				// serialization		
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (dtoDocument.description != null) {
					val RichString descriptionRichString = dtoDocument.description
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
				// getter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toGetter("dtoClass", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += toMethod("getDescription", typeReference.getTypeForName(typeof(String), dtoDocument, null)) [
					body = '''return «serializeDescriptionOperation.simpleName»().toString();'''
				]
				members += toGetter("properties", "properties",
					newTypeRef('java.util.List', newTypeRef('org.lunifera.doc.dsl.api.document.IDTOProperty')))
			])
	}

	/**
	 * Infer method for EntityDocument elements
	 */
	def dispatch void infer(LDocEntityDocument entityDocument, IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase) {
		acceptor.accept(entityDocument.toClass(entityDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IEntityDocument), entityDocument, null)
				documentation = entityDocument.documentation
				// gen inner classes for fields
				if (entityDocument.fields != null) {
					for (field : entityDocument.fields) {
						members += toInnerClass(field, entityDocument)
					}
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
					body = '''
						this.name = "«entityDocument.name»";
						this.entityClass = "«entityDocument.entityClass»";
						this.description = serializeDescription().toString();
						this.fields = new java.util.ArrayList<IEntityField>();
						«IF entityDocument.fields != null»
							«FOR field : entityDocument.fields»
								this.fields.add(new «field.name.toFirstUpper»());
							«ENDFOR»
						«ENDIF»
					'''
				]
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (entityDocument.description != null) {
					val descriptionRichString = entityDocument.description
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
				// getter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), entityDocument, null))
				members += toGetter("entityClass", typeReference.getTypeForName(typeof(String), entityDocument, null))
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
	def dispatch void infer(LDocBPMProcessDocument processDocument, IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase) {
		acceptor.accept(processDocument.toClass(processDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IBPMProcessDocument), processDocument, null)
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
					val descriptionRichString = processDocument.description
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
				// getter
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
	def dispatch void infer(LDocHumanTaskDocument taskDocument, IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase) {
		acceptor.accept(taskDocument.toClass(taskDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IHumanTaskDocument), taskDocument, null)
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
					val descriptionRichString = taskDocument.description
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
				// getter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), taskDocument, null))
				members += toGetter("task", typeReference.getTypeForName(typeof(String), taskDocument, null))
				members += taskDocument.description.toGetter(
					"description",
					typeReference.getTypeForName(typeof(String), taskDocument, null)
				)
			])
	}

	/**
	 * Infer method for BPMHumanTaskDocument elements
	 */
	def dispatch void infer(LDocViewDocument viewDocument, IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase) {
		acceptor.accept(viewDocument.toClass(viewDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IViewDocument), viewDocument, null)
				documentation = viewDocument.documentation
				// class fields
				members += toField("name", typeReference.getTypeForName(typeof(String), viewDocument, null))
				members += toField("view", typeReference.getTypeForName(typeof(String), viewDocument, null))
				members += viewDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), viewDocument, null))
				// constructor
				members += viewDocument.toConstructor [
					body = [
						it.append(
							'''
								this.name = "«viewDocument.name»";
								this.view = "«viewDocument.view»";
								this.description = serializeDescription().toString();
							''')]
				]
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (viewDocument.description != null) {
					val descriptionRichString = viewDocument.description
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
				// getter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), viewDocument, null))
				members += toGetter("view", typeReference.getTypeForName(typeof(String), viewDocument, null))
				members += viewDocument.description.toGetter(
					"description",
					typeReference.getTypeForName(typeof(String), viewDocument, null)
				)
			])
	}

	/**
	 * Infer method for BPMHumanTaskDocument elements
	 */
	def dispatch void infer(LDocUiDocument uiDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(uiDocument.toClass(uiDocument.name)).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IUiDocument), uiDocument, null)
				documentation = uiDocument.documentation
				// class fields
				members += toField("name", typeReference.getTypeForName(typeof(String), uiDocument, null))
				members += toField("ui", typeReference.getTypeForName(typeof(String), uiDocument, null))
				members += uiDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), uiDocument, null))
				// constructor
				members += uiDocument.toConstructor [
					body = [
						it.append(
							'''
								this.name = "«uiDocument.name»";
								this.ui = "«uiDocument.ui»";
								this.description = serializeDescription().toString();
							''')]
				]
				val JvmOperation serializeDescriptionOperation = typesFactory.createJvmOperation()
				if (uiDocument.description != null) {
					val descriptionRichString = uiDocument.description
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
				// getter
				members += toGetter("name", typeReference.getTypeForName(typeof(String), uiDocument, null))
				members += toGetter("ui", typeReference.getTypeForName(typeof(String), uiDocument, null))
				members += uiDocument.description.toGetter(
					"description",
					typeReference.getTypeForName(typeof(String), uiDocument, null)
				)
			])
	}

	/*****************
	 * Helper methods
	 ****************/
	/**
	* Generate inner class for DTOProperty 
	*/
	def dispatch JvmGenericType toInnerClass(LDocDtoProperty dtoProperty, LDocDtoDocument parentDoc) {
		val propClass = dtoProperty.toClass(dtoProperty.name.toFirstUpper)
		propClass.superTypes += typeReference.getTypeForName(typeof(IDtoField), parentDoc, null)

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
	def dispatch JvmGenericType toInnerClass(LDocEntityField entityField, LDocEntityDocument parentDoc) {
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

}
