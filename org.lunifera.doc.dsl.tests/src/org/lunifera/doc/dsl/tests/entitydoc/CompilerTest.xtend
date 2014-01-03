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
			package doc.entity;
			
			import java.util.List;
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.document.IEntityDocument;
			import org.lunifera.doc.dsl.api.document.IEntityField;
			
			@SuppressWarnings("all")
			public class MyEntityDoc implements IEntityDocument {
			  @SuppressWarnings("all")
			  public class FieldA implements IEntityField {
			    private String name;
			    
			    private String type;
			    
			    private Integer length;
			    
			    private Boolean pk;
			    
			    private Boolean nullable;
			    
			    private String description;
			    
			    public FieldA() {
			      this.name = "fieldA";
			      this.type = "int";
			      this.length = 11;
			      this.pk = true;
			      this.nullable = false;
			      this.description = serializeDescription().toString();
			      
			    }
			    
			    public CharSequence serializeDescription() {
			      StringConcatenation _builder = new StringConcatenation();
			      _builder.newLine();
			      _builder.append("This is the description of fieldA. FieldA is of type int(11), a primary key and hence not nullable.");
			      _builder.newLine();
			      _builder.newLine();
			      return _builder;
			    }
			    
			    public String getName() {
			      return this.name;
			    }
			    
			    public String getType() {
			      return this.type;
			    }
			    
			    public Integer getLength() {
			      return this.length;
			    }
			    
			    public Boolean getPk() {
			      return this.pk;
			    }
			    
			    public Boolean getNullable() {
			      return this.nullable;
			    }
			    
			    public String getDescription() {
			      return this.description;
			    }
			  }
			  
			  
			  @SuppressWarnings("all")
			  public class FieldB implements IEntityField {
			    private String name;
			    
			    private String type;
			    
			    private Integer length;
			    
			    private Boolean pk;
			    
			    private Boolean nullable;
			    
			    private String description;
			    
			    public FieldB() {
			      this.name = "fieldB";
			      this.type = "varchar";
			      this.length = 255;
			      this.pk = false;
			      this.nullable = true;
			      this.description = serializeDescription().toString();
			      
			    }
			    
			    public CharSequence serializeDescription() {
			      StringConcatenation _builder = new StringConcatenation();
			      _builder.newLine();
			      _builder.append("This is the ");
			      _builder.append("<h2>");
			      _builder.append("description");
			      _builder.append("</h2>");
			      _builder.append(" of property B. This field is nullable. ");
			      _builder.newLineIfNotEmpty();
			      _builder.newLine();
			      return _builder;
			    }
			    
			    public String getName() {
			      return this.name;
			    }
			    
			    public String getType() {
			      return this.type;
			    }
			    
			    public Integer getLength() {
			      return this.length;
			    }
			    
			    public Boolean getPk() {
			      return this.pk;
			    }
			    
			    public Boolean getNullable() {
			      return this.nullable;
			    }
			    
			    public String getDescription() {
			      return this.description;
			    }
			  }
			  
			  
			  private String name;
			  
			  private String entityClass;
			  
			  private String description;
			  
			  private List<IEntityField> fields;
			  
			  public MyEntityDoc() {
			    this.name = "doc.entity.MyEntityDoc";
			    this.entityClass = "org.lunifera.sample.MyEntity";
			    this.description = serializeDescription().toString();
			    this.fields = new java.util.ArrayList<IEntityField>();
			    this.fields.add(new FieldA());
			    this.fields.add(new FieldB());
			  }
			  
			  public CharSequence serializeDescription() {
			    StringConcatenation _builder = new StringConcatenation();
			    _builder.append("This is MyEntity");
			    return _builder;
			  }
			  
			  public String getName() {
			    return this.name;
			  }
			  
			  public String getEntityClass() {
			    return this.entityClass;
			  }
			  
			  public String getDescription() {
			    return this.description;
			  }
			  
			  public List<IEntityField> getFields() {
			    return this.fields;
			  }
			}
		'''.toString, getSingleGeneratedCode)
		]
	}	
	
}