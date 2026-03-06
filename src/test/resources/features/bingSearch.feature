
Feature: Bing search functionality

  Scenario: Bing search testing
    Given user is on the bing page
    When user types orange in the bing search box and click enter
    Then user will see  orange in the page title

