/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.conversion;

public abstract class AbstractCommentRichTextValueConverter extends AbstractRichTextValueConverter {

	@Override
	protected String getLeadingTerminal() {
		return "\u00AB\u00AB";
	}

	@Override
	protected String toEscapedString(String value) {
		// TODO: Is this the correct line separator?
		return super.toEscapedString("\n" + value);
	}

	@Override
	protected String getWithoutLeadingTerminal(String string) {
		int lineBreak = Math.max(string.indexOf('\n'), string.indexOf('\r'));
		if (lineBreak == -1 || lineBreak == string.length() - 1)
			return "";
		return string.substring(lineBreak + 1);
	}

}
