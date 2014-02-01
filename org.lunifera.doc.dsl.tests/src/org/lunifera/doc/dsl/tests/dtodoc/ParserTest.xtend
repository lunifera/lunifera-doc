/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.tests.dtodoc

import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString
import org.lunifera.doc.dsl.luniferadoc.richstring.RichStringLiteral

import static org.junit.Assert.*
import static org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper.*
import org.lunifera.doc.dsl.luniferadoc.richstring.impl.RichStringImpl
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class ParserTest {
	
	@Inject extension ParseHelper<LDocDtoDocument>
	@Inject extension ValidationTestHelper
	@Inject extension IJvmModelAssociations
	
//	@Test
//	def void testParsing() {
//		val dtoDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/DTODocument.luniferadoc").parse
//		
//		assertEquals("doc.dto.MyDTO", dtoDoc.name)
//		assertEquals("org.lunifera.sample.MyDTO", dtoDoc.d)
//		assertEquals(2, dtoDoc.fields.size)
//		assertEquals("propA", dtoDoc.fields.get(0).name)
//		assertEquals(typeof(RichStringImpl), dtoDoc.fields.get(0).description.class)
//		assertEquals("propB", dtoDoc.fields.get(1).name)
//		
//		val propADesc = dtoDoc.fields.get(0).description
//		val propBDesc = dtoDoc.fields.get(1).description
//		
//		assertEquals("This is the description of property B.", (propBDesc.expressions.get(0) as RichStringLiteral).value.trim)
//	}
	
}