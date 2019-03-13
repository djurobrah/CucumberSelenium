package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FakeEmailHome_Page extends Page
{
    public FakeEmailHome_Page(WebDriver webDriver)
    {
        super(webDriver);
    }

    /////////////////////////////////////////////////////// finding all WebElements
    @FindBy(how = How.ID, using = "email_ch_text")
    private WebElement span_fakeEmail;

    @FindBy(how = How.ID, using = "copbtn")
    private WebElement btn_Copy;
    //////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////// all functions related to this Page
    public String getEmail()
    {
        return span_fakeEmail.getText();
    }

    public String getEmailRegex()
    {
        return "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
    }

    public void click_btn_Copy()
    {
        btn_Copy.click();
    }
    //////////////////////////////////////////////////////////////////////////////
}
