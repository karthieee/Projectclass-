package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2Ac {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("ac", Keys.ENTER);

		List<WebElement> product = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\FrameworkIntro\\ExcelRead\\TASK.xlsx");

		FileInputStream is = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(is);

		Sheet createSheet = wb.createSheet("Amazon products - AC");

		for (int i = 0; i < product.size(); i++) {

			String text = product.get(i).getText();

			Row createRow = createSheet.createRow(i);

			Cell createCell = createRow.createCell(0);

			createCell.setCellValue(text);

		}
		FileOutputStream os = new FileOutputStream(f);
		wb.write(os);

	}

}
