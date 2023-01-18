package com.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Base {

    private WebDriver driver;

    /*
     * Constructor
     *
     */
    public Base(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Chrome Driver Connection
     * @return driver
     */
    public WebDriver chromeDriverConnection() {
        ChromeOptions chromeOpt = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOpt);
        return driver;
    }

    /**
     * Launch Browser
     */
    public void launchBrowser(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    /**
     * Implicit wait
     */
    public void implicitWait(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    /**
     * Explicit Wait
     *
     */
    public void verifyVisibilityOfElement(By element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void verifyTitleContains(String title) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));
    }

    /**
     * Type
     */
    public void type(String text, By element) {

        driver.findElement(element).sendKeys(text);
    }

    /**
     * click
     */
    public void click(By element) {
        try {
            driver.findElement(element).click();
        }
        catch(NoSuchElementException e) {
            e.getMessage();
        }
    }

    /**
     * Get Text
     */
    public String getText(By element) {
        return driver.findElement(element).getText();
    }

    /**
     * Close browser
     */
    public void closeBrowser() {
        driver.close();
    }
}
