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
			import org.lunifera.doc.dsl.api.document.IDTODocument;
			import org.lunifera.doc.dsl.api.document.IDTOProperty;
			
			@SuppressWarnings("all")
			public class MyDTO implements IDTODocument {
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
			      _builder.append("This is the ");
			      _builder.append("<b>");
			      _builder.append("description");
			      _builder.append("</b>");
			      _builder.append(" of property A...");
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
			    _builder.append("<a id=\">");_builder.append("intro");_builder.append("\" class=\"lundoc-chapter\">");
			    _builder.append("Introduction");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<a id=\">");_builder.append("overview");_builder.append("\" class=\"lundoc-section\">");
			    _builder.append("General Overview");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<a id=\">");_builder.append("further_info");_builder.append("\" class=\"lundoc-subsection\">");
			    _builder.append("Further information");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<h1>");
			    _builder.append("This is MyDTO.");
			    _builder.append("</h1>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<h2>");
			    _builder.append("h2 headline");
			    _builder.append("</h2>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<h3>");
			    _builder.append("h3 headline");
			    _builder.append("</h3>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<h4>");
			    _builder.append("h4 headline");
			    _builder.append("</h4>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<h5>");
			    _builder.append("h5 headline");
			    _builder.append("</h5>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<h6>");
			    _builder.append("h6 headline");
			    _builder.append("</h6>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("This ");
			    _builder.append("<span style=\"text-decoration: underline;\">");
			    _builder.append("is");
			    _builder.append("</span>");
			    _builder.append(" an ");
			    _builder.append("<a href=\"");_builder.append("http://www.example.org");_builder.append("\">");
			    _builder.append("example url");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("It can span ");
			    _builder.append("<i>");
			    _builder.append("multiple");
			    _builder.append("</i>");
			    _builder.append(" lines.");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("You ");
			    _builder.append("<span style=\"my-custom-css\">");
			    _builder.append("can");
			    _builder.append("</span>");
			    _builder.append(" also include images: ");
			    _builder.append("<img src=\"");_builder.append("http://www.example.org/image.png");_builder.append("\" alt=\"");_builder.append("example image");_builder.append("\" width=\"");_builder.append("150px");_builder.append("\" height=\"");_builder.append("50px");_builder.append("\" />");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("Embed email addresses like ");
			    _builder.append("<a href=\"mailto:");_builder.append("somebody@example.org");_builder.append("\">");
			    _builder.append("this");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("Embed skype links: ");
			    _builder.append("<a href=\"skype:");_builder.append("echo123");_builder.append("?call\">");
			    _builder.append("call echo123");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<div class=\"lundoc-sourcecode\">");
			    _builder.newLine();
			    _builder.append("\t");
			    _builder.append("public static void main(String[] args) {");
			    _builder.newLine();
			    _builder.newLine();
			    _builder.append("\t\t");
			    _builder.append("System.out.println(\"Hello World!\");");
			    _builder.newLine();
			    _builder.newLine();
			    _builder.append("\t");
			    _builder.append("}");
			    _builder.newLine();
			    _builder.newLine();
			    _builder.append("</div>");
			    _builder.newLine();
			    _builder.append("<video width=\"");_builder.append("400px");_builder.append("\" height=\"");_builder.append("300px");_builder.append("\" controls>");_builder.append("<source src=\"");_builder.append("myMovie.mp4");_builder.append("\" type=\"");_builder.append("video/mp4");_builder.append("\" />");
			    _builder.newLine();
			    _builder.append("\t");
			    _builder.append("Your browser does not support HTML5 video.");
			    _builder.newLine();
			    _builder.newLine();
			    _builder.append("</video>");
			    _builder.newLine();
			    _builder.append("<a href=\"#");_builder.append("intro");_builder.append("\">");
			    _builder.append("Link ref to intro chapter");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<a href=\"link/to/");_builder.append("some.view.id");_builder.append("\">");
			    _builder.append("open view xyz");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<a href=\"link/to/");_builder.append("some.process.id");_builder.append("\">");
			    _builder.append("start process xyz");
			    _builder.append("</a>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<table>");
			    _builder.append("<tr>");
			    _builder.append("<td>");
			    _builder.append("a");
			    _builder.append("</td>");
			    _builder.append("<td>");
			    _builder.append("b");
			    _builder.append("</td>");
			    _builder.append("<td>");
			    _builder.append("c");
			    _builder.append("</td>");
			    _builder.append("<td>");
			    _builder.append("d");
			    _builder.append("</td>");
			    _builder.append("</tr>");
			    _builder.append("<tr>");
			    _builder.append("<td>");
			    _builder.append("d");
			    _builder.append("</td>");
			    _builder.append("<td>");
			    _builder.append("e");
			    _builder.append("</td>");
			    _builder.append("<td>");
			    _builder.append("f");
			    _builder.append("</td>");
			    _builder.append("</tr>");
			    _builder.append("</table>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<ul>");
			    _builder.append("<li>");
			    _builder.append("a");
			    _builder.append("</li>");
			    _builder.append("<li>");
			    _builder.append("b");
			    _builder.append("</li>");
			    _builder.append("<li>");
			    _builder.append("c");
			    _builder.append("</li>");
			    _builder.append("</ul>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    _builder.append("<ol>");
			    _builder.append("<li>");
			    _builder.append("a");
			    _builder.append("</li>");
			    _builder.append("<li>");
			    _builder.append("b");
			    _builder.append("</li>");
			    _builder.append("<li>");
			    _builder.append("c");
			    _builder.append("</li>");
			    _builder.append("</ol>");
			    _builder.newLineIfNotEmpty();
			    _builder.newLine();
			    {
			      boolean _lessThan = (2 < 5);
			      if (_lessThan) {
			        _builder.newLine();
			        _builder.append("abc");
			        _builder.newLine();
			        _builder.newLine();
			      } else {
			        boolean _equals = (2 == 5);
			        if (_equals) {
			          _builder.newLine();
			          _builder.append("xyz");
			          _builder.newLine();
			          _builder.newLine();
			        }
			      }
			    }
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