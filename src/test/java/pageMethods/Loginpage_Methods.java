package pageMethods;

import pageLocators.Login_Page;

import static test.BaseClass.*;
import static utilities.CustomizedMethods.*;

public class Loginpage_Methods extends Login_Page {


    public static void enterEmail(String emaill) {
        sendText(emailTextfield,emaill);
    }

    public static void enterPassword(String pass) {
        sendText(passwordTextfield,pass);
    }

    public static void clickOnLogin() {
       clickOnElement(loginButton);
    }

    public static boolean logoIsVisible()
    {
        return elementIsVisible(companyLogo);
    }
}