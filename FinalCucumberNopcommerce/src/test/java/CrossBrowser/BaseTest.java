package CrossBrowser;

import FinalCucumberTrial.BrowserSelector;
import FinalCucumberTrial.LoadProp;
import FinalCucumberTrial.Utils;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;

/**
 * Created by Welcome on 29/07/2017.
 */
public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();

    @BeforeMethod
       public void openBrowser( ){

       //open firefox browser
       browserSelector.openBrowser(loadProp.getProperty("browser"));

       //navigate to homepage
       driver.get(loadProp.getExcelProperty(0, 3,1));

    }



  @AfterMethod
  //public void takeAScreenshotIfTestCaseFailAndQuit(){}
    public static void tearDown(ITestResult result)
    {
        // Here will compare if test is failing then only it will enter into if condition
        if(ITestResult.FAILURE==result.getStatus())
        {
            try
            {
                // Create reference of TakesScreenshot
                TakesScreenshot ts=(TakesScreenshot)driver;

                // Call method to capture screenshot
                File source=ts.getScreenshotAs(OutputType.FILE);

                // Copy files to specific location here it will save all screenshot in our project home directory and
                // result.getName() will return name of test case so that screenshot name will be same
                FileUtils.copyFile(source, new File("./Screenshots/"+result.getName()+".png"));

                System.out.println("Screenshot taken");
            }
            catch (Exception e)
            {
                System.out.println("Exception while taking screenshot "+e.getMessage());
            }
        }
        // close application
        driver.quit();
    }
  }



