/**
 *
 * $Id$
 */
package org.lunifera.doc.dsl.doccompiler.validation;

import org.lunifera.doc.dsl.doccompiler.URLEnd;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringURL;

/**
 * A sample validator interface for {@link org.lunifera.doc.dsl.doccompiler.URLStart}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface URLStartValidator {
	boolean validate();

	boolean validateContent(RichStringURL value);
	boolean validateEnd(URLEnd value);
}
