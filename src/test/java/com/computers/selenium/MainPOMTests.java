package com.computers.selenium;

import com.PageObjects.MainPage;
import com.base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainPOMTests {

    // Variables
    WebDriver driver;
    Base base;
    MainPage mainPage;
    String expectedComputer = "ACE";


    @BeforeTest
    public void beforeTest() {
        base = new Base(driver);
        driver = base.chromeDriverConnection();
        mainPage = new MainPage(driver);
    }

    @Test
    public void testCase01(){
        // Step 1
        base.launchBrowser("https://computer-database.gatling.io/computers");

        // Step 2
        mainPage.filterByComputerName(expectedComputer);

        // Step 3
        Assert.assertTrue(mainPage.verifyComputerTable(expectedComputer));
    }

    @AfterTest
    public void afterTest() {
        base.closeBrowser();
    }
}
