/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.docindexer.internal;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.apache.solr.common.SolrInputDocument;
import org.eclipse.core.runtime.internal.adaptor.URLConverterImpl;
import org.eclipse.emf.common.util.URI;
import org.lunifera.doc.docindexer.IDocIndexerService;
import org.lunifera.doc.docindexer.util.ParseHelper;
import org.lunifera.runtime.solr.server.ISolrServerService;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.log.LogService;

public class DocIndexerService implements IDocIndexerService {

	private static final String LUNIFERA_DOC_HEADER = "LuniferaDoc-Entries";
	private static final String LUNIFERA_DOC_EXTENSION = "docu";

	private LogService logService;
	private ISolrServerService solrServerService;
	private ParseHelper parseHelper = new ParseHelper();

	private void indexLuniferaDocs(Bundle bundle) {
		try {
			if (containsDocs(bundle)) {
				List<URI> docUris = getDocUrisFromBundle(bundle);
				for (URI docUri : docUris) {
					SolrInputDocument doc = parseHelper.parseLuniferaDoc(docUri);
					try {
						solrServerService.addDocument(doc);
					} catch (Exception e) {
						logService.log(LogService.LOG_WARNING,
								"Error while indexing LuniferaDoc file: " + docUri, e);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logService.log(LogService.LOG_WARNING, "Error while indexing LuniferaDoc files.", e);
		}
	}

	private boolean containsDocs(Bundle bundle) {
		return bundle.getHeaders().get(LUNIFERA_DOC_HEADER) != null;
	}

	private List<URI> getDocUrisFromBundle(Bundle bundle) throws URISyntaxException, IOException {
		List<URI> docUris = new ArrayList<>();
		String docEntriesString = bundle.getHeaders().get(LUNIFERA_DOC_HEADER);
		String[] docEntries = docEntriesString.split(",");
		for (String docEntry : docEntries) {
			Enumeration<URL> entries = bundle.findEntries(docEntry.trim(), "*."
					+ LUNIFERA_DOC_EXTENSION, true);
			if (entries != null) {
				while (entries.hasMoreElements()) {
					URL url = entries.nextElement();
					docUris.add(URI.createURI(new URLConverterImpl().toFileURL(url).toURI()
							.toString()));
				}
			}
		}
		return docUris;
	}

	protected void activate(ComponentContext compontentContext) {
		final BundleContext bundleContext = compontentContext.getBundleContext();
		bundleContext.addBundleListener(new BundleListener() {
			@Override
			public void bundleChanged(BundleEvent event) {
				if (event.getType() == BundleEvent.STARTED && containsDocs(event.getBundle())) {
					indexLuniferaDocs(event.getBundle());
				}
			}
		});
	}

	protected void deactivate(ComponentContext componentContext) {
		logService = null;
		solrServerService = null;
	}

	protected synchronized void bindLogService(LogService logService) {
		this.logService = logService;
	}

	protected synchronized void unbindLogService(LogService logService) {
		this.logService = null;
	}

	protected synchronized void bindSolrServerService(ISolrServerService solrServerService) {
		this.solrServerService = solrServerService;
	}

	protected synchronized void unbindSolrServerService(ISolrServerService solrServerService) {
		this.solrServerService = null;
	}

}
