Feature: LoginFeature

Scenario: Valid Login
Given I open browser
And I navigate to the FreeCRM
When I enter valid username and password
And I click login button
Then I successfully logged in
And I close the browser

Scenario: Invalid Login
Given I open browser
And I navigate to the FreeCRM
When I enter invalid username and password
And I click login button
Then I see the error message

