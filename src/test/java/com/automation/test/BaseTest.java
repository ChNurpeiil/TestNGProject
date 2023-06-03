package com.automation.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Where do you want to execute your test?");
        String platform = "Local";

        if(platform.equals("Local")){
            driver = getLocalDriver();
        }else {

            driver = getCloudDriver();
        }
        driver.get("https://www.google.com");


    }

    public WebDriver getCloudDriver() throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, String> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-nurpeiil.ashibaeva.ch-b0e40");
        sauceOptions.put("accessKey", "d1abaf59-1d98-409c-881d-ac49c0ff2b0c");
        sauceOptions.put("build", "selenium-build-F6EY8");
        sauceOptions.put("name", "Chrome Browser Parallel Execution");
        browserOptions.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-nurpeiil.ashibaeva.ch-b0e40:d1abaf59-1d98-409c-881d-ac49c0ff2b0c@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, browserOptions);
        return driver;
    }
    public WebDriver getLocalDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }


    @AfterClass
    public void cleanUp() {
        System.out.println("Close browser");
        driver.quit();

    }
}



