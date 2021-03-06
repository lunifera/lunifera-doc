/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.richstring;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The indentation handler encapsulates the logic of rich string indentation with respect to template and semantic
 * whitespace per line.
 */
@NonNullByDefault
public interface IRichStringIndentationHandler {

	/**
	 * Announce template indentation. The passed indentation is expected to contain the complete whitespace prefix of a
	 * line. Implementors will extract the new parts from it automatically.
	 * 
	 * @param completeIndentation
	 *            the leading whitespace of a line. May not be <code>null</code>.
	 */
	void pushTemplateIndentation(CharSequence completeIndentation);

	/**
	 * Announce semantic indentation. The passed indentation is expected to contain the complete whitespace prefix of a
	 * line. Implementors will extract the new parts from it automatically.
	 * 
	 * @param completeIndentation
	 *            the leading whitespace of a line. May not be <code>null</code>.
	 */
	void pushSemanticIndentation(CharSequence completeIndentation);

	/**
	 * Drop the recently announced indentation and use the previous state.
	 */
	void popIndentation();

	/**
	 * Announce the current indentation to the acceptor.
	 */
	void accept(IRichStringPartAcceptor acceptor);

	/**
	 * Return the current semantic indentation.
	 * 
	 * @return the complete semantic indentation. Never <code>null</code>.
	 */
	CharSequence getTotalSemanticIndentation();

	/**
	 * Return the current indentation.
	 * 
	 * @return the complete indentation. Never <code>null</code>.
	 */
	CharSequence getTotalIndentation();

}
