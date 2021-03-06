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
package com.ait.toolkit.sencha.ext.client.core.config;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.ext.client.laf.Color;

public class SpriteConfig extends BaseConfig {

    public SpriteConfig() {

    }

    public void setFill(String value) {
        JsoHelper.setAttribute(jsObj, "fill", value);
    }

    public void setFill(Color value) {
        JsoHelper.setAttribute(jsObj, "fill", value.getValue());
    }

    public void setX(int value) {
        JsoHelper.setAttribute(jsObj, "x", value);
    }

    public void setStroke(String value) {
        JsoHelper.setAttribute(jsObj, "stroke", value);
    }

    public void setStroke(Color value) {
        JsoHelper.setAttribute(jsObj, "stroke", value.getValue());
    }

    public void setStrokeWidth(double value) {
        JsoHelper.setAttribute(jsObj, "stroke-width", value);
    }

    public void setOpacity(double value) {
        JsoHelper.setAttribute(jsObj, "opacity", value);
    }

}
