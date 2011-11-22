package com.b;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ClassInB {

	@Test (
			groups={"btests","alltests"})
	public void testInB() {
		Assert.assertTrue(true);
	}
}
