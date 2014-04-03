package org.lunifera.doc.dsl.formatting;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class Tttt {
  public String to() {
    StringConcatenation _builder = new StringConcatenation();
    {
      IntegerRange _upTo = new IntegerRange(0, 10);
      for(final Integer i : _upTo) {
        {
          if (((i).intValue() > 7)) {
          } else {
          }
        }
      }
    }
    return _builder.toString();
  }
}
