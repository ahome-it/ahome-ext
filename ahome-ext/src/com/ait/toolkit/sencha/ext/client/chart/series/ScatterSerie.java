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
 * Creates a Scatter Chart. The scatter plot is useful when trying to display
 * more than two variables in the same visualization. These variables can be
 * mapped into x, y coordinates and also to an element's radius/size, color,
 * etc. As with all other series, the Scatter Series must be appended in the
 * series Chart array configuration. See the Chart documentation for more
 * information on creating charts
 * 
 * @author alainekambi
 * 
 */
public class ScatterSerie extends CartesianSerie {

    public ScatterSerie() {
        jsObj = JsoHelper.createObject();
        this.setType("scatter");
    }

    protected ScatterSerie(JavaScriptObject obj) {
        jsObj = obj;
    }

    public static ScatterSerie cast(AbstractSerie serie) {
        return new ScatterSerie(serie.getJsObj());
    }

}
