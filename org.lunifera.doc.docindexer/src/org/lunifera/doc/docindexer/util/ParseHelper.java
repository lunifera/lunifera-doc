/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.docindexer.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.solr.common.SolrInputDocument;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.lunifera.doc.dsl.LuniferaDocGrammarStandaloneSetup;
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;
import org.lunifera.runtime.solr.server.LuniferaDocFields;

import com.google.inject.Injector;

public class ParseHelper {
	
	public SolrInputDocument parseLuniferaDoc(URI docUri) throws IOException {
		SolrInputDocument doc = new SolrInputDocument();
		
		Injector injector = new LuniferaDocGrammarStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, false);
		Resource resource = resourceSet.getResource(docUri, true);
		EObject docObject = resource.getContents().get(0);
		
		Path docPath = Paths.get(docUri.toFileString());
		
		String uri = null;
		Double docVersion = null;
		String rawContent = readFile(docPath);
		
		if(docObject instanceof LDocLayouter) {
			LDocLayouter layouterDoc = (LDocLayouter) docObject;
			uri = "doc://common://" + layouterDoc.getName();
			docVersion = 1.0;
		} else if (docObject instanceof LDocEntityDocument) {
			LDocEntityDocument entityDoc = (LDocEntityDocument) docObject;
			uri = "doc://entity://" + entityDoc.getName();
			docVersion = 1.0;
		} else if (docObject instanceof LDocDtoDocument) {
			LDocDtoDocument dtoDoc = (LDocDtoDocument) docObject;
			uri = "doc://dto://" + dtoDoc.getName();
			docVersion = 1.0;
		} else if (docObject instanceof LDocBPMProcessDocument) {
			LDocBPMProcessDocument bpmDoc = (LDocBPMProcessDocument) docObject;
			uri = "doc://process://" + bpmDoc.getName();
			docVersion = 1.0;
		} else if (docObject instanceof LDocHumanTaskDocument) {
			LDocHumanTaskDocument humanTaskDoc = (LDocHumanTaskDocument) docObject;
			uri = "doc://task://" + humanTaskDoc.getName();
			docVersion = 1.0;
		} else if (docObject instanceof LDocViewDocument) {
			LDocViewDocument viewDoc = (LDocViewDocument) docObject;
			uri = "doc://view://" + viewDoc.getName();
			docVersion = 1.0;
		} else if (docObject instanceof LDocUIDocument) {
			LDocUIDocument uiDoc = (LDocUIDocument) docObject;
			uri = "doc://ui://" + uiDoc.getName();
			docVersion = 1.0;
		}
		
		doc.addField(LuniferaDocFields.URI.fieldName(), uri);
		doc.addField(LuniferaDocFields.DOC_VERSION.fieldName(), docVersion);
		doc.addField(LuniferaDocFields.RAW_CONTENT.fieldName(), rawContent);
		return doc;
	}
	
	public String readFile(Path path) throws IOException {
		BufferedReader reader = Files.newBufferedReader(path);
		StringBuilder content = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            content.append(line);
        }
        return content.toString();
	}
	
}