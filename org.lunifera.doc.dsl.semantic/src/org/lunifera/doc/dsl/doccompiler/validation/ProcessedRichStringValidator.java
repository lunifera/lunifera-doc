/**
 *
 * $Id$
 */
package org.lunifera.doc.dsl.doccompiler.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.doc.dsl.doccompiler.Line;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * A sample validator interface for {@link org.lunifera.doc.dsl.doccompiler.ProcessedRichString}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProcessedRichStringValidator {
	boolean validate();

	boolean validateRichString(RichString value);
	boolean validateLines(EList<Line> value);
}