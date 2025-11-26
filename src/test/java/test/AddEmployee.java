package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

import static utilities.RandomData.*;
import static utilities.TestData.*;
public class AddEmployee {


    @Test
    public void addEmploye() throws IOException {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.get("https://dev.urbuddi.com/login");
        WebElement emailTextfield = driver.findElement(By.id("userEmail"));
        WebElement passwordTextfield = driver.findElement(By.id("userPassword"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        emailTextfield.sendKeys("jogesh.doddi@optimworks.com");
        passwordTextfield.sendKeys("Jogesh77@$");
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement employess = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/allemployees']")));
        employess.click();
        WebElement addEmployee = driver.findElement(By.xpath("//button[text()='Add Employee']"));
        addEmployee.click();
        WebElement firstname= driver.findElement(By.name("firstName"));
        WebElement lastname= driver.findElement(By.name("lastName"));
        WebElement employeeID= driver.findElement(By.id("employeeID"));
        WebElement email= driver.findElement(By.name("email"));
        WebElement password= driver.findElement(By.name("password"));
        WebElement dob= driver.findElement(By.name("dob"));
        WebElement role= driver.findElement(By.id("role"));
        WebElement joiningDate= driver.findElement(By.name("joiningDate"));
        WebElement qualifications= driver.findElement(By.id("qualifications"));
        WebElement department= driver.findElement(By.name("department"));
        WebElement gender= driver.findElement(By.id("gender"));
        WebElement mobileNo= driver.findElement(By.name("mobileNumber"));
        WebElement bloodGroup= driver.findElement(By.id("bloodGroup"));
        WebElement designation= driver.findElement(By.name("designation"));
        WebElement salary = driver.findElement(By.id("salary"));
        WebElement location= driver.findElement(By.name("location"));
        WebElement reportingTo= driver.findElement(By.id("reportingTo"));
        Select d1=new Select(qualifications);
        Select d2=new Select(role);
        Select d3=new Select(bloodGroup);
        Select d4=new Select(gender);
        Select d5=new Select(reportingTo);
        firstname.sendKeys(propertyReader("firstname"));
        lastname.sendKeys(propertyReader("lastname"));
        employeeID.sendKeys(randomEmpId());
        email.sendKeys(randomEmailId());
        password.sendKeys(propertyReader("paassword"));
        dob.sendKeys(propertyReader("doB"));
        joiningDate.sendKeys(propertyReader("joinDate"));
        location.sendKeys(propertyReader("loc"));
        salary.sendKeys(propertyReader("sal"));
        mobileNo.sendKeys(propertyReader("mobile"));
        designation.sendKeys(propertyReader("designationn"));
        department.sendKeys(propertyReader("depart"));
        d1.selectByIndex(Integer.parseInt(propertyReader("qualify")));
        d2.selectByIndex(Integer.parseInt(propertyReader("index")));
        d4.selectByIndex(Integer.parseInt(propertyReader("gen")));
        d3.selectByIndex(Integer.parseInt(propertyReader("group")));
        d5.selectByIndex(Integer.parseInt(propertyReader("name")));
        WebElement addButton= driver.findElement(By.xpath("//button[text()='Add']"));
        addButton.click();
        driver.close();
    }
}
