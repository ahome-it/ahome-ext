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
import com.ait.toolkit.sencha.ext.client.draw.Sprite;
import com.ait.toolkit.sencha.ext.client.draw.Surface;
import com.ait.toolkit.sencha.ext.client.events.HandlerRegistration;
import com.ait.toolkit.sencha.ext.client.events.draw.DoubleClickHandler;
import com.ait.toolkit.sencha.ext.client.events.draw.MouseDownHandler;
import com.ait.toolkit.sencha.ext.client.events.draw.MouseEnterHandler;
import com.ait.toolkit.sencha.ext.client.events.draw.MouseLeaveHandler;
import com.ait.toolkit.sencha.ext.client.events.draw.MouseMoveHandler;
import com.ait.toolkit.sencha.ext.client.events.draw.MouseUpHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * The Draw Component is a surface in which sprites can be rendered. The Draw
 * Component manages and holds a Surface instance: an interface that has an SVG
 * or VML implementation depending on the browser capabilities and where Sprites
 * can be appended.
 * 
 */
public class DrawComponent extends Component {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.draw.Component({
			enginePriority : [ "Svg", "Vml" ]
		});
		@com.ait.toolkit.sencha.ext.client.ui.DrawComponent::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.DRAW.getValue();
    }

    /**
     * Create a new NotificationContainer.
     */
    public DrawComponent() {
        init();
        createSurface();
    }

    protected DrawComponent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public DrawComponent(Sprite... items) {
        this();
        this.setItems(items);
    }

    /**
     * Applys the DrawComponent to an existing element.
     * 
     * @param element
     *            the element
     */
    public DrawComponent(Element element) {
        super(element);
    }

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		config.enginePriority = [ "Svg", "Vml" ];
		return new $wnd.Ext.draw.Component(config);
    }-*/;

    /**
     * create the component surface
     */
    public native void createSurface() /*-{
		var draw = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		draw.createSurface();
    }-*/;

    public native Surface getSurface()/*-{
		var draw = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var surface = draw.surface;
		return @com.ait.toolkit.sencha.ext.client.draw.Surface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(surface);
    }-*/;

    public Sprite add(Sprite sprite) {
        return this.add(sprite, true);
    }

    public Sprite add(Sprite sprite, boolean autoShow) {
        return getSurface().add(sprite, autoShow);
    }

    public void setViewBox(boolean value) {
        setAttribute("viewBox", value, true);
    }

    /**
     * A single item, or an array of child Components to be added to this
     * container
     */
    public void setItems(Sprite... items) {
        setAttribute("items", ComponentFactory.fromArrayOfSprite(items), true);
    }

    /**
     * Listen to when a click is detected within the surface.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addClickHandler(com.ait.toolkit.sencha.ext.client.events.draw.ClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.sencha.ext.client.events.draw.ClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.sencha.ext.client.events.draw.ClickHandler::onClick(Lcom/ait/toolkit/sencha/ext/client/events/draw/ClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.draw.ClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;

    }-*/;

    /**
     * Listen to when a click is detected within the surface.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addDoubleClickHandler(DoubleClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.sencha.ext.client.events.draw.DoubleClickEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.sencha.ext.client.events.draw.DoubleClickHandler::onDoubleClick(Lcom/ait/toolkit/sencha/ext/client/events/draw/DoubleClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.draw.DoubleClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;

    }-*/;

    public native HandlerRegistration addMouseDownHandler(MouseDownHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.sencha.ext.client.events.draw.MouseDownEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.sencha.ext.client.events.draw.MouseDownHandler::onMouseDown(Lcom/ait/toolkit/sencha/ext/client/events/draw/MouseDownEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.draw.MouseDownEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addMouseEnterHandler(MouseEnterHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.sencha.ext.client.events.draw.MouseEnterEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.sencha.ext.client.events.draw.MouseEnterHandler::onMouseEnter(Lcom/ait/toolkit/sencha/ext/client/events/draw/MouseEnterEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.draw.MouseEnterEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addMouseLeaveHandler(MouseLeaveHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.sencha.ext.client.events.draw.MouseLeaveEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.sencha.ext.client.events.draw.MouseLeaveHandler::onMouseLeave(Lcom/ait/toolkit/sencha/ext/client/events/draw/MouseLeaveEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.draw.MouseLeaveEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addMouseUpHandler(MouseUpHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.sencha.ext.client.events.draw.MouseUpEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.sencha.ext.client.events.draw.MouseUpHandler::onMouseUp(Lcom/ait/toolkit/sencha/ext/client/events/draw/MouseUpEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.draw.MouseUpEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(e) {
			var event = @com.ait.toolkit.sencha.ext.client.events.draw.MouseMoveEvent::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			handler.@com.ait.toolkit.sencha.ext.client.events.draw.MouseMoveHandler::onMouseMove(Lcom/ait/toolkit/sencha/ext/client/events/draw/MouseMoveEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.draw.MouseMoveEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Creates a new DrawComponent from the given component
     * 
     * @param component
     *            , the component to cast from
     * @return, a new DrawComponent from the component
     * 
     */
    public static DrawComponent cast(Component component) {
        return new DrawComponent(component.getOrCreateJsObj());
    }
}
