Feature: user should be able to do Registration
         so that user can get credentials to log into application
  @test
  Scenario: user should be able to navigate to Register page
    Given user is on homepage
    When user click on Register button on homepage
    Then user should be navigated to Register page
    And user should see "Register" message on Register page

#  @test
    Scenario: user should be able to do Registration successfully
      Given user is on Register page
      When user enters data in all mandatory fields
      And user click on Register button on register page
      Then user should be able to complete Registration successfully
      And user should see "Your registration completed" message after Registration

