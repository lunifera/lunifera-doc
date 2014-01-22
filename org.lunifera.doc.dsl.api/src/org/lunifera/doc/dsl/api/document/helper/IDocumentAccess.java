package org.lunifera.doc.dsl.api.document.helper;

import org.lunifera.doc.dsl.api.document.IDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDocument;

import com.google.inject.ImplementedBy;

@ImplementedBy(DocumentAccess.class)
public interface IDocumentAccess {

	IDocument wrapDocument(LDocDocument doc);

}
