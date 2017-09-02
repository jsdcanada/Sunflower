package FinalCucumberTrial;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {

    @Parameters("browser")
    @Test
    //open Firefox or Chrome or Internet Explorer browser
    public void openBrowser(String browser){

        if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver-2.19.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer-3.4.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("Invalid browser or wrong browser typed");
        }

/*
    switch (browser){
        case "firefox"  : driver = new FirefoxDriver(); break;

        case "chrome"   : System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver-2.19.exe");
                          driver = new ChromeDriver();
                          break;

        case "ie"       : System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\BrowserDriver\\IEDriverServer-3.4.exe");
                          driver = new InternetExplorerDriver();
                          break;

        default:        System.out.println("Invalid browser or wrong browser typed");
    }
*/
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

//System.setProperty("webdriver.gecko.driver", "C:\\Soft\\geckodriver.exe");