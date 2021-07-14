package org.locator;

import org.base.BaseClassCr;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomBookHotel extends BaseClassCr {
	
	
	public PomBookHotel() {	
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "first_name")
	private WebElement firstName;
	@FindBy(name = "last_name")
	private WebElement lastName;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(name = "cc_num")
	private WebElement creditCardNo;

	@FindBy(name = "cc_type")
	private WebElement cardType;

	@FindBy(name = "cc_exp_month")
	private WebElement expMonth;

	@FindBy(name = "cc_exp_year")
	private WebElement expYear;

	@FindBy(name = "cc_cvv")
	private WebElement cvvNo;

	@FindBy(name = "book_now")
	private WebElement bookClick;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvvNo() {
		return cvvNo;
	}
	public WebElement getBookClick() {
		return bookClick;
	}

}
