/**
 * Caution! Commented-out code below, remove before push!
 */
package org.lunifera.doc.dsl.formatting;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Stack;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.formatting.NodeModelAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.lunifera.doc.dsl.formatting.Chunk;
import org.lunifera.doc.dsl.formatting.Line;
import org.lunifera.doc.dsl.formatting.LineModel;
import org.lunifera.doc.dsl.formatting.SemanticWhitespace;
import org.lunifera.doc.dsl.formatting.TemplateWhitespace;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringOrderedList;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTable;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableCell;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringTableRow;
import org.lunifera.doc.dsl.richstring.AbstractRichStringPartAcceptor;

@SuppressWarnings("all")
public class RichStringToLineModel extends AbstractRichStringPartAcceptor.ForLoopOnce {
  private final RichString string;
  
  private final String document;
  
  private final NodeModelAccess nodeModelAccess;
  
  private final LineModel _model = new LineModel();
  
  public LineModel getModel() {
    return this._model;
  }
  
  private int offset = (-1);
  
  private int contentStartOffset = (-1);
  
  private int contentStartColumn = (-1);
  
  private Stack<Chunk> indentationStack = new Stack<Chunk>();
  
  private boolean content = false;
  
  private boolean indentNextLine = false;
  
  private boolean _outdentThisLine = false;
  
  private int lastLiteralEndOffset;
  
  public RichStringToLineModel(final NodeModelAccess nodeModelAccess, final RichString string) {
    this.nodeModelAccess = nodeModelAccess;
    this.string = string;
    INode _nodeForEObject = nodeModelAccess.nodeForEObject(string);
    ICompositeNode _rootNode = _nodeForEObject.getRootNode();
    String _text = _rootNode.getText();
    this.document = _text;
  }
  
  public boolean outdentThisLine() {
    boolean _xifexpression = false;
    if (this.indentNextLine) {
      _xifexpression = this.indentNextLine = false;
    } else {
      _xifexpression = this._outdentThisLine = true;
    }
    return _xifexpression;
  }
  
  public void finish() {
    this.acceptLineBreak(0, false, false);
  }
  
  protected int literalPrefixLenght(final INode node) {
    int _switchResult = (int) 0;
    String _text = node.getText();
    final String t = _text;
    boolean _matched = false;
    if (!_matched) {
      boolean _startsWith = t.startsWith("\'\'\'");
      if (_startsWith) {
        _matched=true;
        _switchResult = 3;
      }
    }
    if (!_matched) {
      boolean _startsWith_1 = t.startsWith("��");
      if (_startsWith_1) {
        _matched=true;
        _switchResult = 2;
      }
    }
    if (!_matched) {
      boolean _startsWith_2 = t.startsWith("�");
      if (_startsWith_2) {
        _matched=true;
        _switchResult = 1;
      }
    }
    if (!_matched) {
      _switchResult = 1;
    }
    return _switchResult;
  }
  
  protected int literalPostfixLenght(final INode node) {
    int _switchResult = (int) 0;
    String _text = node.getText();
    final String t = _text;
    boolean _matched = false;
    if (!_matched) {
      boolean _endsWith = t.endsWith("\'\'\'");
      if (_endsWith) {
        _matched=true;
        _switchResult = 3;
      }
    }
    if (!_matched) {
      boolean _endsWith_1 = t.endsWith("��");
      if (_endsWith_1) {
        _matched=true;
        _switchResult = 2;
      }
    }
    if (!_matched) {
      boolean _endsWith_2 = t.endsWith("�");
      if (_endsWith_2) {
        _matched=true;
        _switchResult = 1;
      }
    }
    if (!_matched) {
      _switchResult = 1;
    }
    return _switchResult;
  }
  
  public void announceNextLiteral(final RichStringLiteral object) {
    super.announceNextLiteral(object);
    if (((this.lastLiteralEndOffset > 0) && (this.contentStartOffset < 0))) {
      this.contentStartOffset = this.lastLiteralEndOffset;
    }
    final INode node = this.nodeModelAccess.nodeForFeature(object, XbasePackage.Literals.XSTRING_LITERAL__VALUE);
    boolean _notEquals = (!Objects.equal(node, null));
    if (_notEquals) {
      int _offset = node.getOffset();
      int _literalPrefixLenght = this.literalPrefixLenght(node);
      int _plus = (_offset + _literalPrefixLenght);
      this.offset = _plus;
      int _endOffset = node.getEndOffset();
      int _literalPostfixLenght = this.literalPostfixLenght(node);
      int _minus = (_endOffset - _literalPostfixLenght);
      this.lastLiteralEndOffset = _minus;
    }
    this.content = true;
  }
  
  public void acceptSemanticLineBreak(final int charCount, final RichStringLiteral origin, final boolean controlStructureSeen) {
    super.acceptSemanticLineBreak(charCount, origin, controlStructureSeen);
    this.acceptLineBreak(charCount, true, true);
    this.offset = (this.offset + charCount);
  }
  
  public void acceptTemplateLineBreak(final int charCount, final RichStringLiteral origin) {
    super.acceptTemplateLineBreak(charCount, origin);
    this.acceptLineBreak(charCount, false, true);
    this.offset = (this.offset + charCount);
  }
  
  public void acceptLineBreak(final int charCount, final boolean semantic, final boolean startNewLine) {
    this.startContent();
    if ((this.contentStartOffset > 0)) {
      final String lastLinesContent = this.document.substring(this.contentStartOffset, this.offset);
      LineModel _model = this.getModel();
      List<Line> _lines = _model.getLines();
      boolean _isEmpty = _lines.isEmpty();
      if (_isEmpty) {
        LineModel _model_1 = this.getModel();
        _model_1.setLeadingText(lastLinesContent);
        this.contentStartColumn = 0;
      } else {
        LineModel _model_2 = this.getModel();
        List<Line> _lines_1 = _model_2.getLines();
        final Line lastLine = IterableExtensions.<Line>last(_lines_1);
        lastLine.setContent(lastLinesContent);
        int _offset = lastLine.getOffset();
        int _newLineCharCount = lastLine.getNewLineCharCount();
        int _plus = (_offset + _newLineCharCount);
        final int newContentStartColumn = (this.contentStartOffset - _plus);
        boolean _isLeadingSemanticNewLine = lastLine.isLeadingSemanticNewLine();
        if (_isLeadingSemanticNewLine) {
          if ((newContentStartColumn > this.contentStartColumn)) {
            final int length = (newContentStartColumn - this.contentStartColumn);
            final String text = this.document.substring((this.contentStartOffset - length), this.contentStartOffset);
            SemanticWhitespace _semanticWhitespace = new SemanticWhitespace(text, newContentStartColumn);
            this.indentationStack.push(_semanticWhitespace);
          }
        }
        if ((newContentStartColumn < this.contentStartColumn)) {
          Iterable<SemanticWhitespace> _filter = Iterables.<SemanticWhitespace>filter(this.indentationStack, SemanticWhitespace.class);
          List<SemanticWhitespace> _list = IterableExtensions.<SemanticWhitespace>toList(_filter);
          for (final SemanticWhitespace ws : _list) {
            int _column = ws.getColumn();
            boolean _greaterThan = (_column > newContentStartColumn);
            if (_greaterThan) {
              this.indentationStack.remove(ws);
            }
          }
        }
        if (this._outdentThisLine) {
          boolean _empty = this.indentationStack.empty();
          boolean _not = (!_empty);
          if (_not) {
            this.indentationStack.pop();
          }
          this._outdentThisLine = false;
        }
        lastLine.setIndentLength(newContentStartColumn);
        if ((newContentStartColumn != 0)) {
          this.contentStartColumn = newContentStartColumn;
        }
        LineModel _model_3 = this.getModel();
        List<Line> _lines_2 = _model_3.getLines();
        Line _last = IterableExtensions.<Line>last(_lines_2);
        List<Chunk> _chunks = _last.getChunks();
        Iterables.<Chunk>addAll(_chunks, this.indentationStack);
      }
    }
    if (this.indentNextLine) {
      TemplateWhitespace _templateWhitespace = new TemplateWhitespace("");
      this.indentationStack.push(_templateWhitespace);
      this.indentNextLine = false;
    }
    this.contentStartOffset = (-1);
    this.content = false;
    if (startNewLine) {
      LineModel _model_4 = this.getModel();
      List<Line> _lines_3 = _model_4.getLines();
      Line _line = new Line(this.offset, semantic, charCount);
      _lines_3.add(_line);
    }
  }
  
  public void startContent() {
    if ((!this.content)) {
      this.contentStartOffset = this.offset;
      this.content = true;
    }
  }
  
  public void acceptSemanticText(final CharSequence text, final RichStringLiteral origin) {
    super.acceptSemanticText(text, origin);
    if ((!this.content)) {
      boolean _and = false;
      int _length = text.length();
      boolean _greaterThan = (_length > 0);
      if (!_greaterThan) {
        _and = false;
      } else {
        int _length_1 = text.length();
        int _minus = (_length_1 - 1);
        IntegerRange _upTo = new IntegerRange(0, _minus);
        final Function2<Boolean, Integer, Boolean> _function = new Function2<Boolean, Integer, Boolean>() {
          public Boolean apply(final Boolean v, final Integer i) {
            boolean _or = false;
            if ((v).booleanValue()) {
              _or = true;
            } else {
              char _charAt = text.charAt((i).intValue());
              boolean _isWhitespace = Character.isWhitespace(_charAt);
              boolean _not = (!_isWhitespace);
              _or = _not;
            }
            return Boolean.valueOf(_or);
          }
        };
        Boolean _fold = IterableExtensions.<Integer, Boolean>fold(_upTo, Boolean.valueOf(false), _function);
        _and = (_fold).booleanValue();
      }
      if (_and) {
        this.startContent();
      }
    }
    int _length_2 = text.length();
    int _plus = (this.offset + _length_2);
    this.offset = _plus;
  }
  
  public void acceptTemplateText(final CharSequence text, final RichStringLiteral origin) {
    super.acceptTemplateText(text, origin);
    if ((!this.content)) {
      LineModel _model = this.getModel();
      int _rootIndentLenght = _model.getRootIndentLenght();
      boolean _lessThan = (_rootIndentLenght < 0);
      if (_lessThan) {
        LineModel _model_1 = this.getModel();
        int _length = text.length();
        _model_1.setRootIndentLenght(_length);
        int _length_1 = text.length();
        this.contentStartColumn = _length_1;
      }
    }
    int _length_2 = text.length();
    int _plus = (this.offset + _length_2);
    this.offset = _plus;
  }
  
  public void acceptExpression(final XExpression expression, final CharSequence indentation) {
    super.acceptExpression(expression, indentation);
    this.startContent();
  }
  
  public void acceptIfCondition(final XExpression condition) {
    super.acceptIfCondition(condition);
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptElseIfCondition(final XExpression condition) {
    super.acceptElseIfCondition(condition);
    this.outdentThisLine();
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptElse() {
    super.acceptElse();
    this.outdentThisLine();
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptEndIf() {
    super.acceptEndIf();
    this.outdentThisLine();
    this.startContent();
  }
  
  public void acceptOrderedListStart(final RichStringOrderedList object) {
    super.acceptOrderedListStart(object);
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptOrderedListEnd() {
    super.acceptOrderedListEnd();
    this.outdentThisLine();
    this.startContent();
  }
  
  public void acceptListStart(final RichStringList object) {
    super.acceptListStart(object);
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptListEnd() {
    super.acceptListEnd();
    this.outdentThisLine();
    this.startContent();
  }
  
  public void acceptTableStart(final RichStringTable object) {
    super.acceptTableStart(object);
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptTableEnd() {
    super.acceptTableEnd();
    this.outdentThisLine();
    this.startContent();
  }
  
  public void acceptTableRowStart(final RichStringTableRow object) {
    super.acceptTableRowStart(object);
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptTableRowEnd() {
    super.acceptTableRowEnd();
    this.outdentThisLine();
    this.startContent();
  }
  
  public void acceptTableCellStart(final RichStringTableCell object) {
    super.acceptTableCellStart(object);
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptTableCellEnd() {
    super.acceptTableCellEnd();
    this.outdentThisLine();
    this.startContent();
  }
  
  public void acceptForLoop(final JvmFormalParameter parameter, final XExpression expression) {
    super.acceptForLoop(parameter, expression);
    this.startContent();
    this.indentNextLine = true;
  }
  
  public void acceptEndFor(final XExpression after, final CharSequence indentation) {
    super.acceptEndFor(after, indentation);
    this.outdentThisLine();
    this.startContent();
  }
}
