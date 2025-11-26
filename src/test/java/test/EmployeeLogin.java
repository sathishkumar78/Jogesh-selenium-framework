package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import static pageMethods.HomePage_Methods.*;
import static pageMethods.Loginpage_Methods.*;
import static utilities.TestData.propertyReader;

public class EmployeeLogin {
    @Test
    public void employeeLogin() throws IOException
    {
        enterEmail(propertyReader("emailId"));
        enterPassword(propertyReader("paassword"));
        clickOnLogin();
        Assert.assertEquals(profileIconisVisible(),true);
    }

}
