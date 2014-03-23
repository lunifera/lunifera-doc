/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.docindexer.util;

import java.io.File;

import org.apache.solr.common.SolrInputDocument;
import static org.lunifera.runtime.solr.server.LuniferaDocFields.*;

public class ParseHelper {
	
	public SolrInputDocument parseLuniferaDoc(File luniferaDoc) {
		SolrInputDocument doc = new SolrInputDocument();
		
		// TODO actually parse the given file
		
		doc.addField(URI.fieldName(), "doc://dto://org.lunifera.sample.dto.SampleDTODoc");
		doc.addField(DOC_VERSION.fieldName(), 1.0);
		doc.addField(RAW_CONTENT.fieldName(), "sample dto content");
		return doc;
	}
	
}
