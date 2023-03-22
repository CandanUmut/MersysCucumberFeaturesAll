Feature: Citizenship Functionality


  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on login Button
    Then User should login successfully
    Given Navigate to Citizenship Page


    Scenario Outline: Create a Citizenship

      And Click on add button
      And Enter citizenship name as "<CitizenshipName>" and citizenship short name as "<CitizenshipShortName>"
      When Click on save Button
      Then Success message should be displayed





      Examples:
      |CitizenshipName    |CitizenshipShortName|
      |Umut1              |UM1                 |
      |Umut2              |UM2                 |
      |Umut3              |UM3                 |
      |Umut4              |UM4                 |


      Scenario Outline:
        And Search for Citizenship with name as "<CitizenshipName>" and search short name as "<CitizenshipShortName>"
        And Delete citizenship
        Then Success message should be displayed



        Examples:
          |CitizenshipName    |CitizenshipShortName|
          |Umut1              |UM1                 |
          |Umut2              |UM2                 |
          |Umut3              |UM3                 |
          |Umut4              |UM4                 |
