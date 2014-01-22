package org.lunifera.doc.dsl.api.document.impl

import java.net.URI
import java.util.List
import org.lunifera.doc.dsl.api.document.IDtoDocument
import org.lunifera.doc.dsl.api.document.IDtoField
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument
import org.lunifera.doc.dsl.api.document.IBPMProcessDocument

class BPMProcessDocument implements IBPMProcessDocument {

	private BPMProcessDocument model;

	new(BPMProcessDocument model) {
		this.model = model;
	}
	
	override getProcessId() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getDescription() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getName() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getURI() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}


}
