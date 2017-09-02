Feature: user should be able to use "Sort by" filter
   so that user can see products displayed as per option user selected in filter

  Scenario Outline: user should be able to use Sort by filter
    Given user is on Books category page
    When user clicks on Sort by filter button
    Then user should see "<option>" in dropdown list
    Examples:
      | option             |
      | Position           |
      | Name: A to Z       |
      | Price: Low to High |
      | Price: High to Low |
      | Created on         |


Scenario Outline: User should see products displayed as per option selected from Sort by filter

Given user is on Books category page
And user has clicked on Sort by filter
When user selects "<option>" from the list
Then user should see products sorted in "<order>"

Examples:
| option             | order            |
| Name: A to Z       | Name ascending   |
| Name: Z to A       | Name descending  |
| Price: Low to High | Price ascending  |
| Price: High to Low | Price descending |
#| Created on         | recently added |