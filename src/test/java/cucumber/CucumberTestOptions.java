package cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"cucumber/stepdefs"},
        tags = {},
        features = {"src/test/java/cucumber/features"})
public class CucumberTestOptions {

}
