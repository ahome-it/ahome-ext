/*
 * Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ait.toolkit.sencha.ext.client.ui;

import java.util.List;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.ait.toolkit.sencha.ext.client.events.HandlerRegistration;
import com.ait.toolkit.sencha.ext.client.events.view.AfterItemCollapseHandler;
import com.ait.toolkit.sencha.ext.client.events.view.AfterItemExpandHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeItemAppendHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeItemCollapseHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeItemExpandHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeItemInsertHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeItemMoveHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeItemRemoveHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeLoadHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemAppendHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemCollapseHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemExpandHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemInsertHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemMoveHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemRemoveHandler;
import com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeLoadHandler;
import com.ait.toolkit.sencha.ext.client.events.view.CheckChangeHandler;
import com.ait.toolkit.sencha.ext.client.events.view.ItemAppendHandler;
import com.ait.toolkit.sencha.ext.client.events.view.ItemCollapseHandler;
import com.ait.toolkit.sencha.ext.client.events.view.ItemExpandHandler;
import com.ait.toolkit.sencha.ext.client.events.view.ItemInsertHandler;
import com.ait.toolkit.sencha.ext.client.events.view.ItemMoveHandler;
import com.ait.toolkit.sencha.ext.client.events.view.ItemRemoveHandler;
import com.ait.toolkit.sencha.ext.client.events.view.LoadHandler;
import com.ait.toolkit.sencha.shared.client.data.NodeInterface;
import com.ait.toolkit.sencha.shared.client.data.Store;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * The TreePanel provides tree-structured UI representation of tree-structured data. A TreePanel must be bound to a {@link Store}. TreePanel's support multiple columns through the
 * columns property.
 * 
 */
public class TreePanel extends TablePanel {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.tree.Panel();
		@com.ait.toolkit.sencha.ext.client.ui.TreePanel::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.TREE_PANEL.getValue();
    }

    public TreePanel() {
        // init();
    }

    protected TreePanel( JavaScriptObject obj ) {
        super( obj );
    }

    /**
     * Create a new Tree NotificationContainer.
     */
    public TreePanel( Store store ) {
        setStore( store );
    }

    public TreePanel( String title, Store store ) {
        setTitle( title );
        setStore( store );
    }

    protected native JavaScriptObject create( JavaScriptObject config ) /*-{
		return $wnd.Ext.tree.Panel(config);
    }-*/;

    /**
     * True to enable animated expand/collapse.
     * 
     * @param value
     */
    public void setAnimate( boolean value ) {
        setAttribute( "animate", value, true );
    }

    /**
     * The field inside the model that will be used as the node's text.
     * <p>
     * Defaults to: "text"
     */
    public void setDisplayField( String value ) {
        setAttribute( "displayField", value, true );
    }

    /**
     * True to automatically prepend a leaf sorter to the store.
     * 
     * @param value
     */
    public void setFolderSort( boolean value ) {
        setAttribute( "folderSort", value, true );
    }

    /**
     * True to hide the headers.
     */
    public void setHideHeaders( boolean value ) {
        setAttribute( "hideHeaders", value, true );
    }

    /**
     * False to disable tree lines.
     * <p>
     * Defaults to: true
     */
    public void setLines( boolean value ) {
        setAttribute( "lines", value, true );
    }

    /**
     * False to hide the root node.
     * <p>
     * Defaults to: true
     * 
     * @param value
     */
    public void setRootVisible( boolean value ) {
        setAttribute( "rootVisible", value, true );
    }

    /**
     * False so that rows are not separated by lines.
     * <p>
     * Defaults to: false
     */
    public void setRowLines( boolean value ) {
        setAttribute( "rowLines", value, true );
    }

    /**
     * True if only 1 node per branch may be expanded.
     * <p>
     * Defaults to: false
     */
    public void setSingleExpand( boolean value ) {
        setAttribute( "singleExpand", value, true );
    }

    /**
     * True to use Vista-style arrows in the tree.
     * <p>
     * Defaults to: false
     */
    public void setUseArrows( boolean value ) {
        setAttribute( "useArrows", value, true );
    }

    /**
     * Collapse all nodes
     */
    public native void collapseAll() /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.collapseAll();
    }-*/;

    /**
     * Filter the tree by the given value using the given dataIndex as key
     * 
     * @param value
     * @param key
     */
    public native void filterBy( String value, String dataIndex ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.filterBy(value, dataIndex);
    }-*/;

    /**
     * Filter the tree by the given value using 'text' as dataIndex
     * 
     * @param value
     * @param key
     */
    public native void filterBy( String value ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.filterBy(value, 'text');
    }-*/;

    /**
     * Clears filtering on this tree
     */
    public native void clearFilter() /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.clearFilter();
    }-*/;

    /**
     * Collapse all nodes
     * 
     * @param callBack
     *            , A function to execute when the collapse finishes.
     */
    public native void collapseAll( Function callBack ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.collapseAll($entry(function() {
			callBack.@com.ait.toolkit.core.client.Function::execute()();
		}));
    }-*/;

    /**
     * Expand all nodes
     */
    public native void expandAll() /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.expandAll();
    }-*/;

    /**
     * Expand all nodes
     * 
     * @param callBack
     *            ,A function to execute when the expand finishes.
     */
    public native void expandAll( Function callBack ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.expandAll($entry(function() {
			callBack.@com.ait.toolkit.core.client.Function::execute()();
		}));
    }-*/;

    /**
     * Expands a record that is loaded in the tree.
     * 
     * @param record
     *            , The record to expand
     */
    public native void expandNode( BaseModel record ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel
				.expandNode(record.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    /**
     * Expands a record that is loaded in the tree.
     * 
     * @param record
     *            , The record to expand
     * @param deep
     *            , True to expand nodes all the way down the tree hierarchy.
     */
    public native void expandNode( BaseModel record, boolean deep ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.expandNode(
				record.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				deep);
    }-*/;

    /**
     * Expands a record that is loaded in the tree.
     * 
     * @param record
     *            , The record to expand
     * @param deep
     *            , True to expand nodes all the way down the tree hierarchy.
     * @param callBack
     *            , The function to run after the expand is completed
     */
    public native void expandNode( BaseModel record, boolean deep, Function callBack ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel
				.expandNode(
						record.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						deep,
						$entry(function() {
							callBack.@com.ait.toolkit.core.client.Function::execute()();
						}));
    }-*/;

    /**
     * Expand the tree to the path of a particular node.
     * 
     * @param path
     *            ,The path to expand. The path should include a leading separator.
     */
    public native void expandPath( String path ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.expandPath(path);
    }-*/;

    /**
     * Expand the tree to the path of a particular node.
     * 
     * @param path
     *            ,The path to expand. The path should include a leading separator.
     * @param field
     *            ,The field to get the data from. Defaults to the model idProperty.
     */
    public native void expandPath( String path, String field ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.expandPath(path, field);
    }-*/;

    /**
     * Expand the tree to the path of a particular node.
     * 
     * @param path
     *            ,The path to expand. The path should include a leading separator.
     * @param field
     *            ,The field to get the data from. Defaults to the model idProperty.
     * @param callBack
     *            , A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode
     *            is the last node that was expanded.
     */
    public native void expandPath( String path, String field, Function callBack ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.expandPath(path, field, $entry(function() {
			callBack.@com.ait.toolkit.core.client.Function::execute()();
		}));
    }-*/;

    /**
     * Retrieve an array of checked records.
     */

    public native List<NodeInterface> getChecked() /*-{
		var panel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var obj = panel.getChecked();
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::fromJavaScriptArray(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Returns the root node for this tree.
     */
    public native NodeInterface getRootNode() /*-{
		var panel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var obj = panel.getRootNode();
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Expand the tree to the path of a particular node, then select it
     * 
     * @param path
     *            ,The path to expand. The path should include a leading separator.
     */
    public native void selectPath( String path ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.selectPath(path);
    }-*/;

    /**
     * Expand the tree to the path of a particular node ,then select it
     * 
     * @param path
     *            ,The path to expand. The path should include a leading separator.
     * @param field
     *            ,The field to get the data from. Defaults to the model idProperty.
     */
    public native void selectPath( String path, String field ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.selectPath(path, field);
    }-*/;

    /**
     * Expand the tree to the path of a particular node,then select it
     * 
     * @param path
     *            ,The path to expand. The path should include a leading separator.
     * @param field
     *            ,The field to get the data from. Defaults to the model idProperty.
     * @param callBack
     *            , A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode
     *            is the last node that was expanded.
     */
    public native void selectPath( String path, String field, Function callBack ) /*-{
		var treePanel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		treePanel.selectPath(path, field, $entry(function() {
			callBack.@com.ait.toolkit.core.client.Function::execute()();
		}));
    }-*/;

    /**
     * Sets root node of this tree.
     * 
     * @param node
     * @return
     */
    public native NodeInterface setRootNode( BaseModel node ) /*-{
		var panel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var obj = panel
				.setRootNode(node.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Sets root node of this tree.
     * 
     * @param node
     * @return
     */
    public native NodeInterface setRootNode( JavaScriptObject node ) /*-{
		var panel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var obj = panel.setRootNode(node);
		return @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    /**
     * Fires after an item has been visually collapsed and is no longer visible in the tree.
     * 
     * @param handler
     *            , the handler that will handle the event
     */

    public native HandlerRegistration addAfterItemCollpaseHandler( AfterItemCollapseHandler handler )/*-{
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
     * Fires after an item has been visually expanded and is visible in the tree.
     * 
     * @param handler
     *            , the handler that will handle the event
     */

    public native HandlerRegistration addAfterItemExpandHandler( AfterItemExpandHandler handler )/*-{
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

    /**
     * Fires before a new child is appended, return false to cancel the append.
     * 
     * @param handler
     *            , the handler that will handle the event
     */

    public native void addBeforeItemAppendHandler( BeforeTreeItemAppendHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_ITEM_APPEND,
							$entry(function(node1, node2) {
								var target = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node1);
								var toAppend = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node2);
								return handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemAppendHandler::onEvent(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(target,toAppend);
							}));
		}

    }-*/;

    public native HandlerRegistration addBeforeItemAppendHandler( BeforeItemAppendHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(node1, node2, e) {
			var target = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node1);
			var toAppend = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node2);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemAppendEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/google/gwt/core/client/JavaScriptObject;)(target,toAppend,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeItemAppendHandler::onBeforeItemAppend(Lcom/ait/toolkit/sencha/ext/client/events/view/BeforeItemAppendEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemAppendEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires before a new child is appended, return false to cancel the append.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addBeforeItemExpandHandler( BeforeTreeItemExpandHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_ITEM_EXPAND,
							$entry(function(n) {
								var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
								return handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemExpandHandler::onEvent(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(node);
							}));
		}

    }-*/;

    public native HandlerRegistration addBeforeItemExpandHandler( BeforeItemExpandHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(node1, e) {
			var target = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node1);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemExpandEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/google/gwt/core/client/JavaScriptObject;)(target,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeItemExpandHandler::onBeforeItemExpand(Lcom/ait/toolkit/sencha/ext/client/events/view/BeforeItemExpandEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemExpandEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires before this node is collapsed.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addBeforeItemCollapseHandler( BeforeTreeItemCollapseHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_ITEM_COLLAPSE,
							$entry(function(n) {
								var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
								return handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemCollapseHandler::onEvent(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(node);
							}));
		}

    }-*/;

    public native HandlerRegistration addBeforeItemCollapseHandler( BeforeItemCollapseHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(node1, e) {
			var target = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(node1);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemCollapseEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/google/gwt/core/client/JavaScriptObject;)(target,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeItemCollapseHandler::onBeforeItemCollapse(Lcom/ait/toolkit/sencha/ext/client/events/view/BeforeItemCollapseEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemCollapseEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires before a new child is inserted, return false to cancel the insert.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addBeforeItemInsertHandler( BeforeTreeItemInsertHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_ITEM_INSERT,
							$entry(function(n, o, r) {
								var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
								var oldParent = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
								var refNode = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
								return handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemInsertHandler::onEvent(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;)(node,oldParent,refNode);
							}));
		}
    }-*/;

    public native HandlerRegistration addBeforeItemInsertHandler( BeforeItemInsertHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, o, r, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var toInsert = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
			var refNode = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemInsertEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ILcom/google/gwt/core/client/JavaScriptObject;)(node,toInsert,refNode,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeItemInsertHandler::onBeforeItemInsert(Lcom/ait/toolkit/sencha/ext/client/events/view/BeforeItemInsertEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemInsertEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires before this node is moved to a new location in the tree. Return false to cancel the move.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addBeforeItemMoveHandler( BeforeTreeItemMoveHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_ITEM_MOVE,
							$entry(function(n, o, np, index) {
								var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
								var oldParent = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
								var newParent = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(np);
								return handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemMoveHandler::onEvent(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;I)(node,oldParent,newParent,index);
							}));
		}

    }-*/;

    /**
     * Fires before this node is moved to a new location in the tree.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addBeforeItemMoveHandler( BeforeItemMoveHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, o, np, index, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var oldParent = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
			var newParent = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(np);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemMoveEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ILcom/google/gwt/core/client/JavaScriptObject;)(node,newParent, oldParent, index, e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeItemMoveHandler::onBeforeItemMove(Lcom/ait/toolkit/sencha/ext/client/events/view/BeforeItemMoveEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemMoveEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires before a child is removed, return false to cancel the remove.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addBeforeItemRemoveHandler( BeforeTreeItemRemoveHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_ITEM_REMOVE,
							$entry(function(n, tr, isMove) {
								var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
								var toRemove = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(tr);
								return handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeItemRemoveHandler::onEvent(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Z)(node,toRemove,isMove);
							}));
		}
    }-*/;

    public native HandlerRegistration addBeforeItemRemoveHandler( BeforeItemRemoveHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, tr, isMove, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var toRemove = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(tr);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemRemoveEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ZLcom/google/gwt/core/client/JavaScriptObject;)(node,toRemove,isMove,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeItemRemoveHandler::onBeforeItemRemove(Lcom/ait/toolkit/sencha/ext/client/events/view/BeforeItemRemoveEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.BeforeItemRemoveEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires before a request is made for a new data object. If the beforeload handler returns false the load action will be canceled.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native void addBeforeLoadHandler( BeforeTreeLoadHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_LOAD,
							$entry(function(s, o) {
								var store = @com.ait.toolkit.sencha.shared.client.data.Store::new(Lcom/google/gwt/core/client/JavaScriptObject;)(s);
								var operation = @com.ait.toolkit.sencha.shared.client.data.Operation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
								return handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeTreeLoadHandler::onEvent(Lcom/ait/toolkit/sencha/shared/client/data/Store;Lcom/ait/toolkit/sencha/shared/client/data/Operation;)(store,operation);
							}));
		}
    }-*/;

    public native HandlerRegistration addBeforeLoadHandler( BeforeLoadHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(s, o, e) {
			var store = @com.ait.toolkit.sencha.shared.client.data.Store::new(Lcom/google/gwt/core/client/JavaScriptObject;)(s);
			var operation = @com.ait.toolkit.sencha.shared.client.data.Operation::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.BeforeLoadEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/Store;Lcom/ait/toolkit/sencha/shared/client/data/Operation;Lcom/google/gwt/core/client/JavaScriptObject;)(store,operation,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.BeforeLoadHandler::onBeforeLoad(Lcom/ait/toolkit/sencha/ext/client/events/view/BeforeLoadEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.BeforeLoadEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires when a node with a checkbox's checked property changes
     * 
     * @param handler
     *            , the handler that will handle the event
     */

    public native HandlerRegistration addCheckChangeHandler( CheckChangeHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, checked, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.CheckChangeEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ZLcom/google/gwt/core/client/JavaScriptObject;)(node,checked,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.CheckChangeHandler::onCheckChange(Lcom/ait/toolkit/sencha/ext/client/events/view/CheckChangeEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.CheckChangeEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires when a new child node is appended
     * 
     * @param handler
     *            , the handler that will handle the event
     */

    public native HandlerRegistration addItemAppendHandler( ItemAppendHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, nn, index, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var newNode = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(nn);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.ItemAppendEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ILcom/google/gwt/core/client/JavaScriptObject;)(node,newNode,index,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.ItemAppendHandler::onItemAppend(Lcom/ait/toolkit/sencha/ext/client/events/view/ItemAppendEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.ItemAppendEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires when this node is collapsed.
     * 
     * @param handler
     *            , the handler that will handle the event
     */

    public native HandlerRegistration addItemCollapseHandler( ItemCollapseHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.ItemCollapseEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/google/gwt/core/client/JavaScriptObject;)(node,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.ItemCollapseHandler::onItemCollapse(Lcom/ait/toolkit/sencha/ext/client/events/view/ItemCollapseEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.ItemCollapseEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires when this node is expanded.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addItemExpandHandler( ItemExpandHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.ItemExpandEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/google/gwt/core/client/JavaScriptObject;)(node,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.ItemExpandHandler::onItemExpand(Lcom/ait/toolkit/sencha/ext/client/events/view/ItemExpandEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.ItemExpandEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires when a new child node is inserted.
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addItemInsertHandler( ItemInsertHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, o, r, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var toInsert = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
			var refNode = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.ItemInsertEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ILcom/google/gwt/core/client/JavaScriptObject;)(node,toInsert,refNode,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.ItemInsertHandler::onItemInsert(Lcom/ait/toolkit/sencha/ext/client/events/view/ItemInsertEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.ItemInsertEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires when this node is moved to a new location in the tree
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addItemMoveHandler( ItemMoveHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, o, np, index, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var oldParent = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
			var newParent = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(np);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.ItemMoveEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ILcom/google/gwt/core/client/JavaScriptObject;)(node,newParent, oldParent, index, e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.ItemMoveHandler::onItemMove(Lcom/ait/toolkit/sencha/ext/client/events/view/ItemMoveEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.ItemMoveEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires when a child node is removed
     * 
     * @param handler
     *            , the handler that will handle the event
     */
    public native HandlerRegistration addItemRemoveHandler( ItemRemoveHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(n, tr, isMove, e) {
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var toRemove = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(tr);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.ItemRemoveEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;ZLcom/google/gwt/core/client/JavaScriptObject;)(node,toRemove,isMove,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.ItemRemoveHandler::onItemRemove(Lcom/ait/toolkit/sencha/ext/client/events/view/ItemRemoveEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.ItemRemoveEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fires whenever the store reads data from a remote data source.
     * 
     * @param handler
     *            , the handler that will handle the event
     */

    public native HandlerRegistration addLoadHandler( LoadHandler handler )/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(s, n, r, successful, e) {
			var store = @com.ait.toolkit.sencha.shared.client.data.TreeStore::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
			var node = @com.ait.toolkit.sencha.shared.client.data.NodeInterface::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			var records = @com.ait.toolkit.data.client.TableItem::fromJsArray(Lcom/google/gwt/core/client/JavaScriptObject;)(r);
			var event = @com.ait.toolkit.sencha.ext.client.events.view.LoadEvent::new(Lcom/ait/toolkit/sencha/shared/client/data/TreeStore;Lcom/ait/toolkit/sencha/shared/client/data/NodeInterface;Ljava/util/List;ZLcom/google/gwt/core/client/JavaScriptObject;)(store,node,records,sucessful,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.view.LoadHandler::onLoad(Lcom/ait/toolkit/sencha/ext/client/events/view/LoadEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.view.LoadEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
    * The component width. (defaults to auto)
    * 
    * @param width
    *            the width, -1 for auto
    */
    public void setWidth( double width ) {

        if( width == -1 ) {
            setAttribute( "width", "auto", true, true );
        } else {
            setAttribute( "width", width, true );
        }

        setWidthRendered( width );

    }

    private native void setTitleRendered( String title ) /*-{
		var panel = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (panel && panel.setTitle) {
			panel.setTitle(title);
		}
    }-*/;

    private native void setWidthRendered( double width ) /*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component && component.setWidth) {
			component.setWidth(width);
		}
    }-*/;

    /**
     * Creates a new TreePanel from the given component
     * 
     * @param component
     *            , the component to cast from
     * @return, a new TreePanel from the component
     * 
     */
    public static TreePanel cast( Component component ) {
        return new TreePanel( component.getOrCreateJsObj() );
    }

}
