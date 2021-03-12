package myRunner;

/*
 * import org.junit.runner.RunWith; import cucumber.api.CucumberOptions; import
 * cucumber.api.junit.Cucumber;
 * 
 * 
 * @RunWith(Cucumber.class)
 * 
 * @CucumberOptions( features =
 * "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\MyProject\\src\\main\\java\\features\\login.feature",
 * //the path of the feature files glue={
 * "C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\MyProject\\src\\main\\java\\stepDefination\\LoginStepDefination.java"}
 * //the path of the step definition files //format=
 * {"pretty","html:test-outout"}
 * 
 * )
 * 
 * public class TestRunner {
 * 
 * }
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/java/features/CreateDeal.feature",
 glue={"stepDefination"},
 plugin = {"pretty", "html:test-output"},
 dryRun = false,
 monochrome = true
 
 )
 
public class TestRunner {
 
}
