package org.locator;

import org.base.BaseClassCr;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin extends BaseClassCr {

	public PomLogin() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")

	private WebElement userName;

	@FindBy(id = "password")

	private WebElement password;

	@FindBy(name = "login")

	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
