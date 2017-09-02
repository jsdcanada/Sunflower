package CrossBrowser;

import CrossBrowser.BaseTest;
import PageObjects.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Created by Welcome on 29/07/2017.
 */

public class TestSuite extends BaseTest {

   BooksPage booksPage = new BooksPage();
   CartPage cartPage = new CartPage();
   CellPhones cellPhones = new CellPhones();
   CommonPage commonPage = new CommonPage();
   ComputersPage computersPage = new ComputersPage();
   DesktopsPage desktopsPage = new DesktopsPage();
   HomePage homePage = new HomePage();
   LogInPage logInPage = new LogInPage();
   OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();
   RegistrationPage registrationPage = new RegistrationPage();

   static String nameOfBrowser;
    ExtentReports report = new ExtentReports("target/Reports/TestNG-"+nameOfBrowser+"-Extent-report.html");
    ExtentTest logger;

//    @Test(priority = 1)
    public void toVerifyUserShouldBeAlbeToRegister() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        logger = report.startTest(methodName);

        //clicking "Register"
        homePage.clickOnRegisterButton();
        logger.log(LogStatus.PASS, "Successfully clicked on Register");

        //Doing registration
        registrationPage.registration();
        logger.log(LogStatus.PASS, "Registration completed successfully");

        //click on register button
        registrationPage.clickOnRegisterButtonOnRegisterPage();
        logger.log(LogStatus.PASS, "Clicked on Register button");

        //Asserting "Your registration completed"
        String actual = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(actual, "Your registration completed", "Your registration completed is not visible");
        logger.log(LogStatus.PASS, "Registration completion messagae verified");

        report.endTest(logger);
        report.flush();
    }

//    @Test(priority = 2)
    public void toVerifyUserShouldBeAbleToSendEmailToMyFriendIfRegistered() {

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        ExtentTest logger = report.startTest(methodName);

        //clicking "Register"
        homePage.clickOnRegisterButton();
        logger.log(LogStatus.PASS, "Successfully clicked on Register");

        //Doing registration
        registrationPage.registration();
        logger.log(LogStatus.PASS, "Registration completed successfully");

        //click on register button
        registrationPage.clickOnRegisterButtonOnRegisterPage();
        logger.log(LogStatus.PASS, "Clicked on Register button");

        //click on computer/desktop/build you own/email a friend
        homePage.clickComputerFromHomePage();
        logger.log(LogStatus.PASS,"clicked on Computers");
        computersPage.clickDesktops();
        logger.log(LogStatus.PASS,"clicked on Desktops");
        desktopsPage.clickBuildYourOwn();
        logger.log(LogStatus.PASS,"clicked on Build your own");
        commonPage.clickEmailAFriend();
        logger.log(LogStatus.PASS,"clicked on Email A Friend");
        commonPage.fillEmailAFriendFields();
        logger.log(LogStatus.PASS,"filled all the Email A Friend fields");
        commonPage.clickSendEmailButton();
        logger.log(LogStatus.PASS,"clicked on SendEmailButton");

        //Asserting "Your registration completed"
        String actual = driver.findElement(By.xpath("//div[@class=\"page-body\"]/div[2]")).getText();
        Assert.assertEquals(actual, "Your message has been sent.", "Send Email Failed. Message has not been sent.");
        logger.log(LogStatus.PASS, "Message sent title verified");

        report.endTest(logger);
        report.flush();
    }

//    @Test(priority = 3)
    public void toVerifyUserShouldNotSendEmailToMyFriendWithoutRegisteration() {
        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        ExtentTest logger = report.startTest(methodName);

        //click on computer/desktop/build you own/email a friend
        homePage.clickComputerFromHomePage();
        logger.log(LogStatus.PASS,"clicked on Computers");
        computersPage.clickDesktops();
        logger.log(LogStatus.PASS,"clicked on Desktops");
        desktopsPage.clickBuildYourOwn();
        logger.log(LogStatus.PASS,"clicked on Build your own");
        commonPage.clickEmailAFriend();
        logger.log(LogStatus.PASS,"clicked on Email A Friend");
        commonPage.fillEmailAFriendFields();
        logger.log(LogStatus.PASS,"filled all the Email A Friend fields");
        commonPage.clickSendEmailButton();
        logger.log(LogStatus.PASS,"clicked on SendEmailButton");

        //Asserting "Only registered customers can use email a friend"
        String actual = driver.findElement(By.xpath("//div[@class=\"page-body\"]/form/div/div/ul/li")).getText();
        Assert.assertEquals(actual, "Only registered customers can use email a friend feature", "User is able to use email a friend feature without Registration");
        logger.log(LogStatus.PASS,"Only registered customers is able to use email a friend");

        report.endTest(logger);
        report.flush();
    }

//    @Test (priority = 4)
    public void toVerifyIfUserAddsProductIntoCartSameProductsAreAddedAndUserCanDoCheckoutSuccessfully() {

        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        ExtentTest logger = report.startTest(methodName);

        //clicking "Register"
        homePage.clickOnRegisterButton();
        logger.log(LogStatus.PASS, "Successfully clicked on Register");

        //Doing registration
        registrationPage.registration();
        logger.log(LogStatus.PASS, "Registration completed successfully");

        //click on register button
        registrationPage.clickOnRegisterButtonOnRegisterPage();
        logger.log(LogStatus.PASS, "Clicked on Register button");

        //mouse over on Electronics and click Cell Phone
        homePage.hoverOnElectronicsAndClickCellPhones();
        logger.log(LogStatus.PASS, "Clicked on Cell Phone via Electronics");

        //selecting HTC One M8 and Nokia Lumia 1020 and adding into cart and then click on Shopping cart
        cellPhones.addingMobileToCartAndGettingText("HTC One M8");
        logger.log(LogStatus.PASS, "added HTC One M8 into cart");
        cellPhones.addingMobileToCartAndGettingText("Nokia Lumia 1020");
        logger.log(LogStatus.PASS, "added Nokia Lumia 1020 into cart");

        cellPhones.clickShoppingCart();
        logger.log(LogStatus.PASS, "Clicked on shopping cart");

        //Verify products in shopping cart are same as selected
        cartPage.toVerifySelectedMobilesAreInShopppingCart("HTC One M8");
        logger.log(LogStatus.PASS, "Verified that same product is in shopping cart that was added");
        cartPage.toVerifySelectedMobilesAreInShopppingCart("Nokia Lumia 1020");
        logger.log(LogStatus.PASS, "Verified that same product is in shopping cart that was added");

        //Select country then click agree button and then click checkout
        cartPage.clickCountryOnCartPage();
        logger.log(LogStatus.PASS, "Clicked on Country");
        cartPage.clicktermsOfServiceOnCartPage();
        logger.log(LogStatus.PASS, "ticked terms of service box");
        cartPage.clickCheckoutOnCartPage();
        logger.log(LogStatus.PASS, "Clicked on Checkout button");

        //filling out billing address on Checkout page
        onePageCheckoutPage.fillOutBillingAddressOnCheckout();
        logger.log(LogStatus.PASS, "Filled all the billing address fields");

        //select Next Day Air in Shipping Method
        onePageCheckoutPage.selectShippingMethodOnCheckout();
        logger.log(LogStatus.PASS, "Selected shipping method as Next Day Air");

        //select Payment method
        onePageCheckoutPage.selectPaymentMethodOnCheckout();
        logger.log(LogStatus.PASS, "Selected payment method");

        //fill out payment information fields
        onePageCheckoutPage.fillOutPaymentInformationOnCheckout();
        logger.log(LogStatus.PASS, "Filled all the payment information fields");

        //click confirm order
        onePageCheckoutPage.clickConfirmButtonOnCheckout();
        logger.log(LogStatus.PASS, "clicked on Confirm button");

        report.endTest(logger);
        report.flush();
    }

    @Parameters("browser")
    @Test
    public void registration(String browser) {

            report = new ExtentReports("target/Reports/TestNG-" + browser + "-Extent-report.html");
//        nameOfBrowser = browser;
            String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
            logger = report.startTest(methodName + " - " + browser);

            //clicking "Register"
            homePage.clickOnRegisterButton();
            logger.log(LogStatus.PASS, "clicked on Register");

            String register = driver.findElement(By.xpath("//div[@class=\"page-title\"]/h1")).getText();
            Assert.assertTrue(register.contains("Regstration"));
            logger.log(LogStatus.PASS, "title verified");
            //Doing registration
//        registrationPage.registration();

//            report.endTest(logger);
//            report.flush();
    }

//    @Test
    public void m1() {

    }

}


