Feature: User Login
Registered User should be able to login to access account details

Background:
Given User navigates to Login page

@login @validcredentials @all @smoke @regression
Scenario Outline: Login with valid credentials
When User enters valid email address <email>
And Enter valid password <password>
And Clicks on Login button
Then User should login successfully
Examples:
|email|password|
|test_new@gmail.com|12345|
|test_new123@test.com|12345|


@login @invalidcredentials @all @smoke
Scenario: Login with invalid credentials
When User enters invalid email address "test_new1234@gmail.com"
And Enter invalid password "123456"
And Clicks on Login button
Then User should get a proper warning message

@login @invalidcredentials @all  @regression
Scenario: Login with valid email address and invalid password
When User enters valid email address "test_new123@gmail.com"
And Enter invalid password "123456"
And Clicks on Login button
Then User should get a proper warning message

@login @nocredentials @all @smoke @regression
Scenario: Login with invalid email address and valid password
When User enters invalid email address "test_new1234@gmail.com"
And Enter valid password "12345"
And Clicks on Login button
Then User should get a proper warning message