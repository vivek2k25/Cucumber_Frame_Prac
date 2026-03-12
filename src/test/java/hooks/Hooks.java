package hooks;

import com.aventstack.extentreports.*;
import io.cucumber.java.*;
import utils.*;

public class Hooks {

    ExtentReports extent = ExtentManager.getInstance();

    @Before
    public void setup(Scenario scenario) {

        DriverFactory.initDriver();

        ExtentTest test = extent.createTest(scenario.getName());

        ExtentTestManager.setTest(test);
    }

   /* @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            ExtentTestManager.getTest().fail("Scenario Failed");
        } else {
            ExtentTestManager.getTest().pass("Scenario Passed");
        }

        extent.flush();
        DriverFactory.quitDriver();
    }*/

    // another working @after
    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

          //  Throwable error = scenario.getError();

            ExtentTestManager.getTest()
                    .fail("Scenario Failed");
                   // .fail(error);

        } else {
            ExtentTestManager.getTest().pass("Scenario Passed");
        }

        extent.flush();
        DriverFactory.quitDriver();
    }
    }