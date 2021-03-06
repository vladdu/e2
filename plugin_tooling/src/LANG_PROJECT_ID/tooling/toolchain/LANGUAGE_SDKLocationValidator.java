/*******************************************************************************
 * Copyright (c) 2015, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package LANG_PROJECT_ID.tooling.toolchain;

import melnorme.lang.tooling.toolchain.ops.SDKLocationValidator;

public class LANGUAGE_SDKLocationValidator extends SDKLocationValidator {
	
	public LANGUAGE_SDKLocationValidator() {
		super("SDK path:");
	}
	
	@Override
	protected String getSDKExecutable_append() {
		return "bin/foobar"; // TODO: LANG 
	}
	
}