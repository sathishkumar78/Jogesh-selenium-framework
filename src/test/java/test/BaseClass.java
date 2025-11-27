package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import static utilities.TestData.propertyReader;

public class BaseClass {

    public static WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void browserSetup() throws Exception {

        String browserCmd = System.getProperty("Browser");
        String headlessCmd = System.getProperty("Headless");

        String browserenv = System.getenv("Browser");
        String headlessenv = System.getenv("Headless");

        String browserFile = propertyReader("browser");
        String headlessFile = propertyReader("headless");

        String browser = (browserCmd != null) ? browserCmd : (browserenv!=null) ? browserenv: browserFile;
        boolean headless = (headlessCmd != null) ? headlessCmd.equalsIgnoreCase("true") : (headlessenv!=null)? headlessenv.equalsIgnoreCase("true"):headlessFile.equalsIgnoreCase("true");


        switch (browser.toLowerCase()) {

            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--disable-notifications");
                if (headless) {
                    chromeOptions.addArguments("--headless=new");
                    chromeOptions.addArguments("--window-size=1920,1080");
                }
                driver = new ChromeDriver(chromeOptions);
                break;

            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                if (headless) {
                    edgeOptions.addArguments("--headless=new");
                    edgeOptions.addArguments("--window-size=1920,1080");
                }
                driver = new EdgeDriver(edgeOptions);
                break;

            case "firefox":
                FirefoxOptions ffOptions = new FirefoxOptions();
                if (headless) {
                    ffOptions.addArguments("-headless");
                }
                driver = new FirefoxDriver(ffOptions);
                break;

            default:
                throw new Exception("Invalid Browser Name: " + browser);
        }

        driver.manage().window().maximize();
        driver.get(propertyReader("url"));
    }

    @AfterTest(alwaysRun = true)
    public void browsertearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
