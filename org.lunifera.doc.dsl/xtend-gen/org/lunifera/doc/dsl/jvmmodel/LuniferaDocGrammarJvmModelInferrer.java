/**
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 */
package org.lunifera.doc.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.net.URI;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.doc.dsl.api.document.IBPMProcessDocument;
import org.lunifera.doc.dsl.api.document.IDtoDocument;
import org.lunifera.doc.dsl.api.document.IDtoField;
import org.lunifera.doc.dsl.api.document.IEntityDocument;
import org.lunifera.doc.dsl.api.document.IEntityField;
import org.lunifera.doc.dsl.api.document.IHumanTaskDocument;
import org.lunifera.doc.dsl.api.document.IUiDocument;
import org.lunifera.doc.dsl.api.document.IViewDocument;
import org.lunifera.doc.dsl.api.layout.ILayouter;
import org.lunifera.doc.dsl.extensions.ModelExtensions;
import org.lunifera.doc.dsl.jvmmodel.LDocTypesBuilder;
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;
import org.lunifera.doc.dsl.luniferadoc.richstring.RichString;
import org.lunifera.dsl.semantic.common.types.LFeature;
import org.lunifera.dsl.semantic.common.types.LType;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class LuniferaDocGrammarJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  @Extension
  private LDocTypesBuilder _lDocTypesBuilder;
  
  @Inject
  @Extension
  private ModelExtensions _modelExtensions;
  
  @Inject
  private TypeReferences typeReference;
  
  @Inject
  private ImportManager importManager;
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private IJvmModelAssociator associator;
  
  /**
   * Infer method for GeneralDocument elements
   */
  protected void _infer(final LDocLayouter layouter, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    JvmGenericType _documentClass = this._lDocTypesBuilder.toDocumentClass(layouter);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_documentClass);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeForName = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(ILayouter.class, layouter, null);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        String _documentation = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.getDocumentation(layouter);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members = it.getMembers();
        JvmField _accessField = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toAccessField(layouter);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members, _accessField);
        EList<LDocInclude> _includes = layouter.getIncludes();
        for (final LDocInclude inc : _includes) {
          EList<JvmMember> _members_1 = it.getMembers();
          String _varName = inc.getVarName();
          JvmField _incField = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toIncField(inc, _varName, layouter);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _incField);
        }
        EList<JvmMember> _members_2 = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                {
                  EList<LDocInclude> _includes = layouter.getIncludes();
                  final Function1<LDocInclude, Boolean> _function = new Function1<LDocInclude, Boolean>() {
                    public Boolean apply(final LDocInclude it) {
                      boolean _isProvided = it.isProvided();
                      return Boolean.valueOf((!_isProvided));
                    }
                  };
                  Iterable<LDocInclude> _filter = IterableExtensions.<LDocInclude>filter(_includes, _function);
                  for(final LDocInclude inc : _filter) {
                    _builder.append("this.");
                    String _varName = inc.getVarName();
                    _builder.append(_varName, "");
                    _builder.append(" = (");
                    JvmTypeReference _incTypeReference = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toIncTypeReference(inc);
                    String _simpleName = _incTypeReference.getSimpleName();
                    _builder.append(_simpleName, "");
                    _builder.append(") docAccess.wrapDocument(");
                    LDocDocument _document = inc.getDocument();
                    String _uRIString = LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toURIString(_document);
                    _builder.append(_uRIString, "");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                  }
                }
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toConstructor(layouter, _function);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
        EList<LDocInclude> _includes_1 = layouter.getIncludes();
        final Function1<LDocInclude, Boolean> _function_1 = new Function1<LDocInclude, Boolean>() {
          public Boolean apply(final LDocInclude it) {
            return Boolean.valueOf(it.isProvided());
          }
        };
        Iterable<LDocInclude> _filter = IterableExtensions.<LDocInclude>filter(_includes_1, _function_1);
        for (final LDocInclude inc_1 : _filter) {
          EList<JvmMember> _members_3 = it.getMembers();
          JvmOperation _includeSetter = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toIncludeSetter(inc_1);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_3, _includeSetter);
        }
        final RichString richString = layouter.getContent();
        EList<JvmMember> _members_4 = it.getMembers();
        JvmTypeReference _inferredType = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.inferredType();
        final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            LuniferaDocGrammarJvmModelInferrer.this.associator.associatePrimary(richString, it);
            LuniferaDocGrammarJvmModelInferrer.this.associator.associateLogicalContainer(richString, it);
            it.setVisibility(JvmVisibility.PUBLIC);
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, richString);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Serializes layout using the contained documents as input.");
            _builder.newLine();
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _method = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toMethod(layouter, "serialize", _inferredType, _function_2);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_4, _method);
      }
    };
    _accept.initializeLater(_function);
  }
  
  /**
   * Infer method for DTODocument elements
   */
  protected void _infer(final LDocDtoDocument dtoDocument, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = dtoDocument.getName();
    JvmGenericType _class = this._lDocTypesBuilder.toClass(dtoDocument, _name);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeForName = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IDtoDocument.class, dtoDocument, null);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        String _documentation = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.getDocumentation(dtoDocument);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _documentation);
        EList<LDocDtoProperty> _fields = dtoDocument.getFields();
        for (final LDocDtoProperty prop : _fields) {
          EList<JvmMember> _members = it.getMembers();
          JvmGenericType _innerClass = LuniferaDocGrammarJvmModelInferrer.this.toInnerClass(prop, dtoDocument);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmGenericType>operator_add(_members, _innerClass);
        }
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeForName_1 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, dtoDocument, null);
        JvmField _field = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "name", _typeForName_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field);
        EList<JvmMember> _members_2 = it.getMembers();
        RichString _description = dtoDocument.getDescription();
        JvmTypeReference _typeForName_2 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, dtoDocument, null);
        JvmField _field_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(_description, "description", _typeForName_2);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_2, _field_1);
        EList<JvmMember> _members_3 = it.getMembers();
        JvmTypeReference _newTypeRef = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.newTypeRef(it, "org.lunifera.doc.dsl.api.document.IDTOProperty");
        JvmTypeReference _newTypeRef_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.newTypeRef(it, "java.util.List", _newTypeRef);
        JvmField _field_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(dtoDocument, "fields", _newTypeRef_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_3, _field_2);
        EList<JvmMember> _members_4 = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.name = \"");
                String _name = dtoDocument.getName();
                _builder.append(_name, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.description = serializeDescription().toString();");
                _builder.newLine();
                _builder.append("this.fields = new java.util.ArrayList<IDTOProperty>();");
                _builder.newLine();
                {
                  EList<LDocDtoProperty> _fields = dtoDocument.getFields();
                  boolean _notEquals = (!Objects.equal(_fields, null));
                  if (_notEquals) {
                    {
                      EList<LDocDtoProperty> _fields_1 = dtoDocument.getFields();
                      for(final LDocDtoProperty prop : _fields_1) {
                        _builder.append("this.fields.add(new ");
                        String _name_1 = prop.getName();
                        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
                        _builder.append(_firstUpper, "");
                        _builder.append("());");
                        _builder.newLineIfNotEmpty();
                      }
                    }
                  }
                }
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toConstructor(dtoDocument, _function);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_4, _constructor);
        final JvmOperation serializeDescriptionOperation = LuniferaDocGrammarJvmModelInferrer.this.typesFactory.createJvmOperation();
        RichString _description_1 = dtoDocument.getDescription();
        boolean _notEquals = (!Objects.equal(_description_1, null));
        if (_notEquals) {
          final RichString descriptionRichString = dtoDocument.getDescription();
          LuniferaDocGrammarJvmModelInferrer.this.associator.associatePrimary(descriptionRichString, serializeDescriptionOperation);
          serializeDescriptionOperation.setSimpleName("serializeDescription");
          serializeDescriptionOperation.setVisibility(JvmVisibility.PUBLIC);
          JvmTypeReference _inferredType = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.inferredType();
          serializeDescriptionOperation.setReturnType(_inferredType);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(serializeDescriptionOperation, descriptionRichString);
          LuniferaDocGrammarJvmModelInferrer.this.associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation);
        } else {
        }
        EList<JvmMember> _members_5 = it.getMembers();
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_5, serializeDescriptionOperation);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeForName_3 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, dtoDocument, null);
        JvmOperation _getter = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "name", _typeForName_3);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_6, _getter);
        EList<JvmMember> _members_7 = it.getMembers();
        JvmTypeReference _typeForName_4 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, dtoDocument, null);
        JvmOperation _getter_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "dtoClass", _typeForName_4);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, _getter_1);
        EList<JvmMember> _members_8 = it.getMembers();
        JvmTypeReference _typeForName_5 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, dtoDocument, null);
        final Procedure1<JvmOperation> _function_1 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return ");
                String _simpleName = serializeDescriptionOperation.getSimpleName();
                _builder.append(_simpleName, "");
                _builder.append("().toString();");
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
          }
        };
        JvmOperation _method = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toMethod(it, "getDescription", _typeForName_5, _function_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_8, _method);
        EList<JvmMember> _members_9 = it.getMembers();
        JvmTypeReference _newTypeRef_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.newTypeRef(it, "org.lunifera.doc.dsl.api.document.IDTOProperty");
        JvmTypeReference _newTypeRef_3 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.newTypeRef(it, "java.util.List", _newTypeRef_2);
        JvmOperation _getter_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "fields", "fields", _newTypeRef_3);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_9, _getter_2);
      }
    };
    _accept.initializeLater(_function);
  }
  
  /**
   * Infer method for EntityDocument elements
   */
  protected void _infer(final LDocEntityDocument entityDocument, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    JvmGenericType _documentClass = this._lDocTypesBuilder.toDocumentClass(entityDocument);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_documentClass);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeForName = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IEntityDocument.class, entityDocument, null);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        EList<JvmMember> _members = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
          }
        };
        JvmConstructor _constructor = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toConstructor(entityDocument, _function);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
        String _documentation = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.getDocumentation(entityDocument);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeForName_1 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, entityDocument, null);
        final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setFinal(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("\"");
                String _name = entityDocument.getName();
                _builder.append(_name, "");
                _builder.append("\"");
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setInitializer(it, _client);
          }
        };
        JvmField _field = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "name", _typeForName_1, _function_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field);
        EList<JvmMember> _members_2 = it.getMembers();
        JvmTypeReference _typeForName_2 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, entityDocument, null);
        final Procedure1<JvmField> _function_2 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setFinal(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("\"");
                LType _model = entityDocument.getModel();
                String _fqnModelName = null;
                if (_model!=null) {
                  _fqnModelName=LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toFqnModelName(_model);
                }
                _builder.append(_fqnModelName, "");
                _builder.append("\"");
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setInitializer(it, _client);
          }
        };
        JvmField _field_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "entityName", _typeForName_2, _function_2);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_2, _field_1);
        EList<JvmMember> _members_3 = it.getMembers();
        JvmTypeReference _typeForName_3 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(URI.class, entityDocument, null);
        final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setFinal(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("URI.create(");
                String _uRIString = LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toURIString(entityDocument);
                _builder.append(_uRIString, "");
                _builder.append(")");
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setInitializer(it, _client);
          }
        };
        JvmField _field_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "uri", _typeForName_3, _function_3);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_3, _field_2);
        EList<JvmMember> _members_4 = it.getMembers();
        JvmTypeReference _typeForName_4 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, entityDocument, null);
        final Procedure1<JvmField> _function_4 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
            it.setFinal(true);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("serializeDescription().toString()");
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setInitializer(it, _client);
          }
        };
        JvmField _field_3 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "description", _typeForName_4, _function_4);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_4, _field_3);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeForName_5 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IEntityField.class, entityDocument, null);
        JvmTypeReference _newTypeRef = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.newTypeRef(entityDocument, List.class, _typeForName_5);
        final Procedure1<JvmField> _function_5 = new Procedure1<JvmField>() {
          public void apply(final JvmField it) {
          }
        };
        JvmField _field_4 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "fields", _newTypeRef, _function_5);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_5, _field_4);
        EList<LDocEntityField> _fields = entityDocument.getFields();
        for (final LDocEntityField field : _fields) {
          EList<JvmMember> _members_6 = it.getMembers();
          String _fieldName = LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toFieldName(field);
          JvmTypeReference _typeForName_6 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IEntityField.class, entityDocument, null);
          final Procedure1<JvmField> _function_6 = new Procedure1<JvmField>() {
            public void apply(final JvmField it) {
            }
          };
          JvmField _field_5 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, _fieldName, _typeForName_6, _function_6);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_6, _field_5);
        }
        EList<JvmMember> _members_7 = it.getMembers();
        JvmTypeReference _typeForName_7 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(Void.TYPE, entityDocument, null);
        final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            it.setVisibility(JvmVisibility.PROTECTED);
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("if (this.fields != null) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("return;");
                _builder.newLine();
                _builder.append("}");
                _builder.newLine();
                _builder.newLine();
                _builder.append("synchronized (this) {");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("if (this.fields != null) {");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("return;");
                _builder.newLine();
                _builder.append("\t");
                _builder.append("}");
                _builder.newLine();
                _builder.newLine();
                _builder.append("\t");
                _builder.append("this.fields = new java.util.ArrayList<IEntityField>();");
                _builder.newLine();
                {
                  EList<LDocEntityField> _fields = entityDocument.getFields();
                  for(final LDocEntityField field : _fields) {
                    _builder.append("\t");
                    _builder.append("this.");
                    String _fieldName = LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toFieldName(field);
                    _builder.append(_fieldName, "\t");
                    _builder.append(" = new ");
                    LFeature _typeField = field.getTypeField();
                    String _name = _typeField.getName();
                    String _firstUpper = StringExtensions.toFirstUpper(_name);
                    _builder.append(_firstUpper, "\t");
                    _builder.append("();");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.append("this.fields.add(this.");
                    String _fieldName_1 = LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toFieldName(field);
                    _builder.append(_fieldName_1, "\t");
                    _builder.append(");");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t");
                    _builder.newLine();
                  }
                }
                _builder.append("}");
                _builder.newLine();
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("This method is used for lazy loading of fields.");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _method = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toMethod(entityDocument, "ensureFields", _typeForName_7, _function_7);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, _method);
        EList<JvmMember> _members_8 = it.getMembers();
        JvmTypeReference _inferredType = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.inferredType();
        final Procedure1<JvmOperation> _function_8 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            RichString _description = entityDocument.getDescription();
            boolean _notEquals = (!Objects.equal(_description, null));
            if (_notEquals) {
              final RichString descriptionRichString = entityDocument.getDescription();
              LuniferaDocGrammarJvmModelInferrer.this.associator.associatePrimary(descriptionRichString, it);
              LuniferaDocGrammarJvmModelInferrer.this.associator.associateLogicalContainer(descriptionRichString, it);
              it.setVisibility(JvmVisibility.PROTECTED);
              LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, descriptionRichString);
            } else {
              StringConcatenationClient _client = new StringConcatenationClient() {
                @Override
                protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                  _builder.append("return \"\";");
                }
              };
              LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
            }
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Serializes the description of the document. The description is prepared as a RichString, so serialization is required.");
            _builder.newLine();
            _builder.newLine();
            _builder.append("@return the serialized description");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _method_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toMethod(entityDocument, "serializeDescription", _inferredType, _function_8);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_8, _method_1);
        EList<JvmMember> _members_9 = it.getMembers();
        JvmTypeReference _typeForName_8 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, entityDocument, null);
        final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns the name of the document.");
            _builder.newLine();
            _builder.append("@return name");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _getter = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "name", _typeForName_8, _function_9);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_9, _getter);
        EList<JvmMember> _members_10 = it.getMembers();
        JvmTypeReference _typeForName_9 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(URI.class, entityDocument, null);
        final Procedure1<JvmOperation> _function_10 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns the URI of the document. Each document is defined by a unique URI. So URI\'s are used to load documents.<p>");
            _builder.newLine();
            _builder.newLine();
            _builder.append("URI\'s follow the pattern:<br>");
            _builder.newLine();
            _builder.append("lundoc://{documentType}/{name of document}?language={language}<p>");
            _builder.newLine();
            _builder.newLine();
            _builder.append("For instance:<br>");
            _builder.newLine();
            _builder.append("lundoc://entity/org.lunifera.carstore.Item/language=en");
            _builder.newLine();
            _builder.newLine();
            _builder.append("@return The unique URI of the document");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _getter_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "uri", _typeForName_9, _function_10);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_10, _getter_1);
        EList<JvmMember> _members_11 = it.getMembers();
        JvmTypeReference _typeForName_10 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, entityDocument, null);
        final Procedure1<JvmOperation> _function_11 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns the name of the documented entity.");
            _builder.newLine();
            _builder.append("@return name of the entity");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _getter_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "entityName", _typeForName_10, _function_11);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_11, _getter_2);
        EList<JvmMember> _members_12 = it.getMembers();
        JvmTypeReference _typeForName_11 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(URI.class, entityDocument, null);
        final Procedure1<JvmOperation> _function_12 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("return URI.create(\"lunentity://");
                LType _model = entityDocument.getModel();
                String _fqnModelName = LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toFqnModelName(_model);
                _builder.append(_fqnModelName, "");
                _builder.append("\");");
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns the URI of the entity that is documented by this document.");
            _builder.newLine();
            _builder.newLine();
            _builder.append("@return the URI of the entity");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _getter_3 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "entityURI", _typeForName_11, _function_12);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_12, _getter_3);
        EList<JvmMember> _members_13 = it.getMembers();
        JvmTypeReference _typeForName_12 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, entityDocument, null);
        final Procedure1<JvmOperation> _function_13 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns the description of the document.");
            _builder.newLine();
            _builder.append("@return description");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _getter_4 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "description", _typeForName_12, _function_13);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_13, _getter_4);
        EList<JvmMember> _members_14 = it.getMembers();
        JvmTypeReference _typeForName_13 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IEntityField.class, entityDocument, null);
        JvmTypeReference _newTypeRef_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.newTypeRef(entityDocument, 
          List.class, _typeForName_13);
        final Procedure1<JvmOperation> _function_14 = new Procedure1<JvmOperation>() {
          public void apply(final JvmOperation it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("// ensure that fields are initialized");
                _builder.newLine();
                _builder.append("ensureFields();");
                _builder.newLine();
                _builder.newLine();
                _builder.append("return java.util.Collections.unmodifiableList(fields);");
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Returns the fields for the document.");
            _builder.newLine();
            _builder.newLine();
            _builder.append("@return an unmodifieable list of fields");
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _builder.toString());
          }
        };
        JvmOperation _getter_5 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "fields", _newTypeRef_1, _function_14);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_14, _getter_5);
        EList<LDocEntityField> _fields_1 = entityDocument.getFields();
        for (final LDocEntityField field_1 : _fields_1) {
          EList<JvmMember> _members_15 = it.getMembers();
          String _fieldGetterName = LuniferaDocGrammarJvmModelInferrer.this._modelExtensions.toFieldGetterName(field_1);
          JvmTypeReference _typeForName_14 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IEntityField.class, entityDocument, null);
          final Procedure1<JvmOperation> _function_15 = new Procedure1<JvmOperation>() {
            public void apply(final JvmOperation it) {
            }
          };
          JvmOperation _getter_6 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, _fieldGetterName, _typeForName_14, _function_15);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_15, _getter_6);
        }
        EList<LDocEntityField> _fields_2 = entityDocument.getFields();
        boolean _notEquals = (!Objects.equal(_fields_2, null));
        if (_notEquals) {
          EList<LDocEntityField> _fields_3 = entityDocument.getFields();
          for (final LDocEntityField field_2 : _fields_3) {
            EList<JvmMember> _members_16 = it.getMembers();
            JvmGenericType _innerClass = LuniferaDocGrammarJvmModelInferrer.this.toInnerClass(field_2, entityDocument);
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmGenericType>operator_add(_members_16, _innerClass);
          }
        }
      }
    };
    _accept.initializeLater(_function);
  }
  
  /**
   * Infer method for BPMProcessDocument elements
   */
  protected void _infer(final LDocBPMProcessDocument processDocument, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = processDocument.getName();
    JvmGenericType _class = this._lDocTypesBuilder.toClass(processDocument, _name);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeForName = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IBPMProcessDocument.class, processDocument, null);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        String _documentation = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.getDocumentation(processDocument);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeForName_1 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, processDocument, null);
        JvmField _field = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "name", _typeForName_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeForName_2 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, processDocument, null);
        JvmField _field_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "process", _typeForName_2);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        RichString _description = processDocument.getDescription();
        JvmTypeReference _typeForName_3 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, processDocument, null);
        JvmField _field_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(_description, "description", _typeForName_3);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.name = \"");
                String _name = processDocument.getName();
                _builder.append(_name, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.process = \"");
                String _process = processDocument.getProcess();
                _builder.append(_process, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.description = serializeDescription().toString();");
                _builder.newLine();
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toConstructor(processDocument, _function);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor);
        final JvmOperation serializeDescriptionOperation = LuniferaDocGrammarJvmModelInferrer.this.typesFactory.createJvmOperation();
        RichString _description_1 = processDocument.getDescription();
        boolean _notEquals = (!Objects.equal(_description_1, null));
        if (_notEquals) {
          final RichString descriptionRichString = processDocument.getDescription();
          LuniferaDocGrammarJvmModelInferrer.this.associator.associatePrimary(descriptionRichString, serializeDescriptionOperation);
          serializeDescriptionOperation.setSimpleName("serializeDescription");
          serializeDescriptionOperation.setVisibility(JvmVisibility.PUBLIC);
          JvmTypeReference _inferredType = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.inferredType();
          serializeDescriptionOperation.setReturnType(_inferredType);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(serializeDescriptionOperation, descriptionRichString);
          LuniferaDocGrammarJvmModelInferrer.this.associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation);
        } else {
        }
        EList<JvmMember> _members_4 = it.getMembers();
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_4, serializeDescriptionOperation);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeForName_4 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, processDocument, null);
        JvmOperation _getter = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "name", _typeForName_4);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_5, _getter);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeForName_5 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, processDocument, null);
        JvmOperation _getter_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "process", _typeForName_5);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_6, _getter_1);
        EList<JvmMember> _members_7 = it.getMembers();
        RichString _description_2 = processDocument.getDescription();
        JvmTypeReference _typeForName_6 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, processDocument, null);
        JvmOperation _getter_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(_description_2, 
          "description", _typeForName_6);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, _getter_2);
      }
    };
    _accept.initializeLater(_function);
  }
  
  /**
   * Infer method for BPMHumanTaskDocument elements
   */
  protected void _infer(final LDocHumanTaskDocument taskDocument, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = taskDocument.getName();
    JvmGenericType _class = this._lDocTypesBuilder.toClass(taskDocument, _name);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeForName = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IHumanTaskDocument.class, taskDocument, null);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        String _documentation = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.getDocumentation(taskDocument);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeForName_1 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, taskDocument, null);
        JvmField _field = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "name", _typeForName_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeForName_2 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, taskDocument, null);
        JvmField _field_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "task", _typeForName_2);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        RichString _description = taskDocument.getDescription();
        JvmTypeReference _typeForName_3 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, taskDocument, null);
        JvmField _field_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(_description, "description", _typeForName_3);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.name = \"");
                String _name = taskDocument.getName();
                _builder.append(_name, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.task = \"");
                String _task = taskDocument.getTask();
                _builder.append(_task, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.description = serializeDescription().toString();");
                _builder.newLine();
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toConstructor(taskDocument, _function);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor);
        final JvmOperation serializeDescriptionOperation = LuniferaDocGrammarJvmModelInferrer.this.typesFactory.createJvmOperation();
        RichString _description_1 = taskDocument.getDescription();
        boolean _notEquals = (!Objects.equal(_description_1, null));
        if (_notEquals) {
          final RichString descriptionRichString = taskDocument.getDescription();
          LuniferaDocGrammarJvmModelInferrer.this.associator.associatePrimary(descriptionRichString, serializeDescriptionOperation);
          serializeDescriptionOperation.setSimpleName("serializeDescription");
          serializeDescriptionOperation.setVisibility(JvmVisibility.PUBLIC);
          JvmTypeReference _inferredType = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.inferredType();
          serializeDescriptionOperation.setReturnType(_inferredType);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(serializeDescriptionOperation, descriptionRichString);
          LuniferaDocGrammarJvmModelInferrer.this.associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation);
        } else {
        }
        EList<JvmMember> _members_4 = it.getMembers();
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_4, serializeDescriptionOperation);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeForName_4 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, taskDocument, null);
        JvmOperation _getter = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "name", _typeForName_4);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_5, _getter);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeForName_5 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, taskDocument, null);
        JvmOperation _getter_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "task", _typeForName_5);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_6, _getter_1);
        EList<JvmMember> _members_7 = it.getMembers();
        RichString _description_2 = taskDocument.getDescription();
        JvmTypeReference _typeForName_6 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, taskDocument, null);
        JvmOperation _getter_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(_description_2, 
          "description", _typeForName_6);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, _getter_2);
      }
    };
    _accept.initializeLater(_function);
  }
  
  /**
   * Infer method for BPMHumanTaskDocument elements
   */
  protected void _infer(final LDocViewDocument viewDocument, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = viewDocument.getName();
    JvmGenericType _class = this._lDocTypesBuilder.toClass(viewDocument, _name);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeForName = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IViewDocument.class, viewDocument, null);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        String _documentation = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.getDocumentation(viewDocument);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeForName_1 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, viewDocument, null);
        JvmField _field = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "name", _typeForName_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeForName_2 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, viewDocument, null);
        JvmField _field_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "view", _typeForName_2);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        RichString _description = viewDocument.getDescription();
        JvmTypeReference _typeForName_3 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, viewDocument, null);
        JvmField _field_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(_description, "description", _typeForName_3);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.name = \"");
                String _name = viewDocument.getName();
                _builder.append(_name, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.view = \"");
                String _view = viewDocument.getView();
                _builder.append(_view, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.description = serializeDescription().toString();");
                _builder.newLine();
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toConstructor(viewDocument, _function);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor);
        final JvmOperation serializeDescriptionOperation = LuniferaDocGrammarJvmModelInferrer.this.typesFactory.createJvmOperation();
        RichString _description_1 = viewDocument.getDescription();
        boolean _notEquals = (!Objects.equal(_description_1, null));
        if (_notEquals) {
          final RichString descriptionRichString = viewDocument.getDescription();
          LuniferaDocGrammarJvmModelInferrer.this.associator.associatePrimary(descriptionRichString, serializeDescriptionOperation);
          serializeDescriptionOperation.setSimpleName("serializeDescription");
          serializeDescriptionOperation.setVisibility(JvmVisibility.PUBLIC);
          JvmTypeReference _inferredType = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.inferredType();
          serializeDescriptionOperation.setReturnType(_inferredType);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(serializeDescriptionOperation, descriptionRichString);
          LuniferaDocGrammarJvmModelInferrer.this.associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation);
        } else {
        }
        EList<JvmMember> _members_4 = it.getMembers();
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_4, serializeDescriptionOperation);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeForName_4 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, viewDocument, null);
        JvmOperation _getter = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "name", _typeForName_4);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_5, _getter);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeForName_5 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, viewDocument, null);
        JvmOperation _getter_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "view", _typeForName_5);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_6, _getter_1);
        EList<JvmMember> _members_7 = it.getMembers();
        RichString _description_2 = viewDocument.getDescription();
        JvmTypeReference _typeForName_6 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, viewDocument, null);
        JvmOperation _getter_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(_description_2, 
          "description", _typeForName_6);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, _getter_2);
      }
    };
    _accept.initializeLater(_function);
  }
  
  /**
   * Infer method for BPMHumanTaskDocument elements
   */
  protected void _infer(final LDocUIDocument uiDocument, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = uiDocument.getName();
    JvmGenericType _class = this._lDocTypesBuilder.toClass(uiDocument, _name);
    IJvmDeclaredTypeAcceptor.IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(_class);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      public void apply(final JvmGenericType it) {
        EList<JvmTypeReference> _superTypes = it.getSuperTypes();
        JvmTypeReference _typeForName = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(IUiDocument.class, uiDocument, null);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
        String _documentation = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.getDocumentation(uiDocument);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setDocumentation(it, _documentation);
        EList<JvmMember> _members = it.getMembers();
        JvmTypeReference _typeForName_1 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, uiDocument, null);
        JvmField _field = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "name", _typeForName_1);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members, _field);
        EList<JvmMember> _members_1 = it.getMembers();
        JvmTypeReference _typeForName_2 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, uiDocument, null);
        JvmField _field_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(it, "ui", _typeForName_2);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
        EList<JvmMember> _members_2 = it.getMembers();
        RichString _description = uiDocument.getDescription();
        JvmTypeReference _typeForName_3 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, uiDocument, null);
        JvmField _field_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toField(_description, "description", _typeForName_3);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
        EList<JvmMember> _members_3 = it.getMembers();
        final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
          public void apply(final JvmConstructor it) {
            StringConcatenationClient _client = new StringConcatenationClient() {
              @Override
              protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                _builder.append("this.name = \"");
                String _name = uiDocument.getName();
                _builder.append(_name, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.ui = \"");
                String _ui = uiDocument.getUi();
                _builder.append(_ui, "");
                _builder.append("\";");
                _builder.newLineIfNotEmpty();
                _builder.append("this.description = serializeDescription().toString();");
                _builder.newLine();
              }
            };
            LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
          }
        };
        JvmConstructor _constructor = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toConstructor(uiDocument, _function);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_3, _constructor);
        final JvmOperation serializeDescriptionOperation = LuniferaDocGrammarJvmModelInferrer.this.typesFactory.createJvmOperation();
        RichString _description_1 = uiDocument.getDescription();
        boolean _notEquals = (!Objects.equal(_description_1, null));
        if (_notEquals) {
          final RichString descriptionRichString = uiDocument.getDescription();
          LuniferaDocGrammarJvmModelInferrer.this.associator.associatePrimary(descriptionRichString, serializeDescriptionOperation);
          serializeDescriptionOperation.setSimpleName("serializeDescription");
          serializeDescriptionOperation.setVisibility(JvmVisibility.PUBLIC);
          JvmTypeReference _inferredType = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.inferredType();
          serializeDescriptionOperation.setReturnType(_inferredType);
          LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(serializeDescriptionOperation, descriptionRichString);
          LuniferaDocGrammarJvmModelInferrer.this.associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation);
        } else {
        }
        EList<JvmMember> _members_4 = it.getMembers();
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_4, serializeDescriptionOperation);
        EList<JvmMember> _members_5 = it.getMembers();
        JvmTypeReference _typeForName_4 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, uiDocument, null);
        JvmOperation _getter = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "name", _typeForName_4);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_5, _getter);
        EList<JvmMember> _members_6 = it.getMembers();
        JvmTypeReference _typeForName_5 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, uiDocument, null);
        JvmOperation _getter_1 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(it, "ui", _typeForName_5);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_6, _getter_1);
        EList<JvmMember> _members_7 = it.getMembers();
        RichString _description_2 = uiDocument.getDescription();
        JvmTypeReference _typeForName_6 = LuniferaDocGrammarJvmModelInferrer.this.typeReference.getTypeForName(String.class, uiDocument, null);
        JvmOperation _getter_2 = LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.toGetter(_description_2, 
          "description", _typeForName_6);
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, _getter_2);
      }
    };
    _accept.initializeLater(_function);
  }
  
  /**
   * Generate inner class for DTOProperty
   */
  protected JvmGenericType _toInnerClass(final LDocDtoProperty dtoProperty, final LDocDtoDocument parentDoc) {
    String _name = dtoProperty.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    final JvmGenericType propClass = this._lDocTypesBuilder.toClass(dtoProperty, _firstUpper);
    EList<JvmTypeReference> _superTypes = propClass.getSuperTypes();
    JvmTypeReference _typeForName = this.typeReference.getTypeForName(IDtoField.class, parentDoc, null);
    this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
    EList<JvmMember> _members = propClass.getMembers();
    JvmTypeReference _typeForName_1 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmField _field = this._lDocTypesBuilder.toField(dtoProperty, "name", _typeForName_1);
    this._lDocTypesBuilder.<JvmField>operator_add(_members, _field);
    EList<JvmMember> _members_1 = propClass.getMembers();
    JvmTypeReference _typeForName_2 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmField _field_1 = this._lDocTypesBuilder.toField(dtoProperty, "description", _typeForName_2);
    this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
    EList<JvmMember> _members_2 = propClass.getMembers();
    final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
      public void apply(final JvmConstructor it) {
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("this.name = \"");
            String _name = dtoProperty.getName();
            _builder.append(_name, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("this.description = serializeDescription().toString();");
            _builder.newLine();
          }
        };
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
      }
    };
    JvmConstructor _constructor = this._lDocTypesBuilder.toConstructor(parentDoc, _function);
    this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_2, _constructor);
    final JvmOperation serializeDescriptionOperation = this.typesFactory.createJvmOperation();
    RichString _description = dtoProperty.getDescription();
    boolean _notEquals = (!Objects.equal(_description, null));
    if (_notEquals) {
      final RichString descriptionRichString = dtoProperty.getDescription();
      this.associator.associatePrimary(descriptionRichString, serializeDescriptionOperation);
      serializeDescriptionOperation.setSimpleName("serializeDescription");
      serializeDescriptionOperation.setVisibility(JvmVisibility.PUBLIC);
      JvmTypeReference _inferredType = this._lDocTypesBuilder.inferredType();
      serializeDescriptionOperation.setReturnType(_inferredType);
      this._lDocTypesBuilder.setBody(serializeDescriptionOperation, descriptionRichString);
      this.associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation);
      EList<JvmMember> _members_3 = propClass.getMembers();
      this._lDocTypesBuilder.<JvmOperation>operator_add(_members_3, serializeDescriptionOperation);
    } else {
    }
    EList<JvmMember> _members_4 = propClass.getMembers();
    JvmTypeReference _typeForName_3 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmOperation _getter = this._lDocTypesBuilder.toGetter(dtoProperty, "name", _typeForName_3);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_4, _getter);
    EList<JvmMember> _members_5 = propClass.getMembers();
    JvmTypeReference _typeForName_4 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmOperation _setter = this._lDocTypesBuilder.toSetter(dtoProperty, "name", _typeForName_4);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_5, _setter);
    EList<JvmMember> _members_6 = propClass.getMembers();
    JvmTypeReference _typeForName_5 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmOperation _getter_1 = this._lDocTypesBuilder.toGetter(dtoProperty, "description", _typeForName_5);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_6, _getter_1);
    EList<JvmMember> _members_7 = propClass.getMembers();
    JvmTypeReference _typeForName_6 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmOperation _setter_1 = this._lDocTypesBuilder.toSetter(dtoProperty, "description", _typeForName_6);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, _setter_1);
    return propClass;
  }
  
  /**
   * Generate inner class for EntityField
   */
  protected JvmGenericType _toInnerClass(final LDocEntityField entityField, final LDocEntityDocument parentDoc) {
    LFeature _typeField = entityField.getTypeField();
    String _name = _typeField.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    final JvmGenericType propClass = this._lDocTypesBuilder.toClass(entityField, _firstUpper);
    EList<JvmTypeReference> _superTypes = propClass.getSuperTypes();
    JvmTypeReference _typeForName = this.typeReference.getTypeForName(IEntityField.class, parentDoc, null);
    this._lDocTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeForName);
    EList<JvmMember> _members = propClass.getMembers();
    JvmTypeReference _typeForName_1 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmField _field = this._lDocTypesBuilder.toField(entityField, "name", _typeForName_1);
    this._lDocTypesBuilder.<JvmField>operator_add(_members, _field);
    EList<JvmMember> _members_1 = propClass.getMembers();
    JvmTypeReference _typeForName_2 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmField _field_1 = this._lDocTypesBuilder.toField(entityField, "type", _typeForName_2);
    this._lDocTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
    EList<JvmMember> _members_2 = propClass.getMembers();
    JvmTypeReference _typeForName_3 = this.typeReference.getTypeForName(Integer.TYPE, parentDoc, null);
    JvmField _field_2 = this._lDocTypesBuilder.toField(entityField, "length", _typeForName_3);
    this._lDocTypesBuilder.<JvmField>operator_add(_members_2, _field_2);
    EList<JvmMember> _members_3 = propClass.getMembers();
    JvmTypeReference _typeForName_4 = this.typeReference.getTypeForName(Boolean.TYPE, parentDoc, null);
    JvmField _field_3 = this._lDocTypesBuilder.toField(entityField, "primaryKey", _typeForName_4);
    this._lDocTypesBuilder.<JvmField>operator_add(_members_3, _field_3);
    EList<JvmMember> _members_4 = propClass.getMembers();
    JvmTypeReference _typeForName_5 = this.typeReference.getTypeForName(Boolean.TYPE, parentDoc, null);
    JvmField _field_4 = this._lDocTypesBuilder.toField(entityField, "nullable", _typeForName_5);
    this._lDocTypesBuilder.<JvmField>operator_add(_members_4, _field_4);
    EList<JvmMember> _members_5 = propClass.getMembers();
    JvmTypeReference _typeForName_6 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmField _field_5 = this._lDocTypesBuilder.toField(entityField, "description", _typeForName_6);
    this._lDocTypesBuilder.<JvmField>operator_add(_members_5, _field_5);
    EList<JvmMember> _members_6 = propClass.getMembers();
    final Procedure1<JvmConstructor> _function = new Procedure1<JvmConstructor>() {
      public void apply(final JvmConstructor it) {
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("this.name = \"");
            LFeature _typeField = entityField.getTypeField();
            String _name = _typeField.getName();
            _builder.append(_name, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.append("this.description = serializeDescription().toString();");
            _builder.newLine();
          }
        };
        LuniferaDocGrammarJvmModelInferrer.this._lDocTypesBuilder.setBody(it, _client);
      }
    };
    JvmConstructor _constructor = this._lDocTypesBuilder.toConstructor(parentDoc, _function);
    this._lDocTypesBuilder.<JvmConstructor>operator_add(_members_6, _constructor);
    final JvmOperation serializeDescriptionOperation = this.typesFactory.createJvmOperation();
    RichString _description = entityField.getDescription();
    boolean _notEquals = (!Objects.equal(_description, null));
    if (_notEquals) {
      final RichString descriptionRichString = entityField.getDescription();
      this.associator.associatePrimary(descriptionRichString, serializeDescriptionOperation);
      serializeDescriptionOperation.setSimpleName("serializeDescription");
      serializeDescriptionOperation.setVisibility(JvmVisibility.PUBLIC);
      JvmTypeReference _inferredType = this._lDocTypesBuilder.inferredType();
      serializeDescriptionOperation.setReturnType(_inferredType);
      this._lDocTypesBuilder.setBody(serializeDescriptionOperation, descriptionRichString);
      this.associator.associateLogicalContainer(descriptionRichString, serializeDescriptionOperation);
      EList<JvmMember> _members_7 = propClass.getMembers();
      this._lDocTypesBuilder.<JvmOperation>operator_add(_members_7, serializeDescriptionOperation);
    } else {
    }
    EList<JvmMember> _members_8 = propClass.getMembers();
    JvmTypeReference _typeForName_7 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmOperation _getter = this._lDocTypesBuilder.toGetter(entityField, "name", _typeForName_7);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_8, _getter);
    EList<JvmMember> _members_9 = propClass.getMembers();
    JvmTypeReference _typeForName_8 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmOperation _getter_1 = this._lDocTypesBuilder.toGetter(entityField, "type", _typeForName_8);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_9, _getter_1);
    EList<JvmMember> _members_10 = propClass.getMembers();
    JvmTypeReference _typeForName_9 = this.typeReference.getTypeForName(Integer.TYPE, parentDoc, null);
    JvmOperation _getter_2 = this._lDocTypesBuilder.toGetter(entityField, "length", _typeForName_9);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_10, _getter_2);
    EList<JvmMember> _members_11 = propClass.getMembers();
    JvmTypeReference _typeForName_10 = this.typeReference.getTypeForName(Boolean.TYPE, parentDoc, null);
    JvmOperation _getter_3 = this._lDocTypesBuilder.toGetter(entityField, "primaryKey", _typeForName_10);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_11, _getter_3);
    EList<JvmMember> _members_12 = propClass.getMembers();
    JvmTypeReference _typeForName_11 = this.typeReference.getTypeForName(Boolean.TYPE, parentDoc, null);
    JvmOperation _getter_4 = this._lDocTypesBuilder.toGetter(entityField, "nullable", _typeForName_11);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_12, _getter_4);
    EList<JvmMember> _members_13 = propClass.getMembers();
    JvmTypeReference _typeForName_12 = this.typeReference.getTypeForName(String.class, parentDoc, null);
    JvmOperation _getter_5 = this._lDocTypesBuilder.toGetter(entityField, "description", _typeForName_12);
    this._lDocTypesBuilder.<JvmOperation>operator_add(_members_13, _getter_5);
    return propClass;
  }
  
  public void infer(final EObject processDocument, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (processDocument instanceof LDocBPMProcessDocument) {
      _infer((LDocBPMProcessDocument)processDocument, acceptor, isPreIndexingPhase);
      return;
    } else if (processDocument instanceof LDocDtoDocument) {
      _infer((LDocDtoDocument)processDocument, acceptor, isPreIndexingPhase);
      return;
    } else if (processDocument instanceof LDocEntityDocument) {
      _infer((LDocEntityDocument)processDocument, acceptor, isPreIndexingPhase);
      return;
    } else if (processDocument instanceof LDocHumanTaskDocument) {
      _infer((LDocHumanTaskDocument)processDocument, acceptor, isPreIndexingPhase);
      return;
    } else if (processDocument instanceof LDocUIDocument) {
      _infer((LDocUIDocument)processDocument, acceptor, isPreIndexingPhase);
      return;
    } else if (processDocument instanceof LDocViewDocument) {
      _infer((LDocViewDocument)processDocument, acceptor, isPreIndexingPhase);
      return;
    } else if (processDocument instanceof LDocLayouter) {
      _infer((LDocLayouter)processDocument, acceptor, isPreIndexingPhase);
      return;
    } else if (processDocument != null) {
      _infer(processDocument, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(processDocument, acceptor, isPreIndexingPhase).toString());
    }
  }
  
  public JvmGenericType toInnerClass(final EObject dtoProperty, final LDocDocument parentDoc) {
    if (dtoProperty instanceof LDocDtoProperty
         && parentDoc instanceof LDocDtoDocument) {
      return _toInnerClass((LDocDtoProperty)dtoProperty, (LDocDtoDocument)parentDoc);
    } else if (dtoProperty instanceof LDocEntityField
         && parentDoc instanceof LDocEntityDocument) {
      return _toInnerClass((LDocEntityField)dtoProperty, (LDocEntityDocument)parentDoc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(dtoProperty, parentDoc).toString());
    }
  }
}
