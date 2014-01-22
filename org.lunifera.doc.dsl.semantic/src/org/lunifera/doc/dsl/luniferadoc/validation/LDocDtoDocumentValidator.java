/**
 *
 * $Id$
 */
package org.lunifera.doc.dsl.luniferadoc.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;

/**
 * A sample validator interface for {@link org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LDocDtoDocumentValidator {
	boolean validate();

	boolean validateDtoClass(String value);
	boolean validateFields(EList<LDocDtoProperty> value);
}
