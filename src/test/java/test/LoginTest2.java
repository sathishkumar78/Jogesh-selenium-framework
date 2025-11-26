package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageMethods.Loginpage_Methods;
import utilities.ExcelData;
import static pageMethods.HomePage_Methods.*;
import java.io.IOException;


public class LoginTest2 extends BaseClass{

    @Test(dataProvider = "loginData" , dataProviderClass = ExcelData.class)
    public void login1(String email, String password) throws IOException {
        Loginpage_Methods.enterEmail(email);
        Loginpage_Methods.enterPassword(password);
        Loginpage_Methods.clickOnLogin();
        Assert.assertEquals(profileIconisVisible(),true);
    }
}
