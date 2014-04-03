/**
 *
 * $Id$
 */
package org.lunifera.doc.dsl.doccompiler.validation;

import org.eclipse.emf.common.util.EList;

import org.lunifera.doc.dsl.doccompiler.TableRowEnd;

import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableData;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;

/**
 * A sample validator interface for {@link org.lunifera.doc.dsl.doccompiler.TableRowStart}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TableRowStartValidator {
	boolean validate();

	boolean validateContent(RichStringTableRow value);
	boolean validateColumns(EList<RichStringTableData> value);
	boolean validateEnd(TableRowEnd value);
}