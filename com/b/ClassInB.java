package com.b;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ClassInB {

	@Test (dependsOnGroups = { "atests" },
			groups={"btests","alltests"})
	public void testInB() {
		Assert.assertTrue(true);
	}
}
