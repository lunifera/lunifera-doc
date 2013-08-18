package org.lunifera.doc.dsl.api;

import java.util.List;

public interface IMetaPojo {
	
	String getName();

	void setName(String name);

	String getDocumentation();

	void setDocumentation(String documentation);

	List<IMetaPojoProperty> getProperties();
	
}
