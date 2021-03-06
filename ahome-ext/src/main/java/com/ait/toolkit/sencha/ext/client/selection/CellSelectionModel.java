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
package com.ait.toolkit.sencha.ext.client.selection;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class CellSelectionModel extends SelectionModel {

    protected CellSelectionModel() {
        jsObj = JsoHelper.createObject();
    }

    public CellSelectionModel(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static CellSelectionModel from(SelectionModel model) {
        return new CellSelectionModel(model.getJsObj());
    }

    /**
     * Sets the current position
     */
    public native void setCurrentPosition(int rowPos, int columnPos, boolean supressEvent)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (jso && jso.setCurrentPosition) {
			jso.setCurrentPosition({
				row : rowPos,
				column : columnPos
			}, supressEvent);
		}
    }-*/;

    /**
     * Sets the current position
     */
    public void setCurrentPosition(CellPosition position) {
        this.setCurrentPosition(position.getRow(), position.getColumn(), true);
    }

    /**
     * Sets the current position
     */
    public void setCurrentPosition(CellPosition position, boolean supressEvent) {
        this.setCurrentPosition(position.getRow(), position.getColumn(), supressEvent);
    }

}
