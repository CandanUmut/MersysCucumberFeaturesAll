package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature",
                    "src/test/java/FeatureFiles/_03_CitizenshipWithScenarioOutline.feature"},
        glue = {"StepDefinitions"},
        dryRun = false


)

public class _02_RunnerForMultipleFeatures extends AbstractTestNGCucumberTests {
}
