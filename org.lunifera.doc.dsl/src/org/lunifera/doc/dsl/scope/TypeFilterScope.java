package org.lunifera.doc.dsl.scope;

import java.util.ArrayList;

import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractScope;
import org.lunifera.dsl.semantic.common.types.LType;
import org.lunifera.dsl.semantic.entity.LBean;
import org.lunifera.dsl.semantic.entity.LEntity;
import org.lunifera.dsl.semantic.entity.LEntityFeature;

public class TypeFilterScope extends AbstractScope {
	private final IScope scope;

	public TypeFilterScope(IScope scope) {
		super(IScope.NULLSCOPE, true);
		this.scope = scope;
	}

	@Override
	protected Iterable<IEObjectDescription> getAllLocalElements() {
		ArrayList<IEObjectDescription> result = new ArrayList<IEObjectDescription>();
		for (IEObjectDescription desc : scope.getAllElements()) {
			LType type = (LType) desc.getEObjectOrProxy();
			if (type instanceof LEntity || type instanceof LBean) {
				result.add(desc);
			}
		}

		return result;
	}
}