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

import com.ait.toolkit.sencha.ext.client.core.config.XType;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A Column definition class which renders a numeric data field according to a
 * format string.
 * 
 * @author alainekambi
 * 
 */
public class RowNumbererColumn extends GridColumn {

    public RowNumbererColumn() {
        setXType(XType.ROW_NUMEBERER_COLUMN.getValue());
        this.setFlex(1);
    }

    public RowNumbererColumn(String title) {
        this();
        setHeader(title);
    }

    protected RowNumbererColumn(JavaScriptObject obj) {
        super(obj);
    }

    public static RowNumbererColumn cast(GridColumn obj) {
        return new RowNumbererColumn(obj.getJsObj());
    }

}
