/**
 *
 * $Id$
 */
package org.lunifera.doc.dsl.doccompiler.validation;

import org.lunifera.doc.dsl.doccompiler.ImgStart;

/**
 * A sample validator interface for {@link org.lunifera.doc.dsl.doccompiler.ImgEnd}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImgEndValidator {
	boolean validate();

	boolean validateStart(ImgStart value);
}
