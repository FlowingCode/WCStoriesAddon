package com.flowingcode.vaadin.addons.wcstories.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.flowingcode.vaadin.addons.DemoLayout;
import com.flowingcode.vaadin.addons.wcstories.WcStoriesDemoView;
import com.vaadin.flow.router.Route;

public class LayoutTest {

	@Test
	public void testDemoLayout() {
		Route route = WcStoriesDemoView.class.getAnnotation(Route.class);
		assertEquals("com.flowingcode.vaadin.addons.DemoLayout",DemoLayout.class.getName());
		assertEquals(DemoLayout.class, route.layout());
		assertNotEquals("", route.value());
	}
	
}
