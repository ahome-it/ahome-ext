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
package com.ait.toolkit.sencha.ext.client.events.slider;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.MultiSlider;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class BeforeChangeEvent extends EventObject {

    public static String EVENT_NAME = Event.BEFORE_CHANGE;

    private MultiSlider source;
    private double oldValue;
    private double newValue;

    /**
     * UiBinder implementations
     */
    private static Type<BeforeChangeHandler> TYPE = new Type<BeforeChangeHandler>(EVENT_NAME, null);

    public static Type<BeforeChangeHandler> getType() {
        return TYPE;
    }

    public static Type<BeforeChangeHandler> getAssociatedType() {
        return TYPE;
    }

    public BeforeChangeEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public BeforeChangeEvent(MultiSlider source, double oldValue, double newValue, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    /**
     * @return the source
     */
    public MultiSlider getSource() {
        return source;
    }

    /**
     * @return the oldValue
     */
    public double getOldValue() {
        return oldValue;
    }

    /**
     * @return the newValue
     */
    public double getNewValue() {
        return newValue;
    }

}
