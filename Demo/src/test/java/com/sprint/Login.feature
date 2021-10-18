Feature: To verify login functionality
Scenario: To validate login functionality with valid credentials
Given user is on main home page
And than user navigates to login page
When user enters the valid email address
And user enters the valid password
When user clicks on login button
Then login must be successful.


Scenario:  To validate login functionality with invalid credentials(valid email and invalid password)
Given user is on ebay home page
And than user logging in to website
When user enter the valid email
And user login with invalid password
When user is able to click on login button
Then login must be unsuccessful (invalid credentials).



Scenario:  To validate login functionality with invalid credentials (invalid email and valid password)
Given user is on home page
And user go to login page for logging in to website
When user login with invalid email
And user clicks on continue button
When user gets error (invalid credentials)
Then user should not able to login



Scenario: To validate login functionality with missing creditials
Given user must be on home page
And than user navigates to login page for logging in to website
When user login with blank email
Then user not able to login


Scenario: To validate login functionality with missing creditials
Given user should be on home page
And than user clicks on login page
When user gives input with valid email
And user gives blank input in password
When user is not able to click login button
Then user gets error








