package Runners;

import Utilities.DriverClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles/_01_Login.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)



public class _08_RunnerForParalelTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(String browserName){
        DriverClass.setThreadDriverName(browserName);

    }
}