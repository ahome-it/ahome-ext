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
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Single radio field. Radio grouping is handled automatically by the browser if
 * you give each radio in a group the same name.
 * 
 */
public class Radio extends CheckBox {

    private static JavaScriptObject configPrototype;

    private static native void init()/*-{
		var c = new $wnd.Ext.form.field.Radio();
		@com.ait.toolkit.sencha.ext.client.ui.Radio::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return "radio";
    }

    public Radio() {
    }

    public Radio(String label) {
        super(label);
    }

    public Radio(String fieldLabel, String name) {
        super(fieldLabel, name);
    }

    public Radio(JavaScriptObject jsObj) {
        super(jsObj);
    }

    protected native JavaScriptObject create(JavaScriptObject config)/*-{
		return new $wnd.Ext.form.field.Radio(config);
    }-*/;

    /**
     * If this radio is part of a group, it will return the selected value.
     * 
     * @return the group value
     */
    public native String getGroupValue() /*-{
		var rb = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		return rb.getGroupValue();
    }-*/;

    /**
     * A value to initialize this field with.
     * 
     * @param value
     *            the field value
     */
    public void setValue(boolean value) {
        if (!isRendered()) {
            setAttribute("inputValue", value, true);
        } else {
            super.setValue(value);
        }
    }

    public static Radio cast(Component component) {
        return new Radio(component.getOrCreateJsObj());
    }

}
