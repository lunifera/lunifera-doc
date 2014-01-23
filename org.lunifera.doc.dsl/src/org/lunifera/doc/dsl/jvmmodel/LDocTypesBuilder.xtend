package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider
import org.eclipse.jdt.annotation.Nullable
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.eclipse.xtext.xbase.typesystem.InferredTypeIndicator
import org.lunifera.doc.dsl.api.document.helper.IDocumentAccess
import org.lunifera.doc.dsl.extensions.ModelExtensions
import org.lunifera.doc.dsl.luniferadoc.LDocInclude
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument

class LDocTypesBuilder extends JvmTypesBuilder {

	@Inject
	TypeReferences typeReference

	@Inject
	private TypesFactory typesFactory;

	@Inject extension ModelExtensions

	@Inject extension QualifiedNameProvider

	/**
	 * Create field for an included EntityDocument
	 */
	def toIncField(LDocInclude include, String name, LDocLayouter layouter) {
		toField(layouter, name, include.toIncTypeReference)
	}

	/**
	 * Create type for an included EntityDocument
	 */
	def toIncTypeReference(LDocInclude include) {
		if (!include.provided) {
			include.document.toTypeReference
		} else {
			include.providedType.toTypeReference(include)
		}
	}

	def JvmField toAccessField(LDocNamedDocument doc) {
		val field = toField(doc, "docAccess", typeReference.getTypeForName(typeof(IDocumentAccess), doc, null))

		//		addAnno(doc, field, doc.toAnnotation(typeof(Inject)))
		field
	}

	def JvmOperation toIncludeSetter(LDocInclude include) {
		if (!include.provided) {
			return null
		}
		include.toSetter(include.varName, include.providedType.toTypeReference(include))
	}
	
	def JvmGenericType toDocumentClass(@Nullable LDocNamedDocument doc) {
		val JvmGenericType result = createJvmGenericType(doc, doc.toFqnDocumentClassName);
		associate(doc, result);
	}

	@Nullable
	def JvmOperation toGetter(@Nullable EObject sourceElement, @Nullable String fieldName,
		@Nullable JvmTypeReference typeRef, @Nullable Procedure1<? super JvmOperation> initializer) {
		if (sourceElement == null || fieldName == null)
			return null;
		val JvmOperation result = typesFactory.createJvmOperation();
		result.visibility = JvmVisibility.PUBLIC
		var String prefix = "get";
		if (typeRef != null && !typeRef.eIsProxy() && !InferredTypeIndicator.isInferred(typeRef) &&
			typeRef.getType() != null && !typeRef.getType().eIsProxy() &&
			"boolean".equals(typeRef.getType().getIdentifier())) {
			prefix = "is";
		}
		result.simpleName = prefix + Strings.toFirstUpper(fieldName)
		result.returnType = cloneWithProxies(typeRef)

		associate(sourceElement, result);

		// sets the body. It may be changed by initializer
		result.body = '''return this.«fieldName»;'''
		initializeSafely(result, initializer)
		return result
	}

}
