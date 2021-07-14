package org.j.unit;

import org.junit.Assert;
import org.junit.Test;

public class Sample {

	@Test

	public void tco() {

		String s = "ab";

		Assert.assertEquals("ab", s);

		System.out.println(1);
		System.out.println(2);

	}

	@Test

	public void tc1() {
		System.out.println("Sample");

	}

	@Test

	public void tc2() {
		System.out.println("Sample 2");

	}

}
