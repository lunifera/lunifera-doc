package org.lunifera.doc.dsl.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.trace.ITraceURIConverter;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.lunifera.doc.dsl.richstring.LuniferaDocTreeAppendable;

@SuppressWarnings("all")
public class LuniferaJvmModelGenerator extends JvmModelGenerator {
  @Inject
  private ILocationInFileProvider locationProvider;
  
  @Inject
  private IJvmModelAssociations jvmModelAssociations;
  
  @Inject
  private ITraceURIConverter converter;
  
  public TreeAppendable createAppendable(final EObject context, final ImportManager importManager, final GeneratorConfig config) {
    final LuniferaDocTreeAppendable appendable = new LuniferaDocTreeAppendable(importManager, this.converter, this.locationProvider, this.jvmModelAssociations, context, 
      "  ", "\n");
    final JvmGenericType type = this.containerType(context);
    boolean _notEquals = (!Objects.equal(type, null));
    if (_notEquals) {
      JvmGenericType _containerType = this.containerType(context);
      appendable.declareVariable(_containerType, "this");
      JvmGenericType _containerType_1 = this.containerType(context);
      final JvmTypeReference superType = _containerType_1.getExtendedClass();
      boolean _notEquals_1 = (!Objects.equal(superType, null));
      if (_notEquals_1) {
        JvmType _type = superType.getType();
        appendable.declareVariable(_type, "super");
      }
    }
    return appendable;
  }
}
