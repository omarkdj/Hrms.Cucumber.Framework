#Author: Omar
@Demo
Feature: sace Demo Login
Scenario: invalid login 
Given user is login page 
When user enter username as "Admin"
And user enter pasword as "Hum@nhrm123"
And click on login button
Then user should see the error message 


