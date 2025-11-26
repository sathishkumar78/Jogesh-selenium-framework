package utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import static test.BaseClass.driver;

public class ScreenShot implements ITestListener {
    public static ExtentReports extent = ExtentReportManager.getReporter();
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test Passed");
    }
    @Override
    public void onTestFailure(ITestResult result) {

        try {
            // ========== SAFETY CHECK: DRIVER IS NULL ==========
            if (driver == null) {
                System.out.println("❗ Driver is NULL — Browser was never launched. Screenshot skipped.");
                return; // Prevent NullPointerException
            }

            // ========== INITIALIZE EXTENT TEST IF NULL ==========
            if (test.get() == null) {
                ExtentTest extentTest = extent.createTest(result.getName());
                test.set(extentTest);
            }

            // Log the failure message / exception
            test.get().fail(result.getThrowable());


            // ========== TAKE SCREENSHOT ==========
            TakesScreenshot ts = (TakesScreenshot) driver;

            String timestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
            String fileName = result.getName() + "_" + timestamp + ".png";

            // Screenshot folder inside extent-report directory
            String screenshotDir = System.getProperty("user.dir") + "/extent-report/screenshots/";
            String screenshotPath = screenshotDir + fileName;

            File src = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File(screenshotPath);

            // Create directory if not exist
            dest.getParentFile().mkdirs();

            // Copy file
            Files.copy(src.toPath(), dest.toPath());


            // ========== ADD SCREENSHOT TO EXTENT REPORT ==========
            test.get().addScreenCaptureFromPath("screenshots/" + fileName);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

}
