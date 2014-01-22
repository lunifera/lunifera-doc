/**
 *
 * $Id$
 */
package org.lunifera.doc.dsl.luniferadoc.validation;

import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocType;

/**
 * A sample validator interface for {@link org.lunifera.doc.dsl.luniferadoc.LDocInclude}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LDocIncludeValidator {
	boolean validate();

	boolean validateDocument(LDocDocument value);
	boolean validateVarName(String value);

	boolean validateProvided(boolean value);

	boolean validateProvidedType(LDocType value);
}
