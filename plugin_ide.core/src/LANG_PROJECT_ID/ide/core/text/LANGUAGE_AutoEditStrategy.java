/*******************************************************************************
 * Copyright (c) 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package LANG_PROJECT_ID.ide.core.text;

import melnorme.lang.ide.core.TextSettings_Actual;
import melnorme.lang.ide.core.text.format.ILangAutoEditsPreferencesAccess;
import melnorme.lang.ide.core.text.format.ILastKeyInfoProvider;
import melnorme.lang.ide.core.text.format.LangAutoEditStrategy;

public class LANGUAGE_AutoEditStrategy extends LangAutoEditStrategy {
	
	public LANGUAGE_AutoEditStrategy(String contentType, ILangAutoEditsPreferencesAccess preferences, 
		ILastKeyInfoProvider lastKeyInfoProvider) {
		super(lastKeyInfoProvider, TextSettings_Actual.PARTITIONING_ID, contentType, preferences);
	}
	
}