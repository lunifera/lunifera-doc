/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 * Based on work by the Xtend team (xtend-lang.org)
 ******************************************************************************/

package org.lunifera.doc.dsl.richstring;

import java.util.BitSet;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XExpression;
import org.lunifera.doc.dsl.luniferadoc.LuniferaDocDocument;
import org.lunifera.doc.dsl.luniferadoc.RichStringExample;
import org.lunifera.doc.dsl.luniferadoc.RichStringH1;
import org.lunifera.doc.dsl.luniferadoc.RichStringH2;
import org.lunifera.doc.dsl.luniferadoc.RichStringLiteral;

/**
 * No-op implementation of the {@link IRichStringPartAcceptor}. Clients should
 * inherit from this class if they do not want to implement all methods. It is
 * mandatory to implement {@link #forLoopHasNext()}.
 */
@NonNullByDefault
public abstract class AbstractRichStringPartAcceptor implements
		IRichStringPartAcceptor {

	public void acceptSemanticText(CharSequence text,
			@Nullable RichStringLiteral origin) {
	}

	public void acceptTemplateText(CharSequence text,
			@Nullable RichStringLiteral origin) {
	}

	public void acceptSemanticLineBreak(int charCount,
			RichStringLiteral origin, boolean controlStructureSeen) {
	}

	public void acceptTemplateLineBreak(int charCount, RichStringLiteral origin) {
	}

	public void acceptIfCondition(XExpression condition) {
	}

	public void acceptElseIfCondition(XExpression condition) {
	}

	public void acceptElse() {
	}

	public void acceptEndIf() {
	}

	public void acceptForLoop(JvmFormalParameter parameter,
			XExpression expression) {
	}

	public void acceptEndFor(@Nullable XExpression after,
			CharSequence indentation) {
	}

	public void acceptExpression(XExpression expression,
			CharSequence indentation) {
	}

	public void announceNextLiteral(RichStringLiteral object) {
	}

	@Override
	public void acceptH1Start(RichStringH1 object) {
	}

	@Override
	public void acceptH1End() {
	}

	@Override
	public void acceptH2Start(RichStringH2 object) {
	}

	@Override
	public void acceptH2End() {
	}

	@Override
	public void acceptExampleStart(RichStringExample object) {
	}

	@Override
	public void acceptExampleEnd() {
	}

	@Override
	public void acceptDocumentStart(LuniferaDocDocument object) {
	}

	@Override
	public void acceptDocumentEnd() {
	}

	@NonNullByDefault
	// currently necessary here due to a bug in JDT
	public static class ForLoopOnce extends AbstractRichStringPartAcceptor {

		private BitSet forLoopStack = new BitSet();
		private int forLoopStackPointer = -1;

		@Override
		public void acceptForLoop(JvmFormalParameter parameter,
				@Nullable XExpression expression) {
			forLoopStackPointer++;
			forLoopStack.set(forLoopStackPointer);
		}

		public boolean forLoopHasNext(@Nullable XExpression before,
				@Nullable XExpression separator, CharSequence indentation) {
			if (forLoopStack.get(forLoopStackPointer)) {
				forLoopStack.set(forLoopStackPointer, false);
				return true;
			}
			return false;
		}

		@Override
		public void acceptEndFor(@Nullable XExpression after,
				CharSequence indentation) {
			forLoopStackPointer--;
		}
	}
}
