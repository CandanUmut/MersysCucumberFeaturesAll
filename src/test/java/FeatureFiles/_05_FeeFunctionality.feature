Feature: Fee Functionality

  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on login Button
    Then User should login successfully
    Given Navigate to Fee Page


    @Regression
    Scenario: Create A Fee

      And Click on add button
      And Fill the add fee form
      |Batch 7 Fee zxcvb|
      |baaa             |
      |mnkl             |
      |9098             |
      When Click on save Button
      Then Success message should be displayed

      Scenario: Delete Fee

        Given Search for the Fee
          |Batch 7 Fee zxcvb|
          |baaa             |
          |9098             |

        When Delete Fee
        Then Success message should be displayed



