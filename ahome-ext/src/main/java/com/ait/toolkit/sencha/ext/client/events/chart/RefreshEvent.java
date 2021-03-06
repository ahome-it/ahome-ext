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
package com.ait.toolkit.sencha.ext.client.events.chart;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.Chart;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class RefreshEvent extends EventObject {

    public static String EVENT_NAME = Event.REFRESH;

    private Chart chart;

    /**
     * UiBinder implementations
     */
    private static Type<RefreshHandler> TYPE = new Type<RefreshHandler>(EVENT_NAME, null);

    public static Type<RefreshHandler> getType() {
        return TYPE;
    }

    public static Type<RefreshHandler> getAssociatedType() {
        return TYPE;
    }

    public RefreshEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public RefreshEvent(Chart chart, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.chart = chart;
    }

    /**
     * @return the chart
     */
    public Chart getChart() {
        return chart;
    }

}
