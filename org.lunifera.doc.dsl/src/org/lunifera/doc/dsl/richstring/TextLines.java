/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Work based org.eclipse.xtend.core.richstring.TextLines
 *******************************************************************************/
package org.lunifera.doc.dsl.richstring;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;

public class TextLines {

	public static List<TextLine> splitString(String text) {
		List<TextLine> result = Lists.newArrayList();
		appendLines(text, result);
		return Collections.unmodifiableList(result);
	}
	
	/**
	 * adapted from org.eclipse.jface.text.DefaultLineTracker.nextDelimiterInfo(String, int)
	 */
	public static void appendLines(String text, List<TextLine> result) {
		if (text == null)
			return;
		int length= text.length();
		int nextLineOffset = 0;
		int idx = 0;
		while(idx < length) {
			char currentChar = text.charAt(idx);
			// check for \r or \r\n
			if (currentChar == '\r') {
				int delimiterLength = 1;
				if (idx + 1 < length && text.charAt(idx + 1) == '\n') {
					delimiterLength++;
					idx++;
				}
				int lineLength = idx - delimiterLength - nextLineOffset + 1;
				TextLine line = new TextLine(text, nextLineOffset, lineLength, delimiterLength);
				result.add(line);
				nextLineOffset = idx + 1;
			} else if (currentChar == '\n') {
				int lineLength = idx - nextLineOffset;
				TextLine line = new TextLine(text, nextLineOffset, lineLength, 1);
				result.add(line);
				nextLineOffset = idx + 1;
			}
			idx++;
		}
		if (nextLineOffset != length) {
			int lineLength = length - nextLineOffset;
			TextLine line = new TextLine(text, nextLineOffset, lineLength, 0);
			result.add(line);
		}
	}
	
}