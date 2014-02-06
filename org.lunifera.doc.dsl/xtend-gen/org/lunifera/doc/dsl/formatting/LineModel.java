/**
 * Caution! Commented-out code below, remove before push!
 */
package org.lunifera.doc.dsl.formatting;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.lunifera.doc.dsl.formatting.Line;

@SuppressWarnings("all")
public class LineModel {
  private String _leadingText;
  
  public String getLeadingText() {
    return this._leadingText;
  }
  
  public void setLeadingText(final String leadingText) {
    this._leadingText = leadingText;
  }
  
  private int _rootIndentLenght = (-1);
  
  public int getRootIndentLenght() {
    return this._rootIndentLenght;
  }
  
  public void setRootIndentLenght(final int rootIndentLenght) {
    this._rootIndentLenght = rootIndentLenght;
  }
  
  private final List<Line> _lines = CollectionLiterals.<Line>newArrayList();
  
  public List<Line> getLines() {
    return this._lines;
  }
  
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("rootIndentLenght=�rootIndentLenght�");
    _builder.newLine();
    _builder.append("�leadingText��lines.join�");
    _builder.newLine();
    return _builder.toString();
  }
}
