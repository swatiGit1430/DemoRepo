Feature: Create new contact in Free CRM

Scenario: Free CRM Login Test Scenario

Given : User is on Login Page
When : Title of page is Free CRM
Then : User enter Username & Password
|swati.sen1489@gmail.com|CRMSumi@1430|
Then : User click Login Button
Then : User is on Home Page
Then : User moves to new deals page
Then : User enters deal details
|Title		|Amount|Commission|
|test Deal1	|	50	|10		|
|test Deal2	|	50	|10		|
|test Deal3	|	50	|10		|
Then : Close the browser