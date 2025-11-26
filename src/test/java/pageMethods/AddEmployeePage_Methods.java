package pageMethods;
import pageLocators.AddEmployee_Page;
import static test.BaseClass.*;
import static utilities.CustomizedMethods.*;

public class AddEmployeePage_Methods extends AddEmployee_Page {


    public static void enterFirstName(String firstname) {
        sendText(firstName,firstname);
    }

    public static void enterLastName(String lastname) {
        sendText(lastName,lastname);
    }

    public static void enterEmpID(String empId) {
        sendText(empID,empId);
    }

    public static void enterEmailID(String emailId) {
        sendText(emailID,emailId);
    }

    public static void selectRole(int index) {
        selectElementByIndex(role,index);
    }

    public static void enterPassword(String paassword) {
        sendText(password,paassword);
    }

    public static void enterdob(String doB) {
        sendText(dob,doB);
    }

    public static void enterJoiningDate(String joinDate) {
        sendText(joiningDate,joinDate);
    }

    public static void selectQualification(int qualify) {
        selectElementByIndex(qualification,qualify);
    }

    public static void enterDepartment(String depart) {
        sendText(department,depart);
    }

    public static void selectGender(int gen) {
        selectElementByIndex(gender,gen);
    }

    public static void enterMobileNumber(String mobile) {
        sendText(mobileNumber,mobile);
    }

    public static void selectBloodGroup(int group) {
        selectElementByIndex(bloodGroup,group);
    }

    public static void enterDesignation(String designationn) {
        sendText(designation,designationn);
    }

    public static void enterSalary(String sal) {
        sendText(salary,sal);
    }

    public static void enterLocation(String loc) {
       sendText(location,loc);
    }

    public static void selectReporter(String name) {
        selectByvisibleText(reportiingTo,name);
    }

    public static void clickonCertificates() {
        driver.findElement(certificates).click();
    }

    public static void selectCertificate()
    {
        driver.findElement(certificate).click();
    }

    public static void clickOnAddButton() {
        clickOnElement(addButton);

    }


    public static boolean existedEmployee()
    {
        return elementIsVisible(existedEmployee);
    }

    public static boolean employeeSavedSuccessfullyIsVisible()
    {
        return elementIsVisible(employeeSaved);
    }
}
