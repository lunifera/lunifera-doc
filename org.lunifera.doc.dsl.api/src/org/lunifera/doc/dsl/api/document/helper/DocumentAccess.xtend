package org.lunifera.doc.dsl.api.document.helper

import org.lunifera.doc.dsl.api.document.impl.DtoDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDocument
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
import org.lunifera.doc.dsl.api.document.IDocument
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument

class DocumentAccess implements IDocumentAccess {

	override IDocument wrapDocument(LDocDocument doc) {
		internalWrapDocument(doc)
	}

	def dispatch internalWrapDocument(LDocDtoDocument doc) {
		return new DtoDocument(doc)
	}
	
	def dispatch internalWrapDocument(LDocEntityDocument doc) {
		
	}

}
