package org.j.unit;

import org.base.BaseClassCr;
import org.junit.BeforeClass;
import org.junit.Test;
import org.locator.PomBookHotel;
import org.locator.PomLogin;
import org.locator.PomSelectHotel;
import org.locator.SearchHotel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel extends BaseClassCr {

	@BeforeClass

	public static void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@Test

	public void tc0() {
		BaseClassCr b = new BaseClassCr();
		PomLogin p = new PomLogin();

		WebElement userName = p.getUserName();
		b.typeText(userName, "karthikeyaneee");

		WebElement password = p.getPassword();
		b.typeText(password, "123456");

		WebElement login = p.getLogin();
		b.btnClick(login);

	}

	@Test

	public void tc1() {
		BaseClassCr b = new BaseClassCr();
		SearchHotel s = new SearchHotel();

		WebElement selectLoc = s.getSelectLoc();
		b.selectVisibleText(selectLoc, "Melbourne");

		WebElement selectHotel = s.getSelectHotel();
		b.selectVisibleText(selectHotel, "Hotel Sunshine");

		WebElement selectRoom = s.getSelectRoom();
		b.selectVisibleText(selectRoom, "Super Deluxe");

		WebElement selectRoomNo = s.getSelectRoomNo();
		b.selectVisibleText(selectRoomNo, "1 - One");

		WebElement dateIn = s.getDateIn();
		b.clear(dateIn);
		b.typeText(dateIn, "22/06/21");

		WebElement dateOut = s.getDateOut();
		b.clear(dateOut);
		b.typeText(dateOut, "25/06/21");

		WebElement adultPer = s.getAdultPer();
		b.selectVisibleText(adultPer, "2 - Two");

		WebElement childPer = s.getChildPer();
		b.selectVisibleText(childPer, "0 - None");

		WebElement btnSearch = s.getBtnSearch();
		b.btnClick(btnSearch);

	}

	@Test

	public void tc2() {
		BaseClassCr b = new BaseClassCr();
		PomSelectHotel sh = new PomSelectHotel();

		WebElement radioBtnClick = sh.getRadioBtnClick();
		b.btnClick(radioBtnClick);

		WebElement continueClick = sh.getContinueClick();
		b.btnClick(continueClick);

	}

	@Test

	public void tc3() {
		BaseClassCr b = new BaseClassCr();
		PomBookHotel h = new PomBookHotel();

		WebElement firstName = h.getFirstName();
		b.typeText(firstName, "karthi");

		WebElement lastName = h.getLastName();
		b.typeText(lastName, "keyan");

		WebElement address = h.getAddress();
		b.typeText(address, "chennai");

		WebElement creditCardNo = h.getCreditCardNo();
		b.typeText(creditCardNo, "6534123890563789");

		WebElement cardType = h.getCardType();
		b.selectIndex(cardType, 2);

		WebElement expMonth = h.getExpMonth();
		b.selectIndex(expMonth, 5);

		WebElement expYear = h.getExpYear();
		b.selectVisibleText(expYear, "2022");

		WebElement cvvNo = h.getCvvNo();
		b.typeText(cvvNo, "500");

		WebElement bookClick = h.getBookClick();
		b.btnClick(bookClick);

	}

}
