package com.srm.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.srm.base.BasePage;

public class PurchasePage extends BasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {

        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "inputName")
    WebElement nameField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "city")
    WebElement cityField;

    @FindBy(id = "state")
    WebElement stateField;

    @FindBy(id = "zipCode")
    WebElement zipField;

    @FindBy(id = "creditCardNumber")
    WebElement cardField;

    @FindBy(id = "creditCardMonth")
    WebElement monthField;

    @FindBy(id = "creditCardYear")
    WebElement yearField;

    @FindBy(id = "nameOnCard")
    WebElement nameOnCardField;

    @FindBy(css = "input[type='submit']")
    WebElement purchaseBtn;

  
    public void fillCompleteForm() {

        nameField.sendKeys("Sravya");
        addressField.sendKeys("Guntur");
        cityField.sendKeys("Guntur");
        stateField.sendKeys("Andhra Pradesh");
        zipField.sendKeys("500001");

        cardField.clear();
        cardField.sendKeys("123456789012");

        monthField.clear();
        monthField.sendKeys("12");

        yearField.clear();
        yearField.sendKeys("2027");

        nameOnCardField.sendKeys("Sravya");

        purchaseBtn.click();
    }


    public void fillDetails(String name, String card) {

        nameField.clear();
        nameField.sendKeys(name);

        cardField.clear();
        cardField.sendKeys(card);
    }

    public void clickPurchase() {

        purchaseBtn.click();
    }
}