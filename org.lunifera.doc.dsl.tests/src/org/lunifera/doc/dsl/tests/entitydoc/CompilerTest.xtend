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
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider

import static org.junit.Assert.*
import static org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper.*
import org.junit.Ignore

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class CompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void compareGeneratedJava() {
		val testDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/EntityDocument.luniferadoc")
		testDoc.compile[assertEquals('''
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.document.IMetaEntity;
			
			@SuppressWarnings("all")
			public class MyEntity implements IMetaEntity {
			  private String name;
			  
			  private String entityClass;
			  
			  private String description;
			  
			  public MyEntity() {
			    this.name = "MyEntity";
			    this.entityClass = "org.lunifera.sample.MyEntity";
			    
			  }
			  
			  public String getName() {
			    return this.name;
			  }
			  
			  public void setName(final String name) {
			    this.name = name;
			  }
			  
			  public String getEntityClass() {
			    return this.entityClass;
			  }
			  
			  public void setEntityClass(final String entityClass) {
			    this.entityClass = entityClass;
			  }
			  
			  public String getDescription() {
			    return serializeDescription();
			  }
			  
			  public void setDescription(final String description) {
			    this.description = description;
			  }
			  
			  public CharSequence serializeDescription() {
			    StringConcatenation _builder = new StringConcatenation();
			    _builder.append("This is MyEntity");
			    return _builder;
			  }
			}
		'''.toString, getSingleGeneratedCode)
		]
	}	
	
}