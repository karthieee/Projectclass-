package org.junit.task;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskUnit {

	static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

	}

	@Test
	public void tc0() {
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("hc")).click();
	}

	@Test
	public void tc1() {
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[text()='Sign in with Google'][1]")).click();
	}

	@Test
	public void tc2() {
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.findElement(By.id("identifierId")).sendKeys("karthi");
	}
}
