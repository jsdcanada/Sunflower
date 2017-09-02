package PageObjects;

import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _genderMale = By.id("gender-male");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirthDay = By.name("DateOfBirthDay");
    private By _dateOfBirthMonth = By.name("DateOfBirthMonth");
    private By _dateOfBirthYear = By.name("DateOfBirthYear");
    private By _email = By.id("Email");
    private By _company = By.id("Company");
    private By _newsletter = By.id("Newsletter");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.xpath("//input[contains(@id,\"register-button\") and contains(@name,\"register-button\")]");
    private By _continueButton = By.name("register-continue");
    private By _logOutButton = By.linkText("Log out");

    public String mydate;

    public void registration() {

        //Select Gender male
        myClick(_genderMale);

        //Enter firstname
        myEnterText(_firstName, loadProp.getProperty("firstName"));

        //Enter last name
        myEnterText(_lastName, loadProp.getProperty("lastName"));

        //Select Birth Day
        mySelectByIndex(_dateOfBirthDay, 11);

        //Select Birth Month
        Select month = mySelectByVisibleText(_dateOfBirthMonth, loadProp.getProperty("dobMonth"));

        //Select Birth Year
        mySelectByValue(_dateOfBirthYear, loadProp.getProperty("dobYear"));

        //Enter email
        mydate = randomNumber(_email, loadProp.getProperty("firstName"));
        System.out.println(mydate);

        //Enter company details
        myEnterText(_company, loadProp.getProperty("company"));

        //scroll page down (i.e. y=250)
        scrollPage(0,250);

        //untick newsletter
        myClick(_newsletter);

        //Enter password
        myEnterText(_password, loadProp.getProperty("password"));

        //Enter confirm password
        myEnterText(_confirmPassword, loadProp.getProperty("password"));

    }

    public void clickOnRegisterButtonOnRegisterPage(){
        //click on Register
        myClick(_registerButton);
    }

    public void clickOnContinueButtonOnRegisterPage(){
        //click on Continue Button
        myClick(_continueButton);
    }

    public void clickLogOutButton(){
        //click on Logout Button
        myClick(_logOutButton);
    }
}
