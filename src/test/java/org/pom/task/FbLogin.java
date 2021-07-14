package org.pom.task;

import org.base.BaseClassCr;
import org.openqa.selenium.WebElement;

public class FbLogin extends BaseClassCr {

	public static void main(String[] args) {

		BaseClassCr b = new BaseClassCr();

		b.getDriver();

		b.launchUrl("https://www.facebook.com/");

		TaskPom t = new TaskPom();

		WebElement txtUserName = t.getTxtUserName();
		b.typeText(txtUserName, "Karthi");

		WebElement txtPassword = t.getTxtPassword();
		b.typeText(txtPassword, "12345");

		WebElement btnLogin = t.getBtnLogin();
		b.btnClick(btnLogin);

	}

}
