package PageObjects;

import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

/**
 * Created by Welcome on 29/07/2017.
 */
public class ComputersPage extends Utils {

    private By _desktop = By.xpath("//ul[@class=\"list\"]/li/ul/li/a");
    private By _pageTitle = By.className("page-title");

    SoftAssert softAssertObj = new SoftAssert();
    String actualString;

    public void clickDesktops() {

        //click desktop
        myClick(_desktop);

        //Soft assert
        actualString = getText(_pageTitle);
        softAssertObj.assertEquals(actualString, "Desktops", "Desktops page is not loaded");
    }

}
