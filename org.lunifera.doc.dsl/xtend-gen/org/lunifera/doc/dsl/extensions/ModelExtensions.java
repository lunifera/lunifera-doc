package org.lunifera.doc.dsl.extensions;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.lunifera.doc.dsl.api.document.IBPMProcessDocument;
import org.lunifera.doc.dsl.api.document.IDtoDocument;
import org.lunifera.doc.dsl.api.document.IEntityDocument;
import org.lunifera.doc.dsl.api.document.IHumanTaskDocument;
import org.lunifera.doc.dsl.api.document.IUiDocument;
import org.lunifera.doc.dsl.api.document.IViewDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocBPMProcessDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.doc.dsl.luniferadoc.LDocHumanTaskDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocNamedDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocType;
import org.lunifera.doc.dsl.luniferadoc.LDocUIDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocViewDocument;
import org.lunifera.dsl.semantic.common.types.LFeature;
import org.lunifera.dsl.semantic.entity.LBean;
import org.lunifera.dsl.semantic.entity.LEntity;

@SuppressWarnings("all")
public class ModelExtensions {
  @Inject
  private TypeReferences typeReferences;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private IJvmModelAssociator associator;
  
  public boolean addAnno(final EObject target, final JvmAnnotationTarget jvmType, final JvmAnnotationReference anno) {
    EList<JvmAnnotationReference> _annotations = jvmType.getAnnotations();
    return _annotations.add(anno);
  }
  
  /**
   * Creates a string annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final int intValue) {
    final JvmIntAnnotationValue value = this.typesFactory.createJvmIntAnnotationValue();
    EList<JvmAnnotationValue> _values = annRef.getValues();
    _values.add(value);
    JvmType _findDeclaredType = this.typeReferences.findDeclaredType(Integer.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<Integer> _values_1 = value.getValues();
    _values_1.add(Integer.valueOf(intValue));
    return value;
  }
  
  /**
   * Creates a string annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final JvmAnnotationReference annotationValue) {
    final JvmAnnotationAnnotationValue value = this.typesFactory.createJvmAnnotationAnnotationValue();
    EList<JvmAnnotationValue> _values = annRef.getValues();
    _values.add(value);
    JvmType _findDeclaredType = this.typeReferences.findDeclaredType(JvmAnnotationReference.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<JvmAnnotationReference> _values_1 = value.getValues();
    _values_1.add(annotationValue);
    return value;
  }
  
  /**
   * Creates a string annotation value and adds it the the given annotation reference
   */
  protected JvmAnnotationValue _addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final JvmAnnotationReference... annotationValues) {
    final JvmAnnotationAnnotationValue value = this.typesFactory.createJvmAnnotationAnnotationValue();
    EList<JvmAnnotationValue> _values = annRef.getValues();
    _values.add(value);
    JvmType _findDeclaredType = this.typeReferences.findDeclaredType(JvmAnnotationReference.class, context);
    final JvmDeclaredType declaredType = ((JvmDeclaredType) _findDeclaredType);
    final JvmOperation op = this.typesFactory.createJvmOperation();
    op.setSimpleName(name);
    op.setDeclaringType(declaredType);
    value.setOperation(op);
    EList<JvmAnnotationReference> _values_1 = value.getValues();
    CollectionExtensions.<JvmAnnotationReference>addAll(_values_1, annotationValues);
    return value;
  }
  
  public String toLanguage(final LDocNamedDocument doc) {
    String _xifexpression = null;
    String _language = doc.getLanguage();
    boolean _notEquals = (!Objects.equal(_language, null));
    if (_notEquals) {
      _xifexpression = doc.getLanguage();
    } else {
      _xifexpression = "en";
    }
    return _xifexpression;
  }
  
  /**
   * Create type for an included EntityDocument
   */
  public String toURIString(final LDocNamedDocument entityDoc) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"lundoc://");
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entityDoc);
    String _string = _fullyQualifiedName.toString();
    _builder.append(_string, "");
    _builder.append("?lang=");
    String _language = this.toLanguage(entityDoc);
    _builder.append(_language, "");
    _builder.append("\"");
    return _builder.toString();
  }
  
  public String toFqnDocumentClassName(final LDocNamedDocument sourceElement) {
    String _name = sourceElement.getName();
    final QualifiedName fqn = QualifiedName.create(_name);
    QualifiedName _skipLast = fqn.skipLast(1);
    String _lastSegment = fqn.getLastSegment();
    String _plus = (_lastSegment + "_");
    String _language = this.toLanguage(sourceElement);
    String _plus_1 = (_plus + _language);
    QualifiedName _append = _skipLast.append(_plus_1);
    final String resultName = _append.toString();
    return resultName.toString();
  }
  
  public String toFqnDocumentIndexName(final LDocNamedDocument sourceElement) {
    return this.toFqnDocumentClassName(sourceElement);
  }
  
  public JvmTypeReference toTypeReference(final LDocType type, final EObject context) {
    switch (type) {
      case DTO:
        return this.typeReferences.getTypeForName(IDtoDocument.class, context, null);
      case ENTITY:
        return this.typeReferences.getTypeForName(IEntityDocument.class, context, null);
      default:
        break;
    }
    return null;
  }
  
  /**
   * Create field for an included BPMDocument
   */
  protected JvmTypeReference _toTypeReference(final LDocNamedDocument doc) {
    return this.typeReferences.getTypeForName(IBPMProcessDocument.class, doc, null);
  }
  
  /**
   * Create field for an included EntityDocument
   */
  protected JvmTypeReference _toTypeReference(final LDocEntityDocument doc) {
    String _fqnDocumentClassName = this.toFqnDocumentClassName(doc);
    String _string = _fqnDocumentClassName.toString();
    return this.typeReferences.getTypeForName(_string, doc, null);
  }
  
  /**
   * Create field for an included DTODocument
   */
  protected JvmTypeReference _toTypeReference(final LDocDtoDocument doc) {
    return this.typeReferences.getTypeForName(IDtoDocument.class, doc, null);
  }
  
  /**
   * Create field for an included BPMDocument
   */
  protected JvmTypeReference _toTypeReference(final LDocBPMProcessDocument doc) {
    return this.typeReferences.getTypeForName(IBPMProcessDocument.class, doc, null);
  }
  
  /**
   * Create field for an included BPMTaskDocument
   */
  protected JvmTypeReference _toTypeReference(final LDocHumanTaskDocument doc) {
    return this.typeReferences.getTypeForName(IHumanTaskDocument.class, doc, null);
  }
  
  /**
   * Create field for an included VaaclipseViewDocument
   */
  protected JvmTypeReference _toTypeReference(final LDocViewDocument doc) {
    return this.typeReferences.getTypeForName(IViewDocument.class, doc, null);
  }
  
  /**
   * Create field for an included UIDocument
   */
  protected JvmTypeReference _toTypeReference(final LDocUIDocument doc) {
    return this.typeReferences.getTypeForName(IUiDocument.class, doc, null);
  }
  
  protected String _toFqnModelName(final LEntity entity) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(entity);
    return _fullyQualifiedName.toString();
  }
  
  protected String _toFqnModelName(final LBean bean) {
    QualifiedName _fullyQualifiedName = this._iQualifiedNameProvider.getFullyQualifiedName(bean);
    return _fullyQualifiedName.toString();
  }
  
  public String toName(final LDocEntityField field) {
    LFeature _typeField = field.getTypeField();
    return _typeField.getName();
  }
  
  public String toFieldName(final LDocEntityField field) {
    LFeature _typeField = field.getTypeField();
    String _name = _typeField.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("fieldFor" + _firstUpper);
  }
  
  public String toFieldGetterName(final LDocEntityField field) {
    LFeature _typeField = field.getTypeField();
    String _name = _typeField.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    return ("fieldFor" + _firstUpper);
  }
  
  public JvmAnnotationValue addAnnAttr(final JvmAnnotationReference annRef, final EObject context, final String name, final Object intValue) {
    if (intValue instanceof Integer) {
      return _addAnnAttr(annRef, context, name, (Integer)intValue);
    } else if (intValue instanceof JvmAnnotationReference) {
      return _addAnnAttr(annRef, context, name, (JvmAnnotationReference)intValue);
    } else if (intValue instanceof JvmAnnotationReference[]) {
      return _addAnnAttr(annRef, context, name, (JvmAnnotationReference[])intValue);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(annRef, context, name, intValue).toString());
    }
  }
  
  public JvmTypeReference toTypeReference(final LDocNamedDocument doc) {
    if (doc instanceof LDocBPMProcessDocument) {
      return _toTypeReference((LDocBPMProcessDocument)doc);
    } else if (doc instanceof LDocDtoDocument) {
      return _toTypeReference((LDocDtoDocument)doc);
    } else if (doc instanceof LDocEntityDocument) {
      return _toTypeReference((LDocEntityDocument)doc);
    } else if (doc instanceof LDocHumanTaskDocument) {
      return _toTypeReference((LDocHumanTaskDocument)doc);
    } else if (doc instanceof LDocUIDocument) {
      return _toTypeReference((LDocUIDocument)doc);
    } else if (doc instanceof LDocViewDocument) {
      return _toTypeReference((LDocViewDocument)doc);
    } else if (doc != null) {
      return _toTypeReference(doc);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(doc).toString());
    }
  }
  
  public String toFqnModelName(final EObject bean) {
    if (bean instanceof LBean) {
      return _toFqnModelName((LBean)bean);
    } else if (bean instanceof LEntity) {
      return _toFqnModelName((LEntity)bean);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(bean).toString());
    }
  }
}
