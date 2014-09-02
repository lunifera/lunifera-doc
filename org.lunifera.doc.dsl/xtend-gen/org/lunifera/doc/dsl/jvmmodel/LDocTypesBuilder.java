package org.lunifera.doc.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.typesystem.InferredTypeIndicator;
import org.lunifera.doc.dsl.api.document.helper.IDocumentAccess;
import org.lunifera.doc.dsl.extensions.ModelExtensions;
import org.lunifera.doc.dsl.luniferadoc.LDocDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocInclude;
import org.lunifera.doc.dsl.luniferadoc.LDocLayouter;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocType;

@SuppressWarnings("all")
public class LDocTypesBuilder extends JvmTypesBuilder {
  @Inject
  private TypeReferences typeReference;
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  @Extension
  private ModelExtensions _modelExtensions;
  
  /**
   * Create field for an included EntityDocument
   */
  public JvmField toIncField(final LDocInclude include, final String name, final LDocLayouter layouter) {
    JvmTypeReference _incTypeReference = this.toIncTypeReference(include);
    return this.toField(layouter, name, _incTypeReference);
  }
  
  /**
   * Create type for an included EntityDocument
   */
  public JvmTypeReference toIncTypeReference(final LDocInclude include) {
    JvmTypeReference _xifexpression = null;
    boolean _isProvided = include.isProvided();
    boolean _not = (!_isProvided);
    if (_not) {
      LDocDocument _document = include.getDocument();
      _xifexpression = this._modelExtensions.toTypeReference(_document);
    } else {
      LDocType _providedType = include.getProvidedType();
      _xifexpression = this._modelExtensions.toTypeReference(_providedType, include);
    }
    return _xifexpression;
  }
  
  public JvmField toAccessField(final LDocNamedDocument doc) {
    JvmField _xblockexpression = null;
    {
      JvmTypeReference _typeForName = this.typeReference.getTypeForName(IDocumentAccess.class, doc, null);
      final JvmField field = this.toField(doc, "docAccess", _typeForName);
      _xblockexpression = field;
    }
    return _xblockexpression;
  }
  
  public JvmOperation toIncludeSetter(final LDocInclude include) {
    JvmOperation _xblockexpression = null;
    {
      boolean _isProvided = include.isProvided();
      boolean _not = (!_isProvided);
      if (_not) {
        return null;
      }
      String _varName = include.getVarName();
      LDocType _providedType = include.getProvidedType();
      JvmTypeReference _typeReference = this._modelExtensions.toTypeReference(_providedType, include);
      _xblockexpression = this.toSetter(include, _varName, _typeReference);
    }
    return _xblockexpression;
  }
  
  public JvmGenericType toDocumentClass(final LDocNamedDocument doc) {
    JvmGenericType _xblockexpression = null;
    {
      String _fqnDocumentClassName = this._modelExtensions.toFqnDocumentClassName(doc);
      final JvmGenericType result = this.createJvmGenericType(doc, _fqnDocumentClassName);
      _xblockexpression = this.<JvmGenericType>associate(doc, result);
    }
    return _xblockexpression;
  }
  
  public JvmOperation toGetter(final EObject sourceElement, final String fieldName, final JvmTypeReference typeRef, final Procedure1<? super JvmOperation> initializer) {
    boolean _or = false;
    boolean _equals = Objects.equal(sourceElement, null);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = Objects.equal(fieldName, null);
      _or = _equals_1;
    }
    if (_or) {
      return null;
    }
    final JvmOperation result = this.typesFactory.createJvmOperation();
    result.setVisibility(JvmVisibility.PUBLIC);
    String prefix = "get";
    boolean _and = false;
    boolean _and_1 = false;
    boolean _and_2 = false;
    boolean _and_3 = false;
    boolean _and_4 = false;
    boolean _notEquals = (!Objects.equal(typeRef, null));
    if (!_notEquals) {
      _and_4 = false;
    } else {
      boolean _eIsProxy = typeRef.eIsProxy();
      boolean _not = (!_eIsProxy);
      _and_4 = _not;
    }
    if (!_and_4) {
      _and_3 = false;
    } else {
      boolean _isInferred = InferredTypeIndicator.isInferred(typeRef);
      boolean _not_1 = (!_isInferred);
      _and_3 = _not_1;
    }
    if (!_and_3) {
      _and_2 = false;
    } else {
      JvmType _type = typeRef.getType();
      boolean _notEquals_1 = (!Objects.equal(_type, null));
      _and_2 = _notEquals_1;
    }
    if (!_and_2) {
      _and_1 = false;
    } else {
      JvmType _type_1 = typeRef.getType();
      boolean _eIsProxy_1 = _type_1.eIsProxy();
      boolean _not_2 = (!_eIsProxy_1);
      _and_1 = _not_2;
    }
    if (!_and_1) {
      _and = false;
    } else {
      JvmType _type_2 = typeRef.getType();
      String _identifier = _type_2.getIdentifier();
      boolean _equals_2 = "boolean".equals(_identifier);
      _and = _equals_2;
    }
    if (_and) {
      prefix = "is";
    }
    String _firstUpper = Strings.toFirstUpper(fieldName);
    String _plus = (prefix + _firstUpper);
    result.setSimpleName(_plus);
    JvmTypeReference _cloneWithProxies = this.cloneWithProxies(typeRef);
    result.setReturnType(_cloneWithProxies);
    this.<JvmOperation>associate(sourceElement, result);
    StringConcatenationClient _client = new StringConcatenationClient() {
      @Override
      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
        _builder.append("return this.");
        _builder.append(fieldName, "");
        _builder.append(";");
      }
    };
    this.setBody(result, _client);
    this.<JvmOperation>initializeSafely(result, initializer);
    return result;
  }
}
