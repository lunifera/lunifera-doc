package org.lunifera.doc.dsl.richstring;

import org.lunifera.doc.dsl.api.IMetaPojo;

public interface IDTODocumentation {

	void setIt(IMetaPojo dto);

	String serialize();

}
