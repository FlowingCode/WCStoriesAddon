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
import com.vaadin.flow.component.Tag;

/**
 * Represents each story component. It shows an image.
 *
 * @author Paola De Bartolo / Flowing Code
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

  /**
   * Sets the image relative or absolute path.
   * 
   * @param src
   */
  public void setSrc(String src) {
    this.getElement().setAttribute("src", src);
  }

  /**
   * Sets an image URL or a base64 string.
   * 
   * @param placeholder
   */
  public void setPlaceholder(String placeholder) {
    if (placeholder != null) {
      this.getElement().setAttribute("placeholder", placeholder);
    }
  }
}
