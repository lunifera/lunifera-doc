package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.mwe2.language.scoping.QualifiedNameProvider
import org.eclipse.jdt.annotation.Nullable
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.doc.dsl.api.document.helper.IDocumentAccess
import org.lunifera.doc.dsl.extensions.ModelExtensions
import org.lunifera.doc.dsl.luniferadoc.LDocInclude
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument

class LDocTypesBuilder extends JvmTypesBuilder {

	@Inject
	TypeReferences typeReference

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

	def JvmGenericType toDocumentClass(@Nullable LDocNamedDocument sourceElement) {
		val fqn = sourceElement.fullyQualifiedName
		val resultName = fqn.skipLast(1).append(sourceElement.toLanguage).append(fqn.lastSegment)

		val JvmGenericType result = createJvmGenericType(sourceElement, resultName.toString);
		if (result == null)
			return null;
		associate(sourceElement, result);

		result
	}
}
