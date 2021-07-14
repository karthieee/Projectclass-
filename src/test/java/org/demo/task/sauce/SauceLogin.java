package org.demo.task.sauce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLogin {

	static WebDriver driver;
	@BeforeClass
	@Parameters({ "user-name", "password" })
	private void tc0(String s, String s1) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}
	@Test
	private void tc1() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("about_sidebar_link")).click();
		driver.navigate().back();
	}
	@Test
	private void tc2() {
		driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("shopping_cart_container")).click();
	}
	@Test
	private void tc3() {
		driver.findElement(By.id("checkout")).click();
	}
	@Test
	private void tc4() {
		driver.findElement(By.id("first-name")).sendKeys("Karthi");
		driver.findElement(By.id("last-name")).sendKeys("keyan");
		driver.findElement(By.id("postal-code")).sendKeys("012343");
		driver.findElement(By.id("continue")).click();
	}
	

}