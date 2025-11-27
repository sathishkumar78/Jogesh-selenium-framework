package test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageMethods.Loginpage_Methods;
import java.io.IOException;
import static pageMethods.HomePage_Methods.*;
import static utilities.TestData.propertyReader;

@Listeners(utilities.ScreenShot.class)
public class LoginTest extends BaseClass{

    @Test(groups = "login")
    public void login() throws IOException {
        Loginpage_Methods.enterEmail(propertyReader("email"));
        Loginpage_Methods.enterPassword(propertyReader("password"));
        Loginpage_Methods.clickOnLogin();
        Assert.assertEquals(profileIconisVisible(),true);
    }
}