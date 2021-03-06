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
import com.ait.toolkit.sencha.ext.client.events.view.AfterItemCollapseHandler;
import com.ait.toolkit.sencha.ext.client.events.view.AfterItemExpandHandler;
import com.ait.toolkit.sencha.ext.client.events.view.NodeDragOverHandler;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Used as a view by {@link TreePanel} .
 */
public class TreeView extends TableView {

	private static JavaScriptObject configPrototype;

	private native void init()/*-{
		var c = new $wnd.Ext.tree.View();
		@com.ait.toolkit.sencha.ext.client.ui.TreeView::configPrototype = c.initialConfig;
	}-*/;

	protected JavaScriptObject getConfigPrototype() {
		return configPrototype;
	}

	public String getXType() {
		return XType.TREE_VIEW.getValue();
	}

	/**
	 * Create a new NotificationContainer.
	 */
	public TreeView() {
		// init();
	}

	protected TreeView(JavaScriptObject jsObj) {
		super(jsObj);
	}

	protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.tree.View(config);
	}-*/;

	/**
	 * Fires after an item has been visually collapsed and is no longer visible
	 * in the tree.
	 * 
	 * @param handler
	 *            , the handler that will handle the event
	 */

	public native HandlerRegistration addAfterItemCollpaseHandler(
			AfterItemCollapseHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, index, item, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.AfterItemCollapseEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ILcom/google/gwt/dom/client/Element;Lcom/google/gwt/core/client/JavaScriptObject;)(node,index,item,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.AfterItemCollapseHandler::onAfterItemCollapse(Lcom/ait/toolkit/sencha/ext/client/events/view/AfterItemCollapseEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.AfterItemCollapseEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
	}-*/;

	/**
	 * Fires after an item has been visually expanded and is visible in the
	 * tree.
	 * 
	 * @param handler
	 *            , the handler that will handle the event
	 */

	public native HandlerRegistration addAfterItemExpandHandler(
			AfterItemExpandHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, index, item, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.AfterItemExpandEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ILcom/google/gwt/dom/client/Element;Lcom/google/gwt/core/client/JavaScriptObject;)(node,index,item,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.AfterItemExpandHandler::onAfterItemExpand(Lcom/ait/toolkit/sencha/ext/client/events/view/AfterItemExpandEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.AfterItemExpandEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
	}-*/;

	public native HandlerRegistration addNodeDragOverHandler(
			NodeDragOverHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, position, data, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.NodeDragOverEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;Lcom/google/gwt/core/client/JavaScriptObject;)(node, position,data,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.NodeDragOverHandler::onNodeDragOver(Lcom/ait/toolkit/sencha/ext/client/events/view/NodeDragOverEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.NodeDragOverEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
	}-*/;

	/**
	 * Creates a new TableView from the given component
	 * 
	 * @param component
	 *            , the component to cast from
	 * @return, a new TableView from the component
	 * 
	 */
	public static TreeView cast(Component component) {
		return new TreeView(component.getOrCreateJsObj());
	}

}
