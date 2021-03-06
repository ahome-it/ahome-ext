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
 * Slider which supports vertical or horizontal orientation, keyboard
 * adjustments, configurable snapping, axis clicking and animation. Can be added
 * as an item to any container.
 * 
 */
public class Slider extends MultiSlider {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.slider.Single();
		@com.ait.toolkit.sencha.ext.client.ui.Slider::configPrototype = c.initialConfig;
    }-*/;

    public Slider() {
        // init();
    }

    protected Slider(JavaScriptObject obj) {
        super(obj);
    }

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.SLIDER.getValue();
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.slider.Single(config);
    }-*/;

    /**
     * Creates a new Slider from the given component
     * 
     * @param component
     *            , the component to cast from
     * @return, a new Slider from the component
     * 
     */
    public static Slider cast(Component component) {
        return new Slider(component.getOrCreateJsObj());
    }

}
