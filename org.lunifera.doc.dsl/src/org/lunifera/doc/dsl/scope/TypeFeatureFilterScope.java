package org.lunifera.doc.dsl.scope;

import java.util.ArrayList;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocDtoProperty;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityDocument;
import org.lunifera.doc.dsl.luniferadoc.LDocEntityField;
import org.lunifera.dsl.semantic.common.types.LFeature;
import org.lunifera.dsl.semantic.common.types.LType;
import org.lunifera.dsl.semantic.entity.LBean;
import org.lunifera.dsl.semantic.entity.LBeanFeature;
import org.lunifera.dsl.semantic.entity.LEntity;
import org.lunifera.dsl.semantic.entity.LEntityFeature;

public class TypeFeatureFilterScope extends AbstractScope {
	private final IScope scope;
	private LType type;
	private LDocEntityField field;
	private LDocDtoProperty dtoprop;

	public TypeFeatureFilterScope(LDocEntityField field, IScope scope) {
		super(IScope.NULLSCOPE, true);
		this.scope = scope;
		this.field = field;
		LDocEntityDocument doc = (LDocEntityDocument) field.eContainer();
		type = doc.getModel();
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription desc : scope.getAllElements()) {
			LFeature feature = (LFeature) desc.getEObjectOrProxy();
			feature = (LFeature) EcoreUtil.resolve(feature, field);
			if (feature instanceof LEntityFeature
					|| feature instanceof LBeanFeature) {
				if (type instanceof LEntity) {
					LEntity entity = (LEntity) type;
					if (entity.getAllFeatures().contains(feature)) {
						result.add(desc);
					}
				} else if (type instanceof LBean) {
					LBean bean = (LBean) type;
					if (bean.getAllFeatures().contains(feature)) {
						result.add(desc);
					}
				}
			}
		}

		return result;
	}
}