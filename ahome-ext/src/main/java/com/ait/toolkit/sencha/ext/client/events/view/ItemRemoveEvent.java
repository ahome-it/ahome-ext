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
import com.ait.toolkit.sencha.shared.client.data.NodeInterface;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ItemRemoveEvent extends EventObject {

    public static String EVENT_NAME = Event.ITEM_REMOVE;

    private NodeInterface node;
    private NodeInterface nodeToRemove;
    private boolean move;

    /**
     * UiBinder implementations
     */
    private static Type<ItemRemoveHandler> TYPE = new Type<ItemRemoveHandler>(EVENT_NAME, null);

    public static Type<ItemRemoveHandler> getType() {
        return TYPE;
    }

    public static Type<ItemRemoveHandler> getAssociatedType() {
        return TYPE;
    }

    public ItemRemoveEvent(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public ItemRemoveEvent(NodeInterface node, NodeInterface nodeToRemove, boolean move, JavaScriptObject nativeEvent) {
        super(nativeEvent);
        this.node = node;
        this.nodeToRemove = nodeToRemove;
        this.move = move;
    }

    /**
     * @return the node
     */
    public NodeInterface getNode() {
        return node;
    }

    /**
     * @return the nodeToRemove
     */
    public NodeInterface getNodeToRemove() {
        return nodeToRemove;
    }

    /**
     * @return the move
     */
    public boolean isMove() {
        return move;
    }

}
