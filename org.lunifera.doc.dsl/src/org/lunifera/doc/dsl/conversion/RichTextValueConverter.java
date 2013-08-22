/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Work based org.eclipse.xtend.core.conversion.RichTextValueConverter
 *******************************************************************************/
package org.lunifera.doc.dsl.conversion;

public class RichTextValueConverter extends AbstractRichTextValueConverter {

	@Override
	protected String getLeadingTerminal() {
		return "'''";
	}

	@Override
	protected String getTrailingTerminal() {
		return "'''";
	}

}