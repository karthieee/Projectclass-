package org.testng.parallel;

import org.testng.annotations.Test;

public class TestSample3 {
	@Test
	private void tc1() {
		System.out.println("Method 1");
		System.out.println("TestSample3" + Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		System.out.println("Method 2");
		System.out.println("TestSample3" + Thread.currentThread().getId());
	}

	@Test
	private void tc3() {
		System.out.println("Method 3");
		System.out.println("TestSample3" + Thread.currentThread().getId());
	}

}
