Feature: Create new contact in Free CRM

Scenario Outline: Free CRM Login Test Scenario

Given : User is on Login Page
When : Title of page is Free CRM
Then : User enter "<Username>" & "<Password>"
Then : User click Login Button
Then : User is on Home Page
Then : User moves to contact page
Then : User enters "<firstname>" and "<lastname>" and "<position>"
Then : Close the browser

Examples:

|Username				|Password	 |firstname|lastname|position|
|swati.sen1489@gmail.com|CRMSumi@1430|Tom	   |Ellise  |CFO     | 	