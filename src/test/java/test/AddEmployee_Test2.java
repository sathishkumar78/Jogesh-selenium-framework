package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import static pageMethods.AddEmployeePage_Methods.*;
import static pageMethods.EmployeesPage_Methods.*;
import static pageMethods.HomePage_Methods.*;
import static utilities.TestData.propertyReader;

public class AddEmployee_Test2 {

    @Test
    public void addEmployee() throws IOException{
        clickOnEmployeesLink();
        clickOnAddEmployeeButton();
        enterFirstName(propertyReader("firstname"));
        enterLastName(propertyReader("lastname"));
        enterEmpID(propertyReader("empId"));
        enterEmailID(propertyReader("emailId"));
        selectRole(Integer.parseInt(propertyReader("index")));
        enterPassword(propertyReader("paassword"));
        enterdob(propertyReader("doB"));
        enterJoiningDate(propertyReader("joinDate"));
        selectQualification(Integer.parseInt(propertyReader("qualify")));
        enterDepartment(propertyReader("depart"));
        selectGender(Integer.parseInt(propertyReader("gen")));
        enterMobileNumber(propertyReader("mobile"));
        selectBloodGroup(Integer.parseInt(propertyReader("group")));
        enterDesignation(propertyReader("designationn"));
        enterSalary(propertyReader("sal"));
        enterLocation(propertyReader("loc"));
        selectReporter(propertyReader("name"));
        clickOnAddButton();
        Assert.assertEquals(employeeSavedSuccessfullyIsVisible(),true);
    }
}
