/**
 * Caution! Commented-out code below, remove before push!
 */
package org.lunifera.doc.dsl.formatting;

import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public abstract class Chunk {
  private final CharSequence _text;
  
  public CharSequence getText() {
    return this._text;
  }
  
  public int getLength() {
    CharSequence _text = this.getText();
    return _text.length();
  }
  
  public Chunk(final CharSequence text) {
    super();
    this._text = text;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_text== null) ? 0 : _text.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Chunk other = (Chunk) obj;
    if (_text == null) {
      if (other._text != null)
        return false;
    } else if (!_text.equals(other._text))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
