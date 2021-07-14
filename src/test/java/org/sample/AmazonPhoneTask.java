package org.sample;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.base.BaseClassCr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonPhoneTask extends BaseClassCr {

	public static void main(String[] args) {

		AmazonPhoneTask a = new AmazonPhoneTask();

		a.getDriver();
		a.launchUrl("https://www.amazon.in/");

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.typeText(search, "i phone");

		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		a.btnClick(clk);

		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		Set<String> set = new TreeSet<String>();

		for (int i = 0; i < elements.size(); i++) {
			String text = elements.get(i).getText();

			String replace = text.replace(",", "");
			set.add(replace);

		}

		for (String webElement : set) {

			System.out.println(webElement);

		}
	}
}
