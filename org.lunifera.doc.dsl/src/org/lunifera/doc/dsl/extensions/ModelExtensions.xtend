package org.lunifera.doc.dsl.extensions

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmAnnotationReference
import org.eclipse.xtext.common.types.JvmAnnotationTarget
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator
import org.lunifera.doc.dsl.jvmmodel.LDocTypesBuilder

class ModelExtensions {

	@Inject extension LDocTypesBuilder
	@Inject TypeReferences typeReferences

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
}
