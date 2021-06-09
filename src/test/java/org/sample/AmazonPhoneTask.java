package org.sample;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonPhoneTask extends BaseClass {

	public static void main(String[] args) {

		AmazonPhoneTask a = new AmazonPhoneTask();

		a.getDriver();
		a.launchUrl("https://www.amazon.in/");

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		a.typeText(search, "i phone");

		WebElement clk = driver.findElement(By.id("nav-search-submit-button"));
		a.btnClick(clk);

		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for (int i = 0; i < elements.size(); i++) {
			WebElement element = elements.get(i);

			Set<WebElement> s = new TreeSet<WebElement>();
			for (WebElement webElement : s) {

				boolean addAll = s.addAll(elements);
				System.out.println(addAll);
				System.out.println(webElement);
				String text = element.getText();
				System.out.println(text);

			}

		}
	}
}
