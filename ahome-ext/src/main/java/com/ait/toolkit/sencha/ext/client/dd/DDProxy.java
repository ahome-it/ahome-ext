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
package com.ait.toolkit.sencha.ext.client.dd;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * @author Alain Ekambi
 */
public class DDProxy extends DD {

    public DDProxy(JavaScriptObject jsObj) {
        super(jsObj);
    }

    public DDProxy(String id) {
        super(id);
    }

    public DDProxy(String id, String sGroup) {
        super(id, sGroup);
    }

    public DDProxy(String id, String sGroup, DragDropProxyConfig config) {
        super(id, sGroup, config);
    }

    public DDProxy(Component component) {
        super(component);
    }

    public DDProxy(Component component, String sGroup) {
        super(component, sGroup);
    }

    public DDProxy(Component component, String sGroup, DragDropConfig config) {
        super(component, sGroup, config);
    }

    public DDProxy(Element el, String sGroup, DragDropConfig config) {
        super(el, sGroup, config);
    }

    protected native JavaScriptObject create(String id, String sGroup, JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.DDProxy(id, sGroup, config);
    }-*/;

    protected native JavaScriptObject create(Element element, String sGroup, JavaScriptObject config)/*-{
		return new $wnd.Ext.dd.DDProxy(element, sGroup, config);
    }-*/;

    public native boolean isCenterFrame() /*-{
		var ddProxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return ddProxy.centerFrame ? true : false;
    }-*/;

    public native void setCenterFrame(boolean centerFrame) /*-{
		var ddProxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		ddProxy.centerFrame = centerFrame;
    }-*/;

    public native boolean isResizeFrame() /*-{
		var ddProxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return ddProxy.resizeFrame ? true : false;
    }-*/;

    public native void setResizeFrame(boolean resizeFrame) /*-{
		var ddProxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		ddProxy.resizeFrame = resizeFrame;
    }-*/;

    public native void createFrame() /*-{
		var ddProxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		ddProxy.createFrame();
    }-*/;

    public native void initFrame() /*-{
		var ddProxy = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		ddProxy.initFrame();
    }-*/;
}
