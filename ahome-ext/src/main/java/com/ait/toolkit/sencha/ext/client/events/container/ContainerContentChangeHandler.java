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
package com.ait.toolkit.sencha.ext.client.events.container;

import com.ait.toolkit.sencha.ext.client.core.Component;
import com.ait.toolkit.sencha.ext.client.ui.Container;

/**
 * Handler interface for listening to add and remove changes on a container
 * 
 * @author alainekambi
 * 
 */
public interface ContainerContentChangeHandler {
    /**
     * Fires after {@link Component} is added, inserted or removed into/from the
     * container.
     * 
     * This event bubbles:
     * 
     * @param container
     *            , the containr firing the event
     * @param component
     *            , the component beeing added/removed
     * @param index
     *            ,e index at which the component was added/removed to/from the
     *            container's items collection
     */
    public void onEvent(Container container, Component component, int index);
}
