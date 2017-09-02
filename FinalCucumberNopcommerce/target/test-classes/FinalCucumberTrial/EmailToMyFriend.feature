Feature: user should be able to use Email To My Friend functionality
         so that user can email details about product to friends

  @search
  Scenario: user should be able to use Email To My Friend only if user is Registered
    Given user has completed Registration successfully
    And user has navigated to Desktops page
    And user has clicked Build Your Own Computer product
    When user click on Email A Friend
    And user fills all mandatory fields on Email A Friend page
    And user click on Send Email button at centre bottom of page
    Then user should be able to send email to a friend successfully
    And user should see "Your message has been sent." message after sending message

@search
Scenario: user should NOT be able to use Email To My Friend feature if user is not Registered
  Given user is on homepage
  And user has navigated to Desktops page
  And user has clicked Build Your Own Computer product
  When user click on Email A Friend
  And user fills all mandatory fields on Email A Friend page
  And user click on Send Email button at centre bottom of page
  Then user should NOT be able to send email to a friend
  And user should see "Only registered customers can use email a friend feature" error message
