Feature: Login Functionality

  @SmokeTest
  Scenario: Login with valid username and password
    Given Navigate to Campus
    When Enter valid credentials
    And Click on login Button
    Then User should login successfully