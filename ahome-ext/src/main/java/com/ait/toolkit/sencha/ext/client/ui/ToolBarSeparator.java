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
package com.ait.toolkit.sencha.ext.client.ui;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A simple class that adds a vertical separator bar between toolbar items (css
 * class: 'x-toolbar-separator').
 * 
 * @author alainekambi
 * 
 */
public class ToolBarSeparator extends Component {

    private static JavaScriptObject configPrototype;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.TOOLBAR_SEPARATOR.getValue();
    }

    /**
     * Create a new NotificationContainer.
     */
    public ToolBarSeparator() {

    }

    public ToolBarSeparator(JavaScriptObject peer) {
        super(peer);
    }

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.toolbar.Separator(config);
    }-*/;

    public static ToolBarSeparator cast(Component component) {
        return new ToolBarSeparator(component.getOrCreateJsObj());
    }

}
