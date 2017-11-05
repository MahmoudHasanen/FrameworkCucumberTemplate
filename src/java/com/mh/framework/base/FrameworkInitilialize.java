package java.com.mh.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameworkInitilialize {


    public void InitializeBrowser(BrowserType browserType) {

        WebDriver driver = null;
        switch (browserType) {
            case Chrome: {
                driver = new ChromeDriver();
                break;
            }
            case Firefox: {
                //Open the browser
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahmoud\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            case IE: {
                break;
            }
        }


        //Set the Driver
        DriverContext.setDriver(driver);
        //Browser
        DriverContext.Browser = new Browser(driver);

    }


}
