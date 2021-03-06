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
package com.ait.toolkit.sencha.ext.client.events.grid;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.TableView;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class CellMouseDownEvent extends EventObject {

    public static String EVENT_NAME = Event.CELL_MOUSE_DOWN;
    private Element td;
    private int cellIndex;
    private BaseModel record;
    private Element tr;
    private int rowIndex;

    private TableView source;

    /**
     * UiBinder implementations
     */
    private static Type<CellMouseDownHandler> TYPE = new Type<CellMouseDownHandler>(EVENT_NAME, null);

    public static Type<CellMouseDownHandler> getType() {
        return TYPE;
    }

    public static Type<CellMouseDownHandler> getAssociatedType() {
        return TYPE;
    }

    public CellMouseDownEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public CellMouseDownEvent(TableView source, Element td, int cellIndex, BaseModel record, Element tr, int rowIndex,
                    JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.td = td;
        this.cellIndex = cellIndex;
        this.record = record;
        this.rowIndex = rowIndex;
        this.tr = tr;
    }

    /**
     * @return the source
     */
    public TableView getSource() {
        return source;
    }

    /**
     * @return the td
     */
    public Element getTd() {
        return td;
    }

    /**
     * @return the cellIndex
     */
    public int getCellIndex() {
        return cellIndex;
    }

    /**
     * @return the record
     */
    public BaseModel getRecord() {
        return record;
    }

    /**
     * @return the tr
     */
    public Element getTr() {
        return tr;
    }

    /**
     * @return the rowIndex
     */
    public int getRowIndex() {
        return rowIndex;
    }

}
