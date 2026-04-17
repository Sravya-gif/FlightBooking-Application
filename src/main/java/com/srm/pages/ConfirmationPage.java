package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.srm.base.BasePage;

public class ConfirmationPage extends BasePage {

    WebDriver driver;

    public ConfirmationPage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    WebElement confirmationMsg;

    public String getConfirmationMessage() {

        return confirmationMsg.getText();
    }
}