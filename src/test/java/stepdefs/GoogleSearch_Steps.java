package stepdefs;

import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_Steps implements En
{
    private WebDriver webDriver;


    public GoogleSearch_Steps()
    {
        Given("^I am using Chrome as my browser$", () ->
        {
            webDriver = new ChromeDriver();
        });
        When("^I visit \"([^\"]*)\"$", (String arg0) ->
        {
            webDriver.get(arg0);
        });
        Then("^the title will contain \"([^\"]*)\"$", (String arg0) ->
        {
            String expected = webDriver.getTitle();
            Assert.assertEquals(arg0, webDriver.getTitle());
            webDriver.close();
        });
    }
}
