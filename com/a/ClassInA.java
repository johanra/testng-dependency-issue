package com.a;


import org.testng.Assert;
import org.testng.annotations.Test;


public class ClassInA {

	@Test (//dependsOnGroups = { "btests" },
			groups={"atests","alltests"})
	public void testInA() {
		Assert.assertTrue(true);
	}
}
