package pageMethods;

import pageLocators.Employees_Page;

import static utilities.CustomizedMethods.clickOnElement;
import static utilities.CustomizedMethods.elementIsVisible;


public class EmployeesPage_Methods extends Employees_Page {

    public static void clickOnAddEmployeeButton()
    {
        clickOnElement(addEmployeebutton);
    }

}
