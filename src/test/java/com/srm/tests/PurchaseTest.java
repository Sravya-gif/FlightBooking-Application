package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.ConfirmationPage;
import com.srm.pages.FlightListPage;
import com.srm.pages.HomePage;
import com.srm.pages.PurchasePage;

public class PurchaseTest extends BaseTest {

    
    @Test
    public void purchaseTest() {

        HomePage home = new HomePage(driver);
        home.selectCities("Paris", "London");
        home.clickFindFlights();

        FlightListPage flight = new FlightListPage(driver);
        flight.selectFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.fillCompleteForm();

        ConfirmationPage confirm = new ConfirmationPage(driver);

        Assert.assertTrue(
                confirm.getConfirmationMessage().contains("Thank you"),
                " Purchase confirmation failed"
        );

        System.out.println("Purchase Test Passed");
    }
}