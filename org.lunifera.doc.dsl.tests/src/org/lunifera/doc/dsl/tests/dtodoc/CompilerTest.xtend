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
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions
import org.junit.Test
import org.junit.runner.RunWith
import org.lunifera.doc.dsl.LuniferaDocGrammarInjectorProvider

import static org.junit.Assert.*
import static org.lunifera.doc.dsl.tests.util.LuniferaDocTestHelper.*

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(LuniferaDocGrammarInjectorProvider))
class CompilerTest {
	
	@Inject extension CompilationTestHelper
	@Inject extension ReflectExtensions
	
	@Test
	def void compareGeneratedJava() {
		val testDoc = loadTestModel("/org/lunifera/doc/dsl/tests/testmodels/DTODocument.luniferadoc")
		testDoc.compile[assertEquals('''
			package doc.dto;
			
			import java.util.List;
			import org.eclipse.xtend2.lib.StringConcatenation;
			import org.lunifera.doc.dsl.api.document.IDTOProperty;
			import org.lunifera.doc.dsl.api.document.IMetaDTO;
			
			@SuppressWarnings("all")
			public class MyDTO implements IMetaDTO {
			  @SuppressWarnings("all")
			  public class PropA implements IDTOProperty {
			    private String name;
			    
			    private String description;
			    
			    public PropA() {
			      this.name = "propA";
			      this.description = serializeDescription().toString();
			      
			    }
			    
			    public CharSequence serializeDescription() {
			      StringConcatenation _builder = new StringConcatenation();
			      _builder.newLine();
			      _builder.append("This is the description of property A.");
			      _builder.newLine();
			      _builder.newLine();
			      return _builder;
			    }
			    
			    public String getName() {
			      return this.name;
			    }
			    
			    public void setName(final String name) {
			      this.name = name;
			    }
			    
			    public String getDescription() {
			      return this.description;
			    }
			    
			    public void setDescription(final String description) {
			      this.description = description;
			    }
			  }
			  
			  
			  @SuppressWarnings("all")
			  public class PropB implements IDTOProperty {
			    private String name;
			    
			    private String description;
			    
			    public PropB() {
			      this.name = "propB";
			      this.description = serializeDescription().toString();
			      
			    }
			    
			    public CharSequence serializeDescription() {
			      StringConcatenation _builder = new StringConcatenation();
			      _builder.newLine();
			      _builder.append("This is the description of property B.");
			      _builder.newLine();
			      _builder.newLine();
			      return _builder;
			    }
			    
			    public String getName() {
			      return this.name;
			    }
			    
			    public void setName(final String name) {
			      this.name = name;
			    }
			    
			    public String getDescription() {
			      return this.description;
			    }
			    
			    public void setDescription(final String description) {
			      this.description = description;
			    }
			  }
			  
			  
			  private String name;
			  
			  private String dtoClass;
			  
			  private String description;
			  
			  private List<IDTOProperty> properties;
			  
			  public MyDTO() {
			    this.name = "doc.dto.MyDTO";
			    this.dtoClass = "org.lunifera.sample.MyDTO";
			    this.description = serializeDescription().toString();
			    this.properties = new java.util.ArrayList<IDTOProperty>();
			    this.properties.add(new PropA());
			    this.properties.add(new PropB());
			    
			  }
			  
			  public CharSequence serializeDescription() {
			    StringConcatenation _builder = new StringConcatenation();
			    _builder.newLine();
			    _builder.append("<h1>");
			    _builder.append("This is MyDTO.");
			    _builder.append("</h1>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("This is an ");
			    _builder.append("<a href=\"");_builder.append("http://www.example.org");_builder.append("\">");
			    _builder.append("example url");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    return _builder;
			  }
			  
			  public String getName() {
			    return this.name;
			  }
			  
			  public void setName(final String name) {
			    this.name = name;
			  }
			  
			  public String getDtoClass() {
			    return this.dtoClass;
			  }
			  
			  public void setDtoClass(final String dtoClass) {
			    this.dtoClass = dtoClass;
			  }
			  
			  public String getDescription() {
			    return serializeDescription().toString();
			  }
			  
			  public void setDescription(final String description) {
			    this.description = description;
			  }
			  
			  public List<IDTOProperty> getProperties() {
			    return this.properties;
			  }
			  
			  public void setProperties(final List<IDTOProperty> properties) {
			    this.properties = properties;
			  }
			}
		'''.toString, getSingleGeneratedCode)
		]
	}	
	
}