package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

        public static ExtentReports extent;

        public static ExtentReports getReporter() {

            if (extent == null) {
                String reportPath = System.getProperty("user.dir") + "/extent-report/extent.html";
                ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
                reporter.config().setReportName("Automation Test Results");
                reporter.config().setDocumentTitle("Test Execution Report");

                extent = new ExtentReports();
                extent.attachReporter(reporter);
                extent.setSystemInfo("Tester", "Kalyan");
            }

            return extent;
        }
}
