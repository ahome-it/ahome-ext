/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.ext.client.core;

import com.ait.toolkit.application.client.ClientFactory;
import com.ait.toolkit.core.client.Function;

/**
 * Ext4j Client class that injects Ext JS resources on demand. This class should
 * be used when implementing multi device/platform applications.Subclass should
 * override the <code>getJsPath()</code> and<code>getCssPath()</code>
 */
public abstract class Ext4jClient implements ClientFactory {

	@Override
	public void createClient() {
		new Ext4jInjector(getCssPath(), getJsPath()).inject(new Function() {
			@Override
			public void execute() {
				createUI();
			}
		});
	}

	/**
	 * Return the path to the Ext JS File
	 */
	public abstract String getJsPath();

	/**
	 * Return the path to the Ext JS CSS File
	 */
	public abstract String getCssPath();

	/**
	 * Creates the User Interface
	 */
	public abstract void createUI();

}
