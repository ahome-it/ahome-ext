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
import com.ait.toolkit.sencha.shared.client.data.Store;
import com.google.gwt.core.client.JavaScriptObject;

public class TreeSelectionModel extends SelectionModel {

    protected TreeSelectionModel() {
        jsObj = JsoHelper.createObject();
    }

    public TreeSelectionModel(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static TreeSelectionModel from(SelectionModel model) {
        return new TreeSelectionModel(model.getJsObj());
    }

    /**
     * binds the store to the selModel.
     */
    public native void bindStore(Store store)/*-{
		var jso = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (jso && jso.bindStore) {
			jso
					.bindStore(store.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		}
    }-*/;

}
