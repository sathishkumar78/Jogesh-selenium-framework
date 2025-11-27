package test;
import org.testng.Assert;
import test.LoginTest.*;
import org.testng.annotations.Test;
import static pageMethods.HomePage_Methods.clickOnleaveManagementLink;
import static pageMethods.LeaveManagementPage_Methods.approvalVerification;

public class Flow extends BaseClass{

    @Test
    public void fullFlow()throws Exception
    {
        LoginTest leadlog=new LoginTest();
        leadlog.login();
        AddEmployee_Test2 add=new AddEmployee_Test2();
        add.addEmployee();
        Logout out=new Logout();
        out.logout();
        EmployeeLogin emplog=new EmployeeLogin();
        emplog.employeeLogin();
        ApplyLeave apply=new ApplyLeave();
        apply.applyLeave();
        out.logout();
        leadlog.login();
        ApproveLeave approve=new ApproveLeave();
        approve.approveLeave();
        out.logout();
        emplog.employeeLogin();
        clickOnleaveManagementLink();
        Assert.assertEquals(approvalVerification(),true);
    }
}
