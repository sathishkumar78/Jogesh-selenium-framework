package pageLocators;

import org.openqa.selenium.By;

public class Home_Page {

    public static By dashBoard = By.xpath("//a[@href='/' and @class='remove-line-nav-item']");

    public static By employeesLink = By.xpath("//a[@href='/allemployees']");

    public static By leaveManagement = By.xpath("//a[@href='/leave_management' and @class='remove-line-nav-item']");

    public static By salaryManagement = By.xpath("//a[@href='/salary' and @class='remove-line-nav-item']");

    public static By paySlip = By.xpath("//a[contains(@href,'/payslip') and @class='remove-line-nav-item']");

    public static By resourceTracking = By.xpath("//a[@href='/resource_tracking' and @class='remove-line-nav-item']");

    public static By reimbursement = By.xpath("//a[@href='/reimbursement' and @class='remove-line-nav-item']");

    public static By expenditure = By.xpath("//a[@href='/expenditure' and @class='remove-line-nav-item']");

    public static By policies = By.xpath("//a[@href='/policies' and @class='remove-line-nav-item']");

    public static By profile = By.xpath("//a[@href='/profile' and @class='remove-line-nav-item']");

    public static By leaveOverview = By.xpath("//a[@href='/LeavesOverview' and @class='remove-line-nav-item']");

    public static By settings = By.xpath("//a[@href='/settings' and @class='remove-line-nav-item']");

    public static By logout = By.xpath("//p[text()='Logout']");

    public static By profleIcon= By.xpath("//a[@href='/profile']/descendant::img");

}
