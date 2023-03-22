Feature:

  @SmokeTest
  Scenario:
    Given Go to the WebPage
    And Fill the form with valid data
    | John             |
    | Snow             |
    | 2356 Spring Ave. |
    | 8654123658       |
    Then Save the form


    Scenario:
      Given Go to the WebPage
      And Fill the form with valid data
        | John             |
        | Snow             |
        | 2356 Spring Ave. |
        | 8654123658       |
      And Enter Valid Information
      |Name    |Umut             |
      |LastName| Omot            |
      |Address | 23232 Miller pl.|
      |Phone   | 535353451       |

      Then Save the form

#      Scenario outline runs the entire scenario for each set of data
#  Data table sends the entire data to only one step at the same time and runs the scenario once


