import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Cucumber.class)
public class MainTest
{

    @BeforeClass
    public static void setUp()
    {
        System.out.println("Setting up WebDriver paths...");
        System.setProperty("webdriver.chrome.driver", ".\\WebDrivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", ".\\WebDrivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", ".\\WebDrivers\\edgedriver.exe");
    }

    @Test
    public void main()
    {

    }
}