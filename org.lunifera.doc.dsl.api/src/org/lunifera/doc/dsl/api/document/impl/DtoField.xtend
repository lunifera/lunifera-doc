package org.lunifera.doc.dsl.api.document.impl

import java.net.URI
import org.lunifera.doc.dsl.api.document.IDtoField
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty

class DtoField implements IDtoField {

	private LDocDtoProperty model;

	new(LDocDtoProperty model) {
		this.model = model;
	}
	
	override getDescription() {
		return model.description;
	}
	
	override getName() {
		return model.name;
	}
	
	override getURI() {
		return model.
	}


}
