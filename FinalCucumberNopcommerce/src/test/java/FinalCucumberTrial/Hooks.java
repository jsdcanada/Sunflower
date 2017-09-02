package FinalCucumberTrial;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

    @Before
    public void openBrowser(){
//        String browser=loadProp.getProperty("browser");
        String browser= System.getProperty("Browser");
    browserSelector.openBrowser(browser);
        driver.get(loadProp.getProperty("url"));
    }

    @After
    public void takeScreenShotIfTestFailAndQuiteBrowser(Scenario scenario) throws Exception
    {

        if (scenario.isFailed()) {

           captureScreenShot(driver,"./target/ScreenShots/"+scenario.getName()+".png");
            Reporter.addScreenCaptureFromPath("./target/ScreenShots/"+scenario.getName()+".png");
            scenario.write("Scenario is failed");
        }
        else {
            scenario.write("Scenario is passed");
        }
    // close application
    driver.quit();
}
}
