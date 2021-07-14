package org.sampl;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSample3 {

	@DataProvider(name = "data")

	public static Object[][] getData() {
		return new Object[][]

		{ { "karthi", "123" }, { "karthi", "123" }, { "karthi", "1234" }

		};
	}
}
