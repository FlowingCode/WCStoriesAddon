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

import com.vaadin.flow.component.html.Div;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("serial")
public class WcStoriesDemo extends Div {

  public WcStoriesDemo() {
    List<String> storiesPaths =
        Arrays.asList(
            "/images/story_1.png",
            "/images/story_2.png",
            "/images/story_3.png",
            "/images/story_4.png");

    WCStories wcstories = new WCStories(storiesPaths);
    wcstories.setHeight(655);
    wcstories.setWidth(370);
    wcstories.setWithShadow(true);
    add(wcstories);
  }
}
