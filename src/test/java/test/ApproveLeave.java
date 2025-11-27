package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pageMethods.HomePage_Methods.*;
import static pageMethods.LeaveManagementPage_Methods.*;
import static pageMethods.RequestsPage_Methods.*;

public class ApproveLeave {
    @Test
    public void approveLeave() throws Exception
    {
        clickOnleaveManagementLink();
        clickOnRequestsButton();
        clickApproveButton();
    }
}