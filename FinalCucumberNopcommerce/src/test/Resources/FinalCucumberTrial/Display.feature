Feature: user should be able to use Display filter
         so that user can see products displayed on page as per option selected

  Scenario Outline: When user select any option from display filter, user should see products as per option selected in a page
    Given user is Notebook page
    When user clicks on Display filter button
    And selects "<option>" from Display filter dropdown list
    Then user should see not more than "<option>" products on page
    Examples:
    |option|
    |3     |
    |6     |
    |9     |

