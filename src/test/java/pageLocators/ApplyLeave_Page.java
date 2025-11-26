package pageLocators;

import org.openqa.selenium.By;

public class ApplyLeave_Page {

    public static By fromDate=By.id("fromDate");
    public static By toDate = By.id("toDate");
    public static By selectLead= By.name("lead");
    public static  By subject= By.name("subject");
    public static By reasonForLeave= By.name("reason");
    public static By leaveRadioButton= By.xpath("//label[text()='Leave']");
    public static By workFromHome= By.xpath("//label[text()='Work from Home']");
    public static By submitButton=By.xpath("//button[text()='Submit']");
}
