package com.PageObjects;

import com.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Base {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    // Web Elements
    By txtSearchBox = By.id("searchbox");
    By btnFilterByName = By.id("searchsubmit");
    By tblActualFirstRow = By.xpath("//tbody/tr[1]/td[1]");


    /**
     * filterByComputerName
     */
    public void filterByComputerName(String computer) {
        verifyTitleContains("Computers");
        verifyVisibilityOfElement(txtSearchBox);
        type(computer, txtSearchBox);
        click(btnFilterByName);
    }

    /**
     * verifyComputerTable
     */
    public boolean verifyComputerTable(String expectedComputer) {
        String actualComputer = getText(tblActualFirstRow);
        if (expectedComputer.equals(actualComputer)) {
            return true;
        } else {
            return false;
        }
    }
}
