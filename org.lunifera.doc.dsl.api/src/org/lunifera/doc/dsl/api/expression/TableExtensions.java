package org.lunifera.doc.dsl.api.expression;

import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

public class TableExtensions {

	@Pure
	public static void newAttribute(Table table,
			final Procedure1<Table> procedure) {
		procedure.apply(table);
	}

}
