/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Registers the value converters for Xtend, in particular the
 * converters for rich strings and qualified names with wildcards.
 */
@Singleton
public class LuniferaDocValueConverterService extends XbaseValueConverterService {

	@Inject
	private RichTextEndValueConverter richTextEndValueConverter;

	@ValueConverter(rule = "RICH_TEXT_END")
	public IValueConverter<String> getRichTextEndValueConverter() {
		return richTextEndValueConverter;
	}

	@Inject
	private RichTextStartValueConverter richTextStartValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT_START")
	public IValueConverter<String> getRichTextStartValueConverter() {
		return richTextStartValueConverter;
	}

	@Inject
	private RichTextInBetweenValueConverter richTextInbetweenValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT_INBETWEEN")
	public IValueConverter<String> getRichTextInbetweenValueConverter() {
		return richTextInbetweenValueConverter;
	}
	
	@Inject
	private RichTextValueConverter richTextValueConverter;
	
	@ValueConverter(rule = "RICH_TEXT")
	public IValueConverter<String> getRichTextValueConverter() {
		return richTextValueConverter;
	}
	
	@Inject
	private CommentRichTextInBetweenValueConverter commentRichTextInBetweenValueConverter;

	@ValueConverter(rule = "COMMENT_RICH_TEXT_INBETWEEN")
	public IValueConverter<String> getCommentRichTextInBetweenValueConverter() {
		return commentRichTextInBetweenValueConverter;
	}
	
	@Inject
	private CommentRichTextEndValueConverter commentRichTextEndValueConverter;

	@ValueConverter(rule = "COMMENT_RICH_TEXT_END")
	public IValueConverter<String> getCommentRichTextEndValueConverter() {
		return commentRichTextEndValueConverter;
	}
}
