package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.resusable.base.XpathAxis;

public class Xpath extends XpathAxis {

	public static void main(String[] args) {

		XpathAxis x = new XpathAxis();

		x.getDriver();
		x.launchUrl("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");

		WebElement byID = x.ByID("wp-submit");
		x.btnclick(byID);

		WebElement byXpath = x.ByXpath(
				"//a[text()='test']//ancestor::td//following-sibling::td[@data-colname ='Rating']//descendant::span[@data-value = '4']");
		x.btnclick(byXpath);

	}

}
