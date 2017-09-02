package PageObjects;

import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends Utils {

    LoadProp loadProp = new LoadProp();

    StringBuilder stringBuilder = new StringBuilder();
    StringBuilder storage = new StringBuilder();

    private By _booksNameElements = By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/h2/a");
    private By _booksPriceElements = By.xpath("//div[@class=\"item-grid\"]/div/div/div[2]/div[3]/div/span[2]");

    public String productsOnBooksPage, termsOfFilterOnBooksPage, order, sortByDropdownListText;

    List<String> linkTextList = new ArrayList<String>();
    List<WebElement> booksElements;

    //get text of all products on bookpage and store product's text in String
    public void listOfProductOnBookPage(){

        //store elemnts in booksElements
        List<WebElement> booksElements = driver.findElements(_booksNameElements);

            //get text of all elements and store in storage
           for (WebElement e: booksElements) {
            storage.append(e.getText());
        }

        //separate each product's text by adding comma and single space
        for(int i = 0 ; i < storage.length(); i++)
        {
            stringBuilder = stringBuilder.append(storage.charAt(i));
            if(i == 29 || i==45 ) {
                stringBuilder = stringBuilder.append(", ");
            }
        }
        //convert storage into String
        productsOnBooksPage = stringBuilder.toString();

    }


//verify whether product is in Ascending or Descending order
    public String productNameInAscOrDscOrder(String order){

        //store all elements
        if(order.contains("Name")){
            booksElements = driver.findElements(_booksNameElements);
        }else if(order.contains("Price")){
            booksElements = driver.findElements(_booksPriceElements);
        }

        //get text of all elements and store in String array list
        for (WebElement e : booksElements) {
            linkTextList.add(e.getText());
        }

        //if String is in ascending order it will enter in this loop
        if(checkAlpha()==true) {
            if(order.contains("Name")){
            this.order = "Name ascending";
        }else if(order.contains("Price")){
            this.order = "Price ascending";
        }
        }

        //if String is in descending order it will enter in this loop
        if(checkAlpha()==false){
            if(order.contains("Name")){
                this.order = "Name descending";
            }else if(order.contains("Price")){
                this.order = "Price descending";
            }
        }
        return order;
    }

    //to check whether String is in Ascending order or Descending. if ascending it will return true
    private boolean checkAlpha() {

        String previous = ""; // empty string: guaranteed to be less than or equal to any other

        for (final String current: linkTextList) {
            if (current.compareTo(previous) < 0)
                return false;
            previous = current;
        }
        return true;
    }
}






