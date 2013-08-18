package org.lunifera.doc.dsl.richstring;

import java.util.ArrayList;
import java.util.List;

public class MetaDTO {
	private String name;
	private String documentation;

	private final List<MetaDTOProperty> properties = new ArrayList<MetaDTOProperty>();

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

	public List<MetaDTOProperty> getProperties() {
		return properties;
	}

}
