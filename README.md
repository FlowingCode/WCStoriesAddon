[![Published on Vaadin Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/wc-stories-addon)
[![Stars on vaadin.com/directory](https://img.shields.io/vaadin-directory/star/wc-stories-addon.svg)](https://vaadin.com/directory/component/wc-stories-addon)
[![Build Status](https://jenkins.flowingcode.com/job/WCStories-23-addon/badge/icon)](https://jenkins.flowingcode.com/job/WCStories-23-addon)
[![Javadoc](https://img.shields.io/badge/javadoc-00b4f0)](https://javadoc.flowingcode.com/artifact/org.vaadin.addons.flowingcode/wcstories-addon)

# WC Stories Add-on

Vaadin Flow Java integration of [@gugadev/wc-stories](https://www.npmjs.com/package/@gugadev/wc-stories)

## Online demo

[Online demo here](https://addonsv24.flowingcode.com/wcstories)

## Download release

[Available in Vaadin Directory](https://vaadin.com/directory/component/wc-stories-addon)

### Maven install

Add the following dependencies in your pom.xml file:

```xml
<dependency>
   <groupId>org.vaadin.addons.flowingcode</groupId>
   <artifactId>wcstories-addon</artifactId>
   <version>X.Y.Z</version>
</dependency>
```
<!-- the above dependency should be updated with latest released version information -->

```xml
<repository>
   <id>vaadin-addons</id>
   <url>https://maven.vaadin.com/vaadin-addons</url>
</repository>
```

For SNAPSHOT versions see [here](https://maven.flowingcode.com/snapshots/).


## Building and running demo

- git clone repository
- mvn clean install jetty:run

To see the demo, navigate to http://localhost:8080/

## Release notes

See [here](https://github.com/FlowingCode/WCStoriesAddon/releases)

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. 

As first step, please refer to our [Development Conventions](https://github.com/FlowingCode/DevelopmentConventions) page to find information about Conventional Commits & Code Style requirements.

Then, follow these steps for creating a contribution:

- Fork this project.
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- For commit message, use [Conventional Commits](https://github.com/FlowingCode/DevelopmentConventions/blob/main/conventional-commits.md) to describe your change.
- Send a pull request for the original project.
- Comment on the original issue that you have implemented a fix for it.

## License & Author

This add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

WC Stories Add-on is written by Flowing Code S.A.

# Developer Guide

## Getting started

Here is a simple example on how to try out the add-on component:

```java
WCStories wcstories = new WCStories(Arrays.asList("/images/story_1.png", "/images/story_2.png"));
wcstories.setHeight(655);
wcstories.setWidth(370);
```
## Special configuration when using Spring

By default, Vaadin Flow only includes ```com/vaadin/flow/component``` to be always scanned for UI components and views. For this reason, the add-on might need to be whitelisted in order to display correctly. 

To do so, just add ```com.flowingcode``` to the ```vaadin.whitelisted-packages``` property in ```src/main/resources/application.properties```, like:

```vaadin.whitelisted-packages = com.vaadin,org.vaadin,dev.hilla,com.flowingcode```
 
More information on Spring whitelisted configuration [here](https://vaadin.com/docs/latest/integrations/spring/configuration/#configure-the-scanning-of-packages).
