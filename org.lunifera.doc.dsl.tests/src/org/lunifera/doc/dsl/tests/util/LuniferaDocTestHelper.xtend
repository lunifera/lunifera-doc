/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.lunifera.doc.dsl.tests.util

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class LuniferaDocTestHelper {
	
	/**
	 * Load test model from file.
	 * 
	 * @param path Path of the file to be loaded
	 * @return Content of the given file wrapped in a StringBuilder
	 * @throws IOException
	 */
	static def StringBuilder loadTestModel(String path) throws IOException {
		val builder = new StringBuilder();
		var BufferedReader br = null;
		try {
			val InputStreamReader reader = new InputStreamReader(LuniferaDocTestHelper.getResourceAsStream(path));
			br = new BufferedReader(reader);

			while (br.ready()) {
				builder.append(br.readLine());
				builder.append("\n\r");
			}
		} finally {
			br.close();
		}
		return builder;
	}
	
}