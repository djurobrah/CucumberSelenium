package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class DemoDefinitions implements En
{
    public DemoDefinitions()
    {
        Given("^I have a configured Cucumber project$", () ->
        {
            System.out.println("bla");
            throw new cucumber.api.PendingException();
        });
        When("^I run it within my IDE$", () ->
        {
            throw new cucumber.api.PendingException();
        });
        Then("^I will be able to run connected step definitions$", () ->
        {
            throw new cucumber.api.PendingException();
        });
    }
}
