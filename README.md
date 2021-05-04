# WC Stories Addon

Vaadin 14 Java integration of [@gugadev/wc-stories](https://www.npmjs.com/package/@gugadev/wc-stories)

## Online demo

[Online demo here]()

## Building and running demo

- git clone repository
- mvn clean install jetty:run

To see the demo, navigate to http://localhost:8080/

## Release notes


## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:

- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

WC Stories Addon is written by Flowing Code S.A.


# Developer Guide

## Using the component

Here is a simple example on how to try out the add-on component:

```java
WCStories wcstories = new WCStories(Arrays.asList("/images/story_1.png", "/images/story_2.png"));
wcstories.setHeight(655);
wcstories.setWidth(370);
```