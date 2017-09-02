Feature: user should be able to add product into shopping cart
         so that user can do Checkout and buy that product

  Scenario Outline: user should be able to add product into shopping cart
    Given user is on Cell phones page
    And user can see different type of mobile phones
    When user clicks on "<mobile>" Add to Cart button
    And clicks on Shopping cart button at top right of page
    Then Shopping cart page should be displayed
    And user should see that "<mobile>" is added in shopping cart

    Examples:
      | mobile           |
      | HTC One M8       |
      | Nokia Lumia 1020 |



