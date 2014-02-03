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
import org.lunifera.doc.dsl.api.document.IEntityDocument
import org.lunifera.doc.dsl.api.document.IEntityField

import static org.junit.Assert.*
import static org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class ParserTest {

	@Inject extension ParseHelper<IEntityDocument>
	@Inject extension ValidationTestHelper
	@Inject extension IJvmModelAssociations

	@Test
	def void testParsing() {
		val entityDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/EntityDocument.luniferadoc").parse

		assertEquals("doc.entity.MyEntityDoc", entityDoc.name)
		assertEquals("org.lunifera.sample.MyEntity", entityDoc.entityName)
		assertEquals("lunentity://org.lunifera.sample.MyEntity", entityDoc.entityURI.toString)
		assertEquals(
			2,
			entityDoc.fields.size
		)
		
		assertEquals("name", entityDoc.accessField("name").name);
		

	}

	def IEntityField accessField(IEntityDocument doc, String name) {
		for(method : doc.class.methods){
			if(method.name.equals("getForField" + name.toFirstUpper)){
				return method.invoke(doc, null) as IEntityField;
			}
		}
		fail(name + " not valid");
		return null
	}

}
