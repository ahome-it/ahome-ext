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
package com.ait.toolkit.sencha.ext.client.state;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Provider implementation which saves and retrieves state via the HTML5
 * localStorage object. If the browser does not support local storage, there
 * will be no attempt to read the state. Before creating this class, a check
 * should be made to Ext.supports.LocalStorage.
 * 
 */
public class LocalStorageProvider extends Provider {

    public LocalStorageProvider() {
        jsObj = create();
    }

    private native JavaScriptObject create() /*-{
		return new $wnd.Ext.state.LocalStorageProvider();
    }-*/;

}
