package org.resusable.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis {

	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\FrameworkIntro\\\\Driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void launchUrl(String Url) {
		driver.get(Url);
	}

	public WebElement ByID(String path) {
		WebElement findElement = driver.findElement(By.id(path));
		return findElement;
	}

	public WebElement ByXpath(String name) {
		WebElement findElement = driver.findElement(By.xpath(name));
		return findElement;

	}

	public void btnclick(WebElement element) {
		element.click();
	}
}
