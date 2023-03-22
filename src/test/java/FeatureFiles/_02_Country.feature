Feature: Country Functionality

  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on login Button
    Then User should login successfully
    And Navigate to Country page
  @SmokeTest
  Scenario: Create Country
#    Given Navigate to Campus
#    When Enter valid credentials
#    And Click on login Button
#    Then User should login successfully
#    And Navigate to Country page
    When Create a new country
    Then Success message should be displayed


  @Regression
  Scenario:
#   Given Navigate to Campus
#      When Enter valid credentials
#      And Click on login Button
##     Then User should login successfully
#      And Navigate to Country page
    When Delete Country
    Then Success message should be displayed


  Scenario:
    And Click on add button
    When Enter country name as "Omosyus" and code as "Umut"
    And Click on save Button
    Then Success message should be displayed


