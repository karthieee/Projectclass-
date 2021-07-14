package org.test.ng;

import org.testng.annotations.Test;

public class Parallel {

	@Test
	private void tc0() {
		System.out.println("Method 1");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc1() {
		System.out.println("Method 2");
		System.out.println(Thread.currentThread().getId());
	}

	@Test
	private void tc2() {
		System.out.println("Method 3");
		System.out.println(Thread.currentThread().getId());
	}

}
