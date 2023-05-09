package com.nopecommerce.pages;

import com.nopecommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Electronics']")
    WebElement electronicsTabText;
    public String getElectronicsHeaderText(){
        return getTextFromElement(electronicsTabText);
    }

    /**
     * This method select menu on top menu
     * @param menu
     */
    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }
}
