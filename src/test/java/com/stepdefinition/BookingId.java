package com.stepdefinition;

import org.base.pom.cucumber.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingId extends BaseClass {

	public BookingId() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")

	private WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}

	public void confirmOrderId() {
		getValueByAttribute(getOrderId(), "value");
	}

}
