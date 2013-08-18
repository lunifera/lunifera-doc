package org.lunifera.doc.dsl.api.impl;

import java.util.ArrayList;
import java.util.List;

import org.lunifera.doc.dsl.api.IMetaPojo;
import org.lunifera.doc.dsl.api.IMetaPojoProperty;

public class MetaPojo implements IMetaPojo {
	
	private String name;
	private String documentation;

	private final List<IMetaPojoProperty> properties = new ArrayList<IMetaPojoProperty>();

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

	public List<IMetaPojoProperty> getProperties() {
		return properties;
	}

}
