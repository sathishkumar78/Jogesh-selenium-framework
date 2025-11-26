package pageLocators;

import org.openqa.selenium.By;

public class Dashboard_Page {


    public By addHolidayButton = By.xpath("//button[text()='Add Holidays']");

    public By addEventsButton = By.xpath("//button[text()='Add Events']");

    public By dashBoardHearder = By.xpath("//div[@class='page-header-container']/descendant::p");

    public By allemployessCount = By.xpath("//div[@class='dashboard-card']/descendant::p[@class='card-count']");

    public By birthDaysList = By.xpath("//div[@class='birthday-container']/descendant::ul");

    public By holidayList = By.xpath("//div[@class='events-container']/descendant::p[contains(text(),'Holiday')]");

}
