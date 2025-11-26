package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utilities.TestData.*;
import java.io.IOException;
import static utilities.TestData.propertyReader;

@Listeners(utilities.ScreenShot.class)
public class BaseClass {

    public static WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void browserSetup() throws IOException {
        String browser= propertyReader("browserName");
        if(browser.equalsIgnoreCase("chrome"))
        {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--disable-notifications");
            driver = new ChromeDriver(co);
        }
        else if (browser.equalsIgnoreCase("Edge"))
        {
            driver=new EdgeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
        else
        {
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--disable-notifications");
            driver = new ChromeDriver(co);
        }
        driver.manage().window().maximize();
        driver.get(propertyReader("url"));
    }

    @AfterClass(alwaysRun = true)
    public void browsertearDown()
    {
        if (driver != null) {
            driver.quit();
        }
    }
}
