package stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.PracticePage;
import utils.DriverFactory;
import utils.ExtentTestManager;

import java.time.Duration;

public class PracticeSteps {

    WebDriver driver;
    PracticePage page;

    @Given("User is on practice page")
    public void user_is_on_practice_page() {

        driver = DriverFactory.getDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        page = new PracticePage(driver);
        ExtentTestManager.getTest().info("Navigated to practice page");
    }

    @When("User enters first name and last name")
    public void user_enters_names() {

        page.enterFirstName("Vivek");
        page.enteremail("Kumar@mailinator.com");
        ExtentTestManager.getTest().info("Entered first and last name");


    }

    @When("User clicks submit")
    public void user_clicks_submit() {

        page.clickSubmit();
        System.out.println("Print line added here..... ---------by Vivek");
      //  System.out.println();
        ExtentTestManager.getTest().info("Clicked Submit button");
    }

    @Then("Form should be submitted")
    public void form_should_be_submitted() {

        System.out.println("Form submitted successfully");
    }
}