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

import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.ait.toolkit.sencha.ext.client.events.HandlerRegistration;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeActionHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellClickEvent;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellClickHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellContextMenuEvent;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellContextMenuHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellDoubleClickEvent;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellDoubleClickHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellKeyDownEvent;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellKeyDownHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseDownEvent;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseDownHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseUpEvent;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseUpHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.BeforeDropHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.CellClickHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.CellContextMenuHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.CellDoubleClickHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.CellKeyDownHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.CellMouseDownHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.CellMouseUpHandler;
import com.ait.toolkit.sencha.ext.client.events.grid.DropHandler;
import com.ait.toolkit.sencha.ext.client.grid.HeaderContainer;
import com.ait.toolkit.sencha.ext.client.grid.plugin.AbstractPlugin;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class TableView extends DataView {

    private static JavaScriptObject configPrototype;

    private native void init()/*-{
		var c = new $wnd.Ext.table.View();
		@com.ait.toolkit.sencha.ext.client.ui.TableView::configPrototype = c.initialConfig;
    }-*/;

    protected JavaScriptObject getConfigPrototype() {
        return configPrototype;
    }

    public String getXType() {
        return XType.TABLE_VIEW.getValue();
    }

    /**
     * Create a new NotificationContainer.
     */
    public TableView() {
        // init();
    }

    protected TableView(JavaScriptObject jsObj) {
        super(jsObj);
    }

    /**
     * An array of grid Features to be added to this grid.
     */
    public void setPlugins(AbstractPlugin... values) {
        setPlugins(Arrays.asList(values));
    }

    /**
     * An array of grid Features to be added to this grid.
     */
    public void setPlugins(List<AbstractPlugin> values) {
        JsArray<JavaScriptObject> jsos = JsArray.createArray().cast();
        for (AbstractPlugin f : values) {
            jsos.push(f.getJsObj());
        }
        setAttribute("plugins", jsos, true);
    }

    /**
     * True to enable text selections.
     * 
     * @param value
     */
    public void setEnableTextSelection(boolean value) {
        setAttribute("enableTextSelection", value, true);
    }

    /**
     * A CSS class to add to the first cell in every row to enable special
     * styling for the first column. If no styling is needed on the first
     * column, this may be configured as null.
     * <p>
     * Defaults to: "x-grid-cell-first"
     */
    public void setFirstCls(String value) {
        setAttribute("firstCls", value, true);
    }

    /**
     * A CSS class to add to the last cell in every row to enable special
     * styling for the last column. If no styling is needed on the last column,
     * this may be configured as null.
     * <p>
     * Defaults to: "x-grid-cell-last"
     */
    public void setLastCls(String value) {
        setAttribute("lastCls", value, true);
    }

    /**
     * True to show the dirty cell indicator when a cell has been modified.
     * <p>
     * Defaults to: true
     */
    public void setMarkDirty(boolean value) {
        setAttribute("markDirty", value, true);
    }

    /**
     * True to stripe the rows.
     * <p>
     * This causes the CSS class x-grid-row-alt to be added to alternate rows of
     * the grid. A default CSS rule is provided which sets a background color,
     * but you can override this with a rule which either overrides the
     * background-color style using the !important modifier, or which uses a CSS
     * selector of higher specificity.
     * <p>
     * Defaults to: true
     */
    public void setStripeRows(boolean value) {
        setAttribute("stripeRows", value, true);
    }

    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.table.View(config);
    }-*/;

    public native void addBeforeDropHandler(BeforeDropHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_DROP,
							$entry(function(node, d, m, dropPosition) {
								var data = @com.ait.toolkit.sencha.ext.client.core.config.DragAndDropData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
								var model = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
								return handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeDropHandler::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/ait/toolkit/sencha/ext/client/core/config/DragAndDropData;Lcom/ait/toolkit/data/client/BaseModel;Ljava/lang/String;)(node,data, model, dropPosition);
							}));
		}
    }-*/;

    public native void addDropHandler(DropHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			component
					.addListener(
							@com.ait.toolkit.sencha.ext.client.events.Event::BEFORE_DROP,
							$entry(function(node, d, m, dropPosition) {
								var data = @com.ait.toolkit.sencha.ext.client.core.config.DragAndDropData::new(Lcom/google/gwt/core/client/JavaScriptObject;)(d);
								var model = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
								handler.@com.ait.toolkit.sencha.ext.client.events.grid.DropHandler::onEvent(Lcom/google/gwt/core/client/JavaScriptObject;Lcom/ait/toolkit/sencha/ext/client/core/config/DragAndDropData;Lcom/ait/toolkit/data/client/BaseModel;Ljava/lang/String;)(node,data, model, dropPosition);
							}));
		}

    }-*/;

    public native HeaderContainer getHeaderContainer()/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		if (component) {
			var obj = component.headerCt;
			if (obj) {
				return @com.ait.toolkit.sencha.ext.client.grid.HeaderContainer::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
			}
			return null;

		}
		return null;

    }-*/;

    /**
     * Creates a new TableView from the given component
     * 
     * @param component
     *            , the component to cast from
     * @return, a new TableView from the component
     * 
     */
    public static TableView cast(Component component) {
        return new TableView(component.getOrCreateJsObj());
    }

    // Events

    /**
     * 
     Fired before the cell click is processed.
     */

    public native HandlerRegistration addBeforeCellClickHandler(BeforeCellClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellClickEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellClickHandler::onBeforeCellClick(Lcom/ait/toolkit/sencha/ext/client/events/grid/BeforeCellClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fired before the cell click is processed. Return false to cancel the
     * default action.
     */
    public void addBeforeCellClickHandler(BeforeActionHandler handler) {
        _addBeforeActionHandlerHandler(BeforeCellClickEvent.EVENT_NAME, handler);
    }

    /**
     * 
     * Fired before the cell right click is processed.
     */

    public native HandlerRegistration addBeforeCellContextMenuHandler(BeforeCellContextMenuHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellContextMenuEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellContextMenuHandler::onBeforeCellContextMenu(Lcom/ait/toolkit/sencha/ext/client/events/grid/BeforeCellContextMenuEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellContextMenuEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fired before the cell right click is processed. Return false to cancel
     * the default action.
     */
    public void addBeforeCellContextMenuHandler(BeforeActionHandler handler) {
        _addBeforeActionHandlerHandler(BeforeCellContextMenuEvent.EVENT_NAME, handler);
    }

    /**
     * 
     * Fired before the cell double click is processed.
     */

    public native HandlerRegistration addBeforeCellDoubleClickHandler(BeforeCellDoubleClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellDoubleClickEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellDoubleClickHandler::onBeforeCellDoubleClick(Lcom/ait/toolkit/sencha/ext/client/events/grid/BeforeCellDoubleClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellDoubleClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fired before the cell double click is processed. Return false to cancel
     * the default action. right click is processed. Return false to cancel the
     * default action.
     */
    public void addBeforeCellDoubleClickHandler(BeforeActionHandler handler) {
        _addBeforeActionHandlerHandler(BeforeCellDoubleClickEvent.EVENT_NAME, handler);
    }

    /**
     * Fired before the cell key down is processed.
     */

    public native HandlerRegistration addBeforeCellKeyDownHandler(BeforeCellKeyDownHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellKeyDownEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellKeyDownHandler::onBeforeCellKeyDown(Lcom/ait/toolkit/sencha/ext/client/events/grid/BeforeCellKeyDownEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellKeyDownEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fired before the cell key down is processed. Return false to cancel the
     * default action. right click is processed. Return false to cancel the
     * default action.
     */
    public void addBeforeCellKeyDownHandler(BeforeActionHandler handler) {
        _addBeforeActionHandlerHandler(BeforeCellKeyDownEvent.EVENT_NAME, handler);
    }

    /**
     * Fired before the cell mouse down is processed.
     */

    public native HandlerRegistration addBeforeCellMouseDownHandler(BeforeCellMouseDownHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseDownEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseDownHandler::onBeforeCellMouseDown(Lcom/ait/toolkit/sencha/ext/client/events/grid/BeforeCellMouseDownEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseDownEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fired before the cell mouse down is processed. Return false to cancel the
     * default action. right click is processed. Return false to cancel the
     * default action.
     */
    public void addBeforeCellMouseDownHandler(BeforeActionHandler handler) {
        _addBeforeActionHandlerHandler(BeforeCellMouseDownEvent.EVENT_NAME, handler);
    }

    /**
     * Fired before the cell mouse up is processed.
     */

    public native HandlerRegistration addBeforeCellMouseUpHandler(BeforeCellMouseUpHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseUpEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseUpHandler::onBeforeCellMouseUp(Lcom/ait/toolkit/sencha/ext/client/events/grid/BeforeCellMouseUpEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.BeforeCellMouseUpEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    /**
     * Fired before the cell mouse up is processed. Return false to cancel the
     * default action. right click is processed. Return false to cancel the
     * default action.
     */
    public void addBeforeCellMouseUpHandler(BeforeActionHandler handler) {
        _addBeforeActionHandlerHandler(BeforeCellMouseUpEvent.EVENT_NAME, handler);
    }

    public native HandlerRegistration addCellClickHandler(CellClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.CellClickEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.CellClickHandler::onCellClick(Lcom/ait/toolkit/sencha/ext/client/events/grid/CellClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.CellClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addCellContextMenuHandler(CellContextMenuHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.CellContextMenuEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.CellContextMenuHandler::onCellContextMenu(Lcom/ait/toolkit/sencha/ext/client/events/grid/CellContextMenuEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.CellContextMenuEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addCellDoubleClickHandler(CellDoubleClickHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.CellDoubleClickEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.CellDoubleClickHandler::onCellDoubleClick(Lcom/ait/toolkit/sencha/ext/client/events/grid/CellDoubleClickEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.CellDoubleClickEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addCellKeyDownHandler(CellKeyDownHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.CellKeyDownEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.CellKeyDownHandler::onCellKeyDown(Lcom/ait/toolkit/sencha/ext/client/events/grid/CellKeyDownEvent;)(event);
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.CellKeyDownEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addCellMouseUpHandler(CellMouseUpHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.CellMouseUpEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.CellMouseUpHandler::onCellMouseUp(Lcom/ait/toolkit/sencha/ext/client/events/grid/CellMouseUpEvent;)(event);
			;
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.CellMouseUpEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    public native HandlerRegistration addCellMouseDownHandler(CellMouseDownHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		var fn = function(t, td, cellIndex, rec, tr, rowIndex, e) {
			var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
			var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
			var event = @com.ait.toolkit.sencha.ext.client.events.grid.CellMouseDownEvent::new(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/google/gwt/core/client/JavaScriptObject;)(cpm,tr, cellIndex, record, tr, rowIndex,e);
			handler.@com.ait.toolkit.sencha.ext.client.events.grid.CellMouseDownHandler::onCellMouseDown(Lcom/ait/toolkit/sencha/ext/client/events/grid/CellMouseDownEvent;)(event);
			;
		};
		var eventName = @com.ait.toolkit.sencha.ext.client.events.grid.CellMouseDownEvent::EVENT_NAME;
		component.addListener(eventName, fn);
		var toReturn = @com.ait.toolkit.sencha.ext.client.events.HandlerRegistration::new(Lcom/ait/toolkit/sencha/ext/client/core/Component;Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(this,eventName,fn);
		return toReturn;
    }-*/;

    private native void _addBeforeActionHandlerHandler(String event, BeforeActionHandler handler)/*-{
		var component = this.@com.ait.toolkit.sencha.ext.client.core.Component::getOrCreateJsObj()();
		component
				.addListener(
						event,
						$entry(function(t, td, cellIndex, rec, tr, rowIndex, e) {
							var cmp = @com.ait.toolkit.sencha.ext.client.ui.TableView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(t);
							var record = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(rec);
							var event = @com.ait.toolkit.sencha.shared.client.core.EventObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
							return handler.@com.ait.toolkit.sencha.ext.client.events.grid.BeforeActionHandler::onAction(Lcom/ait/toolkit/sencha/ext/client/ui/TableView;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/data/client/BaseModel;Lcom/google/gwt/dom/client/Element;ILcom/ait/toolkit/sencha/shared/client/core/EventObject;)(cpm,tr, cellIndex, record, tr, rowIndex,event);
						}));
    }-*/;

}
