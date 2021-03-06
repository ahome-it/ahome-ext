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
package com.ait.toolkit.sencha.ext.client.events.view;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.DataView;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class UnHighlightItemEvent extends EventObject {

    public static String EVENT_NAME = Event.UNHIGHLIGHT_ITEM;

    private DataView view;
    private ExtElement element;

    /**
     * UiBinder implementations
     */
    private static Type<UnHighlightItemHandler> TYPE = new Type<UnHighlightItemHandler>(EVENT_NAME, null);

    public static Type<UnHighlightItemHandler> getType() {
        return TYPE;
    }

    public static Type<UnHighlightItemHandler> getAssociatedType() {
        return TYPE;
    }

    public UnHighlightItemEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public UnHighlightItemEvent(DataView view, ExtElement element, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.view = view;
        this.element = element;

    }

    /**
     * @return the view
     */
    public DataView getView() {
        return view;
    }

    /**
     * @return the element
     */
    public ExtElement getElement() {
        return element;
    }

}
