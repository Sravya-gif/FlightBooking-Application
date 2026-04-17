package com.srm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import com.srm.base.BasePage;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "fromPort")
    WebElement fromDropdown;

    @FindBy(name = "toPort")
    WebElement toDropdown;

    @FindBy(css = "input[type='submit']")
    WebElement findFlightsBtn;

    public void selectCities(String from, String to) {

        fromDropdown.sendKeys(from);
        toDropdown.sendKeys(to);
    }

    public void clickFindFlights() {

        waitForElement(findFlightsBtn);  
        findFlightsBtn.click();
    }
}