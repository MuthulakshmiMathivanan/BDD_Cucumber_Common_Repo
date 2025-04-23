 
package runners;
 
 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/Arumugam_10APRIL2025_Web_CompDBReg.feature",
        
        glue= {"stepDefinitions"},
        plugin = {"pretty", 
              "html:target/cucumber-reports.html",
              "json:target/cucumber-reports.json",
              "junit:target/cucumber-reports.xml"},

                   dryRun=false
                   

                   

 )
public class RunnerTest {
	
}
 