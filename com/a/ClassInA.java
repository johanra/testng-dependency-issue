package com.a;

import junit.framework.Assert;

import org.testng.annotations.Test;


public class ClassInA {

	@Test (dependsOnMethods = { "testInB" },
			groups={"atests","alltests"})
	public void testInA() {
		Assert.assertTrue(true);
	}
}
