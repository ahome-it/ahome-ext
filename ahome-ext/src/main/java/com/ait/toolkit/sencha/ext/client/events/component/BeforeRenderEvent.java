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
package com.ait.toolkit.sencha.ext.client.events.component;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class BeforeRenderEvent extends EventObject {

    public static String EVENT_NAME = Event.BEFORE_RENDER;

    private Component source;

    /**
     * UiBinder implementations
     */
    private static Type<BeforeRenderHandler> TYPE = new Type<BeforeRenderHandler>(EVENT_NAME, null);

    public static Type<BeforeRenderHandler> getType() {
        return TYPE;
    }

    public static Type<BeforeRenderHandler> getAssociatedType() {
        return TYPE;
    }

    public BeforeRenderEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public BeforeRenderEvent(Component source, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;

    }

    /**
     * @return the source
     */
    public Component getSource() {
        return source;
    }

}
