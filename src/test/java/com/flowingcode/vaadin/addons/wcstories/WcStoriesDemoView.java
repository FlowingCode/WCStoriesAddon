/*-
 * #%L
 * WC Stories Addon
 * %%
 * Copyright (C) 2020 - 2021 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.flowingcode.vaadin.addons.wcstories;

import com.flowingcode.vaadin.addons.DemoLayout;
import com.flowingcode.vaadin.addons.GithubLink;
import com.flowingcode.vaadin.addons.demo.TabbedDemo;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route(value = "wcstories", layout = DemoLayout.class)
@GithubLink("https://github.com/FlowingCode/WCStoriesAddon")
public class WcStoriesDemoView extends TabbedDemo {

	private static final String WC_STORIES_DEMO = "WC Stories Demo";
	private static final String WC_STORIES_SOURCE = "https://github.com/FlowingCode/WCStoriesAddon/blob/master/src/test/java/com/flowingcode/vaadin/addons/wcstories/WcStoriesDemo.java";

	public WcStoriesDemoView() {
		addDemo(new WcStoriesDemo(), WC_STORIES_DEMO, WC_STORIES_SOURCE);
		setSizeFull();
	}
}
