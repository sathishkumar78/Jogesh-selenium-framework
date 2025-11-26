package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import static pageMethods.Loginpage_Methods.*;
import static pageMethods.HomePage_Methods.*;
import static pageMethods.LogoutPage_Methods.*;

public class Logout {

    @Test
    public void logout()
    {
        clickOnLogoutLink();
        clickOnYesButton();
        Assert.assertEquals(logoIsVisible(),true);
    }
}
