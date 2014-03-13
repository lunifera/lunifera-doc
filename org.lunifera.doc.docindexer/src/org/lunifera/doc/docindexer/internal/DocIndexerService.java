/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.docindexer.internal;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.lunifera.doc.docindexer.IDocIndexerService;
import org.lunifera.runtime.solr.server.ISolrServerService;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.log.LogService;

public class DocIndexerService implements IDocIndexerService {

	private static final String LUNIFERA_DOC_HEADER = "LuniferaDoc-Entries";
	private static final String LUNIFERA_DOC_EXTENSION = "luniferadoc";

	private LogService logService;
	private ISolrServerService solrServerService;

	private void indexLuniferaDocs(Bundle bundle) {
		try {
			if (containsDocs(bundle)) {
				List<File> docFiles = loadDocsFromBundle(bundle);
			}
		} catch (Exception e) {
			logService.log(LogService.LOG_WARNING, "Error while indexing LuniferaDoc files.", e);
		}
	}
	
	private boolean containsDocs(Bundle bundle) {
		return bundle.getHeaders().get(LUNIFERA_DOC_HEADER) != null;
	}

	private List<File> loadDocsFromBundle(Bundle bundle) throws URISyntaxException, IOException {
		List<File> docFiles = new ArrayList<>();
		String docEntries = bundle.getHeaders().get(LUNIFERA_DOC_HEADER);
		System.out.println(bundle.getBundleId() + " docEntries: " + docEntries);
		Enumeration<URL> entries = bundle.findEntries(docEntries, "*." + LUNIFERA_DOC_EXTENSION,
				true);
		while (entries.hasMoreElements()) {
			URL url = entries.nextElement();
			docFiles.add(new File(FileLocator.resolve(url).toURI()));
		}
		return docFiles;
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
