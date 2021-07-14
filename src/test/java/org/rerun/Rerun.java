package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun {

	@Test
	private void tc0() {
		System.out.println("Method 1");
	}

	@Test
	private void tc1() {
		Assert.assertTrue(false);
		System.out.println("Method 2");
	}

	@Test
	private void tc2() {
		System.out.println("Method 3");
	}

}
