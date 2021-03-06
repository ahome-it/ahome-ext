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
package com.ait.toolkit.sencha.ext.client.grid.column;

import java.util.Arrays;
import java.util.List;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.ait.toolkit.sencha.ext.client.events.grid.ActionColumnHandler;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * A Grid header type which renders an icon, or a series of icons in a grid
 * cell, and offers a scoped click handler for each icon.
 * 
 * @author alainekambi
 * 
 */
public class ActionGridColumn extends GridColumn {

	public ActionGridColumn() {
		setXType(XType.ACTION_COLUMN.getValue());
	}

	protected ActionGridColumn(JavaScriptObject obj) {
		super(obj);
	}

	/**
	 * The alt text to use for the image element.
	 * <p>
	 * Defaults to: ""
	 * 
	 * @param text
	 */
	public void setAltText(String text) {
		JsoHelper.setAttribute(getJsObj(), "altText", text);
	}

	/**
	 * An Array which may contain multiple icon definitions
	 */
	public void setItems(List<Action> values) {
		JsArray<JavaScriptObject> jsos = JsArray.createArray().cast();
		for (Action a : values) {
			jsos.push(a.getJsObj());
		}
		JsoHelper.setAttribute(getJsObj(), "items", jsos);
	}

	/**
	 * An Array which may contain multiple icon definitions
	 */
	public void setItems(Action... values) {
		setItems(Arrays.asList(values));
	}

	/**
	 * A function called when the icon is clicked. The table row clicked upon.
	 */
	public void setHandler(ActionColumnHandler handler) {
		JsoHelper.setAttribute(getJsObj(), "handler", createHandler(handler));
	}

	/**
	 * The URL of an image to display as the clickable element in the column.
	 * <p>
	 * Defaults to Ext.BLANK_IMAGE_URL.
	 */
	public void setIcon(String value) {
		JsoHelper.setAttribute(getJsObj(), "icon", value);
	}

	/**
	 * A CSS class to apply to the icon image. To determine the class
	 * dynamically, configure the Column with a getClass function.
	 */
	public void setIconCls(String value) {
		JsoHelper.setAttribute(getJsObj(), "iconCls", value);
	}

	/**
	 * A CSS class to apply to the icon image. To determine the class
	 * dynamically, configure the Column with a getClass function.
	 */
	public void setStopSelection(boolean value) {
		JsoHelper.setAttribute(getJsObj(), "stopSelection", value);
	}

	/**
	 * A tooltip message to be displayed on hover.
	 */
	public void setTooltip(String value) {
		JsoHelper.setAttribute(getJsObj(), "tooltip", value);
	}

	/**
	 * Disables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void disableAction(ActionGridColumn index)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item
				.disableAction(index.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Disables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void disableAction(int index)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item.disableAction(index);
	}-*/;

	/**
	 * Disables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void disableAction(ActionGridColumn index, boolean silent)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item
				.disableAction(
						index.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						silent);
	}-*/;

	/**
	 * Disables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void disableAction(int index, boolean silent)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item.disableAction(index, silent);
	}-*/;

	/**
	 * Enables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void enableAction(ActionGridColumn index)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item
				.enableAction(index.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	/**
	 * Enables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void enableAction(int index)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item.enableAction(index);
	}-*/;

	/**
	 * Enables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void enableAction(ActionGridColumn index, boolean silent)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item
				.enableAction(
						index.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						silent);
	}-*/;

	/**
	 * Enables this ActionColumn's action at the specified index.
	 * 
	 * @param index
	 */
	public native void enableAction(int index, boolean silent)/*-{
		var item = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		item.enableAction(index, silent);
	}-*/;

	public static ActionGridColumn cast(GridColumn obj) {
		return new ActionGridColumn(obj.getJsObj());
	}

	private native JavaScriptObject createHandler(ActionColumnHandler handler)/*-{
		return function(view, rowIndex, colIndex, item, e, m) {
			var view = @com.ait.toolkit.sencha.ext.client.ui.DataView::new(Lcom/google/gwt/core/client/JavaScriptObject;)(grid);
			var event = @com.ait.toolkit.sencha.shared.client.core.EventObject::new(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
			var model = @com.ait.toolkit.data.client.TableItem::new(Lcom/google/gwt/core/client/JavaScriptObject;)(m);
			return renderer.@com.ait.toolkit.sencha.ext.client.events.grid.ActionColumnHandler::onAction(Lcom/ait/toolkit/sencha/ext/client/ui/DataView;IILcom/google/gwt/core/client/JavaScriptObject;Lcom/ait/toolkit/sencha/shared/client/core/EventObject;Lcom/ait/toolkit/data/client/TableItem;)(view,rowIndex, colIndex, item, event, model);
		};
	}-*/;

}
