/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.docindexer.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.solr.common.SolrInputDocument;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.lunifera.doc.dsl.LuniferaDocGrammarStandaloneSetup;
import org.lunifera.doc.dsl.api.document.IEntityDocument;
import org.lunifera.doc.dsl.services.LuniferaDocGrammarGrammarAccess.EntityDocumentElements;
import org.lunifera.runtime.solr.server.LuniferaDocFields;

import com.google.inject.Injector;

public class ParseHelper {
	
	public SolrInputDocument parseLuniferaDoc(File luniferaDoc) {
		SolrInputDocument doc = new SolrInputDocument();
		
		Injector injector = new LuniferaDocGrammarStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, false);
		Resource resource = resourceSet.createResource(URI.createURI("dummy:/dummy.luniferadoc"));
		FileInputStream fis = new FileInputStream(luniferaDoc);
		resource.load(fis, resourceSet.getLoadOptions());
		EObject docObject = resource.getContents().get(0);
		
		String uri = null;
		String docVersion = null;
		String rawContent = null;
		
		// TODO how to get generated EntityDocument, etc... classes?
		if(docObject.eClass() == EntityDocument.class) {
			EntityDocument entityDoc = (EntityDocument) docObject;
			// set uri, docVersion, rawContent
		} else if (docObject.eClass().getName() == "DTODocument") {
			
		}
		
		doc.addField(LuniferaDocFields.URI.fieldName(), "doc://dto://org.lunifera.sample.dto.SampleDTODoc");
		doc.addField(LuniferaDocFields.DOC_VERSION.fieldName(), 1.0);
		doc.addField(LuniferaDocFields.RAW_CONTENT.fieldName(), "sample dto content");
		return doc;
	}
	
}