Feature: user should be able to Log in to application
  so that user can get benefit of various features of the application
@test
  Scenario: user should be able to Log in to application with valid credentials
    Given that user has completed Registration successfully
    And user is on Login page
    When user enters valid credentials
    Then user should be able to log in to application successfully
    And user should see "Log out" button on top right of the page