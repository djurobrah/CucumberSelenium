import cucumber.api.junit.Cucumber;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MainTest
{
    @BeforeClass
    public static void setUp()
    {
        //////////////////////////////////////////////// setting System WebDriver paths
        System.setProperty("webdriver.chrome.driver", ".\\WebDrivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", ".\\WebDrivers\\geckodriver.exe");
        System.setProperty("webdriver.edge.driver", ".\\WebDrivers\\edgedriver.exe");
        //////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////// setting browser for our tests
        if(System.getProperty("browser") == null) // if we're not running a local build
        {
            String serverProperty = System.getenv("browser"); // get the browser value passed by Teamcity
            System.setProperty("browser", serverProperty); // set our System property
        }
        //////////////////////////////////////////////////////////////////////////////
    }

    @Test
    public void main()
    {

    }
}