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
package com.ait.toolkit.sencha.ext.client.events;

import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Registration class for event handlers. This class is returned when adding an
 * event handler to an {@link ExtElement}.
 */
public class ElementHandlerRegistration implements
		com.google.gwt.event.shared.HandlerRegistration {

	private final ExtElement widget;
	private final String eventName;
	private final JavaScriptObject callback;

	public ElementHandlerRegistration(ExtElement widget, String eventName,
			JavaScriptObject callback) {
		super();
		this.widget = widget;
		this.eventName = eventName;
		this.callback = callback;
	}

	/**
	 * @return the widget
	 */
	public ExtElement getElement() {
		return widget;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @return the callback
	 */
	public JavaScriptObject getCallback() {
		return callback;
	}

	/**
	 * Unregisters the event handler from the component
	 */
	public native void unregister()/*-{
		var widget = this.@com.ait.toolkit.sencha.ext.client.events.ElementHandlerRegistration::getElement()();
		var widgetPeer = widget.@com.ait.toolkit.sencha.shared.client.dom.ExtElement::getJsObj()();
		var event = this.@com.ait.toolkit.sencha.ext.client.events.ElementHandlerRegistration::getEventName()();
		var fn = this.@com.ait.toolkit.sencha.ext.client.events.ElementHandlerRegistration::getCallback()();
		widgetPeer.removeListener(event, fn);
	}-*/;

	@Override
	public void removeHandler() {
		unregister();
	}

}
