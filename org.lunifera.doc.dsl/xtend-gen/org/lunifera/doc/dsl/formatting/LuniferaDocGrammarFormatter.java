package org.lunifera.doc.dsl.formatting;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XCollectionLiteral;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.formatting.BlankLineKey;
import org.eclipse.xtext.xbase.formatting.FormattableDocument;
import org.eclipse.xtext.xbase.formatting.FormattingData;
import org.eclipse.xtext.xbase.formatting.FormattingDataFactory;
import org.eclipse.xtext.xbase.formatting.FormattingDataInit;
import org.eclipse.xtext.xbase.formatting.HiddenLeafAccess;
import org.eclipse.xtext.xbase.formatting.NodeModelAccess;
import org.eclipse.xtext.xbase.formatting.XbaseFormatter2;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.lunifera.doc.dsl.formatting.RichStringFormatter;
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;
import org.lunifera.doc.dsl.luniferadoc.LunDocPackage;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class LuniferaDocGrammarFormatter extends XbaseFormatter2 {
  public final static BlankLineKey blankLinesAfterPackageDecl = new BlankLineKey("blank.lines.after.packagedecl", Integer.valueOf(1));
  
  public final static BlankLineKey blankLinesBetweenImports = new BlankLineKey("blank.lines.between.imports", Integer.valueOf(0));
  
  public final static BlankLineKey blankLinesAfterImports = new BlankLineKey("blank.lines.after.imports", Integer.valueOf(1));
  
  public final static BlankLineKey blankLinesBetweenClasses = new BlankLineKey("blank.lines.between.classes", Integer.valueOf(1));
  
  public final static BlankLineKey blankLinesBeforeFirstMember = new BlankLineKey("blank.lines.before.first.member", Integer.valueOf(0));
  
  public final static BlankLineKey blankLinesAfterLastMember = new BlankLineKey("blank.lines.after.last.member", Integer.valueOf(0));
  
  public final static BlankLineKey blankLinesBetweenFields = new BlankLineKey("blank.lines.between.fields", Integer.valueOf(0));
  
  public final static BlankLineKey blankLinesBetweenFieldsAndMethods = new BlankLineKey("blank.lines.between.fields.and.methods", Integer.valueOf(1));
  
  public final static BlankLineKey blankLinesBetweenMethods = new BlankLineKey("blank.lines.between.methods", Integer.valueOf(1));
  
  public final static BlankLineKey blankLinesBetweenEnumLiterals = new BlankLineKey("blank.lines.between.enum.literals", Integer.valueOf(0));
  
  @Inject
  @Extension
  private NodeModelAccess _nodeModelAccess;
  
  @Inject
  @Extension
  private HiddenLeafAccess _hiddenLeafAccess;
  
  @Inject
  @Extension
  private FormattingDataFactory _formattingDataFactory;
  
  @Inject
  private RichStringFormatter richStringFormatter;
  
  /**
   * Layouter - "General Document"
   */
  protected void _format(final LDocLayouter document, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(document);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(document, "Layouter");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function_1);
    format.operator_add(_append);
    EList<XImportDeclaration> _imports = document.getImports();
    for (final XImportDeclaration imp : _imports) {
      this.format(imp, format);
    }
    EList<LDocInclude> _includes = document.getIncludes();
    for (final LDocInclude inc : _includes) {
      this.format(inc, format);
    }
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(document, "language");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_1, _function_2);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_1 = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_3);
    format.operator_add(_prepend_1);
    ILeafNode _nodeForKeyword_3 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.cfg(LuniferaDocGrammarFormatter.blankLinesAfterImports);
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForKeyword_3, _function_4);
    format.operator_add(_append_2);
    RichString _content = document.getContent();
    this.format(_content, format);
  }
  
  /**
   * Import statements
   */
  protected void _format(final XImportDeclaration imp, final FormattableDocument format) {
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(imp, "import");
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(imp, ";");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForKeyword_1, _function_1);
    format.operator_add(_prepend);
  }
  
  /**
   * Include Statements
   */
  protected void _format(final LDocInclude inc, final FormattableDocument format) {
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(inc, "include");
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function);
    format.operator_add(_append);
    INode _nodeForFeature = this._nodeModelAccess.nodeForFeature(inc, LunDocPackage.Literals.LDOC_INCLUDE__DOCUMENT);
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForFeature, _function_1);
    format.operator_add(_append_1);
    INode _nodeForFeature_1 = this._nodeModelAccess.nodeForFeature(inc, LunDocPackage.Literals.LDOC_INCLUDE__PROVIDED);
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForFeature_1, _function_2);
    format.operator_add(_append_2);
    INode _nodeForFeature_2 = this._nodeModelAccess.nodeForFeature(inc, LunDocPackage.Literals.LDOC_INCLUDE__PROVIDED_TYPE);
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_3 = this._formattingDataFactory.append(_nodeForFeature_2, _function_3);
    format.operator_add(_append_3);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(inc, "as");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_4 = this._formattingDataFactory.append(_nodeForKeyword_1, _function_4);
    format.operator_add(_append_4);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(inc, ";");
    final Procedure1<FormattingDataInit> _function_5 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_5);
    format.operator_add(_prepend);
  }
  
  /**
   * Entity Document
   */
  protected void _format(final LDocEntityDocument document, final FormattableDocument format) {
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(document, "EntityDocument");
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function);
    format.operator_add(_append);
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(document);
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function_1);
    format.operator_add(_prepend);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(document, "covers");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _surround = this._formattingDataFactory.surround(_nodeForKeyword_1, _function_2, _function_3);
    format.operator_add(_surround);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_1 = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_4);
    format.operator_add(_prepend_1);
    ILeafNode _nodeForKeyword_3 = this._nodeModelAccess.nodeForKeyword(document, "language");
    final Procedure1<FormattingDataInit> _function_5 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_3, _function_5);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_4 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_6 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_2 = this._formattingDataFactory.prepend(_nodeForKeyword_4, _function_6);
    format.operator_add(_prepend_2);
    ILeafNode _nodeForKeyword_5 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_7 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.cfg(LuniferaDocGrammarFormatter.blankLinesAfterImports);
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForKeyword_5, _function_7);
    format.operator_add(_append_2);
    ILeafNode _nodeForKeyword_6 = this._nodeModelAccess.nodeForKeyword(document, "description");
    final Procedure1<FormattingDataInit> _function_8 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_3 = this._formattingDataFactory.append(_nodeForKeyword_6, _function_8);
    format.operator_add(_append_3);
    ILeafNode _nodeForKeyword_7 = this._nodeModelAccess.nodeForKeyword(document, "fields");
    final Procedure1<FormattingDataInit> _function_9 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_4 = this._formattingDataFactory.append(_nodeForKeyword_7, _function_9);
    format.operator_add(_append_4);
    RichString _description = document.getDescription();
    this.format(_description, format);
    EList<LDocEntityField> _fields = document.getFields();
    for (final LDocEntityField field : _fields) {
      this.format(field, format);
    }
  }
  
  /**
   * Entity Fields
   */
  protected void _format(final LDocEntityField field, final FormattableDocument format) {
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(field, "field");
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function);
    format.operator_add(_append);
    RichString _description = field.getDescription();
    this.format(_description, format);
  }
  
  /**
   * DTO Document
   */
  protected void _format(final LDocDtoDocument document, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(document);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(document, "DtoDocument");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function_1);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(document, "language");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_1, _function_2);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_1 = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_3);
    format.operator_add(_prepend_1);
    ILeafNode _nodeForKeyword_3 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.cfg(LuniferaDocGrammarFormatter.blankLinesAfterImports);
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForKeyword_3, _function_4);
    format.operator_add(_append_2);
    ILeafNode _nodeForKeyword_4 = this._nodeModelAccess.nodeForKeyword(document, "description");
    final Procedure1<FormattingDataInit> _function_5 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_3 = this._formattingDataFactory.append(_nodeForKeyword_4, _function_5);
    format.operator_add(_append_3);
    ILeafNode _nodeForKeyword_5 = this._nodeModelAccess.nodeForKeyword(document, "properties");
    final Procedure1<FormattingDataInit> _function_6 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_4 = this._formattingDataFactory.append(_nodeForKeyword_5, _function_6);
    format.operator_add(_append_4);
    RichString _description = document.getDescription();
    this.format(_description, format);
    EList<LDocDtoProperty> _fields = document.getFields();
    for (final LDocDtoProperty property : _fields) {
      this.format(property, format);
    }
  }
  
  /**
   * DTO Properties
   */
  protected void _format(final LDocDtoProperty prop, final FormattableDocument format) {
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(prop, "property");
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(prop, "name");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_1, _function_1);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(prop, ";");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_2);
    format.operator_add(_prepend);
    RichString _description = prop.getDescription();
    this.format(_description, format);
  }
  
  /**
   * BPM Process Document
   */
  protected void _format(final LDocBPMProcessDocument document, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(document);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(document, "BPMProcessDocument");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function_1);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(document, "covers");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _surround = this._formattingDataFactory.surround(_nodeForKeyword_1, _function_2, _function_3);
    format.operator_add(_surround);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_1 = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_4);
    format.operator_add(_prepend_1);
    ILeafNode _nodeForKeyword_3 = this._nodeModelAccess.nodeForKeyword(document, "language");
    final Procedure1<FormattingDataInit> _function_5 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_3, _function_5);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_4 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_6 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_2 = this._formattingDataFactory.prepend(_nodeForKeyword_4, _function_6);
    format.operator_add(_prepend_2);
    ILeafNode _nodeForKeyword_5 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_7 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.cfg(LuniferaDocGrammarFormatter.blankLinesAfterImports);
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForKeyword_5, _function_7);
    format.operator_add(_append_2);
    ILeafNode _nodeForKeyword_6 = this._nodeModelAccess.nodeForKeyword(document, "description");
    final Procedure1<FormattingDataInit> _function_8 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_3 = this._formattingDataFactory.append(_nodeForKeyword_6, _function_8);
    format.operator_add(_append_3);
    ILeafNode _nodeForKeyword_7 = this._nodeModelAccess.nodeForKeyword(document, "fields");
    final Procedure1<FormattingDataInit> _function_9 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_4 = this._formattingDataFactory.append(_nodeForKeyword_7, _function_9);
    format.operator_add(_append_4);
    RichString _description = document.getDescription();
    this.format(_description, format);
  }
  
  /**
   * BPM Human Task Document
   */
  protected void _format(final LDocHumanTaskDocument document, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(document);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(document, "BPMHumanTaskDocument");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function_1);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(document, "covers");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _surround = this._formattingDataFactory.surround(_nodeForKeyword_1, _function_2, _function_3);
    format.operator_add(_surround);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_1 = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_4);
    format.operator_add(_prepend_1);
    ILeafNode _nodeForKeyword_3 = this._nodeModelAccess.nodeForKeyword(document, "language");
    final Procedure1<FormattingDataInit> _function_5 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_3, _function_5);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_4 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_6 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_2 = this._formattingDataFactory.prepend(_nodeForKeyword_4, _function_6);
    format.operator_add(_prepend_2);
    ILeafNode _nodeForKeyword_5 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_7 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.cfg(LuniferaDocGrammarFormatter.blankLinesAfterImports);
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForKeyword_5, _function_7);
    format.operator_add(_append_2);
    ILeafNode _nodeForKeyword_6 = this._nodeModelAccess.nodeForKeyword(document, "description");
    final Procedure1<FormattingDataInit> _function_8 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_3 = this._formattingDataFactory.append(_nodeForKeyword_6, _function_8);
    format.operator_add(_append_3);
    ILeafNode _nodeForKeyword_7 = this._nodeModelAccess.nodeForKeyword(document, "fields");
    final Procedure1<FormattingDataInit> _function_9 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_4 = this._formattingDataFactory.append(_nodeForKeyword_7, _function_9);
    format.operator_add(_append_4);
    RichString _description = document.getDescription();
    this.format(_description, format);
  }
  
  /**
   * Vaaclipse View Document
   */
  protected void _format(final LDocViewDocument document, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(document);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(document, "VaaclipseViewDocument");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function_1);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(document, "covers");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _surround = this._formattingDataFactory.surround(_nodeForKeyword_1, _function_2, _function_3);
    format.operator_add(_surround);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_1 = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_4);
    format.operator_add(_prepend_1);
    ILeafNode _nodeForKeyword_3 = this._nodeModelAccess.nodeForKeyword(document, "language");
    final Procedure1<FormattingDataInit> _function_5 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_3, _function_5);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_4 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_6 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_2 = this._formattingDataFactory.prepend(_nodeForKeyword_4, _function_6);
    format.operator_add(_prepend_2);
    ILeafNode _nodeForKeyword_5 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_7 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.cfg(LuniferaDocGrammarFormatter.blankLinesAfterImports);
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForKeyword_5, _function_7);
    format.operator_add(_append_2);
    ILeafNode _nodeForKeyword_6 = this._nodeModelAccess.nodeForKeyword(document, "description");
    final Procedure1<FormattingDataInit> _function_8 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_3 = this._formattingDataFactory.append(_nodeForKeyword_6, _function_8);
    format.operator_add(_append_3);
    ILeafNode _nodeForKeyword_7 = this._nodeModelAccess.nodeForKeyword(document, "fields");
    final Procedure1<FormattingDataInit> _function_9 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_4 = this._formattingDataFactory.append(_nodeForKeyword_7, _function_9);
    format.operator_add(_append_4);
    RichString _description = document.getDescription();
    this.format(_description, format);
  }
  
  /**
   * UI Document
   */
  protected void _format(final LDocUIDocument document, final FormattableDocument format) {
    INode _nodeForEObject = this._nodeModelAccess.nodeForEObject(document);
    final Procedure1<FormattingDataInit> _function = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend = this._formattingDataFactory.prepend(_nodeForEObject, _function);
    format.operator_add(_prepend);
    ILeafNode _nodeForKeyword = this._nodeModelAccess.nodeForKeyword(document, "UIDocument");
    final Procedure1<FormattingDataInit> _function_1 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.increaseIndentation();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append = this._formattingDataFactory.append(_nodeForKeyword, _function_1);
    format.operator_add(_append);
    ILeafNode _nodeForKeyword_1 = this._nodeModelAccess.nodeForKeyword(document, "covers");
    final Procedure1<FormattingDataInit> _function_2 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    final Procedure1<FormattingDataInit> _function_3 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _surround = this._formattingDataFactory.surround(_nodeForKeyword_1, _function_2, _function_3);
    format.operator_add(_surround);
    ILeafNode _nodeForKeyword_2 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_4 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_1 = this._formattingDataFactory.prepend(_nodeForKeyword_2, _function_4);
    format.operator_add(_prepend_1);
    ILeafNode _nodeForKeyword_3 = this._nodeModelAccess.nodeForKeyword(document, "language");
    final Procedure1<FormattingDataInit> _function_5 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_1 = this._formattingDataFactory.append(_nodeForKeyword_3, _function_5);
    format.operator_add(_append_1);
    ILeafNode _nodeForKeyword_4 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_6 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.noSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _prepend_2 = this._formattingDataFactory.prepend(_nodeForKeyword_4, _function_6);
    format.operator_add(_prepend_2);
    ILeafNode _nodeForKeyword_5 = this._nodeModelAccess.nodeForKeyword(document, ";");
    final Procedure1<FormattingDataInit> _function_7 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.cfg(LuniferaDocGrammarFormatter.blankLinesAfterImports);
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_2 = this._formattingDataFactory.append(_nodeForKeyword_5, _function_7);
    format.operator_add(_append_2);
    ILeafNode _nodeForKeyword_6 = this._nodeModelAccess.nodeForKeyword(document, "description");
    final Procedure1<FormattingDataInit> _function_8 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_3 = this._formattingDataFactory.append(_nodeForKeyword_6, _function_8);
    format.operator_add(_append_3);
    ILeafNode _nodeForKeyword_7 = this._nodeModelAccess.nodeForKeyword(document, "fields");
    final Procedure1<FormattingDataInit> _function_9 = new Procedure1<FormattingDataInit>() {
      public void apply(final FormattingDataInit it) {
        it.oneSpace();
      }
    };
    Function1<? super FormattableDocument,? extends Iterable<FormattingData>> _append_4 = this._formattingDataFactory.append(_nodeForKeyword_7, _function_9);
    format.operator_add(_append_4);
    RichString _description = document.getDescription();
    this.format(_description, format);
  }
  
  /**
   * Rich String
   */
  protected void _format(final RichString rs, final FormattableDocument format) {
    final Procedure2<EObject,FormattableDocument> _function = new Procedure2<EObject,FormattableDocument>() {
      public void apply(final EObject obj, final FormattableDocument doc) {
        LuniferaDocGrammarFormatter.this.format(obj, doc);
      }
    };
    final Procedure2<? super EObject,? super FormattableDocument> callback = _function;
    this.richStringFormatter.format(callback, format, rs);
  }
  
  protected void format(final EObject ref, final FormattableDocument document) {
    if (ref instanceof JvmTypeParameter) {
      _format((JvmTypeParameter)ref, document);
      return;
    } else if (ref instanceof JvmFormalParameter) {
      _format((JvmFormalParameter)ref, document);
      return;
    } else if (ref instanceof XAssignment) {
      _format((XAssignment)ref, document);
      return;
    } else if (ref instanceof XBinaryOperation) {
      _format((XBinaryOperation)ref, document);
      return;
    } else if (ref instanceof XDoWhileExpression) {
      _format((XDoWhileExpression)ref, document);
      return;
    } else if (ref instanceof XFeatureCall) {
      _format((XFeatureCall)ref, document);
      return;
    } else if (ref instanceof XMemberFeatureCall) {
      _format((XMemberFeatureCall)ref, document);
      return;
    } else if (ref instanceof XWhileExpression) {
      _format((XWhileExpression)ref, document);
      return;
    } else if (ref instanceof XFunctionTypeRef) {
      _format((XFunctionTypeRef)ref, document);
      return;
    } else if (ref instanceof LDocBPMProcessDocument) {
      _format((LDocBPMProcessDocument)ref, document);
      return;
    } else if (ref instanceof LDocDtoDocument) {
      _format((LDocDtoDocument)ref, document);
      return;
    } else if (ref instanceof LDocEntityDocument) {
      _format((LDocEntityDocument)ref, document);
      return;
    } else if (ref instanceof LDocHumanTaskDocument) {
      _format((LDocHumanTaskDocument)ref, document);
      return;
    } else if (ref instanceof LDocUIDocument) {
      _format((LDocUIDocument)ref, document);
      return;
    } else if (ref instanceof LDocViewDocument) {
      _format((LDocViewDocument)ref, document);
      return;
    } else if (ref instanceof RichString) {
      _format((RichString)ref, document);
      return;
    } else if (ref instanceof JvmGenericArrayTypeReference) {
      _format((JvmGenericArrayTypeReference)ref, document);
      return;
    } else if (ref instanceof JvmParameterizedTypeReference) {
      _format((JvmParameterizedTypeReference)ref, document);
      return;
    } else if (ref instanceof JvmWildcardTypeReference) {
      _format((JvmWildcardTypeReference)ref, document);
      return;
    } else if (ref instanceof XBlockExpression) {
      _format((XBlockExpression)ref, document);
      return;
    } else if (ref instanceof XClosure) {
      _format((XClosure)ref, document);
      return;
    } else if (ref instanceof XCollectionLiteral) {
      _format((XCollectionLiteral)ref, document);
      return;
    } else if (ref instanceof XConstructorCall) {
      _format((XConstructorCall)ref, document);
      return;
    } else if (ref instanceof XForLoopExpression) {
      _format((XForLoopExpression)ref, document);
      return;
    } else if (ref instanceof XIfExpression) {
      _format((XIfExpression)ref, document);
      return;
    } else if (ref instanceof XReturnExpression) {
      _format((XReturnExpression)ref, document);
      return;
    } else if (ref instanceof XSwitchExpression) {
      _format((XSwitchExpression)ref, document);
      return;
    } else if (ref instanceof XThrowExpression) {
      _format((XThrowExpression)ref, document);
      return;
    } else if (ref instanceof XTryCatchFinallyExpression) {
      _format((XTryCatchFinallyExpression)ref, document);
      return;
    } else if (ref instanceof XTypeLiteral) {
      _format((XTypeLiteral)ref, document);
      return;
    } else if (ref instanceof XVariableDeclaration) {
      _format((XVariableDeclaration)ref, document);
      return;
    } else if (ref instanceof XAnnotation) {
      _format((XAnnotation)ref, document);
      return;
    } else if (ref instanceof LDocLayouter) {
      _format((LDocLayouter)ref, document);
      return;
    } else if (ref instanceof JvmTypeConstraint) {
      _format((JvmTypeConstraint)ref, document);
      return;
    } else if (ref instanceof XCatchClause) {
      _format((XCatchClause)ref, document);
      return;
    } else if (ref instanceof XExpression) {
      _format((XExpression)ref, document);
      return;
    } else if (ref instanceof XImportDeclaration) {
      _format((XImportDeclaration)ref, document);
      return;
    } else if (ref instanceof LDocDtoProperty) {
      _format((LDocDtoProperty)ref, document);
      return;
    } else if (ref instanceof LDocEntityField) {
      _format((LDocEntityField)ref, document);
      return;
    } else if (ref instanceof LDocInclude) {
      _format((LDocInclude)ref, document);
      return;
    } else if (ref != null) {
      _format(ref, document);
      return;
    } else if (ref == null) {
      _format((Void)null, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ref, document).toString());
    }
  }
}
