import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Cucumber.class)
public class MainTest
{
    @Test
    public void main()
    {
        Assert.assertEquals(0, 0);
    }
}