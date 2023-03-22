Feature: Entrance Exams Functionality

  Background:
    Given Navigate to Campus
    When Enter valid credentials
    And Click on login Button
    Then User should login successfully

  Scenario Outline: Create an Entrance Exam
    Given Go to Entrance Exam Page
    And Click on add button
    When Fill the Create Exam Form with Valid Data
      |<Exam Name>|
    And Create a Description
      |<Description>|

    And Create a Note
      |<Note>|
    When Click on save Button
    Then Success message should be displayed




    Examples:
      |Exam Name         | Description             |Note   |
      |Batch7 First Exam12 | We are the Championsa    | Almost a |
      |Batch7 Second Exam1| We are oow              | Hola    |
      |Batch7 Third Exam1 | We are the Champions1   |Don't give up 'dont give up no no no   |
      |Batch7 Fourth Exam1| We are the Champions2   | Estas   |
      |Batch7 Fifth Exam1 | We are the Champions3   | Bien    |

