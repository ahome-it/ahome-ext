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
package com.ait.toolkit.sencha.ext.client.events.view;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.ext.client.ui.TableView;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ItemMouseUpEvent extends EventObject {

    public static String EVENT_NAME = Event.ITEM_MOUSE_UP;
    private Element item;
    private BaseModel record;
    private int index;

    private TableView source;

    /**
     * UiBinder implementations
     */
    private static Type<ItemMouseUpHandler> TYPE = new Type<ItemMouseUpHandler>(EVENT_NAME, null);

    public static Type<ItemMouseUpHandler> getType() {
        return TYPE;
    }

    public static Type<ItemMouseUpHandler> getAssociatedType() {
        return TYPE;
    }

    public ItemMouseUpEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public ItemMouseUpEvent(TableView source, BaseModel record, Element item, int index, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.source = source;
        this.item = item;
        this.record = record;
        this.index = index;
    }

    /**
     * @return the source
     */
    public TableView getView() {
        return source;
    }

    /**
     * @return the item
     */
    public Element getItem() {
        return item;
    }

    /**
     * @return the record
     */
    public BaseModel getRecord() {
        return record;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

}
