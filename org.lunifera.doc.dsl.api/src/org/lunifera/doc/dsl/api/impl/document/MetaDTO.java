/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.api.impl.document;

import java.util.ArrayList;
import java.util.List;

import org.lunifera.doc.dsl.api.document.IMetaDTO;
import org.lunifera.doc.dsl.api.document.IMetaPojoProperty;

public class MetaDTO implements IMetaDTO {

	private String dtoClass;
	private String description;

	private final List<IMetaPojoProperty> properties = new ArrayList<IMetaPojoProperty>();

	public String getDtoClass() {
		return dtoClass;
	}

	public void setDtoClass(String name) {
		this.dtoClass = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<IMetaPojoProperty> getProperties() {
		return properties;
	}

}
