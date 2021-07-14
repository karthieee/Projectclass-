package org.locator;

import org.base.BaseClassCr;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClassCr {

	public SearchHotel() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "location")
	private WebElement selectLoc;

	@FindBy(name = "hotels")
	private WebElement selectHotel;

	@FindBy(name = "room_type")
	private WebElement selectRoom;

	@FindBy(name = "room_nos")
	private WebElement selectRoomNo;

	@FindBy(name = "datepick_in")
	private WebElement dateIn;

	@FindBy(name = "datepick_out")
	private WebElement dateOut;

	@FindBy(name = "adult_room")
	private WebElement adultPer;

	@FindBy(name = "child_room")
	private WebElement childPer;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnSearch;
	

	public WebElement getSelectLoc() {
		return selectLoc;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoom() {
		return selectRoom;
	}

	public WebElement getSelectRoomNo() {
		return selectRoomNo;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdultPer() {
		return adultPer;
	}

	public WebElement getChildPer() {
		return childPer;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

}
