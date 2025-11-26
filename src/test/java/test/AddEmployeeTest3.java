package test;
import org.testng.*;
import org.testng.annotations.*;
import utilities.ExcelData1;
import java.io.IOException;
import static pageMethods.AddEmployeePage_Methods.*;
import static pageMethods.EmployeesPage_Methods.clickOnAddEmployeeButton;
import static pageMethods.AddEmployeePage_Methods.employeeSavedSuccessfullyIsVisible;
import static pageMethods.HomePage_Methods.*;

@Listeners(utilities.ScreenShot.class)
public class AddEmployeeTest3 extends LoginTest {
    @Test(dataProvider = "addEmployeeData",dataProviderClass = ExcelData1.class, dependsOnMethods = "login")
    public void addEmployee(String firstname,String lastname,String empid,String email,String role,String password,String dob,String joinDate,String qualifications,String department,String gender,String mobileNo, String bloodGroup,String designation,String salary,String location,String reportingTo ) throws IOException, InterruptedException {
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
        //selectReporter();
        clickOnAddButton();
        Assert.assertEquals(employeeSavedSuccessfullyIsVisible(),true);
    }
}
