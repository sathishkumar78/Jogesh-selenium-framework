package pageLocators;


import org.openqa.selenium.By;

public class AddHoliday_Page {

    public By ocasionTextfield = By.name("event");

    public By ocasionDate = By.name("date");

    public By cancelButton = By.xpath("//button[text()='Cancel']");

    public By submitButton = By.xpath("//button[text()='Submit']");
}
