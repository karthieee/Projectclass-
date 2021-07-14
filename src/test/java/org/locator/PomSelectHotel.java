package org.locator;

import org.base.BaseClassCr;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomSelectHotel extends BaseClassCr {

	public PomSelectHotel() {

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

}
