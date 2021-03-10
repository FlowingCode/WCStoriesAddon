package com.flowingcode.vaadin.addons.wcstories;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

/**
 * Represents each story component.
 * 
 * 
 * @author Paola De Bartolo / Flowing Code
 *
 */
@SuppressWarnings("serial")
@Tag("wc-stories-story")
public class WCStoriesStory extends Component {
	
	public WCStoriesStory(String src, String placeholder) {
		this.setSrc(src);
		this.setPlaceholder(placeholder);
	}
	
	public WCStoriesStory(String src) {
		this(src, null);
	}

	public void setSrc(String src) {
		this.getElement().setAttribute("src", src);
	}

	public void setPlaceholder(String placeholder) {
		if(placeholder != null) {
			this.getElement().setAttribute("placeholder", placeholder);
		}		
	}
	
	
}
