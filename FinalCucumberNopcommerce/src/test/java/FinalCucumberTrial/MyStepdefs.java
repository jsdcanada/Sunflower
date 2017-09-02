package FinalCucumberTrial;

import PageObjects.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MyStepdefs extends Utils {

    CartPage cartPage = new CartPage();
    CellPhones cellPhones = new CellPhones();
    CommonPage commonPage = new CommonPage();
    ComputersPage computersPage = new ComputersPage();
    DesktopsPage desktopsPage = new DesktopsPage();
    HomePage homePage = new HomePage();
    LogInPage logInPage = new LogInPage();
    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();
    RegistrationPage registrationPage = new RegistrationPage();


    String expectedOnRegisterPage = "Regster";
    String expectedAfterRegistration = "Your registration completed";
    String expectedAfterSendEmailFriend = "Your message has been sent.";
    String expectedOnEmailNotSent = "Only registered customers can use email a friend feature";
    String expectedAfterLogIn = "Log out";
    String expectOnCheckout = "Checkout";
    String expectAfterConfirmOrder = "Your order has been successfully processed!";

    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user click on Register button on homepage$")
    public void userClickOnRegisterButtonOnHomepage() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
    }

    @Then("^user should be navigated to Register page$")
    public void user_should_be_navigated_to_Register_page()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^user should see \"([^\"]*)\" message on Register page$")
    public void user_should_see_message_on_Register_page(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        String actual = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(expectedOnRegisterPage,actual, "Register page is not loaded");
    }


    @Given("^user is on Register page$")
    public void userIsOnRegisterPage()  {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
    }

    @When("^user enters data in all mandatory fields$")
    public void userEntersDataInAllMandatoryFields() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.registration();
    }

    @And("^user click on Register button on register page$")
    public void userClickOnRegisterButtonOnRegisterPage()  {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.clickOnRegisterButtonOnRegisterPage();
    }

    @Then("^user should be able to complete Registration successfully$")
    public void userShouldBeAbleToCompleteRegistrationSuccessfully() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user should see \"([^\"]*)\" message after Registration$")
    public void userShouldSeeMessageAfterRegistration(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        String actual = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedAfterRegistration,actual, "Registeration is not completed successfully");
    }

    @Given("^user has completed Registration successfully$")
    public void userHasCompletedRegistrationSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
        registrationPage.registration();
        registrationPage.clickOnRegisterButtonOnRegisterPage();
        String actual = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedAfterRegistration,actual, "Registeration is not completed successfully");
        registrationPage.clickOnContinueButtonOnRegisterPage();
    }

    @And("^user has navigated to Desktops page$")
    public void userHasNavigatedToDesktopsPage()  {
        // Write code here that turns the phrase above into concrete actions
    homePage.clickComputerFromHomePage();
    computersPage.clickDesktops();
    }

    @And("^user has clicked Build Your Own Computer product$")
    public void userHasClickedBuildYourOwnComputerProduct()  {
        // Write code here that turns the phrase above into concrete actions
        desktopsPage.clickBuildYourOwn();

    }

    @When("^user click on Email A Friend$")
    public void userClickOnEmailAFriend()  {
        // Write code here that turns the phrase above into concrete actions
        commonPage.clickEmailAFriend();
    }

    @And("^user fills all mandatory fields on Email A Friend page$")
    public void userFillsAllMandatoryFieldsOnEmailAFriendPage() {
        // Write code here that turns the phrase above into concrete actions
        commonPage.fillEmailAFriendFields();
    }

    @And("^user click on Send Email button at centre bottom of page$")
    public void userClickOnSendEmailButtonAtCentreBottomOfPage() {
        // Write code here that turns the phrase above into concrete actions
        commonPage.clickSendEmailButton();
    }

    @Then("^user should be able to send email to a friend successfully$")
    public void userShouldBeAbleToSendEmailToAFriendSuccessfully()   {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user should see \"([^\"]*)\" message after sending message$")
    public void userShouldSeeMessageAfterSendingMessage(String arg0)   {
        // Write code here that turns the phrase above into concrete actions
        String actual = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedAfterSendEmailFriend,actual, "Send Email Failed. Message has not been sent.");
    }

    @Then("^user should NOT be able to send email to a friend$")
    public void userShouldNOTBeAbleToSendEmailToAFriend() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


    @And("^user should see \"([^\"]*)\" error message$")
    public void userShouldSeeErrorMessage(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        String actual = driver.findElement(By.className("validation-summary-errors")).getText();
        Assert.assertEquals(expectedOnEmailNotSent,actual, "User is able to use email a friend feature without Registration");
    }

    @Given("^user is on Cell phones page$")
    public void userIsOnCellPhonesPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.hoverOnElectronicsAndClickCellPhones();
    }

    @And("^user can see different type of mobile phones$")
    public void userCanSeeDifferentTypeOfMobilePhones()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user clicks on \"([^\"]*)\" Add to Cart button$")
    public void userClicksOnAddToCartButton(String mobile) {
        // Write code here that turns the phrase above into concrete actions
    cellPhones.addingMobileToCartAndGettingText(mobile);
    }

    @And("^clicks on Shopping cart button at top right of page$")
    public void clicksOnShoppingCartButtonAtTopRightOfPage() {
        // Write code here that turns the phrase above into concrete actions
    cellPhones.clickShoppingCart();
    }

    @Then("^Shopping cart page should be displayed$")
    public void shoppingCartPageShouldBeDisplayed() {
        // Write code here that turns the phrase above into concrete actions
    }

    @And("^user should see that \"([^\"]*)\" is added in shopping cart$")
    public void userShouldSeeThatIsAddedInShoppingCart(String mobile) {
        // Write code here that turns the phrase above into concrete actions
    cartPage.toVerifySelectedMobilesAreInShopppingCart(mobile);
    }

    @Given("^that user has completed Registration successfully$")
    public void thatUserHasCompletedRegistrationSuccessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user is on Login page$")
    public void userIsOnLoginPage() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user enters valid credentials$")
    public void userEntersValidCredentials() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        logInPage.logIn();
    }

    @Then("^user should be able to log in to application successfully$")
    public void userShouldBeAbleToLogInToApplicationSuccessfully() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user should see \"([^\"]*)\" button on top right of the page$")
    public void userShouldSeeButtonOnTopRightOfThePage(String arg0)  {
        // Write code here that turns the phrase above into concrete actions
        String actual = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertEquals(expectedAfterLogIn,actual, "Login FAILED. Please check username and password are correct.");
    }

    @Given("^user is already Registered and Logged into application$")
    public void userIsAlreadyRegisteredAndLoggedIntoApplication() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
        //Doing registration
        registrationPage.registration();
        registrationPage.clickOnRegisterButtonOnRegisterPage();
        registrationPage.clickOnContinueButtonOnRegisterPage();
    }

    @And("^user has added mobile phones into shopping cart$")
    public void userHasAddedMobilePhonesIntoShoppingCart()  {
        // Write code here that turns the phrase above into concrete actions
        homePage.hoverOnElectronicsAndClickCellPhones();
        cellPhones.addingMobileToCartAndGettingText("HTC");
    }

    @And("^user is on shopping cart page$")
    public void userIsOnShoppingCartPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cellPhones.clickShoppingCart();
    }

    @When("^user selects country as United States$")
    public void userSelectsCountryAsUnitedStates() {
        // Write code here that turns the phrase above into concrete actions
        cartPage.clickCountryOnCartPage();
    }

    @And("^user clicks on I agree with terms of services checkbox$")
    public void userClicksOnIAgreeWithTermsOfServicesCheckbox() {
        // Write code here that turns the phrase above into concrete actions
        cartPage.clicktermsOfServiceOnCartPage();
    }

    @And("^user clicks on Checkout button$")
    public void userClicksOnCheckoutButton() {
        // Write code here that turns the phrase above into concrete actions
        cartPage.clickCheckoutOnCartPage();
    }

    @Then("^user should be navigated to Checkout page$")
    public void userShouldBeNavigatedToCheckoutPage() {
        // Write code here that turns the phrase above into concrete actions
        String actual = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals(expectOnCheckout,actual, "Checkout page is not loaded.");
    }

    @And("^user should see all input fields of Billing Address section$")
    public void userShouldSeeAllInputFieldsOfBillingAddressSection() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user is on Checkout page$")
    public void userIsOnCheckoutPage() throws Throwable  {
        // Write code here that turns the phrase above into concrete actions
        cellPhones.clickShoppingCart();
        cartPage.clickCountryOnCartPage();
        cartPage.clicktermsOfServiceOnCartPage();
        cartPage.clickCheckoutOnCartPage();
    }

    @When("^user fills of the mandatory fields of Billing Address Section$")
    public void userFillsOfTheMandatoryFieldsOfBillingAddressSection() {
        // Write code here that turns the phrase above into concrete actions
     onePageCheckoutPage.fillOutBillingAddressOnCheckout();
    }

    @And("^user clicks on Next Day Air button in Shipping method section$")
    public void userClicksOnNextDayAirButtonInShippingMethodSection() {
        // Write code here that turns the phrase above into concrete actions
     onePageCheckoutPage.selectShippingMethodOnCheckout();
    }

    @And("^user clicks on Credit Card button in Payment method section$")
    public void userClicksOnCreditCardButtonInPaymentMethodSection() {
        // Write code here that turns the phrase above into concrete actions
        onePageCheckoutPage.selectPaymentMethodOnCheckout();
    }

    @And("^user fills all the fields of Payment information section$")
    public void userFillsOfTheFieldsOfPaymentInformationSection() {
        // Write code here that turns the phrase above into concrete actions
        onePageCheckoutPage.fillOutPaymentInformationOnCheckout();
    }

    @And("^user clicks on Confirm button$")
    public void userClicksOnConfirmButton()  {
        // Write code here that turns the phrase above into concrete actions
        onePageCheckoutPage.clickConfirmButtonOnCheckout();
    }

    @Then("^user should be able to place an order successfully$")
    public void userShouldBeAbleToPlaceAnOrderSuccessfully()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^user should see \"([^\"]*)\" message after completing Checkout$")
    public void userShouldSeeMessageAfterCompletingCheckout(String arg0)  {
        // Write code here that turns the phrase above into concrete actions

        String actual = driver.findElement(By.xpath("//div[@class=\"center-1\"]/div/div[2]/div/div/strong")).getText();
        Assert.assertEquals(expectAfterConfirmOrder,actual, "Checkout unsuccessfull. Order has not been placed");
    }

    @And("^on shopping cart page user selects country as United States$")
    public void onShoppingCartPageUserSelectsCountryAsUnitedStates() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cellPhones.clickShoppingCart();
        cartPage.clickCountryOnCartPage();
    }

    @And("^user is navigated to login page$")
    public void userIsNavigatedToLoginPage()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user clicks on Checkout As Guest button$")
    public void userClicksOnCheckoutAsGuestButton()  {
        // Write code here that turns the phrase above into concrete actions
        logInPage.clickOnCheckoutAsGuest();
    }
}
