package test;
import org.testng.Assert;
import test.LoginTest.*;
import org.testng.annotations.Test;
import static pageMethods.HomePage_Methods.clickOnleaveManagementLink;
import static pageMethods.LeaveManagementPage_Methods.approvalVerification;

public class Flow extends BaseClass{

    @Test(priority = 1)
    public void loginAndAddingEmployee()throws Exception
    {
        LoginTest log=new LoginTest();
        log.login();
        AddEmployee_Test2 add=new AddEmployee_Test2();
        add.addEmployee();
        Logout out=new Logout();
        out.logout();
    }

    @Test(priority = 2)
    public void employeeLoginAndApplyingLeave()throws Exception
    {
        EmployeeLogin log=new EmployeeLogin();
        log.employeeLogin();
        ApplyLeave apply=new ApplyLeave();
        apply.applyLeave();
        Logout out=new Logout();
        out.logout();
    }

    @Test(priority = 3)
    public void approvingLeaveAndVerifyingApproval()throws Exception
    {
//        LoginTest log=new LoginTest();
//        log.login();
//        ApproveLeave approve=new ApproveLeave();
//        approve.approveLeave();
//        Logout out=new Logout();
//        out.logout();
//        EmployeeLogin in=new EmployeeLogin();
//        in.employeeLogin();
//        clickOnleaveManagementLink();
        //Assert.assertEquals(approvalVerification(),true);
    }
}
