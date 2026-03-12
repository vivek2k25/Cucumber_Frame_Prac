package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver() {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver webDriver = new ChromeDriver(options);


       // webDriver.manage().window().maximize();

        driver.set(webDriver);

        // code start here

      /*  WebDriver webDriver = new ChromeDriver();

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(opt);

        webDriver.manage().window().maximize();

        driver.set(webDriver);*/


        // code end here

    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        // driver.get().quit();
      //  driver.remove();
    }
}