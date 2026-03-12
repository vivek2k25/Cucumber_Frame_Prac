package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith()
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepdefinition", "hooks"},
       // plugin = {"pretty"},
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}