package org.lunifera.doc.dsl.api.impl;

import org.lunifera.doc.dsl.api.IMetaPojoProperty;

public class MetaPojoProperty implements IMetaPojoProperty {
	
	private String name;
	private String documentation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

}
