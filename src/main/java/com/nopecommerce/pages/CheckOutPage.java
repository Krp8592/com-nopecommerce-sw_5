package com.nopecommerce.pages;

import com.nopecommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
            WebElement address1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
            WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
            WebElement phoneNumber;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
            WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
            WebElement shippingContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
            WebElement paymentContinueButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
            WebElement paymentInfoContinueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
            WebElement nextDayAir;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
            WebElement creditCard;
    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
            WebElement creditCardType;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
            WebElement cardHolderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
            WebElement cardNumber;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
            WebElement selectMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
            WebElement selectYear;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
            WebElement cardCode;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
            WebElement paymentTypeMessage;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
            WebElement shippingMethodText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
         WebElement totalPriceText;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    /**
     * enter Firstname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstName, value);
    }

    /**
     * enter Lastname
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastName, value);
    }

    /**
     * enter Email
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterEmail(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(email, value);
    }

    /**
     * select Country
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectCountry(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(country, value);
    }

    /**
     * enter City
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCity(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(city, value);
    }

    /**
     * enter Address1
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterAddress1(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(address1, value);
    }

    /**
     * enter ZipCode
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterZipCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(zipCode, value);
    }

    /**
     * enter Phone Number
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterPhoneNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(phoneNumber, value);
    }

    /**
     * click On Continue
     *
     * @throws InterruptedException
     */
    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
    }

    /**
     * select Next DayAir
     *
     * @throws InterruptedException
     */
    public void selectNextDayAir() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(nextDayAir);
    }

    /**
     * click On Shipping Continue
     *
     * @throws InterruptedException
     */
    public void clickOnShippingContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(shippingContinueButton);
    }

    /**
     * click On CreditCard
     *
     * @throws InterruptedException
     */
    public void clickOnCreditCard() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(creditCard);
    }

    /**
     * click On Payment Continue
     *
     * @throws InterruptedException
     */
    public void clickOnPaymentContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(paymentContinueButton);
    }

    /**
     * select CreditCard Type
     *
     * @param value
     * @throws InterruptedException
     */
    public void selectCreditCardType(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(creditCardType, value);
    }

    /**
     * enter Card Holder Name
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardHolderName(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardHolderName, value);
    }

    /**
     * enter CardNumber
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardNumber(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardNumber, value);
    }

    /**
     * select Expiration Date
     *
     * @param month
     * @param year
     * @throws InterruptedException
     */
    public void selectExpirationDate(String month, String year) throws InterruptedException {
        Thread.sleep(1000);
        selectByVisibleTextFromDropDown(selectMonth, month);
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    /**
     * enter CardCode
     *
     * @param value
     * @throws InterruptedException
     */
    public void enterCardCode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(cardCode, value);
    }

    /**
     * get Payment Type Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getPaymentTypeText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(paymentTypeMessage);
    }

    /**
     * get Shipping Method Text
     *
     * @return
     * @throws InterruptedException
     */
    public String getShippingMethodText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(shippingMethodText);
    }

    /**
     * get Total PriceText
     *
     * @return
     * @throws InterruptedException
     */
    public String getTotalPriceText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(totalPriceText);
    }

    /**
     * click On Confirm
     *
     * @throws InterruptedException
     */
    public void clickOnConfirm() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(confirmButton);
    }

    /**
     * click On Payment Info Continue
     *
     * @throws InterruptedException
     */
    public void clickOnPaymentInfoContinue() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(paymentInfoContinueButton);
    }
}
