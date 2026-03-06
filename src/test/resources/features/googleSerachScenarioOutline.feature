Feature: Google search functionality with Scenario Outline
  User Story: As a user, when I'm on the google page I should be able to search whatever
  I want and see relevant information


    @scenarioOutline
  Scenario Outline: Google Search testing with Scenario Outline
    Given user is on the google page
    When users searches for "<country>" capital
    Then user should see "<capital>" in the result

    Examples:
      | country    | capital          |
      | USA        | Washington |
      | Turkey     | Ankara           |
      | Ukraine    | Kyiv             |
      | Kyrgyzstan | Bishkek          |

 # //div[@class='PZPZlf ssJ7i B5dxMb']
