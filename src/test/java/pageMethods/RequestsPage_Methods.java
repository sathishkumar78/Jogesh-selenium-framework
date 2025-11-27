package pageMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static utilities.CustomizedMethods.*;
import static pageLocators.Requests_Page.*;

public class RequestsPage_Methods {

    public static void clickApproveButton() throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // 🔍 1️⃣ Try switching to iframe (if AG-Grid is inside an iframe)
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        if (frames.size() >= 0) {
            System.out.println(">>> Switching to iframe 0");
            driver.switchTo().frame(0);
            Thread.sleep(500);
        }

        // 🔍 2️⃣ Wait for AG-Grid root to load (universal selector)
        By gridRoot = By.cssSelector("[class*='ag-root']");
        wait.until(ExpectedConditions.presenceOfElementLocated(gridRoot));

        WebElement grid = driver.findElement(gridRoot);

        // Bring AG Grid into view (vertical scroll)
        js.executeScript("arguments[0].scrollIntoView(true);", grid);
        Thread.sleep(500);

        // 🔍 3️⃣ Horizontal scroll bar (universal selector)
        WebElement hScroll = null;

        try {
            hScroll = driver.findElement(By.cssSelector(".ag-body-horizontal-scroll-viewport"));
        } catch (Exception e) {
            // fallback (some AG versions)
            hScroll = driver.findElement(By.cssSelector("[class*='horizontal-scroll']"));
        }

        // 🔍 4️⃣ Scroll right until Approve button appears
        WebElement approveBtn = null;

        for (int i = 0; i < 20; i++) {

            // FIRST TRY: normal Selenium locator
            try {
                approveBtn = driver.findElement(By.xpath("//button[contains(@class,'approve-btn')]"));
                if (approveBtn.isDisplayed()) break;
            } catch (Exception ignored) {}

            // SECOND TRY: Shadow DOM locator
            try {
                approveBtn = (WebElement) js.executeScript(
                        "return document.querySelector('button.approve-btn');"
                );
                if (approveBtn != null && approveBtn.isDisplayed()) break;
            } catch (Exception ignored) {}

            // Scroll right (AG-grid internal scrollbar)
            js.executeScript("arguments[0].scrollLeft += 250;", hScroll);
            Thread.sleep(200);
        }

        if (approveBtn == null) {
            throw new RuntimeException("❌ Approve button NOT FOUND after scrolling.");
        }

        // 🔍 5️⃣ Center the Approve button inside AG-Grid viewport
        js.executeScript("arguments[0].scrollIntoView({block:'center', inline:'center'});", approveBtn);
        Thread.sleep(200);

        // 🔍 6️⃣ Click Approve button
        try {
            approveBtn.click();
        } catch (Exception e) {
            js.executeScript("arguments[0].click();", approveBtn);
        }

        System.out.println("✔ Approve button clicked successfully");
    }
}