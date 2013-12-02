/*******************************************************************************
 * Copyright (c) 2013 Loetz KG (Heidelberg), Petra Bierleutgeb and others. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/

package org.lunifera.doc.dsl.api.document;

import java.util.List;

public interface IMetaDTO {

	String getDtoClass();

	void setDtoClass(String dtoClass);

	String getDescription();

	void setDescription(String description);

	List<IDTOProperty> getProperties();

}
