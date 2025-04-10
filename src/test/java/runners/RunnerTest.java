 
package runners;
 
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.CucumberOptions;
 
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src\\test\\resources\\Princy_09APR2025_LUMA_Login.feature",
        
        glue= {"stepDefinitions"},
        plugin = {"pretty", 
              "html:target/cucumber-reports.html",
              "json:target/cucumber-reports.json",
<<<<<<< HEAD
              "junit:target/cucumber-reports.xml"}
                   
=======
              "junit:target/cucumber-reports.xml"},
                   dryRun=true,
 		tags = "@princy"
 //plugin = {"json:target/cucumber.json"},
//          tags="@ui"
//      "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"
>>>>>>> c51147e61fbc852e01bcc401fdaadb8e21a019bc
        )
public class RunnerTest {
}
 