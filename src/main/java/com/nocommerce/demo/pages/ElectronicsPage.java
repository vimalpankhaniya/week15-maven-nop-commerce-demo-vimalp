package com.nocommerce.demo.pages;

import com.nocommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnElectronicsTab;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhonesAndClick;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellPhones;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnElectronics;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverOnCellPhones1;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyTextCellphones;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnListViewTab;

    @CacheLookup
    @FindBy(xpath = "//img[@alt ='Picture of Nokia Lumia 1020']")
    WebElement clickOnProductNameNokia;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement verifyTextNokiaLumia;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement verifyNokiaPrice;

    @CacheLookup
    @FindBy(xpath = "product_enteredQuantity_20")
    WebElement clearQuantity;

    @CacheLookup
    @FindBy(xpath = "product_enteredQuantity_20")
    WebElement changeQuantity;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement verifyGreenBarMessage;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOnGreenBar;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement mouseHoverOnShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyMessageShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement verifyQuantity;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    WebElement verifyTotal;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyTextWelcomePlease;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickOnRegister;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyTextRegister;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement sendTextToFirstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement sendTextToLastNameField;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement sendTextToDay;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement sendTextToMonth;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement sendTextToYear;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement sendTextToEmailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement sendTextToPasswordField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement sendTextToConfirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegister1;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyMessageYourRegistrationCompleted;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinue;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement verifyTextShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheckbox1;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout1;


    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement selectCountry;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement sendTextToCity;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement sendTextToAddress;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement sendTextToPostelCode;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement sendTextToPhoneNumber;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement clickOnContinue1;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement clickOn2ndDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Continue'])[3]")
    WebElement clickOnContinue2;
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement clickOnCreditCard;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']//button[1]")
    WebElement clickOnContinue5;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Payments.Manual']")
    WebElement clickOnSelectCreditCard;
    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Visa')]")
    WebElement clickOnVisa;
    @CacheLookup
    @FindBy(name = "CardholderName")
    WebElement sendTextToCardholderName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement sendTextToCardNumber;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement sendTextToExpirationMonth;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement sendTextToExpirationYear;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement sendTextToCardCode;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement clickOnContinue3;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement verifyPaymentMethod;

    @CacheLookup
    @FindBy(xpath = "//span[text()[normalize-space()='2nd Day Air']]")
    WebElement verifyShoppingMethod;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='$698.00'])[2]")
    WebElement verifyTotalPrice;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement clickOnConfirm;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement verifyTextThankYou;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement verifySuccessfully;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement clickOnContinue4;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement verifyWelcomeToOurStore;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickOnLogout;


    public void mouseHoverOnElectronics(String userName) {
        Reporter.log("mouseHoverOnElectronics"+ mouseHoverOnElectronicsTab.toString());
        mouseHoverToElement(mouseHoverOnElectronicsTab);
    }
    public void mouseHoverOnCellPhonesAndClick() {
        Reporter.log("mouseHoverOnCellPhonesAndClick"+ mouseHoverOnCellPhonesAndClick.toString());
        mouseHoverToElementAndClick(mouseHoverOnCellPhonesAndClick);
    }

    public String verifyTextCellPhones() {
        Reporter.log("verifyTextCellPhones"+ verifyTextCellPhones.toString());

        return getTextFromElement(verifyTextCellPhones);
    }

    public void mouseHoverOnElectronics() {
        Reporter.log("mouseHoverOnElectronics"+ mouseHoverOnElectronics.toString());
        mouseHoverToElement(mouseHoverOnElectronics);
    }

    public void mouseHoverOnCellPhones1() {
        Reporter.log("mouseHoverOnCellPhones1"+ mouseHoverOnCellPhones1.toString());
        mouseHoverToElementAndClick(mouseHoverOnCellPhones1);
    }

    public String verifyTextCellphones() {
        Reporter.log("verifyTextCellphones"+ verifyTextCellphones.toString());
        return getTextFromElement(verifyTextCellphones);
    }

    public void clickOnListViewTab() {
        clickOnElement(clickOnListViewTab);
    }

    public void clickOnProductNameNokia() {
        clickOnElement(clickOnProductNameNokia);
    }

    public String verifyTextNokiaLumia() {

        return getTextFromElement(verifyTextNokiaLumia);
    }

    public String verifyNokiaPrice() {
        return getTextFromElement(verifyNokiaPrice);
    }

    public void clearQuantityToBlank() {
        clickOnElement(clearQuantity);
    }

    public void clearQuantity() {
        driver.findElement(By.id("product_enteredQuantity_20")).clear();
    }

    public void changeQuantityTo2(String text) {
        sendTextToElement(changeQuantity, text);
    }

    public void clickOnAddToCart() {
        clickOnElement(updateCart);
    }

    public String verifyGreenBarMessage() {
        return getTextFromElement(verifyGreenBarMessage);
    }

    public void clickOnGreenBar() {
        clickOnElement(clickOnGreenBar);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
    }

    public void hoverAndClickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }

    public String verifyMessageShoppingCart() {
        return getTextFromElement(verifyMessageShoppingCart);
    }

    public String verifyQuantity() {
        return getTextFromElement(verifyQuantity);
    }

    public String verifyTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnCheckbox() {
        clickOnElement(clickOnCheckbox);
    }

    public void clickOnCheckout() {
        clickOnElement(clickOnCheckout);
    }

    public String verifyTextWelcomePlease() {
        return getTextFromElement(verifyTextWelcomePlease);
    }

    public void clickOnRegister() {
        clickOnElement(clickOnRegister);
    }

    public String verifyTextRegister() {
        return getTextFromElement(verifyTextRegister);
    }

    public void sendTextToFirstNameField(String firstname) {
        sendTextToElement(sendTextToFirstNameField, firstname);
    }

    public void sendTextToLastNameField(String lastname) {
        sendTextToElement(sendTextToLastNameField, lastname);
    }

    public void sendTextToDay(String day) {
        sendTextToElement(sendTextToDay, day);
    }

    public void sendTextToMonth(String month) {
        sendTextToElement(sendTextToMonth, month);
    }

    public void sendTextToYear(String year) {
        sendTextToElement(sendTextToYear, year);
    }

    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmailField, email);
    }

    public void sendTextToPasswordField(String password) {
        sendTextToElement(sendTextToPasswordField, password);
    }

    public void sendTextToConfirmPasswordField(String confirmPassword) {
        sendTextToElement(sendTextToConfirmPasswordField, confirmPassword);
    }

    public void clickOnRegister1() {
        clickOnElement(clickOnRegister1);
    }

    public String verifyMessageYourRegistrationCompleted() {
        return getTextFromElement(verifyMessageYourRegistrationCompleted);
    }

    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
    }

    public String verifyTextShoppingCart() {
        return getTextFromElement(verifyTextShoppingCart);
    }

    public void clickOnCheckbox1() {
        clickOnElement(clickOnCheckbox1);
    }

    public void clickOnCheckout1() {
        clickOnElement(clickOnCheckout1);
    }

    public void countryByVisibleText(String name) {
        selectByVisibleTextFromDropDown(selectCountry, name);
    }

    public void sendTextToCity(String city) {
        sendTextToElement(sendTextToCity, city);
    }

    public void sendTextToAddress(String address) {
        sendTextToElement(sendTextToAddress, address);
    }

    public void sendTextToPostelCode(String postalCode) {
        sendTextToElement(sendTextToPostelCode, postalCode);
    }

    public void sendTextToPhoneNumber(String phoneNumber) {
        sendTextToElement(sendTextToPhoneNumber, phoneNumber);
    }

    public void clickOnContinue1() {
        clickOnElement(clickOnContinue1);
    }

    public void clickOn2ndDayAir() {
        clickOnElement(clickOn2ndDayAir);
    }

    public void clickOnContinue2() {
        clickOnElement(clickOnContinue2);
    }

    public void clickOnCreditCard() {
        clickOnElement(clickOnCreditCard);
    }

    public void clickOnContinueTab() {
        clickOnElement(clickOnContinue5);
    }

    public void clickOnSelectCreditCard() {
        clickOnElement(clickOnSelectCreditCard);
    }

    public void clickOnVisa() {
        clickOnElement(clickOnVisa);
    }

    public void sendTextToCardholderName(String cardHolderName) {
        sendTextToElement(sendTextToCardholderName, cardHolderName);
    }

    public void sendTextToCardNumber(String cardNumber) {
        sendTextToElement(sendTextToCardNumber, cardNumber);
    }

    public void sendTextToExpirationMonth(String expirationMonth) {
        selectByValueFromDropDown(sendTextToExpirationMonth, expirationMonth);
    }

    public void sendTextToExpirationYear(String expirationYear) {
        selectByValueFromDropDown(sendTextToExpirationYear, expirationYear);
    }

    public void sendTextToCardCode(String cardCode) {
        sendTextToElement(sendTextToCardCode, cardCode);
    }

    public void clickOnContinue3() {
        clickOnElement(clickOnContinue3);
    }

    public String verifyPaymentMethod() {
        return getTextFromElement(verifyPaymentMethod);
    }

    public String verifyShoppingMethod() {
        return getTextFromElement(verifyShoppingMethod);
    }

    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotalPrice);
    }

    public void clickOnConfirm() {
        clickOnElement(clickOnConfirm);
    }

    public String verifyTextThankYou() {
        return getTextFromElement(verifyTextThankYou);
    }

    public String verifySuccessfully() {
        return getTextFromElement(verifySuccessfully);
    }

    public void clickOnContinue4() {
        clickOnElement(clickOnContinue4);
    }

    public String verifyWelcomeToOurStore() {
        return getTextFromElement(verifyWelcomeToOurStore);
    }

    public void clickOnLogout() {
        clickOnElement(clickOnLogout);
    }

    public String verifyCurrentUrl() {
        return driver.getCurrentUrl();
    }

}


