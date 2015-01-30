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
package com.ait.toolkit.sencha.ext.client.grid.column;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.events.grid.ActionHandler;
import com.ait.toolkit.sencha.ext.client.tip.QuickTipManager;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Icon object for an {@link ActionGridColumn}
 */
public class Action extends JsObject {

    public Action() {
        jsObj = JsoHelper.createObject();
    }

    /**
     * The url of an image to display as the clickable element in the column.
     * 
     * @param value
     */
    public void setIcon(String value) {
        JsoHelper.setAttribute(getJsObj(), "icon", value);
    }

    /**
     * A handler called when the icon is clicked.
     */
    public void setHandler(ActionHandler handler) {
        JsoHelper.setAttribute(getJsObj(), "handler", createHandler(handler));
    }

    /**
     * The url of an image to display as the clickable element in the column.
     * 
     * @param value
     */
    public void setToolTip(String value) {
        JsoHelper.setAttribute(getJsObj(), "toolTip", value);
    }

    /**
     * If true, the action will not respond to click events, and will be
     * displayed semi-opaque. {@link QuickTipManager} must have been
     * initialized.
     * 
     * @param value
     */
    public void setDisabled(String value) {
        JsoHelper.setAttribute(getJsObj(), "disabled", value);
    }

    private native JavaScriptObject createHandler(ActionHandler handler)/*-{
		return function(grid, rowIndex, colIndex) {
			var gridPanel = @com.ait.toolkit.sencha.ext.client.ui.GridPanel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(grid);
			return renderer.@com.ait.toolkit.sencha.ext.client.events.grid.ActionHandler::onAction(Lcom/ait/toolkit/sencha/ext/client/ui/GridPanel;II)(grindPanel,rowIndex,colIndex);
		};
    }-*/;

}
