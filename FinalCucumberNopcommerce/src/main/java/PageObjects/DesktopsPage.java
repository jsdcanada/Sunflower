package PageObjects;

import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class DesktopsPage extends Utils {


    private By _buildYourOwn = By.linkText("Build your own computer");
//    private By _buildYourOwn = By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/h2/a");
    private By _productName = By.className("product-name");

    SoftAssert softAssertObj = new SoftAssert();
    String actualString;

    public void clickBuildYourOwn() {

        scrollPage(0, 450);
        //click first product "build your own"
        myClick(_buildYourOwn);

        //Soft assert
        actualString = getText(_productName);

        softAssertObj.assertEquals(actualString, "Build your own computer", "Build your own computer product page is not loaded");
        softAssertObj.assertAll();
    }
}
