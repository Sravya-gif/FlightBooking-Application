package com.srm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.srm.base.BaseTest;
import com.srm.pages.HomePage;
import com.srm.utils.ConfigReader;
import com.srm.pages.FlightListPage;

public class DifferentRouteTest extends BaseTest {

	@Test
	public void differentRouteSearchTest() {

	    HomePage home = new HomePage(driver);

	    home.selectCities("Boston", "London");
	    home.clickFindFlights();

	    FlightListPage flight1 = new FlightListPage(driver);
	    int count1 = flight1.getFlightCount();

	    Assert.assertTrue(count1 > 0, " No flights for Route 1");

	    driver.get(new ConfigReader().getUrl());

	    home = new HomePage(driver);
	    home.selectCities("Paris", "Berlin");
	    home.clickFindFlights();

	    FlightListPage flight2 = new FlightListPage(driver);
	    int count2 = flight2.getFlightCount();

	    Assert.assertTrue(count2 > 0, " No flights for Route 2");

	    driver.get(new ConfigReader().getUrl());

	  
	    home = new HomePage(driver);
	    home.selectCities("Mexico City", "Rome");
	    home.clickFindFlights();

	    FlightListPage flight3 = new FlightListPage(driver);
	    int count3 = flight3.getFlightCount();

	    Assert.assertTrue(count3 > 0, " No flights for Route 3");

	    System.out.println("Different Route Test Passed");
	}
}