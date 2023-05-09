package com.nopecommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopecommerce.customlisteners.CustomListeners;
import com.nopecommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement selectProcessor;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement microsoftOfficeSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement totalCommanderSoftwareOption;
    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
            WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
            WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
            WebElement closeNotificationBar;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;

    public String getBuildYourOwnComputerText() throws InterruptedException {
        Reporter.log("Getting text from element " + buildYourOwnComputerText.toString());
        CustomListeners.test.log(Status.PASS, "Getting text from element " + buildYourOwnComputerText.toString());
        Thread.sleep(1000);
        return getTextFromElement(buildYourOwnComputerText);
    }

    /**
     * select Processor
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectProcessor(String name) throws InterruptedException {
        Reporter.log("Select processor" + selectProcessor.toString());
        CustomListeners.test.log(Status.PASS, "Select processor " + selectProcessor.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectProcessor, name);
    }

    /**
     * select Ram
     *
     * @param name
     * @throws InterruptedException
     */
    public void selectRam(String name) throws InterruptedException {
        Reporter.log("Select Ram" + selectRam.toString());
        CustomListeners.test.log(Status.PASS, "Select processor " + selectRam.toString());
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectRam, name);
    }

    /**
     * select HDD
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectHDD(String value) throws InterruptedException {
        Reporter.log("Select HDD");
        CustomListeners.test.log(Status.PASS, "Select HDD ");
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[normalize-space()='" + value + "']"));
    }

    /**
     * select Os
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectOs(String value) throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(By.xpath("//label[contains(normalize-space(),'" + value + "')]"));
    }

    /**
     * select Microsoft Office SoftwareOption
     *
     * @throws InterruptedException
     */
    public void selectMicrosoftOfficeSoftwareOption() {
        Reporter.log("Selecting microsoft software" + microsoftOfficeSoftwareOption.toString());
        CustomListeners.test.log(Status.PASS, "Selecting microsoft software " + microsoftOfficeSoftwareOption.toString());
        selectCheckBox((WebElement) microsoftOfficeSoftwareOption);
    }

    /**
     * select Total Commander Software Option
     *
     * @throws InterruptedException
     */
    public void selectTotalCommanderSoftwareOption() throws InterruptedException {
        Reporter.log("Select total commander" + totalCommanderSoftwareOption.toString());
        CustomListeners.test.log(Status.PASS, "Selecting total commander " + totalCommanderSoftwareOption.toString());
        Thread.sleep(1000);
        selectCheckBox((WebElement) totalCommanderSoftwareOption);
    }

    /**
     * get Total Price Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Reporter.log("Getting text from element" + totalPrice.toString());
        CustomListeners.test.log(Status.PASS, "Getting text from element " + totalPrice.toString());
        Thread.sleep(1000);
        return getTextFromElement(totalPrice);
    }

    /**
     * click On Add to Cart
     *
     * @throws InterruptedException
     */
    public void clickOnAddtoCart() throws InterruptedException {
        Reporter.log("Adding item to cart" + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Adding item to cart " + addToCart.toString());
        Thread.sleep(1000);
        clickOnElement(addToCart);
    }

    /**
     * get Successfully Added To CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getSuccessfullAddedToCartText() throws InterruptedException {
        Reporter.log("Getting success message from element" + successfullyText.toString());
        CustomListeners.test.log(Status.PASS, "Getting success message from element " + successfullyText.toString());
        Thread.sleep(1000);
        return getTextFromElement(successfullyText);
    }

    /**
     * close Notification Bar
     *
     * @throws InterruptedException
     */
    public void closeNotificationBar() throws InterruptedException {
        Reporter.log("Closing notification bar " + closeNotificationBar.toString());
        CustomListeners.test.log(Status.PASS, "Closing notification bar " + closeNotificationBar.toString());
        Thread.sleep(1000);
        clickOnElement(closeNotificationBar);
    }

    /**
     * mouse Hover To ShoppingCart And ClickOnCart
     *
     * @throws InterruptedException
     */
    public void mouseHoverToShoppingCartAndClickOnCart() throws InterruptedException {
        Reporter.log("Clicking go to cart element " + goToCart.toString());
        CustomListeners.test.log(Status.PASS, "Clicking go to cart element " + goToCart.toString());
        Thread.sleep(1000);
        mouseHoverToElement(shopingCart);
        mouseHoverToElementAndClick(goToCart);
    }

}
