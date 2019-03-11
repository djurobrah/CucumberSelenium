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
        When("^I visit google.com$", () ->
        {
            webDriver.get("https://google.com");
        });
        Then("^the title will google$", () ->
        {
            Assert.assertEquals("google", webDriver.getTitle().toLowerCase());
        });
    }
}
