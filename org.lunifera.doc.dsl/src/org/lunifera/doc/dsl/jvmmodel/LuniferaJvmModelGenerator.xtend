package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.generator.trace.ITraceURIConverter
import org.eclipse.xtext.resource.ILocationInFileProvider
import org.eclipse.xtext.xbase.compiler.GeneratorConfig
import org.eclipse.xtext.xbase.compiler.ImportManager
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.lunifera.doc.dsl.richstring.LuniferaDocTreeAppendable

class LuniferaJvmModelGenerator extends JvmModelGenerator {

	@Inject ILocationInFileProvider locationProvider
	@Inject IJvmModelAssociations jvmModelAssociations
	@Inject ITraceURIConverter converter

	override TreeAppendable createAppendable(EObject context, ImportManager importManager, GeneratorConfig config) {
		val appendable = new LuniferaDocTreeAppendable(importManager, converter, locationProvider, jvmModelAssociations, context,
			"  ", "\n")
		val type = context.containerType
		if (type != null) {
			appendable.declareVariable(context.containerType, "this")
			val superType = context.containerType.extendedClass
			if (superType != null)
				appendable.declareVariable(superType.type, "super")
		}
		return appendable
	}
}
