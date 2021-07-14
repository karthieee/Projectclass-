package com.stepdefinition;

import org.base.pom.cucumber.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

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

	@FindBy(xpath = "//input[@type='submit']")
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

	public void searchHotel(String location, String hotels, String roomType, String noOfRoom, String adultPerRoom,
			String childrenPerRoom) {

		selectVisibleText(getSelectLoc(), location);
		selectVisibleText(getSelectHotel(), hotels);
		selectVisibleText(getSelectRoom(), roomType);
		selectVisibleText(getSelectRoomNo(), noOfRoom);
		selectVisibleText(getAdultPer(), adultPerRoom);
		selectVisibleText(getChildPer(), childrenPerRoom);
		btnClick(getBtnSearch());

	}

}
