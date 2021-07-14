package org.testng.parallel;

import org.testng.annotations.Test;

public class TestSample2 {
	
	@Test
	private void tc1() {
		System.out.println("Method 1");
		System.out.println("TestSample2"   +   Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		System.out.println("Method 2");
		System.out.println("TestSample2"  +   Thread.currentThread().getId());
	}

	@Test
	private void tc3() {
		System.out.println("Method 3");
		System.out.println("TestSample2"   +   Thread.currentThread().getId());
	}

}
