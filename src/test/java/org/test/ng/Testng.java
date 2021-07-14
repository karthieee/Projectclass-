package org.test.ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng {

	@Test(groups = "@smoke")
	private void tc0() {

		System.out.println("Test 1");
	}

	@Test(groups = "@reg", dependsOnGroups = "@smoke", alwaysRun = true)
	private void tc1() {
		System.out.println("Test 2");
	}

	@Test(groups = "@sanity")
	private void tc2() {
		System.out.println("Test 3");
	}

	@Test(groups = "@reg", dependsOnGroups = "@smoke")
	private void tc3() {
		System.out.println("Test 4");
	}

}
