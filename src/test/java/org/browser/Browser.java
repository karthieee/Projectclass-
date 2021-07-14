package org.browser;

import org.base.BaseClassCr;
import org.locator.PomBookHotel;
import org.locator.PomLogin;
import org.locator.PomSelectHotel;
import org.locator.SearchHotel;
import org.openqa.selenium.WebElement;

public class Browser extends BaseClassCr {

	public static void main(String[] args) {

		Browser bc = new Browser();

		bc.getDriver();
		bc.launchUrl("http://adactinhotelapp.com/");

		// Login Page

		PomLogin l = new PomLogin();

		WebElement userName = l.getUserName();

		bc.typeText(userName, "karthikeyaneee");

		WebElement password = l.getPassword();

		bc.typeText(password, "123456");

		WebElement login = l.getLogin();

		bc.btnClick(login);

		// Search Hotel Page

		SearchHotel s = new SearchHotel();

		WebElement selectLoc = s.getSelectLoc();

		bc.selectVisibleText(selectLoc, "Melbourne");

		WebElement selectHotel = s.getSelectHotel();

		bc.selectVisibleText(selectHotel, "Hotel Sunshine");

		WebElement selectRoom = s.getSelectRoom();

		bc.selectVisibleText(selectRoom, "Super Deluxe");

		WebElement selectRoomNo = s.getSelectRoomNo();

		bc.selectVisibleText(selectRoomNo, "1 - One");

		WebElement adultPer = s.getAdultPer();

		bc.selectVisibleText(adultPer, "2 - Two");

		WebElement childPer = s.getChildPer();

		bc.selectVisibleText(childPer, "0 - None");

		WebElement btnSearch = s.getBtnSearch();

		bc.btnClick(btnSearch);

		// Select Hotel page

		PomSelectHotel h = new PomSelectHotel();
		WebElement radioBtnClick = h.getRadioBtnClick();
		bc.btnClick(radioBtnClick);

		WebElement continueClick = h.getContinueClick();
		bc.btnClick(continueClick);

		// Book Hotel

		PomBookHotel b = new PomBookHotel();
		WebElement firstName = b.getFirstName();
		bc.typeText(firstName, "karthi");

		WebElement lastName = b.getLastName();
		bc.typeText(lastName, "keyan");

		WebElement address = b.getAddress();
		bc.typeText(address, "chennai");

		WebElement creditCardNo = b.getCreditCardNo();
		bc.typeText(creditCardNo, "6534123890563789");

		WebElement cardType = b.getCardType();
		bc.selectIndex(cardType, 2);

		WebElement expMonth = b.getExpMonth();
		bc.selectIndex(expMonth, 5);

		WebElement expYear = b.getExpYear();
		bc.selectVisibleText(expYear, "2022");

		WebElement cvvNo = b.getCvvNo();
		bc.typeText(cvvNo, "500");

		WebElement bookClick = b.getBookClick();
		bc.btnClick(bookClick);

	}

}
