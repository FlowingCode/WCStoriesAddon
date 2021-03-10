package com.flowingcode.vaadin.addons.wcstories;

import java.util.Arrays;
import java.util.List;

import com.vaadin.flow.component.html.Div;

@SuppressWarnings("serial")
public class WcStoriesDemo extends Div {

	public WcStoriesDemo() {
    	List<String> storiesPaths = Arrays.asList("/images/story_1.png", "/images/story_2.png", "/images/story_3.png", "/images/story_4.png");
    	
    	WCStories wcstories = new WCStories(storiesPaths);
        wcstories.setHeight(658);
        wcstories.setWidth(370);
        wcstories.setWithShadow(true);
        add(wcstories);
    }
	
}
