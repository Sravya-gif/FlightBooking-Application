package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.srm.base.BaseTest;
import com.srm.pages.*;

public class FlightSearchTest extends BaseTest {

    @DataProvider
    public Object[][] getData() {

        return new Object[][] {
                {"Boston", "London"},
                {"Paris", "Berlin"},
                {"Mexico City", "Rome"}
        };
    }

    @Test(dataProvider = "getData")
    public void searchFlightTest(String from, String to) {

        HomePage home = new HomePage(driver);

        home.selectCities(from, to);
        home.clickFindFlights();

        FlightListPage flight = new FlightListPage(driver);

        Assert.assertTrue(flight.getFlightCount() > 0);
        
        System.out.println("Flight Search Test Passed");
    }
}