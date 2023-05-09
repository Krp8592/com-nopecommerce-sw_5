package com.nopecommerce.pages;

import com.nopecommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computerTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
            WebElement electronicsTabOnTopMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
            WebElement cellPhone;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
            WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
            WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
            WebElement welcomeStoreText;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
            WebElement successfulText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    WebElement registerTab;


    /**
     * click On Computer Tab
     */
    public void clickOnComputerTab(){
        clickOnElement(computerTabOnTopMenu);
    }

    /**
     * get Thank You Text
     * @return
     * @throws InterruptedException
     */
    public String getThankYouText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(thankYouText);
    }

    /**
     * get Successful Text
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(successfulText);
    }

    /**
     * click On Continue
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    /**
     * get Welcome Store Text
     * @return
     * @throws InterruptedException
     */
    public String getWelcomeStoreText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(welcomeStoreText);
    }

    /**
     * mouse Hover To Electronic Tab
     */
    public void mouseHoverToElectronicTab(){
        mouseHoverToElement(electronicsTabOnTopMenu);
    }

    /**+
     * mouseHover ToCell Phones AndC lick
     */
    public void mouseHoverToCellPhonesAndClick(){
        mouseHoverToElementAndClick(cellPhone);
    }

    /**
     * click On Register Tab
     */
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }
}
