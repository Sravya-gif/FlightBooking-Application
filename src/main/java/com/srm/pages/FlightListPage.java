package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.srm.base.BasePage;

import java.util.List;

public class FlightListPage extends BasePage {

    WebDriver driver;

    public FlightListPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//table//tr")
    List<WebElement> flightRows;

    @FindBy(css = "input[type='submit']")
    WebElement chooseFlightBtn;

    public int getFlightCount() {

        wait.until(ExpectedConditions.visibilityOfAllElements(flightRows)); // ✅ FIX

        return flightRows.size();
    }

    public void selectFlight() {

        wait.until(ExpectedConditions.elementToBeClickable(chooseFlightBtn)); // ✅ FIX
        chooseFlightBtn.click();
    }
}