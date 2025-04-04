 
package runners;
 
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.CucumberOptions;
 
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "src/test/resources",
        //features ="src/test/resources/Muthu_28MAR2025_ParaBankBillPayment.feature",
       //features = "src/test/resources/Hover.feature",  //To run a specific feature file
       //features = "src/test/resources/Dropdown.feature",
		features= "src/test/resources/Rajasekar_03APR2025_PracticePage.feature",
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
 