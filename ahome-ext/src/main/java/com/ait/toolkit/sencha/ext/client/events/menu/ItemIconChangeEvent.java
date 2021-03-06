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
package com.ait.toolkit.sencha.ext.client.events.menu;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.MenuItem;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

/**
 * Events that s fired when a button is clicked
 */
public class ItemIconChangeEvent extends EventObject {

    public static String EVENT_NAME = Event.ICON_CHANGE;

    private MenuItem source;
    private String oldIcon;
    private String newIcon;

    /**
     * UiBinder implementations
     */
    private static Type<ItemIconChangeHandler> TYPE = new Type<ItemIconChangeHandler>(EVENT_NAME, null);

    public static Type<ItemIconChangeHandler> getType() {
        return TYPE;
    }

    public static Type<ItemIconChangeHandler> getAssociatedType() {
        return TYPE;
    }

    public ItemIconChangeEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public ItemIconChangeEvent(MenuItem source, String oldIcon, String newIcon, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.oldIcon = oldIcon;
        this.newIcon = newIcon;
    }

    /**
     * @return the source
     */
    public MenuItem getSource() {
        return source;
    }

    /**
     * @return the oldIcon
     */
    public String getOldIcon() {
        return oldIcon;
    }

    /**
     * @return the newIcon
     */
    public String getNewIcon() {
        return newIcon;
    }

}
