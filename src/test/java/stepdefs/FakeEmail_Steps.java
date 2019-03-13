package stepdefs;

import cucumber.api.java8.En;
import gherkin.ast.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.FakeEmailHome_Page;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;

public class FakeEmail_Steps implements En
{
    private WebDriver webDriver;
    private FakeEmailHome_Page page;

    public FakeEmail_Steps()
    {
        And("^opened the Fake Email Home Page$", () ->
        {
            webDriver = Steps.getWebDriver();
            page = new FakeEmailHome_Page(webDriver);
        });
        Then("^the email is valid$", () ->
        {
            Assert.assertTrue(page.getEmail().matches(page.getEmailRegex()));
        });
        When("^I click the copy button$", () ->
        {
            page.click_btn_Copy();
        });
        Then("^the email is copied to the clipboard$", () ->
        {
            String clipboard = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
            Assert.assertEquals(page.getEmail(), clipboard);
        });

    }
}
