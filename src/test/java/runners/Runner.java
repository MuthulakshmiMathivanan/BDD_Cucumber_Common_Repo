package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/ContactUs.feature", // Path to the feature files
    glue = {"stepDefinitions"}, // Package for step definitions
    plugin = {
        "pretty", // Console output in a readable format
        "html:target/cucumber-reports.html", // Generates HTML report
        "json:target/cucumber-reports.json", // Generates JSON report
        "junit:target/cucumber-reports.xml" // Generates JUnit-compatible XML report
    },
    dryRun = false // Set to false to execute tests; true to check step definitions
)
public class Runner {
}
