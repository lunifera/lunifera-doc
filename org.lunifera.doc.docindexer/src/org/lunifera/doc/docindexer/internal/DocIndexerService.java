/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.lunifera.doc.docindexer.internal;

import org.lunifera.doc.docindexer.IDocIndexerService;
import org.lunifera.runtime.solr.server.ISolrServerService;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.service.component.ComponentContext;

public class DocIndexerService implements IDocIndexerService {
	
	private static final String LUNIFERA_DOC_HEADER = "lunifera-doc-entries";
	
	private ISolrServerService solrServerService;
	
	protected void activate(ComponentContext compontentContext) {
		final BundleContext bundleContext = compontentContext.getBundleContext();
		bundleContext.addBundleListener(new BundleListener() {
			
			@Override
			public void bundleChanged(BundleEvent event) {
				if(event.getType() == BundleEvent.STARTED) {
					String docEntries = event.getBundle().getHeaders().get(LUNIFERA_DOC_HEADER);
				}
			}
		});
	}
	
	protected void deactivate(ComponentContext componentContext) {
	}
	
	protected synchronized void bindSolrServerService(ISolrServerService solrServerService) {
		this.solrServerService = solrServerService;
	}
	
	protected synchronized void unbindSolrServerService(ISolrServerService solrServerService) {
		this.solrServerService = null;
	}

}
