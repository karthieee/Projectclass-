package org.test.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {

	@Test(dataProvider = "d")

	private void tc0(String s, String s1) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);

	}

	@org.testng.annotations.DataProvider(name = "d")

	public Object[][] getData() {
		return new Object[][] { { "karthi", "321" }, { "karthi", "12376" }, { "karthi", "123" } };

	}

}
