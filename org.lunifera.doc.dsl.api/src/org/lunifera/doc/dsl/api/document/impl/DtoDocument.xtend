package org.lunifera.doc.dsl.api.document.impl

import java.net.URI
import java.util.List
import org.lunifera.doc.dsl.api.document.IDtoDocument
import org.lunifera.doc.dsl.api.document.IDtoField
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument

class DtoDocument implements IDtoDocument {

	private LDocDtoDocument model;

	new(LDocDtoDocument model) {
		this.model = model;
	}

	override String getName() {
		return model.getName();
	}

	override String getDescription() {
		return model.description;
	}

	override URI getURI() {
		return model.URI;
	}
	
	override List<IDtoField> getFields() {
		return model.fields.map[new DtoField(it)];
	}

}
