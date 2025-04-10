 
package runners;
 
 
import org.junit.runner.RunWith;
 
import io.cucumber.junit.CucumberOptions;
 
import io.cucumber.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD
        features = "src\test\resources",
        //features = "src\\test\\resources\\"
=======
 features = "src/test/resources",
        
>>>>>>> d617846ce821cc78ade8b026a8682e1c3d1123bd
        glue= {"stepDefinitions"},
        plugin = {"pretty", 
              "html:target/cucumber-reports.html",
              "json:target/cucumber-reports.json",
              "junit:target/cucumber-reports.xml"}
<<<<<<< HEAD
                   //,dryRun=true
                   )
=======

        )
>>>>>>> d617846ce821cc78ade8b026a8682e1c3d1123bd
public class RunnerTest {
}
 