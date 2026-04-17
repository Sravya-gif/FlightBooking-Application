package com.srm.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import com.srm.driver.DriverFactory;
import com.srm.utils.ConfigReader;

public class BaseTest {

    public WebDriver driver;
    ConfigReader config;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initDriver();
        config = new ConfigReader();
        driver.get(config.getUrl());
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}