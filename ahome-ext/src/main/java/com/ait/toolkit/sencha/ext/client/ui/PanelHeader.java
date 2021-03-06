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

import java.util.List;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.ait.toolkit.sencha.ext.client.events.HandlerRegistration;
import com.ait.toolkit.sencha.ext.client.events.panel.HeaderClickHandler;
import com.ait.toolkit.sencha.ext.client.events.panel.HeaderDoubleClickHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Simple header class which is used for on {@link Panel} and {@link Window}
 */
public class PanelHeader extends Container {

	private static JavaScriptObject configPrototype;

	protected JavaScriptObject getConfigPrototype() {
		return configPrototype;
	}

	public String getXType() {
		return XType.HEADER.getValue();
	}

	/**
	 * Create a new NotificationContainer.
	 */
	protected PanelHeader() {
	}

	protected PanelHeader(JavaScriptObject obj) {
		super(obj);
	}

	protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.panel.Header(config);
	}-*/;

	/**
	 * Add a tool to the header
	 */
	public native void addTool(Tool value)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component
				.addTool(value.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()());

	}-*/;

	/**
	 * Gets the tools for this header.
	 */
	public native List<Tool> getTools()/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var obj = component.geTools();
		return @com.ait.toolkit.sencha.ext.client.ui.Tool::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	/**
	 * Sets glyph that provides the icon image for this header. This method will replace any existing glyph if one has already been set.
	 */
	public native void setGlyph(String value)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.setGlyph(value);
	}-*/;

	/**
	 * Sets glyph that provides the icon image for this header. This method will replace any existing glyph if one has already been set.
	 */
	public native void setGlyph(double value)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.setGlyph(value);
	}-*/;

	/**
	 * Sets the image path that provides the icon image for this header. This method will replace any existing icon if one has already been set.
	 */
	public native void setIcon(String value)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.setIcon(value);
	}-*/;

	/**
	 * Sets the CSS class that provides the icon image for this header. This method will replace any existing icon class if one has already been set.
	 */
	public native void setIconCls(String value)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.setIconCls(value);
	}-*/;

	/**
	 * Sets the title of the header.
	 * 
	 * @param title
	 *            , the title to be set
	 */
	public native void setTitle(String title)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component.seTitle(title);
	}-*/;

	/**
	 * Sets the position of the title in the header's items
	 */
	public native void setTitlePosition(int index)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component.setTitlePosition) {
			component.setTitlePosition(index);
		} else {
			var me = component;
			me.titlePosition = index = $wnd.Math
					.min(index, me.items.length - 1);
			me.insert(index, me.titleCmp);
		}
	}-*/;

	/**
	 * Creates a new PanelHeader from the given component
	 * 
	 * @param component
	 *            , the component to cast from
	 * @return, a new PanelHeader from the component
	 * 
	 */
	public static PanelHeader cast(Component component) {
		return new PanelHeader(component.getOrCreateJsObj());
	}

	// Events

	/**
	 * Fires when the header is clicked. This event will not be fired if the click was on a {@link Tool}
	 * 
	 */
	public native HandlerRegistration addHeaderClickHandler(HeaderClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(p, e) {
			var panel = @com.ait.toolkit.sencha.ext.client.ui.PanelHeader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
			var event = @com.ait.toolkit.sencha.ext.client.events.panel.HeaderClickEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/PanelHeader;Lcom/google/gwt/core/client/JavaScriptObject;)(panel,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.panel.HeaderClickHandler::onHeaderClick(Lcom/ait/toolkit/sencha/ext/client/events/panel/HeaderClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.panel.HeaderClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
	}-*/;

	/**
	 * Fires when the header is double clicked. This event will not be fired if the click was on a {@link Tool}
	 * 
	 */
	public native HandlerRegistration addHeaderDoubleClickHandler(HeaderDoubleClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(p, e) {
			var panel = @com.ait.toolkit.sencha.ext.client.ui.PanelHeader::new(Lcom/google/gwt/core/client/JavaScriptObject;)(p);
			var event = @com.ait.toolkit.sencha.ext.client.events.panel.HeaderDoubleClickEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/PanelHeader;Lcom/google/gwt/core/client/JavaScriptObject;)(panel,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.panel.HeaderDoubleClickHandler::onHeaderDoubleClick(Lcom/ait/toolkit/sencha/ext/client/events/panel/HeaderDoubleClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.panel.HeaderDoubleClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
	}-*/;

}
