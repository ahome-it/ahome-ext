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
import com.ait.toolkit.sencha.ext.client.events.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A specialized SplitButton that contains a menu of CheckItem elements. The
 * button automatically cycles through each menu item on click, raising the
 * button's change event (or calling the button's changeHandler function, if
 * supplied) for the active menu item. Clicking on the arrow section of the
 * button displays the dropdown menu just like a normal SplitButton
 * 
 */
public class CycleButton extends SplitButton {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.button.Cycle({
			menu : {}
		});
		@com.ait.toolkit.sencha.ext.client.ui.CycleButton::configPrototype = c.initialConfig;
    }-*/;

    public CycleButton() {
        // init();
    }

    public CycleButton(JavaScriptObject obj) {
        super(obj);
    }

    public CycleButton(String text) {
        this();
        setText(text);
    }

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.CYCLE.getValue();
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		config.menu = {};
		return new $wnd.Ext.button.Cycle(config);
    }-*/;

    /**
     * This is normally called internally on button click, but can be called
     * externally to advance the button's active item programmatically to the
     * next one in the menu. If the current item is the last one in the menu the
     * active item will be set to the first item in the menu.
     */
    public native void toggleSelected() /*-{
		var cycleButton = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		cycleButton.toggleSelected();
    }-*/;

    public void setShowText(boolean value) {
        setAttribute("showText", value, true);
    }

    public void setPrependText(String value) {
        setAttribute("prependText", value, true);
    }

    /**
     * /** Assign a button menu.
     * 
     * @param menu
     *            the button menu
     */

    @Override
    public native void setMenu(Menu value) /*-{
		var button = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		button.menu = value.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
    }-*/;

    /**
     * Gets the currently active menu item.
     * 
     * @return, the currently active item
     */
    public native MenuItem getActiveItem() /*-{
		var button = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var obj = button.getActiveItem();
		return @com.ait.toolkit.sencha.ext.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets the currently active menu item.
     * 
     */
    public native void setActiveItem(MenuItem item) /*-{
		var button = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		button
				.setActiveItem(item.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()());
    }-*/;

    /**
     * Listen to menu change event on this cycle button's menu
     * 
     * @param handler
     *            , the handler tha will handle the event
     */
    public native HandlerRegistration addChangeHandler(com.ait.toolkit.sencha.ext.client.events.button.ChangeHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(b, m, e) {
			var button = @com.ait.toolkit.sencha.ext.client.ui.CycleButton::new(Lcom/google/gwt/core/client/JavaScriptObject;)(b);
			var menuItem = @com.ait.toolkit.sencha.ext.client.ui.MenuItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
			var event = @com.ait.toolkit.sencha.ext.client.events.button.ChangeEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/CycleButton;Lcom/ait/toolkit/sencha/ext/client/ui/MenuItem;Lcom/google/gwt/core/client/JavaScriptObject;)(button, menuItem, e);
			handler.@com.ait.toolkit.sencha.ext.client.events.button.ChangeHandler::onChange(Lcom/ait/toolkit/sencha/ext/client/events/button/ChangeEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.button.ChangeEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Creates a new CycleButton from the given component
     * 
     * @param component
     *            , the component to cast from
     * @return, a new CycleButton from the component
     * 
     */
    public static CycleButton cast(Component component) {
        return new CycleButton(component.getOrCreateJsObj());
    }

}
