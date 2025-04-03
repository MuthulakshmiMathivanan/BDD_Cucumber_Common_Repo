 
package runners;
 
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.CucumberOptions;
 
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "src/test/resources",

        features ="src/test/resources/Arumugam_3APR2025_CompDBReg.feature",
        //features ="src/test/resources/Arumugam_3APR2025_CompDBSearch.feature",
       //features = "src/test/resources/Hover.feature",  //To run a specific feature file
       //features = "src/test/resources/Dropdown.feature",
        glue= {"stepDefinitions"},
        plugin = {"pretty", 
              "html:target/cucumber-reports.html",
              "json:target/cucumber-reports.json",
              "junit:target/cucumber-reports.xml"}
                   //dryRun=true
 //plugin = {"json:target/cucumber.json"},
//          tags="@ui"
//      "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
        )
public class RunnerTest {
}
 