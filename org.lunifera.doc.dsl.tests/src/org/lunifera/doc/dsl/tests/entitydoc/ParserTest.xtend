/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.tests.entitydoc

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider
import org.lunifera.doc.dsl.luniferadoc.document.GeneralDocument
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString

import static org.junit.Assert.*
import static org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper.*
import org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImpl

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class ParserTest {
	
	@Inject extension ParseHelper<GeneralDocument>
	@Inject extension ValidationTestHelper
	@Inject extension IJvmModelAssociations
	
	@Test
	def void testParsing() {
		val testDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/EntityDocument.luniferadoc").parse
		
		assertEquals("Introduction", testDoc.name)
		assertEquals(2, testDoc.includes.size)
		assertEquals("org.lunifera.sample.MyDTODocument", testDoc.includes.get(0).include)
		assertEquals("myDTODoc", testDoc.includes.get(0).varName)
		assertEquals(typeof(RichStringImpl), testDoc.content.class)
		
	}
	
	/**
	 * Currently unused but kept as a sample
	 */
	@SuppressWarnings("unused")
	private def String generateTestDoc() {
		'''
			GeneralDocument Introduction {
				include org.lunifera.sample.MyDTODocument as myDTODoc
				include org.lunifera.sample.AnotherDTODocument as anotherDTODoc
	
				«"'''"»
				«"«"»h1«"»"»Once there was a Pojo named «"«"»myDTODoc.^name«"»"».«"«"»/h1«"»"»
				«"'''"»
			}
		'''
	}
	
}