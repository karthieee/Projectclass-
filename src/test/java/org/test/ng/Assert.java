package org.test.ng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {

	@Test

	public void tc1() {

		String s = "abcde";

		SoftAssert a = new SoftAssert();

		a.assertEquals("ABcde", s);

		a.assertAll();

		System.out.println("A");
		System.out.println("B");
		System.out.println("c");
		System.out.println("d");
		System.out.println("e");

	}

	@Test

	private void tc2() {
		System.out.println("Test2");

	}

}
