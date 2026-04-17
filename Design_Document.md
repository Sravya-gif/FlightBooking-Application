## Flight Booking Automation Framework 

## Introduction
This project is an automation testing framework built using Selenium and Java for a demo flight booking web application.
The framework automates key functionalities like flight search, flight selection, passenger details submission, booking confirmation, and form validation.

## Tools & Technologies
* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* Extent Reports and screenshots

## Key Features
* Page Object Model (POM)
* Screenshot capture on failure
* Extent report generation
* FluentWait for dynamic elements
* TestNG for test execution



## Project Structure
```
FlightBooking
│
├── src/main/java
│   ├── com.srm.base
│   │   ├── BasePage.java
│   │   └── BaseTest.java
│   │
│   ├── com.srm.driver
│   │   └── DriverFactory.java
│   │
│   ├── com.srm.listeners
│   │   └── TestListener.java
│   │
│   ├── com.srm.pages
│   │   ├── ConfirmationPage.java
│   │   ├── FlightListPage.java
│   │   ├── HomePage.java
│   │   └── PurchasePage.java
│   │
│   └── com.srm.utils
│       ├── ConfigReader.java
│       ├── ExtentManager.java
│       └── ScreenshotUtil.java
│
├── src/test/java
│   └── com.srm.tests
│       ├── DifferentRouteTest.java
│       ├── FlightSearchTest.java
│       ├── FlightSelectionTest.java
│       ├── PurchaseTest.java
│       └── ValidationTest.java
│
├── src/test/resources
│   └── config.properties
│
├── screenshots/            
├── reports/                
│   └── ExtentReport.html
│
├── testng.xml              
├── pom.xml                
```
