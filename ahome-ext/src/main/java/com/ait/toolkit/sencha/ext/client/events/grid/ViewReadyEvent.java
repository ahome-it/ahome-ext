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
package com.ait.toolkit.sencha.ext.client.events.grid;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.TablePanel;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ViewReadyEvent extends EventObject {

    public static String EVENT_NAME = Event.VIEW_READY;

    private TablePanel source;

    /**
     * UiBinder implementations
     */
    private static Type<ViewReadyHandler> TYPE = new Type<ViewReadyHandler>(EVENT_NAME, null);

    public static Type<ViewReadyHandler> getType() {
        return TYPE;
    }

    public static Type<ViewReadyHandler> getAssociatedType() {
        return TYPE;
    }

    public ViewReadyEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public ViewReadyEvent(TablePanel source, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;

    }

    /**
     * @return the source
     */
    public TablePanel getSource() {
        return source;
    }

}
