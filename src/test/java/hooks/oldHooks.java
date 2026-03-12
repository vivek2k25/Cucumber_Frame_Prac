package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.DriverFactory;

public class oldHooks {

    @Before
    public void setup(Scenario scenario) {

        System.out.println("Starting Scenario: " + scenario.getName());

        DriverFactory.initDriver();
    }

    @After
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}