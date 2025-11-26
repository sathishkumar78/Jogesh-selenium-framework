package pageLocators;

import org.openqa.selenium.By;

public class Login_Page  {

    public static By companyLogo = By.xpath("//img[@alt='companylogo']");
    public static By welcomeMessage = By.xpath("//p[@class='welcomeMessage']");
    public static By emailTextfield = By.xpath("//input[@type='email']");
    public static By passwordTextfield = By.xpath("//input[@type='password']");
    public static By eyeIcon = By.xpath("//i[@class='fa-solid fa-eye-slash  eyeicon']");
    public static By loginButton = By.xpath("//button[text()='Login']");
    public static By forgotPassword = By.xpath("//button[@class='forgot-pswd']");
}
