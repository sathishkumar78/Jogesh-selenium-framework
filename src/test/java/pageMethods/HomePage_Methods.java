package pageMethods;

import test.BaseClass;
import utilities.RandomData.*;

import static pageLocators.Home_Page.*;
import static utilities.CustomizedMethods.clickOnElement;
import static utilities.CustomizedMethods.elementIsVisible;

public class HomePage_Methods extends BaseClass {

    public static void clickOnDashboardlink()
    {

    }

    public static void clickOnEmployeesLink()
    {
       clickOnElement(employeesLink);
    }

    public static void clickOnleaveManagementLink()
    {
        clickOnElement(leaveManagement);
    }

    public static void clickOnSalaryManagementLink()
    {
        clickOnElement(salaryManagement);
    }

    public static void clickOnPayslipLink()
    {
        clickOnElement(paySlip);
    }

    public static void clickOnResourceTrackingLink()
    {
       clickOnElement(resourceTracking);
    }

    public static void clickOnReimbursementLink()
    {
        clickOnElement(reimbursement);
    }

    public static void clickOnExpenditureLink()
    {
        clickOnElement(expenditure);
    }

    public static void clickOnPoliciesLink()
    {
        clickOnElement(policies);
    }

    public static void clickOnYourProfileLink()
    {
        clickOnElement(profile);
    }

    public static void clickOnLeaveOverviewLink()
    {
        clickOnElement(leaveOverview);
    }

    public static void clickOnSettingsLink()
    {
        clickOnElement(settings);
    }

    public static void clickOnLogoutLink()
    {
        clickOnElement(logout);
    }

    public static boolean profileIconisVisible()
    {
        return elementIsVisible(profleIcon);
    }
}
