package org.sampl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSample1 {

	@Parameters({ "username", "password" })

	@Test

	private void tc1(@Optional("Stringreference") String s, String s1) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);

	}

}
