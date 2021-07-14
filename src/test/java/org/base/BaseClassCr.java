package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCr {

	public static WebDriver driver;

	public void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchUrl(String Url) {
		driver.get(Url);
	}

	public void typeText(WebElement ele, String data) {
		ele.sendKeys(data);
	}

	public void btnClick(WebElement ele) {
		ele.click();
	}

	public void mouseHoverAction(WebElement target) {
		Actions a = new Actions(driver);
		a.moveToElement(target).perform();

	}

	// Method for Robot
	public void keyPress(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keycode);
	}

	public void keyRelease(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyRelease(keycode);
	}

	// Method for Actions
	public void rightClick(WebElement btnClick) {
		Actions a = new Actions(driver);
		a.contextClick(btnClick).perform();
	}

	public void doubleClick(WebElement btnClick) {
		Actions a = new Actions(driver);
		a.doubleClick(btnClick).perform();
	}

	public void dragDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);
	}

	// Method for Alert
	public void simpleAlert(WebElement simple) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void confirmAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public void promptAlert(WebElement txt, String data) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(data);
	}

	public void promptText() {
		Alert a = driver.switchTo().alert();
		a.getText();
	}

	// Methods for DropDown
	public void selectValue(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public void selectIndex(WebElement element, int data) {
		Select s = new Select(element);
		s.selectByIndex(data);
	}

	public void selectVisibleText(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public void getOptions(WebElement element) {
		Select s = new Select(element);
		s.getOptions();
	}

	public void getAllSelectedOptions(List<WebElement> element) {
		Select s = new Select((WebElement) element);
		s.getAllSelectedOptions();
	}

	public void getFirstSelectedOptions(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();
	}

	public void isMultiple(WebElement multiple) {
		Select s = new Select(multiple);
		s.isMultiple();
	}

	public void deSelectByIndex(int index, WebElement element) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	public void deSelectVisible(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public void deSelectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	// Method for Windows Handling
	public void windowHandle(String id) {
		driver.switchTo().window(id);
		driver.getWindowHandle();
	}

	public void windowHandles(String all) {
		driver.getWindowHandles();
		driver.switchTo().window(all);
	}

	// isDisplayed,Selected,Enabled
	public void displayed(WebElement user, boolean b) {
		user.isDisplayed();
	}

	public void selected(WebElement btn, boolean b) {
		btn.isSelected();
	}

	public void enabled(WebElement txtbox, boolean b) {
		txtbox.isEnabled();
	}

	// Clear

	public void clear(WebElement c) {
		c.clear();

	}

}
