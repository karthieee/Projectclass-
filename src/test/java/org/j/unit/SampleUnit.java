package org.j.unit;

import java.io.File;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleUnit {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Before
	public void beforeEachTest() {
		java.util.Date date = new java.util.Date();
		System.out.println(date);
	}
	@After
	public void afterEachTest() throws IOException {
		java.util.Date d = new java.util.Date();
		System.out.println(d);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(screenshotAs, new File("Fb homepage.png"));
	}
	@Test
	public void tc0() {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Karthi");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("1234");
	}
	@Test
	public void tc1() {
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
}
