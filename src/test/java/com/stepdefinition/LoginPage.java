package com.stepdefinition;

import org.base.pom.cucumber.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {

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

	public void login(String username, String password) {
		typeText(getUserName(), username);
		typeText(getPassword(), password);
		btnClick(getLogin());

	}

}
