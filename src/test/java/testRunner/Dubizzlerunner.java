package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = ".//Features/Dubizzle.feature",
        dryRun = false,
        glue = "stepDefination/Dubizzlesteps",
        plugin = {
                "pretty","html:test-output"}


)
public class Dubizzlerunner {
}
