package PageObjects;

import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class HomePage extends Utils {

    private By _computer = By.xpath("//body/div[6]/div[2]/ul/li/a");
    private By _registerButtonHomepage = By.linkText("Register");
    private By _pageTitle = By.className("page-title");
    private By _Electronics = By.linkText("Electronics");
    private By _CellPhones = By.linkText("Cell phones");
    private By _login = By.linkText("Log in");
    private By _categoriesElements = By.xpath("//ul[@class=\"top-menu\"]/li");
    private By _computerCategory = By.linkText("Computers");
    private By _notebooksCategory = By.linkText("Notebooks");

    SoftAssert softAssertObj = new SoftAssert();
    LoadProp loadProp = new LoadProp();
    StringBuilder stringBuilder = new StringBuilder();

    String actualString;
    public String categories;
    public String categoryPageTitle;

    //click on register button on homepage situated at top right
public void clickOnRegisterButton(){
    myClick(_registerButtonHomepage);
}

    public void clickComputerFromHomePage() {

        //click on computer
        myClick(_computer);

        //Soft assert
        actualString = getText(_pageTitle);
        softAssertObj.assertEquals(actualString, "Computers", "Computers page is not loaded");
        softAssertObj.assertAll();
    }

    //hover on Electronics and click Cell phones
    public void hoverOnElectronicsAndClickCellPhones(){
        hoverEffect(_Electronics, _CellPhones);
    }

    //click on Login button
    public void clickLogIn(){
        myClick(_login);
    }

    public void getTextOfCategoriesOnHomepage(){

        List<WebElement> categoriesElements = driver.findElements(_categoriesElements);

        StringBuilder storage = new StringBuilder();

        for (WebElement e: categoriesElements) {
            storage.append(e.getText());
        }

        for(int i = 0 ; i < storage.length(); i++)
        {
            stringBuilder = stringBuilder.append(storage.charAt(i));
            if(i == 8 || i==19 || i==26 || i==43 || i==48 || i==55) {
                stringBuilder = stringBuilder.append(", ");
            }
        }
        categories = stringBuilder.toString();
    }

    public void openCategoryPage(String category){
        driver.findElement(By.partialLinkText(category)).click();
        categoryPageTitle = driver.findElement(_pageTitle).getText();
    }

    public void clickOnNotebooksViaComputers(){
        hoverEffect(_computerCategory, _notebooksCategory);
    }
}
