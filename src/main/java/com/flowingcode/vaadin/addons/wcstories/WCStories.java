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

import java.util.List;
import java.util.stream.Collectors;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

/**
 * Wrapper for web component https://github.com/gugadev/wc-stories 
 * 
 * This component shows a group of images like Instagram stories or Whatsapp states.
 * 
 *  
 * @author Paola De Bartolo / Flowing Code
 * 
 */
@SuppressWarnings("serial")
@Tag("wc-stories")
@NpmPackage(value = "web-animations-js", version = "^2.3.1")
@NpmPackage(value = "@gugadev/wc-stories", version = "^1.0.0")
@JsModule("@webcomponents/webcomponentsjs/custom-elements-es5-adapter.js")
@JsModule("@webcomponents/webcomponentsjs/webcomponents-loader.js")
@JsModule("web-animations-js/web-animations.min.js")
@JavaScript("@gugadev/wc-stories/index.js")
public class WCStories extends Component implements HasComponents {
	
	public WCStories(List<String> storiesPaths) {
		List<WCStoriesStory> stories = generateStoriesItems(storiesPaths);		
		this.setStories(stories);
	}	
	
	private List<WCStoriesStory> generateStoriesItems(List<String> storiesPaths) {
		return storiesPaths.stream().map(WCStoriesStory::new).collect(Collectors.toList());
	}
	
	public void setRadius(Integer radius) {
		if(radius != null) {
			this.getElement().setAttribute("radius", String.valueOf(radius));
		}
	}

	public void setStartAt(Integer startAt) {
		if(startAt != null) {
			this.getElement().setAttribute("startAt", String.valueOf(startAt));
		}			
	}

	public void setDuration(Integer duration) {
		if(duration != null) {
			this.getElement().setAttribute("duration", String.valueOf(duration));
		}
	}

	public void setHeight(Integer height) {
		if(height != null) {
			this.getElement().setAttribute("height", String.valueOf(height));
		}
	}
	
	public void setWidth(Integer width) {
		if(width != null) {
			this.getElement().setAttribute("width", String.valueOf(width));
		}
	}

	public void setWithShadow(Boolean withShadow) {
		if(withShadow != null) {
			this.getElement().setAttribute("withShadow", withShadow);
		}
	}
	
	public void setStories(List<WCStoriesStory> stories) {
		for (int i = 0; i < stories.size(); i++) {
			this.addComponentAtIndex(i, stories.get(i));
		}		
	}
	
}
