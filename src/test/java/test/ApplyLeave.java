package test;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static pageMethods.ApplyLeavePage_Methods.*;
import static pageMethods.HomePage_Methods.*;
import static pageMethods.LeaveManagementPage_Methods.*;
import static utilities.TestData.*;

public class ApplyLeave {
    @Test
    public void applyLeave() throws IOException
    {
        clickOnleaveManagementLink();
        clickOnApplyLeaveButton();
        enterFromDate(propertyReader("fromDate"));
        enterToDate(propertyReader("toDate"));
        enterSubject(propertyReader("subject"));
        enterReasonforLeave(propertyReader("reason"));
        selectLead(propertyReader("lead"));
        clickOnleaveButton();
        clickOnSubmitButton();
        Assert.assertEquals(applyleaveMessage(),true);
    }
}
