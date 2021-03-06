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

import java.util.List;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.ext.client.events.Event;
import com.ait.toolkit.sencha.shared.client.data.Store;
import com.ait.toolkit.sencha.shared.client.util.Grouper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class GroupChangeEvent extends EventObject {

	public static String EVENT_NAME = Event.GROUP_CHANGE;
	private Store store;
	private List<Grouper> groupers;

	/**
	 * UiBinder implementations
	 */
	private static Type<GroupChangeHandler> TYPE = new Type<GroupChangeHandler>(
			EVENT_NAME, null);

	public static Type<GroupChangeHandler> getType() {
		return TYPE;
	}

	public static Type<GroupChangeHandler> getAssociatedType() {
		return TYPE;
	}

	public GroupChangeEvent(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public GroupChangeEvent(Store store, List<Grouper> groupers,
			JavaScriptObject nativeEvent) {
		super(nativeEvent);
		this.store = store;
		this.groupers = groupers;
	}

	/**
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}

	/**
	 * @return the groupers
	 */
	public List<Grouper> getGroupers() {
		return groupers;
	}

}
