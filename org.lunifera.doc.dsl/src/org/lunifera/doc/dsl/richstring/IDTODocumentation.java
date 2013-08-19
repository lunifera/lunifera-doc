/*******************************************************************************
 * Copyright (c) 2013 Lunifera GmbH, Petra Bierleutgeb and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.lunifera.doc.dsl.richstring;

import org.lunifera.doc.dsl.api.IMetaPojo;

public interface IDTODocumentation {

	void setIt(IMetaPojo dto);

	String serialize();

}
