/**
 *
 * $Id$
 */
package org.lunifera.doc.dsl.luniferadoc.richstring.validation;

import org.eclipse.xtext.xbase.XExpression;

/**
 * A sample validator interface for {@link org.lunifera.doc.dsl.luniferadoc.richstring.RichStringElseIf}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RichStringElseIfValidator {
	boolean validate();

	boolean validateIf(XExpression value);
	boolean validateThen(XExpression value);
}
