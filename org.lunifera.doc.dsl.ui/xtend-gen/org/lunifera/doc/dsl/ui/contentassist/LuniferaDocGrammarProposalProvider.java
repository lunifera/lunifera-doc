/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.lunifera.doc.dsl.ui.contentassist.AbstractLuniferaDocGrammarProposalProvider;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
@SuppressWarnings("all")
public class LuniferaDocGrammarProposalProvider extends AbstractLuniferaDocGrammarProposalProvider {
  public void complete_RICH_TEXT(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeInRichString(model, ruleCall, context, acceptor);
  }
  
  public void complete_RICH_TEXT_START(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeInRichString(model, ruleCall, context, acceptor);
  }
  
  public void complete_RICH_TEXT_END(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeInRichString(model, ruleCall, context, acceptor);
  }
  
  public void complete_RICH_TEXT_INBETWEEN(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeInRichString(model, ruleCall, context, acceptor);
  }
  
  public void complete_COMMENT_RICH_TEXT_END(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeInRichString(model, ruleCall, context, acceptor);
  }
  
  public void complete_COMMENT_RICH_TEXT_INBETWEEN(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeInRichString(model, ruleCall, context, acceptor);
  }
  
  public void addGuillemotsProposal(final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    int _offset = context.getOffset();
    String _selectedText = context.getSelectedText();
    int _length = _selectedText.length();
    ConfigurableCompletionProposal _configurableCompletionProposal = new ConfigurableCompletionProposal("«»", _offset, _length, 
      1);
    acceptor.accept(_configurableCompletionProposal);
  }
  
  public Object completeInRichString(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Object _xblockexpression = null;
    {
      final INode node = context.getCurrentNode();
      final int offset = node.getOffset();
      final int length = node.getLength();
      final String currentNodeText = node.getText();
      Object _xifexpression = null;
      boolean _or = false;
      boolean _and = false;
      boolean _startsWith = currentNodeText.startsWith("»");
      if (!_startsWith) {
        _and = false;
      } else {
        int _offset = context.getOffset();
        boolean _lessEqualsThan = ((offset + 1) <= _offset);
        _and = _lessEqualsThan;
      }
      if (_and) {
        _or = true;
      } else {
        boolean _and_1 = false;
        boolean _startsWith_1 = currentNodeText.startsWith("\'\'\'");
        if (!_startsWith_1) {
          _and_1 = false;
        } else {
          int _offset_1 = context.getOffset();
          boolean _lessEqualsThan_1 = ((offset + 3) <= _offset_1);
          _and_1 = _lessEqualsThan_1;
        }
        _or = _and_1;
      }
      if (_or) {
        boolean _and_2 = false;
        int _offset_2 = context.getOffset();
        boolean _greaterThan = (_offset_2 > offset);
        if (!_greaterThan) {
          _and_2 = false;
        } else {
          int _offset_3 = context.getOffset();
          boolean _lessThan = (_offset_3 < (offset + length));
          _and_2 = _lessThan;
        }
        if (_and_2) {
          this.addGuillemotsProposal(context, acceptor);
        }
      } else {
        Object _xifexpression_1 = null;
        boolean _startsWith_2 = currentNodeText.startsWith("««");
        if (_startsWith_2) {
          Object _xtrycatchfinallyexpression = null;
          try {
            ITextViewer _viewer = context.getViewer();
            final IDocument document = _viewer.getDocument();
            final int nodeLine = document.getLineOfOffset(offset);
            int _offset_4 = context.getOffset();
            final int completionLine = document.getLineOfOffset(_offset_4);
            if ((completionLine > nodeLine)) {
              this.addGuillemotsProposal(context, acceptor);
            }
          } catch (final Throwable _t) {
            if (_t instanceof BadLocationException) {
              final BadLocationException e = (BadLocationException)_t;
              _xtrycatchfinallyexpression = null;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          _xifexpression_1 = _xtrycatchfinallyexpression;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
}
