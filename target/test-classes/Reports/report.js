$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Verifying Adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying Adactin login details with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Adactin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user should login \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user should select on Search Hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "user should click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "user should select hotel name",
  "keyword": "And "
});
formatter.step({
  "name": "user should click on continue button",
  "keyword": "And "
});
formatter.step({
  "name": "user should book a hotel in booking page \"\u003cfirstname\u003e\", \"\u003clastname\u003e\", \"\u003caddress\u003e\" and payment details",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Credit Card No",
        "Credit Card Type",
        "Select Month",
        "Select Year",
        "CVV Number"
      ]
    },
    {
      "cells": [
        "1234567891234567",
        "American Express",
        "December",
        "2021",
        "321"
      ]
    },
    {
      "cells": [
        "1234567891237654",
        "Visa",
        "February",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "1234567891238907",
        "Master Card",
        "March",
        "2022",
        "657"
      ]
    },
    {
      "cells": [
        "1234567891239807",
        "Other",
        "April",
        "2022",
        "980"
      ]
    }
  ]
});
formatter.step({
  "name": "user should click Book Now",
  "keyword": "And "
});
formatter.step({
  "name": "user should verify order Id",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "address"
      ]
    },
    {
      "cells": [
        "karthikeyaneee",
        "123456",
        "Karthi",
        "keyan",
        "Chennai"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying Adactin login details with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on the Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.user_is_on_the_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login \"karthikeyaneee\" and \"123456\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_should_login_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select on Search Hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_select_on_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select hotel name",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_select_hotel_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on continue button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_on_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should book a hotel in booking page \"Karthi\", \"keyan\", \"Chennai\" and payment details",
  "rows": [
    {
      "cells": [
        "Credit Card No",
        "Credit Card Type",
        "Select Month",
        "Select Year",
        "CVV Number"
      ]
    },
    {
      "cells": [
        "1234567891234567",
        "American Express",
        "December",
        "2021",
        "321"
      ]
    },
    {
      "cells": [
        "1234567891237654",
        "Visa",
        "February",
        "2022",
        "123"
      ]
    },
    {
      "cells": [
        "1234567891238907",
        "Master Card",
        "March",
        "2022",
        "657"
      ]
    },
    {
      "cells": [
        "1234567891239807",
        "Other",
        "April",
        "2022",
        "980"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_book_a_hotel_in_booking_page_and_payment_details(String,String,String,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click Book Now",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_should_click_Book_Now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should verify order Id",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageStep.user_should_verify_order_Id()"
});
formatter.result({
  "status": "passed"
});
});