Feature: Home Page
  As a user I want to see below Category list on home page
  Category List = Computers, Electronics, Apparel, Digital downloads, Books, Jewelry, Gift Cards

  Scenario: Home page should appear with category list
    Given user has opened web browser
    When user enters www.demo.nopcommerce.com in URL
    Then website’s homepage should appear with categories list


#Feature: Home Page with Category list
 # As a user I want to see Category list on home page
  #So that I can go to those categories page

  Scenario Outline: Category page should be displayed when clicked
    Given user is on homepage
    When user clicks on any "<category>"
    Then that "<category>" page should be displayed
    And user should see "<category>" title on that page
    Examples:
    |category           |
    | Computers         |
    | Electronics       |
    | Apparel           |
    | Digital downloads |
    | Books             |
    | Jewelry           |
    | Gift Cards        |


#Feature: Book category page filters
 # User should see the Books category page with filter "Filter by price" and list of products

  Scenario: Filter and list of products
    Product List = Fahrenheit 451 by Ray Bradbury, First Prize Pies, Pride and Prejudice

    Given user is on homepage
    When user clicks on "Books" category
    Then book category page should be displayed with filter "Filter by price"
    And list of products

   Scenario Outline: User should see list of terms of each filter

     Given user is on Books category page
     And user can see filters as "Sort by" and "Display"
     When user clicks on "<filter>"
     Then user should see "<terms>" of each filter

     Examples:
       | filter  | terms                                                                                    |
       | Sort by | Position, Name: A to Z, Name: Z to A, Price: Low to High, Price: High to Low, Created on |
       | Display | 3, 6, 9                                                                                  |


