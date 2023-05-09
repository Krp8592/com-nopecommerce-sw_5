package com.nopecommerce.pages;

import com.aventstack.extentreports.Status;
import com.nopecommerce.customlisteners.CustomListeners;
import com.nopecommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement priceText;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'itemquantity')]")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsAndCondition;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shopingCart;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;
    @CacheLookup
    @FindBy(xpath = "//input[contains(@id,'itemquantity')]")
    WebElement quantityValue;

    /**
     * get Shopping CartText
     *
     * @return
     * @throws InterruptedException
     */
    public String getShoppingCartText() throws InterruptedException {
        Reporter.log("get Shopping CartText " + shoppingCartText.toString());
        CustomListeners.test.log(Status.PASS,"get Shopping CartText " + shoppingCartText);
        Thread.sleep(1000);
        return getTextFromElement(shoppingCartText);
    }

    /**
     * get PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getPriceText() throws InterruptedException {
        Reporter.log("get PriceText " + priceText.toString());
        CustomListeners.test.log(Status.PASS,"get PriceText " + priceText);
        Thread.sleep(1000);
        return getTextFromElement(priceText);
    }

    /**
     * change Value Of Quantity
     *
     * @param value
     * @throws InterruptedException
     */
    public void changeValueOfQuantity(String value) throws InterruptedException {
        Reporter.log("change Value Of Quantity " + quantity.toString());
        CustomListeners.test.log(Status.PASS,"change Value Of Quantity " + quantity);
        Thread.sleep(1000);
        sendTextToElement(quantity, value);
    }

    /**
     * update Shopping Cart
     *
     * @throws InterruptedException
     */
    public void updateShoppingCart() throws InterruptedException {
        Reporter.log("update Shopping Cart " + updateShoppingCart.toString());
        CustomListeners.test.log(Status.PASS," update Shopping Cart " + updateShoppingCart);
        Thread.sleep(1000);
        clickOnElement(updateShoppingCart);
    }

    /**
     * select Terms And Condition
     *
     * @throws InterruptedException
     */
    public void selectTermsAndCondition() throws InterruptedException {
        Reporter.log("select Terms And Condition " + termsAndCondition.toString());
        CustomListeners.test.log(Status.PASS,"select Terms And Condition " + termsAndCondition);
        Thread.sleep(1000);
        clickOnElement(termsAndCondition);
    }

    /**
     * click On CheckOut
     *
     * @throws InterruptedException
     */
    public void clickOnCheckOut() throws InterruptedException {
        Reporter.log("click On CheckOut " + checkOut.toString());
        CustomListeners.test.log(Status.PASS,"click On CheckOut " + checkOut);
        Thread.sleep(1000);
        clickOnElement(checkOut);
    }

    /**
     * mouse Hover To Shopping Card
     *
     * @throws InterruptedException
     */
    public void mouseHoverToShoppingCard() throws InterruptedException {
        Reporter.log("mouse Hover To Shopping Card " + shopingCart.toString());
        CustomListeners.test.log(Status.PASS,"mouse Hover To Shopping Card " + shopingCart);
        Thread.sleep(1000);
        mouseHoverToElement(shopingCart);
    }

    /**
     * mouse Hover To GoTo Card And Click
     *
     * @throws InterruptedException
     */
    public void mouseHoverToGoToCardAndClick() throws InterruptedException {
        Reporter.log("mouse Hover To GoTo Card And Click " + goToCart.toString());
        CustomListeners.test.log(Status.PASS,"mouse Hover To GoTo Card And Click " + goToCart);
        Thread.sleep(1000);
        mouseHoverToElementAndClick(goToCart);
    }

    /**
     * get Number Of Quantity Value
     *
     * @return
     * @throws InterruptedException
     */
    public String getNumberOfQuantityValue() throws InterruptedException {
        Reporter.log("get Number Of Quantity Value " + goToCart.toString());
        CustomListeners.test.log(Status.PASS,"get Number Of Quantity Value " + goToCart);
        Thread.sleep(1000);
        return getAttributeValueFromElement(quantityValue);
    }

}
