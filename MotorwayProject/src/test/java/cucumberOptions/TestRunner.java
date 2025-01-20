package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features" ,
        glue = {"hooks", "stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        // monochrome = true,
        tags = "@test",
        dryRun = false)





public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public  Object[][] scenarios(){
        return  super.scenarios();
    }
}
