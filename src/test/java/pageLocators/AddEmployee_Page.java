package pageLocators;

import org.openqa.selenium.By;
public class AddEmployee_Page {


    public static By firstName = By.name("firstName");

    public static By lastName = By.name("lastName");

    public static By empID = By.id("employeeID");

    public static By emailID = By.name("email");

    public static By password = By.name("password");

    public static By dob = By.name("dob");

    public static By role = By.id("role");

    public static By joiningDate = By.name("joiningDate");

    public static By qualification = By.id("qualifications");

    public static By department = By.name("department");

    public static By gender = By.id("gender");

    public static By mobileNumber = By.name("mobileNumber");

    public static By bloodGroup = By.id("bloodGroup");

    public static By designation = By.name("designation");

    public static By salary = By.id("salary");

    public static By location = By.name("location");

    public static By reportiingTo = By.id("reportingTo");

    public static By certificates = By.xpath("//button[@class='dropdown-btn']");

    public static By certificate = By.xpath("//label[text()='Original Degree']");

    public static By addButton = By.xpath("//button[text()='Add']");

    public static By existedEmployee = By.xpath("//p[text()='Employee with ID or Email already exists.']");

    public static By employeeSaved = By.xpath("//div[text()='Saved Successfully']");

}
