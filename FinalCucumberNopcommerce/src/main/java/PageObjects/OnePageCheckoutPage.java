package PageObjects;

import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class OnePageCheckoutPage extends Utils {

    SoftAssert softAssertObj = new SoftAssert();
    LoadProp loadProp = new LoadProp();

    private By _emailBillingAddress = By.id("BillingNewAddress_Email");
    private By _countryId = By.id("BillingNewAddress_CountryId");
    private By _stateId = By.id("BillingNewAddress_StateProvinceId");
    private By _city = By.id("BillingNewAddress_City");
    private By _address1 = By.id("BillingNewAddress_Address1");
    private By _zipCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    private By _continueButtonBillingAddress = By.xpath("//input[@class=\"button-1 new-address-next-step-button\"]");
    private By _shippingMethod = By.cssSelector("li#opc-shipping_method > div > h2");
    private By _nextDayAir = By.id("shippingoption_1");
    private By _continueButtonShippingMethod = By.xpath("//input[@class=\"button-1 shipping-method-next-step-button\"]");
    private By _paymentMethod = By.cssSelector("li#opc-payment_method > div > h2");
    private By _creditCard = By.id("paymentmethod_1");
    private By _continuePaymentMethod = By.xpath("//input[@class=\"button-1 payment-method-next-step-button\"]");
    private By _paymentInformation = By.cssSelector("li#opc-payment_info > div > h2");
    private By _creditCardType = By.id("CreditCardType");
    private By _cardHolderName = By.id("CardholderName");
    private By _cardNumber = By.id("CardNumber");
    private By _expireMonth = By.id("ExpireMonth");
    private By _expireYear = By.id("ExpireYear");
    private By _cardCode = By.id("CardCode");
    private By _continueButtonPayInfo = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _continueButtonConfirmOrder = By.xpath("//input[@class=\"button-1 confirm-order-next-step-button\"]");

    public void fillOutBillingAddressOnCheckout() {

        //enter email ID YOP
        clearText(_emailBillingAddress);
        myEnterText(_emailBillingAddress, loadProp.getExcelProperty(0, 4, 1));

        //select Country United States
        mySelectByVisibleText(_countryId, loadProp.getExcelProperty(0, 5, 1));

        //select state California
        mySelectByVisibleText(_stateId, loadProp.getExcelProperty(0, 6, 1));

        //enter California
        myEnterText(_city, loadProp.getExcelProperty(0, 7, 1));

        //enter address1
        myEnterText(_address1, loadProp.getExcelProperty(0, 8, 1));

        //enter zipcode
        myEnterText(_zipCode, loadProp.getExcelProperty(0, 9, 1));

        //enter phone
        myEnterText(_phoneNumber, loadProp.getExcelProperty(0, 10, 1));

        //click on Continue button
        myClick(_continueButtonBillingAddress);

        String actualString = getText(_shippingMethod);
        softAssertObj.assertEquals(actualString, "Shipping method", "This is not shipping method section");
        softAssertObj.assertAll();
    }
    public void selectShippingMethodOnCheckout() {
        scrollPage(0, -170);
        //click on Next Day Air radio button
        myClick(_nextDayAir);

        //click on continue
        myClick(_continueButtonShippingMethod);

        String actualString1 = getText(_paymentMethod);
        softAssertObj.assertEquals(actualString1, "Payment method", "This is not payment method section");
        softAssertObj.assertAll();
    }
    public void selectPaymentMethodOnCheckout() {

        //click on credit card radio button
        myClick(_creditCard);

        //click on continue
        myClick(_continuePaymentMethod);

        String actualString2 = getText(_paymentInformation);
        softAssertObj.assertEquals(actualString2, "Payment information", "This is not payment information section");
        softAssertObj.assertAll();
    }
    public void fillOutPaymentInformationOnCheckout() {

        //in Payment information section select credit card Mastercard
        mySelectByVisibleText(_creditCardType, loadProp.getExcelProperty(0, 11, 1));

        //type cardholder name
        myEnterText(_cardHolderName, loadProp.getExcelProperty(0, 12, 1));

        //type card number
        myEnterText(_cardNumber, loadProp.getExcelProperty(0,13,1));

        //enter expiration month
        mySelectByVisibleText(_expireMonth, loadProp.getExcelProperty(0, 14, 1));

        //enter expiration year
        mySelectByVisibleText(_expireYear, loadProp.getExcelProperty(0,15,1));

        //enter card code
        myEnterText(_cardCode, loadProp.getExcelProperty(0, 16, 1));

        //click continue
        myClick(_continueButtonPayInfo);
    }

    public void clickConfirmButtonOnCheckout(){
        scrollPage(0, 1370);
        //click continue on confirm order section
        waitUntilClickableAndClickCommand(_continueButtonConfirmOrder);
    }



}
