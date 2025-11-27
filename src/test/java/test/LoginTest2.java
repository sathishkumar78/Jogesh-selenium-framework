package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageMethods.Loginpage_Methods;
import utilities.ExcelData1;
import utilities.ExcelData2;

import static pageMethods.HomePage_Methods.*;
import java.io.IOException;

@Listeners(utilities.ScreenShot.class)
public class LoginTest2 extends BaseClass{

    @Test(dataProvider = "loginData" , dataProviderClass = ExcelData1.class,groups = "login")
    public void login1(String email, String password) throws IOException {
        Loginpage_Methods.enterEmail(email);
        Loginpage_Methods.enterPassword(password);
        Loginpage_Methods.clickOnLogin();
        Assert.assertEquals(profileIconisVisible(),true);
        Logout out=new Logout();
        out.logout();
    }
}
