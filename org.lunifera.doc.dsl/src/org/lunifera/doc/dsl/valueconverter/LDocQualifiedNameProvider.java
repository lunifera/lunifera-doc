package org.lunifera.doc.dsl.valueconverter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.XbaseQualifiedNameProvider;
import org.lunifera.doc.dsl.extensions.ModelExtensions;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;

import com.google.inject.Inject;

public class LDocQualifiedNameProvider extends XbaseQualifiedNameProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	@Inject
	private ModelExtensions extensions;

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj == null) {
			return QualifiedName.create("");
		}

		if (obj instanceof LDocNamedDocument) {
			LDocNamedDocument doc = (LDocNamedDocument) obj;
			return qualifiedNameConverter.toQualifiedName(extensions.toFqnDocumentIndexName(doc));
		}
		return super.getFullyQualifiedName(obj);
	}
}
