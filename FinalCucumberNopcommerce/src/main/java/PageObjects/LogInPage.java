package PageObjects;

import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;

public class LogInPage extends Utils {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    LoadProp loadProp = new LoadProp();

    //String email = "bhagirat"+registrationPage.mydate+"@yaho.com";

    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _loginButton = By.xpath("//input[@class=\"button-1 login-button\"]");
    private By _checkoutAsGuestButton = By.xpath("//div[@class=\"page-body\"]/div/div/div[3]/input");


    public void logIn(){
        homePage.clickOnRegisterButton();
        //Doing registration
        registrationPage.registration();
        registrationPage.clickOnRegisterButtonOnRegisterPage();

        //click log out button
        registrationPage.clickLogOutButton();

        //click on login
        homePage.clickLogIn();

        //enter registered email
        myEnterText(_email, "Bhagirath"+registrationPage.mydate+"@yaho.com");

        //enter password
        myEnterText(_password, loadProp.getProperty("password"));

        //scroll down
        scrollPage(0,250);

        //click on login button
        myClick(_loginButton);
    }

    public void clickOnCheckoutAsGuest(){
    myClick(_checkoutAsGuestButton);
    }
}
