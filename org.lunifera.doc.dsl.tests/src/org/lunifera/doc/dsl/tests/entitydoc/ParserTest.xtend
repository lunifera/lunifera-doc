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
import org.lunifera.doc.dsl.luniferadoc.document.EntityDocument

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class ParserTest {
	
	@Inject extension ParseHelper<EntityDocument>
	@Inject extension ValidationTestHelper
	@Inject extension IJvmModelAssociations
	
	@Test
	def void testParsing() {
		val entityDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/EntityDocument.luniferadoc").parse
		
		assertEquals("doc.entity.MyEntityDoc", entityDoc.name)
		assertEquals("org.lunifera.sample.MyEntity", entityDoc.entityClass)
		assertEquals(2, entityDoc.fields.fields.size
		)
		
	}
	
}