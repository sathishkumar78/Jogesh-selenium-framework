package pageMethods;
import static utilities.CustomizedMethods.*;
import static pageLocators.LeaveManagement_Page.*;

public class LeaveManagementPage_Methods {

    public static void clickOnApplyLeaveButton()
    {
        clickOnElement(applyLeaveButton);
    }

    public static void clickOnRequestsButton()
    {
        clickOnElement(requestButton);
    }

    public static boolean leaveApproved()
    {
        return elementIsVisible(leaveApproved);
    }

    public static boolean applyleaveMessage()
    {
        return elementIsVisible(leaveVerification);
    }

    public static boolean approvalVerification()
    {
        return elementIsVisible(approvalVerification);
    }

}
