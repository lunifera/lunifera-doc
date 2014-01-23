package org.lunifera.doc.dsl.extensions

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.lunifera.doc.dsl.api.document.IBPMProcessDocument
import org.lunifera.doc.dsl.api.document.IDtoDocument
import org.lunifera.doc.dsl.api.document.IEntityDocument
import org.lunifera.doc.dsl.api.document.IHumanTaskDocument
import org.lunifera.doc.dsl.api.document.IUiDocument
import org.lunifera.doc.dsl.api.document.IViewDocument
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument
import org.lunifera.doc.dsl.luniferadoc.LDocType
import org.lunifera.doc.dsl.luniferadoc.LDocUiDocument
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument

import static org.lunifera.doc.dsl.luniferadoc.LDocType.*

class ModelExtensions {

	@Inject TypeReferences typeReferences
	@Inject extension QualifiedNameProvider

	@Inject
	private TypesFactory typesFactory;

	@Inject
	private IJvmModelAssociator associator;

	def addAnno(EObject target, JvmAnnotationTarget jvmType, JvmAnnotationReference anno) {
		jvmType.annotations += anno
	}

	/**
     * Creates a string annotation value and adds it the the given annotation reference
     */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name, int intValue) {

		// create the parameter
		val value = typesFactory.createJvmIntAnnotationValue
		annRef.values += value

		// create the enum type
		val declaredType = typeReferences.findDeclaredType(typeof(Integer), context) as JvmDeclaredType

		// create the operation
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values += intValue

		return value
	}

	/**
     * Creates a string annotation value and adds it the the given annotation reference
     */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name,
		JvmAnnotationReference annotationValue) {

		// create the parameter
		val value = typesFactory.createJvmAnnotationAnnotationValue
		annRef.values += value

		// create the enum type
		val declaredType = typeReferences.findDeclaredType(typeof(JvmAnnotationReference), context) as JvmDeclaredType

		// create the operation
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values += annotationValue

		return value
	}

	/**
     * Creates a string annotation value and adds it the the given annotation reference
     */
	def dispatch addAnnAttr(JvmAnnotationReference annRef, EObject context, String name,
		JvmAnnotationReference... annotationValues) {

		// create the parameter
		val value = typesFactory.createJvmAnnotationAnnotationValue
		annRef.values += value

		// create the enum type
		val declaredType = typeReferences.findDeclaredType(typeof(JvmAnnotationReference), context) as JvmDeclaredType

		// create the operation
		val JvmOperation op = typesFactory.createJvmOperation
		op.setSimpleName(name)
		op.setDeclaringType(declaredType)
		value.setOperation(op)
		value.values.addAll(annotationValues)

		return value
	}

	def toLanguage(LDocNamedDocument doc) {
		if(doc.language != null) doc.language else "en"
	}

	/**
	 * Create type for an included EntityDocument
	 */
	def toURIString(LDocNamedDocument entityDoc) {
		'''"doc://«entityDoc.fullyQualifiedName.toString»?lang=«entityDoc.toLanguage»"'''.toString
	}
 
	def JvmTypeReference toTypeReference(LDocType type, EObject context) {
		switch (type) {
			case DTO:
				return typeReferences.getTypeForName(typeof(IDtoDocument), context, null)
			case ENTITY:
				return typeReferences.getTypeForName(typeof(IEntityDocument), context, null)
		}
	}

	/**
	 * Create field for an included BPMDocument
	 */
	def dispatch  toTypeReference(LDocNamedDocument doc) {
		typeReferences.getTypeForName(typeof(IBPMProcessDocument), doc, null)
	}

	/**
	 * Create field for an included EntityDocument
	 */
	def dispatch  toTypeReference(LDocEntityDocument doc) {
		typeReferences.getTypeForName(typeof(IEntityDocument), doc, null)
	}

	/**
	 * Create field for an included DTODocument
	 */
	def dispatch  toTypeReference(LDocDtoDocument doc) {
		typeReferences.getTypeForName(typeof(IDtoDocument), doc, null)
	}

	/**
	 * Create field for an included BPMDocument
	 */
	def dispatch  toTypeReference(LDocBPMProcessDocument doc) {
		typeReferences.getTypeForName(typeof(IBPMProcessDocument), doc, null)
	}

	/**
	 * Create field for an included BPMTaskDocument
	 */
	def dispatch  toTypeReference(LDocHumanTaskDocument doc) {
		typeReferences.getTypeForName(typeof(IHumanTaskDocument), doc, null)
	}

	/**
	 * Create field for an included VaaclipseViewDocument
	 */
	def dispatch  toTypeReference(LDocViewDocument doc) {
		typeReferences.getTypeForName(typeof(IViewDocument), doc, null)
	}

	/**
	 * Create field for an included UIDocument
	 */
	def dispatch  toTypeReference(LDocUiDocument doc) {
		typeReferences.getTypeForName(typeof(IUiDocument), doc, null)
	}

}
