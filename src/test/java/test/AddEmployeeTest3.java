package test;
import org.testng.*;
import org.testng.annotations.*;
import utilities.ExcelData2;
import java.io.IOException;
import static pageMethods.AddEmployeePage_Methods.*;
import static pageMethods.EmployeesPage_Methods.clickOnAddEmployeeButton;
import static pageMethods.AddEmployeePage_Methods.employeeSavedSuccessfullyIsVisible;
import static pageMethods.HomePage_Methods.*;

@Listeners(utilities.ScreenShot.class)
public class AddEmployeeTest3 extends BaseClass{
    @Test(dataProvider = "addEmployeeData",dataProviderClass = ExcelData2.class)
    public void addEmployee(String firstname,String lastname,String empid,String email,String role,String password,String dob,String joinDate,String qualifications,String department,String gender,String mobileNo, String bloodGroup,String designation,String salary,String location,String reportingTo ) throws IOException, InterruptedException {
        LoginTest log=new LoginTest();
        log.login();
        clickOnEmployeesLink();
        clickOnAddEmployeeButton();
        enterFirstName(firstname);
        enterLastName(lastname);
        enterEmpID(empid);
        enterEmailID(email);
        selectRole(Integer.parseInt(role));
        enterPassword(password);
        enterdob(dob);
        enterJoiningDate(joinDate);
        selectQualification(Integer.parseInt(qualifications));
        enterDepartment(department);
        selectGender(Integer.parseInt(gender));
        enterMobileNumber(mobileNo);
        selectBloodGroup(Integer.parseInt(bloodGroup));
        enterDesignation(designation);
        enterSalary(salary);
        enterLocation(location);
        selectReporter1(Integer.parseInt(reportingTo));
        clickOnAddButton();
        Assert.assertEquals(employeeSavedSuccessfullyIsVisible(),true);
        Logout out=new Logout();
        out.logout();
    }
}
