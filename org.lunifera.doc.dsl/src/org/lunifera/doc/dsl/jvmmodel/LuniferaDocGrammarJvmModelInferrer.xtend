/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import java.net.URI
import java.util.List
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.compiler.ImportManager
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
import org.lunifera.doc.dsl.extensions.ModelExtensions
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument
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
	@Inject extension ModelExtensions
	@Inject TypeReferences typeReference
	@Inject ImportManager importManager

	@Inject
	private TypesFactory typesFactory;

	@Inject
	private IJvmModelAssociator associator;

	/**
	 * Infer method for GeneralDocument elements
	 */
	def dispatch void infer(LDocLayouter layouter, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		acceptor.accept(layouter.toDocumentClass()).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(ILayouter), layouter, null)
				documentation = layouter.documentation
				members += layouter.toAccessField()
				for (inc : layouter.includes) {
					members += inc.toIncField(inc.varName, layouter)
				}
				members += layouter.toConstructor [
					body = '''
						«FOR inc : layouter.includes.filter[!provided]»
							this.«inc.varName» = («inc.toIncTypeReference.simpleName») docAccess.wrapDocument(«inc.document.toURIString»);
						«ENDFOR»
					'''
				]
				for (inc : layouter.includes.filter[provided]) {
					members += inc.toIncludeSetter()
				}
				val richString = layouter.content
				members += layouter.toMethod("serialize", inferredType()) [
					associator.associatePrimary(richString, it)
					associator.associateLogicalContainer(richString, it)
					visibility = JvmVisibility::PUBLIC
					body = richString
					documentation = '''
						Serializes layout using the contained documents as input.
					'''
				]
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
				// gen inner classes for fields
				for (prop : dtoDocument.fields) {
					members += toInnerClass(prop, dtoDocument)
				}
				// fields
				members += toField("name", typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += dtoDocument.description.toField("description",
					typeReference.getTypeForName(typeof(String), dtoDocument, null))
				members += dtoDocument.toField("fields",
					newTypeRef('java.util.List', newTypeRef('org.lunifera.doc.dsl.api.document.IDTOProperty')))
				// constructor
				members += dtoDocument.toConstructor [
					body = '''
						this.name = "«dtoDocument.name»";
						this.description = serializeDescription().toString();
						this.fields = new java.util.ArrayList<IDTOProperty>();
						«IF dtoDocument.fields != null»
							«FOR prop : dtoDocument.fields»
								this.fields.add(new «prop.name.toFirstUpper»());
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
				members += toGetter("fields", "fields",
					newTypeRef('java.util.List', newTypeRef('org.lunifera.doc.dsl.api.document.IDTOProperty')))
			])
	}

	/**
	 * Infer method for EntityDocument elements
	 */
	def dispatch void infer(LDocEntityDocument entityDocument, IJvmDeclaredTypeAcceptor acceptor,
		boolean isPreIndexingPhase) {
		acceptor.accept(entityDocument.toDocumentClass()).initializeLater(
			[
				superTypes += typeReference.getTypeForName(typeof(IEntityDocument), entityDocument, null)
				
				members += entityDocument.toConstructor[]
				
				documentation = entityDocument.documentation
				//
				// final class fields
				//
				members += toField("name", typeReference.getTypeForName(typeof(String), entityDocument, null)) [
					final = true
					initializer = '''"«entityDocument.name»"'''
				]
				members += toField("entityName", typeReference.getTypeForName(typeof(String), entityDocument, null)) [
					final = true
					initializer = '''"«entityDocument.model?.toFqnModelName»"'''
				]
				members += toField("uri", typeReference.getTypeForName(typeof(URI), entityDocument, null)) [
					final = true
					initializer = '''URI.create(«entityDocument.toURIString»)'''
				]
				members += toField("description",
					typeReference.getTypeForName(typeof(String), entityDocument, null)) [
					final = true
					initializer = '''serializeDescription().toString()'''
				]
				members += toField("fields",
					entityDocument.newTypeRef(typeof(List),
						typeReference.getTypeForName(typeof(IEntityField), entityDocument, null)))[]
				
				
				for(field : entityDocument.fields) {
					members += toField(field.toFieldName,
						typeReference.getTypeForName(typeof(IEntityField), entityDocument, null))[]
				}
				
				members += entityDocument.toMethod("ensureFields",
					typeReference.getTypeForName(Void::TYPE, entityDocument, null)) [
						visibility =JvmVisibility::PROTECTED
						
					body = '''
						if (this.fields != null) {
							return;
						}
						
						synchronized (this) {
							if (this.fields != null) {
								return;
							}
						
							this.fields = new java.util.ArrayList<IEntityField>();
							«FOR field : entityDocument.fields»
								this.«field.toFieldName» = new «field.typeField.name.toFirstUpper»();
								this.fields.add(this.«field.toFieldName»);
								
							«ENDFOR»
						}
					''' 
					documentation = '''
					This method is used for lazy loading of fields.'''
				]
				//
				// serializes the description richstring
				//
				members += entityDocument.toMethod("serializeDescription", inferredType()) [
					if (entityDocument.description != null) {
						val descriptionRichString = entityDocument.description
						associator.associatePrimary(descriptionRichString, it)
						associator.associateLogicalContainer(descriptionRichString, it)
						visibility = JvmVisibility::PROTECTED
						body = descriptionRichString
					} else {
						body = '''return "";'''
					}
					documentation = '''
					Serializes the description of the document. The description is prepared as a RichString, so serialization is required.
					
					@return the serialized description'''
				]
				//
				// getters for fields
				//
				members += toGetter("name", typeReference.getTypeForName(typeof(String), entityDocument, null)) [
					documentation = '''
					Returns the name of the document.
					@return name'''
				]
				members += toGetter("uri", typeReference.getTypeForName(typeof(URI), entityDocument, null)) [
					documentation = '''
					Returns the URI of the document. Each document is defined by a unique URI. So URI's are used to load documents.<p>
					
					URI's follow the pattern:<br>
					lundoc://{documentType}/{name of document}?language={language}<p>
					
					For instance:<br>
					lundoc://entity/org.lunifera.carstore.Item/language=en
					
					@return The unique URI of the document'''
				]
				members += toGetter("entityName", typeReference.getTypeForName(typeof(String), entityDocument, null)) [
					documentation = '''
					Returns the name of the documented entity.
					@return name of the entity'''
				]
				members += toGetter("entityURI",
					typeReference.getTypeForName(typeof(URI), entityDocument, null)) [
					body = '''
					return URI.create("lunentity://«entityDocument.model.toFqnModelName»");'''
					documentation = '''
					Returns the URI of the entity that is documented by this document.
					
					@return the URI of the entity'''
				]
				members += toGetter("description", typeReference.getTypeForName(typeof(String), entityDocument, null)) [
					documentation = '''
					Returns the description of the document.
					@return description'''
				]
				members += toGetter("fields",
					entityDocument.newTypeRef(
						typeof(List),
						typeReference.getTypeForName(typeof(IEntityField), entityDocument, null)
					)) [
					body = '''
					// ensure that fields are initialized
					ensureFields();
					
					return java.util.Collections.unmodifiableList(fields);'''
					documentation = '''
					Returns the fields for the document.
					
					@return an unmodifieable list of fields'''
				]
				
				for(field : entityDocument.fields) {
					members += toGetter(field.toFieldGetterName,
						typeReference.getTypeForName(typeof(IEntityField), entityDocument, null))[]
				}
				
				// gen inner classes for fields
				if (entityDocument.fields != null) {
					for (field : entityDocument.fields) {
						members += toInnerClass(field, entityDocument)
					}
				}
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
					body = '''
						this.name = "«processDocument.name»";
						this.process = "«processDocument.process»";
						this.description = serializeDescription().toString();
					'''
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
					body = '''
						this.name = "«taskDocument.name»";
						this.task = "«taskDocument.task»";
						this.description = serializeDescription().toString();
					'''
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
					body = '''
						this.name = "«viewDocument.name»";
						this.view = "«viewDocument.view»";
						this.description = serializeDescription().toString();
					'''
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
	def dispatch void infer(LDocUIDocument uiDocument, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
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
					body = '''
						this.name = "«uiDocument.name»";
						this.ui = "«uiDocument.ui»";
						this.description = serializeDescription().toString();
					'''
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
				body = '''
					this.name = "«dtoProperty.name»";
					this.description = serializeDescription().toString();
				'''
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
		val propClass = entityField.toClass(entityField.typeField.name.toFirstUpper)
		propClass.superTypes += typeReference.getTypeForName(typeof(IEntityField), parentDoc, null)

		// fields
		propClass.members += toField(entityField, "name", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members += toField(entityField, "type", typeReference.getTypeForName(typeof(String), parentDoc, null))
		propClass.members +=
			toField(entityField, "length", typeReference.getTypeForName(Integer::TYPE, parentDoc, null))
		propClass.members +=
			toField(entityField, "primaryKey", typeReference.getTypeForName(Boolean::TYPE, parentDoc, null))
		propClass.members +=
			toField(entityField, "nullable", typeReference.getTypeForName(Boolean::TYPE, parentDoc, null))
		propClass.members +=
			toField(entityField, "description", typeReference.getTypeForName(typeof(String), parentDoc, null))

		//constructor					
		propClass.members += toConstructor(parentDoc,
			[
				body = '''
					this.name = "«entityField.typeField.name»";
«««					this.type = "«entityField.type»";
«««					this.length = «entityField.length»;
«««					this.primaryKey = «entityField.pk»;
«««					this.nullable = «entityField.nullable»;
					this.description = serializeDescription().toString();
				'''
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
			toGetter(entityField, "length", typeReference.getTypeForName(Integer::TYPE, parentDoc, null))
		propClass.members +=
			toGetter(entityField, "primaryKey", typeReference.getTypeForName(Boolean::TYPE, parentDoc, null))
		propClass.members +=
			toGetter(entityField, "nullable", typeReference.getTypeForName(Boolean::TYPE, parentDoc, null))
		propClass.members +=
			toGetter(entityField, "description", typeReference.getTypeForName(typeof(String), parentDoc, null))

		return propClass
	}

}
