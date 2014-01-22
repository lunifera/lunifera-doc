package org.lunifera.doc.dsl.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.util.TypeReferences
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.lunifera.doc.dsl.api.document.IBPMProcessDocument
import org.lunifera.doc.dsl.api.document.IDtoDocument
import org.lunifera.doc.dsl.api.document.IEntityDocument
import org.lunifera.doc.dsl.api.document.IHumanTaskDocument
import org.lunifera.doc.dsl.api.document.IUiDocument
import org.lunifera.doc.dsl.api.document.IViewDocument
import org.lunifera.doc.dsl.api.document.helper.IDocumentAccess
import org.lunifera.doc.dsl.extensions.ModelExtensions
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument
import org.lunifera.doc.dsl.luniferadoc.LDocUiDocument
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument

class LDocTypesBuilder extends JvmTypesBuilder {

	@Inject
	TypeReferences typeReference

	@Inject extension ModelExtensions

	/**
	 * Create field for an included EntityDocument
	 */
	def dispatch JvmField toIncField(LDocEntityDocument entityDoc, String name, LDocLayouter layouter) {
		toField(layouter, name, typeReference.getTypeForName(typeof(IEntityDocument), layouter, null))
	}

	/**
	 * Create field for an included DTODocument
	 */
	def dispatch JvmField toIncField(LDocDtoDocument dtoDoc, String name, LDocLayouter layouter) {
		toField(layouter, name, typeReference.getTypeForName(typeof(IDtoDocument), layouter, null))
	}

	/**
	 * Create field for an included BPMDocument
	 */
	def dispatch JvmField toIncField(LDocBPMProcessDocument bpmProcessDoc, String name, LDocLayouter layouter) {
		toField(layouter, name, typeReference.getTypeForName(typeof(IBPMProcessDocument), layouter, null))
	}

	/**
	 * Create field for an included BPMTaskDocument
	 */
	def dispatch JvmField toIncField(LDocHumanTaskDocument bpmTaskDoc, String name, LDocLayouter layouter) {
		toField(layouter, name, typeReference.getTypeForName(typeof(IHumanTaskDocument), layouter, null))
	}

	/**
	 * Create field for an included VaaclipseViewDocument
	 */
	def dispatch JvmField toIncField(LDocViewDocument vaaclipseViewDoc, String name, LDocLayouter layouter) {
		toField(layouter, name, typeReference.getTypeForName(typeof(IViewDocument), layouter, null))
	}

	/**
	 * Create field for an included UIDocument
	 */
	def dispatch JvmField toIncField(LDocUiDocument uiDoc, String name, LDocLayouter layouter) {
		toField(layouter, name, typeReference.getTypeForName(typeof(IUiDocument), layouter, null))
	}

	def JvmField toAccessField(LDocNamedDocument doc) {
		val field = toField(doc, "docAccess", typeReference.getTypeForName(typeof(IDocumentAccess), doc, null))
		addAnno(doc, field, doc.toAnnotation(typeof(Inject)))
		field
	}
}
