package com.computers.selenium;

import selenium.PageObjects.MainPage;
import selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import selenium.base.GlobalVariables;

public class MainPOMTests {

    // Variables
    WebDriver driver;
    Base base;
    MainPage mainPage;
    String expectedComputer;


    @BeforeTest
    public void beforeTest() {
        base = new Base(driver);
        driver = base.chromeDriverConnection();
        mainPage = new MainPage(driver);
        expectedComputer = base.getJSONValue("testCase01", "computer");
    }

    @Test
    public void testCase01(){
        // Step 1
        base.launchBrowser(GlobalVariables.QA_URL);

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
