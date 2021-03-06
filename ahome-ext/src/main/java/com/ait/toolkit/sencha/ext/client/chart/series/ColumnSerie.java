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
package com.ait.toolkit.sencha.ext.client.chart.series;

import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Creates a Column Chart. Much of the methods are inherited from Bar. A Column
 * Chart is a useful visualization technique to display quantitative information
 * for different categories that can show some progression (or regression) in
 * the data set. As with all other series, the Column Series must be appended in
 * the series Chart array configuration. See the Chart documentation for more
 * information.
 * 
 * @author alainekambi
 * 
 */
public class ColumnSerie extends BarSerie {

    public ColumnSerie() {
        jsObj = JsoHelper.createObject();
        this.setType("column");
    }

    protected ColumnSerie(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static ColumnSerie cast(AbstractSerie serie) {
        return new ColumnSerie(serie.getJsObj());
    }

}
