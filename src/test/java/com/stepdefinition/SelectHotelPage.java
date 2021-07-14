package com.stepdefinition;

import org.base.pom.cucumber.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")

	private WebElement radioBtnClick;

	@FindBy(id = "continue")

	private WebElement continueClick;

	public WebElement getRadioBtnClick() {
		return radioBtnClick;
	}

	public WebElement getContinueClick() {
		return continueClick;

	}

	public void selectHotel() {

		btnClick(getRadioBtnClick());
		btnClick(getContinueClick());

	}

}
