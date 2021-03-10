package com.flowingcode.vaadin.addons.wcstories;

import com.flowingcode.vaadin.addons.DemoLayout;
import com.flowingcode.vaadin.addons.GithubLink;
import com.flowingcode.vaadin.addons.demo.TabbedDemo;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route(value = "wcstories", layout = DemoLayout.class)
@GithubLink("https://github.com/FlowingCode/WcStoriesAddon")
public class WcStoriesDemoView extends TabbedDemo {

	private static final String WC_STORIES_DEMO = "WC Stories Demo";
	private static final String WC_STORIES_SOURCE = "https://github.com/FlowingCode/WcStoriesAddon/blob/master/src/test/java/com/flowingcode/vaadin/addons/wcstories/WcStoriesDemo.java";

	public WcStoriesDemoView() {
		addDemo(new WcStoriesDemo(), WC_STORIES_DEMO, WC_STORIES_SOURCE);
		setSizeFull();
	}
}
