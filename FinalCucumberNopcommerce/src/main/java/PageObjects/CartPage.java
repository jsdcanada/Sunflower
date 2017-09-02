package PageObjects;

import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.testng.asserts.SoftAssert;

import static FinalCucumberTrial.Utils.getText;

public class CartPage extends Utils {

    SoftAssert softAssertObj = new SoftAssert();
    CellPhones cellPhones = new CellPhones();
    LoadProp loadProp = new LoadProp();

    private By _HTCOneM8inCheckout = By.xpath("//tbody/tr/td[4]/a");
    private By _Lumia1020inCheckout = By.xpath("//tbody/tr/td[4]/a");
    private By _HTCOneM8inLinkTextCheckout = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    private By _Lumia1020inLinkTextCheckout = By.linkText("Nokia Lumia 1020");
    private By _countryID = By.id("CountryId");
    private By _termsOfService = By.id("termsofservice");
    private By _checkOut  = By.id("checkout");

    public String HTCOneM8inCheckout;

//verify that mobiles that added into cart are same as in Shopping Cart
public void toVerifySelectedMobilesAreInShopppingCart(String mobile) {
    //HTC mobile will enter in this loop
    if (mobile.contains("HTC")) {
        //get text of products appeared in shopping cart
        HTCOneM8inCheckout = getText(_HTCOneM8inLinkTextCheckout);
        System.out.println(HTCOneM8inCheckout);

        //Soft assert of shopping cart's products against products added in cart
        softAssertObj.assertEquals(HTCOneM8inCheckout, "HTC One M8 Android L 5.0 Lollipop", "Product in shopping cart is different then added at the time of buying");

        //Lumia mobile will enter in this loop
    } else if (mobile.contains("Lumia")) {
        String Lumia1020inCheckout = getText(_Lumia1020inLinkTextCheckout);

        System.out.println(Lumia1020inCheckout);

        //Soft assert of shopping cart's products against products added in cart
        softAssertObj.assertEquals(Lumia1020inCheckout, "Nokia Lumia 1020", "Product in shopping cart is different then added at the time of buying");
    }
    softAssertObj.assertAll();
}
    //Select country on Cart Page
    public void clickCountryOnCartPage() {

    //Select country United Kingdom
    mySelectByVisibleText(_countryID, loadProp.getProperty("country"));
    }

    public void clicktermsOfServiceOnCartPage() {

        //click on "I agree" check box
        myClick(_termsOfService);
    }

    public void clickCheckoutOnCartPage(){
    //click on Checkout
    myClick(_checkOut);

    try {
        ifAlertIsPresent();
    }catch (TimeoutException e){};

//    Alert alt = driver.switchTo().alert();
//    alt.accept();
    }

}
