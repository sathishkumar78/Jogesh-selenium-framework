package pageMethods;
import static pageLocators.ApplyLeave_Page.*;
import static utilities.CustomizedMethods.*;
public class ApplyLeavePage_Methods {

    public static void enterFromDate(String date)
    {
        sendText(fromDate,date);
    }

    public static void enterToDate(String date)
    {
        sendText(toDate,date);
    }

    public static void selectLead(String name)
    {
        selectByvisibleText(selectLead,name);
    }

    public static void enterSubject(String data)
    {
        sendText(subject,data);
    }

    public static void enterReasonforLeave(String reason)
    {
        sendText(reasonForLeave,reason);
    }

    public static void clickOnleaveButton()
    {
        clickOnElement(leaveRadioButton);
    }
    public static void clickOnSubmitButton()
    {
        clickOnElement(submitButton);
    }

}
