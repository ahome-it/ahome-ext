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
package com.ait.toolkit.sencha.ext.client.events.panel;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class FloatEvent extends EventObject {

    public static String EVENT_NAME = Event.FLOAT;

    /**
     * UiBinder implementations
     */
    private static Type<FloatHandler> TYPE = new Type<FloatHandler>(EVENT_NAME, null);

    public static Type<FloatHandler> getType() {
        return TYPE;
    }

    public static Type<FloatHandler> getAssociatedType() {
        return TYPE;
    }

    public FloatEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

}
