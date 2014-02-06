/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.tests.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@SuppressWarnings("all")
public class LuniferaDocTestHelper {
  /**
   * Load test model from file.
   * 
   * @param path Path of the file to be loaded
   * @return Content of the given file wrapped in a StringBuilder
   * @throws IOException
   */
  public static StringBuilder loadTestModel(final String path) throws IOException {
    final StringBuilder builder = new StringBuilder();
    BufferedReader br = null;
    try {
      InputStream _resourceAsStream = LuniferaDocTestHelper.class.getResourceAsStream(path);
      final InputStreamReader reader = new InputStreamReader(_resourceAsStream);
      BufferedReader _bufferedReader = new BufferedReader(reader);
      br = _bufferedReader;
      boolean _ready = br.ready();
      boolean _while = _ready;
      while (_while) {
        {
          String _readLine = br.readLine();
          builder.append(_readLine);
          builder.append("\n\r");
        }
        boolean _ready_1 = br.ready();
        _while = _ready_1;
      }
    } finally {
      br.close();
    }
    return builder;
  }
}
