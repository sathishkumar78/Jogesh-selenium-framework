package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import test.BaseClass;

import java.io.IOException;
import java.time.Duration;

public class CustomizedMethods extends BaseClass {

    public static Actions move= new Actions(driver);
    public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    public static void waiting(By element)
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(element)).isDisplayed();
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendText(By element, String data) {
        for (int i = 1; i < 4; i++) {
            try {
                waiting(element);
                driver.findElement(element).click();
                driver.findElement(element).clear();
                driver.findElement(element).sendKeys(data);
                break;
            }
        catch(Exception e){
            if (i == 3) {
                Reporter.log("Unable to Interact with the Element");
            } else {
                Reporter.log("searched for the element for " + i + " time");
            }
        }

    }
    }

    public static void moveToElement(By locator)
    {
        WebElement element = driver.findElement(locator);
        move.scrollToElement(element);
    }



    public static void clickOnElement(By element) {
        for (int i=1;i<4;i++)
        {
        try {
            WebElement element1=driver.findElement(element);
            move.scrollToElement(element1);
            waiting(element);
            driver.findElement(element).click();
            break;
        } catch (Exception e) {
            if(i==3)
            {
                Reporter.log("Unable to Interact with the Element");
            }
            else {
                Reporter.log("searched for the element for " + i + " time");
            }
        }
        }
    }

    public static void selectByvisibleText(By element, String Text)
    {
        for (int i=1;i<4;i++)
        {
            try {
                waiting(element);
                Select select = new Select(driver.findElement(element));
                select.selectByVisibleText(Text);
                break;
            } catch (Exception e) {
                if(i==3)
                {
                    Reporter.log("Unable to Interact with the element");
                }
                else {
                    Reporter.log("Searched for the element for "+i+" time");
                }
            }
        }
    }


    public static boolean elementIsVisible(By element) {
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
        return driver.findElement(element).isDisplayed();
    }

    public static void selectElementByIndex(By element, int num)
    {
        for (int i=1;i<4;i++)
        {
            try {
                waiting(element);
                Select select = new Select(driver.findElement(element));
                select.selectByIndex(num);
                break;
            } catch (Exception e) {
                if(i==3)
                {
                    Reporter.log("Unable to Interact with the element");
                }
                else {
                    Reporter.log("Searched for the element for "+i+" time");
                }
            }
        }
    }


}
