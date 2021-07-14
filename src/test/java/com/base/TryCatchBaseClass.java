package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TryCatchBaseClass {

	public static WebDriver driver;

	public void getDriver(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\12.30PmFrameworkJuneBatch\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver", "D:\\12.30PmFrameworkJuneBatch\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else if (browserName.equalsIgnoreCase("egde")) {
				System.setProperty("webdriver.edge.driver", "D:\\12.30PmFrameworkJuneBatch\\Driver\\geckodriver.exe");
				driver = new EdgeDriver();
			} else {
				System.out.println("Invalid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void launhUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {

			System.out.println(e);
		}

	}

	public void typeText(WebElement element, String data) {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				element.sendKeys(data);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void btnClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public WebElement findById(String data, String id) {
		WebElement findElement = null;
		try {
			if (data.equalsIgnoreCase("Id")) {
				findElement = driver.findElement(By.id(id));
			} else if (data.equalsIgnoreCase("xpath")) {
				findElement = driver.findElement(By.xpath(id));
			} else if (data.equalsIgnoreCase("classname")) {
				findElement = driver.findElement(By.name(id));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return findElement;

	}

	public void moveToElement(WebElement target) {

		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(target).perform();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public String getValueByAttribute(WebElement element) {
		String attribute = null;
		try {
			attribute = element.getAttribute("value");
			System.out.println(attribute);
		} catch (Exception e) {
			System.out.println(e);
		}
		return attribute;

	}

	public void selectByDropDown(String name, WebElement element, String data) {

		try {
			Select select = new Select(element);
			if (name.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(data));

			} else if (name.equalsIgnoreCase("value")) {
				select.selectByValue(data);
			} else if (name.equalsIgnoreCase("visibleText")) {
				select.selectByVisibleText(data);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void enterTextByJs(String data, WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void actionByMouse(WebElement element, String data) {
		try {

			Actions ac = new Actions(driver);
			ac.keyUp(element, Keys.SHIFT).sendKeys(data).keyDown(element, Keys.SHIFT).perform();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public String getDataFromExcel(String pathName, String sheetName, int rowNo, int cellNo) {
		String value = null;
		try {
			File file = new File(pathName);
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNo);
			Cell cell = row.getCell(cellNo);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
			} else if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				value = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;

	}

	public void writeDateToExcel(String pathName, String sheetName, int rowNo, int CellNo, String value) {
		try {
			File file = new File(pathName);
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row createRow = sheet.createRow(rowNo);
			Cell createCell = createRow.createCell(CellNo);
			createCell.setCellValue(value);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			workbook.write(fileOutputStream);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
