$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/CreateDeal.feature");
formatter.feature({
  "line": 1,
  "name": "Create new contact in Free CRM",
  "description": "",
  "id": "create-new-contact-in-free-crm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "create-new-contact-in-free-crm;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": ": User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": ": Title of page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": ": User enter Username \u0026 Password",
  "rows": [
    {
      "cells": [
        "swati.sen1489@gmail.com",
        "CRMSumi@1430"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": ": User click Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": ": User is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": ": User moves to new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": ": User enters deal details",
  "rows": [
    {
      "cells": [
        "test Deal",
        "50",
        "10"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": ": Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 8378296300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_page_is_Free_CRM()"
});
formatter.result({
  "duration": 32654400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enter_Username_Password(DataTable)"
});
formatter.result({
  "duration": 5804826100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_Login_Button()"
});
formatter.result({
  "duration": 90617800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 10885800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_moves_to_new_deals_page()"
});
formatter.result({
  "duration": 5781069700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 1010059200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 5951467400,
  "status": "passed"
});
});