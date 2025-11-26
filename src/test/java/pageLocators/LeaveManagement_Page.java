package pageLocators;

import org.openqa.selenium.By;

public class LeaveManagement_Page {

    public static By applyLeaveButton=By.xpath("//button[text()='Apply Leave']");
    public static By yourHistory= By.xpath("//button[text()='Your History']");
    public static By requestButton= By.xpath("//button[text()='Requests']");
    public static By leaveApproved=By.xpath("//div[text()='Approved']");
    public static By approvalVerification = By.xpath("//span[text()='STATUS']/following::div[text()='Approved']");
    public static By leaveVerification =By.xpath("//span[text()='STATUS']/following::div[text()='Awaiting']");
}