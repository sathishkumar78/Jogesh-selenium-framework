package pageMethods;

import test.BaseClass;

import static pageLocators.Logout_Page.*;
import static utilities.CustomizedMethods.clickOnElement;

public class LogoutPage_Methods extends BaseClass {

    public static void clickOnYesButton()
    {
       clickOnElement(yesButton);
    }
}
