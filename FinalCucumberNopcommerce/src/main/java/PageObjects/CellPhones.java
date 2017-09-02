package PageObjects;

import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

public class CellPhones extends Utils {

    private By _HTCOneM8 = By.linkText("HTC One M8 Android L 5.0 Lollipop");
    private By _AddToCartHTCOneM8 = By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div[3]/div[2]/input");
    private By _Lumia1020 = By.linkText("Nokia Lumia 1020");
    private By _AddToCartLumia1020 = By.xpath("//div[@class=\"item-grid\"]/div[3]/div/div[2]/div[3]/div[2]/input");
    private By _closeShoppingCartNotificationBar = By.xpath("//div[@id=\"bar-notification\"]/span");
//    private By _shoppingCart = By.linkText("Shopping cart");
    private By _shoppingCart = By.xpath("//div[@class=\"header-links\"]/ul/li[4]/a");
    public String HTCOneM8, Lumia1020;


    public void addingMobileToCartAndGettingText(String mobile) {

        if(mobile.contains("HTC")){
        //Get text of HTCOneM8
        HTCOneM8 = getText(_HTCOneM8);
        System.out.println(HTCOneM8);

        //scroll page down (down i.e. 250)
        scrollPage(0, 450);

        //click on Add to Cart
        myClick(_AddToCartHTCOneM8);

            try {
                ifAlertIsPresent();
            } catch (TimeoutException e) {
            }

    } else if(mobile.contains("Lumia")) {

            //Get text of HTCOneM8
            Lumia1020 = getText(_Lumia1020);
            System.out.println(Lumia1020);

            //click on Add to Cart
            waitUntilClickableAndClickCommand(_AddToCartLumia1020);

//            scrollPage(0, -1250);

//         click on close button of notification bar
            waitUntilClickableAndClickCommand(_closeShoppingCartNotificationBar);

            driver.navigate().refresh();

        }
    }

    public void clickShoppingCart() {

        scrollPage(0, -850);

        //         click on close button of notification bar
     //   waitUntilClickableAndClickCommand(_closeShoppingCartNotificationBar);

        //click on shopping cart on top right corner
        waitUntilVisibleAndClickCommand(_shoppingCart);

    }
}
