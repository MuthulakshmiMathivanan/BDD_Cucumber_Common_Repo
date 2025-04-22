package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/ContactUs.feature", 
    glue = {"stepDefinitions"}, 
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports.json",  // This is what the report plugin looks for
        "junit:target/cucumber-reports.xml"
    },
    dryRun = false
)
public class Runner {
}
