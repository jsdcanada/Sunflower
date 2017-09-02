Feature: user should be able to do Checkout succesfully
  so that user can buy product

  Scenario: user should be navigated to Checkout page successfully as a Registered user
    Given user is already Registered and Logged into application
    And user has added mobile phones into shopping cart
    And user is on shopping cart page
    When user selects country as United States
    And user clicks on I agree with terms of services checkbox
    And user clicks on Checkout button
    Then user should be navigated to Checkout page
    And user should see all input fields of Billing Address section

    Scenario: user should be able to place an order successfully after completing Checkout procedure as a Registered user
      Given user is already Registered and Logged into application
      And user has added mobile phones into shopping cart
      And user is on Checkout page
      When user fills of the mandatory fields of Billing Address Section
      And user clicks on Next Day Air button in Shipping method section
      And user clicks on Credit Card button in Payment method section
      And user fills all the fields of Payment information section
      And user clicks on Confirm button
      Then user should be able to place an order successfully
      And user should see "Your order has been successfully processed!" message after completing Checkout


  Scenario: user should be navigated to Checkout page successfully as a Guest user
    Given user has added mobile phones into shopping cart
    And on shopping cart page user selects country as United States
    And user clicks on I agree with terms of services checkbox
    And user clicks on Checkout button
    And user is navigated to login page
    When user clicks on Checkout As Guest button
    Then user should be navigated to Checkout page
    And user should see all input fields of Billing Address section

  Scenario: user should be able to place an order successfully after completing Checkout procedure as a Guest user
    Given user has added mobile phones into shopping cart
    And on shopping cart page user selects country as United States
    And user is on Checkout page
    When user fills of the mandatory fields of Billing Address Section
    And user clicks on Next Day Air button in Shipping method section
    And user clicks on Credit Card button in Payment method section
    And user fills all the fields of Payment information section
    And user clicks on Confirm button
    Then user should be able to place an order successfully
    And user should see "Your order has been successfully processed!" message after completing Checkout