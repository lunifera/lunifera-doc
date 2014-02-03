package org.lunifera.doc.dsl.richstring;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.generator.trace.ILocationData;
import org.eclipse.xtext.generator.trace.ITraceURIConverter;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.output.SharedAppendableState;
import org.eclipse.xtext.xbase.compiler.output.TreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

@SuppressWarnings("restriction")
public class LuniferaDocTreeAppendable extends TreeAppendable {

	public LuniferaDocTreeAppendable(ImportManager importManager,
			ITraceURIConverter converter,
			ILocationInFileProvider locationProvider,
			IJvmModelAssociations jvmModelAssociations, EObject source,
			String indentation, String lineSeparator) {
		super(importManager, converter, locationProvider, jvmModelAssociations,
				source, indentation, lineSeparator);
	}

	public LuniferaDocTreeAppendable(SharedAppendableState state,
			ITraceURIConverter converter,
			ILocationInFileProvider locationProvider,
			IJvmModelAssociations jvmModelAssociations, EObject source) {
		super(state, converter, locationProvider, jvmModelAssociations, source);
	}

	public LuniferaDocTreeAppendable(SharedAppendableState state,
			ITraceURIConverter converter,
			ILocationInFileProvider locationProvider,
			IJvmModelAssociations jvmModelAssociations,
			Set<ILocationData> sourceLocations, boolean useForDebugging) {
		super(state, converter, locationProvider, jvmModelAssociations,
				sourceLocations, useForDebugging);
	}

	/**
	 * @since 2.4
	 */
	protected TreeAppendable createChild(SharedAppendableState state,
			ILocationInFileProvider locationProvider,
			IJvmModelAssociations jvmModelAssociations,
			Set<ILocationData> newData, boolean useForDebugging) {
		return new LuniferaDocTreeAppendable(state, getTraceURIConverter(),
				locationProvider, jvmModelAssociations, newData,
				useForDebugging);
	}

	public TreeAppendable newLine() {
		return super.newLine();
	}

}
