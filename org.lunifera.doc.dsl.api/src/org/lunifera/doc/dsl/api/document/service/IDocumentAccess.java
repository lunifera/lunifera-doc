package org.lunifera.doc.dsl.api.document.service;

import org.lunifera.doc.dsl.api.document.IDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDocument;

public interface IDocumentAccess {

	IDocument wrapDocument(LDocDocument doc);

}
