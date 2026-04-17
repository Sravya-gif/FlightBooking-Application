package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.HomePage;
import com.srm.pages.FlightListPage;
import com.srm.pages.PurchasePage;

public class FlightSelectionTest extends BaseTest {

    @Test
    public void selectFlightTest() {

        HomePage home = new HomePage(driver);
        home.selectCities("Paris", "London");
        home.clickFindFlights();

        FlightListPage flightList = new FlightListPage(driver);
        flightList.selectFlight();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("purchase"),
                " Not navigated to Purchase Page");

        PurchasePage purchase = new PurchasePage(driver);

        String pageSource = driver.getPageSource();

        Assert.assertTrue(pageSource.contains("Your flight from"),
                " Flight details not displayed");

        System.out.println("Flight Selection Test Passed");
    }
}