 
package runners;
 
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.CucumberOptions;
 
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources",
        
        glue= {"stepDefinitions"},
        plugin = {"pretty", 
              "html:target/cucumber-reports.html",
              "json:target/cucumber-reports.json",
<<<<<<< HEAD
              "junit:target/cucumber-reports.xml"},
                   dryRun=false
                   //tags="@api"
 //plugin = {"json:target/cucumber.json"},
//          tags="@ui"
//      "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
=======
              "junit:target/cucumber-reports.xml"}

>>>>>>> ad94a8ed08b5c53c6ae1dee09ee3f55d0be24ea3
        )
public class RunnerTest {
}
 