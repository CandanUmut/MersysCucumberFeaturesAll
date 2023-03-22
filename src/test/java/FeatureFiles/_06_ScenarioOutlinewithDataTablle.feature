Feature: Scenario Outline with Data Table

  Scenario Outline: Scenario 1
    Given Step one
   |Step 1|<Round   Value1> |

    Then Step two
    And Step three
    |Step 3|<Round Value 2>|
    Then Step four

    Examples:
      |Round   Value1      | Round Value 2  |
      |Round 1 Value1      | Round 1  Value1|
      |Round 2 Value2      |Round 2  Value2 |
      |Round 3 Value3      |Round 3  Value3 |
      |Round 4 Value4      |Round 4  Value4 |
