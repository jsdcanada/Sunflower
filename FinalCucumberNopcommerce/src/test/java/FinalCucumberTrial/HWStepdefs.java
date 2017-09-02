package FinalCucumberTrial;

import PageObjects.BooksPage;
import PageObjects.CommonPage;
import PageObjects.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HWStepdefs extends Utils {


    LoadProp loadProp = new LoadProp();
    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();
    CommonPage commonPage = new CommonPage();
    SoftAssert softAssert = new SoftAssert();

    String expectedCategories = "Computers, Electronics, Apparel, Digital downloads, Books, Jewelry, Gift Cards";
    String expectedFilterByPrice = "Filter by price";
    String expectedProductsOnBookPage = "Fahrenheit 451 by Ray Bradbury, First Prize Pies, Pride and Prejudice";
    String expectedFilterSortBy = "Sort by";
    String expectedFilterDisplay = "Display";
    String actualFilterTerm,actualOrderSortBy,actualShortByFilterText;
    int actualDisplayFilterOption;

    @Given("^user has opened web browser$")
    public void userHasOpenedWebBrowser() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user enters www\\.demo\\.nopcommerce\\.com in URL$")
    public void user_enters_www_demo_nopcommerce_com_in_URL()   {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^website’s homepage should appear with categories list$")
    public void website_s_homepage_should_appear_with_categories_list()   {
        // Write code here that turns the phrase above into concrete actions
        homePage.getTextOfCategoriesOnHomepage();

        String actual = homePage.categories;
        Assert.assertEquals(expectedCategories, actual, "Categories are different");
    }


    @When("^user clicks on any \"([^\"]*)\"$")
    public void userClicksOnAny(String category) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    homePage.openCategoryPage(category);
    }

    @Then("^that \"([^\"]*)\" page should be displayed$")
    public void thatPageShouldBeDisplayed(String arg0)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user should see \"([^\"]*)\" title on that page$")
    public void userShouldSeeTitleOnThatPage(String arg0)  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user clicks on \"([^\"]*)\" category$")
    public void userClicksOnCategory(String Books) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.openCategoryPage(Books);
    }

    @Then("^book category page should be displayed with filter \"([^\"]*)\"$")
    public void bookCategoryPageShouldBeDisplayedWithFilter(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        String actual = driver.findElement(By.className("filter-title")).getText();
        Assert.assertEquals(expectedFilterByPrice, actual, "Filters are not present on the page");
    }

    @And("^list of products$")
    public void listOfProducts() {
        // Write code here that turns the phrase above into concrete actions
        booksPage.listOfProductOnBookPage();
        String actual = booksPage.productsOnBooksPage;
        Assert.assertEquals(expectedProductsOnBookPage, actual, "Products are not as per List");
    }


    @Given("^user is on Books category page$")
    public void userIsOnBooksCategoryPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.openCategoryPage("Books");
    }

    @And("^user can see filters as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userCanSeeFiltersAsAnd(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualSortBy = driver.findElement(By.xpath("//div[@class=\"product-selectors\"]/div[2]/span")).getText();
        String actualDisplay = driver.findElement(By.xpath("//div[@class=\"product-selectors\"]/div[3]/span")).getText();
        Assert.assertEquals(expectedFilterSortBy, actualSortBy, "Sort by filter is not displayed");
        Assert.assertEquals(expectedFilterDisplay, actualDisplay, "Display filter is not displayed");

    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String filter) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        actualFilterTerm = commonPage.clickOnFilterOnBookPage(filter);
        System.out.println(filter);

    }

    @Then("^user should see \"([^\"]*)\" of each filter$")
    public void userShouldSeeOfEachFilter(String terms) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(terms, actualFilterTerm, "Terms of filters are not same" );

    }


    @And("^user has clicked on Sort by filter$")
    public void userHasClickedOnSortByFilter() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user selects \"([^\"]*)\" from the list$")
    public void userSelectsFromTheList(String option)  {
        // Write code here that turns the phrase above into concrete actions
        commonPage.selectOptionFromSortbyFilter(option);
    }

    @Then("^user should see products sorted in \"([^\"]*)\"$")
    public void userShouldSeeProductsSortedIn(String order)  {
        // Write code here that turns the phrase above into concrete actions
        actualOrderSortBy = booksPage.productNameInAscOrDscOrder(order);
        Assert.assertEquals(order, actualOrderSortBy, "Products are not sorted as per filter selection" );
    }

    @When("^user clicks on Sort by filter button$")
    public void userClicksOnSortByFilterButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        commonPage.clickOnSortbyOrDisplayFilterOnBooksPage("Sortby");
    }

    @Then("^user should see \"([^\"]*)\" in dropdown list$")
    public void userShouldSeeInDropdownList(String option)  {
        // Write code here that turns the phrase above into concrete actions
        actualShortByFilterText = commonPage.clickOnSortByFilterAndGetTextOfOptionInDropDownList();
       Assert.assertTrue(actualShortByFilterText.contains(option), "Options in Sortby filter are different" );
//        Assert.assertEquals(option, actualShortByFilterText, "Options in Sortby filter are different" );

    }


    @Given("^user is Notebook page$")
    public void userIsNotebookPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         homePage.clickOnNotebooksViaComputers();
    }


    @When("^user clicks on Display filter button$")
    public void userClicksOnDisplayFilterButton()  {
        // Write code here that turns the phrase above into concrete actions
        commonPage.clickOnSortbyOrDisplayFilterOnBooksPage("Display");
    }

    @And("^selects \"([^\"]*)\" from Display filter dropdown list$")
    public void selectsFromDisplayFilterDropdownList(String option) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        commonPage.selectOptionFromDisplayFilter(option);
    }

    @Then("^user should see not more than \"([^\"]*)\" products on page$")
    public void userShouldSeeNotMoreThanProductsOnPage(int option) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        actualDisplayFilterOption = commonPage.userShouldSeeNotMoreThanSelectedOptionProducts(option);
        Assert.assertEquals(option, actualDisplayFilterOption, "Products are not displayed as per filter selection" );
    }
}

