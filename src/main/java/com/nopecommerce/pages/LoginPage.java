package com.nopecommerce.pages;

import com.nopecommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
            WebElement guestCheckout;


    /**
     * get Welcome Text
     * @return
     */
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    /**
     * click On Guest Checkout
     */
    public void clickOnGuestCheckout(){
        clickOnElement(guestCheckout);
    }
}
