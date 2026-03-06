
Feature: Login functionality
  User Story:
  As a user, I should be able to login with correct credentials
  to different accounts.
  Dashboard should be displayed.

  Scenario: Login as librarian
    Given user is on the login page
    When user logs in as librarian
    Then dashboard should be displayed

  Scenario: Login as student
    Given user is on the login page
    When user logs in as student
    Then dashboard should be displayed

  Scenario: Login as admin
    Given user is on the login page
    When user logs in as admin
    Then dashboard should be displayed