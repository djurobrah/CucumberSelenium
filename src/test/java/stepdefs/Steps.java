package stepdefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import pages.FakeEmailHome_Page;
import pages.Page;
import utils.WebDriverFactory;

public class Steps implements En
{
    private static WebDriver webDriver;

    public static WebDriver getWebDriver()
    {
        return webDriver;
    }

    public Steps()
    {
        Given("^have opened \"([^\"]*)\"$", (String url) ->
        {
            webDriver.get(url);
        });
    }

    ////////////// cucumber before hook, ran before the first step in each scenario
    @Before
    public void before(Scenario scenario)
    {
        System.out.println("\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Starting test - " + scenario.getName() + " (" + System.getProperty("browser") + ")");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        webDriver = WebDriverFactory.createWebDriver();
    }
    //////////////////////////////////////////////////////////////////////////////

    //////////////// cucumber after hook, ran after the last step in each scenario
    @After
    public void after(Scenario scenario)
    {
        System.out.println("\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Test finished - " + scenario.getName() + " (" + System.getProperty("browser") + ")" + " - Status: " + scenario.getStatus());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        webDriver.quit();
    }
    //////////////////////////////////////////////////////////////////////////////
}
