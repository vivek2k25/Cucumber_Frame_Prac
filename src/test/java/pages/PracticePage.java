/*
package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class PracticePage {

    WebDriver driver;

    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By genderMale = By.xpath("//input[@value='Male']");
    private By experience = By.xpath("//input[@value='3']");
    private By seleniumTool = By.xpath("//input[@value='Selenium Webdriver']");
    private By continentDropdown = By.name("continents");
    private By submitBtn = By.xpath("//button[text()='Submit']");
    private By headerMessage = By.tagName("h1");

    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void selectGender() {
        driver.findElement(genderMale).click();
    }

    public void selectExperience() {
        driver.findElement(experience).click();
    }

    public void selectAutomationTool() {
        driver.findElement(seleniumTool).click();
    }

    public void selectContinent(String continent) {
        Select select = new Select(driver.findElement(continentDropdown));
        select.selectByVisibleText(continent);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }

    public boolean isFormSubmitted() {
        return driver.findElement(headerMessage).isDisplayed();
    }
}*/


package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PracticePage {

    WebDriver driver;

    private By firstName = By.name("name");
    private By emailid = By.name("email");
    private By submitBtn = By.xpath("//input[@type='submit']");

    public PracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String fname)
    {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enteremail(String email) {
        driver.findElement(emailid).sendKeys(email);
    }

    public void clickSubmit() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //driver.findElement(submitBtn).click();
       


        System.out.println("Clicked on the submit button");
    }
}
