package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory
{
    // function that creates a browser corresponding to the one set in Teamcity/locally
    public static WebDriver createWebDriver()
    {
        WebDriver webDriver;
        String browser = System.getProperty("browser");
        switch(browser)
        {
            case "chrome":
                webDriver = new ChromeDriver();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                return webDriver;
            case "firefox":
                webDriver = new FirefoxDriver();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                return webDriver;
            case "edge":
                webDriver = new EdgeDriver();
                webDriver.manage().window().maximize();
                webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                return webDriver;
            default:
                throw new RuntimeException("Unsupported webdriver: " + browser);
        }

    }
}
