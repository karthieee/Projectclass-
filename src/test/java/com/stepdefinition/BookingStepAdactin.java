package com.stepdefinition;

import org.base.pom.cucumber.BaseClass;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingStepAdactin extends BaseClass {

	WebDriver driver;

	@Given("user is on the Adactin login page")
	public void user_is_on_the_Adactin_login_page() {
		getDriver();
		launchUrl("http://adactinhotelapp.com/");

	}

	@When("user should login {string} and {string}")
	public void user_should_login_and(String username, String password) {

		LoginPage login = new LoginPage();
		login.login(username, password);
	}

	@When("user should enter {string},{string}, {string}, {string}, {string}, {string}")
	public void user_should_enter(String location, String hotels, String roomType, String noOfRoom, String adultPerRoom,
			String childrenPerRoom) {

		SearchHotelPage searchHotel = new SearchHotelPage();
		searchHotel.searchHotel(location, hotels, roomType, noOfRoom, adultPerRoom, childrenPerRoom);
	}

	@When("user should select hotel name")
	public void user_should_select_hotel_name() {

		SelectHotelPage selectHotel = new SelectHotelPage();
		selectHotel.selectHotel();
	}

	@When("user should book a hotel in booking page {string}, {string}, {string},{string},{string},{string},{string},{string}")
	public void user_should_book_a_hotel_in_booking_page(String firstname, String lastname, String address,
			String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {

		BookHotelPage bookHotel = new BookHotelPage();
		bookHotel.bookHotel(firstname, lastname, address, creditCardNo, creditCardType, expiryMonth, expiryYear,
				cvvNumber);

	}

	@Then("user should verify order Id")
	public void user_should_verify_order_Id() {

		BookingId orderId = new BookingId();
		orderId.confirmOrderId(); 

	}
}
// @When("user should click on search button")
// public void user_should_click_on_search_button() throws InterruptedException
// {
// WebElement btnSearch = driver.findElement(By.id("Submit"));
// btnSearch.click();
//
// }
//
// @When("user should select hotel name")
// public void user_should_select_hotel_name() {
// WebElement radButton = driver.findElement(By.id("radiobutton_0"));
// radButton.click();
// }
//
// @When("user should click on continue button")
// public void user_should_click_on_continue_button() {
// WebElement conClick = driver.findElement(By.id("continue"));
// conClick.click();
// }
//
// @When("user should book a hotel in booking page {string}, {string}, {string}
// and payment details")
// public void
// user_should_book_a_hotel_in_booking_page_and_payment_details(String name,
// String pass, String add,
// io.cucumber.datatable.DataTable dataTable) {
//
// WebElement first = driver.findElement(By.id("first_name"));
// first.sendKeys(name);
// WebElement last = driver.findElement(By.id("last_name"));
// last.sendKeys(pass);
// WebElement address = driver.findElement(By.id("address"));
// address.sendKeys(add);
//
// List<Map<String, String>> m = dataTable.asMaps();
// Map<String, String> e = m.get(2);
// String credit = e.get("Credit Card No");
//
// WebElement creditCard = driver.findElement(By.id("cc_num"));
// creditCard.sendKeys(credit);
//
// Map<String, String> e2 = m.get(2);
// String cardType = e2.get("Credit Card Type");
//
// WebElement creditcardType = driver.findElement(By.id("cc_type"));
// creditcardType.sendKeys(cardType);
//
// Map<String, String> e3 = m.get(2);
// String expMonth = e3.get("Select Month");
//
// WebElement month = driver.findElement(By.id("cc_exp_month"));
// month.sendKeys(expMonth);
//
// Map<String, String> e4 = m.get(1);
// String expYear = e4.get("Select Year");
//
// WebElement year = driver.findElement(By.id("cc_exp_year"));
// year.sendKeys(expYear);
//
// Map<String, String> e5 = m.get(0);
// String cvv = e5.get("CVV Number");
//
// WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
// cvvNo.sendKeys(cvv);
//
// }
//
// @When("user should click Book Now")
// public void user_should_click_Book_Now() throws InterruptedException {
// WebElement book = driver.findElement(By.id("book_now"));
// book.click();
// Thread.sleep(5000);
// }
//
// @Then("user should verify order Id")
// public void user_should_verify_order_Id() {
// WebElement orderNo = driver.findElement(By.id("order_no"));
// String attribute = orderNo.getAttribute("value");
// System.out.println("Order ID is " + attribute);
//
// }
