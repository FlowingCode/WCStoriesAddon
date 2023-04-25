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

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Wrapper for web component https://github.com/gugadev/wc-stories
 *
 * <p>This component shows a group of images like Instagram stories or Whatsapp states.
 *
 * @author Paola De Bartolo / Flowing Code
 */
@SuppressWarnings("serial")
@Tag("wc-stories")
@NpmPackage(value = "web-animations-js", version = "^2.3.1")
@NpmPackage(value = "@gugadev/wc-stories", version = "^1.0.0")
@NpmPackage(value = "custom-elements-native-shim", version = "1.0.0")
@NpmPackage(value = "@types/express-serve-static-core", version = "4.17.30")
@NpmPackage(value = "@types/express", version = "4.17.14")
@JsModule("web-animations-js/web-animations.min.js")
@JsModule("./storify/dist/index.js")
public class WCStories extends Component implements HasComponents {

  public WCStories(List<String> storiesPaths) {
    List<WCStoriesStory> stories = generateStoriesItems(storiesPaths);
    this.setStories(stories);
  }

  private List<WCStoriesStory> generateStoriesItems(List<String> storiesPaths) {
    return storiesPaths.stream().map(WCStoriesStory::new).collect(Collectors.toList());
  }

  /**
   * Sets border radius. Default radius value: 0.
   * 
   * @param radius
   */
  public void setRadius(Integer radius) {
    if (radius != null) {
      this.getElement().setAttribute("radius", String.valueOf(radius));
    }
  }

  /**
   * Sets initial image index to show. Default index value: 0.
   * 
   * @param startAt
   */
  public void setStartAt(Integer startAt) {
    if (startAt != null) {
      this.getElement().setAttribute("startAt", String.valueOf(startAt));
    }
  }

  /**
   * Sets visibility time of images and animation. Default value: 5000.
   * 
   * @param duration
   */
  public void setDuration(Integer duration) {
    if (duration != null) {
      this.getElement().setAttribute("duration", String.valueOf(duration));
    }
  }

  /**
   * Sets stories height. Default value: 480px.
   * 
   * @param height
   */
  public void setHeight(Integer height) {
    if (height != null) {
      this.getElement().setAttribute("height", String.valueOf(height));
    }
  }

  /**
   * Sets stories width. Default value: 320px.
   * 
   * @param width
   */
  public void setWidth(Integer width) {
    if (width != null) {
      this.getElement().setAttribute("width", String.valueOf(width));
    }
  }

  /**
   * Enable or disable shadow in the container. Default value: disabled (false).
   * 
   * @param withShadow
   */
  public void setWithShadow(Boolean withShadow) {
    if (withShadow != null) {
      this.getElement().setAttribute("withShadow", withShadow);
    }
  }

  /**
   * Add the {@link WCStoriesStory stories/images} to the container.
   * 
   * @param stories
   */
  public void setStories(List<WCStoriesStory> stories) {
    for (int i = 0; i < stories.size(); i++) {
      this.addComponentAtIndex(i, stories.get(i));
    }
  }
}
