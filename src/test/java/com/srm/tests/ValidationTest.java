package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.*;

public class ValidationTest extends BaseTest {

    @Test
    public void emptyNameValidation() {

        HomePage home = new HomePage(driver);
        home.selectCities("Boston", "London");
        home.clickFindFlights();

        FlightListPage flight = new FlightListPage(driver);
        flight.selectFlight();

        PurchasePage purchase = new PurchasePage(driver);

        purchase.fillDetails("", "123");
        purchase.clickPurchase();

        ConfirmationPage confirm = new ConfirmationPage(driver);

        Assert.assertTrue(
                confirm.getConfirmationMessage().contains("Failed"),
                "Forced failure for screenshot"
        );
    }


    @Test
    public void invalidCardValidation() {

        HomePage home = new HomePage(driver);
        home.selectCities("Boston", "London");
        home.clickFindFlights();

        FlightListPage flight = new FlightListPage(driver);
        flight.selectFlight();

        PurchasePage purchase = new PurchasePage(driver);

        purchase.fillDetails("Sravya", "abc123");
        purchase.clickPurchase();

        ConfirmationPage confirm = new ConfirmationPage(driver);

        Assert.assertTrue(
                confirm.getConfirmationMessage().contains("Error"),
                "Forced failure"
        );
    }


    @Test
    public void allFieldsEmptyValidation() {

        HomePage home = new HomePage(driver);
        home.selectCities("Boston", "London");
        home.clickFindFlights();

        FlightListPage flight = new FlightListPage(driver);
        flight.selectFlight();

        PurchasePage purchase = new PurchasePage(driver);

        purchase.clickPurchase();

        ConfirmationPage confirm = new ConfirmationPage(driver);

        Assert.assertTrue(
                confirm.getConfirmationMessage().contains("Invalid"),
                "Forced failure"
        );
    }
}