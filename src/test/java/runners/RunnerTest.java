 
package runners;
 
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.CucumberOptions;
 
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/Rajasekar_15APR2025_SauceCheckout.feature",
        
        glue= {"stepDefinitions"},
        plugin = {"pretty", 
              "html:target/cucumber-reports.html",
              "json:target/cucumber-reports.json",
              "junit:target/cucumber-reports.xml"},
                   dryRun=false     
        )
public class RunnerTest {
}
 