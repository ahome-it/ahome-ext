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
package com.ait.toolkit.sencha.ext.client.events.editor;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.Editor;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class BeforeCompleteEvent extends EventObject {

    public static String EVENT_NAME = Event.BEFORE_COMPLETE;

    private Editor source;
    private Object value;
    private Object oldValue;

    /**
     * UiBinder implementations
     */
    private static Type<BeforeCompleteHandler> TYPE = new Type<BeforeCompleteHandler>(EVENT_NAME, null);

    public static Type<BeforeCompleteHandler> getType() {
        return TYPE;
    }

    public static Type<BeforeCompleteHandler> getAssociatedType() {
        return TYPE;
    }

    public BeforeCompleteEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public BeforeCompleteEvent(Editor source, Object value, Object oldValue, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.value = value;
        this.oldValue = oldValue;
    }

    /**
     * @return the source
     */
    public Editor getSource() {
        return source;
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @return the oldValue
     */
    public Object getOldValue() {
        return oldValue;
    }

}
