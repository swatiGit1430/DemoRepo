Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario

#Given : User is on Login Page
#When : title of page is Free CRM
#Then : User enter "swati.sen1489@gmail.com" & "CRMSumi@1430"
#Then : User click Login Button


Scenario Outline: Free CRM Login Test Scenario

Given : User is on Login Page
When : title of page is Free CRM
Then : User enter "<Username>" & "<Password>"
Then : User click Login Button
Then : User is on Home Page
Then : Close the browser

Examples:

|Username					|	Password		|
|swati.sen1489@gmail.com	|	CRMSumi@1430	|
